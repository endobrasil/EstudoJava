package list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. Lista de Tarefas
 * 			Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo.
 * 			Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição.
 * 			Implemente os seguintes métodos:
 *
 * 			* adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
 * 			* removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
 * 			* obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
 * 			* obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
 * */
public class ListaTarefas {
    //atributo

    private List<Tarefas> listTarefa;

    public ListaTarefas() {
        this.listTarefa = new ArrayList<>();
    }

    //adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
    public void adicionarTarefa(String descricao){
        listTarefa.add(new Tarefas(descricao));
    }

    //removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
    //remove as tarefas que tem as descrição iguais as descrições
    //que estou passando aqui, o uso do laço de repetição é por conta
    //que podem ter mais de uma tarefa com a mesma descrição...
    public void removerTarefa(String descricao){
        List<Tarefas> tarefasRemover = new ArrayList<>();

        for (Tarefas t:listTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        listTarefa.removeAll(tarefasRemover);
    }

    //obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
    public int obterNumeroTotalTarefas(){
        return listTarefa.size();
    }

    //obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.
    public void obterDescricoesTarefas(){
        System.out.println(listTarefa);
    }

    //para poder testar...
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Número de tarefas cadastradas: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");

        System.out.println("Número de tarefas cadastradas: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("tarefa 2");

        System.out.println("Número de tarefas cadastradas: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();


    }
}
