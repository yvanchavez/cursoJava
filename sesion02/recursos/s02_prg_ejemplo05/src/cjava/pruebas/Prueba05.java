/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjava.pruebas;

import cjava.beans.StringAnalizer;
import cjava.util.Util;

/**
 *
 * @author emaravi
 */
public class Prueba05 {

    
     public static void main(String[] args) {
         String[] cadenas = {"cjava",
                            "xxx",
                            "Phyton viene con fuerza",
                            "cjava siempre para apoyarte",
                            "java 8 es la VOZ",
                            "lambdas en Java8"
        };
        
        StringAnalizer a1 = (a,b)->a.contains(b);
        StringAnalizer a2 = (o, d)->o.equalsIgnoreCase(d);
         
        Util.searchArray(cadenas,"java",a1);
    }
    
}
