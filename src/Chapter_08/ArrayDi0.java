package Chapter_08;

public class ArrayDi0 {
    public static void main(String[] args) {

        // 2차원 배열: 타입[][] 변수명 = new 타입[행][열];
        // 행(row): 가로, 열(colume): 세로

        // 2 x 3의 2차원 배열
        int[][] arr = new int[2][3]; // 행2, 열3
        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // 0행
        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println(); // 한 행이 끝나면 줄바꿈
        // 1행
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println(); // 한 행이 끝나면 줄바꿈
    }
}
