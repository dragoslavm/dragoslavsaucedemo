package Testovi;

import org.junit.Test;

import Stranice.HomePage;
import Stranice.LoginPage;

public class CenaCekautTest extends BaseTest {
    public LoginPage loginPage;
    public HomePage homePage;
    String dobarUser = "standard_user";
    String dobarPass = "secret_sauce";
    String imeKupca1 = "Dragoslav";
    String prezimeKupca1 = "Milenkovic";
    String zipKodKupca1 = "37230";
    String hvalaNaKupovini = "Thank you for your order!";
    String zbirProizvodaPoreza = "Total: $43.18";
     





@Test
public void cenaCekautIProvera(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login(dobarUser, dobarPass);
    homePage.dodajProizvodeIUdji();
    homePage.klikCekaut();
    homePage.upisivanjePodatakaKupca(imeKupca1, prezimeKupca1, zipKodKupca1);
    homePage.klikKontinju();
    homePage.zbirCena(zbirProizvodaPoreza);
    homePage.klikFinish();
    homePage.porukaZaKraj(hvalaNaKupovini);

    


    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}
}
