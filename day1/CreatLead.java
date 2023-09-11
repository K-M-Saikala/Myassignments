package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreatLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KM");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saikala");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KMSaikala");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selinium");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("this is good");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("15g01a0206@gmail.com");
	    WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(element);
        sec.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.getTitle();
        System.out.println(title);
		
		
		
		
		
		
	}

}
