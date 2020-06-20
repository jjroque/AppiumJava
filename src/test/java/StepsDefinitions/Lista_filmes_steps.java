package StepsDefinitions;

import cucumber.api.java.pt.*;
import screens.Lista_filmes;

public class Lista_filmes_steps {

    Lista_filmes lista;

    public Lista_filmes_steps() {
        lista = new Lista_filmes();
    }
    //Metodos
    @Dado("^que estou na lista de filmes$")
    public void queEstouNaListaDeFilmes() throws Throwable {
        this.lista.home();
    }

    @Quando("^realizar uma busca por titulo$")
    public void realizarUmaBuscaPorTitulo() throws Throwable {
        this.lista.digite_nome();
    }

    @Então("^vejo o resultado da busca$")
    public void vejoOResultadoDaBusca() throws Throwable {
        this.lista.btn_search();
    }

    @Dado("^que estou na lista de login$")
    public void queEstouNaTelaDeLogin() throws Throwable {
        this.lista.login();
    }

    @E("^Eu escrevo no campo username$")
    public void EuEscrevoUsername() throws Throwable {
        this.lista.digite_usuario();
    }

    @E("^Eu escrevo no campo password$")
    public void EuEscrevoPassword() throws Throwable {
        this.lista.digite_senha();
    }

    @Quando("^Eu clicar no botao Login$")
    public void EuClicarBotaoLogin() throws Throwable {
        this.lista.click_login();
    }

    @Entao("^Eu vejo que estou logado$")
    public void EuVejoTelaLogado() throws Throwable {
        this.lista.logado();
    }
}