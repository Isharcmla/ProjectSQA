package org.apache.commons.math.stat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Iterator;

public class FrequencyTest {

    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    @Test
    public void testEmptyFrequency_getCountsAndPercentages_returnDefaultOrNaN() {
        Assert.assertEquals(0L, f.getSumFreq());
        Assert.assertEquals(0L, f.getCount(1));
        Assert.assertEquals(0L, f.getCount(1L));
        Assert.assertEquals(0L, f.getCount('a'));
        Assert.assertEquals(0L, f.getCount((Object) "test"));
        Assert.assertEquals(0L, f.getCount(Integer.valueOf(1)));

        Assert.assertTrue(Double.isNaN(f.getPct(1)));
        Assert.assertTrue(Double.isNaN(f.getPct(1L)));
        Assert.assertTrue(Double.isNaN(f.getPct('a')));
        Assert.assertTrue(Double.isNaN(f.getPct((Object) "test")));

        Assert.assertEquals(0L, f.getCumFreq(1));
        Assert.assertEquals(0L, f.getCumFreq(1L));
        Assert.assertEquals(0L, f.getCumFreq('a'));
        Assert.assertEquals(0L, f.getCumFreq((Object) "test"));

        Assert.assertTrue(Double.isNaN(f.getCumPct(1)));
        Assert.assertTrue(Double.isNaN(f.getCumPct(1L)));
        Assert.assertTrue(Double.isNaN(f.getCumPct('a')));
        Assert.assertTrue(Double.isNaN(f.getCumPct((Object) "test")));
    }

    @Test
    public void testAddValue_integralTypes_treatedEquivalently() {
        f.addValue(1);
        f.addValue(Integer.valueOf(1));
        f.addValue(1L);
        f.addValue(Long.valueOf(1L));

        Assert.assertEquals(4L, f.getSumFreq());
        Assert.assertEquals(4L, f.getCount(1));
        Assert.assertEquals(4L, f.getCount(Integer.valueOf(1)));
        Assert.assertEquals(4L, f.getCount(1L));
        Assert.assertEquals(4L, f.getCount(Long.valueOf(1L)));

        Assert.assertEquals(1.0, f.getPct(1), 1e-6);
        Assert.assertEquals(1.0, f.getPct(Integer.valueOf(1)), 1e-6);
        Assert.assertEquals(1.0, f.getPct(1L), 1e-6);
        Assert.assertEquals(1.0, f.getPct(Long.valueOf(1L)), 1e-6);
    }

    @Test
    public void testAddValue_charType_countsCorrectly() {
        f.addValue('a');
        f.addValue('a');
        f.addValue('b');

        Assert.assertEquals(3L, f.getSumFreq());
        Assert.assertEquals(2L, f.getCount('a'));
        Assert.assertEquals(1L, f.getCount('b'));
        Assert.assertEquals(0L, f.getCount('c'));

        Assert.assertEquals(2.0 / 3.0, f.getPct('a'), 1e-6);
        Assert.assertEquals(1.0 / 3.0, f.getPct('b'), 1e-6);
        Assert.assertEquals(0.0, f.getPct('c'), 1e-6);

        Assert.assertEquals(2L, f.getCumFreq('a'));
        Assert.assertEquals(3L, f.getCumFreq('b'));
        Assert.assertEquals(3L, f.getCumFreq('c'));
        Assert.assertEquals(0L, f.getCumFreq('0'));

        Assert.assertEquals(2.0 / 3.0, f.getCumPct('a'), 1e-6);
        Assert.assertEquals(1.0, f.getCumPct('b'), 1e-6);
        Assert.assertEquals(1.0, f.getCumPct('c'), 1e-6);
        Assert.assertEquals(0.0, f.getCumPct('0'), 1e-6);
    }

