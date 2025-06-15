package Ex_25;
import java.util.Scanner;
public class Ex_25 {
    public static void main(String[] args){
    /*Crie um algoritmo que simule o funcionamento de um radar eletrônico de velocidade. O algoritmo deve permitir ao
usuário digitar um valor de velocidade, apresentar em tela a mensagem “REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE
AO PERMITIDO NA VIA!”, se a velocidade for maior que 90 quilômetros por hora (km/h) ou “VELOCIDADE DO AUTOMÓVEL ESTÁ
ABAIXO DO LIMITE DA VIA”, se a velocidade for menor ou igual a 90 quilômetros por hora (km/h).*/ 
    int limiteVeloc = 90;
    Scanner X = new Scanner(System.in);
        System.out.println("Digite a velocidade(km/h): ");
        double veloc = X.nextDouble();
        
        if(veloc>limiteVeloc){
            System.out.println("REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE AO PERMITIDO NA VIA!");
        }else{
            System.out.println("VELOCIDADE DO AUTOMÓVEL ESTÁ ABAIXO DO LIMITE DA VIA");
        }
    }   
}
