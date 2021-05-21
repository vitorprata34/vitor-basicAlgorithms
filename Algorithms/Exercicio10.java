package Algorithms;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        
        System.out.println("Por Gentileza informar o numero de dias a ser calculado para o funcionario:");
        double dias = imput.nextDouble();
        double meses=dias/30;
        double ano=dias/365;
        
        System.out.println("o numero de dias do funcionario e de :" +dias);
        System.out.println("o numero de meses do funcionario e de :"+meses);
        System.out.println("o numero de anos do funcionario e de :"+ano);
        imput.close();
    } 
}
