package Ex_18;

import java.util.Scanner;
public class Ex_18 {
    
    public static void main(String[] args){
    /*Um cliente de um banco possui em sua conta corrente um saldo de R$ 20000,00. Crie um algoritmo que permita
ao cliente digitar o valor desaque que deseja realizar e calcule e apresente em tela o novo saldo do cliente.*/ 
    
    double saldoInicial = 20000; 
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor do saque que deseja fazer: R$ ");
        double saque = X.nextDouble();
        
        double saldoFinal= saldoInicial - saque;
        System.out.println("Seu saldo atual é: R$"+saldoFinal); 
    }
}
