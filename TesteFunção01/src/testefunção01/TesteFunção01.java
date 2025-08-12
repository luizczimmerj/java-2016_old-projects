/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefunção01;

/**
 *
 * @author Luiz
 */
public class TesteFunção01 {

    /**
     * @param args the command line arguments
     */
    /* static void soma (int a, int b) {
        int s = a + b;
        System.out.println("A soma é " + s); 
    } // Método sem retorno de valor. (PROCEDIMENTO) */
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    } // Método com retorno de valor. (FUNÇÂO)

    public static void main(String[] args) {
        // TODO code application logic here
        int sm = soma(5, 2);
        System.out.println("A soma é " + sm);
    }

}
