package com.currencyconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CurrencyController {

    @GetMapping("/")
    public String index() {
        return "index"; // Return the name of the HTML template
    }

    @GetMapping("/convert")
    public String convertCurrency(@RequestParam("amount") double amount,
                                  @RequestParam("fromCurrency") String fromCurrency,
                                  @RequestParam("toCurrency") String toCurrency,
                                  Model model) {
        // For simplicity, we will do a mock conversion (e.g., 1 USD = 0.85 EUR)
        double conversionRate = 0.85; // Mock conversion rate
        double convertedAmount = amount * conversionRate;

        model.addAttribute("amount", amount);
        model.addAttribute("fromCurrency", fromCurrency);
        model.addAttribute("toCurrency", toCurrency);
        model.addAttribute("convertedAmount", convertedAmount);

        return "result"; // Return the result page after conversion
    }
}
