package ch06.sec08.exam4;

public class CalculatorExample {
    public static void main(String[] args) {
        // 객체 생성
        Calculator calc = new Calculator();

        // 정사각형 넓이 구하기
        double result1 = calc.areaRectangle(10);
        System.out.println("정사각형 넓이: " + result1);

        // 직사각형 넓이 구하기
        double result2 = calc.areaRectangle(10, 20);
        System.out.println("직사각형 넓이: " + result2);
    }
}
//정사각형 넓이: 100.0
//직사각형 넓이: 200.0