package logicaNegocio;

import java.util.logging.Logger;

public abstract class Animal {
    
    protected TipoHabitat habitat;
    // TODO: Aquí va tu código
   public abstract String emitirsonido();
   public abstract String obtenerdieta();
   
  
     public TipoHabitat getHabitat(){
    return habitat;
    }
  
   
}
