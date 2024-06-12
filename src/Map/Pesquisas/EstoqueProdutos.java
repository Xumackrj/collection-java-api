package Map.Pesquisas;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> products;

    private EstoqueProdutos () {
        this.products = new HashMap<>();

    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        products.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(products);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0d;
        if (!products.isEmpty()) {
            for (Produto p : products.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto valorMaior = null;
      double maiorPreco = Double.MIN_VALUE;
            if (!products.isEmpty()){
                for (Produto p : products.values()){
                    if (p.getPreco() > maiorPreco) {
                        valorMaior = p;
                        maiorPreco = valorMaior.getPreco();
                    }
                }
            }
            return valorMaior;
        }



    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();
        produtos.exibirProdutos();

        produtos.adicionarProduto(5L, "nome 1", 10, 15.6);
        produtos.adicionarProduto(15L, "nome 2", 11, 10.6);
        produtos.adicionarProduto(7L, "nome 3", 12, 16.6);
        produtos.adicionarProduto(2L, "nome 4", 13, 2.6);

        //produtos.exibirProdutos();

        System.out.println("O valor total do produto é: "+produtos.calcularValorTotalEstoque());




        System.out.println("O produto mais caro é: "+produtos.obterProdutoMaisCaro());


    }

}


