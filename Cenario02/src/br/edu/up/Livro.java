package br.edu.up;



public class Livro {
    private String codigo;
    private String titulo;
    private String[] autores;
    private String isbn;
    private int ano;

    public Livro(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        StringBuilder autoresStr = new StringBuilder();
        for (String autor : autores) {
            autoresStr.append(autor).append(", ");
        }
        // Remove the last comma and space
        if (autoresStr.length() > 0) {
            autoresStr.setLength(autoresStr.length() - 2);
        }
        return "Código: " + codigo + "\n" +
               "Título: " + titulo + "\n" +
               "Autores: " + autoresStr + "\n" +
               "ISBN: " + isbn + "\n" +
               "Ano: " + ano;
    }
}


