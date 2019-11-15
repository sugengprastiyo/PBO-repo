package Tugas;
public class Mahasiswa extends Manusia{
    
    public void makan(){
        super.makan();
        System.out.println("Porsi Mahasiswa");
    }
    public void tidur(){
        System.out.println("Mahasiswa Tidur");
    }
    
    public void infoMahasiswa(){
        System.out.println("Mahasiswa");
        System.out.println("======================");
        this.bernafas();
        this.makan();
        this.tidur();
    }
}
