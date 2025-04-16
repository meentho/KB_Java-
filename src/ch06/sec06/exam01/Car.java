package ch06.sec06.exam01;

public class Car {
    // 필드 선언 (초기화 안함)
    String model;
    boolean start;
    int speed;

    // 생성자에서 출력해보자
    public Car() {
        System.out.println("model: " + model);   // null
        System.out.println("start: " + start);   // false
        System.out.println("speed: " + speed);   // 0
    }

    public static void main(String[] args) {
        new Car(); // 생성자 실행 → 기본값 출력
    }
}

// 출력값
// model: null
// start: false
// speed: 0