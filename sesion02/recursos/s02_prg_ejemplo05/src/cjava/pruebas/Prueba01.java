package cjava.pruebas;

import cjava.beans.ContainsAnalyzer;

/**
 *
 * @author emaravi
 */
public class Prueba01 {

    public static void main(String[] args) {
        
        String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 8 es la VOZ",
                            "lambdas en Java8"
        };
        
        ContainsAnalyzer c = new ContainsAnalyzer();
        for(String s : cadenas){
            if(c.analize(s,"java"))
                System.out.println(s);
        }
    }
    
}
