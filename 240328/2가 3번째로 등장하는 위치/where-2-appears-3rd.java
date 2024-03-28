import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 정수 n 입력
        int n = sc.nextInt();
        int[] arr = new int[n]; // 크기가 n인 배열을 생성
        // 배열에 숫자 추가
        for (int i = 0; i < arr.length; i++) {
            int elem = sc.nextInt(); //숫자 입력
            arr[i] = elem;
        }
        int cnt = 0; // 2번이 몇번이 나온지 체크
        int idx = 0; // 3번째로 나온 2의 위치를 체크
        // 배열 순회
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) { // 2를 만나면 cnt 증가
                cnt++; 
                if (cnt == 3) { // 3번째로 만난 idx 출력
                    idx = i + 1;
                }
            }
        }
        System.out.println(idx);
    }
}