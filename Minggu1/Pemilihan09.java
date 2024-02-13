package Minggu1;

import java.util.Scanner;

public class Pemilihan09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir = 0;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc09.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc09.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts = sc09.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas = sc09.nextDouble();

        if (nilaiTugas >= 0 && nilaiTugas <= 100 && nilaiKuis >= 0 && nilaiKuis <= 100 && nilaiUts >= 0 && nilaiUts <= 100 && nilaiUas >= 0 && nilaiUas <= 100) {
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }

            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==========================");
            System.out.println("==========================");

            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("Anda Tidak Lulus");
            }
        } else {
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.println("Nilai tidak valid");
            System.out.println("==========================");
            System.out.println("==========================");

        }
    }
}
