package basics;

import java.time.Duration;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.overlay.model.SourceOrderConfig;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TravelDate {



	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement source = driver.findElement(By.xpath("//*[@id='source']"));
		source.clear();
		source.sendKeys("Tenal");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.xpath("//*[@id='destination']"));
		destination.clear();
		destination.sendKeys("Hyderaba");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//*[@id='datepicker1']"));
		String journeydate="15-10-2023";
		
		
	}

}
