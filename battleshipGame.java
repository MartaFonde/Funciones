import java.util.Scanner;
public class Bol3_Ejer12 {
    /**
     * Genera una letra de A-J aleatoria
     * @return letra de A a J aleatoria
     */
    static char coordCpuLetra(){
        return (char)(Math.random()*10+'A');
    }

    /**
     * Genera un numero de 1-10 aleatorio
     * @return numero de 1 al 10 aleatorio 
     */
    static int coordCpuNumero(){
        return (int)(Math.random() *10+1); 
    }

    /**
     * Pide introducir una letra en intervalo abierto A-J.
     * @return letra introducida
     */
    static char coordUsuarioLetra(){
        Scanner sc=new Scanner(System.in);
        String coordUsuarioLetraString;
        char coordUsuarioLetra;
        do{
            System.out.print("Introduce coordenada columna A-J(letra): ");
            coordUsuarioLetraString=sc.nextLine().toUpperCase();
            coordUsuarioLetra=coordUsuarioLetraString.charAt(0);
            if(coordUsuarioLetra<'A'|| coordUsuarioLetra>'J'){
                System.out.println("¡Error!");
            }
        }while(coordUsuarioLetra<'A' || coordUsuarioLetra>'J');
        return coordUsuarioLetra;
    }

    /**
     * Pide introducir un número en intervalo 1-10.
     * @return número introducido
     */
    static int coordUsuarioNumero(){
        Scanner sc=new Scanner(System.in);
        int coordUsuarioNum;
        do{
            System.out.print("Introduce coordenada fila 1-10(número): ");
            coordUsuarioNum=sc.nextInt(); 
            if(coordUsuarioNum>10 || coordUsuarioNum<1){
                System.out.println("¡Error!");
            }
        }while(coordUsuarioNum>10 || coordUsuarioNum<1);
        return coordUsuarioNum; 
    }

    /**
     * Pide introducir una coordenada (letra, número). Comprueba si es igual que una dada.
     * @param barcoCpuLetra coordenada letra dada
     * @param barcoCpuNumero coordenada número dada
     * @return true si es igual a la coordenada dada, false si no lo es.
     */
    static boolean lanzamientoUsuario(char barcoCpuLetra, int barcoCpuNumero){
        char lanzamientoLetra;
        int lanzamientoNumero;
        System.out.println("--Lanzamiento usuario--");
        lanzamientoLetra=coordUsuarioLetra();
        lanzamientoNumero=coordUsuarioNumero();
        System.out.printf("(%c, %d)\n", lanzamientoLetra, lanzamientoNumero);
        if(comprobacionCoordenadas(lanzamientoLetra, lanzamientoNumero, barcoCpuLetra, barcoCpuNumero)){
            System.out.println("¡El jugador ha ganado!");
            return true;
        }else{
            return false;
        }
    }

    /**
     * Genera una coordenada (letra, número) aleatoria y la muestra. Comprueba si es igual a una dada.
     * @param barcoUsuarioLetra coordenada letra dada
     * @param barcoUsuarioNumero coordenada número dada
     * @return true si es igual a la coordenada dada, false si no lo es.
     */
    static boolean lanzamientoCpu (char barcoUsuarioLetra, int barcoUsuarioNumero){
        char lanzamientoLetra;
        int lanzamientoNumero;
        System.out.println("--Lanzamiento Cpu--");
        lanzamientoLetra=coordCpuLetra();
        lanzamientoNumero=coordCpuNumero();
        System.out.printf("(%c, %d)\n", lanzamientoLetra, lanzamientoNumero);
        if(comprobacionCoordenadas(lanzamientoLetra, lanzamientoNumero, barcoUsuarioLetra, barcoUsuarioNumero)){
            System.out.println("¡La CPU ha ganado!");
            return true;
        }else{
            return false;
        }
    }

    /**
     * Comprueba si los parámetros dados son iguales dos a dos.
     * @param letra letra dada
     * @param numero numero dado
     * @param barcoLetra letra dada
     * @param barcoNumero numero dado
     * @return true si letra es igual a barcoLetra y numero es igual a barcoNumero, false si ambos no lo son.
     */
    static boolean comprobacionCoordenadas(char letra, int numero, char barcoLetra, int barcoNumero){
        return letra==barcoLetra && numero==barcoNumero;
    }

    public static void main(String[] args){
        int barcoCpuNumero;
        char barcoCpuLetra;
        int barcoUsuarioNumero;
        char barcoUsuarioLetra;

        barcoCpuLetra=coordCpuLetra();
        barcoCpuNumero=coordCpuNumero();
        System.out.println("Barco usuario");
        barcoUsuarioLetra=coordUsuarioLetra();
        barcoUsuarioNumero=coordUsuarioNumero();
        System.out.println("---Comienza el juego---");

        while(lanzamientoUsuario(barcoCpuLetra, barcoCpuNumero)==false && lanzamientoCpu(barcoUsuarioLetra, barcoUsuarioNumero)==false);    

        
    }
}
