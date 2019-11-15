package Tugas;
public class Dosen extends Manusia{
  
    @Override
    public void makan(){
        super.makan();
        System.out.println("Porsi Dosen");
    }
    
    public void lembur(){
        System.out.println("Dosen lembur");
    }
    
    public void infoDosen(){
        System.out.println("Dosen");
        System.out.println("==================");
        this.bernafas();
        this.makan();
        this.lembur();
    }
}
