package com.selenium.maven.util;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GeneralSettings {

	protected WebDriver driver;
	String browserUsed;



	@Before
	public void settingsBefore() {

		FileUtil fileUtil = new FileUtil();
		browserUsed = fileUtil.readFromPropertyFile("browser",
				"src/test/resources/General.properties");
		if (browserUsed.toLowerCase().contains("firefox")) {

			driver = new FirefoxDriver();
		} else if (browserUsed.toLowerCase().contains("ie")) {

			File file = new File("src/test/resources/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver = new InternetExplorerDriver();
		}

		else {

			System.out.println("property value is not ie or firefox:"
					+ browserUsed);

		}

	}

	@After
	public void settingsAfter() {

		driver.quit();
	}

}
