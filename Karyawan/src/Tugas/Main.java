package Tugas;
public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut = "+s.totalSudut(30));
        System.out.println("Total Sudut = "+s.totalSudut(30, 20));
        System.out.println("Keliling = "+s.keliling(15, 20, 30));
        System.out.println("Pythagoras = "+s.pythagoras(3, 4));
    }
}
