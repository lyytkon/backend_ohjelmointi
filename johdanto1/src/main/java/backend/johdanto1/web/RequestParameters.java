package backend.johdanto1.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParameters {

    @GetMapping("/moi")
    public String hello(
            @RequestParam String location,
            @RequestParam String name
    ) {
        return "Welcome to the " + location + " " + name + "!";
    }
}