package edu.fernando.setima_aula;
import java.util.Locale;
import  java.util.Scanner;
/**
* <h1>About Me</h1>
* A classe About Me recebe os dados do cliente e exibe na tela
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Fernando Ozaki
* @version 1.0
* @since   05/03/2023
*/
public class AboutMe {
    /**
   * Este método é utilizado para alimentar um array com os dados do cliente, e 
   * exibir na tela via prompt
   * @param nome este é o primeiro argumento que recebe o primeiro nome do cliente
   * @param sobrenome este é o segundo argumento, que recebe o sobrenome
   * @param idade este é o terceiro argumento, que recebe a idade
   * @param altura este é o quarto argumento, que recebe a altura
   */
    public static void main(String[] args) {
       //criando o objeto scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
       System.out.println("Digite seu nome:");
       String nome = scanner.next();
       
       System.out.println("Digite seu sobrenome:");
       String sobrenome = scanner.next();

       System.out.println("Digite sua idade:");
       int idade = scanner.nextInt();
       
       System.out.println("Digite sua altura:");
       double altura = scanner.nextDouble();

       
       //imprimindo os dados obtidos pelo usuario
       System.out.println("Ola, me chamo: " + nome + " " + sobrenome + ".");
       System.out.println("Tenho " + idade + " anos.");
       System.out.println("Minha altura é " + altura + "cm.");
    }
}
