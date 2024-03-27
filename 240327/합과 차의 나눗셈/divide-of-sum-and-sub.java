import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // 둘다 인트형 이기 때문에 하나는 DOUBLE로 바꿔 실수형으로 출력 될 수 있게함
        System.out.printf("%.2f", (double)(a + b) / (a - b));
    }
}