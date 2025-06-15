package Ex_09;

import java.util.Scanner;
public class Ex_9 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que o usuário digite o valor de litros e calcule a conversão em mililitros e apresente
o resultado na tela.*/
    
    Scanner X = new Scanner(System.in);
    System.out.println("Digite a quantidade em litros: ");
    double litro = X.nextDouble();
    
    double ml = litro * 1000;
        System.out.println("Quantidade em ml: "+ml);
    
    
    }
}
