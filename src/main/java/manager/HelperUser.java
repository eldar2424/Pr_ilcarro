package manager;

<<<<<<< Updated upstream
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
=======
import org.openqa.selenium.By;
>>>>>>> Stashed changes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


<<<<<<< Updated upstream
public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        //click(By.cssSelector("[href='/login?url=%2Fsearch']"));
        //click(By.cssSelector("a[href ^='/login']"));
        click(By.xpath("//a[text()='  Log in ']"));

    }

    public void fillLoginForm(String email, String password) {
        type(By.id("email"), email);
        type(By.id("password"), password);
    }

    public void fillLoginForm(User user) {
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }

    public void submit() {
        click(By.cssSelector("button[type=['submit']"));
    }

    public String getMessage() {
        //WebElement element = wd.findElement(By.cssSelector(".dialog-container>h2"));
        //String  text = element.getText();
        //return text;

        //wait

        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(wd.findElement(By.cssSelector(".dialog-container"))));

        // pause(8000);
        return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();

    }

    public void closeWindow() {
        if (isElementPresent(By.xpath("//button[text()='Ok']")))
            click(By.xpath("//button[text()='Ok']"));

    }

    public boolean isLogged() {
        return isElementPresent(By.xpath("//a[text()=' Logout ']"));
    }

    public void logout() {
        click(By.xpath("//a[text()= ' Logout ' ]"));
    }

    public String getErrorText() {
        String text = wd.findElement(By.cssSelector("div.error")).getText();
        System.out.println(text);

        return text;
    }

    public boolean isYallaButtonNotActive(){
        boolean res =  isElementPresent(By.cssSelector("button[disabled]"));
        WebElement element = wd.findElement(By.cssSelector("button[type= 'submit']"));
        boolean result = element.isEnabled();
        return res && !result;
    }
    //
///****************** Registration****************
    public void openRegistrationForm() {
        click(By.xpath("//a[text()=' Sign up ']"));
    }

    public void fillRegistrationForm(User user) {
        type(By.id("name"), user.getFirstName());
        type(By.id("lastName"), user.getLastName());
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }

    public void checkPolicy() {
        // click(By.id("terms-of-use")); 0*0
        click(By.cssSelector("label[for='terms-of-use']"));
        // document.querySelector('#terms-of-use').click();
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("document.querySelector('#terms-of-use').click();");
=======
    public void openLoginForm(){
        click(By.cssSelector("a[href='/login'))
>>>>>>> Stashed changes
    }
}


