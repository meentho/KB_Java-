package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = new int[3];  // 배열 객체 생성
        intArray[0] = 10;

        String str = "Hello";        // 문자열 객체 할당
        System.out.println("총 문자 수: " + str.length() );
    }
}
