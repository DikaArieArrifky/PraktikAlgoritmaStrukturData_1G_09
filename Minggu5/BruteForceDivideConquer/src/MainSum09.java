import java.util.Scanner;

public class MainSum09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        
        System.out.println("Masukkan jumlah perusahaan : ");
        int prshn = sc09.nextInt();

        System.out.println("Masukkan jumlah bulan : ");
        int elm = sc09.nextInt();

        Sum09 [] perusahaan = new Sum09[prshn];
        System.out.println("==============prshn====");
        for (int i = 0; i < prshn; i++) {
            System.out.println("Perusahaan ke- "+ (i+1));
            perusahaan[i]= new Sum09(elm);
            for (int j = 0; j < elm; j++) {
                System.out.println("Masukkan untung bulan ke- " + (j+1) + " = " );
                perusahaan[i].keuntungan[j] = sc09.nextDouble();
            }
        }

        System.out.println("============================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Total keuntungan perusahaan ke - " + (i+1) + " selama " + elm + " Bulan adalah " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
        }
        System.out.println("============================");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("Total keuntungan perusahaan ke - " +(i+1) + " selama " + elm + " Bulan adalah " + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, elm-1));
        }
        System.out.println("Algoritma Divide Conquer");


    }
}
