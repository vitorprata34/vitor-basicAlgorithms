package Algorithms;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	int n;
	do 
	{
	System.out.println("Favor inputar o numero correspondente a N :");
	n = imput.nextInt();
	}while(n<=0);
	
	for(int i = 1 ; i<n ; i++)
	{
	    int soma = n+i;
	    System.out.println("A soma de "+i+" + "+n+" e = "+soma);
	}
	imput.close();
    }

}