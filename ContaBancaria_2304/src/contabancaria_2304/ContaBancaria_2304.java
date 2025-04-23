package contabancaria_2304;

import java.util.Scanner;
public class ContaBancaria_2304 {

    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeCliente = X.nextLine();
        
        System.out.println("Digite o número da conta: ");
        int contaCorrente = X.nextInt();
    
        System.out.println("Digite a agencia: ");
        String agencia = X.next();
        
        System.out.println("Digite o saldo: ");
        double saldo=X.nextDouble();
        
        System.out.println("----Dados do Cliente----"+"\n"+
        "Sr(a): "+nomeCliente+"\n"+"Numero da Conta Corrente: "
        +contaCorrente+"\n"+"Numero da Agencia: "+agencia
        +"\n"+"Valor do saldo atual: R$"+saldo);
    
}
}