package Minggu3;

import java.util.Scanner;

public class arrayObjects09 {
    public static void main(String[] args) {
        persegiPanjang[] ppArray09 = new persegiPanjang[3];

        Scanner sc09 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray09[i] = new persegiPanjang();
            System.out.println("Persegi Panjang ke- "+i);
            System.out.print("Masukkan Panjang: ");
            ppArray09[i].panjang = sc09.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray09[i].lebar = sc09.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke- "+i);
            System.out.println("Panjang : "+ ppArray09[i].panjang + ", Lebar : " + ppArray09[i].lebar);
        }

    }
}
