package pbominggu9.interfac;
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        
        //pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        
    }
}
