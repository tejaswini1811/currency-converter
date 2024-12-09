package com.currencyconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterController {

    // Conversion rate for example: USD to EUR
    private static final double USD_TO_EUR_RATE = 0.85;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("amount") double amount, Model model) {
        double convertedAmount = amount * USD_TO_EUR_RATE;
        model.addAttribute("amount", amount);
        model.addAttribute("convertedAmount", convertedAmount);
        return "index";
    }
}
