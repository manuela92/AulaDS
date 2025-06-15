package Ex_05;
/*5. Faça um algoritmo que solicite ao usuário o seu peso e altura.
O programa deve calcular e Indice de Massa Corporal (IMC). A formula é: imc = peso/(altura2)*/

import java.util.Scanner;
public class Ex_5 {
    
    public static void main(String[] args){
        
        Scanner X = new Scanner(System.in);
        System.out.println("Digite seu peso em kgs: ");
        double peso = X.nextDouble();
        
        System.out.println("Digite sua altura: ");
        double altura = X.nextDouble();
        
        double imc = peso/(altura*altura);
        System.out.println("Seu IMC: "+imc);
    } 
}
