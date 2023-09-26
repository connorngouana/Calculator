package ie.atu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController
{
        @GetMapping("/calculate")
        public String calculate(@RequestParam long num1 , @RequestParam long num2 ,@RequestParam (name = "operation") String operation)
        {
            long total = num1 * num2;
            return "operation: " + operation + " total: " + total;

        }




}
