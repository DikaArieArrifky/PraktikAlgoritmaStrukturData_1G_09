package Minggu3.programMahasiswa;

import java.util.Scanner;

public class MainMahasiswa09 {

    

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        mahasiswa09 [] MhsArray = new mahasiswa09[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan data mahasiswa ke "+ (i+1));
            System.out.println();
            mahasiswa09 mhs = new mahasiswa09();
            
            System.out.print("Masukkan nama : ");
            mhs.nama = sc09.nextLine();
            System.out.print("Masukkan nim : ");
            mhs.nim = sc09.nextLong();
            sc09.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            mhs.jenisKelamin = sc09.nextLine();
            
            System.out.print("Masukkan IPK : ");
            mhs.ipkMHS = Double.parseDouble(sc09.nextLine());
            System.out.println();

            MhsArray[i]=mhs;
    
        } 
        for (int i  = 0; i < 3; i++) {
            System.out.println("===Data Mahasiswa===");
            System.out.println("Data Mahasiswa ke- "+  (i+1));
            System.out.println("nama : "+ MhsArray[i].nama);
            System.out.println("nim : "+MhsArray[i].nim);
            System.out.println("Jenis Kelamin : "+MhsArray[i].jenisKelamin);
            System.out.println("IPK : "+MhsArray[i].ipkMHS);

        }     
       

    }
}
