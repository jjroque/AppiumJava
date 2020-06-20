package screens;

import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import screens.base.BaseScreen;

public class Lista_filmes extends BaseScreen {

    @WithTimeout(time = 5000, unit = TimeUnit.SECONDS)
    @AndroidFindBy(id = "home_omdb")
    private MobileElement tela_inicial;

    @AndroidFindBy(id = "login_image")
    private MobileElement tela_login;

    @AndroidFindBy(id = "search_title")
    private MobileElement digite_nome;

    @AndroidFindBy(id = "login_username")
    private MobileElement digite_username;

    @AndroidFindBy(id = "login_password")
    private MobileElement digite_password;

    @AndroidFindBy(id = "login_button")
    private MobileElement btn_login;

    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"List of users\")")
    private MobileElement tela_logado;

    @AndroidFindBy(id = "search")
    private MobileElement btn_search;

    public Lista_filmes() {
    }

    public void home() {
        this.tela_inicial.isDisplayed();
    }

    public void digite_nome() {
        this.digite_nome.sendKeys("spider");
    }

    public void btn_search() {
        this.btn_search.click();
    }

    public void login() {
        this.tela_login.isDisplayed();
    }

    public void digite_usuario() {
        this.digite_username.sendKeys("techugo@gmail.com");
    }

    public void digite_senha() {
        this.digite_password.sendKeys("1234");
    }

    public void click_login() {
        this.btn_login.click();
    }

    public void logado() {
        this.tela_logado.click();
    }
}