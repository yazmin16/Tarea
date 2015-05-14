/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema_12;

/**
 *
 * @author Yazmin
 */
public class Problema_12 {
    public static void main(String[] args) {
      
        int i;
        int par=0;
        int impar=0;
        for(i=1; i<=100; i++)
        
            if(i%2==0){
                par = par+i;
                
            
            }
            else
                if((i%2)!=0){
                 impar = impar+i;
                 
                }
            System.out.printf("Suma de los numeros pares %d\n",par);
            System.out.printf("Suma de los numeros impares %d\n",impar);
                 
    }
    
}
