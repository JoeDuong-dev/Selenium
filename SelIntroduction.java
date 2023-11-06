import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args) {
        System.out.println("Hello World"); 
        //Invoking Browers
        //Chrome Driver 
        System.setProperty("webdriver.chrome.driver", "/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        System.out.println(driver.getTitlte());
    }
}