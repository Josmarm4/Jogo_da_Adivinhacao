import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroSorteado = new Random().nextInt(100);
        int tentativas = 1;

        System.out.println("--------------------------------------");
        System.out.println("Jogo da Adivinhação");
        System.out.println("Escolha um número entre 0 e 100.");
        System.out.println("--------------------------------------");
        int chute = leitura.nextInt();

        while(tentativas < 5){
            if (chute == numeroSorteado) {
                System.out.println("Parabéns você acertou o número sorteado!!!");
                break;
            }else {
                if (chute > numeroSorteado) {
                    System.out.println("O número sorteado é menor.");
                } else {
                    System.out.println("O número sorteado é maior.");
                }
                tentativas++;
                if (tentativas < 5){
                    chute = leitura.nextInt();
                }
            }
       }
        if (tentativas >= 5 && chute != numeroSorteado){
            System.out.println("Suas tentativas acabaram. O numero sorteado era " + numeroSorteado);
        }
    }
}