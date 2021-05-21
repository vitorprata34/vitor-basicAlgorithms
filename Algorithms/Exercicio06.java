package Algorithms;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
	
        Scanner imput = new Scanner(System.in);
        System.out.println("Favor informar o valor do primeiro cateto:");
        double n1 = imput.nextDouble();
        System.out.println("Favor informar o valor do segundo cateto:");
        double n2 = imput.nextDouble();
        
        double h1 =Math.sqrt((Math.pow(n1, 2) + Math.pow(n2, 2)));
        System.out.println("A hipotenusa e : "+h1);
        imput.close();
        }
    
}
