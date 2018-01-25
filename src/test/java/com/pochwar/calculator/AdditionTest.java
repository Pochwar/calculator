package com.pochwar.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	
	private Addition add;

	@Before
	public void setUp() throws Exception {
		this.add = new Addition(1);
	}


	@Test
	public void testMake() {
		this.add.make(2);
		
		Assert.assertNotNull(this.add);
		Assert.assertEquals(3, this.add.value);
	}

	@Test
	public void testGetValue() {
		Assert.assertNotNull(this.add);
		Assert.assertEquals(1, this.add.getValue());
	}

}
