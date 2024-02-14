package Minggu1;

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        String matkul[] = new String[8];
        String nilaiHuruf[] = new String[8];
        double nilaiMatkul[] = new double[8];
        double nilaiSetara[] = new double[8];
        double  totalSKS = 0, totalNilaiAwal= 0;
        double bobotSKS[]= new double[8];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Mata Kuliah : ");
            matkul[i] = sc09.nextLine();

            System.out.print("Masukkan nilai " + matkul[i] + " : ");
            nilaiMatkul[i] = sc09.nextInt();
            sc09.nextLine();

            System.out.print("Masukkan Bobot SKS Mata Kuliah " + matkul[i] + " : ");
            bobotSKS[i] = sc09.nextInt();
            sc09.nextLine();

        }

        for (int i = 0; i < nilaiMatkul.length; i++) {
            if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else if (nilaiMatkul[i] > 0 && nilaiMatkul[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
            
            totalSKS += bobotSKS[i];
            totalNilaiAwal += nilaiSetara[i] * bobotSKS[i];
            
        }
         double IP = Math.round(totalNilaiAwal/totalSKS*100.0)/100.0;
        System.out.println("=========================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("=========================");

        for (int i = 0; i < nilaiSetara.length; i++) {
            System.out.println("Masukkan nilai Angka untuk MK " + matkul[i] + " : " + nilaiMatkul[i]);

        }
        System.out.println("=========================");
        System.out.println("Hasil Konversi");
        System.out.println("=========================");
        System.out.printf("%-40s %-20s %-15s %4s%n","MK","Nilai Angka", "Nilai Huruf", "Nilai Setara");
        for (int i = 0; i < nilaiSetara.length; i++) {
            System.out.printf("%-40s %-20s %-15s %4s%n", matkul[i], nilaiMatkul[i], nilaiHuruf[i], nilaiSetara[i]);

        }

       
        System.out.println("=========================");
        System.out.println("IP SEMESTER : " + String.format("%.2f", IP));

    }
}