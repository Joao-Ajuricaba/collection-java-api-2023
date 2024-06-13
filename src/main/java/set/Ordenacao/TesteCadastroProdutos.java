package main.java.set.Ordenacao;

public class TesteCadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1,"Guitarra",568.87,1);
        cadastroProdutos.adicionarProduto(2,"Guitarra",668.57,2);
        cadastroProdutos.adicionarProduto(3,"BAixo",868.87,1);
        cadastroProdutos.adicionarProduto(4,"Bateria",1568.87,1);

        //System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        //System.out.println(cadastroProdutos);
    }
}
