package diagramacaoclassesiphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {    
    private String modelo;
    private String cor;
    private int memoria;  

    
    public iPhone(String modelo, String cor, int memoria) {
        this.modelo = modelo;
        this.cor = cor;
        this.memoria = memoria;        
    }

    public void imprimirInformacoes() {        
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Memória: " + this.memoria + " GB");
    }    

    
    @Override
    public void tocar() {        
        System.out.println("tocar");
    }

    @Override
    public void pausar() {       
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica(String musica) {       
        System.out.println("selecionarMusica: " + musica);
    }
    
    @Override
    public void ligar() {        
        System.out.println("ligar");
    }

    @Override
    public void atender() {        
        System.out.println("atender");
    }

    @Override
    public void iniciarCorreioVoz() {        
        System.out.println("iniciarCorreioVoz");
    }
    
    @Override
    public void exibirPagina(String url) {        
        System.out.println("exibirPagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {        
        System.out.println("adicionarNovaAba");
    }

    @Override
    public void atualizarPagina() {        
        System.out.println("atualizarPagina");
    }

}