package testestipos;
/**
 *
 * @author Luiz
 */
public class TestesTipos {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
   /*  int idade = 19;
    String valor = Integer.toString(idade); // Converter int em String.
    System.out.println(valor); */
   
   /* String valor = "19";
   int idade = Integer.parseInt(valor); // Converte String em int.
    System.out.println(idade); */
   
   String valor = "19.3";
   float idade = Float.parseFloat(valor);
    System.out.printf(" %.2f ", idade);
  }
  
}
