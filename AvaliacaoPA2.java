
import java.util.Scanner;


public class AvaliacaoPA2 {
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
    //Entrada de dados
    String meuNome = Daniel;
    int minhaIdade = 19;
    int meuPeso = 60;
    double minhaAltura = 1.77;
    String meuArtista = Future;
    String meuFilme = NightonEarth;
    String minhaSerie = TheSopranos;
    
    //Execução
    System.out.println("Digite seu nome:");
    String nome = nextString();
    if (nome == meuNome) {
    System.out.println("Pessoa com mesmo nome");
    } else {
    System.out.println("Pessoa com nome diferente");
    }
    
    System.out.println("Digite sua idade");
    int idade = nextInt();
    if (idade == minhaIdade){
    System.out.println("Pessoa com a mesma idade");
    } else {
    System.out.println("Pessoa com idade diferente");
    }
    
    System.out.println("Digite o seu peso:");
    int peso = nextInt();
    if (peso == meuPeso) {
    System.out.println("Pessoa com mesmo peso");
    } else {
    System.out.println("Pessoa com peso diferente");
    }
    
    System.out.println("Digite sua altura:");
    double altura = nextInt();
    if(altura == minhaAltura){
    System.out.println("Pessoa com a mesma altura");
    } else {
    System.out.println("Pessoa com altura diferente");
    }
    
    System.out.println("Digite o nome de seu artista favorito");
    String artista = nextString();
    if (artista == meuArtista){
    System.out.println("Pessoa com gostos iguais");
    } else {
    System.out.println("Pessoa com gostos diferentes");
    }
    
    System.out.println("Digite o nome do seu filme favorito");
    String filme = nextString();
    if (filme == meuFilme){
    System.out.println("Pessoa com gosto parecido");
    } else {
    System.out.println("Pessoa com outro filme favorito");
    }
    
    System.out.println("Digite o nome da sua serie favorita:");
    String serie = nextString();
    if (serie == minhaSerie){
    System.out.println("Pessoa com serie favorita igual");
    } else {
    System.out.println("Pessoa com gosto diferente");
    }
    
    Scanner.close();
    
    }
}
