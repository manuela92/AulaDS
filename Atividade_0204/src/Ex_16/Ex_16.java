package Ex_16;

import java.util.Scanner;
public class Ex_16 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que permita ao usuário digitar um valor em minutos e 
apresente em tela o valor convertido para segundos.*/
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor em minutos: ");
        double min = X.nextDouble();
        
        double seg = min * 60;
        System.out.println("Valor em segundos: "+seg);
       
    }
}
