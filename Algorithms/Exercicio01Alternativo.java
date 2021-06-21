package Algorithms;
import java.util.Scanner;

public class Exercicio01Alternativo {
    //USANDO OPERADOR TERNARIO

    public static void main(String[] args) {
	    Scanner imput = new Scanner(System.in);
		
		System.out.println("Por favor digite a primeira nota: ");
		double n1 = imput.nextDouble();
		System.out.println("Por favor digite a segunda nota: ");
		double n2 = imput.nextDouble();
		System.out.println("Por favor digite a terceira nota: ");
		double n3 = imput.nextDouble();
		System.out.println("Por favor digite a quarta nota: ");
		double n4 = imput.nextDouble();
		
		double media = (n1+n2+n3+n4)/4;
		
		String resultado = (media>=6.0) ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado);
		
		imput.close();
	}
    
}
