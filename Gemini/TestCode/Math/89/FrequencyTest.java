package org.apache.commons.math.stat;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FrequencyTest {

    private static final double TOLERANCE = 10E-15;
    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    @Test
    public void testDefaultConstructor_emptyState() {
        assertEquals(0, f.getSumFreq());
        assertEquals(0, f.getCount(0));
        assertTrue(Double.isNaN(f.getPct(0)));
        assertEquals(0, f.getCumFreq(0));
        assertTrue(Double.isNaN(f.getCumPct(0)));
        assertNotNull(f.valuesIterator());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testCustomComparatorConstructor() {
        Frequency customFreq = new Frequency(Collections.reverseOrder());
        customFreq.addValue(1);
        customFreq.addValue(3);
        customFreq.addValue(2);

        Iterator<?> it = customFreq.valuesIterator();
        assertTrue(it.hasNext());
        assertEquals(Long.valueOf(3), it.next());
        assertEquals(Long.valueOf(2), it.next());
        assertEquals(Long.valueOf(1), it.next());

        assertEquals(1, customFreq.getCumFreq(3));
        assertEquals(2, customFreq.getCumFreq(2));
        assertEquals(3, customFreq.getCumFreq(1));
    }

    @Test
    public void testAddValue_integralEquivalence() {
        f.addValue(1);
        f.addValue(1L);
        f.addValue(Integer.valueOf(1));
        f.addValue(Long.valueOf(1L));

        assertEquals(4, f.getSumFreq());
        assertEquals(4, f.getCount(1));
        assertEquals(4, f.getCount(1L));
        assertEquals(4, f.getCount(Integer.valueOf(1)));
        assertEquals(4, f.getCount(Long.valueOf(1L)));
        assertEquals(1.0, f.getPct(1), TOLERANCE);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testAddValue_objectDeprecated() {
        f.addValue((Object) "test");
        f.addValue((Object) "test");
        assertEquals(2, f.getCount("test"));
        assertEquals(2, f.getSumFreq());
    }

    @Test
    public void testAddValue_char() {
        f.addValue('a');
        f.addValue('b');
        f.addValue('a');

        assertEquals(3, f.getSumFreq());
        assertEquals(2, f.getCount('a'));
        assertEquals(1, f.getCount('b'));
        assertEquals(0, f.getCount('c'));

        assertEquals(2.0 / 3.0, f.getPct('a'), TOLERANCE);
        assertEquals(1.0 / 3.0, f.getPct('b'), TOLERANCE);
        assertEquals(0.0, f.getPct('c'), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_incompatibleTypes_throwsIllegalArgumentException() {
        f.addValue("StringValue");
        f.addValue(1); // Long is not comparable to String in natural order
    }

    @Test
    public void testClear() {
        f.addValue(10);
        f.addValue(20);
        assertEquals(2, f.getSumFreq());

        f.clear();

        assertEquals(0, f.getSumFreq());
        assertEquals(0, f.getCount(10));
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testValuesIterator() {
        f.addValue(30);
        f.addValue(10);
        f.addValue(20);

        Iterator<?> it = f.valuesIterator();
        assertTrue(it.hasNext());
        assertEquals(Long.valueOf(10), it.next());
        assertEquals(Long.valueOf(20), it.next());
        assertEquals(Long.valueOf(30), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetCount_variousTypes() {
        f.addValue('x');
        f.addValue('x');
        f.addValue('y');

        assertEquals(2, f.getCount('x'));
        assertEquals(1, f.getCount('y'));
        assertEquals(0, f.getCount('z'));
        assertEquals(0, f.getCount(100)); // ClassCastException internally handled -> returns 0
        assertEquals(0, f.getCount("nonComparable"));
    }

    @Test
    public void testGetCount_withIntegerObject() {
        f.addValue(5);
        assertEquals(1, f.getCount(Integer.valueOf(5)));
        assertEquals(0, f.getCount(Integer.valueOf(6)));
    }

    @Test
    public void testGetPct_empty() {
        assertTrue(Double.isNaN(f.getPct(1)));
        assertTrue(Double.isNaN(f.getPct(1L)));
        assertTrue(Double.isNaN(f.getPct('a')));
        assertTrue(Double.isNaN(f.getPct((Object) "a")));
        assertTrue(Double.isNaN(f.getPct(Integer.valueOf(1))));
    }

    @Test
    public void testGetPct_populated() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        f.addValue(30);

        assertEquals(0.25, f.getPct(10), TOLERANCE);
        assertEquals(0.25, f.getPct(10L), TOLERANCE);
        assertEquals(0.25, f.getPct(Integer.valueOf(10)), TOLERANCE);
        assertEquals(0.50, f.getPct(20), TOLERANCE);
        assertEquals(0.00, f.getPct(40), TOLERANCE);
    }

    @Test
    public void testGetCumFreq_empty() {
        assertEquals(0, f.getCumFreq(1));
        assertEquals(0, f.getCumFreq(1L));
        assertEquals(0, f.getCumFreq('a'));
        assertEquals(0, f.getCumFreq((Object) "a"));
        assertEquals(0, f.getCumFreq(Integer.valueOf(1)));
    }

    @Test
    public void testGetCumFreq_boundariesAndIntermediate() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        f.addValue(30);

        // Before first key
        assertEquals(0, f.getCumFreq(5));
        assertEquals(0, f.getCumFreq(5L));
        assertEquals(0, f.getCumFreq(Integer.valueOf(5)));

        // Exact first key
        assertEquals(1, f.getCumFreq(10));

        // Intermediate value not in table
        assertEquals(1, f.getCumFreq(15));
        assertEquals(1, f.getCumFreq(15L));

        // Intermediate value in table
        assertEquals(3, f.getCumFreq(20));

        // Intermediate value between 20 and 30
        assertEquals(3, f.getCumFreq(25));

        // Exact last key
        assertEquals(4, f.getCumFreq(30));

        // Beyond last key
        assertEquals(4, f.getCumFreq(35));
        assertEquals(4, f.getCumFreq(100L));
    }

    @Test
    public void testGetCumFreq_char() {
        f.addValue('b');
        f.addValue('d');

        assertEquals(0, f.getCumFreq('a'));
        assertEquals(1, f.getCumFreq('b'));
        assertEquals(1, f.getCumFreq('c'));
        assertEquals(2, f.getCumFreq('d'));
        assertEquals(2, f.getCumFreq('e'));
    }

    @Test
    public void testGetCumFreq_incompatibleObject_returnsZero() {
        f.addValue("b");
        f.addValue("d");

        // Passing an object that causes ClassCastException inside freqTable.get(v)
        assertEquals(0, f.getCumFreq(123));
    }

    @Test
    public void testGetCumPct_empty() {
        assertTrue(Double.isNaN(f.getCumPct(1)));
        assertTrue(Double.isNaN(f.getCumPct(1L)));
        assertTrue(Double.isNaN(f.getCumPct('a')));
        assertTrue(Double.isNaN(f.getCumPct((Object) "a")));
        assertTrue(Double.isNaN(f.getCumPct(Integer.valueOf(1))));
    }

    @Test
    public void testGetCumPct_populated() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        f.addValue(30);

        assertEquals(0.00, f.getCumPct(5), TOLERANCE);
        assertEquals(0.25, f.getCumPct(10), TOLERANCE);
        assertEquals(0.25, f.getCumPct(10L), TOLERANCE);
        assertEquals(0.25, f.getCumPct(Integer.valueOf(10)), TOLERANCE);
        assertEquals(0.25, f.getCumPct(15), TOLERANCE);
        assertEquals(0.75, f.getCumPct(20), TOLERANCE);
        assertEquals(0.75, f.getCumPct(25), TOLERANCE);
        assertEquals(1.00, f.getCumPct(30), TOLERANCE);
        assertEquals(1.00, f.getCumPct(35), TOLERANCE);
    }

    @Test
    public void testGetCumPct_char() {
        f.addValue('b');
        f.addValue('d');

        assertEquals(0.0, f.getCumPct('a'), TOLERANCE);
        assertEquals(0.5, f.getCumPct('b'), TOLERANCE);
        assertEquals(0.5, f.getCumPct('c'), TOLERANCE);
        assertEquals(1.0, f.getCumPct('d'), TOLERANCE);
        assertEquals(1.0, f.getCumPct('e'), TOLERANCE);
    }

    @Test
    public void testToString_empty() {
        String str = f.toString();
        assertNotNull(str);
        assertTrue(str.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

    @Test
    public void testToString_populated() {
        f.addValue("one");
        f.addValue("two");
        f.addValue("two");

        String str = f.toString();
        assertNotNull(str);
        assertTrue(str.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
        assertTrue(str.contains("one\t1\t"));
        assertTrue(str.contains("two\t2\t"));
    }

    @Test
    public void testSerialization_naturalOrder() throws Exception {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(f);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Frequency deserialized = (Frequency) ois.readObject();
        ois.close();

        assertEquals(f.getSumFreq(), deserialized.getSumFreq());
        assertEquals(f.getCount(1), deserialized.getCount(1));
        assertEquals(f.getCount(2), deserialized.getCount(2));
        assertEquals(f.getCumFreq(1), deserialized.getCumFreq(1));
        assertEquals(f.getCumPct(2), deserialized.getCumPct(2), TOLERANCE);
    }

    @Test
    public void testSerialization_customComparator() throws Exception {
        Frequency customFreq = new Frequency(String.CASE_INSENSITIVE_ORDER);
        customFreq.addValue("A");
        customFreq.addValue("a");
        customFreq.addValue("b");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(customFreq);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Frequency deserialized = (Frequency) ois.readObject();
        ois.close();

        assertEquals(2, deserialized.getCount("a"));
        assertEquals(2, deserialized.getCount("A"));
        assertEquals(1, deserialized.getCount("b"));
    }

    @Test
    public void testNegativeAndZeroValues() {
        f.addValue(-10);
        f.addValue(0);
        f.addValue(10);

        assertEquals(3, f.getSumFreq());
        assertEquals(1, f.getCount(-10));
        assertEquals(1, f.getCount(0));
        assertEquals(1, f.getCount(10));

        assertEquals(1, f.getCumFreq(-10));
        assertEquals(2, f.getCumFreq(0));
        assertEquals(3, f.getCumFreq(10));
        assertEquals(0, f.getCumFreq(-20));
        assertEquals(3, f.getCumFreq(20));
    }
}
