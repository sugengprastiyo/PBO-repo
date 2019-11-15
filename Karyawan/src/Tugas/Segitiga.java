package Tugas;
import java.lang.Math;
public class Segitiga {
    private int sudut;
    private double keliling;

    
    public int totalSudut(int sudutA){
        return sudut= (180 - sudutA); 
    }
    
    public int totalSudut(int sudutA, int sudutB){
        return  (180 - (sudutA + sudutB));
        
    }
    
    public double keliling(int sisiA, int sisiB, int sisiC){
        return  (sisiA + sisiB + sisiC);
        
    }
    
    public double pythagoras(int sisiA, int sisiB){
        double pythagoras;
        return pythagoras = Math.sqrt((sisiA*sisiA)+(sisiB*sisiB));
        
    }
}