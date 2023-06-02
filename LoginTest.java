package Testovi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Stranice.HomePage;
import Stranice.LoginPage;

public class LoginTest extends BaseTest{
    public LoginPage loginPage;
    public HomePage homePage;
    String dobarUser = "standard_user";
    String dobarPass = "secret_sauce";
    String naslovPrveStranice = "Accepted usernames are:";
    String prazanUser = "";
    String prazanPass = "";
    String praznaObaPolja = "Epic sadface: Username is required";
    String pogresanPass = "test";
    String pogresanUser = "testiranje";
    String pogresnaOba = "Epic sadface: Username and password do not match any user in this service";
    String problemuser = "problem_user";
    String problemBezPassa = "Epic sadface: Password is required";


@Test
public void uspesanLoginLogout(){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login(dobarUser, dobarPass);
    homePage.klikniNaMeni();
    homePage.klikniNaLogout();
    homePage.proveraUlaska(naslovPrveStranice);

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}

@Test
public void obaPoljaPrazna(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(prazanUser, prazanPass );
    loginPage.neuspesnoLogovanje(praznaObaPolja);
    

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

}


@Test
public void obaPoljaPogresna(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(pogresanUser, pogresanPass);
    loginPage.neuspesnoLogovanje(pogresnaOba);
    

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }

}


@Test
public void userProblemBezPassa(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(problemuser, prazanPass);
    loginPage.neuspesnoLogovanje(problemBezPassa);
    

    try{
        Thread.sleep(5000);
    }catch(InterruptedException e){
        e.printStackTrace();
    }
}

}
