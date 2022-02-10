package com.interviewzenTeste.steps;

import com.interviewzenTeste.controllers.InterviewzenTesteCtrl;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewzenTesteSteps {

    private InterviewzenTesteCtrl Ctrl;
    private WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Ctrl = new InterviewzenTesteCtrl(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Dado("que eu acesse o sistema {string}")
    public void dadoQueEuAcesseSistema(String url){
        Ctrl.navigate(url);
    }

    @Quando("acessar opção lupa no canto superior esquerdo")
    public void acessarOpçãoLupaNoCantoSuperiorEsquerdo() {
        Ctrl.clickOnmSearchIcon();
    }

    @E("informar campo pesquisa como {string}")
    public void informarCampoPesquisaComo(String pesquisa) {
        Ctrl.typeSearch(pesquisa);
    }

    @E("acionar opção que permite pesquisar")
    public void acionarOpçãoQuePermitePesquisar() {
        Ctrl.clickOnSearchBtn();
    }

    @Entao("o sistema apresenta pesquisa conforme parametro informado {string}")
    public void oSistemaApresentaPesquisaConformeParametroInformado(String pesquisa) {
        Ctrl.verifySerachResult(pesquisa);
    }

    @E("informar campo pesquisa como inexistente {string}")
    public void informarCampoPesquisaComoInexistente(String pesquisa) {
        Ctrl.typeSearch(pesquisa);
    }

    @Entao("o sistema nao deve apresentar o texto {string}")
    public void oSistemaNaoDeveApresentarOTexto(String texto) {
        Ctrl.verifyResultNotFound(texto);
    }
}
