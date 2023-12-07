package Chapter_08;

public class ArrayDi0_Ref2 {
    public static void main(String[] args) {

        // 2 x 3의 2차원 배열
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6}
        }; // 행2, 열3

        for (int row = 0; row < arr.length; row++) { // arr.length = 행의 갯수
            for (int colume = 0; colume < arr[row].length; colume++) { // arr[row].length = 열의 갯수
                System.out.print(arr[row][colume] + " ");
            }
            System.out.println(); // 한 행이 끝나면 줄바꿈
        }
    }
}
