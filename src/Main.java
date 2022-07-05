import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the base number :");
        n = input.nextInt();
        System.out.print("enter the exponent number :");
        k = input.nextInt();
        int total = 1;

        // 3^4 = 3*3*3*3
       /*int i=1;
        while(i<=k){
            k++;
            total*=n; */

        for (int i = 1; i <= k; i++) {
            total *=n;

        }

        System.out.println("C(n,r)" + total);
    }
}
