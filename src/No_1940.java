import java.util.Arrays;
import java.util.Scanner;

public class No_1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 재료의 개수
        int y = sc.nextInt(); // 갑옷이 완성되는 번호의 합
        int [] A = new int[x];

        for(int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A); // 배열 오름차순 정렬

        int start_index = 0;
        int end_index = x-1;
        int count = 0;

        while(start_index<end_index){
            if(A[start_index] + A[end_index] == y){
                count++;
                start_index++;
                end_index--;

            } else if (A[start_index] + A[end_index] < y) {
                start_index++;
            }else if (A[start_index] + A[end_index] > y){
                end_index--;
            }
        }

        System.out.println(count);

    }
}
