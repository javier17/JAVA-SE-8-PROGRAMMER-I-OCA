package mx.com.hittechs.arrays;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ArrayTest {

    public static void main(String[] args) {
        
        //Declaration
        
        int [] x ;
    
        // Inicialization
        
        x = new int [4];
        
        x[0] = 5;
        x[1] = 10;
        x[2] = 15;
        x[3] = 20;
        
        System.out.println("x[0] : "+x[0]);
        System.out.println("x[1] : "+x[1]);
        System.out.println("x[2] : "+x[2]);
        System.out.println("x[2] : "+x[3]);
        
        
        String [] names = {"Georgina", "Jen","Simon","Dann"};
        
        /**
         * 
         
        names[0] = "Georgina";
        names[1] = "Jen";
        names[2] = "Simon";
        * 
        * */
        
        System.out.println("names[0] : "+names[0]);
        System.out.println("names[1] : "+names[1]);
        System.out.println("names[2] : "+names[2]);
        System.out.println("names[2] : "+names[3]);
        System.out.println("length: "+names.length);
        System.out.println("length: "+names[0].length());
    
        Point p1 = new Point();
        Point p2 = new Point();
    
        p1.x = 10;
        p1.y = 20;
        
        p2.x = 30;
        p2.y = 40;
        
        Point[] points = new Point[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = new Point();
        
        p1.x = 44;
        points[0].y = 55;
        
        p2.x = 66;
        points[1].y = 77;
        
        points[2].x = 22;
        points[2].y = 33;
       
        p1 = null;
        p2 = null;
        
        points[0].getLocation();
        points[1].getLocation();
        points[2].getLocation();
        
       
        int [][] y = new int[2][];
        y[0] = new int[3];
        y[1] = new int[2];
        
        y[0][0] = 3;
        y[0][1] = 6;
        y[0][2] = 9;
        y[1][0] = 12;
        y[1][1] = 15;
        
        System.out.println("----------------------------------------");
        System.out.println(""+y[1][1]);
        System.out.println(""+y[0][1]);
        
        
        System.out.println("------------Array de CHAR----------------------------");
        char[][] actividad1 = new char[2][2];
        
        actividad1[0][0] = 'Z';
        actividad1[0][1] = 'X';
        actividad1[1][0] = 'X';
        actividad1[1][1] = 'Z';
        
        System.out.println("------------Array de ENTEROS----------------------------");
        
        int [][] actividad2 = new int[3][];
        
        actividad2[0] = new int[4];
        actividad2[1] = new int[2];
        actividad2[2] = new int[1];
        
        actividad2[0][0] = 0;
        actividad2[0][1] = 1;
        actividad2[0][2] = 2;
        actividad2[0][3] = 3;
        actividad2[1][0] = 0;
        actividad2[1][1] = 1;
        actividad2[2][0] = 0;
        
    
    }
}
