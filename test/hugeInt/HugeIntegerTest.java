package hugeInt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugeIntegerTest {


    @Test
    public void hugeIntegerTest() {
        HugeInteger hugeInt = new HugeInteger();
        assertEquals(30, hugeInt.size());
    }
}
