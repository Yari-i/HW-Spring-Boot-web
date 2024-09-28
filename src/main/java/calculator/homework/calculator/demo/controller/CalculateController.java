package calculator.homework.calculator.demo.controller;

import calculator.homework.calculator.demo.service.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String printGreeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Для вычеслений нужны два аргумента";
        }

        int result = calculateService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("minus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Для вычеслений нужны два аргумента";
        }

        int result = calculateService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Для вычеслений нужны два аргумента";
        }

        int result = calculateService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {

        if (num1 == null || num2 == null) {
            return "Для вычеслений нужны два аргумента!";
        }
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        int result = calculateService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}






