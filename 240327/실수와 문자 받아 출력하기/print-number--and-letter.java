import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        char a;
        double b, c;

        //입력
        a = sc.next().charAt(0); // 문자열에서 첫번째 값
        b = sc.nextDouble();     // double 입력
        c = sc.nextDouble();     // double 입력

        // 출력
        System.out.println(a);
        System.out.printf("%.2f\n%.2f", b, c);
    }
}