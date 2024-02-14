package Minggu1;

import java.util.Scanner;


public class Fungsi09 {
    static int stockBunga[][] = {
                  //   Aglonema,Keladi,Alocasia,Mawar        
     //Royal Garden 1      10      5      15      7
     //Royal Garden 2       6     11       9     12
     //Royal Garden 3       2     10      10      5
     //Royal Garden 4       5      7      12      9 
    {10, 5, 15, 7},
    {6, 11, 9, 12},
    {2, 10, 10, 5},
    {5, 7, 12, 9}
    };

    static int hargaBunga[] = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {

        pendapatanPerCabang();
        kurangiStockBunga(1, 2, 0, 5);
        stockPerBungaCabang4();
    }

    public static void pendapatanPerCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan Cabang " + (i + 1) + ": Rp" + totalPendapatan);
        }
    }

    public static void kurangiStockBunga(int aglonemaMati, int keladiMati, int alocasiaMati, int mawarMati) {
        stockBunga[3][0] -= aglonemaMati;
        stockBunga[3][1] -= keladiMati;
        stockBunga[3][2] -= alocasiaMati;
        stockBunga[3][3] -= mawarMati;
    }

    public static void stockPerBungaCabang4() {
        System.out.println("Stock Bunga pada cabang 4 : ");
        System.out.println("Aglonema : " + stockBunga[3][0]);
        System.out.println("Keladi : " + stockBunga[3][1]);
        System.out.println("Alocasia : " + stockBunga[3][2]);
        System.out.println("Mawar: " + stockBunga[3][3]);
    }
}
