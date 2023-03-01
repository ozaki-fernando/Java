package edu.fernando.primeira_aula;
public class MinhaClasse {
    public static void main (String [] args){

        String primeiroNome = "Fernando";
        String segundooNome = "Ozaki";
        String nomeCompleto = nomeCompleto(primeiroNome, segundooNome);
     
        System.out.print("Hey! " + nomeCompleto + " você conseguiu!");
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
