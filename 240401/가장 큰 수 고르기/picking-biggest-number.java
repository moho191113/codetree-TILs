import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int inputVal = sc.nextInt();
            if (inputVal > maxValue) {
                maxValue = inputVal;
            }
        }
        System.out.println(maxValue);
    }
}