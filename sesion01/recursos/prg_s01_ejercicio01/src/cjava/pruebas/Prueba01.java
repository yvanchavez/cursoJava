package cjava.pruebas;

import java.io.IOException;

public class Prueba01 {
    public static void main(String... args) {
        System.out.println("Hola mundo 2");
        long procesadores = Runtime.getRuntime().availableProcessors();
        System.out.println("Procesadores: " + procesadores );
        long mem1 = Runtime.getRuntime().freeMemory();
        System.out.println("Memoria libre: " + mem1);
        byte a = 127;
        try {
            Runtime.getRuntime().exec("cmd.exe /c start ");
            System.out.println("se ejecuto runtime");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Comando erroneo");
        }


    }
}
