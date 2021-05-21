package Algorithms;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
	
        Scanner imput = new Scanner(System.in);
        
        System.out.println("Gentileza informar o valor de a:");
        double a = imput.nextDouble();
        System.out.println("Gentileza informar o valor de b:");
        double b = imput.nextDouble();
        System.out.println("Gentileza informar o valor de c:");
        double c = imput.nextDouble();
        double delta = (Math.pow(b, 2))-(4*(a*c));
        System.out.println(delta);
        double xpos= (-b + (Math.sqrt(delta)))/(2*a);
        double xneg= (-b - (Math.sqrt(delta)))/(2*a);
        
        System.out.println("A raiz positiva da equacao e:" + xpos);
        System.out.println("A raiz positiva da equacao e:" + xneg);
        
        imput.close();
        }
    
}
