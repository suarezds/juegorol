
package modelos;


public class Mago extends Personaje {
private int  healPower;
    public Mago(int pt_vida, int pt_ataque, String pt_nombre, int healPower) {
        super(pt_vida, pt_ataque, pt_nombre);
        healPower=healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }
    
    
    public void heal (Personaje objetivo){
    if(objetivo!=null &&  objetivo.getPt_vida()>0 && objetivo.getPt_vida() < Personaje.vidaMax ){{
            objetivo.setPt_vida(objetivo.getPt_vida()+ this.healPower);
        }
    }

    }
}