import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    
}
