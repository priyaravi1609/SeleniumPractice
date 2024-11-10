import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;
public class RahulShettyLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Priya");
		driver.findElement(By.name("inputPassword")).sendKeys("Test");
		//driver.findElement(By.xpath(//input[@type='submit’]).click();
		//driver.findElement(By.cssSelector(input[type='submit'])).click();
		driver.findElement(By.className("signInBtn")).click();


		String textval = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(textval);
		if(textval == "* Incorrect username or password") {
			driver.findElement(By.linkText("Forgot your password?")).click();
			
		}
		
		System.out.println(driver.findElement(By.linkText("Forgot your password?")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Priya");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("priyabme40@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8212154654");
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String password=driver.findElement(By.linkText("Please use temporary password 'rahulshettyacademy' to Login.")).getText();
		
	}

}
