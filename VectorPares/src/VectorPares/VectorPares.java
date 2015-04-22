/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectorPares;

/**
 *
 * @author Francisco A. Reyes
 */
public class VectorPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAMAÑO = 10;
        
        int [] pares = new int [TAMAÑO];
        
        for (int i=1;i<=pares.length;i++){
            
            pares[i-1] = i *2;
            System.out.println(i + ": " + pares[i-1]);
        }
        
    }
    
}
