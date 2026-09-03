# CarbonLedger

A practical carbon accounting API for small organizations that want traceable activity data and repeatable emission estimates.

CarbonLedger stores operational activities, applies versioned emission factors, calculates carbon-dioxide-equivalent totals, and produces transparent summaries that retain the source and factor used for every calculation.

## Core capabilities

- Organizations and reporting periods
- Activity records with source metadata
- Versioned emission factors
- Reproducible CO2e calculations
- Category and period summaries
- Data-quality flags and exports

## Technology

Java 21, Spring Boot, Spring Data JPA, PostgreSQL, JUnit 5, Maven, and GitHub Actions.

## Local setup

1. Install Java 21 and PostgreSQL.
2. Copy `.env.example` to `.env`.
3. Run `mvn spring-boot:run`.
4. Check `http://localhost:8080/actuator/health`.

## Quality commands

```bash
mvn verify
```

## License

MIT
