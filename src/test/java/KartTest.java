import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KartTest {

    @Test
    public void testProductsQuantity(){
        Kart myKart = new Kart();
        int expected1 = 0;

        Assertions.assertEquals(expected1, myKart.getProductsQuantity(), "Fallo testProductsQuantity1");
    }

    @Test
    public void testAddProduct(){
        Kart myKart = new Kart();
        Camisa newCamisa = Camisa.CAMISA2;
        myKart.addProduct(newCamisa);

        Assertions.assertTrue(myKart.addProduct(newCamisa), "Fallo testAddProduct");
    }

    @Test
    public void testCalculateSubtotal(){
        Kart myKart = new Kart();
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA2);
        myKart.addProduct(Camisa.CAMISA3);

        float expected = Camisa.CAMISA1.getPrice()+Camisa.CAMISA2.getPrice()+Camisa.CAMISA3.getPrice();

        Assertions.assertEquals(expected, myKart.calculateSubtotal(), "Fallo testCalculateSubtotal");
    }

    @Test
    public void testCalculateDiscountPercentage(){
        Kart myKart = new Kart();
        myKart.addProduct(Camisa.CAMISA3);
        myKart.addProduct(Camisa.CAMISA3);
        int expected = 0;
        Assertions.assertEquals(expected, myKart.calculateDiscountPercentage(), "Fallo testCalculateDiscountPercentage1");
        myKart.addProduct(Camisa.CAMISA2);
        myKart.addProduct(Camisa.CAMISA2);
        myKart.addProduct(Camisa.CAMISA2);
        expected = 5;
        Assertions.assertEquals(expected, myKart.calculateDiscountPercentage(), "Fallo testCalculateDiscountPercentage2");
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        expected = 8;
        Assertions.assertEquals(expected, myKart.calculateDiscountPercentage(), "Fallo testCalculateDiscountPercentage3");
    }

    @Test
    public void testCalculateDiscount(){
        Kart myKart = new Kart();
        myKart.addProduct(Camisa.CAMISA3);
        myKart.addProduct(Camisa.CAMISA3);
        float expected = 0;
        float actual = myKart.calculateDiscount();
        Assertions.assertEquals(expected, actual, "Fallo testCalculateDiscount 1");
        myKart.addProduct(Camisa.CAMISA2);
        myKart.addProduct(Camisa.CAMISA2);

        expected = 54;
        actual = myKart.calculateDiscount();
        Assertions.assertEquals(expected, actual, "Fallo testCalculateDiscount 2");

        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        expected = 132;
        actual = myKart.calculateDiscount();
        Assertions.assertEquals(expected, actual, "Fallo testCalculateDiscount 3");

    }

    @Test

    public void testCalculateTotal(){
        Kart myKart = new Kart();
        myKart.addProduct(Camisa.CAMISA3);
        myKart.addProduct(Camisa.CAMISA3);
        float expected = 620;
        float actual = myKart.calculateTotal();
        Assertions.assertEquals(expected, actual, "Fallo testCalculateTotal 1");
        myKart.addProduct(Camisa.CAMISA2);
        myKart.addProduct(Camisa.CAMISA2);

        expected = 1026;
        actual = myKart.calculateTotal();
        Assertions.assertEquals(expected, actual, "Fallo testCalculateTotal 2");

        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        myKart.addProduct(Camisa.CAMISA1);
        expected = 1518;
        actual = myKart.calculateTotal();
        Assertions.assertEquals(expected, actual, "Fallo testCalculateTotal 3");
    }
}
