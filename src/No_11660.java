import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        /*
        br은 문자를 입력받음
        st는 입력받은 문자를 공백단위로 쪼갬
        ex) input = 1 2 3
            token = 1,2,3
         */


        int N = Integer.parseInt(st.nextToken());
        // 2차원 배열의 크기
        int M = Integer.parseInt(st.nextToken());
        // 구간 합 질의의 개수

        int arr[][] = new int[N+1][N+1];
        // 합배열 초기화

        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


    }
}
