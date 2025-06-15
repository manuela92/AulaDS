package Ex_02;
import java.util.Scanner;
public class Ex_2 {

    public static void main(String[] args) {
        double valorConducao = 5.20;
        int valorPorDia = 4;
        int mes = 30;
        
        double gastoPorDia = valorConducao * valorPorDia;
        double gastoPorMes = gastoPorDia * mes;
        
        System.out.println(" O gasto diario de transporte coletivo e " + gastoPorDia);
        System.out.println(" O gasto mensal de transporte coletivo e " + gastoPorMes);
    }
    
}
