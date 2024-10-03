package org.example.firstwebapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/azure")
    public String message(){

        return "Congrats you first deployemt to Azure";
    }

}
