import java.util.Scanner;
public class Bol3_Ejer7 {
    /**
     * Halla el area de un rectangulo o de un triangulo rectangulo
     * @param base 
     * @param altura
     * @param flag true si calcula area de rectangulo, false si es triangulo
     * @return calculo area
     */
    static double area(double base, double altura, boolean flag){
        if(flag==true){
            return (base*altura);
        }else{
            return (base*altura/2);
        }        
    }
    /**
     * Halla area de un circulo
     * @param radio
     * @return calculo area
     */
    static double areaCirculo(double radio){
        return Math.PI*radio*radio;
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        double base;
        double altura;
        double lado;
        double radio;
        int opcion;

        System.out.println("Cálculo de áreas:");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Círculo");
        opcion=sc.nextInt();

        switch(opcion){
            case 1: //triángulo
                System.out.print("Base: ");
                base=sc.nextDouble();
                System.out.print("Altura: ");
                altura=sc.nextDouble();
                System.out.println("Área: "+area(base, altura, false));
                    break;
            case 2: //rectángulo
                System.out.print("Base: ");
                base=sc.nextDouble();
                System.out.print("Altura: ");
                altura=sc.nextDouble();
                System.out.println("Área: "+area(base, altura, true));
                    break;
            case 3: //cuadrado
                System.out.print("Lado: ");
                lado=sc.nextDouble();
                System.out.println("Área: "+area(lado, lado, true));
                    break;
            case 4: //círculo
                System.out.print("Radio: ");
                radio=sc.nextDouble();
                System.out.println("Área: "+areaCirculo(radio));                    
        }
    }
}
