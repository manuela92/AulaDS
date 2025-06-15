package Ex_12;

import java.util.Scanner;
public class Ex_12 {
/*Faça um algoritmo que permita ao usuário digitar um valor em centímetros (cm) e 
apresente em tela o valor convertido para metros (m). */
    
    public static void main(String[] args){
        
        Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor em centimetros(cm): ");
        double cm = X.nextDouble();
        
        double metro = cm / 100;
        System.out.println("Valor em metros(m): "+metro);
        
    } 
    
}
