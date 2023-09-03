package list;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Agenda de Contatos
 * 		Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos.
 * 		Cada contato possui um nome como chave e um número de telefone como valor.
 * 		Implemente os seguintes métodos:
 *
 * 		adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
 * 		removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
 * 		exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
 * 		pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
 */
public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
    public void adicionarContato(String nome, Integer telefone){
        contatoSet.add(new Contato(nome,telefone));
    }

    //pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado=null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado=c;
                break;
            }
        }
        return contatoAtualizado;
    }


    //exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    private void exibirContatos() {
        System.out.println(contatoSet);
    }

    //removerContato(String nome): Remove um contato da agenda, dado o nome do contato
    private void removerContato(String nome){
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                contatoSet.remove(c);
                break;
            }
        }

    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Carolina");
        agendaContatos.exibirContatos();
    }


}
