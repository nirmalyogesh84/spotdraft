package inter.enter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Spotdraft {

	public static void main(String[] args) throws InterruptedException
	 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goodreads.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='signIn']/div/div/a")).click();
		driver.findElement(By.xpath("//div[@id='choices']/div/a[2]")).click();
		
		//log in to 
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("nirmalyogesh84@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Yogesh095");
		driver.findElement(By.cssSelector("input#signInSubmit")).click();
		
		//searching book(mrutyunjay)
		driver.findElement(By.xpath("//div[@class='siteHeader']/div/header/div[2]/div[1]/div[2]/form/input")).sendKeys("mrutyunjay");
		driver.findElement(By.xpath("//div[@class='siteHeader']/div/header/div[2]/div[1]/div[2]/form/button")).click();
		
		//add book in Want To Read
		driver.findElement(By.xpath("//div[@id='1_book_37561461']/div/form/button/span")).click();
		
		//remove book from my book list 
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='siteHeader']/div/header/div[2]/div/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//tbody[@id='booksBody']/tr/td[30]/div/div/a/img[@alt='Remove from my books']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.navigate().back();
		
		  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/header/div[2]/div/div[3]/ul/li[5]/div/a")).click();
		  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/header/div[2]/div/div[3]/ul/li[5]/div/div/div/ul/li[13]/a")).click();
		
	   driver.close();
	   
	   //there is issue if we try to signout after removing book  from my book list, then sign in not working .  

	}

}
