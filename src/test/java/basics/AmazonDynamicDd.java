package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDynamicDd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung");
    List<WebElement> search = driver.findElements(By.xpath("//span[@class='s-heavy']"));
    System.out.println(search.size());
    for(WebElement search1:search) {
   	 System.out.println(search1.getText());
   	 if(search1.getText().equals("s23 ultra 5g")) {
   		 search1.click();
	}
    
    }
	}
	}
