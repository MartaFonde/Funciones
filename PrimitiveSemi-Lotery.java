import java.util.Scanner;
public class Bol3_Ejer10{
    /**
     * Pide introducir un número entre 1-20
     * @param num numero a introducir
     * @return numero validado
     */
    static int introduccionNumeros(int num){
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Introduce un número entre 1 y 20");
            num=sc.nextInt();
            if(num<1 || num>20){
                System.out.println("¡Error!");
            }
        } while (num<1 || num>20);
        return num;
    }

    /**
     * Saca un numero aleatorio entre 1 y 20
     * @return numero aleatorio
     */
    static int numeroAleatorio(){
        return (int)(Math.random()*20+1);
    }

    /**
     * Indica al usuario si el numero introducido es igual a un aleatorio
     * @param num1 numero introducido 
     * @param num2 numero introducido 
     * @param num3 numero introducido 
     */
    static void aciertos(int num1, int num2, int num3){
        int aciertos=0;
        int numAleatorio;
        for(int x=1; x<=2; x++){
            numAleatorio=numeroAleatorio();
            if(num1==numAleatorio || num2==numAleatorio || num3==numAleatorio){
                aciertos++;
            }
            System.out.println("El número a adivinar era: "+numAleatorio);
        } 
        System.out.println("Número de aciertos: "+aciertos);
    }

    public static void main(String[] args){
        int num1=0, num2=0, num3=0;
        do{
            num1=introduccionNumeros(num1);
            num2=introduccionNumeros(num2);
            num3=introduccionNumeros(num3);  
            if (num1==num2||num2==num3||num1==num3){
                System.out.println("Error. Números iguales. Vuelve a introducir los números");
            }
        }while(num1==num2||num2==num3||num1==num3);
        aciertos(num1, num2, num3);
    }
}
