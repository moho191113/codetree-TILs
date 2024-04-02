import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        char[][] aArr = new char[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                aArr[i][j] = Character.toUpperCase(sc.next().charAt(0));
                System.out.print(aArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}