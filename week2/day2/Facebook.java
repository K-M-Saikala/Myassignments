package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("KM");
		driver.findElement(By.name("lastname")).sendKeys("Saikala");
		driver.findElement(By.name("reg_email__")).sendKeys("8358985345");
		WebElement id = driver.findElement(By.id("day"));
		Select DD = new Select(id);
		DD.selectByValue("14");
		WebElement month = driver.findElement(By.id("month"));
		Select sec = new Select(month);
		sec.selectByValue("7");
		WebElement year = driver.findElement(By.id("year"));
		Select sec1 = new Select(year);
		sec1.selectByValue("1998");
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
	}
		
	}
		
