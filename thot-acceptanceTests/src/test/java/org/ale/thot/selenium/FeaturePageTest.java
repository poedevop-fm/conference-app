package org.ale.thot.selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FeaturePageTest extends AbstractPageTest {

	private String pageLink = "/features.jsp";
	
	@Test
	public void openPageAndValidateTitle() {
		open(pageLink);
		assertTrue("Page title does not match", PAGE_TITLE.equalsIgnoreCase(driver.getTitle()));
	}
	
	@Test
	public void openFeaturePage() {
		open(pageLink);
		WebElement title = driver.findElement(By.id("title"));
		assertTrue(title.isDisplayed());
	}

}