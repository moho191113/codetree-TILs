import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 배열 생성
        char[] words = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};

        int idx = -1; // 해당하는 문자가 없으면 -1

        char word = sc.next().charAt(0);
        // 배열을 순회하면서 입력 된 문자를 찾기
        for (int i = 0; i < words.length; i++) {
            if (words[i] == word) {
                idx = i; // 찾으면 문자 위치 저장
            }
        }
        // 문작 존재하지 않는 경우
        if (idx == -1) {
            System.out.println("None");
        } else {
            System.out.println(idx);
        }
        
    }
}