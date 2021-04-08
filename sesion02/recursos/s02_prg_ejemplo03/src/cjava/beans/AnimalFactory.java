package cjava.beans;

import static cjava.util.Util.PERRO;
import static cjava.util.Util.GATO;
import static cjava.util.Util.CONEJO;
import static cjava.util.Util.CERDO;
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class AnimalFactory {

    public static Animal getAnimal(int tipo){
        switch(tipo){
            case PERRO: return new Perro();
            case GATO: return new Gato();
            case CONEJO: return new Conejo(); 
            case CERDO: return new Cerdo();
            default: return null;
        }
    }
    void m1(){
        double d = random()*PI;
    }
    
    
    
}
