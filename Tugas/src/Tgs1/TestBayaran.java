package Tgs1;
public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 100, 60);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran manajer: "+hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer: "+ hr.hitungBayaran(prog));
    }
}
