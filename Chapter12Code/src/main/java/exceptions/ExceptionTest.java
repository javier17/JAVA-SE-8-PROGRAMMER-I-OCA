package exceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ExceptionTest {

    // EL ORDE DE LOS CATCH ES RESTRICTIVO, DEBE IR PRIMERO LAS EXCEPCIONES DE MENOR
    // A MAYOR JERARQUIA
    public static void main(String[] args)  {
        System.out.println("Before Main");
        try {
            one();
            System.out.println("After Exception"); // NO SE EJECUTA ESTE CÓDIGO
        } catch (SQLException | NumberFormatException ex) {
            System.out.println("popup");
            System.out.println("mail");
        } finally{ // BLOQUE DE CÓDIGO QUE SIEMPRE SE EJECUTA (SI SE ATRAPA O NO LA EXECPCIÓN)     
        }
    
        
        
        System.out.println("After Main");
        //More code
    }

    static void one() throws SQLException {
        two();
        //More code
    }

    static void two() throws SQLException {    
            three();   
    }

    static void three() throws SQLException {
        //Code
        throw new SQLException();
        //More code
    }
}
