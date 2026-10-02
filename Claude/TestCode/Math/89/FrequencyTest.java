import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import org.apache.commons.math.stat.Frequency;

import java.util.Comparator;
import java.util.Iterator;

public class FrequencyTest {

    private Frequency freq;

    @Before
    public void setUp() {
        freq = new Frequency();
    }

    // Helper class that does NOT implement Comparable
    private static class NotComparable {
        // intentionally empty
    }

    // ---------------- Constructor tests ----------------

    @Test
    public void testDefaultConstructor_addValues_countsCorrect() {
        freq.addValue(1);
        freq.addValue(1);
        freq.addValue(2);
        Assert.assertEquals(2L, freq.getCount(1));
        Assert.assertEquals(1L, freq.getCount(2));
    }

    @Test
    public void testComparatorConstructor_addValues_usesComparator() {
        Comparator reverseComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        };
        Frequency cFreq = new Frequency(reverseComparator);
        cFreq.addValue("a");
        cFreq.addValue("b");
        cFreq.addValue("c");

        // "a" is lastKey under reverse comparator, so cumFreq("a") == sumFreq
        Assert.assertEquals(3L, cFreq.getCumFreq("a"));
        // "c" is firstKey under reverse comparator, cumFreq("c") == 1
        Assert.assertEquals(1L, cFreq.getCumFreq("c"));
    }

    // ---------------- toString tests ----------------

    @Test
    public void testToString_withValues_containsHeaderAndValues() {
        freq.addValue(1);
        freq.addValue(2);
        String result = freq.toString();
        Assert.assertTrue(result.contains("Value"));
        Assert.assertTrue(result.contains("Freq."));
        Assert.assertTrue(result.contains("1"));
        Assert.assertTrue(result.contains("2"));
    }

    @Test
    public void testToString_emptyTable_containsOnlyHeader() {
        String result = freq.toString();
        Assert.assertTrue(result.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

    // ---------------- addValue(Object) deprecated tests ----------------

    @Test
    public void testAddValueObject_deprecated_addsIntegerAsLong() {
        freq.addValue((Object) Integer.valueOf(5));
        Assert.assertEquals(1L, freq.getCount(5));
        Iterator it = freq.valuesIterator();
        Assert.assertTrue(it.hasNext());
        Object val = it.next();
        Assert.assertTrue(val instanceof Long);
    }

    @Test(expected = ClassCastException.class)
    public void testAddValueObject_nonComparable_throwsClassCastException() {
        freq.addValue((Object) new NotComparable());
    }

    // ---------------- addValue(Comparable) tests ----------------

    @Test
    public void testAddValueComparable_normal_addsValue() {
        freq.addValue((Comparable) Integer.valueOf(10));
        Assert.assertEquals(1L, freq.getCount(10));
    }

    @Test(expected = NullPointerException.class)
    public void testAddValueComparable_null_throwsNullPointerException() {
        freq.addValue((Comparable) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueComparable_incompatibleTypes_throwsIllegalArgumentException() {
        freq.addValue(Integer.valueOf(1));
        freq.addValue("incompatible");
    }

    // ---------------- addValue(int/Integer/long/char) tests ----------------

    @Test
    public void testAddValueInt_addsValue() {
        freq.addValue(7);
        Assert.assertEquals(1L, freq.getCount(7));
    }

    @Test
    public void testAddValueInteger_addsValue() {
        freq.addValue(Integer.valueOf(8));
        Assert.assertEquals(1L, freq.getCount(8));
    }

    @Test
    public void testAddValueLong_addsValue() {
        freq.addValue(9L);
        Assert.assertEquals(1L, freq.getCount(9L));
    }

    @Test
    public void testAddValueChar_addsValue() {
        freq.addValue('x');
        Assert.assertEquals(1L, freq.getCount('x'));
    }

    // ---------------- clear tests ----------------

    @Test
    public void testClear_removesAllValues() {
        freq.addValue(1);
        freq.addValue(2);
        freq.clear();
        Assert.assertEquals(0L, freq.getSumFreq());
        Assert.assertFalse(freq.valuesIterator().hasNext());
    }

    // ---------------- valuesIterator tests ----------------

    @Test
    public void testValuesIterator_returnsAllValues() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        Iterator it = freq.valuesIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(3, count);
    }

    @Test
    public void testValuesIterator_emptyTable_hasNoNext() {
        Iterator it = freq.valuesIterator();
        Assert.assertFalse(it.hasNext());
    }

    // ---------------- getSumFreq tests ----------------

    @Test
    public void testGetSumFreq_noValues_returnsZero() {
        Assert.assertEquals(0L, freq.getSumFreq());
    }

    @Test
    public void testGetSumFreq_withValues_returnsSum() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(3);
        freq.addValue(3);
        Assert.assertEquals(6L, freq.getSumFreq());
    }

    // ---------------- getCount tests ----------------

    @Test
    public void testGetCount_withInteger_returnsCorrectCount() {
        freq.addValue(5);
        Assert.assertEquals(1L, freq.getCount((Object) Integer.valueOf(5)));
    }

    @Test
    public void testGetCount_withObjectNotComparable_returnsZero() {
        freq.addValue(1);
        Assert.assertEquals(0L, freq.getCount((Object) "incomparable"));
    }

    @Test
    public void testGetCount_int_returnsCount() {
        freq.addValue(4);
        Assert.assertEquals(1L, freq.getCount(4));
    }

    @Test
    public void testGetCount_long_returnsCount() {
        freq.addValue(4L);
        Assert.assertEquals(1L, freq.getCount(4L));
    }

    @Test
    public void testGetCount_char_returnsCount() {
        freq.addValue('a');
        Assert.assertEquals(1L, freq.getCount('a'));
    }

    @Test
    public void testGetCount_valueNotAdded_returnsZero() {
        freq.addValue(1);
        Assert.assertEquals(0L, freq.getCount(99));
    }

    // ---------------- getPct tests ----------------

    @Test
    public void testGetPct_emptyTable_returnsNaN() {
        double pct = freq.getPct((Object) Long.valueOf(1));
        Assert.assertTrue(Double.isNaN(pct));
    }

    @Test
    public void testGetPct_withValue_returnsCorrectPct() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(3);
        freq.addValue(3);
        double pct = freq.getPct((Object) Long.valueOf(2));
        Assert.assertEquals(2.0 / 6.0, pct, 1e-9);
    }

    @Test
    public void testGetPct_int_returnsCorrectPct() {
        freq.addValue(1);
        freq.addValue(1);
        double pct = freq.getPct(1);
        Assert.assertEquals(1.0, pct, 1e-9);
    }

    @Test
    public void testGetPct_long_returnsCorrectPct() {
        freq.addValue(1L);
        double pct = freq.getPct(1L);
        Assert.assertEquals(1.0, pct, 1e-9);
    }

    @Test
    public void testGetPct_char_returnsCorrectPct() {
        freq.addValue('a');
        double pct = freq.getPct('a');
        Assert.assertEquals(1.0, pct, 1e-9);
    }

    // ---------------- getCumFreq tests ----------------

    @Test
    public void testGetCumFreq_emptyTable_returnsZero() {
        Assert.assertEquals(0L, freq.getCumFreq((Object) Long.valueOf(1)));
    }

    @Test
    public void testGetCumFreq_valueLessThanFirst_returnsZero() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        Assert.assertEquals(0L, freq.getCumFreq(0));
    }

    @Test
    public void testGetCumFreq_valueGreaterThanLast_returnsSumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        Assert.assertEquals(freq.getSumFreq(), freq.getCumFreq(4));
    }

    @Test
    public void testGetCumFreq_valueInMiddle_returnsCorrectCumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(3);
        freq.addValue(3);
        Assert.assertEquals(3L, freq.getCumFreq(2));
    }

    @Test
    public void testGetCumFreq_firstValue_returnsItsOwnCount() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        Assert.assertEquals(1L, freq.getCumFreq(1));
    }

    @Test
    public void testGetCumFreq_lastValue_returnsSumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        Assert.assertEquals(3L, freq.getCumFreq(3));
    }

    @Test
    public void testGetCumFreq_nonComparableValue_returnsZero() {
        freq.addValue(1);
        freq.addValue(2);
        Assert.assertEquals(0L, freq.getCumFreq((Object) "incomparable"));
    }

    @Test
    public void testGetCumFreq_withIntegerObject_usesLongConversion() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(3);
        freq.addValue(3);
        long result = freq.getCumFreq((Object) Integer.valueOf(2));
        Assert.assertEquals(freq.getCumFreq(2L), result);
    }

    @Test
    public void testGetCumFreq_int_returnsCorrectValue() {
        freq.addValue(1);
        freq.addValue(2);
        Assert.assertEquals(2L, freq.getCumFreq(2));
    }

    @Test
    public void testGetCumFreq_long_returnsCorrectValue() {
        freq.addValue(1L);
        freq.addValue(2L);
        Assert.assertEquals(2L, freq.getCumFreq(2L));
    }

    @Test
    public void testGetCumFreq_char_returnsCorrectValue() {
        freq.addValue('a');
        freq.addValue('b');
        Assert.assertEquals(2L, freq.getCumFreq('b'));
    }

    // ---------------- getCumPct tests ----------------

    @Test
    public void testGetCumPct_emptyTable_returnsNaN() {
        double pct = freq.getCumPct((Object) Long.valueOf(1));
        Assert.assertTrue(Double.isNaN(pct));
    }

    @Test
    public void testGetCumPct_withValue_returnsCorrectPct() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(3);
        freq.addValue(3);
        double pct = freq.getCumPct((Object) Long.valueOf(2));
        Assert.assertEquals(3.0 / 6.0, pct, 1e-9);
    }

    @Test
    public void testGetCumPct_int_returnsCorrectPct() {
        freq.addValue(1);
        freq.addValue(2);
        double pct = freq.getCumPct(2);
        Assert.assertEquals(1.0, pct, 1e-9);
    }

    @Test
    public void testGetCumPct_long_returnsCorrectPct() {
        freq.addValue(1L);
        freq.addValue(2L);
        double pct = freq.getCumPct(2L);
        Assert.assertEquals(1.0, pct, 1e-9);
    }

    @Test
    public void testGetCumPct_char_returnsCorrectPct() {
        freq.addValue('a');
        freq.addValue('b');
        double pct = freq.getCumPct('b');
        Assert.assertEquals(1.0, pct, 1e-9);
    }

    @Test
    public void testGetCumPct_nonComparableValue_returnsZero() {
        freq.addValue(1);
        freq.addValue(2);
        double pct = freq.getCumPct((Object) "incomparable");
        Assert.assertEquals(0.0, pct, 1e-9);
    }
}
