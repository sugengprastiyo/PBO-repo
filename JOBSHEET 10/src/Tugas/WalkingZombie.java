package Tugas;
public class WalkingZombie extends Zombie{

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    public void heal(){
        super.heal();
        if(level == 1){
            health = (int)(health+(health*0.2));
        }else if(level ==2){
            health = (int)(health + (health*0.3));
        }else if(level == 3){
            health = (int)(health+(health*0.2));
        }
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo()+"\n";
        info += "Walking Zombie Info :\nHealth :"+health+"\nLevel : "+level;
        return info; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroyed() {
        super.destroyed();
        //ini adalah 20%, dan seharusnya 2%
        health = (int)(health-(health*20/100));
//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
