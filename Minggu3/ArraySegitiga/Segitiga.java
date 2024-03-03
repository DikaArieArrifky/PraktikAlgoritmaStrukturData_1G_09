package Minggu3.ArraySegitiga;
import java.lang.Math;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungVolume(){
        return  0.5 * alas *tinggi;
    }
    
    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas, 2)+ Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}
