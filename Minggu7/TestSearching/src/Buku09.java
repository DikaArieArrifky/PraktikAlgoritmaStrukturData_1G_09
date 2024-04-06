public class Buku09 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku09(int kdBuku, String jud, int tahunTbt, String pg, int st){
        kodeBuku = kdBuku;
        judulBuku = jud;
        tahunTerbit = tahunTbt;
        pengarang = pg;
        stock = st;
        
    }

    public void tampilBuku(){
        System.out.println("====================");
        System.out.println("Kode buku    : " + kodeBuku);
        System.out.println("Judul buku   : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Stock        : " + stock);

    }
     

}
