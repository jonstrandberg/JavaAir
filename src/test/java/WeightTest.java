import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeightTest {

    @Test
    public void hasWeight() {
        Weight weight = new Weight(70.5, "kg");
        assertEquals(70.5, weight.getWeight(), 0.01);
    }

    @Test
    public void canSetWeight() {
        Weight weight = new Weight(70.5, "kg");
        weight.setWeight(75.0);
        assertEquals(75.0, weight.getWeight(), 0.01);
    }

    @Test
    public void hasUnitOfMeasurement() {
        Weight weight = new Weight(70.5, "kg");
        assertEquals("kg", weight.getUnit());
    }

    @Test
    public void canSetUnitOfMeasurement() {
        Weight weight = new Weight(70.5, "kg");
        weight.setUnit("lbs");
        assertEquals("lbs", weight.getUnit());
    }

}




