/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane; // Paineis e janelas já prontas.

/**
 *
 * @author Luiz
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, media, soma = 0, qtd = 0, par =0, impar = 0, qtd100 = 0;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma += numero;
            qtd++;
            if ( numero % 2 == 0) {
                par++;
            } else {
                impar ++;
            }
            if (numero > 100) {
                qtd100++;
            }
        } while (numero != 0);
        media = (int) soma/qtd;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +
                "<br>Total de valores: " + qtd +
                "<br>Total de pares: " + par + 
                "<br>Total de Ímpares: " + impar +
                "<br>Acima de 100: " + qtd100 +
                "<br>Média dos valores: " + media + "</html>");
    }
    
}