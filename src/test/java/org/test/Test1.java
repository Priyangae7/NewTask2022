package org.test;

import org.testng.annotations.Test;

public class Test1 {
	@Test (priority=3)
	private void a1() {
		
	}
	@Test(priority=-2)
	private void b1() {
		
	}
@Test
private void c1() {
	
}

}
