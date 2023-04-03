package com.mycompany.nuevoproyectojava;
/* 5. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
import java.util.Scanner;

public class Valor_limite {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un valor límite: ");
        int valorLimite = sc.nextInt();
        
        int i = 0;
        do {
            System.out.print("Ingrese nros a sumar: ");
            int nros = sc.nextInt();
            i = i + nros;
            if (i < valorLimite){
                System.out.println("La suma de los nros ingresados es: " + i);
            }else{
                System.out.println("Has excedido el valor límite");
            }
        } while (i < valorLimite); 
    }   
}  

