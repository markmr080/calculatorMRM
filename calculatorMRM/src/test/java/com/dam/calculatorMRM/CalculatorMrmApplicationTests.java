package com.dam.calculatorMRM;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorMrmApplicationTests {
	private Calculator calculator = new Calculator();

	@Test
	void contextLoads() {
	}
	
	@Test
    public void testSum(){
        assertEquals(5, calculator.sum(3,2));
    }

}
