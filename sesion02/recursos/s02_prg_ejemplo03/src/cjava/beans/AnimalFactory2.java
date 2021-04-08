package cjava.beans;

import static cjava.util.Util.CERDO;
import static cjava.util.Util.CONEJO;
import static cjava.util.Util.GATO;
import static cjava.util.Util.PERRO;
import static cjava.util.Util.VACA;
/**
 *
 * @author emaravi
 */
public class AnimalFactory2 {
    
    private AnimalFactory2() {
    }
    
    public static AnimalFactory2 getInstance() {
        return AnimalFactory2Holder.INSTANCE;
    }
    
    private static class AnimalFactory2Holder {

        private static final AnimalFactory2 INSTANCE = new AnimalFactory2();
    }
    
     public Animal getAnimal(int tipo){
        switch(tipo){
            case PERRO: return new Perro();
            case GATO: return new Gato();
            case CONEJO: return new Conejo();
            case CERDO: return new Cerdo();
            case VACA: return new Vaca();
            default: return null;
        }
    }
    
}
