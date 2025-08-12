/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localizacaodosistema;

import java.util.Locale;

/**
 *
 * @author Luiz
 */
public class LocalizacaoDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale loc = Locale.getDefault();
        System.out.print("O idioma de seu sistema é ");
        System.out.print(loc.getDisplayLanguage());
        System.out.println(".");
    }
    
}
