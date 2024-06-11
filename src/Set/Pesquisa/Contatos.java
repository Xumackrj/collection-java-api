package Set.Pesquisa;

import java.util.Objects;

public class Contatos {

    private String nome;

    private int numeroTelefone;

    public Contatos(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;

    }

    public String getNome () {
        return nome;
    }

    public int getNumeroTelefone () {
        return numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contatos contatos = (Contatos) o;
        return Objects.equals(nome, contatos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString () {
        return "\nNome = " +nome+
                "\nNumero de Telefone = " + numeroTelefone;
    }


}
