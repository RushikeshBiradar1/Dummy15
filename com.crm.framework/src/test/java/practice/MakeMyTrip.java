package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String srcCity="Mysore, India";
		
		//from city
		WebElement src = driver.findElement(By.id("fromCity"));
		src.sendKeys("'"+srcCity+"'");
		driver.findElement(By.xpath("//p[text()='"+srcCity+"']")).click();
		
		//tocity
		String destCity="Kochi, India";
		WebElement des = driver.findElement(By.id("toCity"));
		des.sendKeys("'"+destCity+"'");
		des.findElement(By.xpath("'"+destCity+"'")).click();
		
		
		
		
		


	}

}
