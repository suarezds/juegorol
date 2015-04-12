/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

public class Personaje {
    
    static public final int vidaMax = 100;

   private int pt_vida;
   private int pt_ataque;
   private String pt_nombre;

    public Personaje(int pt_vida, int pt_ataque, String pt_nombre) {
        this.pt_vida = pt_vida;
        this.pt_ataque = pt_ataque;
        this.pt_nombre = pt_nombre;
    }
   
   
   

    public int getPt_vida() {
        return pt_vida;
    }

    public void setPt_vida(int pt_vida) {
        this.pt_vida = pt_vida;
        if (pt_vida < 0){
            pt_vida = 0;
        }
    }

    public int getPt_ataque() {
        return pt_ataque;
    }

    public void setPt_ataque(int pt_ataque) {
        this.pt_ataque = pt_ataque;
    }

    public String getPt_nombre() {
        return pt_nombre;
    }

    public void setPt_nombre(String pt_nombre) {
        this.pt_nombre = pt_nombre;
    }
   
    public void atacar(Personaje objetivo){
        if(objetivo!=null && !objetivo.equals(this) &&objetivo.getPt_vida()!=0){{
            objetivo.setPt_vida(objetivo.getPt_vida()-this.getPt_vida());
        }}
    }
}
