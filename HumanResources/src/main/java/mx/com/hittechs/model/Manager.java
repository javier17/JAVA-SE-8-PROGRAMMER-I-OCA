/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.hittechs.model;

/**
 *
 * @author cpitaama91008
 */

// MANAGER ES UN EMPLEADO
// MANAGER TIENE LAS CARACTERISTICAS DE UN EMPLEADO MÁS LAS CARACTERISTICAS NUEVAS.

/**
 * SOLO SE PUEDE APLICAR HERENCIA SIMPLE, ES DECIR SOLO EXTIENE UNA SOLA CLASE
 * LOS CONSTRUCTORES NO SE HEREDAN
 * 
 * @author cpitaama91008
 */


public class Manager extends Employee{
    
    private Employee secretary;

    public Manager() {
    }

    public Manager(String fisrtName, String lastName) {
        super(fisrtName, lastName);
        System.out.println("Manager");
    }

    
    

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }
    
    @Override
    public void getDetails() {
        super.getDetails(); //To change body of generated methods, choose Tools | Templates.
        if(secretary!=null){
        System.out.println("Secretary: "+secretary.getFisrtName()+" "+secretary.getLastName());
        }
    }  
}
