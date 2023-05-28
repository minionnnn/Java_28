package mang2chieu;

import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ;j++){
                if(nt(a[i][j])){
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static boolean nt (int n){
        if(n < 2){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
