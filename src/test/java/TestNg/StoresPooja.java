package TestNg;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StoresPooja {
	@Test(dataProvider = "loginDetails")
	public void login(String uid, String pwd) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://poojastore.marolix.com/Authenticate/Login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("emailid")).sendKeys(uid);
		driver.findElement(By.name("pword")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[@class='col-md-6']/button")).click();
		String url = driver.getCurrentUrl();
		assertEquals("http://poojastore.marolix.com/", url);
	}
   
	@DataProvider(name = "loginDetails")
	public Object[][] testdata() {
		Object[][] data = new Object[3][3];
		
		data[0][0] = "pooja132@gmail.com";
		data[0][1] ="1234";
		
		data[1][0] = "neerajchop@gmail.com";
		data[1][1] = "goldmedal";
		
		data[2][0] = "neerajchopra@gmail.com";
		data[2][1] = "goldmedal";
		
		return data;
	}
}
