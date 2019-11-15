package Tgs2;
public class Main {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvjadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();
        
        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat (tvmodern);
    }
}
