package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionBody']//a)[3]")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("vikasreddyg3@gmail.com");
		//Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	    String sai = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a)")).getText();
	    System.out.println(sai);
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a")).click();
	    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	    String name = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
	    System.out.println("verifying title as Duplicate lead : "+name);
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    String name2 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	    System.out.println("confirmed duplicate name is "+name2);
	    
		
		
		
		
		
	}

}
