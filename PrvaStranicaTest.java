package Testovi;

import org.junit.Test;

import Stranice.HomePage;
import Stranice.LoginPage;

public class PrvaStranicaTest extends BaseTest{
    public LoginPage loginPage;
    public HomePage homePage;
    String useriPrveStranice = "Accepted usernames are:";
    
    
    

@Test
public void odlazaknastranicu(){

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    homePage.proveraUlaska(useriPrveStranice);
    

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}


}
