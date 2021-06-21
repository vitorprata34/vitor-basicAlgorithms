package Algorithms;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio03Alternativo {

        //Usando o Array List e Collections
    
        public static void main(String[] args) {
            Scanner imput = new Scanner(System.in);
            System.out.println("Digite o primeiro valor: ");
            double v1 = imput.nextDouble();
            System.out.println("Digite o segundo valor: ");
            double v2 = imput.nextDouble();
            System.out.println("Digite o terceiro valor: ");
            double v3 = imput.nextDouble();
            
            List<Double> valores = new ArrayList<>();
            valores.add(v1);
            valores.add(v2);
            valores.add(v3);
            System.out.println(valores);
            System.out.println(Collections.max(valores));
            System.out.println(Collections.min(valores));
            imput.close();
        } 
}
