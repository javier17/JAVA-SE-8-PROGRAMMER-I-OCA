package mx.com.hittechs.test;

import mx.com.hittechs.model.Department;
import mx.com.hittechs.model.Employee;
import mx.com.hittechs.model.Job;
import java.time.Month;
import mx.com.hittechs.model.Manager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.hittechs.exceptions.InvalidAgeException;


/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class HumanResourcesTest {

    // REGLAS PARA TRABAJAR CON STATIC
    /**
     * 1. DENTRO DE UN BLOQUE ESTATICO PODEMOS ACCEDER A MIEBROS ESTATICOS SIN
     * UNA INSTANCIA PERO PARA MIEMBROS NO STATIC NECESITAMOS UNA INSTANCIA. 2.
     * DENTRO DE UN BLOQUE NO ESTATICO PODEMOS ACCEDER A MIEMBROS(METODO STATICO
     * O VARIABLE ESTATICO) ESTATICOS Y NO ESTATICOS
     *
     *
     */
    public static double minSalary = 10_000;
    public static double maxSalary = 20_000;

    public static Job getJobInstance() {
        Job jProgrammer = new Job("Java Programmer");
        jProgrammer.setId(1);
        jProgrammer.setMinSalary(minSalary);
        jProgrammer.setMaxSalary(maxSalary);
        return jProgrammer;
    }

    public static void main(String[] args) {

        Job job = HumanResourcesTest.getJobInstance();

        Department dTI = new Department("Technology Information");
        dTI.setId(1);
        dTI.setLocation("Ecuardor");


        Employee e1 = new Employee("Edgar", "Gomez");
        Employee e2 = new Employee("Maria", "Estrada");
        
        
       
        // EL CAST EN EJECUCIÓN SE HACE DE ABAJO HACIA ARRIBA.
        // EL HIJO SE ACOPLA AL PADRE.
        
        // EN COMPILACIÓN LA REFERENCIA DEBE IR DE ARRIBA HACIA ABAJO (DE EMPLEADO A MANAGER)
        
        // RESPECTO AL CAST EN COMPILACIÓN PUEDE IR EN CUALQUIER SENTIDO -> SE
        //OCULTA LA PARTE DERECHA
        
        // EN EJECUCIÓN SE OCULTA LA PARTE IZQUIERDA
        // EN EJECUCIÓN LA REFERECNIA DEBE IR DE ARRIBA HACIA ABAJO (DE EMPLEADO A MANAGER)
        // EL CAST SOLAMENTE PUEDE IR DE ABAJO HACIA ARRIBA DE (MANAGER A EMPLEADO)
        // ERROR ClassCastException 
        
        
        Employee m = new Manager("Jhon", "Doe");
        Manager man = (Manager)m;
        man.setSecretary(e2);
        
        try {
            m.setAge(44);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
            }
        m.setEmail("jdoe@hittechs.com.mx");
        m.setPhoneNumber("777.888.666");
        m.setSalary(47_421.77);
        m.setHireDate(LocalDate.of(2015, Month.JANUARY,1));
        m.setDepartment(dTI);
      
        
        int id = 1;

        //e1.setId(id);
        System.out.println("Value: " + id);
        try {
            e1.setAge(15);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
        e1.setEmail("egomez@hittechs.com.mx");
        e1.setPhoneNumber("123.456.7890");
        e1.setSalary(4500.25);
        e1.setHireDate(LocalDate.of(2017, Month.FEBRUARY, 11));
        e1.setDepartment(dTI);
        e1.setJob(job);

        try {
            //e2.setId(2);
            e2.setAge(19);
        } catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
        e2.setEmail("mestrada@hittechs.com.mx");
        e2.setPhoneNumber("987.654.3210");
        e2.setSalary(4800.33);
        e2.setHireDate(LocalDate.of(2017, Month.APRIL, 13));
        e2.setDepartment(dTI);
        e2.setJob(job);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(m);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        
    }
    
    
}
