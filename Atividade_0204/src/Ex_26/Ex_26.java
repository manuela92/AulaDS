package Ex_26;
import java.util.Scanner;
public class Ex_26 {
     public static void main(String[] args){
     /* Crie um algoritmo que permita que o usuário digite o valor de peso de um lutador do UFC e o valor de peso
máximo permitido para sua categoria. Se o valor do peso for menor ou igual ao valor de peso máximo permitido,
apresentar na tela a mensagem “O lutador está com peso dentro do permitido para sua categoria”. Se o valor do peso
for maior que o valor de peso máximo permitido, apresentar na tela a mensagem “O lutador está com peso acima do 
permitido para sua categoria”. */
     
     Scanner X = new Scanner(System.in);
        System.out.println("Digite o peso do lutador(kg): ");
        double pesoLutador = X.nextDouble();
         System.out.println("Digite o peso maximo para a categoria: ");
        double pesoMax = X.nextDouble();
        
        if(pesoLutador<=pesoMax){
            System.out.println("O lutador está com peso dentro do permitido para sua categoria");
        }else{
            System.out.println("O lutador está com peso acima do permitido para sua categoria");
        }
     }
}
