import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Test\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		String title, url;
		title=driver.getTitle();
		System.out.println("" +title);
		url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.getPageSource();
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
		//driver.navigate().back();
		driver.navigate().forward();
driver.close();
	}

}
