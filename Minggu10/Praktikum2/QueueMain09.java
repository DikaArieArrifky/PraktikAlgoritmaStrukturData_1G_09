package Minggu10.Praktikum2;

import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class QueueMain09 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian terbelakang");
        System.out.println("--------------");

    }

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc09.nextInt();
        Queue09 antri = new Queue09(jumlah);
        int pilih;

        do {
            menu();
            pilih = sc09.nextInt();
            sc09.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan no rekening: ");
                    String norek = sc09.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc09.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc09.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc09.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc09.nextDouble();
                    Nasabah09 nb = new Nasabah09(norek, nama, alamat, umur, saldo);
                    sc09.nextLine();
                    antri.Enqueue(nb);
                    break;

                case 2:
                    Nasabah09 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && !"".equals(data.umur != 0 && data.saldo != 0)) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
