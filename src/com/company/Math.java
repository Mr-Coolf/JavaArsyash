package com.company;

public class Math {
    public int factorial (int number) {
        if (number <= 0) return 0;
        if (number == 1) return 1;
        return factorial(number - 1) * number;
    }
}
