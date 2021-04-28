import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

// Vse zagolvki na home + chislo komentov


public class ChetvertoeZadanie {



    private final By ACCEPT_COOKIE_BTN= By.xpath(".//button[@mode='primary']");
    private final By SHOW_TITLE = By.xpath(".//span[@itemprop ='headline name']");

    @Test

    public void ChetvertijTest() {
        System.setProperty("webdriver.chrome.driver", "D://JAVA/Drivers/chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();
        browserWindow.get("http://tvnet.lv");
        browserWindow.findElement(ACCEPT_COOKIE_BTN).click();
        List<WebElement> alltitles = browserWindow.findElements(SHOW_TITLE);

        for (int b = 0 ;b < alltitles.size(); b++) {
            System.out.println(alltitles.get(b).getText());

        }
    }

изучить replace regular string

    public void setReplace(изучить replace) {
        this.replace = replace;
    }
}




