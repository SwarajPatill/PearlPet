package TestBase;

import java.io.File;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
		static public WebDriver driver;

		static public Properties p;
		static public Logger log;

		 
		
		@BeforeClass(groups= {"sanity","regression","smoke"})
		public void Setup() throws IOException {
			
			FileReader file = new FileReader(".//src/test/resources/config.properties");
			p = new Properties();
			p.load(file);
			
			log = LogManager.getLogger(this.getClass());

			
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(p.getProperty("AppURL"));
			driver.manage().window().maximize();
			log.info("Browser Launch Successfully.....");
			


		}
		
		
		public String captureScreen(String tname)throws IOException{
			
			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
			File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
			String targetFilePath=System.getProperty("user.dir")+"\\ER_screenshots\\" + tname +"-" + timeStamp + ".png";
			File targetFile = new File(targetFilePath);
			
			sourceFile.renameTo(targetFile);
			return targetFilePath;
		}
		
		@AfterClass(groups= {"sanity","regression","smoke"})
		public void teardown() throws IOException, InterruptedException {

			driver.quit();
			log.info("Browser Closed Sucessfully....");
		}
		
		
}