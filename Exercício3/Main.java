public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Minha Vida Fora de Serie", 89.90, "Paula Pimenta", 300, true);
        Camisa camisa = new Camisa("Camisa Vans", 120.50, "Azul", "G", "Algodao");

        System.out.println("Informações do Livro:");
        livro.exibirInfo();

        System.out.println("\nInformações da Camisa:");
        camisa.exibirInfo();
    }
}