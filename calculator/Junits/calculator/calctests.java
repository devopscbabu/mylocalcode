package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculatorpackage.calculatorclass;

public class calctests {

		@Test
		public void caladdtest() {
		assertEquals(30,calculatorclass.add(10, 20));
		}
		@Test
		public void caltestsub() {
		assertEquals(30,calculatorclass.sub(50, 20));
		}
		@Test
		public void caltestmul() {
		assertEquals(30,calculatorclass.mul(6, 5));
		}
		@Test
		public void caltestdiv() {
		assertEquals(6,calculatorclass.div(30, 5));	
	}

}
