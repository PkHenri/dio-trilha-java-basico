import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // Criando objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            // Solicitando e lendo o nome do usuário
            System.out.print("Qual é o seu nome? ");
            String nome = scanner.nextLine();

            // Solicitando e lendo o sobrenome do usuário
            System.out.print("Qual é o seu sobrenome? ");
            String sobrenome = scanner.nextLine();

            // Solicitando e lendo a idade do usuário
            System.out.print("Quantos anos você tem? ");
            int idade = scanner.nextInt();
            // Solicitando e lendo a altura do usuário
            System.out.print("Qual é a sua altura (em metros)? ");
            double altura = scanner.nextDouble();

            // Imprimindo as informações do usuário
            System.out.println("Olá, " + nome + " " + sobrenome + "!");
            System.out.println("Você tem " + idade + " anos e sua altura é " + altura + " metros.");
        } catch (InputMismatchException e){
            System.out.println("Os campos idade e altura devem ser numéricos.");
        }
    }
}
