package br.edu.ifpb.progdist.apirest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class HelloSpringController {

    @GetMapping("/hello")
    public String getHello() {
        return "Olá";
    }
}
