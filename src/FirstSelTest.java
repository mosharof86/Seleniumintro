import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelTest {

	private static List<WebElement> radioButton;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("Hello Selenium!!");
	
		System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium5thBatch\\geckodriver-v0.17.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//WebDriver driver = new ChromeDriver()
		driver.get("http://newtours.demoaut.com/");
		// Maximize the window.
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		
		
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		//driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]")).click();
		@SuppressWarnings("unused")
		Select passengers = new Select(driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")));
		passengers.selectByIndex(2);
		//passengers.selectByVisibleText(2);
	}

}
