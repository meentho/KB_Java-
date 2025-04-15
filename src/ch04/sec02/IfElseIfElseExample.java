package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score=75;

        if(score>=90){
            System.out.println("점수가 90~100");
            System.out.println("A등급");
        }else if(score>=80){
            System.out.println("점수가 80~89");
            System.out.println("B등급");
        } else if (score>=70){
            System.out.println("점수가 70~79");
            System.out.println("C등급");
        }else {
            System.out.println("점수가 0~69");
            System.out.println("D등급");
        }

    }
}
