package com.selenium.maven.tests;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.maven.util.GeneralSettings;

public class Test2 extends GeneralSettings {

	@Test
	public void testTest() throws InterruptedException {

		driver.get("http://www.piata-az.ro/anunturi/garsoniere-1000");
		WebElement element1 = driver.findElement(By.name("filter_country"));
		new Select(element1).selectByVisibleText("România");
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.name("filter_region"));
		new Select(element2).selectByVisibleText("Alba");
		Thread.sleep(1000);
		WebElement element3 = driver.findElement(By.id("filter_city"));
		new Select(element3).selectByVisibleText("Alba Iulia");
		Thread.sleep(1000);
		WebElement submitButton = driver.findElement(By.className("submit"));
		submitButton.click();
		Thread.sleep(1000);
		Assert.assertTrue("Mesaj fara niciun rezultat",
				driver.findElement(By.className("noresults")).getText()
						.contains("Nu a fost gasit niciun rezultat"));

	}

}
