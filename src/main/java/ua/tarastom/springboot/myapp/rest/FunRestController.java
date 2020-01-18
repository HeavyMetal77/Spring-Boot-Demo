package ua.tarastom.springboot.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/hello")
    public String sayHelloNew() {
        return "Hello World new! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "Fortune ";
    }
}
