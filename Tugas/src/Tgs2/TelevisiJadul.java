package Tgs2;
public class TelevisiJadul extends Elektronik {
private String modelInput;

    public TelevisiJadul() {
        this.voltase = 220;
        this.modelInput = "DVI";
    }

    public String getModelInput() {
        return modelInput;
    }
}
