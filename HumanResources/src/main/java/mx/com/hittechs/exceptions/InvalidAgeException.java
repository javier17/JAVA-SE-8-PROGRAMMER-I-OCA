/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.hittechs.exceptions;

/**
 *
 * @author Asesoftware
 */
public class InvalidAgeException extends Exception{

    public InvalidAgeException(String message) {
        super(message);
    }

    public InvalidAgeException() {
        super("Age must be in 18 and 65!");
    }
    
    
    
}
