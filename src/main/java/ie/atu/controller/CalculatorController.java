package ie.atu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController
{
    /*
        @GetMapping("/calculate")
        public String calculate(@RequestParam long num1 , @RequestParam long num2 ,@RequestParam (name = "operation") String operation)
        {
        long total = 0;
        switch (operation)
        {
            case "add":
                 total = num1 + num2;
                 break;

            case "subtract":
                total = num1 - num2;

                break;

            case "multiple":
                total = num1 * num2;
                break;

            case "divide":
                total = num1 / num2;
                break;

            default:

        }
        return "operation: " + operation + " total: " + total;
    }
        }
*/
        @GetMapping("/calculate/{num1}/{num2}/{operation}")
        public String calculate(@PathVariable long num1, @PathVariable long num2, @PathVariable String operation)
    {
        long total = 0;
        switch (operation)
        {
            case "add":
                 total = num1 + num2;
                 break;

            case "subtract":
                total = num1 - num2;

                break;
//added multiple
            case "multiple":
                total = num1 * num2;
                break;

            case "divide":
                total = num1 / num2;
                break;

            default:

        }
        return "operation: " + operation + " total: " + total;
    }

}
