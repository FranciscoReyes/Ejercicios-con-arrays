/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco A. Reyes
 */
public class InicializaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = {11,52,31,45,15,65,77,18,39,10};
        
        for (int i=0;i<numeros.length;i++){
            int pos = i+1;
            System.out.println(pos + ": " + numeros[i]);
        }
        
    }
    
}
