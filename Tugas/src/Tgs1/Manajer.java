package Tgs1;
public class Manajer extends Pegawai {
    private int tunjangan;


    public Manajer(String nama, int gaji,int tunjangan) {
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji(){
        return gaji; //To change body of generated methods, choose Tools | Templates.
    }

    public int getTunjangan() {
        return tunjangan;
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
