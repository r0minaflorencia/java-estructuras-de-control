package com.mycompany.nuevoproyectojava;
//1. Crear un programa que dado un número determine si es par o impar.
import java.util.Scanner;

public class Par_o_impar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un nro entero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El nro es par");
        }else if (num % 2 == 1){
            System.out.println("El nro es impar");      
        }       
    }        
}
    

