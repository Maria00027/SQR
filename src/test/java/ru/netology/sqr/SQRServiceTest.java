package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    class SQRServiceTest {

        @Test
        void shouldCalculateSqrtBorder() {
            SQRService service = new SQRService();

            int actual = service.calculateSqrtBorder(200, 300);
            int expected = 3;

            assertEquals(actual,expected);
        }


}