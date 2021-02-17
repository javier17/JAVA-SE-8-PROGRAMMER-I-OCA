package mx.com.hittechs.var.args;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class VarArgsTest {

    public static double average (double  s1, double s2){
        return (s1 + s2) / 2;
    }
    
    public static double average (double s1, double s2, double s3){
        return (s1 + s2 + s3) / 3;
    }
    
    /**
     * REGLA PARA ARGUMENTOS VARIABLES
     * SOLO ES POSIBLE TENER UN ATGUMENTO VARIABLE
     * SE PUEDE COMBINAR UN ARGUMENTO VARIABLES CON ARGUMENTOS NO VARIABLES
     * OJO: LOS ARGUMENTOS VARIABLES SE DEBEN DE DEFINIR AL FINAL
     * 
     * EJEMPLO:
     * 
     * average (int i , String b, double ... s4)
     * 
     */
    
    public static double average (double ... s4){
        double suma = 0.0;
        for (double value : s4) {
            suma += value;
        }
        return suma / s4.length;
    }
    
    public static void main(String[] args) {
        System.out.println("Resoult: "+average(8.5, 9.3, 9.8));
        System.out.println("Resoult: "+average(8.5, 9.3, 9.8, 5.0, 6.8));
        
        double [] scores = {8.5, 9.3, 9.8, 5.0, 6.8};
        System.out.println("Resoult: "+ average(scores));
    }
    
    
}
