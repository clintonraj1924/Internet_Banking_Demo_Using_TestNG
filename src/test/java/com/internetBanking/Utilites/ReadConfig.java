package com.internetBanking.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	static Properties pro;

//constructor
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fio = new FileInputStream(src);
			pro = new Properties();
			pro.load(fio);

		} catch (Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUserName() {
		String usrName = pro.getProperty("usrName");
		return usrName;
	}

	public String getPassword() {
		String pwd = pro.getProperty("pwd");
		return pwd;
	}

	public static String getChromePath() {
		String chromePath = pro.getProperty("chromePath");
		return chromePath;
	}

	public static String getEdgeePath() {
		String edgePath = pro.getProperty("edgePath");
		return edgePath;
	}
}
