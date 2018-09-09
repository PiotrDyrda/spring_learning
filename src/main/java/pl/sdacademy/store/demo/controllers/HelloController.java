package pl.sdacademy.store.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sdacademy.store.demo.components.HelloCounter;


@Controller
public class HelloController {

    @Autowired
    HelloCounter helloCounter;

    @GetMapping("/hello")
    public String showHello(String firstName , ModelMap modelMap){
        modelMap.addAttribute("firstName", firstName);
        modelMap.addAttribute("helloCounter", helloCounter.getCounter());
        return "hello";
    }

    @GetMapping("/hello/zero")
    public String setZero(){
        helloCounter.setHelloCountToZero();
        return "redirect:/hello";
    }

}