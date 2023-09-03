package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 1. Ordenação de Pessoas
 * 			Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do
 * 			tipo "Pessoa" como atributo.
 * 			Cada pessoa possui atributos como nome, idade e altura.
 * 			Implemente os seguintes métodos:
 *
 * 			* adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
 * 			* ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
 * 			* ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
 */
public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    //adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
    public void adicionarPessoa(String nome, int idade, double altura){
        this.pessoaList.add(new Pessoa(nome,idade,altura));
    }

    //ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }

    //ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasAltura=new ArrayList<>();
        Collections.sort(pessoasAltura,new ComparatorAltura());
        return pessoasAltura;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.pessoaList);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}



