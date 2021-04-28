import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Zajti na pervuju statju u kotoroj estj komentarii (na moment kogda ja delal eto u pervoj statji nebilo comentov voobse)
//Daze ikonki (tolko FB) po etomu sdelal po drugomu..

public class Firstcoment {
    private final By ACCEPT_COOKIE_BTN = By.xpath(".//button[@mode='primary']");
    //private final By LAST_PUBLISHED_PRESS = By.xpath(".//span[@class='list-article__headline']");
    // private final By PUBLICATION_COMMENTS = By.xpath(".//span[@class='article-share__item--count']");
    private final By PUBLICATION_COMMENTS_MAIN = By.xpath(".//span[@class='list-article__comment section-font-color']");
    // private final By PUBLICATION_COMMENTS_FB = By.xpath(".//span[@class='article-share__item--count']");
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "D://JAVA/Drivers/chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();
        browserWindow.get("http://tvnet.lv");
        browserWindow.findElement(ACCEPT_COOKIE_BTN).click();
        //browserWindow.findElement(LAST_PUBLISHED_PRESS).click();
        browserWindow.findElement(PUBLICATION_COMMENTS_MAIN).click();

    }
}
