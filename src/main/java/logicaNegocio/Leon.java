package logicaNegocio;

public class Leon extends Animal{

    private final TipoHabitat habitat;
    public Leon(){
    this.habitat = TipoHabitat.TERRESTRE;
    }
    
    public String emitirsonido(){
    return "Rugido";
    }
    // TODO: Aquí va tu código

    public String obtenerdieta() {
        return "Carnivoro";
    }
    
    
    
    
}
