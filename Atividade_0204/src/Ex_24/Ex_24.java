package Ex_24;
import java.util.Scanner;
public class Ex_24 {
    
    public static void main(String[] args){
    /*Faça um algoritmo que permita que o usuário digite o valor de seu salário e calcule um bônus de 10% 
referente a assiduidade e pontualidade. */
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor do salario: R$");
        double salario = X.nextDouble();
        
        double bonus = salario*0.10;
        double total = salario + bonus;
        System.out.println("O valor do bonus: R$"+bonus+"\n"+"Total a receber: R$"+total);
        
    }
}
