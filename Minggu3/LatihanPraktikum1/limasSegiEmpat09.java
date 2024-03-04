package Minggu3.LatihanPraktikum1;
class limasSegiEmpat09{
    public double panjangSisiAlas;
    public double tinggiLimas;


    public double hitungLuasPermukaanLimas() {
        return 4 * panjangSisiAlas + (panjangSisiAlas * panjangSisiAlas);
    }

    public double hitungVolumeLimas() {
        return (1.0 / 3.0) * (panjangSisiAlas * panjangSisiAlas) * tinggiLimas;
    }
}