package Algorithms;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double med1, temp, med2;
        do 
        {
        System.out.println("Digite a medida de temperatura a ser imputada: (1) Celsius (2) Kelvin (3) Farenheit");
        med1 = imput.nextDouble();
        }while(med1<=0 || med1>=4);
        
        System.out.println("Por favor digite a temperatura:");
        temp = imput.nextDouble();
        
        do 
        {
        System.out.println("Digite a medida de temperatura a ser transformada: (1) Celsius (2) Kelvin (3) Farenheit");
        med2 = imput.nextDouble();
        }while(med2<=0 || med2>=4);
        
        if(med1==1 && med2==2)
        {
            double ck = temp+273;
            System.out.println("A temperatura e: "+ck+"K");
        }
        if(med1==1 && med2==3)
        {
            double cf = (1.8*temp)+32;
            System.out.println("A temperatura e: "+cf+"F");
        }
        if(med1==2 && med2==1)
        {
            double kc = temp-273;
            System.out.println("A temperatura e: "+kc+"C");
        }
        if(med1==2 && med2==3)
        {
            double kf = ((temp-273)*1.8)+32;
            System.out.println("A temperatura e: "+kf+"F");
        }
        if(med1==3 && med2==1)
        {
            double fc = (temp-32)/1.8;
            System.out.println("A temperatura e: "+fc+"C");
        }
        if(med1==3 && med2==2)
        {
            double fk = ((temp-32)*0.56)+273;
            System.out.println("A temperatura e: "+fk+"K");
        }
        
        imput.close();
        }
    
}
