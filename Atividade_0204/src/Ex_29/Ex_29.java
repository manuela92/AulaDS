package Ex_29;
import java.util.Scanner;
public class Ex_29 {
    public static void main(String[] args){
    /*A Frequência Cardíaca normal de uma pessoa é de 60 a 100 batimentos por minuto. Construa um algoritmo que 
permita ao usuário digitar o valor de sua frequência cardíaca e verifique este valor com base nas regras abaixo: 
Se o valor que Frequência Cardíaca estiver abaixo de 60, escreva em tela “BRADIQUICARDIA”; 
Se o valor que Frequência Cardíaca for maior ou igual a 60 e menor ou igual a 100, escreva em tela “NORMOCARDIA”; 
Se o valor que Frequência Cardíaca for maior ou igual a 100, escreva em tela “TAQUICARDIA”. */  
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valor de sua frequencia cardiaca: ");
        int freq = X.nextInt();
        
        if(freq<60){
            System.out.println("BRADIQUICARDIA");
        }else if(freq>=60&&freq<=100){
            System.out.println("NORMOCARDIA");
        }else{
            System.out.println("TAQUICARDIA");
        }
    }
}