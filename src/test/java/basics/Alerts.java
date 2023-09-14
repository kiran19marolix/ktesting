package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     //AlertBox
	     driver.findElement(By.name("alertbox")).click();
	     System.out.println(driver.switchTo().alert().getText());
	     Thread.sleep(3000);
	     driver.switchTo().alert().accept();
	     //driver.close();
	     //Confirm AlertBox
	     driver.findElement(By.name("confirmalertbox")).click();
	     System.out.println(driver.switchTo().alert().getText());
	     Thread.sleep(3000);
	     driver.switchTo().alert().dismiss();
	     driver.close();
	     
	}

}
