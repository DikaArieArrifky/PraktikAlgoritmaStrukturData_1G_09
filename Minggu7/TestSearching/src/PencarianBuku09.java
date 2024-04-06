import Minggu4.elektronik09;

public class PencarianBuku09 {
    Buku09 listBk [] = new Buku09[5];
    int idx;

    void tambahBuku(Buku09 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku09 m : listBk) {
            m.tampilBuku();
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi=i;
                break;
            }
        }
        return posisi;
    }

    public Buku09 findBuku(int cari){
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
            return listBk[i];
                
            }    
        }
        return null;
    }

    public void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }    

    public void tampilData(int x, int pos){
        if (pos !=-1) {
            System.out.println("Kode buku\t     : " + x);
            System.out.println("Judul\t         : " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit\t  : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t     : " + listBk[pos].pengarang);
            System.out.println("Stock\t         : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (right+left) /2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return findBinarySearch(cari , left , mid-1);
            } else{ 
                return findBinarySearch(cari, mid+1, right);
                
            }
        } return -1;
    }
 
}
