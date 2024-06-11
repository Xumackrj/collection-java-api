package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

   public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
   }

   public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado removendoPorCodigo = null;
        for (Convidado rc : convidadoSet){
            if (rc.getCodigoConvite() == codigoConvite){
                removendoPorCodigo = rc;
                break;
            }
        }
        convidadoSet.remove(removendoPorCodigo);
   }

   public int contarConvidados(){
        return convidadoSet.size();
   }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " +convidados.contarConvidados()+ " Dentro do Set de convidados");

        convidados.adicionarConvidado("Lucas", 123456789);
        convidados.adicionarConvidado("convidado 1", 1234);
        convidados.adicionarConvidado("convidado 2", 1235);
        convidados.adicionarConvidado("convidado 3", 1235);
        convidados.adicionarConvidado("convidado 4", 1236);

        convidados.exibirConvidados();

        System.out.println("Existem " +convidados.contarConvidados()+ " Dentro do Set de convidados");

        convidados.removerConvidadoPorCodigoConvite(1235);

        System.out.println("Existem " +convidados.contarConvidados()+ " Dentro do Set de convidados");

    }

}
