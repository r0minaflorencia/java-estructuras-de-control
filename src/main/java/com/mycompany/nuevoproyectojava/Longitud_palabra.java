package com.mycompany.nuevoproyectojava;
/* 3. Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java. */
import java.util.Scanner;

public class Longitud_palabra {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra de 8 caracteres: ");
        String palabra = sc.nextLine();
        
        if (palabra.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }   
    }
}
