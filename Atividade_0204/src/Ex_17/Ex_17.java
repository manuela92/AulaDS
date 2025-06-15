package Ex_17;

import java.util.Scanner;
public class Ex_17 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que permita ao usuário digitar um valor em segundos e 
apresente em tela o valor convertido para minutos.*/
    
    Scanner X = new Scanner(System.in);
    System.out.println("Digite o valor em segundos: ");
        double seg = X.nextDouble();
        
        double min = seg / 60;
        System.out.println("Valor em minutos: "+min);
    }
}
