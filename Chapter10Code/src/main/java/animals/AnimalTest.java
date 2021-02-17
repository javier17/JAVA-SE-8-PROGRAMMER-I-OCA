package animals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class AnimalTest {
    
    public static void alimentar(Animal animal){
        animal.comer();
    }

    public static void main(String[] args) {
        
        
       // Animal animal = new Animal();
     
        
        Animal perro = new Perro();
        
       // Perro perro1 = new Animal(); --> ERROR DE COMPILACIÓN
        
        Gato gato = new Gato();
        
     
        
        //alimentar(animal);
        //alimentar(perro);
        //alimentar(gato);
        
        List<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);        
        alimentar(animales);
    }

    public static void alimentar(List<Animal> animal) {
        for (Animal a : animal) {
            a.comer();
        }
   }
}
