import java.util.Scanner;
public class Bol3_Ejer9{
    /**
     * Genera una serie de resultados aleatorios como 1, X o 2
     * @return 1, 2 o X aleatoriamente
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
     * Genera resultados ponderados: 60% para 1, 25% para X y 15% para 2
     * @return resultado
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
        System.out.printf("1.  |%c|\n2.  |%c|\n3.  |%c|\n4.  |%c|\n5.  |%c|\n6.  |%c|\n7.  |%c|\n8.  |%c|\n9.  |%c|\n10. |%c|\n11. |%c|\n12. |%c|\n13. |%c|\n14. |%c|\n", resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado(), resultado());

        System.out.println("Resultado ponderado:");
        System.out.printf("1.  |%c|\n2.  |%c|\n3.  |%c|\n4.  |%c|\n5.  |%c|\n6.  |%c|\n7.  |%c|\n8.  |%c|\n9.  |%c|\n10. |%c|\n11. |%c|\n12. |%c|\n13. |%c|\n14. |%c|\n", resultadoPonderado(), resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado(),resultadoPonderado());
    }
}
