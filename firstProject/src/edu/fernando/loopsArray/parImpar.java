package edu.fernando.loopsArray;

import java.util.Scanner;
/*Classe que pergunta ao usuário a quantidade de vezes que um loop vai executar e coleta números aleatórios, 
* no fim apresenta a quantidade de números pares e ímpares digitados pelo usuário.
 */
public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Declaração de Variáveis
        int quantNumeros, count = 0, numero;
        int quantPares = 0, quantImpares = 0;
        //Entrada de dados
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();
        //Laço para análise de pares e impares
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            //Determina se número é par ou impar e incementa contador
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);
        //Apresenta resultados
        System.out.println("Quantidade par: " + quantPares);
        System.out.println("Quantidade impar: " + quantImpares);
    }
}
