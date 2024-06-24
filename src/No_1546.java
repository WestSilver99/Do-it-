import java.util.Scanner;

public class No_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] score = new int[N];

        double sum = 0;

        int max = -1;

        for(int i = 0; i<N; i++){
            score[i] = sc.nextInt();
            if(score[i]>max){
                max = score[i];
            }
            sum += score[i];
        }
        System.out.println((sum/max*100)/3);
    }
}
