package Ex_04;

/*4. Faça um algoritmo que solicite ao usuário o seu peso. O programa deve calcular e apresentar a quantidade
de água,em litros, que deve ser ingerida ao longo de um dia. A formula é: qtdAgua = peso * 0.040.*/

import java.util.Scanner;
public class Ex_4 {
    
    public static void main(String[] args) {
        
        Scanner X = new Scanner(System.in);
        System.out.println("Digite seu peso em kgs: ");
        double peso = X.nextDouble();
        
        double qtdAgua = peso * 0.040;
        System.out.println("Voce deve beber "+qtdAgua+"L de agua por dia");
        
    }
}
