/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema_9;

import java.util.Scanner;

/**
 *
 * @author Yazmin
 */
public class Problema_9 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        
        int num;
        System.out.print("Introduzca un número entero: ");
        num= in.nextInt();
       
        if(num>0){
        System.out.printf("Positivo\n");
        }
        else {
        System.out.printf("Negativo\n");
        }        
        
        
    }
    
}
