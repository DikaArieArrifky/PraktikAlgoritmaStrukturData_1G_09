import java.util.Scanner;

public class MainPangkat09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("==========");
        System.out.println("Masukkan jumlah elemen yang akan dihitung : ");
        int elemen = sc09.nextInt();

        Pangkat09[] png = new Pangkat09 [elemen];
        for (int i = 0; i < elemen; i++) {
            png [i] = new Pangkat09();
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai= sc09.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            png[i].pangkat = sc09.nextInt();

        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
