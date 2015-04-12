package modelos;
import java.util.Random;
    public class Guerrero extends Personaje {
static public final int guillotinaProb=5;
    public Guerrero(int pt_vida, int pt_ataque, String pt_nombre) {
        super(pt_vida, pt_ataque, pt_nombre);
    }

    @Override
    public void atacar(Personaje objetivo) {
        
        if(objetivo != null && !objetivo.equals(this) &&objetivo instanceof  Aldeano){
        Random rand = new Random();
        int randomNum = rand.nextInt((10-1 )+1)+1;
        if (randomNum == guillotinaProb){
        objetivo.setPt_vida(0);
            }
        else{
        super.atacar(objetivo);
        }
        }
    }
    }
        