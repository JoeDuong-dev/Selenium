import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SelIntroduction {
    public static void main(String[] args) throws Exception {
        // Invoking Browers

        // Chrome Driver
        // System.setProperty("webdriver.chrome.driver","./WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Firefox - Gecko driver
        // WebDriver driver = new FirefoxDriver();

        // Firefox - Gecko driver
        // WebDriver driver = new EdgeDriver();

        // Safari
        // WebDriver driver = new SafariDriver();

        // Testing
        driver.get("https://member.staging.iserviceauto.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());

        // driver.close();

        // Quit the driver and stop testing.
        // driver.quit();
    }
}