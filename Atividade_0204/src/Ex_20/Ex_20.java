package Ex_20;

import java.util.Scanner;
public class Ex_20 {
   
    public static void main(String[] args){
    /*Construa um algoritmo que permita ao usuário digitar 4 números, calcule o quadrado de cada número digitado,
some os valores e apresente em tela o resultado.*/
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = X.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = X.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = X.nextInt();
        System.out.println("Digite o ultimo numero: ");
        int n4 = X.nextInt();
        
        int soma = (n1*n1)+(n2*n2)+(n3*n3)+(n4*n4);
        System.out.println("Resultado da soma do quadrado dos numeros: "+soma);         
    }
}
