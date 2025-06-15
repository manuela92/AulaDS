package Ex_21;
import java.util.Scanner;
public class Ex_21 {
    
    public static void main(String[] args){
    /*Construa um algoritmo para o pagamento de comissão de vendedores de peças levando-se em consideração
que sua comissão será de 5% do total da venda. Considere os seguintes dados: valor unitário da peça e
quantidade de peças vendidas.*/
    
    Scanner X = new Scanner(System.in);
        System.out.println("Digite o valo da peça: R$");
        double valorP = X.nextDouble();
        System.out.println("Digite a quantidade de peças vendidas pelo vendedor: ");
        int quant = X.nextInt();
        
        double comissao = (valorP * 0.05)*quant;
        System.out.println("O valor da comissão sera: R$"+comissao);
    }
}
