package pageObjects;


import functionsLibrary.CommonFunctions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfiniteScrollPage {

    private WebDriver driver;

    private long lastHeight;
    private long newHeight;
    private long currentHeight;
    private int counter=0;

    CommonFunctions commonFunctions = new CommonFunctions();

    @FindBy(xpath="//*[@id=\"content\"]/ul/li[26]/a")
    private WebElement infiniteScrollLink;
    @FindBy(xpath="//*[@id=\"content\"]/div/h3")
    private WebElement infiniteScrollTitle;

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clkScrollLink() {
        infiniteScrollLink.click();
    }
    public String getTitle(){
        return infiniteScrollTitle.getText();
    }

    public void scrollBottom() {
        JavascriptExecutor jse =(JavascriptExecutor)driver;

        lastHeight=(long) jse.executeScript("return document.body.scrollHeight");
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        while (counter<2){
            newHeight=(long) jse.executeScript("return document.body.scrollHeight");
            lastHeight=newHeight;
            jse.executeScript("window.scrollTo("+lastHeight+",document.body.scrollHeight);");
            commonFunctions.wait(5);
            System.out.println(lastHeight);
            System.out.println(newHeight);
            counter++;

        }

    }

 /*JavascriptExecutor jse = (JavascriptExecutor) driver;
        lastHeight = (long) jse.executeScript("return document.body.scrollHeight");
        System.out.println(lastHeight);
        while (counter < 2) {
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            newHeight = wait.until(driver ->infiniteScroll(lastHeight));
            System.out.println(lastHeight);
            lastHeight = newHeight;
            counter++;
        }*/
}
        /*public long infiniteScroll(long height){
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            this.lastHeight=height;
            currentHeight = (long)jse.executeScript("return document.body.scrollHeight");
            if(currentHeight > lastHeight)
                return currentHeight;
            else
                return 0;

        }*/
