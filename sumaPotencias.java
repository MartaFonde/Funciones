import java.util.Scanner;
public class Bol3_Ejer4{

/**
 * Suma de potencias con la misma base y exponente creciente
 * @param x base de la potencia
 * @param base máximo exponente de la serie
 * @return suma de las potencias
 */
  static double progresion (double base, int n){
    double suma=1;
    for(int exponente=1; exponente<=n; exponente++)
      suma+=funcionPotencia.potencia(base, exponente);
    return suma;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double base;
    int n;

    System.out.print("Base: ");
    base=sc.nextDouble();
    sc.nextLine();
    System.out.print("Máximo exponente: ");
    n=sc.nextInt();
    sc.nextLine();
    System.out.println("Suma potencias: "+progresion(base,n));
  }
}
