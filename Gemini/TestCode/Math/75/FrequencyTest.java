package org.apache.commons.math.stat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class FrequencyTest {

    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    @Test
    public void testEmptyDistribution() {
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(0));
        assertEquals(0L, f.getCount(0L));
        assertEquals(0L, f.getCount('a'));
        assertEquals(0L, f.getCount(Integer.valueOf(0)));
        assertEquals(0L, f.getCount("test"));
        assertEquals(0L, f.getCount((Object) "test"));

        assertTrue(Double.isNaN(f.getPct(0)));
        assertTrue(Double.isNaN(f.getPct(0L)));
        assertTrue(Double.isNaN(f.getPct('a')));
        assertTrue(Double.isNaN(f.getPct(Integer.valueOf(0))));
        assertTrue(Double.isNaN(f.getPct("test")));
        assertTrue(Double.isNaN(f.getPct((Object) "test")));

        assertEquals(0L, f.getCumFreq(0));
        assertEquals(0L, f.getCumFreq(0L));
        assertEquals(0L, f.getCumFreq('a'));
        assertEquals(0L, f.getCumFreq(Integer.valueOf(0)));
        assertEquals(0L, f.getCumFreq("test"));
        assertEquals(0L, f.getCumFreq((Object) "test"));

        assertTrue(Double.isNaN(f.getCumPct(0)));
        assertTrue(Double.isNaN(f.getCumPct(0L)));
        assertTrue(Double.isNaN(f.getCumPct('a')));
        assertTrue(Double.isNaN(f.getCumPct(Integer.valueOf(0))));
        assertTrue(Double.isNaN(f.getCumPct("test")));
        assertTrue(Double.isNaN(f.getCumPct((Object) "test")));

        assertNotNull(f.valuesIterator());
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testAddValuePrimitivesAndWrappers() {
        f.addValue(1);
        f.addValue(1L);
        f.addValue(Integer.valueOf(1));
        f.addValue(Long.valueOf(1L));
        f.addValue((Object) Long.valueOf(1L));
        f.addValue((Comparable<?>) Long.valueOf(1L));

        assertEquals(6L, f.getSumFreq());
        assertEquals(6L, f.getCount(1));
        assertEquals(6L, f.getCount(1L));
        assertEquals(6L, f.getCount(Integer.valueOf(1)));
        assertEquals(6L, f.getCount(Long.valueOf(1L)));
        assertEquals(1.0, f.getPct(1), 1e-10);
        assertEquals(1.0, f.getCumPct(1), 1e-10);
    }

    @Test
    public void testAddValueChar() {
        f.addValue('a');
        f.addValue('b');
        f.addValue('a');

        assertEquals(3L, f.getSumFreq());
        assertEquals(2L, f.getCount('a'));
        assertEquals(1L, f.getCount('b'));
        assertEquals(0L, f.getCount('c'));

        assertEquals(2.0 / 3.0, f.getPct('a'), 1e-10);
        assertEquals(1.0 / 3.0, f.getPct('b'), 1e-10);

        assertEquals(2L, f.getCumFreq('a'));
        assertEquals(3L, f.getCumFreq('b'));
        assertEquals(0L, f.getCumFreq('0'));
        assertEquals(3L, f.getCumFreq('z'));

        assertEquals(2.0 / 3.0, f.getCumPct('a'), 1e-10);
        assertEquals(1.0, f.getCumPct('b'), 1e-10);
        assertEquals(0.0, f.getCumPct('0'), 1e-10);
        assertEquals(1.0, f.getCumPct('z'), 1e-10);
    }

    @Test
    public void testAddValueStringsAndOrdering() {
        f.addValue("one");
        f.addValue("two");
        f.addValue("two");
        f.addValue("three");

        assertEquals(4L, f.getSumFreq());
        assertEquals(1L, f.getCount("one"));
        assertEquals(2L, f.getCount("two"));
        assertEquals(1L, f.getCount("three"));
        assertEquals(0L, f.getCount("four"));

        assertEquals(0.25, f.getPct("one"), 1e-10);
        assertEquals(0.50, f.getPct("two"), 1e-10);

        // Alphabetical order: "one", "three", "two"
        assertEquals(0L, f.getCumFreq("a"));
        assertEquals(1L, f.getCumFreq("one"));
        assertEquals(2L, f.getCumFreq("three"));
        assertEquals(4L, f.getCumFreq("two"));
        assertEquals(4L, f.getCumFreq("z"));

        assertEquals(0.0, f.getCumPct("a"), 1e-10);
        assertEquals(0.25, f.getCumPct("one"), 1e-10);
        assertEquals(0.50, f.getCumPct("three"), 1e-10);
        assertEquals(1.0, f.getCumPct("two"), 1e-10);
        assertEquals(1.0, f.getCumPct("z"), 1e-10);
    }

    @Test
    public void testCumulativeMiddleValues() {
        // Values: 10, 20, 30
        f.addValue(10);
        f.addValue(20);
        f.addValue(30);

        assertEquals(0L, f.getCumFreq(5));
        assertEquals(1L, f.getCumFreq(10));
        assertEquals(1L, f.getCumFreq(15));
        assertEquals(2L, f.getCumFreq(20));
        assertEquals(2L, f.getCumFreq(25));
        assertEquals(3L, f.getCumFreq(30));
        assertEquals(3L, f.getCumFreq(35));

        assertEquals(0.0, f.getCumPct(5), 1e-10);
        assertEquals(1.0 / 3.0, f.getCumPct(10), 1e-10);
        assertEquals(1.0 / 3.0, f.getCumPct(15), 1e-10);
        assertEquals(2.0 / 3.0, f.getCumPct(20), 1e-10);
        assertEquals(2.0 / 3.0, f.getCumPct(25), 1e-10);
        assertEquals(1.0, f.getCumPct(30), 1e-10);
        assertEquals(1.0, f.getCumPct(35), 1e-10);
    }

    @Test
    public void testCustomComparatorCaseInsensitive() {
        Comparator<String> caseInsensitive = String.CASE_INSENSITIVE_ORDER;
        Frequency freq = new Frequency(caseInsensitive);

        freq.addValue("A");
        freq.addValue("a");
        freq.addValue("b");

        assertEquals(3L, freq.getSumFreq());
        assertEquals(2L, freq.getCount("a"));
        assertEquals(2L, freq.getCount("A"));
        assertEquals(1L, freq.getCount("B"));

        assertEquals(2L, freq.getCumFreq("a"));
        assertEquals(3L, freq.getCumFreq("b"));
    }

    @Test
    public void testClear() {
        f.addValue(1);
        f.addValue(2);
        assertEquals(2L, f.getSumFreq());

        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(1));
        assertFalse(f.valuesIterator().hasNext());
    }

    @Test
    public void testValuesIterator() {
        f.addValue(30);
        f.addValue(10);
        f.addValue(20);

        Iterator<Comparable<?>> it = f.valuesIterator();
        assertTrue(it.hasNext());
        assertEquals(Long.valueOf(10), it.next());
        assertTrue(it.hasNext());
        assertEquals(Long.valueOf(20), it.next());
        assertTrue(it.hasNext());
        assertEquals(Long.valueOf(30), it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testToString() {
        String emptyStr = f.toString();
        assertTrue(emptyStr.startsWith("Value \t Freq. \t Pct. \t Cum Pct. \n"));

        f.addValue(1);
        f.addValue(2);
        String str = f.toString();
        assertTrue(str.contains("1\t1\t"));
        assertTrue(str.contains("2\t1\t"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueNonComparableObjectThrowsException() {
        Object nonComparable = new Object();
        f.addValue(nonComparable);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueIncompatibleTypesThrowsException() {
        f.addValue("string");
        f.addValue(10);
    }

    @Test
    public void testIncompatibleTypeLookupsReturnZero() {
        f.addValue("string");
        assertEquals(0L, f.getCount(10));
        assertEquals(0L, f.getCumFreq(10));
    }

    @Test
    public void testEqualsAndHashCode() {
        Frequency f2 = new Frequency();
        assertEquals(f, f);
        assertFalse(f.equals(null));
        assertFalse(f.equals("other type"));

        assertEquals(f, f2);
        assertEquals(f.hashCode(), f2.hashCode());

        f.addValue(1);
        assertFalse(f.equals(f2));

        f2.addValue(1);
        assertEquals(f, f2);
        assertEquals(f.hashCode(), f2.hashCode());

        f.addValue(2);
        f2.addValue(3);
        assertFalse(f.equals(f2));
    }

    @Test
    public void testSerialization() throws Exception {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(f);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Frequency deserialized = (Frequency) ois.readObject();

        assertEquals(f, deserialized);
        assertEquals(f.getSumFreq(), deserialized.getSumFreq());
        assertEquals(f.getCount(2), deserialized.getCount(2));
    }

    @Test
    public void testNegativeAndZeroValues() {
        f.addValue(-10);
        f.addValue(0);
        f.addValue(10);

        assertEquals(3L, f.getSumFreq());
        assertEquals(1L, f.getCount(-10));
        assertEquals(1L, f.getCount(0));
        assertEquals(1L, f.getCount(10));

        assertEquals(1L, f.getCumFreq(-10));
        assertEquals(2L, f.getCumFreq(0));
        assertEquals(3L, f.getCumFreq(10));
        assertEquals(0L, f.getCumFreq(-20));
        assertEquals(3L, f.getCumFreq(20));
    }
}
