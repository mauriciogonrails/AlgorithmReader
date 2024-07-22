import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numeroGerado = new Random().nextInt(100);
        int guessed = 0;
        int numeroDigitado = 0;

        while (guessed < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = scanner.nextInt();
            guessed++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + guessed + " tentativas!");
                break;
            }   else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        } scanner.close();

        if (guessed  ==  5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}





