package com.bie.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bie.qa.base.TestBase;

public class HomePage extends TestBase {

	private static final String mamacitaBrandLinkText = "//*[contains(@class, 'col-xs-3 start-col-xs-5')]/div[@class = 'emotion--banner']/div/picture/following-sibling::a[contains(@href,'/mamacita/')]";;
	@FindBy(xpath = mamacitaBrandLinkText)
	WebElement mamacitaBrandLink;

	private static final String cookieButtonXPath = "//button";
	@FindBy(xpath = cookieButtonXPath)
	WebElement cookieButton;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public MamacitaPage selectMamacita() throws InterruptedException {
		Thread.sleep(2000);
		cookieButton.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(mamacitaBrandLink).click().build().perform();
		Thread.sleep(10);
		return new MamacitaPage();
	}
}