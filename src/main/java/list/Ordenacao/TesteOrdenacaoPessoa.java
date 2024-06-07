package main.java.list.Ordenacao;

public class TesteOrdenacaoPessoa {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1",36,1.65);
        ordenacaoPessoa.adicionarPessoa("Nome 2",25,1.67);
        ordenacaoPessoa.adicionarPessoa("Nome 3",40,1.84);
        ordenacaoPessoa.adicionarPessoa("Nome 4",36,1.65);
        ordenacaoPessoa.adicionarPessoa("Nome 5",30,1.55);


        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }
}