    @Test
    public void testAddValue_objectsAndStrings_countsCorrectly() {
        f.addValue("apple");
        f.addValue("banana");
        f.addValue("apple");

        Assert.assertEquals(3L, f.getSumFreq());
        Assert.assertEquals(2L, f.getCount("apple"));
        Assert.assertEquals(1L, f.getCount("banana"));
        Assert.assertEquals(0L, f.getCount("orange"));

        Assert.assertEquals(2.0 / 3.0, f.getPct((Object) "apple"), 1e-6);
        Assert.assertEquals(1.0 / 3.0, f.getPct((Object) "banana"), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValue_incompatibleTypes_throwsIllegalArgumentException() {
        f.addValue(10);
        f.addValue("string");
    }

    @Test
    public void testGetCount_withIncompatibleObject_returnsZero() {
        f.addValue(10);
        Assert.assertEquals(0L, f.getCount("incompatibleObject"));
    }

    @Test
    public void testCumFreq_branchesAndBoundaryValues() {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        f.addValue(30);

        Assert.assertEquals(0L, f.getCumFreq(5));
        Assert.assertEquals(1L, f.getCumFreq(10));
        Assert.assertEquals(1L, f.getCumFreq(15));
        Assert.assertEquals(3L, f.getCumFreq(20));
        Assert.assertEquals(3L, f.getCumFreq(25));
        Assert.assertEquals(4L, f.getCumFreq(30));
        Assert.assertEquals(4L, f.getCumFreq(40));

        Assert.assertEquals(0.0, f.getCumPct(5), 1e-6);
        Assert.assertEquals(0.25, f.getCumPct(10), 1e-6);
        Assert.assertEquals(0.25, f.getCumPct(15), 1e-6);
        Assert.assertEquals(0.75, f.getCumPct(20), 1e-6);
        Assert.assertEquals(0.75, f.getCumPct(25), 1e-6);
        Assert.assertEquals(1.0, f.getCumPct(30), 1e-6);
        Assert.assertEquals(1.0, f.getCumPct(40), 1e-6);

        Assert.assertEquals(0.25, f.getCumPct(Integer.valueOf(10)), 1e-6);
        Assert.assertEquals(0.75, f.getCumPct(20L), 1e-6);

        Assert.assertEquals(0L, f.getCumFreq("incompatible"));
    }

    @Test
    public void testCumFreq_intermediateBreakInValuesIterator() {
        f.addValue(10);
        f.addValue(30);
        f.addValue(50);

        Assert.assertEquals(1L, f.getCumFreq(20));
        Assert.assertEquals(2L, f.getCumFreq(40));
    }

    @Test
    public void testCustomComparator_caseInsensitiveOrder() {
        Frequency caseInsensitiveFreq = new Frequency(String.CASE_INSENSITIVE_ORDER);
        caseInsensitiveFreq.addValue("a");
        caseInsensitiveFreq.addValue("A");
        caseInsensitiveFreq.addValue("B");

        Assert.assertEquals(3L, caseInsensitiveFreq.getSumFreq());
        Assert.assertEquals(2L, caseInsensitiveFreq.getCount("a"));
        Assert.assertEquals(2L, caseInsensitiveFreq.getCount("A"));
        Assert.assertEquals(1L, caseInsensitiveFreq.getCount("b"));
        Assert.assertEquals(1L, caseInsensitiveFreq.getCount("B"));

        Assert.assertEquals(2L, caseInsensitiveFreq.getCumFreq("a"));
        Assert.assertEquals(3L, caseInsensitiveFreq.getCumFreq("B"));
        Assert.assertEquals(3L, caseInsensitiveFreq.getCumFreq("c"));
        Assert.assertEquals(0L, caseInsensitiveFreq.getCumFreq("0"));
    }

    @Test
    public void testCustomComparator_reverseOrder() {
        Comparator<Long> reverseOrder = new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        };

        Frequency revFreq = new Frequency(reverseOrder);
        revFreq.addValue(30L);
        revFreq.addValue(20L);
        revFreq.addValue(10L);

        Assert.assertEquals(0L, revFreq.getCumFreq(40L));
        Assert.assertEquals(1L, revFreq.getCumFreq(30L));
        Assert.assertEquals(1L, revFreq.getCumFreq(25L));
        Assert.assertEquals(2L, revFreq.getCumFreq(20L));
        Assert.assertEquals(3L, revFreq.getCumFreq(10L));
        Assert.assertEquals(3L, revFreq.getCumFreq(5L));
    }

    @Test
    public void testClear() {
        f.addValue(1);
        f.addValue(2);
        Assert.assertEquals(2L, f.getSumFreq());

        f.clear();
        Assert.assertEquals(0L, f.getSumFreq());
        Assert.assertEquals(0L, f.getCount(1));
    }

    @Test
    public void testValuesIterator() {
        f.addValue(20);
        f.addValue(10);
        f.addValue(30);

        Iterator it = f.valuesIterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Long.valueOf(10), it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Long.valueOf(20), it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Long.valueOf(30), it.next());
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void testToString_emptyAndPopulated() {
        String emptyStr = f.toString();
        Assert.assertTrue(emptyStr.contains("Value \t Freq. \t Pct. \t Cum Pct."));

        f.addValue(1);
        f.addValue(2);
        f.addValue(2);

        String populatedStr = f.toString();
        Assert.assertTrue(populatedStr.contains("Value \t Freq. \t Pct. \t Cum Pct."));
        Assert.assertTrue(populatedStr.contains("1\t1\t"));
        Assert.assertTrue(populatedStr.contains("2\t2\t"));
    }

    @Test
    public void testSerialization_preservesState() throws Exception {
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(f);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Frequency deserialized = (Frequency) ois.readObject();
        ois.close();

        Assert.assertEquals(3L, deserialized.getSumFreq());
        Assert.assertEquals(1L, deserialized.getCount(10));
        Assert.assertEquals(2L, deserialized.getCount(20));
        Assert.assertEquals(3L, deserialized.getCumFreq(20));
    }
}
