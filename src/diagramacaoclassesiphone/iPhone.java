package diagramacaoclassesiphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {    
    private String modelo;
    private String cor;
    private int memoria;    

    // Construtor da classe iPhone
    public iPhone(String modelo, String cor, int memoria) {
        this.modelo = modelo;
        this.cor = cor;
        this.memoria = memoria;
        // Inicializar outros atributos se necessário
    }

    public void imprimirInformacoes() {
        // Imprimir as informações do objeto iPhone
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Memória: " + this.memoria + " GB");
    }
    

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        // Implementar a lógica para tocar uma música
        System.out.println("tocar");
    }

    @Override
    public void pausar() {
        // Implementar a lógica para pausar uma música
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementar a lógica para selecionar uma música
        System.out.println("selecionarMusica: " + musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        // Implementar a lógica para ligar para um número
        System.out.println("ligar");
    }

    @Override
    public void atender() {
        // Implementar a lógica para atender uma chamada
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementar a lógica para iniciar o correio de voz
        System.out.println("iniciarCorreioVoz");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Implementar a lógica para exibir uma página web
        System.out.println("exibirPagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        // Implementar a lógica para adicionar uma nova aba no navegador
        System.out.println("adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {
        // Implementar a lógica para atualizar a página atual
        System.out.println("atualizarPagina");
    }

}