public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 5*5 배열 생성
        int[][] arr = new int[5][5];

        // 1. 첫번째 행 전부 1로 채워주기
        for (int i =0; i < arr.length; i++ ) {
            arr[0][i] = 1;
        }

        // 2. 첫번째 열 전부 1로 채워주기
        for (int i = 0; i < arr.length; i++ ) {
            arr[i][0] = 1;
        }

        // 3. 바로 위칸과 바로 왼쪽값을 더함
        for (int i = 1; i < arr.length; i++){
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = (arr[i-1][j] + arr[i][j-1]); // 바로 위칸과 바로 왼쪽값을 더함
            }
        }
        // 4. 출력
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length; j++ ){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}