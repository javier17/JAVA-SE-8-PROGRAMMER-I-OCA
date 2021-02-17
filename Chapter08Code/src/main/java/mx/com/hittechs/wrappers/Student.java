package mx.com.hittechs.wrappers;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class Student {

    Integer i = 5; // AUTOBOXING
    int j = i;  // AUTOUNBOXING
    
    Integer grade;

    
    // BOXING - PASAR DE DATO PRIMITIVO A UN WRAPPER, ES DECIR SE ENVUELVE
    public static void main(String[] args) {
        Student student = new Student();
        
        Integer grade = 8;
        student.setGrade(grade);
        
        System.out.println(++student.i);
    }

    public Integer getGrade() {
        return i;
    }

    public void setGrade(int grade) {
        this.i = grade;
    }
}
