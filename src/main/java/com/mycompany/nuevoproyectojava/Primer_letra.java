package com.mycompany.nuevoproyectojava;
/* 4. Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java. */
import java.util.Scanner;

public class Primer_letra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingrese una frase o palabra y se verificará si la primer letra es 'a': ");
        String fraseOPalabra = sc.nextLine();

        if (fraseOPalabra.substring(0, 1).equals("a")
                || fraseOPalabra.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
