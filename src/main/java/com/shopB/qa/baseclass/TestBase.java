package com.shopB.qa.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shopB.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
	
        try {
               prop = new Properties();
               FileInputStream  ip = new FileInputStream("C:\\Users\\arunc\\eclipse-workspace\\MavenProject\\src\\main\\java\\com\\shopB\\qa\\config\\config.properties");
               System.out.println(ip);
               prop.load(ip);
        }catch (FileNotFoundException e) {
               e.printStackTrace();
        }catch(IOException e) {
        e.printStackTrace();
        }
	}
	
	public static void initialization() {
	String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\arunc\\Documents\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_Timeout, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
			 driver.get(prop.getProperty("url"));
			 		 
		}
		
	}
}




