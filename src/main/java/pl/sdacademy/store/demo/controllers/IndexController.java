package pl.sdacademy.store.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.store.demo.components.IndexCounter;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    IndexCounter indexCounter;

    @RequestMapping("/index")
    public String showIndex(ModelMap modelMap) {
        modelMap.addAttribute("indexCounter", indexCounter.getCounter());

        return "index";
    }


}
