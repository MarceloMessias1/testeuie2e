package steps;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AddCompraPage;

public class AddCompraTest {
	AddCompraPage page = new AddCompraPage();

	@Dado("que eu clique em novidades")
	public void queEuCliqueEmNovidades() {
		page.selecionarNovidades(null);

	}

	@Quando("escolher produto")
	public void escolherProduto() {
		page.clicarProduto();

	}

	@Quando("clicar em comprar")
	public void clicarEmComprar() {
		By elemento = null;
		page.selecionarTamanho(elemento);

	}

	@Entao("valido compra")
	public void validoCompra() {
		page.comprarSapato();
	}
	
	@Entao ("valido valor")
	public void validoValor() {
		page.validarValor();
	}
}
