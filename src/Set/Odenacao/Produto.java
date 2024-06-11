package Set.Odenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private long cod;

    private String nome;

    private double preco;

    private int quantidade;

    public Produto (long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public long getCod () {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString () {
        return "\nCodigo = "+cod+
                "\nNome = "+nome+
                "\nPreço = "+preco+
                "\nQuantidade = "+quantidade;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return nome.compareTo(outroProduto.getNome());
    }
}
