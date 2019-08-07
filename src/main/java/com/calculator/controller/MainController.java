package com.calculator.controller;

import com.calculator.model.FormInput;
import com.calculator.model.Payment;
import com.calculator.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/")
    public String mainPage(Model model){
        FormInput formInput = new FormInput();
        model.addAttribute("formInputAttribute", formInput);
        return "main";
    }

    @PostMapping("/form")
    public String form(Model model, @ModelAttribute("formInputAttribute") FormInput formInput){
        List<Payment> payments = paymentService.getListPayment(formInput);
        model.addAttribute("payments", payments);
        return "table";
    }
}
