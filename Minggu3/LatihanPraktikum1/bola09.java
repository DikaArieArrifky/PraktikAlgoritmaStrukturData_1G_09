package Minggu3.LatihanPraktikum1;

class bola09 {
    public double jariJari;


    public double hitungLuasPermukaanBola() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
