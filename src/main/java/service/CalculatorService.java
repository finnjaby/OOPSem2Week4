package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public static int add(int a, int b) {
        return a+b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }
}
