package Minggu3.ArrayBalok;

public class balokMain {
    public static void main(String[] args) {
        Balok[] blArray09 = new Balok[3];

        blArray09[0] = new Balok(100, 30, 12);
        blArray09[1] = new Balok(120, 40, 15);
        blArray09[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok ke "+ i + ": " + blArray09[i].hitungVolume());
        }


    }
}
