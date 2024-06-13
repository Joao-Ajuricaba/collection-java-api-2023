package main.java.map.OperacoesBasicas;

public class TestarAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Camila",123456);
        agendaContatos.adicionarContato("Camila",5665);
        agendaContatos.adicionarContato("Camila Cavalcante",1111111);
        agendaContatos.adicionarContato("Camila Dio",654987);
        agendaContatos.adicionarContato("Maria Silva",11111111);
        agendaContatos.adicionarContato("Camila",4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Camila");
        agendaContatos.exibirContatos();

        System.out.println("O número é : "+agendaContatos.pesquisarPorNome("Camila Dio"));

    }
}
