package ch03.sec03;

public class OverFlowUnderflowExample {
    public static void main(String[] args){
        // i=2일때부터 오버플로우 발생
        byte var1 = 125;
        for(int i =0; i<5; i++){
            var1++;
            System.out.println("var1: " + var1);}

        System.out.println("-------------------");

        // i=3일때부터 언더플로우 발생
        byte var2 = -125;
        for(int i=-0; i<5; i++){
            var2--;
            System.out.println("var2: " + var2);
        }

    }
}
