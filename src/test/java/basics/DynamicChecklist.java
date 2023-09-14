package basics;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.CellValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicChecklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://cosmocode.io/automation-practice-webtable/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    int Tablerows = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
    System.out.println(Tablerows);
    int Tablecolumns = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
    System.out.println(Tablecolumns);
    
   /* for(int i=2;i<=Tablerows;i++) {
    System.out.println(i+":");
    for(int j=2;j<=Tablecolumns;j++) {	
    
    String TotalValue= driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
    System.out.println(TotalValue);
    }
    }*/
    
    //CellValue(driver,"4","4");
    //CellValue(driver, "10","3");
    
    checkbox(driver, "10");
    checkbox(driver, "22");
    checkbox(driver, "5");
    checkbox(driver, "42");
    
    }

	private static void CellValue(WebDriver driver, String Totalrows, String Totalcolumns) {
		// TODO Auto-generated method stub
		String CellValue=driver.findElement(By.xpath("//table[@id='countries']//tr[\"+Totalrows+\"]//td[\"+Totalcolumns+\"]")).getText();
		System.out.println(CellValue);
	}
    public static void checkbox(WebDriver driver, String Totalrows) {
    driver.findElement(By.xpath("//table[@id='countries']//tr["+Totalrows+"]//td[1]//input")).click();	
    }

}

