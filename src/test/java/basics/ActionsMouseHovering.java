package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseHovering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement Rank = driver.findElement(By.id("rankingDropDown"));
		Actions act = new Actions(driver);
		act.moveToElement(Rank).perform();
		driver.findElement(By.xpath("//a[.='ICC Rankings - Men']")).click();
		
	}

}
