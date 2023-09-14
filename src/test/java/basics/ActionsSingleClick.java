package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSingleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*Actions actions = new Actions(driver);
		actions
		.moveToElement(driver.findElement(By.xpath("//a[.='Admin']")))
		.moveToElement(driver.findElement(By.xpath("//span[text()='Organization ']")))
		.moveToElement(driver.findElement(By.xpath("//a[.='Locations']")))
		.click()
		.perform();*/
		driver.findElement(By.xpath("//a[.='Admin']")).click();
		driver.findElement(By.xpath("//span[text()='Organization ']")).click();
		driver.findElement(By.xpath("//a[.='Locations']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//input[1]")).sendKeys("Banglore");
		Actions actions = new Actions(driver);
		actions.doubleClick(driver.findElement(By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//input[1]"))).perform();
		actions.contextClick().perform();
	}

}
