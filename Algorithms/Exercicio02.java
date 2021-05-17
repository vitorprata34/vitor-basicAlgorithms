import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        
        System.out.println("Por favor digite o valor do produto: ");
        double v1 = imput.nextDouble();
        System.out.println("Por favor digite o valor dado em dinheiro:");
        double v2 = imput.nextDouble();
        
        double troco = v1-v2;
        System.out.println("O troco e R$"+ troco);
        
        imput.close();
    }
    
}
