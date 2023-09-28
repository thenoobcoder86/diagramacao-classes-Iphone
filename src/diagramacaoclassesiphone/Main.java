package diagramacaoclassesiphone; 


public class Main {
    public static void main(String[] args) {        
        iPhone meuIphone = new iPhone("iPhone 12", "Preto", 64);
        
        meuIphone.selecionarMusica("Despacito");
        meuIphone.tocar();
        meuIphone.pausar();
        
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        
        meuIphone.exibirPagina("https://www.bing.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}


