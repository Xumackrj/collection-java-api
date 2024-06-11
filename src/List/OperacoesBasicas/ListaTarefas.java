package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefas;

    public ListaTarefas (){
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getDescricao().equalsIgnoreCase(descricao)){
                   tarefasParaRemover.add(tarefas.get(i));
            }
//        for (Tarefa list : tarefas){
//            if(list.getDescricao().equalsIgnoreCase(descricao)){
//                tarefasParaRemover.add(list);
//            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        for (Tarefa lista: tarefas){
            System.out.println("\n"+lista.getDescricao() + "\n-----------------------------");
        }
    }


    public static void main (String[] args){

        ListaTarefas tarefas1 = new ListaTarefas();

        System.out.println("O numero total de tarefas é : " + tarefas1.obterNumeroTotalTarefas());

        tarefas1.adicionarTarefa("tarefa 1");
        tarefas1.adicionarTarefa("tarefa 2");
        tarefas1.adicionarTarefa("tarefa 3");

        System.out.println("O numero total de tarefas é : " + tarefas1.obterNumeroTotalTarefas());


//        tarefas1.removerTarefa("tarefa 1");
        tarefas1.removerTarefa("tarefa 2");

        System.out.println("O numero total de tarefas é : " + tarefas1.obterNumeroTotalTarefas());

        tarefas1.obterDescricoesTarefas();
    }
}

