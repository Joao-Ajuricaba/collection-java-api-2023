package main.java.map.Pesquisa;

public class TesteEstoqueProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1,"Notebook",2,2500);
        estoqueProdutos.adicionarProduto(2,"SmartTV",3,2100);
        estoqueProdutos.adicionarProduto(3,"celular",1,1010);

        estoqueProdutos.exibirProdutos();

        System.out.println("Produto mais barato "+estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("valor total estoque "+estoqueProdutos.calculaValorTotalEstoque());

    }
}
