import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 데이터의 개수
        int y = Integer.parseInt(st.nextToken()); // 질의 개수

        long[]S = new long[x+1]; // 0번째 배열을 없애는 방법
        st = new StringTokenizer(br.readLine());

        for(int i =1; i<=x; i++){
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q = 0 ; q<y; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
