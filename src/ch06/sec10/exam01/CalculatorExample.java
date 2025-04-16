package ch06.sec10.exam01;

public class CalculatorExample {
    public static void main(String[] args) {

        double result1 = 10 * 10 * Calculator.pi;   // 원의 넓이
        int result2 = Calculator.plus(10, 5);   // 합
        int result3 = Calculator.minus(10, 5);  // 차

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}

//result1: 314.1592
//result2: 15
//result3: 5