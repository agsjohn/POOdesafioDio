package desafio;

import desafio.classes.iPhone;

public class desafio {
    public static void main(String[] args) {
        iPhone primeiroIphone = new iPhone("Iphone 1", 2007);

        primeiroIphone.atender();
        primeiroIphone.ligar(40028922);
        primeiroIphone.iniciarCorreioVoz();
        System.out.print("\n");
        primeiroIphone.adicionarNovaAba();
        primeiroIphone.exibirPagina("https://www.youtube.com");
        primeiroIphone.atualizarPagina();
        System.out.print("\n");
        primeiroIphone.selecionarMusica("https://open.spotify.com/intl-pt/track/1QV6tiMFM6fSOKOGLMHYYg?si=2d0b73243f9541f7");
        primeiroIphone.tocar();
        primeiroIphone.pausar();
    }
}
