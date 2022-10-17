package com.crm.Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	public String getPropertyKeyValue(String key) throws Throwable {
		//FileInputStream fis = new FileInputStream("./config.properties");
		FileInputStream fis = new FileInputStream(iPathConstant.PropertyFile_Path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
