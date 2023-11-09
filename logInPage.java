import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class logInPage {
    public static void main(String[] args) throws Exception {
        // Invoking Browers
        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        // WebDriver driver = new EdgeDriver();
        // WebDriver driver = new SafariDriver();

        // Testing
        driver.get("https://member.staging.iserviceauto.com/login/");

        // Locator for the Username field by Id.
        // Using sendKeys() to type.
        driver.findElement(By.id("username")).sendKeys("texternalauth@iserviceauto.com");

        // Locator for the Password field by Id.
        driver.findElement(By.name("password")).sendKeys("test1234!");

        // driver.findElement(By.tagName("INPUT")).click();

        // Locator for the Log In button by class name
        // Using click() to... click
        // driver.findElement(By.xpath("//BUTTON[@outerText='Log In']")).click();
        driver.findElement(By.className("btn btn-primary")).click();
        // driver.close();
        // driver.quit();
    }
}