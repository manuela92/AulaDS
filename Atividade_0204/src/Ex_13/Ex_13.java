package Ex_13;

import java.util.Scanner;
public class Ex_13 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que permita ao usuário digitar um valor em quilômetros (km)
e apresente em tela o valor convertido para metros (m).*/
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor em quilometros(km): ");
        double km = X.nextDouble();
        
        double metro = km * 1000;
        System.out.println("Valor em metros(m): "+metro);
    }
}
