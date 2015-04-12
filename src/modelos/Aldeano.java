
package modelos;

    public class Aldeano extends Personaje {

        public Aldeano(int pt_vida, int pt_ataque, String nombre){
            super(pt_vida, pt_ataque, nombre);
        }
        
    @Override
    public void setPt_vida(int pt_vida) {
        super.setPt_vida(pt_vida); 
    
    if(this.getPt_vida()>0 && this.getPt_vida()<=20){
    this.setPt_ataque(this.getPt_ataque()*4);
    }
    
    }
    
        
        
    }
