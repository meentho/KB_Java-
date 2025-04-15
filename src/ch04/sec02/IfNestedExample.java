package ch04.sec02;

import java.sql.SQLOutput;

public class IfNestedExample {
    public static void main(String[] args) {
        // int num = (int)(Math.random() * 범위의개수 + 시작값);
        int score = (int)(Math.random()*20 + 81);
        System.out.println("점수: " + score);

        String grade;
        if(score >= 95){
            System.out.println("학점: A");
        }else if(score >= 90){
            System.out.println("학점: B");
        } else if(score >= 85){
            System.out.println("학점: C");
        }else{
            System.out.println("학점: D");
            System.out.println("hhihih");
        }
    }
}
