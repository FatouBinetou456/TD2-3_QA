package sn.fbd.qa.junit;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testIsEven() {
        int division= MathUtils.divide(4,2);
        assertThat(division).isEqualTo(2);
    }


    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(4, 0));
    }

}


