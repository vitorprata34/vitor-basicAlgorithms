package Algorithms;

import java.util.Scanner;

public class Exercicio11Alternativo {
    
    /*Fiz uma alteracao nesse ultimo desafio, recebendo um valor e fatorando
    *em moedas disponiveis e imprimindo as que foram usadas.
    */
    public static void main(String[] args) {
	
        Scanner imput = new Scanner(System.in);
        double poupanca;
        do
        {
        System.out.println("Por favor digite o valor:");
        poupanca = imput.nextDouble();
        }while(poupanca<=0);
        //fazer a contabilidade em cada laco e contabilizando
        int qtdCent = 0;
        int qtdPenny = 0;
        int qtdDime = 0;
        int qtdQuarter= 0;
        int qtdHalf = 0;
        int qtdUm= 0;
        //descricao das moedas a serem descritas
        int cent = 1;
        int penny = 5;
        int dime = 10;
        int quarter = 25;
        int half = 50;
        int um = 100;
        int inteiro =(int) (poupanca *100);//cast de informando que e um int no double, para considerar a matematica
        int qtdMoedas=0; //contabilizando o numero de moedas
        while(inteiro>=um)
        {
            inteiro = inteiro - um;
            qtdMoedas++;
            qtdUm++;
        }
        while(inteiro>=half)
        {
            inteiro = inteiro - half;
            qtdMoedas++;
            qtdHalf++;
        }
        while(inteiro>=quarter)
        {
            inteiro = inteiro - quarter;
            qtdMoedas++;
            qtdQuarter++;
        }
        while(inteiro>=dime)
        {
            inteiro = inteiro - dime;
            qtdMoedas++;
            qtdDime++;
        }
        while(inteiro>=penny)
        {
            inteiro = inteiro - penny;
            qtdMoedas++;
            qtdPenny++;
        }
        while(inteiro>=cent)
        {
            inteiro = inteiro - cent;
            qtdMoedas++;
            qtdCent++;
        }
        
        System.out.printf("Total de moedas divididas e de:%d\n",qtdMoedas);
        System.out.printf("A quantidade de moedas de R$1 usadas e de: %d\n",qtdUm);
        System.out.printf("A quantidade de moedas de R$0.50 usadas e de: %d\n",qtdHalf);
        System.out.printf("A quantidade de moedas de R$0.25 usadas e de: %d\n",qtdQuarter);
        System.out.printf("A quantidade de moedas de R$0.10 usadas e de: %d\n",qtdDime);
        System.out.printf("A quantidade de moedas de R$0.05 usadas e de: %d\n",qtdPenny);
        System.out.printf("A quantidade de moedas de R$0.01 usadas e de: %d\n",qtdCent);
        
        imput.close();
    }
}
