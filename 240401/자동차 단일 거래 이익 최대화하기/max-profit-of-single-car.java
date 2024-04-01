import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n년 input
        int[] nArr = new int[n]; // n크기의 배열 선언
        InputData(nArr, sc);
        int maxVal = Integer.MIN_VALUE; // maxVal 변수 초기화

        for (int i = 0; i < nArr.length; i ++ ) { // i는 자동차를 구매한 시간
            for (int j = i + 1; j < nArr.length; j ++) { // j는 자동차를 판매한 시간
                if (maxVal < (nArr[j] - nArr[i])) { // 만약 판매가격이 기존 판매한 가격보다 높으면 업데이트
                    maxVal = (nArr[j] - nArr[i]);
                }
            }
        }

        if (maxVal < 0) { // 만약 0보다 작으면 0 출력
            System.out.println(0);
        } else {
            System.out.println(maxVal); // 0보다 크면 maxVal 출력
        }

    }
    // 입력받은 데이터를 배열에 넣는 method
    public static void InputData ( int[] nArr, Scanner sc ) {
        for (int i = 0; i < nArr.length; i ++ ) {
            nArr[i] = sc.nextInt();
        }
    }

}