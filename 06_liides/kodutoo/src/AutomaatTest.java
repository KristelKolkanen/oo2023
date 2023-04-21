import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    @Test
    public void test_airbnb_tallinn(){
        AirBnbTallinn airBnbTallinn=new AirBnbTallinn(2,1,"Nimi");
        assertEquals(105, airBnbTallinn.getPriceForTallinn(),0);
    }
}
