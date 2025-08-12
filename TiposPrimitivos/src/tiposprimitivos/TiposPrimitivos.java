package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class TiposPrimitivos {

  public static void main(String[] args) {
    // TODO code application logic here
    // Saída de Dados ! + Entrada de Dados !
    Scanner teclado = new Scanner (System.in); // Scanner *Nome do Objeto* = new Scanner (*Local aonde o dado será inserido*);
    System.out.print("Digite o nome do aluno: ");
    String nome = teclado.nextLine();
    System.out.print("Digite a nota do aluno: ");
    float nota = teclado.nextFloat();
    // System.out.println("A nota é " + nota);
    // sout = System.out.println(" ");
    System.out.printf("A nota de %s é %.2f. \n",nome ,nota);
    // System.out.format("A nota de %s é %.2f. \n",nome ,nota);
  }
}