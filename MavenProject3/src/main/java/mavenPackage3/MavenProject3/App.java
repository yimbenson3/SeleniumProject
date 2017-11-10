package mavenPackage3.MavenProject3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
	
	
	public static void main(String[] args) {
// For Testing with FIREFOX 		
//		System.setProperty("webdriver.gecko.driver","C://geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 //To Maximize Browser Window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.orbitz.com");
		driver.findElement(By.id("tab-flight-tab")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Wait for Page to Refresh 
		
		driver.findElement(By.id("flight-origin")).sendKeys("YVR");
		driver.findElement(By.id("flight-destination")).sendKeys("SFO");
		driver.findElement(By.id("flight-departing")).sendKeys("12/19/2017");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("flight-returning")).clear();
		driver.findElement(By.id("flight-returning")).sendKeys("12/23/2017");
		driver.findElement(By.id("search-button")).click();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// Might need to wait longer depending on Internet Speed 
		
		System.out.println("Displaying Prices for Dates Dec 19 to Dec 23");
// DISPLAY THE FIRST FIVE PRICES
		System.out.println("==============================");
	
		System.out.println("First Price = "+ driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[1]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Second Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[2]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Third Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[3]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Fourth Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[4]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Fifth Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[5]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());

		System.out.println("==============================");
		
		// Loop for dates from December 20 to 24 

		driver.findElement(By.id("departure-date-1")).clear();
		driver.findElement(By.id("departure-date-1")).sendKeys("12/20/2017");
		driver.findElement(By.id("return-date-1")).clear();
		driver.findElement(By.id("return-date-1")).sendKeys("12/24/2017");
		driver.findElement(By.id("flight-wizard-search-button")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
// DISPLAY THE FIRST FIVE PRICES
		
		System.out.println("Displaying Prices for Dates Dec 20 to Dec 24");
		System.out.println("==============================");
			
		System.out.println("First Price = "+ driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[1]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Second Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[2]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Third Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[3]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Fourth Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[4]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Fifth Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[5]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());

		System.out.println("==============================");
	
//		// Loop for dates from December 21 to 25
		driver.findElement(By.id("departure-date-1")).clear();
		driver.findElement(By.id("departure-date-1")).sendKeys("12/21/2017");
		driver.findElement(By.id("return-date-1")).clear();
		driver.findElement(By.id("return-date-1")).sendKeys("12/25/2017");
		driver.findElement(By.id("flight-wizard-search-button")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("Displaying Prices for Dates Dec 21 to Dec 25");
		
// DISPLAY THE FIRST FIVE PRICES
		System.out.println("==============================");
					
		System.out.println("First Price = "+ driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[1]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Second Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[2]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Third Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[3]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Fourth Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[4]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());
		System.out.println("Fifth Price = " + driver.findElement(By.xpath("/html/body/div[3]/div[6]/section/div[8]/ul/li[5]/div[2]/div/div[2]/div/div/div[1]/span[2]")).getText());

		System.out.println("==============================");	
		
		
		driver.close();
		
		
			
			
			
		
		
		
		
	}


}

