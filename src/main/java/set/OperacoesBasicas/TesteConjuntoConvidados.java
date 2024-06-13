package main.java.set.OperacoesBasicas;

public class TesteConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados= new ConjuntoConvidados();

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+ " dentro do set de Convidados ");

        conjuntoConvidados.adicionarConvidado("CONVIDADO 1 ",1234);
        conjuntoConvidados.adicionarConvidado("CONVIDADO 2 ",1234);
        conjuntoConvidados.adicionarConvidado("CONVIDADO 3 ",1236);
        conjuntoConvidados.adicionarConvidado("CONVIDADO 4 ",1237);

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+ " dentro do set de Convidados ");

        //conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);

        conjuntoConvidados.exibirConvidados();

    }
}
