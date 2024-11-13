import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class advancedLocators {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		String password=getPassword(driver);
		String name="rahul";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		String loggedin=driver.findElement(By.xpath("//div/p[contains(text(),'You are successfully logged in.')]")).getText();
		System.out.println(loggedin);
		Assert.assertEquals(loggedin,"You are successfully logged in.");
		driver.close();
		
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String passwordval=driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText();
		
		String[] Totalsplit=passwordval.split("'");

		return Totalsplit[1];
	}
}
