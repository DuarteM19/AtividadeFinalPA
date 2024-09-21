
import java.util.Scanner;

public class AvaliacaoPA {

    public static void main(String[] args) {
    //"Utilizando o conceito de operador lógico e relacional, programe os códigos em Java a seguir:"
   
    //Abertura Scanner
    Scanner scanner = new Scanner(System.in);
        
    //Entrada de dados
    String sobrenome = Duarte;
    
    //Execução
    System.out.println("Digite sua idade:");
        int idade = nextInt();
        if(idade >= 21){
        System.out.println("Mais de 21 anos");
        } else {
        System.out.println("Menor de 21 anos");
        }
        
        System.out.println("Digite o valor do seu salario:");
        int salario = nextInt();
        if(salario >= 1412 * 5){
        System.out.println("Salario maior que 5 salario minimo");
        } else {
        System.out.println("Salario menor que 5 salario minimo");
        }
        
        System.out.println("Digite sua altura:");
        double altura = nextDouble;
        if (altura >= 1.75){
        System.out.println("Maior que 1,75m");
        } else {
        System.out.println("Menor que 1,75m");
        }
        
        System.out.println("Digite o seu peso");
        int peso = nextInt;
        if(peso >= 70) {
        System.out.println("Maior que 70kg");
        } else{
        System.out.println("Menor que 70kg");
        }
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome2 = nextString();
        if(sobrenome2 == sobrenome){
        System.out.println("Sobrenome igual ao meu");
        } else {
        System.out.println("Sobrenome diferente");
        }
        
        System.out.println("Digite seu genero utilizando (M) ou (F)");
        char sexo = nextChar();
        if (sexo != F) {
        System.out.println("Diferente de F");
        } else {
        System.out.println("Igual a F");
        }
        
        scanner.close();
    }

    private static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
