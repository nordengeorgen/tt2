package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void twoplustwo(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));

    }
    @Test
    void threeplusseven() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3, 7));
    }

}