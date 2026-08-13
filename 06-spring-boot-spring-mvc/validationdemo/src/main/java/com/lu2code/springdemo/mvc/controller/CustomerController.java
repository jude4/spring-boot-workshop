package com.lu2code.springdemo.mvc.controller;

import com.lu2code.springdemo.mvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showForm(Model theModel, Customer theCustomer) {

        theModel.addAttribute("customer", theCustomer);

        return "customer-form";
    }

    @PostMapping("/processForm")
    public String processForm(@ModelAttribute("customer") Customer theCustomer) {

        return null;
    }
}
