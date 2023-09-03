package list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. Estoque de Produtos com Preço
 * 			Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos,
 * 			suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave
 * 			e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:
 *
 * 			adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
 * 			exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.
 * 			calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
 * 			obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
 * 			obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
 * 			obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
 */
public class EstoqueProdutos {
    private Set<Produto> produtoSet;

    public EstoqueProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtoSet.add(new Produto(nome,cod,preco,quantidade));
    }

    public Set<Produto> exibirProdutosNome(){
        //o TreeSet para poder organizar por nome
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparetorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPreco;


    }


    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        EstoqueProdutos cadastroProdutos = new EstoqueProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.exibirProdutosNome());

        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPreco());
    }


}
