package JUnitBabu;

import org.junit.Before;
import org.junit.Test;

public class JunitClass<Calculator> {
private Calculator objCalcUnderTest; 

	@Before
	public void setUp() {
		objCalcUnderTest = new Calculator();
	}
	
	@Test
		public void myunittest()
	{
	System.out.println("Welcome to my first Testing");
}
}