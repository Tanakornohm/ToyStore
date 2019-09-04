package ToyStore.KidToyStore;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ToyStoreController {
	Car c = new Car("Best Racing Toy Car", 20000, "Mc Laren");
    plane p = new plane("C-17 Globemaster", 30000, "AMC");
    Submarine s = new Submarine("BigSubmarine", 40000, "Submarine");
@RequestMapping("/Toy/car")
    public String Apple(){
        return "ชื่อ : "+c.getName()+"\n"+"แบรนด์ : "+c.getBrand()+"\n"+"ราคา : "+c.getPrice();
    }
@RequestMapping("/Toy/plane")
public String plane(){
	return "ชื่อ : "+p.getName()+"\n"+"แบรนด์ : "+p.getBrand()+"\n"+"ราคา : "+p.getPrice();
}
@RequestMapping("/Toy/submarine")
public String Submarine(){
	return "ชื่อ : "+s.getName()+"\n"+"แบรนด์ : "+s.getBrand()+"\n"+"ราคา : "+s.getPrice();
}
}
