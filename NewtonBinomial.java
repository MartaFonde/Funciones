import java.util.Scanner;
public class Bol3_Ejer8 {

    /**
     * Realiza factorial de un numero
     * @param num numero factorial
     * @return resultado
     */
    static int factorial (int num){
        int factorialNum=1;
        for(int i=1; i<=num; i++){
            factorialNum*=i;
        }
        return factorialNum;
    }
    /**
     * Calcula el binomio de Newton 
     * @param m coeficiente
     * @param n coeficiente
     * @return resultado de la fórmula
     */
    static int binomioNewton (int m, int n){
        int binomio=0;
        if(m>0 && n>0 && m>=n){
            binomio=factorial(m)/(factorial(n)*factorial(m-n));
        }     
        return binomio;
    }

    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        int num;
        int n, m;

        System.out.println("Introduce un número");
        num=sc.nextInt();
        System.out.printf("Factorial: %d\n", factorial(num));
        
        System.out.println("Introduce m y n");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Coeficiente binomio de Newton: "+binomioNewton(m, n));
    }
}
