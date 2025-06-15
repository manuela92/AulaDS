package Ex_07;
/*7. Uma loja de automóveis paga a seus vendedores um fixo de R$ 2000,00 por mês, mais um bônus de R$ 100,00 por
automóvel vendido a vista. Faça um algoritmo que leia a quantidade de automóveis vendidos por um funcionário e 
apresente o salário do funcionário.*/

import java.util.Scanner;
public class Ex_7 {
    
    public static void main(String[] args){
        
        Scanner X = new Scanner(System.in);
        System.out.println("Digite a quantidade de automoveis vendidos a vista pelo funcionario: ");
        int automoveisVendidos = X.nextInt();
        
        int bonus = 100 * automoveisVendidos;
        double salario = bonus + 2000;
        System.out.println("O salario final do funcionario sera: "+salario+" reais.");
    }
}
