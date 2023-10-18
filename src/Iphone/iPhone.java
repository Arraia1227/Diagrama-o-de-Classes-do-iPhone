package Iphone;
import Musica.ReprodutorMusical;
import Navegador.NavegadorInternet;
import TelefoneAparelho.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    boolean ligar = false;
    boolean atender = false;
    boolean pausar = true;
    boolean correio = true;
    boolean pagina = false;
    boolean atualizar = true;
    int musica = 3;
   
    public void ligar() {
        ligar=true;
        System.out.println("Ligando o celular");
    }
    public void desligar(){
        ligar=false;
        System.out.println("Desligando o celular");
    }
    
    public void atender() {
        atender=true;
        System.out.println("Atender");
    }
    public void desligado() {
        atender=false;
        System.out.println("Desligando");
    }

    public void iniciarCorreioVoz() {
        correio=false;
        System.out.println("Iniciar correio de voz");
    }
    

    public void pagina() {
        pagina=true;
        System.out.println("Abrindo pagina");
    }

    
    public void adicionandoNovaPagina() {
        System.out.println("Adicionando nova pagina");
    }

    
    public void atualizaPagina() {
        atualizar=false;
        System.out.println("Atualizando a pagina");
    }

    public void tocar() {
        musica++;
        System.out.println("musica : " + musica);
    }

    public void pausar() {
        pausar=false;
        System.out.println("Musica pausada");
    }
    
    
    public void selecionarMusica() {
        System.out.println("Escolhendo uma musica");
    }
   
    
    
    
    
    


    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        ReprodutorMusical musica = (ReprodutorMusical) iphone;
        AparelhoTelefonico telefonico = (AparelhoTelefonico) iphone;
        NavegadorInternet internet = (NavegadorInternet) iphone;

        
        System.out.println("Telefone");
        telefonico.ligar();
        System.out.println("Celular ligado ? " + iphone.ligar);
        telefonico.atender();
        System.out.println("Atender ligação ? " + iphone.atender);
        telefonico.iniciarCorreioVoz();
        System.out.println("Iniciar correio de voz ? " + iphone.correio);
        System.out.println();

        System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        System.out.println("Musica pausada ? " + iphone.pausar);
        musica.selecionarMusica();
        musica.tocar();
        System.out.println();

        System.out.println("Internet");
        internet.pagina();
        System.out.println("Pagina aberta ? " + iphone.pagina);
        internet.adicionandoNovaPagina();
        internet.atualizaPagina();
        System.out.println("Atualizando pagina ? " + iphone.atualizar);
    }
}
