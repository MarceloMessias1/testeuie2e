package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By novidades = By.id("Novidades");
	public By clicarSapato = By.cssSelector("#item-list > div.wrapper > a:nth-child(1) > div > div.item-card__images > div.item-card__images__image-link > img");
	public By selecionarTamanho = By.xpath("//*[@id=\"buy-box\"]/section[2]/div/ul/li[2]//a");
	public By concluirCompra = By.id("action-buttons");
	public By validarCompra = By.xpath("//a[@class='mini-cart ns-icon ns-icon-sacola mini-cart-label-cart']");
	public By validarValor = By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[3]//div/p");
	
}

