package Ex_10;

import java.util.Scanner;
public class Ex_10 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que o usuário digite o valor de mililitros (ml) e calcule a conversão para litros 
    e apresente o resultado na tela. */
    
    Scanner X = new Scanner(System.in);
    System.out.println("Digite a quantidade em mililitros(ml): ");
    double ml = X.nextDouble();
    
    double litro = ml / 1000;
        System.out.println("Quantidade em litros: "+litro);
    
    
   }
}
