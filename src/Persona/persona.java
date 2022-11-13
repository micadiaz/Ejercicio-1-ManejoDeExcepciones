
package Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class persona {
    private Scanner leer=new Scanner(System.in);
    
    public persona crearPersona(){
        System.out.println("ingrese su nombre");
        String nombre=leer.nextLine();
        System.out.println("ingresa la edad");
        int edad=leer.nextInt();
        System.out.println("ingrese el sexo: H=hombre, M=mujer, O=otro");
        String sexo=leer.nextLine();
        if(sexo!="H"|| sexo!="M" || sexo!="O"){
            System.out.println("el sexo introducido no es valido");
        }
        return new persona();
    }
    public persona calcularIMC(){
        System.out.println("ingrese su peso en kg");
       double peso=leer.nextDouble();
        System.out.println("ingrese su altura ");
        double altura=leer.nextDouble();
        double pesoIdeal=(peso/(altura*altura));
        if(pesoIdeal<20){
            System.out.println(" estas por debajo de tu peso -1");}
        else if(pesoIdeal>=20 && pesoIdeal<=25){
            System.out.println("estas en el peso justo 0");
        }
        else{System.out.println("estas con sobrepeso 1");}
        return new persona();
    }
    
    public persona esMayorEdad() throws ArithmeticException{    // ejercicio 1 manejo de exepciones se implemento el throws, ArithmeticExeption

        System.out.println("ingrese su edad");
        int edad=leer.nextInt();
        boolean ed;
       if(edad==0){throw new ArithmeticException ("edad incorrecta");}
       else if(edad>=18){
            System.out.println(ed=true );}
            else{System.out.println(ed=false);}
        return esMayorEdad();
    
    }
    
     
    
}
