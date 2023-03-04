package edu.fernando.quarta_aula;

public class operadores {
    public static void main(String[] args) {
    //classe Operadores.java
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);
		
//classe Operadores.java
    int numero1 = 1;
    int numero2 = 2;

    if(numero1 > numero2)
        System.out.println("Numero 1 maior que numero 2");

    if(numero1 < numero2)
        System.out.println("Numero 1 menor que numero 2");

    if(numero1 >= numero2)
        System.out.println("Numero 1 maior ou igual que numero 2");

    if(numero1 <= numero2)
        System.out.println("Numero 1 menor ou igual que numero 2");

    if(numero1 != numero2)
        System.out.println("Numero 1 é diferente de numero 2");

    //operadores igualdade
    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2){
        System.out.println("As duas condições são verdadeiras");
    }
    if (condicao1 || condicao2){
        System.out.println("Umas das condições é verdadeira.");
    }
    System.out.println("Fim");

    }
}
