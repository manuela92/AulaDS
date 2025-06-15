package Ex_28;
import java.util.Scanner;
public class Ex_28 {
    public static void main(String[] args){
   /*Se a frequência do aluno for inferior a 75%, escrever em tela “ALUNO RETIDO POR EXCERDER NÚMERO DE FALTAS”. 
Se a frequência do aluno for maior ou igual a 75%, escrever em tela “ALUNO APROVADO”. */
   
  Scanner X = new Scanner(System.in);
        System.out.println("Digite o numero de aulas previstas: ");
        int aula = X.nextInt();
        
        double minAula = aula * 0.75;
        System.out.println("Minimo de presenças em aula exigidas para aprovaçõ: "+minAula);
        
        System.out.println("Digite a quantidade de presenças do aluno: ");
        int presenca = X.nextInt();
        
        if(presenca>=minAula){
            System.out.println("ALUNO APROVADO");
        }else{
            System.out.println("ALUNO RETIDO POR EXCERDER NÚMERO DE FALTAS");
        }
    }
}