public class Main {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone();

        System.out.println("Testando os métodos de Reprodutor Musical");

        iPhone.tocar(new Musica("musica tocando"));
        iPhone.pausar(new Musica("musica pausada"));
        iPhone.selecionarMusica(new Musica("musica selecionada"));

        System.out.println("Testando os métodos de Reprodutor Aparelho Telefônico");

        iPhone.ligar(new Contato("andre","888"));
        iPhone.atender(new Contato("777"));
        iPhone.iniciarCorrerioVoz(new Contato("wendel","666"));

        System.out.println("Testando os métodos de Navegador na Internet");

        //exibirPagina, adicionarNovaAba, atualizarPagina

        iPhone.exibirPagina(new Pagina("http:google","google"));
        iPhone.adicionarNovaAba(new Pagina("http://dio.me","dio"));
        iPhone.atualizarPagina(new Pagina("http://dio.me","dio"));
    }
}