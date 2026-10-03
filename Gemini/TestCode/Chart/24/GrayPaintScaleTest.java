package org.jfree.chart.renderer;

import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class GrayPaintScaleTest {

    private static final double EPSILON = 1e-9;

    @Test
    public void testDefaultConstructor_validState_initializesBounds() {
        GrayPaintScale scale = new GrayPaintScale();
        Assert.assertEquals(0.0, scale.getLowerBound(), EPSILON);
        Assert.assertEquals(1.0, scale.getUpperBound(), EPSILON);
    }

    @Test
    public void testCustomConstructor_validRange_initializesBounds() {
        GrayPaintScale scale = new GrayPaintScale(-10.0, 20.0);
        Assert.assertEquals(-10.0, scale.getLowerBound(), EPSILON);
        Assert.assertEquals(20.0, scale.getUpperBound(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomConstructor_lowerBoundEqualsUpperBound_throwsException() {
        new GrayPaintScale(5.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCustomConstructor_lowerBoundGreaterThanUpperBound_throwsException() {
        new GrayPaintScale(10.0, 5.0);
    }

    @Test
    public void testGetLowerBound_normalValue_returnsCorrectLowerBound() {
        GrayPaintScale scale = new GrayPaintScale(2.5, 7.5);
        Assert.assertEquals(2.5, scale.getLowerBound(), EPSILON);
    }

    @Test
    public void testGetUpperBound_normalValue_returnsCorrectUpperBound() {
        GrayPaintScale scale = new GrayPaintScale(2.5, 7.5);
        Assert.assertEquals(7.5, scale.getUpperBound(), EPSILON);
    }

    @Test
    public void testGetPaint_lowerBoundValue_returnsBlack() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);
        Color color = (Color) scale.getPaint(0.0);
        Assert.assertEquals(new Color(0, 0, 0), color);
    }

    @Test
    public void testGetPaint_upperBoundValue_returnsWhite() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);
        Color color = (Color) scale.getPaint(100.0);
        Assert.assertEquals(new Color(255, 255, 255), color);
    }

    @Test
    public void testGetPaint_midpointValue_returnsMidGray() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);
        Color color = (Color) scale.getPaint(50.0);
        Assert.assertEquals(new Color(127, 127, 127), color);
    }

    @Test
    public void testGetPaint_negativeRange_returnsCalculatedGray() {
        GrayPaintScale scale = new GrayPaintScale(-100.0, 0.0);
        Color colorLower = (Color) scale.getPaint(-100.0);
        Assert.assertEquals(new Color(0, 0, 0), colorLower);

        Color colorMid = (Color) scale.getPaint(-50.0);
        Assert.assertEquals(new Color(127, 127, 127), colorMid);

        Color colorUpper = (Color) scale.getPaint(0.0);
        Assert.assertEquals(new Color(255, 255, 255), colorUpper);
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Assert.assertTrue(scale.equals(scale));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Assert.assertFalse(scale.equals(null));
    }

    @Test
    public void testEquals_differentClassObject_returnsFalse() {
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);
        Assert.assertFalse(scale.equals("some string"));
    }

    @Test
    public void testEquals_differentLowerBound_returnsFalse() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.1, 1.0);
        Assert.assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEquals_differentUpperBound_returnsFalse() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 2.0);
        Assert.assertFalse(scale1.equals(scale2));
    }

    @Test
    public void testEquals_identicalAttributes_returnsTrue() {
        GrayPaintScale scale1 = new GrayPaintScale(0.0, 1.0);
        GrayPaintScale scale2 = new GrayPaintScale(0.0, 1.0);
        Assert.assertTrue(scale1.equals(scale2));
    }

    @Test
    public void testClone_validInstance_returnsEqualIndependentCopy() throws CloneNotSupportedException {
        GrayPaintScale scale1 = new GrayPaintScale(5.0, 15.0);
        GrayPaintScale scale2 = (GrayPaintScale) scale1.clone();
        
        Assert.assertNotSame(scale1, scale2);
        Assert.assertEquals(scale1.getClass(), scale2.getClass());
        Assert.assertEquals(scale1, scale2);
        Assert.assertEquals(scale1.getLowerBound(), scale2.getLowerBound(), EPSILON);
        Assert.assertEquals(scale1.getUpperBound(), scale2.getUpperBound(), EPSILON);
    }

    @Test
    public void testSerialization_roundTrip_returnsEqualInstance() throws Exception {
        GrayPaintScale scale1 = new GrayPaintScale(-2.0, 8.0);
        
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(scale1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        GrayPaintScale scale2 = (GrayPaintScale) in.readObject();
        in.close();

        Assert.assertNotSame(scale1, scale2);
        Assert.assertEquals(scale1, scale2);
        Assert.assertEquals(scale1.getLowerBound(), scale2.getLowerBound(), EPSILON);
        Assert.assertEquals(scale1.getUpperBound(), scale2.getUpperBound(), EPSILON);
    }
}
