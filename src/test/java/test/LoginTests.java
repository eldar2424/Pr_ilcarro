package test;

<<<<<<< Updated upstream
import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
=======
import org.openqa.selenium.By;
>>>>>>> Stashed changes
import org.testng.annotations.Test;

public class LoginTests extends  TestBase {

    @BeforeMethod
    public void preCondition() {
        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logout();
        }
    }

    @Test
<<<<<<< Updated upstream
    public void loginSuccess1() {
=======
    public void loginSuccess(){

>>>>>>> Stashed changes

        User user = new User().setEmail("eldar@mail.com").setPassword("Abcde12345!");
//        user.setEmail("noa@gmail.com");
//        user.setPassword("Nnoa12345$");

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm(user);
        app.getHelperUser().submit();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
    }

    @Test
    public void loginSuccess() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("eldar@mail.com", "Abcde12345!");
        app.getHelperUser().submit();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
    }

    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("eldar@mail.com", "Abcde12345");
        app.getHelperUser().submit();
        //Assert if element with text "Logged in success" is present
        Assert.assertEquals(app.getHelperUser().getMessage(), "Logged in success");
    }
    @Test
    public void loginWrongEmail(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("","Abcde12345");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getErrorText(),"It's not look like email");
        Assert.assertTrue(app.getHelperUser().isYallaButtonNotActive());
    }

    @Test
    public void loginWrongPassword(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("eldar@mail.com","Abcde1");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(),"\"Login or Password incorrect\"");
    }

    @Test
    public void loginUnregistered(){
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("richo@mail.com","oyster12345$");
        app.getHelperUser().submit();
        Assert.assertEquals(app.getHelperUser().getMessage(),"\"Login or Password incorrect\"");
    }
    @AfterMethod
    public  void postCondition(){
        app.getHelperUser().closeWindow();
    }

}