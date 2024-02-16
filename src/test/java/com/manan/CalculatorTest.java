package com.manan;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void positiveSquareRoot(){
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.squareRoot(9));
        assertEquals(4,calculator.squareRoot(16));
    }

}