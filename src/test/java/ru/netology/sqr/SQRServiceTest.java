package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "100,9801,90",
            "99,9800,89",
            "101,9802,89",
            "50,99,0",
            "9802,200000,0"
    })
    public void shouldCalcSquareNumberInRange(int lowerBound, int upperBound, int expected) {

        SQRService service = new SQRService();
        int actual = service.squareNumberInRange(lowerBound, upperBound);
        Assertions.assertEquals(actual, expected);
    }
}
