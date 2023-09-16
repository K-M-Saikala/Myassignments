package week4day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])")).getText();
		System.out.println("price of the first product : "+text);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])")).click();
		WebElement findElement = driver.findElement(By.xpath("//span[contains(@class,'a-text-beside-button a-text-bold')]"));
		String text2 = findElement.getText();
		System.out.println(text2);

		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String each : windowHandles) {
			System.out.println(each);
		}
		List<String> handles = new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-price a-text-bold']/span)"));
		String text3 = findElement2.getText();
		System.out.println(text3);
		if (text.equals(text3)) {
			System.out.println("verified prices");
		}
		//driver.quit();
	}

}
