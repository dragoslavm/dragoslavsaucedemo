package Testovi;

import org.junit.Test;

import Stranice.BasePage;
import Stranice.HomePage;
import Stranice.LoginPage;

public class HomepageTest extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;
    String dobarUser = "standard_user";
    String dobarPass = "secret_sauce";
    int brojSvihProizvoda = 6;


@Test
public void brojProizvoda(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login(dobarUser, dobarPass);
    homePage.brojProizvoda(brojSvihProizvoda);

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
    
}
