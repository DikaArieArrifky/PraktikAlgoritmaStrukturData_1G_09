package Minggu6.BubbleSelectionInsertion.src.Jobsheet6;

public class Main09 {
    public static void main(String[] args) {
        
        DaftarMahasiswaBerprestasi09 list = new DaftarMahasiswaBerprestasi09();
        Mahasiswa09 m1 = new Mahasiswa09("Nusa", 2017, 25, 3);
        Mahasiswa09 m2 = new Mahasiswa09("Rara", 2012, 19, 4);
        Mahasiswa09 m3 = new Mahasiswa09("Dompu", 2018, 19, 3.5);
        Mahasiswa09 m4 = new Mahasiswa09("Abdul", 2017, 23, 2);
        Mahasiswa09 m5 = new Mahasiswa09("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Daftar mahasiswa yang belum sorting =");
        list.tampil();
        System.out.println();

        // System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        // list.bubbleShort();
        // list.tampil();
        // System.out.println();

        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        // list.insertionSort();
        // list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.insertionSort();
        list.tampil();

    }
}
