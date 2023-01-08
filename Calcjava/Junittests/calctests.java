import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Calcpackage.calcclass;

class calctests {

	@Test
	public void caltestadd() {
	assertEquals(30,calcclass.add(10, 20));
	}
	@Test
	public void caltestsub() {
	assertEquals(30,calcclass.sub(50, 20));
	}
	@Test
	public void caltestmul() {
	assertEquals(30,calcclass.mul(6, 5));
	}
	@Test
	public void caltestdiv() {
	assertEquals(6,calcclass.divReal(30, 5));
	}
}
