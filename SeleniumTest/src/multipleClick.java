import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Test\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[1]/input")).click();
		Thread.sleep(2000L);
//int i=4;

		
for(int i=1; i<5;i++) {
	driver.findElement(By.cssSelector("button.pax-plus.btn.btn-info")).click();
	
}

driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[1]/input[1]")).click();
for(int j=5; j>4;j--);{
driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[5]/div[1]/div[2]/ul/li[1]/div[1]/button[1]")).click();

//driver.findElement(By.cssSelector("button.pax-minus.btn.btn-info"))
}
	} 

}
