import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginGoogle {

	@Test
	public void loginpage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selenium softwares\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("javatpoint");
		driver.findElement(By.name("btnk")).click();
		System.out.println("Swathi");
		System.out.println("manasa");
		System.out.println("madhuri");
		System.out.println("manoj");
		


	}

}
