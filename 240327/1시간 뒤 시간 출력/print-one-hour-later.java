import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":"); // : 를 기준으로 입력을 나눔
        int h = sc.nextInt(); // : 를 입력 받기 전에 입력 값
        int m = sc.nextInt(); // : 를 입력 받고 나서의 입력 값
        System.out.println((h + 1) + ":" + m);
    }
}