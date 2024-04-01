import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n]; // N 크기의 배열
        int endPoint = n;
        int MaxVal = 0;

        InputData(nArr, sc); // 데이터 input

        while (true) {
            MaxVal = MaxVal(nArr, endPoint);
            endPoint = MinIdx(nArr, MaxVal, endPoint);
            System.out.print((endPoint + 1) + " ");
            if (endPoint == 0) {
                break;
            }
        }
    }
    public static void InputData ( int[] nArr, Scanner sc ) {
        for (int i = 0; i < nArr.length; i ++ ) {
            nArr[i] = sc.nextInt();
        }
    }
    public static int MaxVal ( int[] nArr, int idx) {
        int maxVal = Integer.MIN_VALUE; //
        for (int i = 0; i < idx ; i++) {
            if (nArr[i] > maxVal) {
                maxVal = nArr[i];
            }
        }
        return maxVal;
    }
    public static int MinIdx ( int[] nArr, int MaxVal, int idx) {
        int minIdx = Integer.MAX_VALUE;;
        for ( int i = 0; i < idx; i++ ) {
            if ( nArr[i] == MaxVal ) {
                if ( i < minIdx ) {
                    minIdx = i;
                }
            }
        }
        return minIdx;
    }
}