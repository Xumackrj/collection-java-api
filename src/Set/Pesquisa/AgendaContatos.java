package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contatos> contatos;

    public AgendaContatos () {

        this.contatos = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero) {
        contatos.add(new Contatos(nome, numero));

    }

    public void exibirContatos() {
        System.out.println(contatos);

    }


    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> nomesContatos = new HashSet<>();
        if (!contatos.isEmpty()){
            for (Contatos passando : contatos){
                if(passando.getNome().equalsIgnoreCase(nome)){
                    nomesContatos.add(passando);
                }
            }
        }
        return nomesContatos;

    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        Contatos novoContato = null;
        if (!contatos.isEmpty()){
            for (Contatos passandoNumero : contatos){
                if (passandoNumero.getNome().equalsIgnoreCase(nome)){
                    novoContato = passandoNumero;
                    contatos.remove(novoContato);
                    contatos.add(new Contatos(nome, novoNumero));
                    break;
                }
            }

        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatos=" + contatos +
                '}';
    }

    public static void main (String[] args) {

        AgendaContatos contatos1 = new AgendaContatos();

        contatos1.adicionarContato("telefone 1", 123456789);
        contatos1.adicionarContato("telefone 1", 1234567815);
        contatos1.adicionarContato("telefone 2", 1234567810);
        contatos1.adicionarContato("telefone 3", 1234567811);
        contatos1.adicionarContato("telefone 4", 1234567812);

        //System.out.println(contatos1.pesquisarPorNome("telefone 1"));

        //System.out.println(contatos1);

        //contatos1.exibirContatos();
        contatos1.exibirContatos();
        //System.out.println(contatos1.pesquisarPorNome("telefone 3"));

        contatos1.atualizarNumeroContato("telefone 3", 1234567891);

        //System.out.println(contatos1.pesquisarPorNome("telefone 3"));

        contatos1.exibirContatos();
    }
}
