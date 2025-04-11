package Start;

import Build.Iphone;

public class Principal {
    public static void main(String[] args) throws Exception {
      
        Iphone fone =new Iphone();

        fone.selecionarMusica(" Roberto Calos");
        fone.reproduzirMusica();

        fone.exibirPagina("you tube");

        fone.fazerChamada("82 98541");
        
    }
}
