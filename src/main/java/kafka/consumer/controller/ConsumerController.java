package kafka.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @GetMapping(value = "/online")
    public String online() {
        return "Online";
    }
}
