import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: R$" + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: R$" + mesada);
        System.out.println("Joao não pode mais comprar doces");
}
private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
}
}
