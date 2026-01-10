package TUT1.Activity2;

/*
c) JavaScript to Java - Simple Calculator
Convert from dynamically-typed to statically-typed OOP
// JavaScript Code
    class Calculator {
        constructor() {
            this.result = 0;
        }
        add(a, b) {
            this.result = a + b;
            return this.result;
        }
        subtract(a, b) {
            this.result = a - b;
            return this.result;
        }
        multiply(a, b) {
            this.result = a * b;
            return this.result;
        }
        divide(a, b) {
            if (b === 0) {
                console.log("Cannot divide by zero");
                return null;
            }
            this.result = a / b;
            return this.result;
        }
    }
    const calc = new Calculator();
    console.log(calc.add(5, 3));
    console.log(calc.multiply(4, 2));
TODO Task: Convert to Java, addressing:
    Type declarations
    Exception handling for division by zero
    Constructor syntax
    Access modifiers
*/

public class Activity2c {
    private double result;

    public Activity2c() {
        this.result = 0;
    }

    public double add(double a, double b) {
        this.result = a + b;
        return this.result;
    }

    public double subtract(double a, double b) {
        this.result = a - b;
        return this.result;
    }

    public double multiply(double a, double b) {
        this.result = a * b;
        return this.result;
    }

    public Double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return null;
        }
        this.result = a / b;
        return this.result;
    }

    public static void main(String[] args) {
        Activity2c calc = new Activity2c();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.multiply(4, 2));
        System.out.println(calc.divide(10, 0));
    }
}
