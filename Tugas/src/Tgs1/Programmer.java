package Tgs1;
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return gaji; //To change body of generated methods, choose Tools | Templates.
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String getNama() {
        return super.getNama(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
