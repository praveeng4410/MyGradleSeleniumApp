import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class App 
{
    public static void main( String[] args )
    {
        // 1. Setup Chrome Options to reduce pop-up interference
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/opt/chrome146/chrome");
        options.addArguments("--headless=new");       
        options.addArguments("--no-sandbox");         
        options.addArguments("--disable-dev-shm-usage"); 
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
    public String getGreeting() {
        return "Hello world.";
    }
   
}
