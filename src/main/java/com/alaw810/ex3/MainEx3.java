package com.alaw810.ex3;

public class MainEx3 {
    public static void main(String[] args) {
        float a = 5;
        float b = 4;

        Operation sum = () -> a + b;
        Operation sub = () -> a - b;
        Operation mul = () -> a * b;
        Operation div = () -> a / b;

        System.out.println("Sum: " + sum.operation());
        System.out.println("Sub: " + sub.operation());
        System.out.println("Mul: " + mul.operation());
        System.out.println("Div: " + div.operation());
    }
}
