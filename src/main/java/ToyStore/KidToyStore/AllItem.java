package ToyStore.KidToyStore;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class AllItem {
@RequestMapping("/Toy")
    public String toString(){
        return 1 + ": C-17 Globemaster"+"\n"+2 +": BigTuSubmarine"+"\n" + 3 +": Best Racing Toy Car";
    }
}