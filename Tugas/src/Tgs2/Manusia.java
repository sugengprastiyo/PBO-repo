package Tgs2;
public class Manusia {
    public void nyalakanPerangkat(Elektronik el){
       if(el instanceof TelevisiJadul){
           System.out.println("Nyalakan Televisi Jadul dengan input = "+((TelevisiJadul)el).getModelInput());
    }else if(el instanceof TelevisiModern){
        System.out.println("Nyalakan Televisi Modern dengan input = "+((TelevisiModern)el).getModelInput());
    }else{
           System.out.println("Televisi tidak ada");
    }
        System.out.println("Voltase Telvisi : "+el.getVoltase());
    }
}
