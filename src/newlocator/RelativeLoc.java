package newlocator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://qagm.compumatrice.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign In Here")).click();
		driver.findElement(By.xpath("//input[@id='edit-name']")).sendKeys("amit78");
		driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys("amit78");
		driver.findElement(By.xpath("//button[normalize-space()='Log in to your Dashboard']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Create a memorial']")).click();
		
		WebElement nameEditBox=driver.findElement(By.xpath("//input[@id='edit-field-first-name-of-the-deceased-0-value']"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		
		
		WebElement DOB= driver.findElement(By.xpath("//label[normalize-space()='Date of Death']"));
		driver.findElement(withTagName("input").below(DOB)).sendKeys("11/12/1990");

		
		WebElement Memorial =	driver.findElement(By.xpath("//label[normalize-space()='Memorial Plaque Visibility']"));
		driver.findElement(withTagName("input").toLeftOf(Memorial)).click();
		// new for update first change 
	}

}
