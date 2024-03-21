
import java.util.Scanner;

public class MainFaktorial09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("=======");
        System.out.println("Masukkan jumlah elemen : ");    
        int iJml = sc09.nextInt();

        Faktorial09 [] fk = new Faktorial09[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial09();
            System.out.println("Masukkan data nilai ke- "+(i+1) + " : ");
            int iNilai = sc09.nextInt();
            fk[i].nilai = iNilai;

           

        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));

        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
