package dev.carbonledger.calculation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class EmissionCalculator {
    private EmissionCalculator() {}

    public static BigDecimal calculateCo2e(BigDecimal activityAmount, BigDecimal factor) {
        Objects.requireNonNull(activityAmount, "activityAmount is required");
        Objects.requireNonNull(factor, "factor is required");
        if (activityAmount.signum() < 0 || factor.signum() < 0) {
            throw new IllegalArgumentException("activity amount and factor must be non-negative");
        }
        return activityAmount.multiply(factor).setScale(3, RoundingMode.HALF_UP);
    }
}
