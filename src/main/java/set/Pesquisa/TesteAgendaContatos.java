package main.java.set.Pesquisa;

public class TesteAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContatos("J",1245);
        agendaContatos.adicionarContatos("J",1245);
        agendaContatos.adicionarContatos("D",12435);

        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("J",123456);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("J"));
    }
}
