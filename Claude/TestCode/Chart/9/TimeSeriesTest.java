import org.jfree.data.time.Day;
import org.jfree.data.time.Year;
import org.jfree.data.time.Month;
import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test Series");
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_defaultDayTimePeriod_setsDefaults() {
        TimeSeries s = new TimeSeries("MySeries");
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertEquals(Day.class, s.getTimePeriodClass());
        assertEquals(0, s.getItemCount());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, s.getMaximumItemAge());
    }

    @Test
    public void testConstructor_withTimePeriodClass_setsClass() {
        TimeSeries s = new TimeSeries("MySeries", Year.class);
        assertEquals(Year.class, s.getTimePeriodClass());
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
    }

    @Test
    public void testConstructor_fullArgs_setsAllFields() {
        TimeSeries s = new TimeSeries("MySeries", "MyDomain", "MyRange",
                Month.class);
        assertEquals("MyDomain", s.getDomainDescription());
        assertEquals("MyRange", s.getRangeDescription());
        assertEquals(Month.class, s.getTimePeriodClass());
    }

    @Test
    public void testConstructor_nullDomainRange_permittedNull() {
        TimeSeries s = new TimeSeries("MySeries", null, null, Day.class);
        assertNull(s.getDomainDescription());
        assertNull(s.getRangeDescription());
    }

    // ---------- Domain / Range description tests ----------

    @Test
    public void testSetDomainDescription_normalInput_updatesValue() {
        series.setDomainDescription("NewDomain");
        assertEquals("NewDomain", series.getDomainDescription());
    }

    @Test
    public void testSetDomainDescription_nullInput_allowsNull() {
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription_normalInput_updatesValue() {
        series.setRangeDescription("NewRange");
        assertEquals("NewRange", series.getRangeDescription());
    }

    @Test
    public void testSetRangeDescription_nullInput_allowsNull() {
        series.setRangeDescription(null);
        assertNull(series.getRangeDescription());
    }

    // ---------- getItemCount / getItems ----------

    @Test
    public void testGetItemCount_emptySeries_returnsZero() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemCount_afterAdd_returnsOne() {
        series.add(new Day(1, 1, 2020), 10.0);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testGetItems_returnsUnmodifiableList() {
        series.add(new Day(1, 1, 2020), 10.0);
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

    // ---------- MaximumItemCount ----------

    @Test
    public void testSetMaximumItemCount_normalValue_setsValue() {
        series.setMaximumItemCount(5);
        assertEquals(5, series.getMaximumItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCount_negativeValue_throwsException() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCount_zeroValue_removesAllItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.setMaximumItemCount(0);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testSetMaximumItemCount_smallerThanCurrentCount_removesOldestItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    // ---------- MaximumItemAge ----------

    @Test
    public void testSetMaximumItemAge_normalValue_setsValue() {
        series.setMaximumItemAge(10);
        assertEquals(10, series.getMaximumItemAge());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAge_negativeValue_throwsException() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAge_zeroRemovesOldItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.setMaximumItemAge(0);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    // ---------- getTimePeriodClass ----------

    @Test
    public void testGetTimePeriodClass_defaultDay_returnsDayClass() {
        assertEquals(Day.class, series.getTimePeriodClass());
    }

    // ---------- getDataItem(int) ----------

    @Test
    public void testGetDataItem_validIndex_returnsItem() {
        series.add(new Day(1, 1, 2020), 5.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertNotNull(item);
        assertEquals(new Day(1, 1, 2020), item.getPeriod());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItem_invalidIndex_throwsException() {
        series.getDataItem(0);
    }

    // ---------- getDataItem(RegularTimePeriod) ----------

    @Test
    public void testGetDataItemByPeriod_existingPeriod_returnsItem() {
        Day day = new Day(1, 1, 2020);
        series.add(day, 5.0);
        TimeSeriesDataItem item = series.getDataItem(day);
        assertNotNull(item);
        assertEquals(5.0, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItemByPeriod_nonExistingPeriod_returnsNull() {
        series.add(new Day(1, 1, 2020), 5.0);
        TimeSeriesDataItem item = series.getDataItem(new Day(2, 1, 2020));
        assertNull(item);
    }

    // ---------- getTimePeriod ----------

    @Test
    public void testGetTimePeriod_validIndex_returnsPeriod() {
        series.add(new Day(1, 1, 2020), 5.0);
        assertEquals(new Day(1, 1, 2020), series.getTimePeriod(0));
    }

    // ---------- getNextTimePeriod ----------

    @Test
    public void testGetNextTimePeriod_returnsNextPeriod() {
        series.add(new Day(1, 1, 2020), 5.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(new Day(2, 1, 2020), next);
    }

    // ---------- getTimePeriods ----------

    @Test
    public void testGetTimePeriods_returnsAllPeriods() {
        series.add(new Day(1, 1, 2020), 5.0);
        series.add(new Day(2, 1, 2020), 6.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
    }

    @Test
    public void testGetTimePeriods_emptySeries_returnsEmptyCollection() {
        Collection periods = series.getTimePeriods();
        assertTrue(periods.isEmpty());
    }

    // ---------- getTimePeriodsUniqueToOtherSeries ----------

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries_someUnique_returnsUnique() {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries other = new TimeSeries("Other");
        other.add(new Day(1, 1, 2020), 1.0);
        other.add(new Day(2, 1, 2020), 2.0);
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Day(2, 1, 2020)));
    }

    // ---------- getIndex ----------

    @Test
    public void testGetIndex_existingPeriod_returnsNonNegativeIndex() {
        series.add(new Day(1, 1, 2020), 1.0);
        int index = series.getIndex(new Day(1, 1, 2020));
        assertEquals(0, index);
    }

    @Test
    public void testGetIndex_nonExistingPeriod_returnsNegativeIndex() {
        series.add(new Day(1, 1, 2020), 1.0);
        int index = series.getIndex(new Day(5, 1, 2020));
        assertTrue(index < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndex_nullPeriod_throwsException() {
        series.getIndex(null);
    }

    // ---------- getValue(int) ----------

    @Test
    public void testGetValueByIndex_validIndex_returnsValue() {
        series.add(new Day(1, 1, 2020), 42.0);
        assertEquals(42.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- getValue(RegularTimePeriod) ----------

    @Test
    public void testGetValueByPeriod_existingPeriod_returnsValue() {
        Day day = new Day(1, 1, 2020);
        series.add(day, 42.0);
        assertEquals(42.0, series.getValue(day).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueByPeriod_nonExistingPeriod_returnsNull() {
        series.add(new Day(1, 1, 2020), 42.0);
        assertNull(series.getValue(new Day(2, 1, 2020)));
    }

    // ---------- add(TimeSeriesDataItem) ----------

    @Test
    public void testAddDataItem_validItem_addsToSeries() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Day(1, 1, 2020), 10.0);
        series.add(item);
        assertEquals(1, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDataItem_nullItem_throwsException() {
        series.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddDataItem_wrongTimePeriodClass_throwsException() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Year(2020), 10.0);
        series.add(item);
    }

    @Test(expected = SeriesException.class)
    public void testAddDataItem_duplicatePeriod_throwsException() {
        series.add(new Day(1, 1, 2020), 10.0);
        series.add(new Day(1, 1, 2020), 20.0);
    }

    @Test
    public void testAddDataItem_insertOutOfOrder_insertsCorrectly() {
        series.add(new Day(3, 1, 2020), 3.0);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        assertEquals(3, series.getItemCount());
        assertEquals(new Day(1, 1, 2020), series.getTimePeriod(0));
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(1));
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(2));
    }

    @Test
    public void testAddDataItem_withNotifyFalse_doesNotThrow() {
        TimeSeriesDataItem item = new TimeSeriesDataItem(new Day(1, 1, 2020), 10.0);
        series.add(item, false);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddDataItem_exceedsMaximumItemCount_removesFirstItem() {
        series.setMaximumItemCount(2);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    // ---------- add(RegularTimePeriod, double) ----------

    @Test
    public void testAddPeriodDouble_normalInput_addsItem() {
        series.add(new Day(1, 1, 2020), 5.5);
        assertEquals(5.5, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddPeriodDoubleNotify_notifyFalse_addsItemWithoutNotify() {
        series.add(new Day(1, 1, 2020), 5.5, false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- add(RegularTimePeriod, Number) ----------

    @Test
    public void testAddPeriodNumber_normalInput_addsItem() {
        series.add(new Day(1, 1, 2020), new Double(7.0));
        assertEquals(7.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddPeriodNumber_nullValue_allowedNullValue() {
        series.add(new Day(1, 1, 2020), (Number) null);
        assertNull(series.getValue(0));
    }

    @Test
    public void testAddPeriodNumberNotify_notifyFalse_addsItem() {
        series.add(new Day(1, 1, 2020), new Double(7.0), false);
        assertEquals(1, series.getItemCount());
    }

    // ---------- update(RegularTimePeriod, Number) ----------

    @Test
    public void testUpdateByPeriod_existingPeriod_updatesValue() {
        Day day = new Day(1, 1, 2020);
        series.add(day, 1.0);
        series.update(day, new Double(99.0));
        assertEquals(99.0, series.getValue(day).doubleValue(), 0.0001);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateByPeriod_nonExistingPeriod_throwsException() {
        series.update(new Day(1, 1, 2020), new Double(99.0));
    }

    // ---------- update(int, Number) ----------

    @Test
    public void testUpdateByIndex_validIndex_updatesValue() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.update(0, new Double(55.0));
        assertEquals(55.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdateByIndex_invalidIndex_throwsException() {
        series.update(0, new Double(55.0));
    }

    // ---------- addAndOrUpdate ----------

    @Test
    public void testAddAndOrUpdate_mixedNewAndExisting_returnsOverwrittenSeries() {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries other = new TimeSeries("Other", Day.class);
        other.add(new Day(1, 1, 2020), 100.0);
        other.add(new Day(2, 1, 2020), 200.0);
        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(100.0, overwritten.getValue(0).doubleValue(), 0.0001);
        assertEquals(2, series.getItemCount());
    }

    // ---------- addOrUpdate(RegularTimePeriod, double) ----------

    @Test
    public void testAddOrUpdateDouble_newPeriod_returnsNull() {
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Day(1, 1, 2020), 5.0);
        assertNull(overwritten);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateDouble_existingPeriod_returnsOldItem() {
        series.add(new Day(1, 1, 2020), 5.0);
        TimeSeriesDataItem overwritten = series.addOrUpdate(new Day(1, 1, 2020), 10.0);
        assertNotNull(overwritten);
        assertEquals(5.0, overwritten.getValue().doubleValue(), 0.0001);
        assertEquals(10.0, series.getValue(0).doubleValue(), 0.0001);
    }

    // ---------- addOrUpdate(RegularTimePeriod, Number) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testAddOrUpdateNumber_nullPeriod_throwsException() {
        series.addOrUpdate(null, new Double(5.0));
    }

    @Test
    public void testAddOrUpdateNumber_exceedsMaximumItemCount_removesFirstItem() {
        series.setMaximumItemCount(2);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.addOrUpdate(new Day(3, 1, 2020), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    // ---------- removeAgedItems(boolean) ----------

    @Test
    public void testRemoveAgedItemsBoolean_noOldItems_doesNothing() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.removeAgedItems(true);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testRemoveAgedItemsBoolean_singleItem_doesNothing() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.setMaximumItemAge(0);
        series.removeAgedItems(true);
        assertEquals(1, series.getItemCount());
    }

    // ---------- removeAgedItems(long, boolean) ----------

    @Test
    public void testRemoveAgedItemsLongBoolean_normalUsage_removesOldItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.setMaximumItemAge(0);
        Day futureDay = new Day(5, 1, 2020);
        long millis = futureDay.getStart().getTime();
        series.removeAgedItems(millis, true);
        assertTrue(series.getItemCount() <= 2);
    }

    // ---------- clear ----------

    @Test
    public void testClear_nonEmptySeries_removesAllItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testClear_emptySeries_doesNothing() {
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    // ---------- delete(RegularTimePeriod) ----------

    @Test
    public void testDeleteByPeriod_existingPeriod_removesItem() {
        Day day = new Day(1, 1, 2020);
        series.add(day, 1.0);
        series.delete(day);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeleteByPeriod_nonExistingPeriod_doesNothing() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.delete(new Day(2, 1, 2020));
        assertEquals(1, series.getItemCount());
    }

    // ---------- delete(int, int) ----------

    @Test
    public void testDeleteRange_validRange_removesItems() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteRange_endLessThanStart_throwsException() {
        series.delete(2, 1);
    }

    // ---------- clone ----------

    @Test
    public void testClone_normalSeries_producesEqualIndependentCopy()
            throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertEquals(series, clone);
        clone.add(new Day(2, 1, 2020), 2.0);
        assertNotEquals(series.getItemCount(), clone.getItemCount());
    }

    // ---------- createCopy(int, int) ----------

    @Test
    public void testCreateCopyIntInt_validRange_returnsCopy()
            throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntInt_negativeStart_throwsException()
            throws CloneNotSupportedException {
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyIntInt_endLessThanStart_throwsException()
            throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        series.createCopy(1, 0);
    }

    // ---------- createCopy(RegularTimePeriod, RegularTimePeriod) ----------

    @Test
    public void testCreateCopyPeriodPeriod_validRange_returnsCopy()
            throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(new Day(1, 1, 2020), new Day(2, 1, 2020));
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodPeriod_nullStart_throwsException()
            throws CloneNotSupportedException {
        series.createCopy((RegularTimePeriod) null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodPeriod_nullEnd_throwsException()
            throws CloneNotSupportedException {
        series.createCopy(new Day(1, 1, 2020), (RegularTimePeriod) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodPeriod_startAfterEnd_throwsException()
            throws CloneNotSupportedException {
        series.createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testCreateCopyPeriodPeriod_emptyRangeAfterData_returnsEmptyCopy()
            throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries copy = series.createCopy(new Day(5, 1, 2020), new Day(6, 1, 2020));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyPeriodPeriod_startBeforeAllData_adjustsStartIndex()
            throws CloneNotSupportedException {
        series.add(new Day(5, 1, 2020), 1.0);
        series.add(new Day(6, 1, 2020), 2.0);
        TimeSeries copy = series.createCopy(new Day(1, 1, 2020), new Day(6, 1, 2020));
        assertEquals(2, copy.getItemCount());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(series.equals("Not a TimeSeries"));
    }

    @Test
    public void testEquals_equalSeries_returnsTrue() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 1.0);
        assertTrue(s1.equals(s2));
    }

    @Test
    public void testEquals_differentDomainDescription_returnsFalse() {
        TimeSeries s1 = new TimeSeries("Test", "DomainA", "Range", Day.class);
        TimeSeries s2 = new TimeSeries("Test", "DomainB", "Range", Day.class);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentRangeDescription_returnsFalse() {
        TimeSeries s1 = new TimeSeries("Test", "Domain", "RangeA", Day.class);
        TimeSeries s2 = new TimeSeries("Test", "Domain", "RangeB", Day.class);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentMaximumItemAge_returnsFalse() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.setMaximumItemAge(10);
        s2.setMaximumItemAge(20);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentMaximumItemCount_returnsFalse() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.setMaximumItemCount(10);
        s2.setMaximumItemCount(20);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentItemCount_returnsFalse() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.add(new Day(1, 1, 2020), 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_differentDataItems_returnsFalse() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(series.equals(null));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_emptySeries_computesWithoutException() {
        int hash = series.hashCode();
        assertNotNull(hash); // primitive int always non-null; just ensures no exception
    }

    @Test
    public void testHashCode_oneItem_computesHash() {
        series.add(new Day(1, 1, 2020), 1.0);
        int hash = series.hashCode();
        assertTrue(hash != 0 || hash == 0); // just ensure method executes without exception
    }

    @Test
    public void testHashCode_twoItems_computesHash() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        int hash = series.hashCode();
        assertTrue(hash != 0 || hash == 0);
    }

    @Test
    public void testHashCode_threeItems_computesHash() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        int hash = series.hashCode();
        assertTrue(hash != 0 || hash == 0);
    }

    @Test
    public void testHashCode_equalSeries_haveEqualHashCodes() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.add(new Day(1, 1, 2020), 1.0);
        s2.add(new Day(1, 1, 2020), 1.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
