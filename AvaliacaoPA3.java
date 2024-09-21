
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Daniel
 */
public class AvaliacaoPA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       System.out.print("Digite o valor total da fatura:");
       int valorFatura = scanner.nextInt();
       
       //Entrada de dados
       System.out.print("Digite o numero de parcelas:");
       int numParcelas = scanner.nextInt();
       double multaV = 0.15;       
       double descontoV = 10;
       int parcelasreal = valorFatura/numParcelas;
       double descontopagamento = valorFatura - (valorFatura/descontoV);
       double multaparcelas = parcelasreal + (parcelasreal * multaV);
       double valormulta = parcelasreal * multaV;
     
       //Saída de dados
       System.out.println("Valor das parcelas: "+parcelasreal);
       System.out.println("Valor fatura com desconto: "+descontopagamento);
       System.out.println("Valor parcela com multa: "+multaparcelas);
       System.out.println("Valor multa cada parcela: "+valormulta);
    
    }
}

