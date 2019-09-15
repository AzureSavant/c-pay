package com.skynet.cpay.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class mainPage {
    @RequestMapping(value="/request",method = RequestMethod.GET)
    public String getForm(){
        return "request";
    }
    @RequestMapping(value = "/request",method = RequestMethod.POST)
    public String postForm(HttpServletRequest request,Model model){
        String price=request.getParameter("price");
        String currency= request.getParameter("currency");
        model.addAttribute("price",price);
        model.addAttribute("currency",currency);
        return "cpay";
    }


}
