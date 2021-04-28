import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Zadanie skopirovatj nazvanie statji v konsolj.
// 2 varianta

public class VtoroeZadanie {
        String a;

        private final By ACCEPT_COOKIE_BTN= By.xpath(".//button[@mode='primary']");
      //  private final By LAST_PRESS = By.xpath(".//span[@class='list-article__headline']"); // variant 2
      private final By SHOW_TITLE = By.xpath(".//span[@class='list-article__headline']");
        @Test

        public void firstTest() {
            System.setProperty("webdriver.chrome.driver", "D://JAVA/Drivers/chromedriver.exe");
            WebDriver browserWindow = new ChromeDriver();
            browserWindow.manage().window().maximize();
            browserWindow.get("http://tvnet.lv");
            browserWindow.findElement(ACCEPT_COOKIE_BTN).click();
          a = browserWindow.findElement(SHOW_TITLE).getText();
            // String title = browserWindow.getTi // variant 2
            //browserWindow.findElement(LAST_PRESS).click();   // variant 2


            System.out.println(a); /// pomenyatj na title

        }
}
