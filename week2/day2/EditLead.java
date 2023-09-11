package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("saravana");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		WebElement Cname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		String name= Cname.getText();
		
		Cname.clear();
		Cname.sendKeys("Capgemini");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String name2 = driver.findElement(By.xpath("//span[@id=\"viewLead_companyName_sp\"]")).getText();
		System.out.println(name);
		System.out.println("the company name is verified"+ name2);
		driver.close();
		
		
		
		
		
	}

}
