package com.mycompany.nuevoproyectojava;
/* 8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. */
import java.util.Scanner;

public class Cuadrado_de_asteriscos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un nro entero: ");
        int nro = sc.nextInt();
        
        int i, j;
        
        for (i = 1; i <= nro; i++){
            for (j = 1; j <= nro; j++) {
               
                if (j > 1 && j < nro && i > 1 && i < nro) {
                System.out.print(" ");
                } else {
                    System.out.print("*");
                }     
            }
            System.out.println(" ");
        }   
    }
}
