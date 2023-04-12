package com.engeto.wedding.controller;

import com.engeto.wedding.model.SayHello;
import com.engeto.wedding.model.User;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/say")
public class SayHelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello-with-name")
    public String helloWithName(
            @RequestParam(value = "name", required = true) String nameUser
    ) {
        return "Hello " + nameUser;
    }

    @GetMapping("/hello-in-path/{name}")
    public String helloWithNameInPath(
            @PathVariable String name
    ) {
        return "Hello " + name;
    }

    @GetMapping("hello-with-date")
    public SayHello helloWithDate(
            @RequestParam(value = "myname") String name
    ) {
        SayHello sayHello = new SayHello("Hello " + name, LocalDateTime.now());
        return sayHello;
    }

}
