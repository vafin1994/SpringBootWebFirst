package com.vafin.SpringBootWebFirst;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Spring";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController.home()");
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
        int result = num1 + num2;

        mv.addObject("num1", num1);
        mv.addObject("num2", num2);
        mv.addObject("result", result);

        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addStudent")
    public String add(Student student) {
        return "result";
    }

}
