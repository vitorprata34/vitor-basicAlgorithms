package Algorithms;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
	
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe a quantidade de moedas de 1 centavo :");
        double cent = imput.nextDouble();
        double cents = cent*0.01;
        System.out.println("Informe a quantidade de moedas de 5 centavos :");
        double penny = imput.nextDouble();
        double pennys = penny*0.05;
        System.out.println("Informe a quantidade de moedas de 10 centavos :");
        double dime = imput.nextDouble();
        double dimes = dime*0.1;
        System.out.println("Informe a quantidade de moedas de 25 centavos :");
        double quarter = imput.nextDouble();
        double quarters = quarter*0.25;
        System.out.println("Informe a quantidade de moedas de 50 centavos :");
        double half = imput.nextDouble();
        double halfs = half*0.50;
        System.out.println("Informe a quantidade de moedas de 1 real :");
        double real = imput.nextDouble();
        double reals = real*1;
        
        double soma = cents+pennys+dimes+quarters+halfs+reals;
        System.out.println("Artur possui no total R$"+soma);
        
        imput.close();
    }
}