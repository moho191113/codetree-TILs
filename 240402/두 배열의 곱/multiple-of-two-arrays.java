import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[][] aArr = new int[3][3];
        int[][] bArr = new int[3][3];

        ArrayGen(aArr);
        ArrayGen(bArr);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(aArr[i][j] * bArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void ArrayGen (int[][] arr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}