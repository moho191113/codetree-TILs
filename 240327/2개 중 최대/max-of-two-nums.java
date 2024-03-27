import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
                // 삼항 연산자
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max_val = a > b ? a : b; // a 가 b 보다 크면 a 아니면 b
        System.out.println(max_val);
    }
}