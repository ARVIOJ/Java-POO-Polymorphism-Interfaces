
class VideoJuego implements juego,Software{
    
    private String nombre;
    private String lenguaje;
    private int puntosIniciales;
    
    public VideoJuego(String nombre, String lenguaje, int puntosIniciales){
    this.nombre = nombre;
    this.lenguaje = lenguaje;
    this.puntosIniciales = puntosIniciales;
 
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public int calculaPuntos(){
        return puntosIniciales;
    }
    
    @Override
    public String muestraLenguaje(){
        return lenguaje;
    }
    
}
