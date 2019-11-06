import java.util.Scanner;
public class Bol3_Ejer3 {
    
/**
 * Calcula la potencia de un número. Multiplica un número por si mismo varias veces. 
 * @param base factor que se repite 
 * @param exponente número de veces que se repite el factor
 * Si es un número negativo se parte de la inversa del número elevado al mismo exponente pero positivo
 * @return producto de factores iguales
 */
    static double potencia (double base, int exponente) { 
        double resPotencia=1;
        if (exponente>0){
            for(int cont=1; cont<=exponente; cont++)
                resPotencia*=base;
        } else {
            for(int cont=1; cont<=-exponente; cont++) 
                resPotencia*=(1/base);
        }       
        return resPotencia;
    }
    /**
     * Muestra en pantalla las N primeras potencias de un número
     * @param N número de potencias a mostrar
     * @param base factor que se repite
     */
    static void anterioresPotencias (int N, double base) {
        if (N>0) {
          for(int exponente=0; exponente<N; exponente++)
            System.out.println(potencia(base, exponente));  
        } else {
            for(int exponente=N; exponente<=0; exponente++)
                System.out.println(potencia(base, exponente));
        }
    }
        
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double base;
        int exponente;

        System.out.print("Base: ");
        base=sc.nextDouble();
        System.out.print("Exponente: "); 
        exponente=sc.nextInt();

        System.out.println(base+"^"+exponente+" = "+potencia(base, exponente));
        //System.out.printf("Potencia: %.2f", potencia(base, exponente));
        int N=exponente;
        anterioresPotencias(N, base);
    }
}
