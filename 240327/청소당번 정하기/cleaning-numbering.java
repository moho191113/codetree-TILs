import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int clean1 = 0, clean2 = 0, clean3 = 0;
        int days = sc.nextInt();
        for (int i = 1; i <= days; i++) {
            if (i % 12 == 0) {
                clean3 += 1;
            } else if (i % 3 == 0) {
                clean2 += 1;
            } else if (i % 2 == 0) {
                clean1 += 1;
            }
        }
        System.out.println(clean1 + " " + clean2 + " " + clean3);


    }
}