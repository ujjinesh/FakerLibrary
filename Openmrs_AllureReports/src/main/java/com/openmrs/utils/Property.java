package com.openmrs.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {
	public static String getValueForKey(String key) throws Throwable {
		Properties conpro = new Properties();
		//load file
		conpro.load(new FileInputStream("C:\\Users\\Bandi.Ujjinesh\\OPENMRS\\Openmrs_AllureReports\\preoperty\\info.property"));
		return conpro.getProperty(key);
		}
}
