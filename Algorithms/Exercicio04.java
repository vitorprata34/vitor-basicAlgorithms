package Algorithms;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
	
	Scanner imput = new Scanner(System.in);
	
	System.out.println("Por favor informar se o terreno e: (1)Quadrado (2) Retangular (3) Irregular");
	int resposta = imput.nextInt();
	System.out.println("Favor informar a medida do lado em m2:");
	double lado = imput.nextDouble();
	System.out.println("Favor informar a medida do comprimento em m2:");
	double comprimento = imput.nextDouble();
	double area ;
	double preco = 7592;
	
	if(resposta==1)
	{
	    area = Math.pow(lado, 2);
	    double precoFinal = area*preco;
	    System.out.println("A area do terreno quadrado e: "+area+"m2");
	    System.out.println("O preco final e: R$"+precoFinal);
	}
	if(resposta==2)
	{
	    area = lado*comprimento;
	    double precoFinal = area*preco;
	    System.out.println("A area do terreno retangular e: "+area+"m2");
	    System.out.println("O preco final e: R$"+precoFinal);
	}if(resposta==3) 
	{
	  System.out.println("Favor informar a medida da frente:");
	  double frente = imput.nextDouble();
	  System.out.println("Favor informar a medida dos fundos:");
	  double fundo = imput.nextDouble();
	  area = ((frente*comprimento)+(fundo*comprimento))/2;
	  double precoFinal = area*preco;
	  System.out.println("A area final do terreno irregular e: "+area+"m2");
	  System.out.println("O preco final e: R$"+precoFinal);
	}
	
	imput.close();
    }

}