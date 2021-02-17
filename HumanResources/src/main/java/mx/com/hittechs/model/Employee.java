package mx.com.hittechs.model;

import java.time.LocalDate;
import mx.com.hittechs.exceptions.InvalidAgeException;

/**
 *
 * @author cpitaama91008
 */
public  class Employee  {

    
/**
 * 
 * ERRORES QUE SE PRESENTAN CUANDO LA VARIABLE ES FINAL Y ES DE INSTANCIA.
 * 
 * SOLUCIÓN:
 * 
 * 1. INICIALIZAR LA VARIABLE EN LA DEFINICIÓN.
 * 2. INICIALIZAR LA VARIABLE EN UN BLOQUE ANONIMO DE INSTANCIA.
 * 3. INICIALIZAR LA VARIABLE EN EL CONSTRUCTOR.
 * 
 * 
 * 
 * ERRORES QUE SE PRESENTAN CUANDO LA VARIABLE ES FINAL Y ES DE ESTATICA.
 * 
 * SOLUCIÓN:
 * 
 * 1. INICIALIZAR LA VARIABLE EN LA DEFINICIÓN.
 * 2. INICIALIZAR LA VARIABLE EN UN BLOQUE ANONIMO ESTATICO.
 * 
 * 
 */
    
    private final int id;
    private String fisrtName;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private double salary;
    private LocalDate hireDate;
    private Department department;
    private Job job;
    
    public static  int count; // VARIABLE DE CLASE
    
    //public Employee(){
    //    
    //}
    
    /**
     * SOBRECARGA DE CONSTRUCTORES
     */
    
    // BLOQUE ANONIMO DE INSTANCIA
    // LOS BLOQUES ANÓNIMOS SE UTLIZAN PARA EJECUTAR INSTRUCCIONES PREVIAS A LA EJECUCIÓN DEL 
    //CONSTRUCTOR
    
    /**
     * UN BLOQUE ANONIMO STATICO SE EJECUTA AL MENOS UNA VEZ
     */
   // static{
   //      System.out.println("anonymous static block");
   //    count = 5;
   // }
    
   // {
   //     id = 1;
   //     System.out.println("anonymous block");
   // }
    
    // THIS() SOLAMENTE PUEDE ESTAR AL COMIENZO DEL CONSTRUCTOR
     public Employee() {
         id = ++count;
         System.out.println("Constructor");
     }
    
    public Employee(String fisrtName, String lastName) {
        this();
       // id = ++count;
        System.out.println("Constructor");
        this.fisrtName = fisrtName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    
    
    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age >= 18 && age < 65) {
            this.age = age;
        } else {
           throw new InvalidAgeException();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void getDetails() {
        System.out.println("Id: " + id);
        System.out.println("First Name: " + fisrtName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
        if (department != null) {
            System.out.println("Deparment: " + department.getTitle());
        }
        if (job != null) {
            System.out.println("Job: " + job.getTitle());
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber + ", salary=" + salary + ", hireDate=" + hireDate + ", department=" + department + ", job=" + job + '}';
    }
    
    // MÁS ADELANTE AVERIGIAR METODO EQUALS Y HASHCODE QUE SE PUEDEN GENERAR
    // Y ES UNA BUENA PRÁCTICA

}
