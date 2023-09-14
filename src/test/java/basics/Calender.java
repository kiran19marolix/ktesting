package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String Date= "15";
		String Month="October";
		String Year="2023";
		driver.findElement(By.id("datepicker1")).click();
		while(true) {
		String MonYr=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		String[]Month_Year =MonYr.split(" ");
		String Months=Month_Year[0];
		String Years=Month_Year[1];
		if(!(Months.equalsIgnoreCase(Month)&& Years.equals(Year))) {
			break;
		}
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}
		List<WebElement> date= driver.findElements(By.xpath("//td[@data-handler='SelectDay']/a[text()='15']"));
		for(WebElement dates:date) {
			if(dates.equals(Date)) {
				dates.click();
				break;
			}
		}
	}
}
