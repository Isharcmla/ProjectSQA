package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.junit.Assert;
import org.junit.Test;

public class ValueMarkerTest {

    @Test
    public void testConstructor_singleValue_shouldSetDefaultValues() {
        ValueMarker marker = new ValueMarker(42.5);
        Assert.assertEquals(42.5, marker.getValue(), 0.000001);
    }

    @Test
    public void testConstructor_threeArgs_shouldSetValuesCorrectly() {
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(1.5f);
        ValueMarker marker = new ValueMarker(10.0, paint, stroke);

        Assert.assertEquals(10.0, marker.getValue(), 0.000001);
        Assert.assertEquals(paint, marker.getPaint());
        Assert.assertEquals(stroke, marker.getStroke());
        Assert.assertEquals(paint, marker.getOutlinePaint());
        Assert.assertEquals(stroke, marker.getOutlineStroke());
        Assert.assertEquals(1.0f, marker.getAlpha(), 0.000001f);
    }

    @Test
    public void testConstructor_sixArgs_shouldSetAllAttributes() {
        Paint paint = Color.BLUE;
        Stroke stroke = new BasicStroke(2.0f);
        Paint outlinePaint = Color.GREEN;
        Stroke outlineStroke = new BasicStroke(0.5f);
        float alpha = 0.75f;

        ValueMarker marker = new ValueMarker(99.9, paint, stroke, outlinePaint, outlineStroke, alpha);

        Assert.assertEquals(99.9, marker.getValue(), 0.000001);
        Assert.assertEquals(paint, marker.getPaint());
        Assert.assertEquals(stroke, marker.getStroke());
        Assert.assertEquals(outlinePaint, marker.getOutlinePaint());
        Assert.assertEquals(outlineStroke, marker.getOutlineStroke());
        Assert.assertEquals(alpha, marker.getAlpha(), 0.000001f);
    }

    @Test
    public void testGetValue_variousDoubleValues_shouldReturnAccurateValues() {
        ValueMarker zeroMarker = new ValueMarker(0.0);
        Assert.assertEquals(0.0, zeroMarker.getValue(), 0.0);

        ValueMarker negativeMarker = new ValueMarker(-123.456);
        Assert.assertEquals(-123.456, negativeMarker.getValue(), 0.000001);

        ValueMarker maxMarker = new ValueMarker(Double.MAX_VALUE);
        Assert.assertEquals(Double.MAX_VALUE, maxMarker.getValue(), 0.0);

        ValueMarker minMarker = new ValueMarker(Double.MIN_VALUE);
        Assert.assertEquals(Double.MIN_VALUE, minMarker.getValue(), 0.0);

        ValueMarker nanMarker = new ValueMarker(Double.NaN);
        Assert.assertTrue(Double.isNaN(nanMarker.getValue()));

        ValueMarker posInfMarker = new ValueMarker(Double.POSITIVE_INFINITY);
        Assert.assertEquals(Double.POSITIVE_INFINITY, posInfMarker.getValue(), 0.0);

        ValueMarker negInfMarker = new ValueMarker(Double.NEGATIVE_INFINITY);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, negInfMarker.getValue(), 0.0);
    }

    @Test
    public void testSetValue_standardValue_shouldUpdateValue() {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(5.5);
        Assert.assertEquals(5.5, marker.getValue(), 0.000001);
    }

    @Test
    public void testSetValue_shouldNotifyRegisteredListeners() {
        ValueMarker marker = new ValueMarker(100.0);
        final boolean[] notified = new boolean[] { false };
        final MarkerChangeEvent[] receivedEvent = new MarkerChangeEvent[1];

        MarkerChangeListener listener = new MarkerChangeListener() {
            @Override
            public void markerChanged(MarkerChangeEvent event) {
                notified[0] = true;
                receivedEvent[0] = event;
            }
        };

        marker.addChangeListener(listener);
        marker.setValue(200.0);

        Assert.assertTrue(notified[0]);
        Assert.assertNotNull(receivedEvent[0]);
        Assert.assertEquals(marker, receivedEvent[0].getMarker());

        // Remove listener and verify notification stops
        notified[0] = false;
        marker.removeChangeListener(listener);
        marker.setValue(300.0);
        Assert.assertFalse(notified[0]);
    }

    @Test
    public void testEquals_sameInstance_shouldReturnTrue() {
        ValueMarker marker = new ValueMarker(10.0);
        Assert.assertTrue(marker.equals(marker));
    }

    @Test
    public void testEquals_nullObject_shouldReturnFalse() {
        ValueMarker marker = new ValueMarker(10.0);
        Assert.assertFalse(marker.equals(null));
    }

    @Test
    public void testEquals_differentClass_shouldReturnFalse() {
        ValueMarker marker = new ValueMarker(10.0);
        Assert.assertFalse(marker.equals("not a ValueMarker"));
        Assert.assertFalse(marker.equals(new Object()));
    }

    @Test
    public void testEquals_identicalObjects_shouldReturnTrue() {
        ValueMarker m1 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(1.0f));
        ValueMarker m2 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(1.0f));
        Assert.assertTrue(m1.equals(m2));
        Assert.assertTrue(m2.equals(m1));
        Assert.assertEquals(m1.hashCode(), m2.hashCode());
    }

    @Test
    public void testEquals_differentValue_shouldReturnFalse() {
        ValueMarker m1 = new ValueMarker(25.0);
        ValueMarker m2 = new ValueMarker(26.0);
        Assert.assertFalse(m1.equals(m2));
        Assert.assertFalse(m2.equals(m1));
    }

    @Test
    public void testEquals_differentPaint_shouldReturnFalse() {
        ValueMarker m1 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(1.0f));
        ValueMarker m2 = new ValueMarker(25.0, Color.RED, new BasicStroke(1.0f));
        Assert.assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_differentStroke_shouldReturnFalse() {
        ValueMarker m1 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(1.0f));
        ValueMarker m2 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(2.0f));
        Assert.assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_differentAlpha_shouldReturnFalse() {
        ValueMarker m1 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(1.0f), Color.BLACK, new BasicStroke(1.0f), 0.5f);
        ValueMarker m2 = new ValueMarker(25.0, Color.BLACK, new BasicStroke(1.0f), Color.BLACK, new BasicStroke(1.0f), 0.8f);
        Assert.assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_differentSuperClassMarker_shouldReturnFalse() {
        ValueMarker m1 = new ValueMarker(25.0);
        CategoryMarker m2 = new CategoryMarker("CategoryA");
        Assert.assertFalse(m1.equals(m2));
    }

    @Test
    public void testCloning_shouldCreateEqualDistinctCopy() throws CloneNotSupportedException {
        ValueMarker m1 = new ValueMarker(50.0, Color.BLUE, new BasicStroke(2.0f));
        ValueMarker m2 = (ValueMarker) m1.clone();

        Assert.assertNotSame(m1, m2);
        Assert.assertEquals(m1.getClass(), m2.getClass());
        Assert.assertTrue(m1.equals(m2));
        Assert.assertEquals(m1.getValue(), m2.getValue(), 0.0);
    }

    @Test
    public void testSerialization_shouldPreserveState() throws Exception {
        ValueMarker m1 = new ValueMarker(77.7, Color.MAGENTA, new BasicStroke(1.2f));
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(m1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        ValueMarker m2 = (ValueMarker) in.readObject();
        in.close();

        Assert.assertEquals(m1, m2);
        Assert.assertEquals(m1.getValue(), m2.getValue(), 0.000001);
    }
}
