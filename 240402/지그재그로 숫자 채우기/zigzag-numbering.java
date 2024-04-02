import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = sc.nextInt(); // n입력
        int m = sc.nextInt(); // m입력

        int[][] aArr = new int[n][m]; // n * m 크기의 배열을 생성

        ArrayGen(aArr, n, m); // 배열에 data input
        printArr(aArr, n, m); // 배열 출력
    }
    public static void ArrayGen (int[][] arr, int n, int m) {
        int inputNum = 0; // input 으로 넣을 num
        for (int j = 0; j < m; j++ ){  // cat
            if (j % 2 == 0) { // j 가 짝수 일 때 위에서 아래로 input
                for (int i = 0; i < n; i++) {
                    arr[i][j] = inputNum;
                    inputNum++; //하나 증가
                }
            } else if (j % 2 == 1) { // j 가 짝수 일 때 아래에서 위로 input
                for (int i = n - 1; i >= 0; i--) {
                    arr[i][j] = inputNum;
                    inputNum++;
                }
            }
        }
    }
    public static void printArr (int[][] aArr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(aArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}