/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema_8;

import java.util.Scanner;

/**
 *
 * @author Yazmin
 */
public class Problema_8 {
    
    public static void main(String[] args) {
     
        Scanner letra = new Scanner(System.in);
        
        String l;
        System.out.println("Ingrese una letra: ");
        l = letra.next();
        
        if(l == "s" || l == "n"){
            System.out.printf("Letra correcta");
           
                           
        }
        else{
            
           System.out.printf("Letra incorrecta: %s",l);
        }           
                
       
    } 
}
