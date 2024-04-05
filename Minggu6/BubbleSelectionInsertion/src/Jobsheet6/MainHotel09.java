package Minggu6.BubbleSelectionInsertion.src.Jobsheet6;

public class MainHotel09 {
    public static void main(String[] args) {
        
        HotelService09 lisHotel09 = new HotelService09();

        Hotel09 h1 = new Hotel09("Pochinki", "Jakarta", 500000, (byte) 4 );
        Hotel09 h2 = new Hotel09("Boger", "Madura", 450000, (byte) 3 );
        Hotel09 h3 = new Hotel09("Onigashima", "Bandung", 800000, (byte) 5 );
        Hotel09 h4 = new Hotel09("Egghead", "Malang", 300000, (byte) 2 );
        Hotel09 h5 = new Hotel09("Konoha", "Blitar", 100000, (byte) 1 );
        

        lisHotel09.tambahHotel(h1);
        lisHotel09.tambahHotel(h2);
        lisHotel09.tambahHotel(h3);
        lisHotel09.tambahHotel(h4);
        lisHotel09.tambahHotel(h5);
        

        System.out.println("Daftar Hotel yang belum sorting");
        lisHotel09.tampilAll();
        System.out.println();

        System.out.println("Daftar Hotel dari harga termurah sampai tertinggi");
        lisHotel09.bubbleSortHotel();
        lisHotel09.tampilAll();
        System.out.println();

        System.out.println("Daftar Hotel dari bintang tertinggi");
        lisHotel09.selectionSortHotel();
        lisHotel09.tampilAll();
        
        

        
    }
}
