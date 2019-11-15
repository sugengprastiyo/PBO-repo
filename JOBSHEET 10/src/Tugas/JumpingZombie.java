package Tugas;
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo()+"\n";
        info += "Jumping Zombie Info :\nHealth : "+health+"\nLevel : "+level+"\n";
        return info; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroyed() {
        super.destroyed();
        //ini adalah 10%, dan seharusnya 1%
        health = (int)(health-(health*10/100));
    }

    @Override
    public void heal() {
        super.heal();
        if(level == 1){
            health = (int)(health+(health*0.3));
        }else if(level == 2){
            health = (int)(health+(health*0.4));
        }else if(level == 3){
            health = (int)(health +(health*0.5));
        }else{
            System.out.println("Max Level is Level 3");
        }
    }
    
    
}
