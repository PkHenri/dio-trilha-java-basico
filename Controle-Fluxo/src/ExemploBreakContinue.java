public class ExemploBreakContinue {
    public static void main(String[] args) {
        // Exemplo de break
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3){
                break;
            }
            System.out.println("número " + numero);
        }

        // Exemplo de continue
        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3){
                continue;
            }
            System.out.println("numero " + numero);
        }
    }
}
