package week4day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following::img")).click();
		//driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following::img")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
			
		}
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following::img")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string : windowHandles2) {
			System.out.println(string);
			
		}
		List<String> list2 = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list2.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[2]")).click();
		driver.switchTo().window(list2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
	    System.out.println(text);
	    
		alert.accept();
		
		
		
		
	}

}
