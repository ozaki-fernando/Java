package edu.fernando.LogicaCondicional.ControleFluxo;

/**
 * <h1>Controle de Fluxo</h1>
 * Exercicio para utilização das ferramentas if e switch para controle de fluxo.
 * O método main chama os métodos onde está exemplificado os métodos de controle de fluxo, tanto os com 
 * boas práticas tanto os com práticas inadequadas.
 */
public class controleFluxo {

    public static void main(String[] args) {

        ifFlecha(20);
        ifSemFlecha(22);
        ifFerias("Janeiro");
        ifMenor(2182.80, 1800, 1, 4);
        switchSemana("Segunda");
        switchNumero(3);
        
    }
    private static void ifFlecha(int mes){
                
        if (mes == 1){
            System.out.println("Janeiro");
        } else{
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido!");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private static void ifSemFlecha (int mes){
        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Março");
        }else if (mes == 4){
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8){
            System.out.println("Agosto");
        } else if (mes == 9){
            System.out.println("Setembro");
        } else if (mes == 10){
            System.out.println("Outubro");
        } else if (mes == 11){
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês Indefinido!");
        }
    }
    private static void ifFerias (String mes){
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro"){
            System.out.println("Férias!");
        } else {
            System.out.println("Que pena, ainda falta um tempo para suas férias!");
        }

    }
    private static void ifMenor (double salarioMensal, double mediaSalario, int quantidadeDependentes, int mediaDependentes){
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)){
            System.out.println("Funcionário deve receber auxilio!");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio!");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio){
            System.out.println("Funcionário deve receber auxílio!");
        } else {
            System.out.println("Funcionário não precisa de auxílio.");
        }
    }
    private static void switchSemana (String dia){
        
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
        
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
    private static void switchNumero (int numero){

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido!");
                break;
        }
    }
}