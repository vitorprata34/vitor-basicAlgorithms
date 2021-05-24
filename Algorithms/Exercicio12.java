package Algorithms;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
	
        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor informar o valor do aluguel:");
        double aluguel = entrada.nextDouble();
        System.out.println("Favor informar a quantidade de dias de atraso do aluguel:");
        double dias = entrada.nextDouble();
        double multa = 0.03;
        double multaD=(multa*dias)*aluguel;
        double juros = 0.005;
        double jurosD=(juros*dias)*aluguel;
        double valorTotal = aluguel + multaD+ jurosD;
        System.out.println("O valor total a ser pago e de R$"+valorTotal);
        entrada.close();
    }
    
}
