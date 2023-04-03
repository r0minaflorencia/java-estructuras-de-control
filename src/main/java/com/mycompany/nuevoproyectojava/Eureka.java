package com.mycompany.nuevoproyectojava;
/* 2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.*/
import java.util.Scanner;

public class Eureka {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la palabra clave");
        String palabra = sc.nextLine();
        
        if (palabra.equals("eureka") ) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }    
}
