package Steps;

import java.io.IOException;

import Elementos.ElementosLogin;
import Metodos.MetodosTelaLoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

@SuppressWarnings("unused")
public class teste {

	
	ElementosLogin el = new ElementosLogin();
	MetodosTelaLoginPage met = new MetodosTelaLoginPage();
	

@Dado("que esteja no site {string}")
public void que_esteja_no_site(String string) throws InterruptedException {
    met.abrirNavegadorESite(string);
    met.pausar(2000);
    
}

@Quando("clicar para logar")
public void clicar_para_logar() throws InterruptedException {
    met.clicar(el.getBtnSingIn());
    met.pausar(4000);
}

@Quando("preencher login e senha válidos")
public void preencher_login_e_senha_válidos() {
   met.preeencherTexto(el.getCpLogin(),"testeturma18@gmail.com");
   met.preeencherTexto(el.getCpPassword(),"123456789");
   
}

@Então("é logado com sucesso") 
public void é_logado_com_sucesso()throws InterruptedException, IOException  {
    met.clicar(el.getCpLogin());
    met.pausar(4000);
    met.validarTexto("Teste Turma Automacaoflashcode flashcode", el.getTextLogin());
    met.takeScreenshot("Cenario de Login com sucesso");
    met.fecharNavegador();
    
}


}
