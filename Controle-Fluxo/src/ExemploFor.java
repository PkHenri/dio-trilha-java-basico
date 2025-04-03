public class ExemploFor {
    public static void main(String[] args) {
        for (int carneirinho = 1; carneirinho <= 10; carneirinho++){
           System.out.println("Carneirinho " + carneirinho);
        }
        // Exemplo de for com array
        String[] nomes = {"Ana", "Bia", "Cris", "Dani", "Eva"};
        for (int i = 0; i < nomes.length; i++){
            System.out.println("Nome: " + nomes[i]);
        }

        // Exemplo de for com array e foreach
        for (String nome : nomes){
            System.out.println("Nome: " + nome);
        }
    }
}
