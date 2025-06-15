package Ex_06;
/*6. Uma empresa de desenvolvimento de softwares paga a seus desenvolvedores um salário fixo de R$ 4500,00 por mês,
mais um bônus de R$ 200,00 por bug resolvido. Faça um algoritmo que leia a quantidade de bugs resolvidos por
funcionário e apresente o salário do funcionário.*/

import java.util.Scanner;
public class Ex_6 {
    
    public static void main(String[] args){
        
        Scanner X = new Scanner(System.in);
        System.out.println("Digite a quantidade de bugs resolvidos pelo funcionario neste mes: ");
        int bugs = X.nextInt();
        
        int bonus = bugs * 200;
        double salario = bonus + 4500;
        System.out.println("O salario final sera: "+salario+" reais");
        
    }   
}
