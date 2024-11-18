package logicaNegocio;

public class Perro extends Animal {
        // TODO: Aquí va tu código

    private final TipoHabitat habitat;

    public Perro (){
     this.habitat = TipoHabitat.TERRESTRE;
    }
    
    public String emitirsonido(){
    return "Ladrido";
    }
    // TODO: Aquí va tu código

    public String obtenerdieta() {
        return "Onmivoro";
    }
    public String interactuarConHumano(){
      System.out.println("El perro mueve la cola y ladra con felicidad");
        return null;
    }
  
    }

