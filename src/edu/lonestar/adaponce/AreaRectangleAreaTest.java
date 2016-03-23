package edu.lonestar.adaponce;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaRectangleAreaTest {

	@Test
	public void testGetArea() {
		Rectangle rec = new Rectangle(5.0, 10.0);
		assertEquals(50.0, rec.getArea(), .000001);
	}

}
