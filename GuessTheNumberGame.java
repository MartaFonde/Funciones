import java.util.Scanner;
public class Bol3_Ejer6{

    static int comparacionNumeros (int num1, int num2){
        if (num1<num2){
            return 0;
        }
        if (num1==num2) {
            return 1;
        } else {
            return 2;
        }
    }

    static int introduccionDatos (int num) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Escribe un número entre 1 y 100");
            num=sc.nextInt();
            if(num<1 || num>100) {
                System.out.println("Error. Escribe un número entre 1 y 100");
                num=sc.nextInt(); 
            }       
        } while (num<1 || num>100);
        return num;
    }
        

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int opcion2=0;
        int num1=0;
        int num2=0;
        int opcion=0;

        do{
            System.out.println("~ ~ ~ Adivina un número ~ ~ ~");
            System.out.println("1. Un jugador");
            System.out.println("2. Dos jugadores");
            opcion=sc.nextInt();

            switch(opcion){
                case 1: //Un jugador
                    num1=(int)(Math.random()*100+1);

                    for(int intento=1; intento<=5; intento++) {
                        num2=introduccionDatos(num2);
                        switch (comparacionNumeros(num1, num2)){
                            case 0: //num1<num2
                                    System.out.println("Más bajo");
                                    System.out.println("Número de intentos restantes: "+(5-intento)); 
                                        break;
                               
                            case 1: //num1==num2
                                    System.out.println("¡Has acertado!");
                                    intento=5; 
                                        break;                   
                
                            case 2: //num1>num2
                                    System.out.println("Más alto");
                                    System.out.println("Número de intentos restantes: "+(5-intento));                                                                       
                        }              
                    }
                    if (num1!=num2){
                        System.out.println("¡Ohhh, has perdido!\nEl número a adivinar era: "+num1);
                    } 
                break;
                
                case 2: //Dos jugadores 
                    num1=introduccionDatos(num1);
                    System.out.print("\u001b[2J\u001b[H");
                    
                    for(int intento=1; intento<=5; intento++) {
                        num2=introduccionDatos(num2);
                        switch (comparacionNumeros(num1, num2)){
                            case 0: //num1<num2
                                    System.out.println("Más bajo");
                                    System.out.println("Número de intentos restantes: "+(5-intento)); 
                                        break;
                               
                            case 1: //num1==num2
                                    System.out.println("¡Has acertado!");
                                    intento=5; 
                                        break;                   
                
                            case 2: //num1>num2
                                    System.out.println("Más alto");
                                    System.out.println("Número de intentos restantes: "+(5-intento));                               
                        }   
                    }  
                    if (num1!=num2){
                        System.out.println("¡Ohhh, has perdido!\nEl número a adivinar era: "+num1);
                    }        

            }
                System.out.println("------");
                System.out.println("Menú de opciones");
                System.out.println("1. Jugar otra partida");
                System.out.println("2. Terminar el programa");
                opcion2=sc.nextInt();
        } while(opcion2==1);
    }
}
