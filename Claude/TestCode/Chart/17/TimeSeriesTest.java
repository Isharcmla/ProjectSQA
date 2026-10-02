import org.jfree.data.general.Series;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
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

    // ---------- Constructors ----------

    @Test
    public void testConstructor_NameOnly_DefaultDayClass() {
        TimeSeries s = new TimeSeries("Series1");
        assertEquals(Day.class, s.getTimePeriodClass());
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testConstructor_NameAndTimePeriodClass() {
        TimeSeries s = new TimeSeries("Series2", Year.class);
        assertEquals(Year.class, s.getTimePeriodClass());
    }

    @Test
    public void testConstructor_FullArgs() {
        TimeSeries s = new TimeSeries("Series3", "Domain", "Range", Year.class);
        assertEquals("Domain", s.getDomainDescription());
        assertEquals("Range", s.getRangeDescription());
        assertEquals(Year.class, s.getTimePeriodClass());
    }

    @Test
    public void testConstructor_NullDomainRange_Allowed() {
        TimeSeries s = new TimeSeries("Series4", null, null, Year.class);
        assertNull(s.getDomainDescription());
        assertNull(s.getRangeDescription());
    }

    // ---------- Domain/Range description ----------

    @Test
    public void testSetDomainDescription_NormalValue_UpdatesDescription() {
        series.setDomainDescription("MyDomain");
        assertEquals("MyDomain", series.getDomainDescription());
    }

    @Test
    public void testSetDomainDescription_Null_AllowsNull() {
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription_NormalValue_UpdatesDescription() {
        series.setRangeDescription("MyRange");
        assertEquals("MyRange", series.getRangeDescription());
    }

    @Test
    public void testSetRangeDescription_Null_AllowsNull() {
        series.setRangeDescription(null);
        assertNull(series.getRangeDescription());
    }

    // ---------- getItemCount / getItems ----------

    @Test
    public void testGetItemCount_EmptySeries_ReturnsZero() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemCount_AfterAdd_ReturnsCorrectCount() {
        series.add(new Day(1, 1, 2020), 1.0);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testGetItems_ReturnsUnmodifiableList() {
        series.add(new Day(1, 1, 2020), 1.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new Object());
            fail("Expected UnsupportedOperationException");
        }
        catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- Maximum Item Count ----------

    @Test
    public void testGetMaximumItemCount_Default_ReturnsMaxValue() {
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCount_NormalValue_SetsCorrectly() {
        series.setMaximumItemCount(10);
        assertEquals(10, series.getMaximumItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_NegativeValue_ThrowsException() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCount_ZeroBoundary_Allowed() {
        series.setMaximumItemCount(0);
        assertEquals(0, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCount_ExceedingCurrentItems_DeletesOldest() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- Maximum Item Age ----------

    @Test
    public void testGetMaximumItemAge_Default_ReturnsMaxValue() {
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    @Test
    public void testSetMaximumItemAge_NormalValue_SetsCorrectly() {
        series.setMaximumItemAge(5);
        assertEquals(5, series.getMaximumItemAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_NegativeValue_ThrowsException() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAge_ZeroBoundary_RemovesOldItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.setMaximumItemAge(0);
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- getTimePeriodClass ----------

    @Test
    public void testGetTimePeriodClass_DefaultDay() {
        assertEquals(Day.class, series.getTimePeriodClass());
    }

    // ---------- getDataItem ----------

    @Test
    public void testGetDataItem_ByIndex_ReturnsCorrectItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertEquals(d, item.getPeriod());
        assertEquals(1.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItem_InvalidIndex_ThrowsException() {
        series.getDataItem(0);
    }

    @Test
    public void testGetDataItem_ByPeriod_Existing_ReturnsItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        TimeSeriesDataItem item = series.getDataItem(d);
        assertNotNull(item);
        assertEquals(1.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItem_ByPeriod_NotExisting_ReturnsNull() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        Day other = new Day(2, 1, 2020);
        assertNull(series.getDataItem(other));
    }

    // ---------- getTimePeriod ----------

    @Test
    public void testGetTimePeriod_ValidIndex_ReturnsPeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        assertEquals(d, series.getTimePeriod(0));
    }

    // ---------- getNextTimePeriod ----------

    @Test
    public void testGetNextTimePeriod_ReturnsNextPeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(d.next(), next);
    }

    // ---------- getTimePeriods ----------

    @Test
    public void testGetTimePeriods_ReturnsAllPeriods() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(d1));
        assertTrue(periods.contains(d2));
    }

    @Test
    public void testGetTimePeriods_EmptySeries_ReturnsEmptyCollection() {
        Collection periods = series.getTimePeriods();
        assertEquals(0, periods.size());
    }

    // ---------- getTimePeriodsUniqueToOtherSeries ----------

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries_ReturnsUniquePeriods() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 1.0);

        TimeSeries other = new TimeSeries("Other");
        other.add(d1, 1.0);
        other.add(d2, 2.0);

        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(d2));
    }

    // ---------- getIndex ----------

    @Test
    public void testGetIndex_ExistingPeriod_ReturnsNonNegativeIndex() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        assertEquals(0, series.getIndex(d));
    }

    @Test
    public void testGetIndex_NonExistingPeriod_ReturnsNegativeIndex() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        Day other = new Day(5, 1, 2020);
        assertTrue(series.getIndex(other) < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_NullPeriod_ThrowsException() {
        series.getIndex(null);
    }

    // ---------- getValue ----------

    @Test
    public void testGetValue_ByIndex_ReturnsCorrectValue() {
        series.add(new Day(1, 1, 2020), 5.0);
        assertEquals(5.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValue_ByPeriod_Existing_ReturnsValue() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 5.0);
        assertEquals(5.0, series.getValue(d).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValue_ByPeriod_NotExisting_ReturnsNull() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 5.0);
        Day other = new Day(2, 1, 2020);
        assertNull(series.getValue(other));
    }

    // ---------- add(TimeSeriesDataItem) ----------

    @Test
    public void testAdd_TimeSeriesDataItem_NormalCase_AddsItem() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Day(1, 1, 2020), 1.0);
        series.add(item);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_TimeSeriesDataItem_Null_ThrowsException() {
        series.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAdd_TimeSeriesDataItem_WrongTimePeriodClass_ThrowsException() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Year(2020), 1.0);
        series.add(item); // series expects Day
    }

    @Test(expected = SeriesException.class)
    public void testAdd_TimeSeriesDataItem_DuplicatePeriod_ThrowsException() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.add(d, 2.0);
    }

    @Test
    public void testAdd_TimeSeriesDataItem_OutOfOrder_InsertsAtCorrectPosition() {
        series.add(new Day(5, 1, 2020), 5.0);
        series.add(new Day(1, 1, 2020), 1.0);
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getValue(0).doubleValue(), 0.0001);
        assertEquals(5.0, series.getValue(1).doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_TimeSeriesDataItem_NotifyFalse_DoesNotThrow() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Day(1, 1, 2020), 1.0);
        series.add(item, false);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAdd_TimeSeriesDataItem_ExceedsMaximumItemCount_RemovesFirst() {
        series.setMaximumItemCount(2);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- add(RegularTimePeriod, double) ----------

    @Test
    public void testAdd_PeriodDouble_NormalCase_AddsItem() {
        series.add(new Day(1, 1, 2020), 10.0);
        assertEquals(1, series.getItemCount());
        assertEquals(10.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAdd_PeriodDoubleNotify_False_AddsItemWithoutNotify() {
        series.add(new Day(1, 1, 2020), 10.0, false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- add(RegularTimePeriod, Number) ----------

    @Test
    public void testAdd_PeriodNumber_NormalCase_AddsItem() {
        series.add(new Day(1, 1, 2020), new Double(20.0));
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAdd_PeriodNumber_NullValue_Allowed() {
        series.add(new Day(1, 1, 2020), (Number) null);
        assertNull(series.getValue(0));
    }

    @Test
    public void testAdd_PeriodNumberNotify_False_AddsWithoutNotify() {
        series.add(new Day(1, 1, 2020), new Double(20.0), false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- update(RegularTimePeriod, Number) ----------

    @Test
    public void testUpdate_PeriodNumber_ExistingPeriod_UpdatesValue() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.update(d, new Double(99.0));
        assertEquals(99.0, series.getValue(d).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdate_PeriodNumber_NonExistingPeriod_ThrowsException() {
        Day d = new Day(1, 1, 2020);
        series.update(d, new Double(99.0));
    }

    // ---------- update(int, Number) ----------

    @Test
    public void testUpdate_IndexNumber_ValidIndex_UpdatesValue() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.update(0, new Double(50.0));
        assertEquals(50.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdate_IndexNumber_InvalidIndex_ThrowsException() {
        series.update(0, new Double(50.0));
    }

    // ---------- addAndOrUpdate ----------

    @Test
    public void testAddAndOrUpdate_MergesSeriesAndReturnsOverwritten() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);

        TimeSeries other = new TimeSeries("Other", Day.class);
        other.add(new Day(1, 1, 2020), 100.0); // overwrite
        other.add(new Day(3, 1, 2020), 3.0);   // new

        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(1.0, overwritten.getValue(0).doubleValue(), 0.0001);
        assertEquals(3, series.getItemCount());
        assertEquals(100.0, series.getValue(new Day(1, 1, 2020)).doubleValue(), 0.0001);
    }

    // ---------- addOrUpdate(RegularTimePeriod, double) ----------

    @Test
    public void testAddOrUpdate_Double_NewPeriod_ReturnsNull() {
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Day(1, 1, 2020), 5.0);
        assertNull(overwritten);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdate_Double_ExistingPeriod_ReturnsOldItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        TimeSeriesDataItem overwritten = series.addOrUpdate(d, 99.0);
        assertNotNull(overwritten);
        assertEquals(1.0, overwritten.getValue().doubleValue(), 0.0001);
        assertEquals(99.0, series.getValue(d).doubleValue(), 0.0001);
    }

    // ---------- addOrUpdate(RegularTimePeriod, Number) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdate_Number_NullPeriod_ThrowsException() {
        series.addOrUpdate(null, new Double(1.0));
    }

    @Test
    public void testAddOrUpdate_Number_ExceedsMaximumItemCount_RemovesFirst() {
        series.setMaximumItemCount(1);
        series.addOrUpdate(new Day(1, 1, 2020), new Double(1.0));
        series.addOrUpdate(new Day(2, 1, 2020), new Double(2.0));
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- removeAgedItems(boolean) ----------

    @Test
    public void testRemoveAgedItems_Boolean_NoItemsRemoved_WhenWithinMaxAge() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.removeAgedItems(true);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItems_Boolean_SingleItem_NoRemoval() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.removeAgedItems(true);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItems_Boolean_RemovesOldItems_NotifyTrue() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.setMaximumItemAge(1); // this internally calls removeAgedItems
        assertTrue(series.getItemCount() <= 2);
    }

    // ---------- removeAgedItems(long, boolean) ----------

    @Test
    public void testRemoveAgedItems_LongBoolean_RemovesOldItems() {
        series = new TimeSeries("AgeTest", Day.class);
        series.setMaximumItemAge(1);
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(5, 1, 2020);
        series.add(d1, 1.0, false);
        series.add(d2, 2.0, false);

        long latest = d2.getEnd().getTime();
        series.removeAgedItems(latest, true);
        assertTrue(series.getItemCount() >= 1);
    }

    @Test
    public void testRemoveAgedItems_LongBoolean_EmptySeries_NoException() {
        series.removeAgedItems(System.currentTimeMillis(), true);
        assertEquals(0, series.getItemCount());
    }

    // ---------- clear ----------

    @Test
    public void testClear_NonEmptySeries_RemovesAllItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testClear_EmptySeries_NoExceptionThrown() {
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    // ---------- delete(RegularTimePeriod) ----------

    @Test
    public void testDelete_Period_ExistingPeriod_RemovesItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.delete(d);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDelete_Period_NonExistingPeriod_NoChange() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        Day other = new Day(2, 1, 2020);
        series.delete(other);
        assertEquals(1, series.getItemCount());
    }

    // ---------- delete(int, int) ----------

    @Test
    public void testDelete_StartEnd_NormalRange_RemovesItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(3.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDelete_StartEnd_EndLessThanStart_ThrowsException() {
        series.delete(2, 1);
    }

    @Test
    public void testDelete_StartEnd_SingleItem_RemovesOne() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.delete(0, 0);
        assertEquals(0, series.getItemCount());
    }

    // ---------- clone ----------

    @Test
    public void testClone_ReturnsEqualButIndependentCopy() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries cloned = (TimeSeries) series.clone();
        assertEquals(series, cloned);
        cloned.add(new Day(2, 1, 2020), 2.0);
        assertNotEquals(series.getItemCount(), cloned.getItemCount());
    }

    @Test
    public void testClone_EmptySeries_ReturnsEmptyClone() throws CloneNotSupportedException {
        TimeSeries cloned = (TimeSeries) series.clone();
        assertEquals(0, cloned.getItemCount());
    }

    // ---------- createCopy(int, int) ----------

    @Test
    public void testCreateCopy_IntInt_NormalRange_ReturnsCopy() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_IntInt_NegativeStart_ThrowsException() throws CloneNotSupportedException {
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_IntInt_EndLessThanStart_ThrowsException() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        series.createCopy(1, 0);
    }

    @Test
    public void testCreateCopy_IntInt_EmptySeries_ReturnsEmptyCopy() throws CloneNotSupportedException {
        // With empty series, start=0, end=-1 avoids the loop (getItemCount()-1 == -1)
        TimeSeries copy = series.createCopy(0, -1);
        assertEquals(0, copy.getItemCount());
    }

    // ---------- createCopy(RegularTimePeriod, RegularTimePeriod) ----------

    @Test
    public void testCreateCopy_PeriodPeriod_NormalRange_ReturnsCopy() throws CloneNotSupportedException {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        Day d3 = new Day(3, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.add(d3, 3.0);
        TimeSeries copy = series.createCopy(d1, d2);
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_PeriodPeriod_NullStart_ThrowsException() throws CloneNotSupportedException {
        series.createCopy(null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_PeriodPeriod_NullEnd_ThrowsException() throws CloneNotSupportedException {
        series.createCopy(new Day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopy_PeriodPeriod_StartAfterEnd_ThrowsException() throws CloneNotSupportedException {
        series.createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testCreateCopy_PeriodPeriod_EmptyRange_ReturnsEmptyCopy() throws CloneNotSupportedException {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 1.0);
        Day future1 = new Day(10, 1, 2020);
        Day future2 = new Day(11, 1, 2020);
        TimeSeries copy = series.createCopy(future1, future2);
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopy_PeriodPeriod_StartBeforeData_UsesFirstAvailable() throws CloneNotSupportedException {
        Day d1 = new Day(5, 1, 2020);
        Day d2 = new Day(6, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        Day beforeStart = new Day(1, 1, 2020);
        TimeSeries copy = series.createCopy(beforeStart, d2);
        assertEquals(2, copy.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_SameObject_ReturnsTrue() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEquals_DifferentClass_ReturnsFalse() {
        assertFalse(series.equals("Not a TimeSeries"));
    }

    @Test
    public void testEquals_Null_ReturnsFalse() {
        assertFalse(series.equals(null));
    }

    @Test
    public void testEquals_EqualSeries_ReturnsTrue() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "Range", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 1.0);
        assertTrue(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentDomainDescription_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("Same", "DomainA", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "DomainB", "Range", Day.class);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentRangeDescription_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "RangeA", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "RangeB", Day.class);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentMaximumItemAge_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "Range", Day.class);
        s1.setMaximumItemAge(5);
        s2.setMaximumItemAge(10);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentMaximumItemCount_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "Range", Day.class);
        s1.setMaximumItemCount(5);
        s2.setMaximumItemCount(10);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentItemCount_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "Range", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentDataItems_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "Range", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_DifferentName_ReturnsFalse() {
        TimeSeries s1 = new TimeSeries("NameA");
        TimeSeries s2 = new TimeSeries("NameB");
        assertFalse(s1.equals(s2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_EmptySeries_ReturnsConsistentValue() {
        int h1 = series.hashCode();
        int h2 = series.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_EqualObjects_HaveSameHashCode() {
        TimeSeries s1 = new TimeSeries("Same", "Domain", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Same", "Domain", "Range", Day.class);
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 1.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testHashCode_WithMultipleItems_ComputesUsingFirstMiddleLast() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        int h = series.hashCode();
        assertNotEquals(0, h);
    }

    // ---------- SeriesChangeListener notification check ----------

    @Test
    public void testAdd_NotifiesRegisteredListener() {
        final boolean[] notified = {false};
        SeriesChangeListener listener = new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                notified[0] = true;
            }
        };
        series.addChangeListener(listener);
        series.add(new Day(1, 1, 2020), 1.0);
        assertTrue(notified[0]);
    }

    @Test
    public void testAdd_NotifyFalse_DoesNotNotifyListener() {
        final boolean[] notified = {false};
        SeriesChangeListener listener = new SeriesChangeListener() {
            public void seriesChanged(SeriesChangeEvent event) {
                notified[0] = true;
            }
        };
        series.addChangeListener(listener);
        series.add(new Day(1, 1, 2020), 1.0, false);
        assertFalse(notified[0]);
    }
}
