package Algorithms;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double x = imput.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double y = imput.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double z = imput.nextDouble();

        if(x>y && x>z)
        {
            System.out.println("O maior valor e:"+x);
        }
        if(x<y && x<z)
        {
            System.out.println("O menor valor e:"+x);
        }
        if(y>x && y>z)
        {
            System.out.println("O maior valor e:"+y);
        }
        if(y<x && y<z)
        {
            System.out.println("O menor valor e:"+y);
        }
        if(z>y && z>x)
        {
            System.out.println("O maior valor e:"+z);
        }
        if(z<y && z<x)
        {
            System.out.println("O menor valor e:"+z);
        }
        imput.close();
    }
}
