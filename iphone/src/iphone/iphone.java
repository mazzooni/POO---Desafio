package iphone;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
        // Lógica para reproduzir música
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
        // Lógica para pausar a reprodução de música
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
        // Lógica para selecionar uma música
    }

    @Override
    public void ligar() {
        System.out.println("Ligando telefone");
        // Lógica para ligar o telefone
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
        // Lógica para atender uma chamada
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        // Lógica para iniciar o correio de voz
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        // Lógica para exibir uma página da internet
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
        // Lógica para adicionar uma nova aba no navegador
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        // Lógica para atualizar a página no navegador
    }
}