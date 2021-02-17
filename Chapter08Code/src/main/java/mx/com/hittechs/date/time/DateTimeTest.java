package mx.com.hittechs.date.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class DateTimeTest {

    
    // UTILIZA UN PATRON DE DISEÑO LLAMADO FACTORY
    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        
        LocalTime time = LocalTime.now();
        
        LocalDateTime dateTime = LocalDateTime.now();
        
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("DateTime: "+dateTime);
        
        LocalDate date1 = LocalDate.of(2017, Month.MARCH, 30);
        LocalDate date2 = LocalDate.of(2017, 03, 30);
        
        System.out.println("");
        System.out.println("Date: "+date1);
        System.out.println("Date: "+date2);
        
        LocalTime time1 = LocalTime.of(15, 25);
          
         System.out.println("");
         System.out.println("Time: "+time1);
         
         
         LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
         
         System.out.println("");
         System.out.println("DateTime: "+dateTime1);
         System.out.println("");
         
         
         System.out.println("-------- MANIPULACIÓN DE FECHAS Y HORARIOS -------------------");
         System.out.println("");
         
         dateTime = dateTime.plusDays(5).plusHours(24);
         System.out.println("DateTime: "+dateTime);
         
         System.out.println("");
         System.out.println("---------- TRABAJANDO CON PERIODOS -------------------");
         System.out.println("");
         
         // 2019-11-19
         
         Period period = Period.of(1, 1, 1);
         dateTime = dateTime.plus(period);
         System.out.println("DateTime: "+dateTime);
         System.out.println("");
         
      
         
    }
}
