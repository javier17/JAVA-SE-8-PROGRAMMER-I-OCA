package mx.com.hittechs.wrappers;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class WrapperTest {

    public static void main(String[] args) {
        
        Integer i = 5;
        int j = 10;
        
        System.out.println(i++);
        
        //int j = new Integer(5);

        long _1 = i.longValue();
        double _2= i.doubleValue();
        
        int x = Integer.parseInt("10");
        
        boolean b = Boolean.parseBoolean("true");
       
        
        System.out.println(x);
        System.out.println(b);
        
    }
}
