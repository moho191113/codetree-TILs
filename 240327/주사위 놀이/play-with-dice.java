import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[6];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[num-1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i]);
        }
    }
}