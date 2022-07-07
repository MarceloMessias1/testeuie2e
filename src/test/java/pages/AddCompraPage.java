package pages;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class AddCompraPage {

	MetodosDeTestes metodos = new MetodosDeTestes();
	Elementos el = new Elementos();

	public void selecionarNovidades(By elemento) {
		metodos.clicar(el.novidades);
	}

	public void clicarProduto() {
		metodos.pausa(5);
		metodos.clicar(el.clicarSapato);

	}

	public void selecionarTamanho(By elemento) {

		metodos.clicar(el.selecionarTamanho);
	}

	public void comprarSapato() {
		metodos.clicar(el.concluirCompra);
	}

	public void validarCompra() {
		metodos.clicar(el.validarCompra);
		
	}

	public void validarValor() {
		metodos.validarCompra(el.validarValor, "R$ 389,90");
	}

}
