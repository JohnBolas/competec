/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️
        Scanner sc = new Scanner(System.in);

        double valorLaranja = sc.nextDouble(); 
        double valorUva = sc.nextDouble();
        double soma = valorLaranja + valorUva;
        System.out.println(soma);
        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        int somaIdade = idade1 + idade2;
        System.out.println(somaIdade);

    }
}
