/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Luiz
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // int n [ ] = new int [ 4 ];
        int n [ ] = {3,2,8,7,5,4};
        
        // System.out.println("O vetor possui " + n.length + " casas.");
        for (int cont = 0; cont<n.length; cont++) {
            System.out.print(n[cont] + " ");
        }
        System.out.println("");
    }
    
}
