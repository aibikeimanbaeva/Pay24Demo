
package com.digital.services.payments.govermentServises.aiylOkmotuu;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AkDoboAiylOkmotuuTest extends GovermentServisesTest {
    @BeforeClass
    public void openPage() {
        akDoboAiylOkmotuuPage.openAiylOkmotuu();
    }

    @Test(priority = 1)
    public void checkWriteOffAccountsBlock() {
        akDoboAiylOkmotuuPage.openAkDoboAiylOkmotuu()
                .clickToCard();
        Assert.assertTrue(akDoboAiylOkmotuuPage.masterCardBlockText.getText().contains("Mastercard"));

    }

    ;

    @Test(priority = 2)
    public void checkINNInp() {
        akDoboAiylOkmotuuPage.fillUpTheINNInp("1107200001765");
        Assert.assertEquals(akDoboAiylOkmotuuPage.INNInp.getAttribute("value").trim(), "1107200001765");

    }

    @Test(priority = 3)
    public void checkFullNameInp() throws InterruptedException {
        akDoboAiylOkmotuuPage.fillUpTheFullNameInp("Aisuluu");
        Assert.assertEquals(akDoboAiylOkmotuuPage.fullNameInp.getAttribute("value").trim(), "Aisuluu");
    }
    @Test(priority = 4)
    public void checkServiseInp() {
        akDoboAiylOkmotuuPage.clickToServicesInp();
        Assert.assertNotNull(akDoboAiylOkmotuuPage.clickTheService.getText());

    }
    @Test(priority = 4)
    public void checkSumInp() {
        akDoboAiylOkmotuuPage.fillUpTheSumInp("200");
        Assert.assertEquals(akDoboAiylOkmotuuPage.sumInp.getAttribute("value").trim(), "200");
    }

}
