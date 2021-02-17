package abstracts;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
/**
 *
 * REGLAS DE SINTAXIS DE LAS CLASES ABSTRACTAS
 *
 * 1. NO PUEDES INSTANCIAR UNA CLASE ABTRACTA. 2. UNA CLASE ABSTRACTA PUEDE
 * TENER DE 0 A N METODOS ABSTRACTOS. 3. SI UNA CLASE ABSTRACTA CONTIENE 1
 * METODO ABSTRACTO DEBE SER ABSTRACTA EXPLÍCITAMENTE 4. AL EXTENDER, HEREDAR DE
 * UNA CLASE ABSTRACTA ESTÁS OBLIGADO A IMPLEMENTAR (SOBREESCRIBIR) LOS MÉTODOS
 * ABSTRACTOS QUE ESTA CONTIENE.
 *
 */
public abstract class A {

    abstract void a();
    abstract void b();

    void z() {
    }
    
    
}

abstract class B extends A {

    abstract void c();
    void a(){};
}

/**
 * 
 * CUANDO SE APLICA FINAL A UNA CLASE ABSTRACTA, YA NO SE PODRÁ HEREDAR DE ELLA
 */
class C extends B {

    
    final void b() {
     }

    @Override
    void c() {
    }
    
    /**
     * LOS METODOS ESTATICOS NO SE PUEDEN SOBRESSCRIBIR.
     * 
     * STATIC , FINAL Y ABSTRACT SON MODIFICADORES QUE NO PUEDEN IR JUNTOS
     * 
     * EL MODIFICADOR PRIVATE NO PUEDE IR CON ABSTRACT
     * 
     */
    static void s(){
        
    }
}

class D extends C{
    
    // ERROR DE COMPILACIÓN 
    
   // @Override
    //void b(){
        
   // }
   // @Override
    //static void s(){
        
   // }

    
    
}

class Test {

    public static void main(String[] args) {
    }
}
