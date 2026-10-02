package org.jfree.chart.renderer;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Paint;

public class GrayPaintScaleTest {

    private GrayPaintScale defaultScale;

    @Before
    public void setUp() {
        defaultScale = new GrayPaintScale();
    }

    // --- Constructor tests ---

    @Test
    public void testDefaultConstructor_normal_boundsAreZeroAndOne() {
        assertEquals(0.0, defaultScale.getLowerBound(), 0.0000001);
        assertEquals(1.0, defaultScale.getUpperBound(), 0.0000001);
    }

    @Test
    public void testConstructor_normal_boundsSetCorrectly() {
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);
        assertEquals(10.0, scale.getLowerBound(), 0.0000001);
        assertEquals(20.0, scale.getUpperBound(), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lowerBoundEqualsUpperBound_throwsException() {
        new GrayPaintScale(5.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_lowerBoundGreaterThanUpperBound_throwsException() {
        new GrayPaintScale(10.0, 5.0);
    }

    @Test
    public void testConstructor_negativeBounds_boundsSetCorrectly() {
        GrayPaintScale scale = new GrayPaintScale(-10.0, -5.0);
        assertEquals(-10.0, scale.getLowerBound(), 0.0000001);
        assertEquals(-5.0, scale.getUpperBound(), 0.0000001);
    }

    // --- getLowerBound / getUpperBound tests ---

    @Test
    public void testGetLowerBound_normal_returnsCorrectValue() {
        GrayPaintScale scale = new GrayPaintScale(2.0, 8.0);
        assertEquals(2.0, scale.getLowerBound(), 0.0000001);
    }

    @Test
    public void testGetUpperBound_normal_returnsCorrectValue() {
        GrayPaintScale scale = new GrayPaintScale(2.0, 8.0);
        assertEquals(8.0, scale.getUpperBound(), 0.0000001);
    }

    // --- getPaint tests ---

    @Test
    public void testGetPaint_midValue_returnsGrayPaint() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 10.0);
        Paint paint = scale.getPaint(5.0);
        assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        int expectedGray = (int) ((5.0 - 0.0) / (10.0 - 0.0) * 255.0);
        assertEquals(expectedGray, color.getRed());
        assertEquals(expectedGray, color.getGreen());
        assertEquals(expectedGray, color.getBlue());
    }

    @Test
    public void testGetPaint_lowerBoundValue_returnsBlack() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 10.0);
        Paint paint = scale.getPaint(0.0);
        Color color = (Color) paint;
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @Test
    public void testGetPaint_upperBoundValue_returnsWhite() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 10.0);
        Paint paint = scale.getPaint(10.0);
        Color color = (Color) paint;
        assertEquals(255, color.getRed());
        assertEquals(255, color.getGreen());
        assertEquals(255, color.getBlue());
    }

    @Test
    public void testGetPaint_defaultScale_returnsExpectedGray() {
        Paint paint = defaultScale.getPaint(0.5);
        Color color = (Color) paint;
        int expectedGray = (int) ((0.5 - 0.0) / (1.0 - 0.0) * 255.0);
        assertEquals(expectedGray, color.getRed());
    }

    @Test
    public void testGetPaint_negativeBounds_returnsExpectedGray() {
        GrayPaintScale scale = new GrayPaintScale(-10.0, 10.0);
        Paint paint = scale.getPaint(0.0);
        Color color = (Color) paint;
        int expectedGray = (int) ((0.0 - (-10.0)) / (10.0 - (-10.0)) * 255.0);
        assertEquals(expectedGray, color.getRed());
    }

    // --- equals tests ---

    @Test
    public void testEquals_sameObject_returnsTrue() {
        assertTrue(defaultScale.equals(defaultScale));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(defaultScale.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(defaultScale.equals("not a GrayPaintScale"));
    }

    @Test
    public void testEquals_equalBounds_returnsTrue() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        assertTrue(scale1.equals(scale2));
    }

    @Test
    public void testEquals_differentLowerBound_returnsFalse() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.5, 1.0);
        assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEquals_differentUpperBound_returnsFalse() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 2.0);
        assertFalse(scale1.equals(scale2));
    }

    // --- clone tests ---

    @Test
    public void testClone_normal_returnsEqualButDifferentInstance() throws CloneNotSupportedException {
        GrayPaintScale scale = new GrayPaintScale(1.0, 5.0);
        GrayPaintScale clone = (GrayPaintScale) scale.clone();
        assertNotSame(scale, clone);
        assertTrue(scale.equals(clone));
        assertEquals(scale.getLowerBound(), clone.getLowerBound(), 0.0000001);
        assertEquals(scale.getUpperBound(), clone.getUpperBound(), 0.0000001);
    }

    @Test
    public void testClone_isInstanceOfPublicCloneable() throws CloneNotSupportedException {
        GrayPaintScale scale = new GrayPaintScale();
        Object clone = scale.clone();
        assertTrue(clone instanceof org.jfree.chart.util.PublicCloneable);
    }
}
