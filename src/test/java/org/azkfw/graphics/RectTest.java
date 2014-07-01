package org.azkfw.graphics;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * このクラスは、{@link Rect}クラスのユニットテストを行うクラスです。
 * 
 * @since 1.2.0
 * @version 1.2.0 2014/07/01
 * @author Kawakicchi
 */
public class RectTest extends TestCase {

	@Test
	public void test() {
		Rect rect1 = new Rect();
		assertEquals("X", 0.f, rect1.getX());
		assertEquals("Y", 0.f, rect1.getY());
		assertEquals("Width", 0.f, rect1.getWidth());
		assertEquals("Height", 0.f, rect1.getHeight());

		Rect rect2 = new Rect(10.f, 20.f, 30.f, 40.f);
		assertEquals("X", 10.f, rect2.getX());
		assertEquals("Y", 20.f, rect2.getY());
		assertEquals("Width", 30.f, rect2.getWidth());
		assertEquals("Height", 40.f, rect2.getHeight());

		Rect rect3 = new Rect(rect2);
		assertEquals("X", 10.f, rect3.getX());
		assertEquals("Y", 20.f, rect3.getY());
		assertEquals("Width", 30.f, rect3.getWidth());
		assertEquals("Height", 40.f, rect3.getHeight());
	}

	@Test
	public void testAdd() {
		Rect rect = new Rect();

		rect.addX(10.f);
		rect.addY(20.f);
		rect.addWidth(30.f);
		rect.addHeight(40.f);

		assertEquals("X", 10.f, rect.getX());
		assertEquals("Y", 20.f, rect.getY());
		assertEquals("Width", 30.f, rect.getWidth());
		assertEquals("Height", 40.f, rect.getHeight());

		rect.addSize(100.f, 200.f);

		assertEquals("X", 10.f, rect.getX());
		assertEquals("Y", 20.f, rect.getY());
		assertEquals("Width", 130.f, rect.getWidth());
		assertEquals("Height", 240.f, rect.getHeight());
	}

	@Test
	public void testSubtract() {
		Rect rect = new Rect(100.f, 100.f, 100.f, 100.f);

		rect.subtractX(10.f);
		rect.subtractY(20.f);
		rect.subtractWidth(30.f);
		rect.subtractHeight(40.f);

		assertEquals("X", 90.f, rect.getX());
		assertEquals("Y", 80.f, rect.getY());
		assertEquals("Width", 70.f, rect.getWidth());
		assertEquals("Height", 60.f, rect.getHeight());

		rect.subtractSize(100.f, 200.f);

		assertEquals("X", 90.f, rect.getX());
		assertEquals("Y", 80.f, rect.getY());
		assertEquals("Width", -30.f, rect.getWidth());
		assertEquals("Height", -140.f, rect.getHeight());
	}
}
