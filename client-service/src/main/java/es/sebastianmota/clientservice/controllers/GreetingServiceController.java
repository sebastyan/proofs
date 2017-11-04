package es.sebastianmota.clientservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingServiceController {

    private static Logger log = LoggerFactory.getLogger(GreetingServiceController.class);
    private static final String template = "Hello, %s!";

    @RequestMapping("/greeting/{name}")
    public String greeting2(@PathVariable("name") String name) {
        log.info(String.format("El servicio va a dar la bienvenida a %s", name));
        return String.format(template, name) ;
    }
}
