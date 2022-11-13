package Persona;

import java.util.ArrayList;


public class guia10Ejercicio1ManejoExepciones extends Exception {

   
    public guia10Ejercicio1ManejoExepciones() {
             }

  
    public guia10Ejercicio1ManejoExepciones(String msg) {
        super(msg);
    }
}
/* Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada. */