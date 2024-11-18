package logicaNegocio;

public class Delfin extends Animal {

    private final TipoHabitat habitat;
    // TODO: Aquí va tu código
    public Delfin(){
    this.habitat = TipoHabitat.ACUATICO;
    }
    
    public String emitirsonido(){
    return "Chirrido";
    }
    // TODO: Aquí va tu código

    public String obtenerdieta() {
        return "Pescado";
    }
    
}
