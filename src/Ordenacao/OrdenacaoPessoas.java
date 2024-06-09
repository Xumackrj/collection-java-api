package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> ordenacao;

    public OrdenacaoPessoas (){
        this.ordenacao = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        ordenacao.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> peopleList = new ArrayList<>(ordenacao);
        Collections.sort(peopleList);
        return peopleList;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> peopleList2 = new ArrayList<>(ordenacao);
        Collections.sort(peopleList2, new comparatorPorAltura());
        //peopleList2.sort(Comparator.comparing(Pessoa::getAltura));// Segunda forma de ordenar
        return peopleList2;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas nPessoa = new OrdenacaoPessoas();
        nPessoa.adicionarPessoa("Nome 1", 20,1.56);
        nPessoa.adicionarPessoa("Nome 2", 30,1.80);
        nPessoa.adicionarPessoa("Nome 3", 25,1.70);
        nPessoa.adicionarPessoa("Nome 4", 17,1.56);

        System.out.println(nPessoa.ordenarPorIdade());
        //System.out.println(nPessoa.ordenarPorAltura());

    }




}
