package Algorithms;

import java.util.Scanner;

public class Exercicio13 {
    
    public static void main(String[] args) {
	double hora = 17;
	double dependente = 34;
	double inss = 0.085;
	double ir = 0.05;
	int funcionario=0 ;
	Scanner entrada = new Scanner(System.in);
	do
	{
	 System.out.println("Escolha o funcionario para verificacao: 1-Vitor 2-Marcela 3-Rafael 4-Ivana 5-Keila");
	 funcionario = entrada.nextInt();	
	
	}while(funcionario <=0 || funcionario >=6);
	
	switch(funcionario)
	{
	case 1:
	String nome = "Vitor";
	double bruto = (hora*40)*4;
	double descontoInss = bruto*inss;
	double descontoDependente = 2*dependente;
	double descontoIr = bruto*ir;
	double liquido = bruto - (descontoInss + descontoDependente + descontoIr);
	System.out.println(nome);
	System.out.println("Salario bruto de: R$"+bruto);
	System.out.println("O desconto do Inss e de : R$"+descontoInss);
	System.out.println("O valor descontado para os 2 dependentes e de: R$" +descontoDependente);
	System.out.println("O valor de desconto do IR e de: R$"+descontoIr);
	System.out.println("O salario liquido de "+ nome + " e de R$"+liquido);
	break;
	case 2:
	String nomeM = "Marcela";
	double brutoM = (hora*35)*4;
	double descontoInssM = brutoM*inss;
	double descontoDependenteM = 1*dependente;
	double descontoIrM = brutoM*ir;
	double liquidoM = brutoM - (descontoInssM + descontoDependenteM + descontoIrM);
	System.out.println(nomeM);
	System.out.println("Salario bruto de: R$"+brutoM);
	System.out.println("O desconto do Inss e de : R$"+descontoInssM);
	System.out.println("O valor descontado para o dependente e de: R$" +descontoDependenteM);
	System.out.println("O valor de desconto do IR e de: R$"+descontoIrM);
	System.out.println("O salario liquido de "+ nomeM + " e de R$"+liquidoM);
	break;
	case 3:
	String nomeR = "Rafael";
	double brutoR = (hora*30)*4;
	double descontoInssR = brutoR*inss;
	double descontoDependenteR = 3*dependente;
	double descontoIrR = brutoR*ir;
	double liquidoR = brutoR - (descontoInssR + descontoDependenteR + descontoIrR);
	System.out.println(nomeR);
	System.out.println("Salario bruto de: R$"+brutoR);
	System.out.println("O desconto do Inss e de : R$"+descontoInssR);
	System.out.println("O valor descontado para os 3 dependentes e de: R$" +descontoDependenteR);
	System.out.println("O valor de desconto do IR e de: R$"+descontoIrR);
	System.out.println("O salario liquido de "+ nomeR + " e de R$"+liquidoR);
	break;
	case 4:
	String nomeI = "Ivana";
	double brutoI = (hora*25)*4;
	double descontoInssI = brutoI*inss;
	double descontoDependenteI = 2*dependente;
	double descontoIrI = brutoI*ir;
	double liquidoI = brutoI - (descontoInssI + descontoDependenteI + descontoIrI);
	System.out.println(nomeI);
	System.out.println("Salario bruto de: R$"+brutoI);
	System.out.println("O desconto do Inss e de : R$"+descontoInssI);
	System.out.println("O valor descontado para os 2 dependentes e de: R$" +descontoDependenteI);
	System.out.println("O valor de desconto do IR e de: R$"+descontoIrI);
	System.out.println("O salario liquido de "+ nomeI + " e de R$"+liquidoI);
	break;
	case 5:
	String nomeK = "Keila";
	double brutoK = (hora*20)*4;
	double descontoInssK = brutoK*inss;
	double descontoDependenteK = 3*dependente;
	double descontoIrK = brutoK*ir;
	double liquidoK = brutoK - (descontoInssK + descontoDependenteK + descontoIrK);
	System.out.println(nomeK);
	System.out.println("Salario bruto de: R$"+brutoK);
	System.out.println("O desconto do Inss e de : R$"+descontoInssK);
	System.out.println("O valor descontado para os 3 dependentes e de: R$" +descontoDependenteK);
	System.out.println("O valor de desconto do IR e de: R$"+descontoIrK);
	System.out.println("O salario liquido de "+ nomeK + " e de R$"+liquidoK);
	break;
	default:
	System.out.println("Funcionario nao encontrado!");
	}
	entrada.close();
    }
}
