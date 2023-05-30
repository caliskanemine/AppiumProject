package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    public WebElement searchBox;

    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    public WebElement searchBar;

    @AndroidFindBy(uiAutomator = "text(\"Corporate Website of Orange - orange.com | Corporate\")")
    public WebElement firstItem;


}


