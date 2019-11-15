package Tgs2;
public class TelevisiModern extends Elektronik{
private String modelInput;

    public TelevisiModern() {
        this.voltase = 220;
        this.modelInput = "HDMI";
    }

    public String getModelInput() {
        return modelInput;
    }

}
