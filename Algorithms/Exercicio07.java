package Algorithms;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Por favor informar o peso: ");
        double peso = imput.nextDouble();
        System.out.println("Por favor informar a altura: ");
        double altura = imput.nextDouble();
        
        double imc = peso/(altura*altura);
        
        if(imc>=16 && imc<=16.9)
        {
        System.out.println("O seu IMC e:" + imc+" o que significa que esta muito abaixo do peso!");
        }
        if(imc>=17 && imc<=18.4)
        {
        System.out.println("O seu IMC e:" + imc+" o que significa que esta abaixo do peso!");  
        }
        if(imc>=18.5 && imc<=24.9)
        {
        System.out.println("O seu IMC e:" + imc+" o que significa que seu peso e normal!");
        }
        if(imc>=25 && imc<=29.9)
        {
        System.out.println("O seu IMC e:" + imc+" o que significa que esta acima do peso!");
        }
        if(imc>=30 && imc<=34.9)
        {
         System.out.println("O seu IMC e:" + imc+" o que significa que esta com obesidade grau 1!");
        }
        if(imc>=35 && imc<=40)
        {
        System.out.println("O seu IMC e:" + imc+" o que significa que esta com obesidade grau 2!");
        }
        if(imc>=40.1) 
        {
        System.out.println("O seu IMC e:" + imc+" o que significa que esta com obesidade grau 3!");
        }
        
        imput.close();
        }
    
}
