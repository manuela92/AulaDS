package Ex_14;

import java.util.Scanner;
public class Ex_14 {
   
    public static void main(String[] args){
    /*Faça um algoritmo que permita ao usuário digitar um valor em horas e apresente
em tela o valor convertido para minutos.*/
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor em horas: ");
        double hora = X.nextDouble();
        
        double min = hora * 60;
        System.out.println("Valor em minutos: "+min);
    }
}
