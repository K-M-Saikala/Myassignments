package week4day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println("the open button details"+string);
			
		}
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.switchTo().window(list.get(0));
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String string2 : windowHandles2) {
			System.out.println("close window details"+string2);
			
		}
		List<String> list2 = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list2.get(1));
		driver.switchTo().window(list2.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		for (String string3 : windowHandles3) {
			System.out.println("open multiple button details "+string3);
			
		}
		List<String> list3 = new ArrayList<>(windowHandles3);
		driver.switchTo().window(list3.get(1));
		driver.switchTo().window(list3.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		for (String string4 : windowHandles4) {
			System.out.println("open with delay button details"+string4);
			
		}
		List<String> list4 = new ArrayList<>(windowHandles4);
		driver.switchTo().window(list4.get(1));
		driver.switchTo().window(list4.get(0));
		
	    
		
		
	}

}
