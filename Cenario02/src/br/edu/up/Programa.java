package br.edu.up;

public class Programa {
    public static void main(String[] args) {
        // Livro 01
        String[] autoresLivro1 = {"Cay S. Horstmann", "Gary Cornell"};
        Livro livro1 = new Livro("1598FHK", "Core Java 2", autoresLivro1, "0130819336", 2005);

        // Livro 02
        String[] autoresLivro2 = {"Harvey Deitel"};
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", autoresLivro2, "0130341517", 2015);

        // Apresentar dados dos livros
        System.out.println("Livro 01:");
        System.out.println(livro1);
        System.out.println();

        System.out.println("Livro 02:");
        System.out.println(livro2);
    }
}
