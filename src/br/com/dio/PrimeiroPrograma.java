package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main (String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("Good Omens", 267);
        System.out.println(livro);
    }
}

class Livro {
    private String nome;
    private Integer numeroPaginas;

    public Livro(String nome, Integer numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "nome = '" + nome + '\'' +
                ", número de páginas =" + numeroPaginas;
    }
}