import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import project1package.project1class;

class testcases {

		@Test
		public void caltestadd() {
		assertEquals(30,project1class.add(10, 20));
		}
		@Test
		public void caltestsub() {
		assertEquals(30,project1class.sub(50, 20));
		}
		@Test
		public void caltestmul() {
		assertEquals(30,project1class.mul(6, 5));
		}
		@Test
		public void caltestdiv() {
		assertEquals(6,project1class.divReal(30, 5));
		}
	}
