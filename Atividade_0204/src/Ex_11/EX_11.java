package Ex_11;

import java.util.Scanner;
public class EX_11 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que permita ao usuário digitar um valor em metros (m) e apresente em
tela o valor convertido para centímetros (cm). */
    
    Scanner X = new Scanner(System.in); 
    System.out.println("Digite o valor em metros(m): ");
    double metro = X.nextDouble();
    
    double cm = metro * 100;
        System.out.println("Valor em centimetros(cm): "+cm);
    }
}
