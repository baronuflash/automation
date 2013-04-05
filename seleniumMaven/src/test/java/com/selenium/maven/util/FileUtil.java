package com.selenium.maven.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.Assert;

/**
 * Handles working with property files
 * @author ahritcu
 *
 */

public class FileUtil {
	
	
	
	/**
	 * Read property from file
	 * @param key - property name
	 * @param file - file used
	 * @return the value of the property
	 */
	
	public String readFromPropertyFile(String key, String file)
	{
		java.util.Properties prop=new java.util.Properties();
		try {
			prop.load(new FileInputStream(file)); 	} 
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found");
			Assert.fail("File Not Found");
			e.printStackTrace();	} 
		
		catch (IOException e) {
			System.out.println("IOException");
			Assert.fail("IOException- cannot read from file");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

	/**
	 * Write on property file
	 * @param key - property name
	 * @param value - new value
	 * @param file - file used 
	 */
	
	
	public void writeOnPropertyFile(String key,String value,String file)
	{
		java.util.Properties prop=new java.util.Properties();
		prop.setProperty(key, value);
		try{
			prop.store(new FileOutputStream(file), null);
		}catch (FileNotFoundException e){
			System.out.println("FileNotFoundException");
			Assert.fail("FileNotFoundException");
			e.printStackTrace();

		} catch (IOException e) {

			System.out.println("IOException");
			Assert.fail("IOException - cannot read from file");
			e.printStackTrace();
		}
	}
	
	

}
