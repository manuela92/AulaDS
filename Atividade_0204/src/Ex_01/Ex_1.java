 package Ex_01;

import java.util.Scanner;
public class Ex_1 {

    public static void main(String[] args) {
    /* 1. Construa um algoritmo para somar dois números digitados 
    pelo usuário e multiplicar o resultado pelo primeiro.*/
    
    Scanner X = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    double valor1 = X.nextDouble();
    
    System.out.println("Digite o segundo valor: ");
    double valor2 = X.nextDouble();
    
    double resultadoSoma = valor1 + valor2;
    System.out.println("O valor da soma e " + resultadoSoma);
    
    double resultadoMulti = resultadoSoma * valor1;
        System.out.println("A multiplicacao do resultado pelo primeiro valor e: " + resultadoMulti);
    }
    
}
