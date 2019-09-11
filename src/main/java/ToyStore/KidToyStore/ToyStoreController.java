package ToyStore.KidToyStore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ToyStoreController {
	ToyFactory toyFactory = new ToyFactory();
	TruckSingleton truck = TruckSingleton.getInstance();
	static String num;

ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	
	@RequestMapping(value= "/toy", method=RequestMethod.GET)
	public ArrayList<Toy> getAll() {
		return toyList;
	}
	
	
	@RequestMapping(value= "/toy/create-{id}-{name}-{price}-{type}", method=RequestMethod.POST)
	public ResponseEntity<Toy> create(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("price") float price, @PathVariable("type") String type) {
		toyList.add(toyFactory.getType(type, id, type, price));
		int count = truck.getCount();
		truck.setCount(count+1);
		num = Integer.toString(truck.getCount());
		fileWriter();
		return new ResponseEntity<Toy>(toyFactory.getType(type, id, type, price), HttpStatus.OK);
	}
	
	@RequestMapping(value= "/toy/{id}", method=RequestMethod.GET)
	public ResponseEntity<Toy> get(@PathVariable("id") int id){
		Toy t = toyList.get(id-1);
		return new ResponseEntity<Toy>(t, HttpStatus.OK);
		
	}
	@RequestMapping(value= "/toy/delete-{id}", method=RequestMethod.POST)
	public ArrayList<Toy> delete(@PathVariable("id") int id){
		toyList.remove(id-1);
		return toyList;
	}
	@RequestMapping(value= "/toy/update-{id}-{name}-{price}-{type}", method=RequestMethod.POST)
	public ResponseEntity<Toy> update(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("price") float price, @PathVariable("type") String brand){
		Toy t = toyList.get(id-1);
//		t.setName(name);
//		t.setPrice(price);
		
		return new ResponseEntity<Toy>(t, HttpStatus.OK);
		
	}
	public static void fileWriter() {
		try {
			FileWriter w = new FileWriter("output.txt");
			w.write(num);
			w.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void fileReader() {
		try {
			FileReader r = new FileReader("output.txt");
			int data;
			while((data = r.read()) != -1) {
				System.out.printf("%c\n", data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(ToyStoreController.class, args);
		fileReader();
	}
}
