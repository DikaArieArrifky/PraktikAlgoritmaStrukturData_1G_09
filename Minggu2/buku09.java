package Minggu2;

public class Buku09 {
    String judul, pengarang;
    int halaman, stok, harga, hargaTotal, jumlahBuku, hargaBayar;
    double diskon;

    void tampilInformasi() {
        System.out.println("Judul                           : " + judul);
        System.out.println("Pengarang                       : " + pengarang);
        System.out.println("Jumlah Halaman                  : " + halaman);
        System.out.println("Sisa stok                       : " + stok);
        System.out.println("Harga                           : Rp " + harga);
        System.out.println("Harga Total                     : Rp " + hargaTotal);
        System.out.println("Harga diskon                    : Rp "+ hitungDiskon());
        System.out.println("Harga bayar                     : Rp " + hitungHargaBayar());
    }

    void terjual(int jml){
    if (stok > 0){
        stok -= jml;
        jumlahBuku = jml;
    }        
   }
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }

    int hitungDiskon(){
        if (hargaTotal > 150000) {
            double diskon = hargaTotal * 0.12;
            int diskon09 = (int) diskon;
            return diskon09;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000){
            double diskon = hargaTotal * 0.05;
            int diskon09 = (int) diskon;
            return diskon09;
        } else {
            double diskon =0;
            int diskon09 = (int) diskon;
            return diskon09;

        }

    }
    int hitungHargaTotal(){
        hargaTotal = harga*jumlahBuku;
        return hargaTotal;
    }
    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
    public Buku09(){

    }
    public Buku09(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga =  har;

    }

    
}




    

