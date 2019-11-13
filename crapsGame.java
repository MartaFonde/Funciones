import java.util.Scanner;
public class Bol3_Ejer11 {
    /**
     * Tirada de dos dados de seis caras, muestra sus valores en pantalla.
     * @return suma de las dos tiradas de dados
     */
    static int tirada() {
        int dado;
        int suma=0;
        for(int x=0; x<2; x++){
            dado=(int)(Math.random()*6+1);
            System.out.println(dado);
            suma+=dado;
        }
        System.out.println("Suma: "+suma);
        return suma;        
    }
    /**
     * Compara un valor dado con una serie de parámetros del juego
     * @param puntuacionJugador valor dado
     * @return devuelve 0 si el numero introducido es igual a 7 ó 11,
     * devuelve -1 si es igual a 2, 3 ó 12. En los demás casos, devuelve el mismo valor.
     */
    static int comprobacion(int puntuacionJugador){
        if (puntuacionJugador==7 || puntuacionJugador==11){
            System.out.println("El jugador gana");
            return 0;
        } else if(puntuacionJugador==2||puntuacionJugador==3||puntuacionJugador==12){
            System.out.println("Craps. La CPU gana");
            return -1;
        } else {
            return puntuacionJugador;
        }
    }
    public static void main (String[] args){
        int puntuacionCpu;
        int puntuacionJugador;
        System.out.println("Turno jugador");
        puntuacionJugador=tirada();

        switch(comprobacion(puntuacionJugador)){
            case 0: //el jugador gana
                break;
            case -1: //CPU gana
                break;
            default:
                System.out.println("Turno Cpu");
                puntuacionCpu=tirada();
                if(puntuacionCpu==puntuacionJugador) {
                    System.out.println("Empate");
                } else if(puntuacionCpu>puntuacionJugador){
                    System.out.println("CPU gana");
                } else {
                    System.out.println("El jugador gana");
                }     
        }
    }
}
    


