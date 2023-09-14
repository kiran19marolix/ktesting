package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    WebElement Washington = driver.findElement(By.id("box3"));
    WebElement UnitedStates = driver.findElement(By.id("box103"));
    Actions actions = new Actions(driver);
    actions.dragAndDrop(Washington, UnitedStates).perform();
    
	}

}
