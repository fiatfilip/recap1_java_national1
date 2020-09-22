package siit.hw4;

import org.junit.Assert;
import org.junit.Test;

public class VWGolfTest {
    @Test
    public void checkConsumptionPer100KM(){
        Car vwGolf1 = new VWGolf(20, "VWQWERTTYUEWS342342!");
        vwGolf1.start();
        vwGolf1.shiftGear(5);
        vwGolf1.drive(100);
        Assert.assertEquals(7.9, vwGolf1.stop(), 0);
    }

    @Test
    public void checkConsumption4thGear(){
        Car vwGolf1 = new VWGolf(20, "VWQWERTTYUEWS342342!");
        vwGolf1.start();
        vwGolf1.shiftGear(4);
        vwGolf1.drive(50);
        Assert.assertEquals(7.11/2, vwGolf1.stop(), 0);
        Assert.assertEquals(7.11, vwGolf1.getAverageFuelConsumption(), 0);
    }
}
