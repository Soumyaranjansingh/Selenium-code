package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soumya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("facebook",Keys.ENTER);
	driver.findElement(By.partialLinkText("Facebook - Log In or Sign Up")).click();
	driver.findElement(By.id("u_0_2")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Soumya Ranjan",Keys.TAB);
	driver.findElement(By.id("u_1_d")).sendKeys("Singh",Keys.TAB);
	driver.findElement(By.id("u_1_g")).sendKeys("8908641811",Keys.TAB);
	driver.findElement(By.id("password_step_input")).sendKeys("Soumya@123",Keys.TAB);
	driver.findElement(By.id("day")).sendKeys("18",Keys.TAB);
	driver.findElement(By.id("month")).sendKeys("Jul",Keys.TAB);
	driver.findElement(By.id("year")).sendKeys("1995",Keys.TAB);
	driver.findElement(By.id("u_1_5")).click();
	//driver.findElement(By.xpath(".//*[@id='u_1_5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("u_1_s")).click();

	}

}
