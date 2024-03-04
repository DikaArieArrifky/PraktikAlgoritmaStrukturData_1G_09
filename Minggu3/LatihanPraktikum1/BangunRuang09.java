package Minggu3.LatihanPraktikum1;

import java.util.Scanner;

public class BangunRuang09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        double rLingkaran;
        double tinggiLimas;
        double tinggiKerucut;
        double jariJariKerucut;
        double panjangSisiAlas;

        bola09[] bolaArray = new bola09[1];
        kerucut09[] kerucutArray = new kerucut09[1];
        limasSegiEmpat09 [] limasSegiEmpatArray = new limasSegiEmpat09[1];

        for (int i = 0; i < 1; i++) {
            bolaArray[i] = new bola09();
            System.out.println("Bola ke- "+(i+1));
            System.out.print("Masukkan jari - jari Bola : " );
            rLingkaran = sc09.nextDouble();
            bolaArray[i].jariJari = rLingkaran;
            
            
            kerucutArray[i] = new kerucut09();
            System.out.println("Kerucut ke- "+(i+1));
            System.out.print("Masukkan jari - jari kerucut: ");
            jariJariKerucut = sc09.nextDouble();
            kerucutArray[i].jariJariKerucut=jariJariKerucut;
            System.out.print("Masukkan tinggi kerucut: ");
            tinggiKerucut = sc09.nextByte();
            kerucutArray[i].tinggiKerucut=tinggiKerucut;

            limasSegiEmpatArray[i] = new limasSegiEmpat09();
            System.out.println("Limas ke-" +(i+1));
            System.out.print("Masukkan panjang sisi alas : ");
            panjangSisiAlas = sc09.nextDouble();
            limasSegiEmpatArray[i].panjangSisiAlas=panjangSisiAlas;
            System.out.print("Masukkan tinggi limas : ");
            tinggiLimas = sc09.nextDouble();
            limasSegiEmpatArray[i].tinggiLimas=tinggiLimas;
            

        }

        for (int i = 0; i < 1; i++) {
          
            System.out.println("Bola ke- "+ (i+1));
            System.out.println("Luas Permukaan : "+ bolaArray[i].hitungLuasPermukaanBola());
            System.out.println("Volume Bola : "+ bolaArray[i].hitungVolumeBola());


            
            System.out.println("Kerucut ke- " + (i+1));
            System.out.println("Luas permukaan : "+kerucutArray[i].hitungLuasPermukaanKerucut());
            System.out.println("Volume Kerucut : "+ kerucutArray[i].hitungVolumeKerucut());


            System.out.println("Limas ke- "+ (i+1));
            System.out.println("Luas Permukaan : "+ limasSegiEmpatArray[i].hitungLuasPermukaanLimas());
            System.out.println("Volume Limas : "+ limasSegiEmpatArray[i].hitungVolumeLimas());


        }
    }
}

