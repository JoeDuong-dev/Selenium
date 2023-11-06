import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) throws Exception {
        // Invoking Browers
        // Chrome Driver
        // System.setProperty("webdriver.chrome.driver","./chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://member.staging.iserviceauto.com/");

        // Testing
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // driver.quit();
    }
}