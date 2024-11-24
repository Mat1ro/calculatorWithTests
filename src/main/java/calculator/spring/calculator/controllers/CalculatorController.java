package calculator.spring.calculator.controllers;

import calculator.spring.calculator.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculator;

    public CalculatorController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping(path = "")
    public String helloCalculator() {
        return calculator.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculator.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculator.minus(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculator.multiply(a, b);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1") int a, @RequestParam("num2") int b) {
        return calculator.divide(a, b);
    }
}