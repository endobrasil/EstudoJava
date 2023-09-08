public class IPhone implements AparelhoTelefonico,NavegadorInternet,RepodutorMusicial{
    public IPhone() {
    }

    @Override
    public void ligar(Contato contato) {
        System.out.println("Ligando para o contato: "+contato.getNome());
    }

    @Override
    public void atender(Contato contato) {
        System.out.println("Atendendo o contato: "+contato.getNome());
    }

    @Override
    public void iniciarCorrerioVoz(Contato contato) {
        System.out.println("Iniciando o correio de voz para o conato: "+contato.getNome());

    }

    @Override
    public void exibirPagina(Pagina pagina) {
        System.out.println("Exibindo a página: "+pagina.getTitulo());
    }

    @Override
    public void adicionarNovaAba(Pagina pagina) {
        System.out.println("Adicionando a página em nova guia: "+pagina.getTitulo());
    }

    @Override
    public void atualizarPagina(Pagina pagina) {
        System.out.println("Atualizando a página: "+pagina.getTitulo());
    }

    @Override
    public void tocar(Musica musica) {
        System.out.println("Tocando a música: "+musica.getNome());
    }

    @Override
    public void pausar(Musica musica) {
        System.out.println("Pausando a música: "+musica.getNome());
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando a música: "+musica.getNome());
    }
}
