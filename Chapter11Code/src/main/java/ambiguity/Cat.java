package ambiguity;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
interface Walk {

    int SPEED = 10;

    default int getSpeed() {
        return 10;
    }
}

interface Run {
    int SPEED = 10;
    default int getSpeed() {
        return 100;
    }
}

public class Cat implements Run, Walk {

    @Override
    public int getSpeed() {
        //Run.SPEED
        //return Walk.super.getSpeed();
        return Run.SPEED;
    }

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
        System.out.println(""+Walk.SPEED);
    }
    
    // EN VARIABLES SE NECESITA DECIR DE QUE INTERFZA SE DEBE TOMAR
    // EN MÉTODOS SE NECESITA SABER DE QUE INTERFACE
}
