package basics;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.cricbuzz.com/");
      //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      TakesScreenshot ts =(TakesScreenshot)driver;
      File src = ts.getScreenshotAs(OutputType.FILE);
      File trgt = new File("./target/cricbuzz.png");
      FileUtils.copyFile(src, trgt);
	}

}
