package dev.carbonledger.calculation;

import java.math.BigDecimal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculations")
public class CalculationController {
    public record Request(BigDecimal activityAmount, BigDecimal emissionFactor) {}
    public record Response(BigDecimal co2e, String unit) {}

    @PostMapping
    public ResponseEntity<Response> calculate(@RequestBody Request request) {
        var total = EmissionCalculator.calculateCo2e(request.activityAmount(), request.emissionFactor());
        return ResponseEntity.ok(new Response(total, "kgCO2e"));
    }
}
