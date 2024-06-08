package PesquisasComList;

import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros {

    private List<Livro> listLivro;


    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        listLivro.add(new Livro(titulo, autor, anoDePublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> resultadoPesquisa = new ArrayList<>();
        if (!listLivro.isEmpty()){
            for (int i = 0; i  < listLivro.size(); i++){
                if (listLivro.get(i).getAutor().equalsIgnoreCase(autor)){
                    resultadoPesquisa.add(listLivro.get(i));
                }
            }
        }
        return resultadoPesquisa;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> tempoLivros = new ArrayList<>();
        if (!listLivro.isEmpty()){
            for (Livro t : listLivro){
                if(t.getAnoDePublicacao() >= anoInicial && t.getAnoDePublicacao() <= anoFinal){
                    tempoLivros.add(t);
                }
            }
        }
        return tempoLivros;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listLivro.isEmpty()){
            for (Livro t : listLivro){
                if (t.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = t;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }



    //UM NOVA FORMA DE PESQUISAR POR TITULO
/*    public Livro pesquisarPorTitulo(String titulo){
        List<Livro> pesquisaTitulo = new ArrayList<>();
        int indice = 0;
        if (!listLivro.isEmpty()){
            for (int pesquisa = 0; pesquisa < listLivro.size(); pesquisa++){
                if (listLivro.get(pesquisa).getTitulo().equalsIgnoreCase(titulo)){
                    pesquisaTitulo.add(listLivro.get(pesquisa));

                }
            }
        }
        return pesquisaTitulo.get(indice);
    }*/

    public static void main (String[] args) {

        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("o segredo dos animais","eduardo sasha", 2005);
        livros.adicionarLivro("livro 1","autor 1", 2020);
        livros.adicionarLivro("livro 1","autor 2", 2021);
        livros.adicionarLivro("livro 2","autor 2", 2022);
        livros.adicionarLivro("livro 3","autor 3", 2022);
        livros.adicionarLivro("livro 4","autor 4", 2023);
        livros.adicionarLivro("livro 5","autor 5", 2024);
        livros.adicionarLivro("livro 6","autor 6", 1974);


        System.out.println(livros.pesquisarPorAutor("autor 2"));
        System.out.println(livros.pesquisarPorTitulo("livro 1"));
        System.out.println(livros.pesquisarPorIntervaloAnos(2020, 2023));


    }

}
