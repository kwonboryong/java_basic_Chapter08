package Chapter_08;

// 향상된 for문(for each문): 배열을 for문보다 더 편리하게 사용할 수 있다.
/* for (배열 값을 저장할 변수 : 탐색할 배열) {
   배열을 순회하면서 수행할 작업
 } */
// *단축키 = iter 

public class for_each {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문
        for (int number : numbers) { // 배열 numbers의 값을 하나씩 꺼내서 변수 number에 저장, for문 수행 -> 반복
            System.out.println(number);
        }

        // 향상된 for문을 사용할 수 없는 경우 = 증가하는 index 값이 필요할 때
        // 향상된 for문 안에 이미 증가하는 index 값이 감춰져있음 -> index 값 i를 직접 사용해야 하는 경우엔 for-each문 사용 X
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

    }
}

