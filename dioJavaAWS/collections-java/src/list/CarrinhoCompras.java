package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Carrinho de Compras:
 * 			Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online.
 * 			O carrinho deve ser implementado como uma lista de itens.
 * 			Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade.
 * 			Implemente os seguintes métodos:
 *
 * 			* adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
 * 			* removerItem(String nome): Remove um item do carrinho com base no seu nome.
 * 			* calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
 * 			* exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
 */
public class CarrinhoCompras {
    private List<Item> listaItens;

    public CarrinhoCompras() {
        this.listaItens = new ArrayList<>();
    }

    //adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));

    }

    //removerItem(String nome): Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome){
        List<Item> itemsRemover = new ArrayList<>();

        for (Item i:listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsRemover.add(i);
            }
        }
        listaItens.removeAll(itemsRemover);
    }

    //calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public double calcularValorTotal(){
        double total=0;
        for (Item i: listaItens){
            total+=(i.getPreco()*i.getQuantidade());
        }
        return total;
    }

    //exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
    public void exibirItens(){
        for (Item i:listaItens){
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args){
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();


        carrinhoCompras.exibirItens();

        carrinhoCompras.adicionarItem("pizza",20,3);
        carrinhoCompras.adicionarItem("fone",60,300);
        carrinhoCompras.adicionarItem("Comida Gato",30,30);

        carrinhoCompras.exibirItens();

        System.out.println(carrinhoCompras.calcularValorTotal());

        carrinhoCompras.removerItem("fone");

        carrinhoCompras.exibirItens();

        System.out.println(carrinhoCompras.calcularValorTotal());
    }




}
