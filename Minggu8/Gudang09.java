package Minggu8;

public class Gudang09 {
    Barang09[] tumpukan;
    int size;
    int top;

    public Gudang09(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang09[size];
        top = -1;

    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang09 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang09 ambilBarang() {
        if (!cekKosong()) {
            Barang09 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " sudah diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang09 lihatBarangTeratas09() {
        if (!cekKosong()) {
            Barang09 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
           
            for (int i = 1; i >= 0; i--) {
                System.out.printf("kode %d: %s (kategori %s)\n" , tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
                
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }
}
