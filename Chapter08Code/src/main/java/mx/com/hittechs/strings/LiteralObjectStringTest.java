package mx.com.hittechs.strings;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class LiteralObjectStringTest {

    public static void main(String[] args) {
      
        String one = "Hello World";
        
        String two =  new String("Hello World");
        
        String three =  new String("Hello World");
        
        System.out.println(three == two);

    }
}
