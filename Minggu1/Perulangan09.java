package Minggu1;

import java.util.Scanner;

public class Perulangan09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
      
        System.out.print("Masukkan NIM : ");
        long nim = sc09.nextLong();

        int n = (int) (nim % 100) ;
        if (n < 10) {
          n = n + 10;
         
        }
        System.out.println("Maka n = " + n);
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10 ){
                if ( i % 2 == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
