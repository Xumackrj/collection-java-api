package Set.Odenacao;

import java.util.*;

public class CadastroProdutos {

    Set<Produto> produtosSet;


    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> conjuntoOrdenado = new TreeSet<>(produtosSet);
        return conjuntoOrdenado;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> conjuntoPreco = new TreeSet<>(Comparator.comparing(Produto::getPreco));
        conjuntoPreco.addAll(produtosSet);
        return conjuntoPreco;
    }


    public static void main(String[] args) {
        CadastroProdutos produtinhos = new CadastroProdutos();

        produtinhos.adicionarProduto(1L, "produto (A)5", 15d, 5);
        produtinhos.adicionarProduto(2L, "produto (B)0", 20d, 10);
        produtinhos.adicionarProduto(1L, "produto (C)3", 10d, 2);
        produtinhos.adicionarProduto(9L, "produto (D)9", 2d, 2);

        System.out.println(produtinhos.produtosSet +"\n\nExibição Por Nome:\n--------------------");

        System.out.println(produtinhos.exibirProdutosPorNome() + "\n\nExibição Por Preço:\n--------------------");

        System.out.println(produtinhos.exibirProdutosPorPreco());

    }


}
