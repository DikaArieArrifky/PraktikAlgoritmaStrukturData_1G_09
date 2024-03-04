package Minggu3.LatihanPraktikum1;

class kerucut09  {
    public double jariJariKerucut;
    public double tinggiKerucut;
    
    public double hitungVolumeKerucut() {
        return (1.0 / 3.0) * Math.PI * jariJariKerucut * jariJariKerucut * tinggiKerucut;
    }

    public double hitungLuasPermukaanKerucut() {
        double sisiMiring = Math.sqrt(jariJariKerucut * jariJariKerucut + tinggiKerucut * tinggiKerucut);
        return Math.PI * jariJariKerucut * (jariJariKerucut + sisiMiring);
    }
}