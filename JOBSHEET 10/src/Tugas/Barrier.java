package Tugas;
public class Barrier implements Destroyable{
   private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void destroyed(){
        strength = (int)(strength-(strength*0.10));
    }
   public String getBarrierInfo(){
       return "Barrier Info : \nStrength : "+getStrength()+"\n";
   }
}
