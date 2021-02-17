package mx.com.hittechs.overloading;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class OverLoadingTest {

    /**
     * 
     * TIPO DE DATOS
     * CANTIDAD DE PARÁMETROS
     * ORDEN DE PARÁMETROS
     * 
     * SE BASA EN EL NOMBRE DEL METODO Y ARGUMENTOS -> x(byte b, int i)
     * 
     */
    
    public void x(byte b) {
        System.out.println("one");
    }

    public void x(int a) {
        System.out.println("two");
    }
    
    public void x(byte b, int i){
        System.out.println("three");
    }
    
    public void x(int i, byte b){
        System.out.println("four");
    }
    
}
