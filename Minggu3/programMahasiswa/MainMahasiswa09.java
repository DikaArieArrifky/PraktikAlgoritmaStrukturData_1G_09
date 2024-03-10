package Minggu3.programMahasiswa;

import java.util.Scanner;

public class MainMahasiswa09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        Mahasiswa09[] mhsArray = new Mahasiswa09[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke " + (i + 1));
            System.out.print("Masukkan nama : ");
            String nama = sc09.nextLine();
            System.out.print("Masukkan nim : ");
            long nim = sc09.nextLong();
            sc09.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            String jenisKelamin = sc09.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipkMHS = Double.parseDouble(sc09.nextLine());
            System.out.println();

            mhsArray[i] = new Mahasiswa09();
            mhsArray[i].nama = nama;
            mhsArray[i].nim = nim;
            mhsArray[i].jenisKelamin = jenisKelamin;
            mhsArray[i].ipkMHS = ipkMHS;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("===Data Mahasiswa===");
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            System.out.println("Nama : " + mhsArray[i].nama);
            System.out.println("NIM : " + mhsArray[i].nim);
            System.out.println("Jenis Kelamin : " + mhsArray[i].jenisKelamin);
            System.out.println("IPK : " + mhsArray[i].ipkMHS);
        }

        double rataIpk = hitungRataIpk(mhsArray);
        System.out.println("Rata-rata IPK mahasiswa: " + rataIpk);

       
        Mahasiswa09 mahasiswaTertinggi = mahasiswaDenganIpkTertinggi(mhsArray);
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaTertinggi.nama);
        System.out.println("IPK: " + mahasiswaTertinggi.ipkMHS);
    }

    public static double hitungRataIpk(Mahasiswa09[] mhsArray) {
        double totalIpk = 0;
        for (Mahasiswa09 mahasiswa : mhsArray) {
            totalIpk += mahasiswa.ipkMHS;
        }
        return totalIpk / mhsArray.length;
    }

    public static Mahasiswa09 mahasiswaDenganIpkTertinggi(Mahasiswa09[] mahasiswaArray) {
        Mahasiswa09 mahasiswaTertinggi = mahasiswaArray[0];
        for (Mahasiswa09 mahasiswa : mahasiswaArray) {
            if (mahasiswa.ipkMHS > mahasiswaTertinggi.ipkMHS) {
                mahasiswaTertinggi = mahasiswa;
            }
        }
        return mahasiswaTertinggi;
    }
}
