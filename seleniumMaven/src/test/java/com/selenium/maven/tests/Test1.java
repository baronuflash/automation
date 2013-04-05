package com.selenium.maven.tests;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.selenium.maven.util.FileUtil;
import com.selenium.maven.util.GeneralSettings;

public class Test1 extends GeneralSettings{

	


	@Test
	public void testEx() {

		driver.get("http://www.google.com");

	}

}
