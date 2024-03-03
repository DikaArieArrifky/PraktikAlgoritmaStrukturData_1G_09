package Minggu3.ArraySegitiga;

public class MainSegitiga {
    public static void main(String[] args) {
        
        Segitiga [] sgArray09 = new Segitiga[4];

        sgArray09[0] = new Segitiga(10, 4);
        sgArray09[1] = new Segitiga(20, 10);
        sgArray09[2] = new Segitiga(15, 6);
        sgArray09[3] = new Segitiga(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Luas Segitiga ke- " + i +": " + sgArray09[i].hitungVolume());
            System.out.println("Keliling segitiga ke- " + i + ": " + sgArray09[i].hitungKeliling());
        }
    }
}
