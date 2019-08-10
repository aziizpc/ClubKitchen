package com.bie.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bie.qa.base.TestBase;

public class MamacitaPage extends TestBase {

	@FindBy(id = "address-input")
	private WebElement addressField;

	@FindBy(xpath = "//input[@class='btn--honest blattgold--form-banner-submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//span[contains(text(), 'Burritos')]")
	private WebElement burritosButton;

	@FindBy(xpath = "//button[contains(text(), 'Avocado Crush Burrito')]")
	private WebElement avocadoCrushBurrito;

	@FindBy(xpath = "//button[contains(text(), 'ZUM WARENKORB HINZUFÜGEN')]")
	private WebElement addToCartButton;

	@FindBy(xpath = "//a[@href = 'https://clubkitchen.at/checkout/confirm']")
	private WebElement proceedButton;

	public MamacitaPage() {
		PageFactory.initElements(driver, this);
	}

	public void addItemToCart() throws InterruptedException {

		addressField = driver.findElement(By.id("address-input"));
		addressField.sendKeys("Semperstraße 44, 1180 Wien, Austria");
		submitButton.click();

		Thread.sleep(10000);

		burritosButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(avocadoCrushBurrito));

		Actions actions = new Actions(driver);
		actions.moveToElement(avocadoCrushBurrito).click().build().perform();

		try {
			addToCartButton.click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			WebElement addToCartButton = driver
					.findElement(By.xpath("//button[contains(text(), 'ZUM WARENKORB HINZUFÜGEN')]"));
			addToCartButton.click();
		}

		proceedButton.click();
	}
}