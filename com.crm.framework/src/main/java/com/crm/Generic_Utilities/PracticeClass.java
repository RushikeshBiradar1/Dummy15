package com.crm.Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PracticeClass {
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./config.properties");
		Properties file = new Properties();
		file.load(fis);
	String value = file.getProperty(key);
	return value;
	}

}
