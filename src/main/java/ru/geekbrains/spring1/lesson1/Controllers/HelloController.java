package ru.geekbrains.spring1.lesson1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.geekbrains.spring1.lesson1.Model.Box;
import ru.geekbrains.spring1.lesson1.services.BoxService;

import java.util.List;

@Controller
public class HelloController {
    private BoxService boxService;

    @Autowired
    public void setBoxService(BoxService boxService) {
        this.boxService = boxService;
    }


    @GetMapping("/box_page")
    public String showBoxPage(Model model){
        List<Box> list = boxService.getAllBoxes();
        model.addAttribute("boxes", list);
        return "hello";
    }
}
