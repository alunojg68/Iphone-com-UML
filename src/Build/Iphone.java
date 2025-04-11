package Build;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String Musica;
    private String numero;
    private String url;

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void reproduzirMusica() {

        System.out.printf("\n Reproduzindo música: %s", getMusica());

    }

    @Override
    public void selecionarMusica(String musica) {

        setMusica(musica);
        System.out.printf("\n Escolhendo música: %s", getMusica());

    }

    @Override
    public void pausarMusica() {

        System.out.println("\n Musica Pausada...");
    }

    @Override
    public void encerrarChamada() {

        System.out.println("\n Ligação Encerrada ...");

    }

    @Override
    public void fazerChamada(String numero) {

        setNumero(numero);

        System.out.printf("\n Ligando para: %s", getNumero());

    }

    @Override
    public void receberChamada() {

        System.out.printf("\n Telefone Chamando: %s", getNumero());

    }

    @Override
    public void adicionarNovaAba(String url) {

        System.out.printf("\n Adicionando Nova Aba: %s", getUrl());
    }

    @Override
    public void atualizarPagina() {

        System.out.println("\n Atualizando Página ... ");

    }

    @Override
    public void exibirPagina(String url) {

        setUrl(url);

        System.out.printf("\n Exibindo Página: %s", getUrl());

    }

    public String getMusica() {
        return Musica;
    }

    public void setMusica(String musica) {
        Musica = musica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
