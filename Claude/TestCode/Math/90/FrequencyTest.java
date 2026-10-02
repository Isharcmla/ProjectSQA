import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import java.util.Comparator;
import java.util.Iterator;

public class FrequencyTest {

    private Frequency f;

    @Before
    public void setUp() {
        f = new Frequency();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsEmptyFrequency() {
        Frequency freq = new Frequency();
        Assert.assertEquals(0, freq.getSumFreq());
    }

    @Test
    public void testComparatorConstructor_createsEmptyFrequency() {
        Comparator reverseComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) o2).compareTo(o1);
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        // With reverse comparator, iteration order should be descending
        Iterator it = freq.valuesIterator();
        Object first = it.next();
        Assert.assertEquals(Long.valueOf(3), first);
    }

    // ---------- addValue(Object) deprecated method ----------

    @Test
    public void testAddValueObject_integerValue_incrementsCount() {
        f.addValue(Integer.valueOf(5));
        Assert.assertEquals(1, f.getCount(5));
    }

    @Test
    public void testAddValueObject_sameValueTwice_countIncreases() {
        f.addValue(Integer.valueOf(5));
        f.addValue(Integer.valueOf(5));
        Assert.assertEquals(2, f.getCount(5));
    }

    @Test
    public void testAddValueObject_stringValue_addsSuccessfully() {
        f.addValue("apple");
        f.addValue("apple");
        f.addValue("banana");
        Assert.assertEquals(2, f.getCount("apple"));
        Assert.assertEquals(1, f.getCount("banana"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueObject_incomparableTypes_throwsIllegalArgumentException() {
        f.addValue("apple");
        f.addValue(Integer.valueOf(5));
    }

    @Test(expected = ClassCastException.class)
    public void testAddValueObject_nonComparableObject_throwsClassCastException() {
        f.addValue(new Object());
    }

    // ---------- addValue(int) ----------

    @Test
    public void testAddValueInt_normalValue_incrementsCount() {
        f.addValue(10);
        Assert.assertEquals(1, f.getCount(10));
    }

    @Test
    public void testAddValueInt_negativeValue_incrementsCount() {
        f.addValue(-5);
        Assert.assertEquals(1, f.getCount(-5));
    }

    // ---------- addValue(Integer) ----------

    @Test
    public void testAddValueIntegerObject_normalValue_incrementsCount() {
        f.addValue(Integer.valueOf(7));
        Assert.assertEquals(1, f.getCount(7));
    }

    // ---------- addValue(long) ----------

    @Test
    public void testAddValueLong_normalValue_incrementsCount() {
        f.addValue(100L);
        Assert.assertEquals(1, f.getCount(100L));
    }

    // ---------- addValue(char) ----------

    @Test
    public void testAddValueChar_normalValue_incrementsCount() {
        f.addValue('a');
        Assert.assertEquals(1, f.getCount('a'));
    }

    @Test
    public void testAddValueChar_sameCharTwice_countIncreases() {
        f.addValue('x');
        f.addValue('x');
        Assert.assertEquals(2, f.getCount('x'));
    }

    // Mixing int and long should be treated the same
    @Test
    public void testAddValue_intAndLongSameValue_treatedEqually() {
        f.addValue(5);
        f.addValue(5L);
        f.addValue(Integer.valueOf(5));
        Assert.assertEquals(3, f.getCount(5));
        Assert.assertEquals(3, f.getCount(5L));
    }

    // ---------- clear() ----------

    @Test
    public void testClear_afterAddingValues_resetsFrequency() {
        f.addValue(1);
        f.addValue(2);
        f.clear();
        Assert.assertEquals(0, f.getSumFreq());
        Assert.assertEquals(0, f.getCount(1));
    }

    // ---------- valuesIterator() ----------

    @Test
    public void testValuesIterator_withValues_returnsAllDistinctValues() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(1);
        Iterator it = f.valuesIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(2, count);
    }

    @Test
    public void testValuesIterator_emptyFrequency_noElements() {
        Iterator it = f.valuesIterator();
        Assert.assertFalse(it.hasNext());
    }

    // ---------- getSumFreq() ----------

    @Test
    public void testGetSumFreq_emptyFrequency_returnsZero() {
        Assert.assertEquals(0, f.getSumFreq());
    }

    @Test
    public void testGetSumFreq_withMultipleValues_returnsCorrectSum() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        f.addValue(3);
        Assert.assertEquals(4, f.getSumFreq());
    }

    // ---------- getCount(Object) ----------

    @Test
    public void testGetCountObject_integerValue_returnsCorrectCount() {
        f.addValue(5);
        Assert.assertEquals(1, f.getCount(Integer.valueOf(5)));
    }

    @Test
    public void testGetCountObject_valueNotPresent_returnsZero() {
        f.addValue(5);
        Assert.assertEquals(0, f.getCount(Integer.valueOf(10)));
    }

    @Test
    public void testGetCountObject_incomparableValue_returnsZero() {
        f.addValue("apple");
        Assert.assertEquals(0, f.getCount(Integer.valueOf(5)));
    }

    @Test
    public void testGetCountObject_emptyFrequency_returnsZero() {
        Assert.assertEquals(0, f.getCount("anything"));
    }

    // ---------- getCount(int) ----------

    @Test
    public void testGetCountInt_normalValue_returnsCorrectCount() {
        f.addValue(3);
        f.addValue(3);
        Assert.assertEquals(2, f.getCount(3));
    }

    // ---------- getCount(long) ----------

    @Test
    public void testGetCountLong_normalValue_returnsCorrectCount() {
        f.addValue(3L);
        Assert.assertEquals(1, f.getCount(3L));
    }

    // ---------- getCount(char) ----------

    @Test
    public void testGetCountChar_normalValue_returnsCorrectCount() {
        f.addValue('z');
        Assert.assertEquals(1, f.getCount('z'));
    }

    @Test
    public void testGetCountChar_valueNotPresent_returnsZero() {
        Assert.assertEquals(0, f.getCount('z'));
    }

    // ---------- getPct(Object) ----------

    @Test
    public void testGetPctObject_emptyFrequency_returnsNaN() {
        Assert.assertTrue(Double.isNaN(f.getPct("anything")));
    }

    @Test
    public void testGetPctObject_normalValue_returnsCorrectPercentage() {
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        Assert.assertEquals(2.0 / 3.0, f.getPct(Integer.valueOf(1)), 0.0001);
    }

    // ---------- getPct(int) ----------

    @Test
    public void testGetPctInt_normalValue_returnsCorrectPercentage() {
        f.addValue(1);
        f.addValue(2);
        Assert.assertEquals(0.5, f.getPct(1), 0.0001);
    }

    // ---------- getPct(long) ----------

    @Test
    public void testGetPctLong_normalValue_returnsCorrectPercentage() {
        f.addValue(1L);
        f.addValue(2L);
        Assert.assertEquals(0.5, f.getPct(1L), 0.0001);
    }

    // ---------- getPct(char) ----------

    @Test
    public void testGetPctChar_normalValue_returnsCorrectPercentage() {
        f.addValue('a');
        f.addValue('b');
        Assert.assertEquals(0.5, f.getPct('a'), 0.0001);
    }

    // ---------- getCumFreq(Object) ----------

    @Test
    public void testGetCumFreqObject_emptyFrequency_returnsZero() {
        Assert.assertEquals(0, f.getCumFreq("anything"));
    }

    @Test
    public void testGetCumFreqObject_integerValue_returnsCorrectCumulativeFreq() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        Assert.assertEquals(2, f.getCumFreq(Integer.valueOf(2)));
    }

    @Test
    public void testGetCumFreqObject_valueLessThanFirst_returnsZero() {
        f.addValue(5);
        f.addValue(10);
        Assert.assertEquals(0, f.getCumFreq(1));
    }

    @Test
    public void testGetCumFreqObject_valueGreaterThanLast_returnsSumFreq() {
        f.addValue(5);
        f.addValue(10);
        Assert.assertEquals(2, f.getCumFreq(100));
    }

    @Test
    public void testGetCumFreqObject_valueInMiddle_returnsCorrectCumulativeCount() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        f.addValue(3);
        f.addValue(4);
        Assert.assertEquals(3, f.getCumFreq(2));
    }

    @Test
    public void testGetCumFreqObject_incomparableValue_returnsZero() {
        f.addValue("apple");
        f.addValue("banana");
        Assert.assertEquals(0, f.getCumFreq(Integer.valueOf(5)));
    }

    @Test
    public void testGetCumFreqObject_stringValues_usesNaturalComparator() {
        f.addValue("apple");
        f.addValue("banana");
        f.addValue("cherry");
        Assert.assertEquals(2, f.getCumFreq("banana"));
    }

    @Test
    public void testGetCumFreqObject_withComparator_usesSuppliedComparator() {
        Comparator reverseComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) o2).compareTo(o1);
            }
        };
        Frequency freq = new Frequency(reverseComparator);
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        // with reverse order: 3,2,1 -- cumFreq(2) should include 3 and 2
        Assert.assertEquals(2, freq.getCumFreq(Long.valueOf(2)));
    }

    @Test
    public void testGetCumFreqObject_valueNotAddedButComparable_returnsCorrectCumFreq() {
        f.addValue(1);
        f.addValue(3);
        f.addValue(5);
        // value 2 is not in table but is comparable (between 1 and 3)
        Assert.assertEquals(1, f.getCumFreq(2));
    }

    // ---------- getCumFreq(int) ----------

    @Test
    public void testGetCumFreqInt_normalValue_returnsCorrectCumulativeFreq() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        Assert.assertEquals(2, f.getCumFreq(2));
    }

    // ---------- getCumFreq(long) ----------

    @Test
    public void testGetCumFreqLong_normalValue_returnsCorrectCumulativeFreq() {
        f.addValue(1L);
        f.addValue(2L);
        f.addValue(3L);
        Assert.assertEquals(2, f.getCumFreq(2L));
    }

    // ---------- getCumFreq(char) ----------

    @Test
    public void testGetCumFreqChar_normalValue_returnsCorrectCumulativeFreq() {
        f.addValue('a');
        f.addValue('b');
        f.addValue('c');
        Assert.assertEquals(2, f.getCumFreq('b'));
    }

    @Test
    public void testGetCumFreqChar_emptyFrequency_returnsZero() {
        Assert.assertEquals(0, f.getCumFreq('a'));
    }

    // ---------- getCumPct(Object) ----------

    @Test
    public void testGetCumPctObject_emptyFrequency_returnsNaN() {
        Assert.assertTrue(Double.isNaN(f.getCumPct("anything")));
    }

    @Test
    public void testGetCumPctObject_normalValue_returnsCorrectCumulativePercentage() {
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        f.addValue(4);
        Assert.assertEquals(0.5, f.getCumPct(Integer.valueOf(2)), 0.0001);
    }

    @Test
    public void testGetCumPctObject_incomparableValue_returnsZero() {
        f.addValue("apple");
        Assert.assertEquals(0.0, f.getCumPct(Integer.valueOf(5)), 0.0001);
    }

    // ---------- getCumPct(int) ----------

    @Test
    public void testGetCumPctInt_normalValue_returnsCorrectCumulativePercentage() {
        f.addValue(1);
        f.addValue(2);
        Assert.assertEquals(0.5, f.getCumPct(1), 0.0001);
    }

    // ---------- getCumPct(long) ----------

    @Test
    public void testGetCumPctLong_normalValue_returnsCorrectCumulativePercentage() {
        f.addValue(1L);
        f.addValue(2L);
        Assert.assertEquals(0.5, f.getCumPct(1L), 0.0001);
    }

    // ---------- getCumPct(char) ----------

    @Test
    public void testGetCumPctChar_normalValue_returnsCorrectCumulativePercentage() {
        f.addValue('a');
        f.addValue('b');
        Assert.assertEquals(0.5, f.getCumPct('a'), 0.0001);
    }

    // ---------- toString() ----------

    @Test
    public void testToString_emptyFrequency_returnsHeaderOnly() {
        String result = f.toString();
        Assert.assertTrue(result.contains("Value"));
        Assert.assertTrue(result.contains("Freq."));
    }

    @Test
    public void testToString_withValues_containsValueAndCounts() {
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        String result = f.toString();
        Assert.assertTrue(result.contains("1"));
        Assert.assertTrue(result.contains("2"));
    }
}
