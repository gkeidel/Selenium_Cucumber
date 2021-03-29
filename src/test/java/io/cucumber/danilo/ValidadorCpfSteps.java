package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidadorCpfSteps {

  public WebDriver browser;
    
  @Quando("eu acesso o sistema de validacao de CPF")
  public void eu_acesso_o_sistema_de_validacao_de_CPF() {
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

    browser = new ChromeDriver();
    browser.get("http://localhost:8080/");
  }

  @Quando("digito no campo nome {string}")
  public void digito_no_campo_nome(String string) {
     WebElement campoNome = browser.findElement(By.cssSelector("input[name='nome']"));
     campoNome.sendKeys(string);
  }

  @Quando("digito no campo cpf {string}")
  public void digito_no_campo_cpf(String string) {
    WebElement campoCpf = browser.findElement(By.cssSelector("input[name='cpf']"));
    campoCpf.sendKeys(string);
  }

  @Quando("clico no botao Enviar")
  public void clico_no_botao_Enviar() {
    WebElement botaoEnviar = browser.findElement(By.cssSelector("button[type='submit']"));
    botaoEnviar.click();
  }

  @Entao("eu devo ver a mensagem de sucesso {string}")
  public void eu_devo_ver_a_mensagem_de_sucesso(String string) {
    WebElement mensagem = browser.findElement(By.cssSelector(".alert"));
    assertEquals(string, mensagem.getText());
    browser.quit(); 
  }
}
