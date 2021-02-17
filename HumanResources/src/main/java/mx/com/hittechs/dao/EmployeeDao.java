/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.hittechs.dao;

import java.util.List;
import mx.com.hittechs.model.Employee;

/**
 *
 * @author cpitaama91008
 */
/**
 *
 * LAS INTERFACES NO SE PUEDEN INSTANCIAR LAS INTERFACES NO TIENEN CONSTRUCTORES
 * LAS INTERFACES NO TIENE BLOQUES ANONIMOS ESTATICOS
 *
 * LAS INTERFACES NO TIENE VARIABLES, LAS INTERFACES TIENEN CONSTANTES
 *
 */
public /*abstract*/ interface EmployeeDao {

    /* public static final*/ int ROW = 5;

    /**
     * LAS INTERFACES CONTIENEN METODOS ABRSTRACTOS, ES DECIR SI IMPLEMENTACIÓN
     */
    /* public abstract*/ void create(Employee e);

    public abstract List<Employee> findAll();
    
    Employee findById(int id);
    
    void update(Employee e);
    
    void remove(Employee e);
    
    
}
