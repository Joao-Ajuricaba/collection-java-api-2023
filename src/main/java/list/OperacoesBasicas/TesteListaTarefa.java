package main.java.list.OperacoesBasicas;
/*
*
* */
public class TesteListaTarefa {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista : "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");
        listaTarefa.adicionarTarefa("Tarefa 6");

        listaTarefa.removerTarefa("tarefa 6");
        System.out.println("O número total de elementos na lista : "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
