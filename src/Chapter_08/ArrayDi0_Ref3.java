package Chapter_08;

public class ArrayDi0_Ref3 {
    public static void main(String[] args) {

        // 2 x 3의 2차원 배열
        int[][] arr = new int[2][3];

        // 순서대로 1씩 증가하는 값을 입력한다.
        int i = 1; // 배열이 1부터 시작
        for (int row = 0; row < arr.length; row++) {
            for (int colume = 0; colume < arr[row].length; colume++) {
                arr[row][colume] = i++; // ++를 사용해서 값을 먼저 대입한 후 증가한다.
            }
        }

        for (int row = 0; row < arr.length; row++) { // arr.length = 행의 갯수
            for (int colume = 0; colume < arr[row].length; colume++) { // arr[row].length = 열의 갯수
                System.out.print(arr[row][colume] + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
    }
}
