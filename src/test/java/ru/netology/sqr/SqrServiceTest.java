package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrServiceTest {

    @Test
    void shouldCalculateSqrtBorder() {
        SqrService service = new SqrService();

        int actual = service.calculateSqrtBorder(200, 500);
        int expected = 8;

        assertEquals(actual, expected);
    }


}