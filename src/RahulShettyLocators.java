import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyLocators {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(1000);
//		String password=driver.findElement(By.linkText("Please use temporary password 'rahulshettyacademy' to Login.")).getText();
//		System.out.println(password);
		String password=driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText();
		System.out.println(password);
		driver.findElement(By.xpath("//div/button[contains(text(),'Go to Login')]")).click();
		Thread.sleep(1000);
		String name="rahul";
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
//		in cASE WE to concatenate do it like this
//		sysout("Hello" +name)
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
		driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		String loggedin=driver.findElement(By.xpath("//div/p[contains(text(),'You are successfully logged in.')]")).getText();
		System.out.println(loggedin);
		Assert.assertEquals(loggedin,"You are successfully logged in.");
		String newname=driver.findElement(By.xpath("//div/div/h2")).getText();
		
		System.out.println(newname);
		String[] splitnew=newname.split(" ");
		System.out.println(splitnew[1]);
		String[] splitnew1=splitnew[1].split(",");
		System.out.println(splitnew1[0]);
		Assert.assertEquals(splitnew1[0],name);
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
		//the above can be written like ("//button[text(),'Log Out']") or (//*[text(),'Log Out'])
		driver.close();
		
	}

}
