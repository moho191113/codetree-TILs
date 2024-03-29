import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, q;
        int question;
        n = sc.nextInt(); // 원소의 개수 n
        q = sc.nextInt(); // 질의 개수 q

        int[] arr = new int[n]; // 크기 n인 배열 선언

//      배열안에 정수입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//      q 개의 질의 받기
        for (int i = 0; i < q; i ++) {
            question = sc.nextInt();
            switch (question) {
                case 1 : // a 번째 원소 출력
                    int a = sc.nextInt();
                    System.out.println(arr[a-1]);
                    break;
                case 2 : // 숫자 num 가 있는지 판단
                    boolean search = false; // 없으면 false
                    int idx = 0; // 몇번째 위치에 있는지 기록
                    int num = sc.nextInt(); // 숫자 입력

                    for ( int j = 0; j < arr.length; j++ ) {
                        if (num == arr[j]) { // 만약 같은 숫자가 있으면?
                            idx = j; // 위치 저장
                            search = true;
                            System.out.println(idx+1); // 위치 출력
                            break;
                        }
                    }
                    if (search == false) { // 만약 일치하는 숫자가 없으면 0출력
                        System.out.println(0);
                    }
                    break;
                case 3 : // a부터 b원소까지 순서대로 공배을 사이에 두고 출력
                    int s = sc.nextInt(); // 시작
                    int b = sc.nextInt(); // 끝
                    for (int k = (s-1); k < b; k++ ) { // 시작부터 끝번호 출력
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}