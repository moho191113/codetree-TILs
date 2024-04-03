import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 행의 크기 a 입력
        int n = sc.nextInt();
        // n * n 배열 생성
        int[][] arr = new int[n][n];
        // i가 0부터 n까지 증가하면서 반복
        for (int i = 0; i < n; i++) {
            //
            for (int j = 0; j <= i; j++) {
                // j 가 첫번째 행이거나 마지막 행이면 1로 초기화
                if (j == 0 || j == i){
                    arr[i][j] = 1;
                    // 첫번째 행이나 마지막 행이 아니면 (i - 1, j - 1)(i - 1, j)에 위치한 숫자를 더한 값을 입력
                } else {
                    arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]);
                }
            }
        }
        // 배열에 저장 되어있는 값을 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // 만약 0 이 아니라면 출력
                if (arr[i][j] != 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}