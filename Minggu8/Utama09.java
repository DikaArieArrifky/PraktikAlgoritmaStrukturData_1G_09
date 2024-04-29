package Minggu8;

import java.util.Scanner;

public class Utama09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("Masukkan kapasitas gudang: ");
        int kapasitas = sc09.nextInt();
        Gudang09 gudang = new  Gudang09(kapasitas);
        

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = sc09.nextInt();
            sc09.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = sc09.nextInt();

                    sc09.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = sc09.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc09.nextLine();
                    Barang09 barangBaru = new Barang09(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    
                break;

                case 2:
                gudang.ambilBarang();
                break;
                
                case 3:
                gudang.tampilkanBarang();
                break;

                case 4:
                gudang.lihatBarangTeratas09();
                break;

                case 5:
                break;

                default:
                System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
