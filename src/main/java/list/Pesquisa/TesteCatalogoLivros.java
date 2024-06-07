package main.java.list.Pesquisa;

public class TesteCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Manifesto Comunista","Karl Marx & Friedrich Engels",1848);
        catalogoLivros.adicionarLivro("O Estado e a Revolução","Lenin",1924);
        catalogoLivros.adicionarLivro("Luta Sindical","Dmitrov",1923);
        catalogoLivros.adicionarLivro("Fundamentos do Leninismo","Stalin",1924);
        catalogoLivros.adicionarLivro("Revolução Permanente","Trotsky",1926);



        System.out.println(catalogoLivros.pesquisarPorAutor("Lenin"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1848,1923));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Luta Sindical"));
    }
}
