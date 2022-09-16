package jon.deleteagain;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

@RestController
public class GreetingController {

    private GreetingRepository greetingRepository;

    public GreetingController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/")
    public ResponseEntity<Greeting> getGreeting(){
        Greeting greeting = new Greeting("hej fra IntelliJ");
        greetingRepository.save(greeting);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
