import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvisbleDataSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Test\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// check box validation
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
			// Auto suggested option validation 
		driver.findElement(By.cssSelector("input#autocomplete.inputs.ui-autocomplete-input")).sendKeys("Ind");
		Thread.sleep(3000);
	List<WebElement> Options=driver.findElements(By.xpath("//*[@id=\'ui-id-3\']"));
		
		for(WebElement Option :Options) {
			
			if(Option.getText().contentEquals("India"));
			Option.click();
			break;
			
		}

	}

}
