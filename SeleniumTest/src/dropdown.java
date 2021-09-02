import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Test\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://facebook.com");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement staticdropdown = driver.findElement(By.name("dropdown-class-example"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(2);
		//dropdown.selectByValue("Option3");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Option3");
		
	}

}
