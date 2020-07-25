package phep_tinh_don_gian;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    @DisplayName("Testing add 4 + 5")
    void plus() {
        SimpleCalculator ex = new SimpleCalculator();
        int result = ex.plus(4, 5);
        assertEquals(9, result);

    }

    @Test
    @DisplayName("Testing add 6 + 3")
    void plus1() {
        SimpleCalculator ex1 = new SimpleCalculator();
        int result1 = ex1.plus(6, 3);
        assertEquals(9, result1);
    }


    @Test
    @DisplayName("Testing sub 7 - 2")
    void sub() {
        SimpleCalculator ex2 = new SimpleCalculator();
        int result2 = ex2.sub(7,2);
        assertEquals(5,result2);
    }
}


