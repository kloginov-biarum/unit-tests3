import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();
        assertEquals(400,
                cost.deliveryCostCalc(2,true,false,"Высокая"));
    }

    @Test
    void deliveryCostCalc1() {
        Cost cost = new Cost();
        assertEquals(980,
                cost.deliveryCostCalc(30,true,true,"Высокая"));
    }
}