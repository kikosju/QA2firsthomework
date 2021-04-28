import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Зайти на последнюю статью нажать кнопку коментов, если коментов нету то отписать то что коментов нету.

public class Firstcoment {
    private final By ACCEPT_COOKIE_BTN = By.xpath(".//button[@mode='primary']");
    private final By LAST_PRESS = By.xpath(".//div[@class='list-article__image']");
    private final By SHOW_COMMENTS = By.xpath("//*[@src='/v5/img/icons/comment-v2.svg']");
    @Test
    public void coment(){
        System.setProperty("webdriver.chrome.driver", "D://JAVA/Drivers/chromedriver.exe");
        WebDriver check = new ChromeDriver();
        check.manage().window().maximize();
        check.get("http://tvnet.lv");

        check.findElement(ACCEPT_COOKIE_BTN).click();
        check.findElement(LAST_PRESS).click();

        if(check.findElement(SHOW_COMMENTS)!= null){
            check.findElement(SHOW_COMMENTS).click();
        }else{
            System.out.println("В данны момент раздела коментариев на последней статье нету!");
        }
    }
}
