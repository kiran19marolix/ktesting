package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GuruScreenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.guru99.com/test/radio.html");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type^='check']"));
	      for(int i=0;i<checkboxes.size();i++) {
	    	  if(i==0 || i==2) {
	    		  checkboxes.get(i).click();
	    	  }
	      }
	      TakesScreenshot ts =(TakesScreenshot)driver;
	      File src = ts.getScreenshotAs(OutputType.FILE);
	      File tgt = new File("./target/guru.png");
	      FileUtils.copyFile(src, tgt);
	}

}
