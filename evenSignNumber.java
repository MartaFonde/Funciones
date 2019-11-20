import java.util.Scanner;
public class Bol3_Ejer1 {
/**
 * Imprime en pantalla N lineas en blanco 
 * @param N Especifica numero de lineas
 */
    static void lineasBlanco (int n) {
        for(int i=1; i<=n; i++) {
            System.out.print(" \n");
        }       
    }
/**
 * 
 * Analiza si un numero entero es par 
 * @param num validar si es entero
 * @return Devuelve true si el parametro es numero par y false si no lo es
 */
    static boolean par (int num) {
        return(num%2==0? true: false);
    }
    // variables booleanas, son resultado de una operación lógica que da valores true o false

/**
 * Evalua si un numero entero es par o impar 
 * @param num a evaluar signo
 * @return devuelve la letra P si el numero es positivo y la letra N si el numero es cero o negativo
 */
    static char signo (int num) {
        return (num>0? 'P': 'N');             
    }

    public static void main (String args[]) {   
        Scanner sc=new Scanner(System.in);
        int n;
        int num;
        boolean numPar;
        char numSigno;

        System.out.println("¿Cuántas líneas en blanco quiere imprimir?");
        n=sc.nextInt();
        lineasBlanco(n);    //lineasBlanco(sc.nextInt()); sin int=N en main

        System.out.println("Escribe un número par");
        num=sc.nextInt();
        numPar=par(num);
        numSigno=signo(num);
        
        System.out.println(numPar);
        System.out.println(numSigno);

    }        
    
} 
