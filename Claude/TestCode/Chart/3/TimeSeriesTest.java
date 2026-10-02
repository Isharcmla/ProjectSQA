import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Year;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test Series");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultDomainRange_success() {
        TimeSeries s = new TimeSeries("Series1");
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testConstructor_withDomainRange_success() {
        TimeSeries s = new TimeSeries("Series2", "MyDomain", "MyRange");
        assertEquals("MyDomain", s.getDomainDescription());
        assertEquals("MyRange", s.getRangeDescription());
    }

    // ---------- Domain / Range description ----------

    @Test
    public void testSetGetDomainDescription_normal_success() {
        series.setDomainDescription("NewDomain");
        assertEquals("NewDomain", series.getDomainDescription());
    }

    @Test
    public void testSetDomainDescription_null_success() {
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetGetRangeDescription_normal_success() {
        series.setRangeDescription("NewRange");
        assertEquals("NewRange", series.getRangeDescription());
    }

    @Test
    public void testSetRangeDescription_null_success() {
        series.setRangeDescription(null);
        assertNull(series.getRangeDescription());
    }

    // ---------- Item count / items ----------

    @Test
    public void testGetItemCount_emptySeries_returnsZero() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItems_afterAdd_returnsUnmodifiableList() {
        series.add(new Year(2000), 100.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new TimeSeriesDataItem(new Year(2001), 1.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- Maximum item count ----------

    @Test
    public void testGetSetMaximumItemCount_normal_success() {
        series.setMaximumItemCount(5);
        assertEquals(5, series.getMaximumItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_negative_throwsException() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCount_trimsExcessItems_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(0));
    }

    // ---------- Maximum item age ----------

    @Test
    public void testGetSetMaximumItemAge_normal_success() {
        series.setMaximumItemAge(10);
        assertEquals(10, series.getMaximumItemAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_negative_throwsException() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAge_removesOldItems_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.setMaximumItemAge(1);
        assertTrue(series.getItemCount() <= 2);
    }

    // ---------- MinY / MaxY ----------

    @Test
    public void testGetMinYMaxY_emptySeries_returnsNaN() {
        assertTrue(Double.isNaN(series.getMinY()));
        assertTrue(Double.isNaN(series.getMaxY()));
    }

    @Test
    public void testGetMinYMaxY_afterAdd_correctValues() {
        series.add(new Year(2000), 5.0);
        series.add(new Year(2001), 10.0);
        series.add(new Year(2002), 2.0);
        assertEquals(2.0, series.getMinY(), 0.0001);
        assertEquals(10.0, series.getMaxY(), 0.0001);
    }

    // ---------- TimePeriodClass ----------

    @Test
    public void testGetTimePeriodClass_emptySeries_returnsNull() {
        assertNull(series.getTimePeriodClass());
    }

    @Test
    public void testGetTimePeriodClass_afterAdd_returnsCorrectClass() {
        series.add(new Year(2000), 1.0);
        assertEquals(Year.class, series.getTimePeriodClass());
    }

    // ---------- getDataItem ----------

    @Test
    public void testGetDataItem_byIndex_returnsCorrectItem() {
        series.add(new Year(2000), 10.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertEquals(new Year(2000), item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItem_byPeriod_found_returnsItem() {
        series.add(new Year(2000), 10.0);
        TimeSeriesDataItem item = series.getDataItem(new Year(2000));
        assertNotNull(item);
        assertEquals(10.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItem_byPeriod_notFound_returnsNull() {
        series.add(new Year(2000), 10.0);
        TimeSeriesDataItem item = series.getDataItem(new Year(1999));
        assertNull(item);
    }

    // ---------- getTimePeriod ----------

    @Test
    public void testGetTimePeriod_validIndex_returnsPeriod() {
        series.add(new Year(2005), 1.0);
        assertEquals(new Year(2005), series.getTimePeriod(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetTimePeriod_invalidIndex_throwsException() {
        series.getTimePeriod(0);
    }

    // ---------- getNextTimePeriod ----------

    @Test
    public void testGetNextTimePeriod_normal_success() {
        series.add(new Year(2000), 1.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(new Year(2001), next);
    }

    // ---------- getTimePeriods ----------

    @Test
    public void testGetTimePeriods_normal_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
    }

    @Test
    public void testGetTimePeriods_emptySeries_returnsEmptyCollection() {
        Collection periods = series.getTimePeriods();
        assertEquals(0, periods.size());
    }

    // ---------- getTimePeriodsUniqueToOtherSeries ----------

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries_normal_success() {
        series.add(new Year(2000), 1.0);
        TimeSeries other = new TimeSeries("Other");
        other.add(new Year(2000), 1.0);
        other.add(new Year(2001), 2.0);
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Year(2001)));
    }

    // ---------- getIndex ----------

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_nullPeriod_throwsException() {
        series.getIndex(null);
    }

    @Test
    public void testGetIndex_existingPeriod_returnsNonNegative() {
        series.add(new Year(2000), 1.0);
        assertEquals(0, series.getIndex(new Year(2000)));
    }

    @Test
    public void testGetIndex_nonExistingPeriod_returnsNegative() {
        series.add(new Year(2000), 1.0);
        assertTrue(series.getIndex(new Year(1999)) < 0);
    }

    // ---------- getValue ----------

    @Test
    public void testGetValue_byIndex_returnsCorrectValue() {
        series.add(new Year(2000), 42.0);
        assertEquals(42.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValue_byPeriod_found_returnsValue() {
        series.add(new Year(2000), 42.0);
        assertEquals(42.0, series.getValue(new Year(2000)).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValue_byPeriod_notFound_returnsNull() {
        series.add(new Year(2000), 42.0);
        assertNull(series.getValue(new Year(1999)));
    }

    // ---------- add(TimeSeriesDataItem) ----------

    @Test
    public void testAdd_dataItem_normal_success() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Year(2000), 10.0);
        series.add(item);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_nullDataItem_throwsException() {
        series.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_duplicatePeriod_throwsException() {
        series.add(new Year(2000), 10.0);
        series.add(new Year(2000), 20.0);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_mismatchedTimePeriodClass_throwsException() {
        series.add(new Year(2000), 10.0);
        series.add(new Day(1, 1, 2000), 20.0);
    }

    @Test
    public void testAdd_dataItem_withNotifyFalse_doesNotThrow() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Year(2000), 10.0);
        series.add(item, false);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAdd_insertOutOfOrder_success() {
        series.add(new Year(2001), 1.0);
        series.add(new Year(2000), 2.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2000), series.getTimePeriod(0));
        assertEquals(new Year(2001), series.getTimePeriod(1));
    }

    // ---------- add(RegularTimePeriod, double) ----------

    @Test
    public void testAdd_periodDouble_normal_success() {
        series.add(new Year(2000), 5.0);
        assertEquals(1, series.getItemCount());
        assertEquals(5.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_periodDoubleNotify_normal_success() {
        series.add(new Year(2000), 5.0, false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- add(RegularTimePeriod, Number) ----------

    @Test
    public void testAdd_periodNumber_normal_success() {
        series.add(new Year(2000), new Double(5.0));
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAdd_periodNumberNull_success() {
        series.add(new Year(2000), (Number) null);
        assertNull(series.getValue(0));
    }

    @Test
    public void testAdd_periodNumberNotify_normal_success() {
        series.add(new Year(2000), new Double(5.0), false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- update(RegularTimePeriod, Number) ----------

    @Test
    public void testUpdate_periodExists_success() {
        series.add(new Year(2000), 10.0);
        series.update(new Year(2000), new Double(20.0));
        assertEquals(20.0, series.getValue(new Year(2000)).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdate_periodNotExists_throwsException() {
        series.add(new Year(2000), 10.0);
        series.update(new Year(1999), new Double(20.0));
    }

    // ---------- update(int, Number) ----------

    @Test
    public void testUpdate_byIndex_success() {
        series.add(new Year(2000), 10.0);
        series.update(0, new Double(30.0));
        assertEquals(30.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdate_byIndex_withNullValue_success() {
        series.add(new Year(2000), 10.0);
        series.update(0, null);
        assertNull(series.getValue(0));
    }

    @Test
    public void testUpdate_byIndex_causesIteration_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 5.0);
        series.add(new Year(2002), 10.0);
        // updating the min value triggers iterate branch
        series.update(0, new Double(100.0));
        assertEquals(5.0, series.getMinY(), 0.0001);
        assertEquals(100.0, series.getMaxY(), 0.0001);
    }

    // ---------- addAndOrUpdate ----------

    @Test
    public void testAddAndOrUpdate_normal_success() {
        series.add(new Year(2000), 1.0);
        TimeSeries other = new TimeSeries("Other");
        other.add(new Year(2000), 2.0);
        other.add(new Year(2001), 3.0);
        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(1.0, overwritten.getValue(0).doubleValue(), 0.0001);
        assertEquals(2, series.getItemCount());
    }

    // ---------- addOrUpdate(RegularTimePeriod, double) ----------

    @Test
    public void testAddOrUpdate_doubleValue_newItem_returnsNull() {
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Year(2000), 5.0);
        assertNull(overwritten);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdate_doubleValue_existingItem_returnsOldItem() {
        series.add(new Year(2000), 5.0);
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Year(2000), 10.0);
        assertNotNull(overwritten);
        assertEquals(5.0, overwritten.getValue().doubleValue(), 0.0001);
    }

    // ---------- addOrUpdate(RegularTimePeriod, Number) ----------

    @Test
    public void testAddOrUpdate_numberValue_newItem_success() {
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Year(2000), new Double(5.0));
        assertNull(overwritten);
    }

    // ---------- addOrUpdate(TimeSeriesDataItem) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_nullItem_throwsException() {
        series.addOrUpdate((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddOrUpdate_mismatchedClass_throwsException() {
        series.add(new Year(2000), 1.0);
        series.addOrUpdate(new TimeSeriesDataItem(new Day(1, 1, 2000), 2.0));
    }

    @Test
    public void testAddOrUpdate_dataItem_existingCausesIteration_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 5.0);
        series.add(new Year(2002), 10.0);
        series.addOrUpdate(new TimeSeriesDataItem(new Year(2000), 100.0));
        assertTrue(series.getMaxY() >= 10.0);
    }

    @Test
    public void testAddOrUpdate_exceedsMaximumItemCount_removesOldest() {
        series.setMaximumItemCount(2);
        series.addOrUpdate(new Year(2000), 1.0);
        series.addOrUpdate(new Year(2001), 2.0);
        series.addOrUpdate(new Year(2002), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2001), series.getTimePeriod(0));
    }

    // ---------- removeAgedItems(boolean) ----------

    @Test
    public void testRemoveAgedItems_notifyTrue_noItemsToRemove_success() {
        series.add(new Year(2000), 1.0);
        series.removeAgedItems(true);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItems_singleItem_noRemoval() {
        series.add(new Year(2000), 1.0);
        series.removeAgedItems(false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- removeAgedItems(long, boolean) ----------

    @Test
    public void testRemoveAgedItemsLong_emptySeries_noOp() {
        series.removeAgedItems(System.currentTimeMillis(), true);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItemsLong_withItems_success() {
        series.add(new Day(1, 1, 2000), 1.0);
        series.add(new Day(2, 1, 2000), 2.0);
        series.setMaximumItemAge(1);
        long latest = new Day(2, 1, 2000).getFirstMillisecond();
        series.removeAgedItems(latest, true);
        assertTrue(series.getItemCount() >= 1);
    }

    // ---------- clear ----------

    @Test
    public void testClear_withItems_removesAll() {
        series.add(new Year(2000), 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
        assertTrue(Double.isNaN(series.getMinY()));
    }

    @Test
    public void testClear_emptySeries_noOp() {
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    // ---------- delete(RegularTimePeriod) ----------

    @Test
    public void testDelete_byPeriod_existingItem_removed() {
        series.add(new Year(2000), 1.0);
        series.delete(new Year(2000));
        assertEquals(0, series.getItemCount());
        assertNull(series.getTimePeriodClass());
    }

    @Test
    public void testDelete_byPeriod_nonExistingItem_noOp() {
        series.add(new Year(2000), 1.0);
        series.delete(new Year(1999));
        assertEquals(1, series.getItemCount());
    }

    // ---------- delete(int, int) ----------

    @Test
    public void testDelete_startEnd_normal_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(new Year(2002), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelete_startGreaterThanEnd_throwsException() {
        series.add(new Year(2000), 1.0);
        series.delete(1, 0);
    }

    @Test
    public void testDelete_allItems_setsTimePeriodClassNull() {
        series.add(new Year(2000), 1.0);
        series.delete(0, 0);
        assertNull(series.getTimePeriodClass());
    }

    // ---------- delete(int, int, boolean) ----------

    @Test
    public void testDelete_startEndNotifyFalse_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.delete(0, 0, false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_success() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertEquals(series.getItemCount(), clone.getItemCount());
        assertEquals(series, clone);
        // ensure isolation
        clone.add(new Year(2001), 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(2, clone.getItemCount());
    }

    // ---------- createCopy(int, int) ----------

    @Test
    public void testCreateCopy_indices_normal_success() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_indices_negativeStart_throwsException() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_indices_endLessThanStart_throwsException() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.createCopy(1, 0);
    }

    @Test
    public void testCreateCopy_indices_emptySeries_success() throws CloneNotSupportedException {
        TimeSeries copy = series.createCopy(0, 0);
        assertEquals(0, copy.getItemCount());
    }

    // ---------- createCopy(RegularTimePeriod, RegularTimePeriod) ----------

    @Test
    public void testCreateCopy_periods_normal_success() throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        TimeSeries copy = series.createCopy(new Year(2000), new Year(2001));
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_periods_nullStart_throwsException() throws CloneNotSupportedException {
        series.createCopy(null, new Year(2001));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_periods_nullEnd_throwsException() throws CloneNotSupportedException {
        series.createCopy(new Year(2000), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_periods_startAfterEnd_throwsException() throws CloneNotSupportedException {
        series.createCopy(new Year(2001), new Year(2000));
    }

    @Test
    public void testCreateCopy_periods_emptyRange_startAfterLastItem_success()
            throws CloneNotSupportedException {
        series.add(new Year(2000), 1.0);
        TimeSeries copy = series.createCopy(new Year(2001), new Year(2002));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopy_periods_emptyRange_endBeforeStart_success()
            throws CloneNotSupportedException {
        series.add(new Year(2005), 1.0);
        series.add(new Year(2010), 2.0);
        TimeSeries copy = series.createCopy(new Year(2006), new Year(2007));
        assertEquals(0, copy.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(series.equals("not a series"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(series.equals(null));
    }

    @Test
    public void testEquals_equivalentSeries_returnsTrue() {
        TimeSeries s1 = new TimeSeries("A", "d", "r");
        TimeSeries s2 = new TimeSeries("A", "d", "r");
        s1.add(new Year(2000), 1.0);
        s2.add(new Year(2000), 1.0);
        assertTrue(s1.equals(s2));
    }

    @Test
    public void testEquals_differentDomainDescription_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A", "d1", "r");
        TimeSeries s2 = new TimeSeries("A", "d2", "r");
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentRangeDescription_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A", "d", "r1");
        TimeSeries s2 = new TimeSeries("A", "d", "r2");
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentTimePeriodClass_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A");
        TimeSeries s2 = new TimeSeries("A");
        s1.add(new Year(2000), 1.0);
        s2.add(new Day(1, 1, 2000), 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentMaximumItemAge_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A");
        TimeSeries s2 = new TimeSeries("A");
        s1.setMaximumItemAge(5);
        s2.setMaximumItemAge(10);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentMaximumItemCount_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A");
        TimeSeries s2 = new TimeSeries("A");
        s1.setMaximumItemCount(5);
        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentItemCount_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A");
        TimeSeries s2 = new TimeSeries("A");
        s1.add(new Year(2000), 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentData_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A");
        TimeSeries s2 = new TimeSeries("A");
        s1.add(new Year(2000), 1.0);
        s2.add(new Year(2000), 2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentName_returnsFalse() {
        TimeSeries s1 = new TimeSeries("A");
        TimeSeries s2 = new TimeSeries("B");
        assertFalse(s1.equals(s2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_emptySeries_success() {
        int hash = series.hashCode();
        // just verifying it doesn't throw and is consistent
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCode_singleItem_success() {
        series.add(new Year(2000), 1.0);
        int hash = series.hashCode();
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCode_twoItems_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        int hash = series.hashCode();
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCode_threeOrMoreItems_success() {
        series.add(new Year(2000), 1.0);
        series.add(new Year(2001), 2.0);
        series.add(new Year(2002), 3.0);
        int hash = series.hashCode();
        assertEquals(hash, series.hashCode());
    }

    @Test
    public void testHashCode_equalSeries_sameHashCode() {
        TimeSeries s1 = new TimeSeries("A", "d", "r");
        TimeSeries s2 = new TimeSeries("A", "d", "r");
        s1.add(new Year(2000), 1.0);
        s2.add(new Year(2000), 1.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
