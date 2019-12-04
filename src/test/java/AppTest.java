import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
    private WebDriver driver;


    @BeforeTest
    public void loadDriver() {
        System.out.println("\n Webdriver is loading..!!");
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void getMethod() {
        System.out.println("\n Website is opening..!!");
        driver.get("https://www.facebook.com/r.php?locale=en_GB");
        
    }

    @Test
    public void setKeys() throws InterruptedException {
        System.out.println("\n  Set Keys method executing");

        Thread.sleep(1000);
        WebElement el1, el2, el3, el4, el5;
        el1 = driver.findElement(By.xpath("//*[@id=\"u_0_n\"]"));
        el1.sendKeys("John");
        Thread.sleep(1000);
        el2 = driver.findElement(By.xpath("//*[@id=\"u_0_p\"]"));
        el2.sendKeys("Marker");

        Thread.sleep(1000);
        el3 = driver.findElement(By.xpath("//*[@id=\"u_0_s\"]"));
        el3.sendKeys("john@mail.com");

        Thread.sleep(1000);
        el4 = driver.findElement(By.xpath("//*[@id=\"u_0_v\"]"));
        el4.sendKeys("john@mail.com");

        Thread.sleep(1000);
        el5 = driver.findElement(By.xpath("//*[@id=\"u_0_x\"]"));
        el5.sendKeys("john12345");

        Thread.sleep(1000);
        Select day, month, year;
        day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        day.selectByVisibleText("20");

        Thread.sleep(1000);
        month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        month.selectByVisibleText("Jul");

        Thread.sleep(1000);
        year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        year.selectByVisibleText("1994");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"u_0_14\"]")).click();


    }

    public void testComplete() {
        System.out.println("\n All test cases executed ");
        driver.close();
    }

    /*public static void main(String[] args) throws InterruptedException {
    	SelenuimTesting s = new SelenuimTesting();
    	s.loadDriver();
    	s.getMethod();
    	s.setKeys();
	}*/

    //Test

}
