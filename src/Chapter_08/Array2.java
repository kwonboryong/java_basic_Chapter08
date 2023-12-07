package Chapter_08;

public class Array2 {
    public static void main(String[] args) {

        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성, 참조값(주소) 반환

        students[0] = 90; // 변수 students는 배열 자체가 아님! 배열의 참조값(주소)를 갖고 있을 뿐
        // x001[0] = 90; // 변수 students에 있는 참조값(x001)을 통해 실제 배열에 접근, 값 대입

    }
}
