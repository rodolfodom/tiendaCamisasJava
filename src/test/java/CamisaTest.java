import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class CamisaTest {
    @DisplayName("Test del metodo para obtener ID de la enumeracion de camisas")
    @Test
    public void getIdTest(){
        Camisa Camisa1 = Camisa.CAMISA1;
        Camisa Camisa2 = Camisa.CAMISA2;
        Camisa Camisa3 = Camisa.CAMISA3;
        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 3;

        Assertions.assertEquals(expected1, Camisa1.getId(), "Fallo test getID camisa1");
        Assertions.assertEquals(expected2, Camisa2.getId(), "Fallo test getID camisa2");
        Assertions.assertEquals(expected3, Camisa3.getId(), "Fallo test getID camisa3");

    }

    public void getPriceTest(){
        Camisa Camisa1 = Camisa.CAMISA1;
        Camisa Camisa2 = Camisa.CAMISA2;
        Camisa Camisa3 = Camisa.CAMISA3;
        float expected1 = 190.0F;
        float expected2 = 230.0F;
        float expected3 = 310.0F;

        Assertions.assertEquals(expected1, Camisa1.getPrice(), "Fallo test getPrice camisa1");
        Assertions.assertEquals(expected2, Camisa2.getPrice(), "Fallo test getPrice camisa2");
        Assertions.assertEquals(expected3, Camisa3.getPrice(), "Fallo test getPrice camisa3");
    }
}
