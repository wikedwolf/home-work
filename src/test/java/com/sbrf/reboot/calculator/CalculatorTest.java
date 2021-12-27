package com.sbrf.reboot.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void getAddition() {
        assertEquals(9, new Calculator().getAddition(4, 5));
    }

    @Test
    void getSubtraction() {
        assertEquals(-1, new Calculator().getSubtraction(4, 5));
    }

    @Test
    void getMultiplication() {
        assertEquals(20, new Calculator().getMultiplication(4, 5));
    }

    @Test
    void getDivision() {
        assertEquals(3, new Calculator().getDivision(9, 3));
    }

    @Test
    void getPower() {
        assertEquals(9, new Calculator().getPower(3));
    }

    @Test
    void getArraySumm() {
        int[] inp = {1, 2, 3};
        assertEquals(6, new Calculator().getArraySumm(inp));
    }

    @Test
    void getFactorial() {
        assertEquals(120, new Calculator().getFactorial(5));
    }

    @Test
    void classHasSevenMethods() {
        assertEquals(7, Calculator.class.getMethods().length - Object.class.getMethods().length);
    }
}