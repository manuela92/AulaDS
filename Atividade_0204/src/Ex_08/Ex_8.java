package Ex_08;

import java.util.Scanner;
public class Ex_8 {
    
    public static void main(String[] args) {
    /*Faça um algoritmo que o usuário digite dois valores e apresente na tela o resultado das seguintes 
operações: soma, subtração, divisão e produto.*/
    
    Scanner X = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    double valor1 = X.nextDouble();
    
    System.out.println("Digite o segundo valor: ");
    double valor2 = X.nextDouble();
    
    double resultadoSoma = valor1 + valor2;
    System.out.println("Soma dos valores: " + resultadoSoma);
    double resultadoSubt = valor1 - valor2;
    System.out.println("Resultado do primeiro valor menos o segundo: " + resultadoSubt);
    double resultadoDivisao = valor1/valor2;
    System.out.println("Resultado da divisao do primeiro valor pelo segundo: " + resultadoDivisao);
    double resultadoMulti = valor1 * valor2;
    System.out.println("Produto da multiplicacao dos valores: " + resultadoMulti);
    
    }
}
