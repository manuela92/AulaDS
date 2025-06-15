package Ex_27;
import java.util.Scanner;
public class Ex_27 {
    public static void main(String[] args){
   /*Considerando que o aluno precisa ter frequência igual ou maior que 75% para sua aprovação, faça um algoritmo que
permita ao professor digitar o número de aulas previstas de sua disciplina durante um semestre, calcule o mínimo de
presenças em aula que o aluno precisa acumular para a sua aprovação e apresente esse valor em tela. */
   
  Scanner X = new Scanner(System.in);
        System.out.println("Digite o numero de aulas previstas: ");
        int aula = X.nextInt();
        
        double minAula = aula * 0.75;
        System.out.println("Minimo de presenças em aula exigidas para aprovaçõ: "+minAula);
    }
}
