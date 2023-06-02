package Testovi;

import org.junit.Test;

import Stranice.HomePage;
import Stranice.LoginPage;

public class KupovinaProveraTest extends BaseTest{
    public LoginPage loginPage;
    public HomePage homePage;
    String dobarUser = "standard_user";
    String dobarPass = "secret_sauce";
    String imePrvogProizvoda = "Sauce Labs Backpack";
    String imeDrugogProizvoda = "Sauce Labs Bike Light";


@Test

public void kupovinaProvera(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login(dobarUser, dobarPass);
    homePage.dodajProizvodeIUdji();
    homePage.proveriPrviProizvod(imePrvogProizvoda);
    homePage.proveriDrugiProizvod(imeDrugogProizvoda);

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
}
