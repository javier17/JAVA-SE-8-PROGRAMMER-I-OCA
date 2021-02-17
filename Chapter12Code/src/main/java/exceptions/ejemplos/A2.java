/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.ejemplos;

/**
 *
 * @author Asesoftware
 */
public class A2 extends A1{
    
    
    
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
        
        b1.append(b2.substring(2, 5).toUpperCase());
        b2.insert(3, b1.append("a"));
        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
        
        System.out.println(""+b1);
        System.out.println(""+b2);
        
        System.out.println("aa: "+b2.substring(4));
        
    }
    
    
    
}
