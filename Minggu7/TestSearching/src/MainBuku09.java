import java.util.Scanner;

public class MainBuku09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        PencarianBuku09 data = new PencarianBuku09();
        int jumBuku = 5;

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------");
            System.out.print("Kode buku \t: ");
            int kodeBuku = s.nextInt();
            s.nextLine();
            System.out.print("Judul buku \t: ");
            String judulBuku = s.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit =  s.nextInt();
            s.nextLine();
            System.out.print("Pengarang \t: ");
            String pengarang = s.nextLine();
            System.out.print("Stock \t: " );
            int stock = s.nextInt();

            Buku09 m = new Buku09(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambahBuku(m);
        }
        System.out.println("-------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println();
        

        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("Pencarian Data ");
        System.out.println("Masukkan kode buku yang dicari ");
        System.out.print("Kode buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        data.tampilData(cari, posisi);

        Buku09 dataBuku09= data.findBuku(cari);
        dataBuku09.tampilBuku();
    }
}
