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
     * Compara dos números obligando a que sean distintos
     * @param n1 numero introducido 
     * @param n2 ultimo numero introducido 
     * @return numero distinto al otro introducido
     */
    static int comparacionNumeros(int n1, int n2) {
        Scanner sc=new Scanner(System.in);
        do{
            if(n1==n2){
                System.out.println("Números iguales. Vuelve a introducir el último número");
                n2=sc.nextInt();
            }
        }while(n1==n2);
        return n2;

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
        int numAleatorio=0;
        int numAleatorio2=0;
        for(int x=1; x<=2; x++){
            if(x==1){
                numAleatorio=numeroAleatorio();
                if(num1==numAleatorio || num2==numAleatorio || num3==numAleatorio)
                    aciertos++;
            }
            if(x==2){
                do{
                    numAleatorio2=numeroAleatorio();
                } while(numAleatorio2==numAleatorio);
                if(num1==numAleatorio2 || num2==numAleatorio2 || num3==numAleatorio2)
                    aciertos++;
            }
        } 
        System.out.printf("Los números a adivinar eran %d y %d\n", numAleatorio, numAleatorio2);
        System.out.println("Número de aciertos: "+aciertos);
    }

    public static void main(String[] args){
        int num1=0, num2=0, num3=0;

        num1=introduccionNumeros(num1);
        num2=introduccionNumeros(num2);
        num2=comparacionNumeros(num1, num2);
        num3=introduccionNumeros(num3);
        do{
            num3=comparacionNumeros(num2, num3);
            num3=comparacionNumeros(num1, num3);  
        }while(num3==num1 || num3==num2);
        
        aciertos(num1, num2, num3);
    }
}
