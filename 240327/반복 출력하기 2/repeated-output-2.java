public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        printHello(4);                     //printHello 메서드 호출
        
    }
    public static void printHello(int n) { // 1부터 n번째 줄까지 별을 출력하는 함수
        if (n == 0) {                      // n이 0이라면, 더 이상 진행하지 않고
            return;                        // return
        }
        printHello(n - 1);                 // 1부터 n - 1번째 줄까지 출력하는 함수
        System.out.println("HelloWorld");  // n번째 줄에 해당하는 Helloworld 출력
    }
}