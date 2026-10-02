import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import java.util.Comparator;
import java.util.Iterator;

public class FrequencyTest {

    private Frequency freq;

    @Before
    public void setUp() {
        freq = new Frequency();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_createsEmptyFrequency() {
        Frequency f = new Frequency();
        Assert.assertEquals(0, f.getSumFreq());
    }

    @Test
    public void testComparatorConstructor_usesGivenComparator() {
        Comparator<Long> reverseComparator = new Comparator<Long>() {
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        };
        Frequency f = new Frequency(reverseComparator);
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        // with reverse comparator, cumFreq of 3 should be 1 (since 3 is "first" in order)
        Assert.assertEquals(1, f.getCumFreq(3));
        Assert.assertEquals(3, f.getCumFreq(1));
    }

    // ---------- addValue(Object) deprecated ----------

    @Test
    public void testAddValueObject_comparableValue_addsSuccessfully() {
        freq.addValue((Object) Long.valueOf(5));
        Assert.assertEquals(1, freq.getCount(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueObject_nonComparableValue_throwsException() {
        Object nonComparable = new Object();
        freq.addValue(nonComparable);
    }

    // ---------- addValue(Comparable) ----------

    @Test
    public void testAddValueComparable_integerValue_storedAsLong() {
        freq.addValue(Integer.valueOf(10));
        Assert.assertEquals(1, freq.getCount(10L));
    }

    @Test
    public void testAddValueComparable_multipleAddsSameValue_incrementsCount() {
        freq.addValue(Long.valueOf(7));
        freq.addValue(Long.valueOf(7));
        freq.addValue(Long.valueOf(7));
        Assert.assertEquals(3, freq.getCount(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueComparable_incompatibleType_throwsException() {
        freq.addValue("stringValue");
        freq.addValue(Long.valueOf(5)); // incomparable to String -> ClassCastException wrapped
    }

    // ---------- addValue(int) ----------

    @Test
    public void testAddValueInt_typicalValue_addsSuccessfully() {
        freq.addValue(5);
        Assert.assertEquals(1, freq.getCount(5));
    }

    @Test
    public void testAddValueInt_negativeValue_addsSuccessfully() {
        freq.addValue(-3);
        Assert.assertEquals(1, freq.getCount(-3));
    }

    // ---------- addValue(Integer) deprecated ----------

    @Test
    public void testAddValueIntegerObject_typicalValue_addsSuccessfully() {
        freq.addValue(Integer.valueOf(8));
        Assert.assertEquals(1, freq.getCount(8));
    }

    // ---------- addValue(long) ----------

    @Test
    public void testAddValueLong_typicalValue_addsSuccessfully() {
        freq.addValue(100L);
        Assert.assertEquals(1, freq.getCount(100L));
    }

    // ---------- addValue(char) ----------

    @Test
    public void testAddValueChar_typicalValue_addsSuccessfully() {
        freq.addValue('a');
        Assert.assertEquals(1, freq.getCount('a'));
    }

    // ---------- clear() ----------

    @Test
    public void testClear_afterAddingValues_resetsFrequencyTable() {
        freq.addValue(1);
        freq.addValue(2);
        freq.clear();
        Assert.assertEquals(0, freq.getSumFreq());
    }

    // ---------- valuesIterator() ----------

    @Test
    public void testValuesIterator_returnsAllAddedValues() {
        freq.addValue(1);
        freq.addValue(2);
        Iterator<Comparable<?>> it = freq.valuesIterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(2, count);
    }

    @Test
    public void testValuesIterator_emptyFrequency_returnsEmptyIterator() {
        Iterator<Comparable<?>> it = freq.valuesIterator();
        Assert.assertFalse(it.hasNext());
    }

    // ---------- getSumFreq() ----------

    @Test
    public void testGetSumFreq_multipleValuesAdded_returnsTotalCount() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        Assert.assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testGetSumFreq_emptyFrequency_returnsZero() {
        Assert.assertEquals(0, freq.getSumFreq());
    }

    // ---------- getCount(Object) deprecated ----------

    @Test
    public void testGetCountObject_existingValue_returnsCorrectCount() {
        freq.addValue(5);
        Assert.assertEquals(1, freq.getCount((Object) Long.valueOf(5)));
    }

    // ---------- getCount(Comparable) ----------

    @Test
    public void testGetCountComparable_integerType_returnsCorrectCount() {
        freq.addValue(5);
        Assert.assertEquals(1, freq.getCount((Comparable<?>) Integer.valueOf(5)));
    }

    @Test
    public void testGetCountComparable_nonExistingValue_returnsZero() {
        freq.addValue(5);
        Assert.assertEquals(0, freq.getCount(Long.valueOf(99)));
    }

    @Test
    public void testGetCountComparable_incomparableType_returnsZero() {
        freq.addValue("abc");
        Assert.assertEquals(0, freq.getCount(Long.valueOf(5)));
    }

    // ---------- getCount(int) ----------

    @Test
    public void testGetCountInt_existingValue_returnsCorrectCount() {
        freq.addValue(5);
        freq.addValue(5);
        Assert.assertEquals(2, freq.getCount(5));
    }

    // ---------- getCount(long) ----------

    @Test
    public void testGetCountLong_existingValue_returnsCorrectCount() {
        freq.addValue(50L);
        Assert.assertEquals(1, freq.getCount(50L));
    }

    // ---------- getCount(char) ----------

    @Test
    public void testGetCountChar_existingValue_returnsCorrectCount() {
        freq.addValue('x');
        Assert.assertEquals(1, freq.getCount('x'));
    }

    @Test
    public void testGetCountChar_nonExistingValue_returnsZero() {
        freq.addValue('x');
        Assert.assertEquals(0, freq.getCount('y'));
    }

    // ---------- getPct(Object) deprecated ----------

    @Test
    public void testGetPctObject_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1);
        freq.addValue(1);
        freq.addValue(2);
        double pct = freq.getPct((Object) Long.valueOf(1));
        Assert.assertEquals(1.0, pct, 0.0001);
    }

    // ---------- getPct(Comparable) ----------

    @Test
    public void testGetPctComparable_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1);
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        double pct = freq.getPct(Long.valueOf(1));
        Assert.assertEquals(0.5, pct, 0.0001);
    }

    @Test
    public void testGetPctComparable_emptyFrequency_returnsNaN() {
        double pct = freq.getPct(Long.valueOf(1));
        Assert.assertTrue(Double.isNaN(pct));
    }

    // ---------- getPct(int) ----------

    @Test
    public void testGetPctInt_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1);
        freq.addValue(2);
        double pct = freq.getPct(1);
        Assert.assertEquals(0.5, pct, 0.0001);
    }

    // ---------- getPct(long) ----------

    @Test
    public void testGetPctLong_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1L);
        freq.addValue(2L);
        double pct = freq.getPct(1L);
        Assert.assertEquals(0.5, pct, 0.0001);
    }

    // ---------- getPct(char) ----------

    @Test
    public void testGetPctChar_typicalValue_returnsCorrectPercentage() {
        freq.addValue('a');
        freq.addValue('b');
        double pct = freq.getPct('a');
        Assert.assertEquals(0.5, pct, 0.0001);
    }

    // ---------- getCumFreq(Object) deprecated ----------

    @Test
    public void testGetCumFreqObject_typicalValue_returnsCorrectCumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        long cum = freq.getCumFreq((Object) Long.valueOf(2));
        Assert.assertEquals(2, cum);
    }

    // ---------- getCumFreq(Comparable) ----------

    @Test
    public void testGetCumFreqComparable_emptyFrequency_returnsZero() {
        Assert.assertEquals(0, freq.getCumFreq(Long.valueOf(1)));
    }

    @Test
    public void testGetCumFreqComparable_integerType_returnsCorrectCumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        long cum = freq.getCumFreq(Integer.valueOf(2));
        Assert.assertEquals(2, cum);
    }

    @Test
    public void testGetCumFreqComparable_valueLessThanFirst_returnsZero() {
        freq.addValue(5);
        freq.addValue(10);
        long cum = freq.getCumFreq(Long.valueOf(1));
        Assert.assertEquals(0, cum);
    }

    @Test
    public void testGetCumFreqComparable_valueGreaterThanLast_returnsSumFreq() {
        freq.addValue(5);
        freq.addValue(10);
        long cum = freq.getCumFreq(Long.valueOf(20));
        Assert.assertEquals(freq.getSumFreq(), cum);
    }

    @Test
    public void testGetCumFreqComparable_valueEqualsLast_returnsSumFreq() {
        freq.addValue(5);
        freq.addValue(10);
        long cum = freq.getCumFreq(Long.valueOf(10));
        Assert.assertEquals(freq.getSumFreq(), cum);
    }

    @Test
    public void testGetCumFreqComparable_valueInMiddle_returnsCorrectCumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        freq.addValue(3);
        long cum = freq.getCumFreq(Long.valueOf(2));
        Assert.assertEquals(3, cum);
    }

    @Test
    public void testGetCumFreqComparable_incomparableValue_returnsZero() {
        freq.addValue("abc");
        freq.addValue("def");
        long cum = freq.getCumFreq(Long.valueOf(1));
        Assert.assertEquals(0, cum);
    }

    @Test
    public void testGetCumFreqComparable_withCustomComparator_returnsCorrectCumFreq() {
        Comparator<Long> reverseComparator = new Comparator<Long>() {
            public int compare(Long o1, Long o2) {
                return o2.compareTo(o1);
            }
        };
        Frequency f = new Frequency(reverseComparator);
        f.addValue(1);
        f.addValue(2);
        f.addValue(3);
        long cum = f.getCumFreq(2L);
        Assert.assertEquals(2, cum);
    }

    // ---------- getCumFreq(int) ----------

    @Test
    public void testGetCumFreqInt_typicalValue_returnsCorrectCumFreq() {
        freq.addValue(1);
        freq.addValue(2);
        long cum = freq.getCumFreq(2);
        Assert.assertEquals(2, cum);
    }

    // ---------- getCumFreq(long) ----------

    @Test
    public void testGetCumFreqLong_typicalValue_returnsCorrectCumFreq() {
        freq.addValue(1L);
        freq.addValue(2L);
        long cum = freq.getCumFreq(2L);
        Assert.assertEquals(2, cum);
    }

    // ---------- getCumFreq(char) ----------

    @Test
    public void testGetCumFreqChar_typicalValue_returnsCorrectCumFreq() {
        freq.addValue('a');
        freq.addValue('b');
        long cum = freq.getCumFreq('b');
        Assert.assertEquals(2, cum);
    }

    // ---------- getCumPct(Object) deprecated ----------

    @Test
    public void testGetCumPctObject_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1);
        freq.addValue(2);
        double pct = freq.getCumPct((Object) Long.valueOf(2));
        Assert.assertEquals(1.0, pct, 0.0001);
    }

    // ---------- getCumPct(Comparable) ----------

    @Test
    public void testGetCumPctComparable_emptyFrequency_returnsNaN() {
        double pct = freq.getCumPct(Long.valueOf(1));
        Assert.assertTrue(Double.isNaN(pct));
    }

    @Test
    public void testGetCumPctComparable_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(3);
        freq.addValue(4);
        double pct = freq.getCumPct(Long.valueOf(2));
        Assert.assertEquals(0.5, pct, 0.0001);
    }

    @Test
    public void testGetCumPctComparable_incomparableValue_returnsZero() {
        freq.addValue("abc");
        double pct = freq.getCumPct(Long.valueOf(1));
        Assert.assertEquals(0.0, pct, 0.0001);
    }

    // ---------- getCumPct(int) ----------

    @Test
    public void testGetCumPctInt_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1);
        freq.addValue(2);
        double pct = freq.getCumPct(2);
        Assert.assertEquals(1.0, pct, 0.0001);
    }

    // ---------- getCumPct(long) ----------

    @Test
    public void testGetCumPctLong_typicalValue_returnsCorrectPercentage() {
        freq.addValue(1L);
        freq.addValue(2L);
        double pct = freq.getCumPct(1L);
        Assert.assertEquals(0.5, pct, 0.0001);
    }

    // ---------- getCumPct(char) ----------

    @Test
    public void testGetCumPctChar_typicalValue_returnsCorrectPercentage() {
        freq.addValue('a');
        freq.addValue('b');
        double pct = freq.getCumPct('b');
        Assert.assertEquals(1.0, pct, 0.0001);
    }

    // ---------- toString() ----------

    @Test
    public void testToString_withValues_returnsNonEmptyString() {
        freq.addValue(1);
        freq.addValue(2);
        String result = freq.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("Value"));
        Assert.assertTrue(result.contains("Freq"));
    }

    @Test
    public void testToString_emptyFrequency_returnsHeaderOnly() {
        String result = freq.toString();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("Value \t Freq. \t Pct. \t Cum Pct. \n"));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_sameContent_returnsSameHashCode() {
        Frequency f1 = new Frequency();
        Frequency f2 = new Frequency();
        f1.addValue(1);
        f2.addValue(1);
        Assert.assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testHashCode_emptyFrequency_returnsConsistentValue() {
        int hash1 = freq.hashCode();
        int hash2 = freq.hashCode();
        Assert.assertEquals(hash1, hash2);
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        Assert.assertTrue(freq.equals(freq));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        Assert.assertFalse(freq.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        Assert.assertFalse(freq.equals("someString"));
    }

    @Test
    public void testEquals_sameContent_returnsTrue() {
        Frequency f1 = new Frequency();
        Frequency f2 = new Frequency();
        f1.addValue(1);
        f2.addValue(1);
        Assert.assertTrue(f1.equals(f2));
    }

    @Test
    public void testEquals_differentContent_returnsFalse() {
        Frequency f1 = new Frequency();
        Frequency f2 = new Frequency();
        f1.addValue(1);
        f2.addValue(2);
        Assert.assertFalse(f1.equals(f2));
    }
}
