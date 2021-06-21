package Algorithms;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Exercicio02Alternativo {

    public static void main(String[] args) {
        //usando Labda com Operador Unario
          Scanner imput = new Scanner(System.in);
          System.out.println("Por favor digite o valor do produto: ");
          double v1 = imput.nextDouble();
          System.out.println("Por favor digite o valor dado em dinheiro:");
          double v2 = imput.nextDouble();
          UnaryOperator<Double> troco2 = v -> v2-v1; 
          System.out.println("O troco e R$"+ troco2.apply(v1));
          imput.close();
    
    }
    
}
