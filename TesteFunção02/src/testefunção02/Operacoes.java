/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefunção02;

/**
 *
 * @author Luiz
 */
public class Operacoes {
        
    public static String contador (int i, int f) {
        String s = "";
        for (int cont = i; cont<=f; cont++) {
            s += cont + " ";
        }
        return s;
    }
    
}
