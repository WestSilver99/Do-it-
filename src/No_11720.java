import java.util.Scanner;

public class No_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String Num = sc.next();

        char[] sNum = Num.toCharArray();

        int sum = 0;

        for(int i = 0; i<x; i++){
            System.out.println(sNum[i]);
            sum += sNum[i] - '0';
        }

    }
}
