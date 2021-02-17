/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ambiguity;

/**
 *
 * @author cpitaama91008
 */
public class Ejemplo {
    
}

interface Downloadable{
   public abstract void download();
}

interface Readable extends Downloadable{
    public void readBook();
}

abstract class Bock implements Readable{
    public void readBook(){
        System.out.println("Read Book");
    }
}

class EBook extends Bock{
    public void readBok(){
        System.out.println("Read E - Nook");
    }

    @Override
    public void download() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   

