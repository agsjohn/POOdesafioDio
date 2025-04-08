package desafio.classes;

public class iPhone implements AparelhoTelefonico {
    private String modelo;
    private int ano;

    public iPhone(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(int numero) {
        System.out.println("Iphone ligando para " + numero);
    }

    public void atender() {
        System.out.println("Iphone atentendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciando correio voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Iphone exibindo página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Iphone adicionando aba");
    }

    public void atualizarPagina() {
        System.out.println("Iphone atualizando aba");
    }

    public void tocar() {
        System.out.println("Iphone tocando música");
    }

    public void pausar() {
        System.out.println("Iphone pausando música");
    }

    public void selecionarMusica(String novaMusica) {
        System.out.println("Iphone selecionando musica " + novaMusica);
    }
}
