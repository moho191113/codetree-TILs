import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in); // 입력
        int h = sc.nextInt(); // height 입력
        int w = sc.nextInt(); // weight 입력

        int b =  (10000 * w) / (h * h); // bmi 계산

        if (b >= 25) { // b가 25이상이면
            System.out.println(b); 
            System.out.println("Obesity"); // 비만 출력
        } else { // 아니면
            System.out.println(b); // 그냥 출력
        }

    }
}