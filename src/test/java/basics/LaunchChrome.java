package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Kiran");
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran19marolix@gmail.com");
     driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9014441919");
     driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Vizag");
     WebElement radiobutton = driver.findElement(By.xpath("//label[@for='male']"));
     radiobutton.click();
     
     List<WebElement>checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
     System.out.println("Total Number of Checkboxes:"+ checkbox.size());
     
     int totalcheckboxes = checkbox.size();
     
     for(int i=totalcheckboxes-5;i<totalcheckboxes;i++)
     {
       	 checkbox.get(i).click();
     }
	}
 }


