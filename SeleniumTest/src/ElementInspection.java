import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInspection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Test\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("vijayksu");
		driver.findElement(By.id("pass")).sendKeys("Kavishree1232");
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.navigate().back();
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		
		//driver.close();
		

	}

}
