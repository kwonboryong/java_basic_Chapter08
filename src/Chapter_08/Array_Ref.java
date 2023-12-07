package Chapter_08;

public class Array_Ref {
    public static void main(String[] args) {

        // 리펙토링(refactoring): 기존 코드 기능은 유지하되 내부 코드 구조를 개선하는 것

        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 선언, 생성, 초기화

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
