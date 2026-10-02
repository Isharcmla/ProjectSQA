import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.Stroke;

import org.jfree.chart.plot.ValueMarker;

public class ValueMarkerTest {

    private Paint paint1;
    private Stroke stroke1;
    private Paint paint2;
    private Stroke stroke2;

    @Before
    public void setUp() {
        paint1 = Color.RED;
        stroke1 = new BasicStroke(1.0f);
        paint2 = Color.BLUE;
        stroke2 = new BasicStroke(2.0f);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_singleValue_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(5.0);
        assertEquals(5.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testConstructor_singleValue_negativeValue_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(-10.5);
        assertEquals(-10.5, marker.getValue(), 0.0000001);
    }

    @Test
    public void testConstructor_singleValue_zeroValue_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(0.0);
        assertEquals(0.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testConstructor_valuePaintStroke_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(3.5, paint1, stroke1);
        assertEquals(3.5, marker.getValue(), 0.0000001);
    }

    @Test
    public void testConstructor_valuePaintStrokeOutlinePaintOutlineStrokeAlpha_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(7.2, paint1, stroke1, paint2, stroke2, 0.5f);
        assertEquals(7.2, marker.getValue(), 0.0000001);
    }

    @Test
    public void testConstructor_fullArgs_boundaryAlphaZero_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(1.0, paint1, stroke1, paint2, stroke2, 0.0f);
        assertEquals(1.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testConstructor_fullArgs_boundaryAlphaOne_setsValueCorrectly() {
        ValueMarker marker = new ValueMarker(1.0, paint1, stroke1, paint2, stroke2, 1.0f);
        assertEquals(1.0, marker.getValue(), 0.0000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullPaint_throwsIllegalArgumentException() {
        // Marker's javadoc states paint is "null not permitted".
        // Based on standard JFreeChart Marker implementation, this should
        // throw IllegalArgumentException when a null Paint is supplied.
        new ValueMarker(1.0, null, stroke1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullStroke_throwsIllegalArgumentException() {
        // Similarly, stroke is "null not permitted" per javadoc.
        new ValueMarker(1.0, paint1, null);
    }

    // ---------- getValue tests ----------

    @Test
    public void testGetValue_returnsCorrectValue() {
        ValueMarker marker = new ValueMarker(42.0);
        assertEquals(42.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testGetValue_afterSetValue_returnsUpdatedValue() {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(99.9);
        assertEquals(99.9, marker.getValue(), 0.0000001);
    }

    // ---------- setValue tests ----------

    @Test
    public void testSetValue_updatesValue() {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(2.0);
        assertEquals(2.0, marker.getValue(), 0.0000001);
    }

    @Test
    public void testSetValue_negativeValue_updatesValue() {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(-5.5);
        assertEquals(-5.5, marker.getValue(), 0.0000001);
    }

    @Test
    public void testSetValue_zeroValue_updatesValue() {
        ValueMarker marker = new ValueMarker(1.0);
        marker.setValue(0.0);
        assertEquals(0.0, marker.getValue(), 0.0000001);
    }

    // ---------- equals tests ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        ValueMarker marker = new ValueMarker(5.0);
        assertTrue(marker.equals(marker));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        ValueMarker marker = new ValueMarker(5.0);
        assertFalse(marker.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        ValueMarker marker = new ValueMarker(5.0);
        assertFalse(marker.equals("not a ValueMarker"));
    }

    @Test
    public void testEquals_sameValues_returnsTrue() {
        ValueMarker marker1 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.5f);
        ValueMarker marker2 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.5f);
        assertTrue(marker1.equals(marker2));
    }

    @Test
    public void testEquals_differentValue_returnsFalse() {
        ValueMarker marker1 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.5f);
        ValueMarker marker2 = new ValueMarker(6.0, paint1, stroke1, paint2, stroke2, 0.5f);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    public void testEquals_differentPaint_returnsFalseViaSuperEquals() {
        ValueMarker marker1 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.5f);
        ValueMarker marker2 = new ValueMarker(5.0, paint2, stroke1, paint2, stroke2, 0.5f);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    public void testEquals_differentStroke_returnsFalseViaSuperEquals() {
        ValueMarker marker1 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.5f);
        ValueMarker marker2 = new ValueMarker(5.0, paint1, stroke2, paint2, stroke2, 0.5f);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    public void testEquals_differentAlpha_returnsFalseViaSuperEquals() {
        ValueMarker marker1 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.5f);
        ValueMarker marker2 = new ValueMarker(5.0, paint1, stroke1, paint2, stroke2, 0.9f);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    public void testEquals_boundaryValueNegative_returnsTrueForSameNegativeValue() {
        ValueMarker marker1 = new ValueMarker(-100.0);
        ValueMarker marker2 = new ValueMarker(-100.0);
        assertTrue(marker1.equals(marker2));
    }

    @Test
    public void testEquals_boundaryValueMax_returnsTrueForSameMaxValue() {
        ValueMarker marker1 = new ValueMarker(Double.MAX_VALUE);
        ValueMarker marker2 = new ValueMarker(Double.MAX_VALUE);
        assertTrue(marker1.equals(marker2));
    }
}
