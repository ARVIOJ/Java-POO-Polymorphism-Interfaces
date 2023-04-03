import java.util.Scanner;

public class main {
    
    public static void main(String[] args){
    
    Scanner ent = new Scanner(System.in);
    
    String nombre, lenguaje;
    int puntos;
    
    VideoJuego[] juegos;
    juegos = new VideoJuego[3];
    
    nombre = ent.next();
    lenguaje = ent.next();
    puntos = ent.nextInt();
    VideoJuego j1 = new VideoJuego(nombre,lenguaje,puntos);
    nombre = ent.next();
    lenguaje = ent.next();
    puntos = ent.nextInt();
    VideoJuego j2 = new VideoJuego(nombre,lenguaje,puntos);
    nombre = ent.next();
    lenguaje = ent.next();
    puntos = ent.nextInt();
    VideoJuego j3 = new VideoJuego(nombre,lenguaje,puntos); 
    
    juegos[0] = j1;
    juegos[1] = j2;
    juegos[2] = j3;
    
    
    for(VideoJuego i: juegos)
    System.out.printf("El juego %s está programado en %s y tiene %d puntos\n", i.getNombre(), i.muestraLenguaje(), i.calculaPuntos());
    }
    
}
