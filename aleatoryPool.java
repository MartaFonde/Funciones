import java.util.Scanner;
public class Bol3_Ejer9{
    /**
     * Genera una serie de resultados aleatorios como 1, X o 2
     * @return devuelve 1, 2 o X aleatoriamente
     */
    static char resultado(){
        int n=(int)(Math.random()*3+1); 
        if (n==2)
            return 'X';
        if(n==1){
            return '1';
        }else{
            return '2';
        }
    }
    /**
     * Genera resultados aleatorios ponderados
     * @return muestra 1 con probabilidad 60%, X con probabilidad 25% y 2 con probabilidad 15% 
     */
    static char resultadoPonderado(){
        int n=(int)(Math.random()*100+1); 
        if (n<=60)
            return '1';
        if(n>=61 && n<=85){
            return 'X';
        }else{
            return '2';
        }
    }
    public static void main(String[] args){
        for(int x=1; x<=14; x++){
            System.out.printf("%d.%s  |%c|\n", x, x<10? " ":"",resultado());
        }
        System.out.println("Resultado ponderado:");
        for(int x=1; x<=14; x++){
            System.out.printf("%d.%s  |%c|\n", x, x<10? " ":"", resultadoPonderado());   
        }
    }
}
