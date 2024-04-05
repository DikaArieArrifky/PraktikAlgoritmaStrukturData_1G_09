package Minggu6.BubbleSelectionInsertion.src.Jobsheet6;

public class Hotel09 {
    String nama, kota;
    int harga;
    byte bintang;

     Hotel09(String n, String k, int h, byte b){
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;
    }
    
    void tampilListHotel(){
        System.out.println("Nama Hotel    : " + nama);
        System.out.println("Kota          : " + kota);
        System.out.println("Harga Hotel   : " + harga);
        System.out.println("Rating Hotel  : " + bintang);           
    }
}
