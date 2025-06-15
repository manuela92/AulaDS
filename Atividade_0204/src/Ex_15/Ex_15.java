package Ex_15;

import java.util.Scanner;
public class Ex_15 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que permita ao usuário digitar um valor em minutos e apresente
em tela o valor convertido para horas. */
    
     Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor em minutos: ");
        double min = X.nextDouble();
        
        double hora = min / 60;
        System.out.println("Valor em horas: "+hora);
       
    }
}
