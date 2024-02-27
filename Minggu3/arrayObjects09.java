package Minggu3;

public class arrayObjects09 {
    public static void main(String[] args) {
        persegiPanjang[] ppArray09 = new persegiPanjang[3];

        ppArray09[0] = new persegiPanjang();
        ppArray09[0].panjang = 110;
        ppArray09[0].lebar = 30;

        ppArray09[1] = new persegiPanjang();
        ppArray09[1].panjang = 80;
        ppArray09[1].lebar = 40;

        ppArray09[2] = new persegiPanjang();
        ppArray09[2].panjang = 100;
        ppArray09[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray09[0].panjang+ ", lebar: " + ppArray09[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray09[1].panjang+ ", lebar: " + ppArray09[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray09[2].panjang+ ", lebar: " + ppArray09[2].lebar);



    }
}
