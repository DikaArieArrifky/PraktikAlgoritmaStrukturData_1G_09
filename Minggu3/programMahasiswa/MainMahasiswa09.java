package Minggu3.programMahasiswa;

import java.util.Scanner;

public class MainMahasiswa09 {

    

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        mahasiswa09 [] MhsArray = new mahasiswa09[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan data mahasiswa ke "+ (i+1));
            System.out.println();
            
            MhsArray[i] = new mahasiswa09();
            
            System.out.print("Masukkan nama : ");
            MhsArray[i].nama=sc09.nextLine();
            System.out.print("Masukkan nim : ");
            MhsArray[i].nim = sc09.nextLong();
            sc09.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            MhsArray[i].jenisKelamin = sc09.nextLine();
            
            System.out.print("Masukkan IPK : ");
            MhsArray[i].ipkMHS = Double.parseDouble(sc09.nextLine());
            System.out.println();
    
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
