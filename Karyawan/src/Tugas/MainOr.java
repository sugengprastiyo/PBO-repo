package Tugas;
public class MainOr {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        Manusia mm = new Mahasiswa();
        Manusia md = new Dosen();
        d.infoDosen();
        System.out.println("------------------");
        m.infoMahasiswa();
        
        System.out.println("============Dynamic Mehod Dispatch=============");
        mm.makan();
        md.makan();
    }
}
