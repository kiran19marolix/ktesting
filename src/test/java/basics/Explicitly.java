package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
    driver.findElement(By.id("alert")).click();
    wait.until(ExpectedConditions.alertIsPresent());
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
    driver.findElement(By.id("populate-text")).click();
    WebElement Element = driver.findElement(By.id("h2"));
    wait.until(ExpectedConditions.visibilityOf(Element));
    WebElement Element1 = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
    System.out.println(Element1.getText());
    driver.findElement(By.id("display-other-button")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
    WebElement Element2 = driver.findElement(By.id("hidden"));
    System.out.println(Element2.getText());
    driver.findElement(By.id("enable-button")).click();
    WebElement Element3 = driver.findElement(By.id("disable"));
    wait.until(ExpectedConditions.visibilityOf(Element3));
    System.out.println(Element3.getText());
    
    
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //driver.findElement(By.id("display-other-button")).click();
   
	}

}
