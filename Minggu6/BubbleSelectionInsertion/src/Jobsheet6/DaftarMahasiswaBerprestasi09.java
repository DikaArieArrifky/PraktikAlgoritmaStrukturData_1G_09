package Minggu6.BubbleSelectionInsertion.src.Jobsheet6;

public class DaftarMahasiswaBerprestasi09 {
    Mahasiswa09 listMhs [] = new Mahasiswa09[5];
    int idx;
    
    void tambah(Mahasiswa09 m){
        if (idx < listMhs.length) {
            listMhs [idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for (Mahasiswa09 m : listMhs) {
            m.tampil();
            System.out.println("-----------------------");
        }
    }

    void bubbleShort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 0; j < listMhs.length-i-1; j++) {
                if (listMhs[j].ipk < listMhs[j+1].ipk) {
                    Mahasiswa09 tmp = listMhs[j];
                    listMhs[j] = listMhs[j+1];
                    listMhs[j+1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa09 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i]= tmp;
        }
    }
    
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa09 temp = listMhs[i];
            int j = i-1;
            while (j >= 0 && listMhs[j].ipk > temp.ipk) {
                listMhs[j+1] = listMhs[j];
                j = j-1;

            }
            listMhs[j+1] = temp;
        }
    }
}
