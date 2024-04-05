package Minggu6.BubbleSelectionInsertion.src.Jobsheet6;

public class HotelService09 {
    Hotel09 [] rooms = new Hotel09[5];
    int idxHotel;
    void tambahHotel(Hotel09 h){
        if (idxHotel < rooms.length ) {
            rooms[idxHotel] = h;
            idxHotel++;
        } else {
            System.out.println("Mohon Maaf Hotel penuh!!!");
            System.out.println();
        }
    }

    

    void tampilAll(){
        for (Hotel09 h : rooms) {
            h.tampilListHotel();
            System.out.println("--------------------");
        }
    }

    void bubbleSortHotel(){
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
             if (rooms[j].harga < rooms[j-1].harga ) {
                Hotel09 temp = rooms[j];
                rooms[j] = rooms[j-1];
                rooms[j-1] = temp;
             } 
            }
        }
    }

    void selectionSortHotel(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMinHotel = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMinHotel].bintang) {
                    idxMinHotel = j;
                } 
            }
            Hotel09 temp= rooms[idxMinHotel];
            rooms[idxMinHotel] = rooms[i];
            rooms[i] = temp;
        }
    }
}
