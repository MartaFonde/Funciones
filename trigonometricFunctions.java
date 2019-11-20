import java.util.Scanner;
public class Bol3_Ejer13 {
    /**
     * Calcula la tangente de un ángulo
     * @param angulo angulo dado en radians
     * @return tangente
     */
    static double tangente (double angulo){
        return Math.sin(angulo)/Math.cos(angulo);
    }

    /**
     * Convierte un dato dado en grados a radientes
     * @param grados dato dado en grados
     * @return dato convertido a radianes
     */
    static double conversionGradosARadianes (double grados){
        return grados*Math.PI/180;
    }

    /**
     * Pide ángulo, convierte en radianes si es dado en grados, 
     * y calcula seno, coseno y tangente del ángulo
     * @param opcion determina si trabajamos en radianes o grados
     */
    static void funcionesTrigonometricas(int opcion){
        Scanner sc=new Scanner(System.in);
        double angulo;
        int opcion2;
        double grados;
        do{
            System.out.println("---Menú de opciones---");
            System.out.println("1. Seno");
            System.out.println("2. Coseno");
            System.out.println("3. Tangente");
            System.out.println("4. Salir");
            opcion2=sc.nextInt();

            if(opcion2!=4){
                System.out.print("Ángulo: ");
                angulo=sc.nextDouble();
                if (opcion==1){
                    grados=angulo;
                    angulo=conversionGradosARadianes(grados);
                }
                switch(opcion2){
                    case 1: //sin                    
                        System.out.printf("Seno= %.4f\n\n",Math.sin(angulo));
                            break;
                    case 2: //cos
                        System.out.printf("Coseno= %.4f\n\n",Math.cos(angulo));
                            break;    
                    case 3: //tan
                        System.out.printf("Tangente= %.4f\n\n",tangente(angulo));
                } 
            }  
        }while(opcion2!=4);     
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int opcion;

        System.out.println("----Elige unidad del ángulo----");
        System.out.println("1. Grados");
        System.out.println("2. Radianes");
        opcion=sc.nextInt();
        
        funcionesTrigonometricas(opcion);
         
    } 
}
