import java.util.Scanner;
public class Bol3_Ejer2 {

    /**
     * Funcion que analiza si un año es bisiesto o no lo es
     * 
     * @param año a evaluar si es bisiesto o no
     * 
     * @return la funcion devuelve true si el año es bisiesto y false si no lo es
    */
    

    static boolean bisiesto (int año) {
        return año%4==0 && año%100!=0  || año%400==0;
    }

    // static boolean bisiesto (int año) {
       // if (año%4==0 && año%100!=0  || año%400==0){
         //   return true;
      //  } else {
        //    return false;
       // }

    public static void main (String[] args) {
        Scanner sc=new Scanner (System.in);
        int año;
        boolean añoBis;
        
        do {
        System.out.println("Escribe un año bisiesto");
        año=sc.nextInt();

        if (año>0) {
            añoBis=bisiesto(año);
            System.out.println(añoBis);                
        }       
        } while (año!=0);
        
    }
}
