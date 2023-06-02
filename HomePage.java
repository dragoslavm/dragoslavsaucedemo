package Stranice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver){
        super(driver);

    }
    By naslovHomePagea = By.className("title");
    By useriPrveStraniceBy = By.xpath("//*[@id='login_credentials']/h4");
    By dodajUKorpu1By = By.id("add-to-cart-sauce-labs-backpack");
    By dodajUKorpu2By = By.id("add-to-cart-sauce-labs-bike-light");
    By korpaBy = By.className("shopping_cart_badge");
    By prviProizvodProveraBy = By.id("item_4_title_link");
    By drugiProizvodProveraBy = By.id("item_0_title_link");
    By zahvalnicaBy = By.xpath("//*[@id='checkout_complete_container']/h2");
    By cekautDugmeBy = By.id("checkout");
    By finishDugmeBy = By.id("finish");
    By imeKupcaBy = By.id("first-name");
    By prezimeKupcaBy = By.id("last-name");
    By zipKodKupcaBy = By.id("postal-code");
    By continueDugmeBy = By.id("continue");
    By konacnaCenaBy = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[8]");
    By kolicinaProizvodaBy = By.className("inventory_item");
    By meniDugmeBy = By.id("react-burger-menu-btn");
    By logoutDugmeBy = By.id("logout_sidebar_link");
    


    public HomePage klikCekaut(){
        click(cekautDugmeBy);
        return this;
        }

    public HomePage klikKontinju(){
        click(continueDugmeBy);
        return this;
        }

    public HomePage klikFinish(){
        click(finishDugmeBy);
        return this;
        }


    public HomePage klikniNaMeni(){
        click(meniDugmeBy);
        return this;
        }
        
    public HomePage klikniNaLogout(){
        click(logoutDugmeBy);
        return this;
        }


    public HomePage dodajProizvodeIUdji(){
        click(dodajUKorpu1By);
        click(dodajUKorpu2By);
        waitVisability(korpaBy);
        click(korpaBy);
        return this;
        }

    

    public HomePage upisivanjePodatakaKupca(String imeKupca, String prezimeKupca, String zipKodKupca){
        writeText(imeKupcaBy, imeKupca);
        writeText(prezimeKupcaBy, prezimeKupca);
        writeText(zipKodKupcaBy, zipKodKupca);
        return this;
        }


    public HomePage proveraUlaska(String expectedText){
        String actualText = readText(useriPrveStraniceBy);
        assertTextEquals(expectedText, actualText);
        return this;
        }

    
    public HomePage porukaZaKraj(String expectedText){
        String actualText = readText(zahvalnicaBy);
        assertTextEquals(expectedText, actualText);
        return this;
        }

    public HomePage zbirCena(String expectedText){
        String actualText = readText(konacnaCenaBy);
        assertTextEquals(expectedText, actualText);
        return this;
        }
    
    public HomePage proveriPrviProizvod(String expectedText){
        String actualText = readText(prviProizvodProveraBy);
        assertTextEquals(expectedText, actualText);
        return this;
        }
    
    public HomePage proveriDrugiProizvod(String expectedText){
        String actualText = readText(drugiProizvodProveraBy);
        assertTextEquals(expectedText, actualText);
        return this;
        }
    
        
    public HomePage brojProizvoda (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(kolicinaProizvodaBy);
        assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
        }
       
}


    
    
    

