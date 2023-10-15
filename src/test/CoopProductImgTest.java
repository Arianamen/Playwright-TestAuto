package test;

import org.junit.jupiter.api.Test;

import page.CoopProductImg;
import test.base.TestBase;

public class CoopProductImgTest extends TestBase {


    @Test
    public void coopProductImgTest() {

    	CoopProductImg coopProductImgTest = new CoopProductImg(page);

    	coopProductImgTest.openCoopPage();
    	coopProductImgTest.selectProduct();
    	coopProductImgTest.assertImgGurka();

    }


}