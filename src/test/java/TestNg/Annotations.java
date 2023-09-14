package TestNg;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class Annotations {
	WebDriver driver;
	@BeforeTest
	public void setup() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	
    @Test
    public void login() {
    	driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
    }
    @Test
    public void urltest() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    String url = driver.getCurrentUrl();
    Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", url);
    }
    @AfterTest
    public void teardown() {
    driver.close();	
    }
}
