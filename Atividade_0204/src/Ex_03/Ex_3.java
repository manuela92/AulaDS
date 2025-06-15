package Ex_03;

/*3. Construa um algoritmo em que o usuário digite a data de nascimento e calcule a idade de uma pessoa. 
ATENÇÃO: para esse exercício o mês não deverá ser considerado.*/
import java.util.Scanner;

public class Ex_3 {
    
    public static void main(String[] args) {
        
        Scanner X = new Scanner(System.in);
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = X.nextInt();
        
        System.out.println("Digite o mes do seu nascimento: ");
        int mes = X.nextInt();
        
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = X.nextInt();
        
        int idade = 2025 - ano;
        System.out.println("Sua idade é: " + idade);
    }  
}
