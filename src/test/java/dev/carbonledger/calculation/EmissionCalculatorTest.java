package dev.carbonledger.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class EmissionCalculatorTest {
    @Test
    void calculatesAndRoundsCarbonDioxideEquivalent() {
        assertEquals(new BigDecimal("113.960"), EmissionCalculator.calculateCo2e(new BigDecimal("40"), new BigDecimal("2.849")));
    }

    @Test
    void rejectsNegativeActivity() {
        assertThrows(IllegalArgumentException.class, () -> EmissionCalculator.calculateCo2e(new BigDecimal("-1"), BigDecimal.ONE));
    }
}
