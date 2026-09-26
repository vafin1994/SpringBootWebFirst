package com.vafin.SpringBootWebFirst;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("HomeController.home()");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession session) {
        System.out.println("HomeController.add()");
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;
        System.out.println(result);
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("result", result);


        return "result.jsp";
    }

}
