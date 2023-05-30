package step_Defs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.N11Page;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class n11_stepDefs {

    N11Page n11Page= new N11Page();

    @When("Kullanici Kategoriler butonuna tiklar")
    public void kullanici_kategoriler_butonuna_tiklar() {
        clickJS(n11Page.kategorilerBtn);
    }
    @When("Kullanici Elektronik butonuna tiklar")
    public void kullanici_elektronik_butonuna_tiklar() {
        clickJS(n11Page.elektronikBtn);
    }
    @When("Kullanici Bilgisayar butonuna tiklar")
    public void kullanici_bilgisayar_butonuna_tiklar() {
        clickJS(n11Page.bilgisayarBtn);
    }
    @When("Kullanici Tablet butonuna tiklar")
    public void kullanici_tablet_butonuna_tiklar() {
        clickJS(n11Page.tabletBtn);
    }
    @When("Kullanici karsisina cikan ilk urune tiklar")
    public void kullanici_karsisina_cikan_ilk_urune_tiklar() {
        clickJS(n11Page.ilkurun);
    }
    @Then("Kullanici urune ait fotograflarin gorundugunu dogrular")
    public void kullanici_urune_ait_fotograflarin_gorundugunu_dogrular() {
        for (int i=0; i<n11Page.urunResimNoktalar.size(); i++){
            Assert.assertTrue(n11Page.urunResim.isDisplayed());
            swipe(n11Page.urunResim, "left", 10);
        }
    }


}
