import java.util.Scanner;
public class Bol3_Ejer5{
    /**
     * Evalúa si un número es primo o no lo es
     * @param n numero a evaluar
     * @param numPrimo modifica true por false en cuanto detecta que el numero no es primo
     * @return true si es primo, false si no lo es
     */
    static boolean numeroPrimo (int n) {
        boolean numPrimo=true;
        for(int i=n-1; i>1; i--){
            if(n%i==0){
                numPrimo=false;
            }
        }
        return numPrimo;
    } 

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;

        System.out.println("Escribe un número primo");
        n=sc.nextInt();
        System.out.println(numeroPrimo(n));

        for(int j=n-1; j>1; j--){
            if(numeroPrimo(j)==true){
                System.out.println(j);
            }   
        }
    }
}
