package ifelse;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double res = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
        System.out.printf("%.2f",res);

        
    }
    
}
