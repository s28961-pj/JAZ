package pl.pjatk.rollie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rollie.model.Car;

@RequestMapping("/test")
@RestController
public class HelloWorld {


    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World! :)");
    }

    @GetMapping(value = "/hello/{text}")
    public ResponseEntity<String> getText(@PathVariable String text) {
        return ResponseEntity.ok(text);
    }

    @GetMapping(value = "/param")
    public ResponseEntity<String> getValue(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        Car car = new Car("Tesla");
        return ResponseEntity.ok(car);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> insertCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

}
