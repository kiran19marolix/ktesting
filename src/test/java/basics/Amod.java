package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Amod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
		int rowsize = rows.size();
		System.out.println(rowsize);

		for (WebElement cell : rows) {

			String cells = cell.getText();

			if (cells.contains("Amod")) {

				System.out.println(cells);

			}
		}
	}
	}


