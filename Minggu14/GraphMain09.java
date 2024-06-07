package Minggu14;

import java.util.Scanner;

public class GraphMain09 {
    public static void main(String[] args) throws Exception {
        Graph09 gedung = new Graph09(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        Scanner sc09 = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan gedung asal : ");
            int asal = sc09.nextInt();
            if (asal == -1) {
                break;
            }

            System.out.print("Masukkan gedung tujuan : ");
            int tujuan = sc09.nextInt();

            if (gedung.apkhTetangga(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' +asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' +asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");

            }
        }
    }
}
