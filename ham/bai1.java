package ham;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (nt(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean nt ( int n) {
        for (int i = 2; i <Math.sqrt(n); i++) {
           if ( n % i == 0) {
            return false;
           }
       }
       return n>1;
    }
    
}
