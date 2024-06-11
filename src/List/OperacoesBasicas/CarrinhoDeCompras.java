package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> lixeira = new ArrayList<>();
        if (!listaItens.isEmpty()){
            for (int i = 0; i < listaItens.size(); i++){
                if (listaItens.get(i).getNome().equalsIgnoreCase(nome)){
                    lixeira.add(listaItens.get(i));
                }
            }
        listaItens.removeAll(lixeira);
        }
        else {
            System.out.println("Impossivel remover um carrinho de compras vazio");
        }
    }

    public double calcularValorTotal(){
        double totalItem = 0d;
        if(!listaItens.isEmpty()){
            for (Item item : listaItens){
                double valorTotal = item.getPreco() * item.getQuantidade();
                totalItem += valorTotal;
            }
            return totalItem;
        }
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    @Override
    public String toString() {
        return "\nCarrinhoDeCompras: " + listaItens;
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("tomate", 5.70, 5);
        carrinho.adicionarItem("ervilha", 1.70, 10);
        carrinho.adicionarItem("arroz", 37.90, 3);

        carrinho.exibirItens();

        carrinho.removerItem("ervilha");

        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());




    }



}
