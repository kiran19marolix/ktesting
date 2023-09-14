package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class AbhiBus {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("source")).sendKeys("visa");
		List<WebElement> search = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println(search.size());
		for (WebElement srch : search) {
		System.out.println(srch.getText());
		if (srch.getText().equals("Visakhapatnam")) {
		srch.click();
		driver.findElement(By.id("destination")).sendKeys("pune");
		List<WebElement> destination = driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		System.out.println(destination.size());
		for (WebElement dest : destination) {
		System.out.println(dest.getText());
		if (dest.getText().equals("Pune Airport")) {
		dest.click();
		driver.findElement(By.id("datepicker1")).click();
	    // List<WebElement> SelectDate = driver.findElements(By.xpath(""));
		Thread.sleep(3000);
		int day = 30;

		WebElement date = driver.findElement(
		By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[text()="+ day + "]"));
		date.click();

					}

					// WebElement source = driver.findElement(By.id("source"));
					// source.clear();
					// source.sendKeys("bang");
					// Thread.sleep(4000);
					// source.sendKeys(Keys.ENTER);
				}
			}
		}
	}
}