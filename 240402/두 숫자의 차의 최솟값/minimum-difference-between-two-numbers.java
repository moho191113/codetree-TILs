import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int n = sc.nextInt();
        int[] aArr = new int[n];

        Input(aArr);
        System.out.println(MinVal(aArr));
    }
    public static int[] Input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int MinVal(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i ++ ) { // i는 자동차를 구매한 시간
            for (int j = i + 1; j < arr.length; j ++) { // j는 자동차를 판매한 시간
                if (minVal > abs(arr[j] - arr[i])) { // 만약 판매가격이 기존 판매한 가격보다 높으면 업데이트
//                    System.out.println(abs(arr[j] - arr[i]));
                    minVal = abs(arr[j] - arr[i]);
                }
            }
        }
        return minVal;
    }
}