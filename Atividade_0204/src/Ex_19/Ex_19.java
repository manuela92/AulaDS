package Ex_19;

import java.util.Scanner;
public class Ex_19 {
    
    public static void main(String[] args){
    /*Construa um algoritmo que permita ao usuário digitar um valor em dólares, converta
esse valor em reais e apresente em tela o resultado. Cotação do dólar: R$ 5.37.*/
    
    double dolar = 5.37;
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor em dólores: $");
        double valorDolar = X.nextDouble();
        
        double valorReal = valorDolar * dolar;
        System.out.println("Valor convertido para reais: R$"+valorReal);
    }
}
