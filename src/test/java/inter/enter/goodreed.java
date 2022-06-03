package inter.enter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goodreed {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goodreads.com/user/sign_in");
		driver.findElement(By.xpath("//*[@id=\"choices\"]/div/a[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("nirmalyogesh84@gmail.com");
		
driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Yogesh095");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div/div[3]/ul/li[5]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div/div[3]/ul/li[5]/div/div/div/ul/li[13]")).click();
	}

}

	
