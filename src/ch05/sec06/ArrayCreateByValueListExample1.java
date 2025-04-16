package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};

        for(int i = 0; i < season.length; i++){
            System.out.println("season[" + i + "]: " + season[i]);
        }

        System.out.println();

        int[] score = {83, 90, 87};
        int sum = 0;
        double average = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i];
            average = (double)sum / score.length;
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);
    }
}
