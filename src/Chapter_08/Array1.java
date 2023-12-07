package Chapter_08;

public class Array1 {
    public static void main(String[] args) {

        // 학생들의 점수를 출력하는 프로그램

        int[] students; // 배열 변수 선언 (int형 배열을 담을 수 있는 변수)
        students = new int[5]; // 배열 생성, 참조값(주소) 반환 (int 5개를 넣을 수 있는 배열)
        // 변수 students는 new int[5]로 생성한 배열의 참조값을 갖고 있다!

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]); // 변수값 사용
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

        System.out.println(students); // 배열의 참조값 확인하기
    }
}
