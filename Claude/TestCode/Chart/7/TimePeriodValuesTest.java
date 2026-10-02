import org.jfree.data.general.Series;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Year;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimePeriodValuesTest {

    private TimePeriodValues series;

    @Before
    public void setUp() {
        series = new TimePeriodValues("Test Series");
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_nameOnly_defaultDescriptionsSet() {
        TimePeriodValues s = new TimePeriodValues("MySeries");
        Assert.assertEquals("Time", s.getDomainDescription());
        Assert.assertEquals("Value", s.getRangeDescription());
        Assert.assertEquals(0, s.getItemCount());
    }

    @Test
    public void testConstructor_nameDomainRange_valuesSetCorrectly() {
        TimePeriodValues s = new TimePeriodValues("MySeries", "MyDomain", "MyRange");
        Assert.assertEquals("MyDomain", s.getDomainDescription());
        Assert.assertEquals("MyRange", s.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_nullName_throwsException() {
        new TimePeriodValues(null);
    }

    // ---------- Domain/Range Description Tests ----------

    @Test
    public void testSetDomainDescription_normalValue_getterReturnsSameValue() {
        series.setDomainDescription("NewDomain");
        Assert.assertEquals("NewDomain", series.getDomainDescription());
    }

    @Test
    public void testSetDomainDescription_null_getterReturnsNull() {
        series.setDomainDescription(null);
        Assert.assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription_normalValue_getterReturnsSameValue() {
        series.setRangeDescription("NewRange");
        Assert.assertEquals("NewRange", series.getRangeDescription());
    }

    @Test
    public void testSetRangeDescription_null_getterReturnsNull() {
        series.setRangeDescription(null);
        Assert.assertNull(series.getRangeDescription());
    }

    // ---------- getItemCount Tests ----------

    @Test
    public void testGetItemCount_emptySeries_returnsZero() {
        Assert.assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemCount_afterAddingItems_returnsCorrectCount() {
        series.add(new Year(2001), 100.0);
        series.add(new Year(2002), 200.0);
        Assert.assertEquals(2, series.getItemCount());
    }

    // ---------- getDataItem / getTimePeriod / getValue Tests ----------

    @Test
    public void testGetDataItem_validIndex_returnsCorrectItem() {
        TimePeriod period = new Year(2001);
        series.add(period, 100.0);
        TimePeriodValue item = series.getDataItem(0);
        Assert.assertEquals(period, item.getPeriod());
        Assert.assertEquals(100.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItem_invalidIndex_throwsException() {
        series.getDataItem(0);
    }

    @Test
    public void testGetTimePeriod_validIndex_returnsCorrectPeriod() {
        TimePeriod period = new Year(2001);
        series.add(period, 100.0);
        Assert.assertEquals(period, series.getTimePeriod(0));
    }

    @Test
    public void testGetValue_validIndex_returnsCorrectValue() {
        series.add(new Year(2001), 123.45);
        Assert.assertEquals(123.45, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- add(TimePeriodValue) Tests ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullItem_throwsException() {
        series.add((TimePeriodValue) null);
    }

    @Test
    public void testAdd_singleItem_boundsUpdatedCorrectly() {
        TimePeriod period = new Year(2001);
        series.add(period, 10.0);
        Assert.assertEquals(0, series.getMinStartIndex());
        Assert.assertEquals(0, series.getMaxStartIndex());
        Assert.assertEquals(0, series.getMinMiddleIndex());
        Assert.assertEquals(0, series.getMaxMiddleIndex());
        Assert.assertEquals(0, series.getMinEndIndex());
        Assert.assertEquals(0, series.getMaxEndIndex());
    }

    @Test
    public void testAdd_multipleItems_boundsUpdatedCorrectly() {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2003), 30.0);
        series.add(new Year(2002), 20.0);

        // Year(2001) < Year(2002) < Year(2003) in terms of start/end times.
        Assert.assertEquals(0, series.getMinStartIndex());
        Assert.assertEquals(1, series.getMaxStartIndex());
        Assert.assertEquals(0, series.getMinEndIndex());
        Assert.assertEquals(1, series.getMaxEndIndex());
    }

    // ---------- add(TimePeriod, double) Tests ----------

    @Test
    public void testAdd_periodAndDoubleValue_itemAddedCorrectly() {
        series.add(new Year(2001), 55.5);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(55.5, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- add(TimePeriod, Number) Tests ----------

    @Test
    public void testAdd_periodAndNumberValue_itemAddedCorrectly() {
        series.add(new Year(2001), new Double(77.7));
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertEquals(77.7, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_periodAndNullNumberValue_itemAddedWithNullValue() {
        series.add(new Year(2001), (Number) null);
        Assert.assertEquals(1, series.getItemCount());
        Assert.assertNull(series.getValue(0));
    }

    // ---------- update Tests ----------

    @Test
    public void testUpdate_validIndex_valueUpdatedCorrectly() {
        series.add(new Year(2001), 10.0);
        series.update(0, new Double(999.0));
        Assert.assertEquals(999.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdate_invalidIndex_throwsException() {
        series.update(0, new Double(999.0));
    }

    // ---------- delete Tests ----------

    @Test
    public void testDelete_singleItem_itemRemovedAndBoundsRecalculated() {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);

        series.delete(1, 1);

        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Year(2001), series.getTimePeriod(0));
        Assert.assertEquals(new Year(2003), series.getTimePeriod(1));
    }

    @Test
    public void testDelete_rangeOfItems_itemsRemovedAndBoundsRecalculated() {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);
        series.add(new Year(2004), 40.0);

        series.delete(1, 2);

        Assert.assertEquals(2, series.getItemCount());
        Assert.assertEquals(new Year(2001), series.getTimePeriod(0));
        Assert.assertEquals(new Year(2004), series.getTimePeriod(1));
    }

    @Test
    public void testDelete_allItems_emptySeriesWithDefaultBounds() {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);

        series.delete(0, 1);

        Assert.assertEquals(0, series.getItemCount());
        Assert.assertEquals(-1, series.getMinStartIndex());
        Assert.assertEquals(-1, series.getMaxStartIndex());
        Assert.assertEquals(-1, series.getMinMiddleIndex());
        Assert.assertEquals(-1, series.getMaxMiddleIndex());
        Assert.assertEquals(-1, series.getMinEndIndex());
        Assert.assertEquals(-1, series.getMaxEndIndex());
    }

    // ---------- equals Tests ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        Assert.assertTrue(series.equals(series));
    }

    @Test
    public void testEquals_differentClassObject_returnsFalse() {
        Assert.assertFalse(series.equals("Not a TimePeriodValues"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        Assert.assertFalse(series.equals(null));
    }

    @Test
    public void testEquals_equivalentSeries_returnsTrue() {
        TimePeriodValues s1 = new TimePeriodValues("Series1");
        TimePeriodValues s2 = new TimePeriodValues("Series1");
        s1.add(new Year(2001), 10.0);
        s2.add(new Year(2001), 10.0);
        Assert.assertTrue(s1.equals(s2));
    }

    @Test
    public void testEquals_differentDomainDescription_returnsFalse() {
        TimePeriodValues s1 = new TimePeriodValues("Series1", "DomainA", "Range");
        TimePeriodValues s2 = new TimePeriodValues("Series1", "DomainB", "Range");
        Assert.assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentRangeDescription_returnsFalse() {
        TimePeriodValues s1 = new TimePeriodValues("Series1", "Domain", "RangeA");
        TimePeriodValues s2 = new TimePeriodValues("Series1", "Domain", "RangeB");
        Assert.assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentItemCount_returnsFalse() {
        TimePeriodValues s1 = new TimePeriodValues("Series1");
        TimePeriodValues s2 = new TimePeriodValues("Series1");
        s1.add(new Year(2001), 10.0);
        Assert.assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentItemValues_returnsFalse() {
        TimePeriodValues s1 = new TimePeriodValues("Series1");
        TimePeriodValues s2 = new TimePeriodValues("Series1");
        s1.add(new Year(2001), 10.0);
        s2.add(new Year(2001), 20.0);
        Assert.assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentSeriesName_returnsFalse() {
        TimePeriodValues s1 = new TimePeriodValues("Series1");
        TimePeriodValues s2 = new TimePeriodValues("Series2");
        Assert.assertFalse(s1.equals(s2));
    }

    // ---------- hashCode Tests ----------

    @Test
    public void testHashCode_consistentForEqualObjects() {
        TimePeriodValues s1 = new TimePeriodValues("Series1");
        TimePeriodValues s2 = new TimePeriodValues("Series1");
        s1.add(new Year(2001), 10.0);
        s2.add(new Year(2001), 10.0);
        Assert.assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testHashCode_emptySeries_doesNotThrow() {
        int hash = series.hashCode();
        Assert.assertTrue(hash != 0 || hash == 0); // just ensure no exception
    }

    // ---------- clone Tests ----------

    @Test
    public void testClone_emptySeries_returnsEqualButDistinctObject() throws Exception {
        TimePeriodValues clone = (TimePeriodValues) series.clone();
        Assert.assertNotSame(series, clone);
        Assert.assertEquals(series, clone);
    }

    @Test
    public void testClone_seriesWithItems_returnsEqualButDistinctObject() throws Exception {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        TimePeriodValues clone = (TimePeriodValues) series.clone();
        Assert.assertNotSame(series, clone);
        Assert.assertEquals(series, clone);
        Assert.assertEquals(2, clone.getItemCount());
    }

    // ---------- createCopy Tests ----------

    @Test
    public void testCreateCopy_validRange_returnsCorrectSubset() throws Exception {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);

        TimePeriodValues copy = series.createCopy(1, 2);
        Assert.assertEquals(2, copy.getItemCount());
        Assert.assertEquals(new Year(2002), copy.getTimePeriod(0));
        Assert.assertEquals(new Year(2003), copy.getTimePeriod(1));
    }

    @Test
    public void testCreateCopy_emptySeries_returnsEmptyCopy() throws Exception {
        TimePeriodValues copy = series.createCopy(0, -1);
        Assert.assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopy_fullRange_returnsFullCopy() throws Exception {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        TimePeriodValues copy = series.createCopy(0, series.getItemCount() - 1);
        Assert.assertEquals(series.getItemCount(), copy.getItemCount());
    }

    // ---------- Bounds Getter Tests (initial state) ----------

    @Test
    public void testGetMinStartIndex_emptySeries_returnsNegativeOne() {
        Assert.assertEquals(-1, series.getMinStartIndex());
    }

    @Test
    public void testGetMaxStartIndex_emptySeries_returnsNegativeOne() {
        Assert.assertEquals(-1, series.getMaxStartIndex());
    }

    @Test
    public void testGetMinMiddleIndex_emptySeries_returnsNegativeOne() {
        Assert.assertEquals(-1, series.getMinMiddleIndex());
    }

    @Test
    public void testGetMaxMiddleIndex_emptySeries_returnsNegativeOne() {
        Assert.assertEquals(-1, series.getMaxMiddleIndex());
    }

    @Test
    public void testGetMinEndIndex_emptySeries_returnsNegativeOne() {
        Assert.assertEquals(-1, series.getMinEndIndex());
    }

    @Test
    public void testGetMaxEndIndex_emptySeries_returnsNegativeOne() {
        Assert.assertEquals(-1, series.getMaxEndIndex());
    }

    // ---------- Bounds Getter Tests (after multiple adds, various orders) ----------

    @Test
    public void testBoundsIndexes_multipleAddsIncreasingOrder_correctIndexes() {
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2003), 30.0);

        Assert.assertEquals(0, series.getMinStartIndex());
        Assert.assertEquals(2, series.getMaxStartIndex());
        Assert.assertEquals(0, series.getMinEndIndex());
        Assert.assertEquals(2, series.getMaxEndIndex());
    }

    @Test
    public void testBoundsIndexes_multipleAddsDecreasingOrder_correctIndexes() {
        series.add(new Year(2003), 30.0);
        series.add(new Year(2002), 20.0);
        series.add(new Year(2001), 10.0);

        Assert.assertEquals(2, series.getMinStartIndex());
        Assert.assertEquals(0, series.getMaxStartIndex());
        Assert.assertEquals(2, series.getMinEndIndex());
        Assert.assertEquals(0, series.getMaxEndIndex());
    }

    @Test
    public void testBoundsIndexes_multipleAddsRandomOrder_correctIndexes() {
        series.add(new Year(2002), 20.0);
        series.add(new Year(2004), 40.0);
        series.add(new Year(2001), 10.0);
        series.add(new Year(2003), 30.0);

        Assert.assertEquals(2, series.getMinStartIndex());
        Assert.assertEquals(1, series.getMaxStartIndex());
        Assert.assertEquals(2, series.getMinEndIndex());
        Assert.assertEquals(1, series.getMaxEndIndex());
    }

    // ---------- Series name getter (inherited) Test ----------

    @Test
    public void testGetKey_seriesName_returnsCorrectName() {
        Assert.assertEquals("Test Series", series.getKey());
    }
}
