package Ex_30;
import java.util.Scanner;
public class Ex_30 {
    public static void main(String[] args){
    /*A Frequência Respiratório normal de uma pessoa é de 12 a 20 respirações por minuto. Construa um algoritmo que
permita ao usuário digitar o valor de sua frequência respiratória e verifique este valor com base nas regras abaixo: 
Se o valor que Frequência respiratória estiver abaixo de 12, escreva em tela “BRADIPNEIA”; 
Se o valor que Frequência respiratória for maior ou igual a 12 e menor ou igual a 20, escreva em tela “EUPNEIA”; 
Se o valor que Frequência respiratoria for maior ou igual a 20, escreva em tela “TAQUIPNEIA”.*/
     Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor de sua frequencia respiratoria: ");
        int freq = X.nextInt();
        
        if(freq<12){
            System.out.println("BRADIPNEIA");
        }else if(freq>=12&&freq<=20){
            System.out.println("EUPNEIA");
        }else{
            System.out.println("TAQUIPNEIA");
        }
    }
}
   

