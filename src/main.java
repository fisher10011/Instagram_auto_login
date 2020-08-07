import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;


public class main {
    public static void main(String[] args) {

    	main test = new main();
    	test.login();
    }



    private WebDriver driver;
    private WebElement element;
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "chromedriver.exe";

    private String base_url;
    
    public main() {
        super();
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        driver = new ChromeDriver();
        base_url = "https://www.instagram.com/accounts/login/";
    }
    
public void login() {

    System.setProperty("webdriver.chrome.driver","chromedriver.exe");

    driver.get("https://www.instagram.com/accounts/login/?hl=en&source=auth_switcher");

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.findElement(By.name("username")).sendKeys("Instagram ID");
    driver.findElement(By.name("password")).sendKeys("Instagram PW");
    driver.findElement(By.xpath("//div[text()='Log In']")).click();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div/section/div/button")).click();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    
}

}