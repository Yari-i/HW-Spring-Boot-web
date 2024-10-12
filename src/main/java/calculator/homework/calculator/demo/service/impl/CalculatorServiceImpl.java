package calculator.homework.calculator.demo.service.impl;

import calculator.homework.calculator.demo.service.CalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculateService {

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
