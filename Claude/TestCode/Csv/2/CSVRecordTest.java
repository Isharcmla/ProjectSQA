package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CSVRecordTest {

    private Map<String, Integer> createMapping() {
        Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("second", 1);
        mapping.put("third", 2);
        return mapping;
    }

    // ---------- get(int) ----------

    @Test
    public void testGetByIndex_normalInput_returnsCorrectValue() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("a", record.get(0));
        assertEquals("b", record.get(1));
        assertEquals("c", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_indexOutOfBounds_throwsException() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_negativeIndex_throwsException() {
        String[] values = {"a", "b"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get(-1);
    }

    // ---------- get(String) ----------

    @Test
    public void testGetByName_normalInput_returnsCorrectValue() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertEquals("a", record.get("first"));
        assertEquals("b", record.get("second"));
        assertEquals("c", record.get("third"));
    }

    @Test
    public void testGetByName_nameNotInMapping_returnsNull() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertNull(record.get("nonexistent"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByName_noMapping_throwsIllegalStateException() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        record.get("first");
    }

    // ---------- isConsistent ----------

    @Test
    public void testIsConsistent_noMapping_returnsTrue() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mappingSizeMatchesValues_returnsTrue() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mappingSizeMismatch_returnsFalse() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isConsistent());
    }

    // ---------- isMapped ----------

    @Test
    public void testIsMapped_nameExists_returnsTrue() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isMapped("first"));
    }

    @Test
    public void testIsMapped_nameNotExists_returnsFalse() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isMapped("nonexistent"));
    }

    @Test
    public void testIsMapped_noMapping_returnsFalse() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isMapped("first"));
    }

    // ---------- isSet ----------

    @Test
    public void testIsSet_mappedAndWithinValuesLength_returnsTrue() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertTrue(record.isSet("first"));
    }

    @Test
    public void testIsSet_mappedButOutsideValuesLength_returnsFalse() {
        String[] values = {"a", "b"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("third"));
    }

    @Test
    public void testIsSet_notMapped_returnsFalse() {
        String[] values = {"a", "b", "c"};
        Map<String, Integer> mapping = createMapping();
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertFalse(record.isSet("nonexistent"));
    }

    @Test
    public void testIsSet_noMapping_returnsFalse() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertFalse(record.isSet("first"));
    }

    // ---------- iterator ----------

    @Test
    public void testIterator_normalInput_iteratesAllValues() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_emptyValues_hasNoNext() {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        Iterator<String> it = record.iterator();
        assertFalse(it.hasNext());
    }

    // ---------- values() (package-private) ----------

    @Test
    public void testValues_normalInput_returnsSameArray() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(values, record.values());
    }

    @Test
    public void testValues_nullInput_returnsEmptyArray() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.values().length);
    }

    // ---------- getComment ----------

    @Test
    public void testGetComment_normalInput_returnsComment() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, "this is a comment", 1L);
        assertEquals("this is a comment", record.getComment());
    }

    @Test
    public void testGetComment_noComment_returnsNull() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertNull(record.getComment());
    }

    @Test
    public void testGetComment_emptyString_returnsEmptyString() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, "", 1L);
        assertEquals("", record.getComment());
    }

    // ---------- getRecordNumber ----------

    @Test
    public void testGetRecordNumber_normalInput_returnsCorrectNumber() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 5L);
        assertEquals(5L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_zeroValue_returnsZero() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 0L);
        assertEquals(0L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_negativeValue_returnsNegative() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, -1L);
        assertEquals(-1L, record.getRecordNumber());
    }

    // ---------- size ----------

    @Test
    public void testSize_normalInput_returnsCorrectSize() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testSize_emptyValues_returnsZero() {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals(0, record.size());
    }

    @Test
    public void testSize_nullValues_returnsZero() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
    }

    // ---------- toString ----------

    @Test
    public void testToString_normalInput_returnsArrayStringRepresentation() {
        String[] values = {"a", "b", "c"};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[a, b, c]", record.toString());
    }

    @Test
    public void testToString_emptyValues_returnsEmptyArrayString() {
        String[] values = {};
        CSVRecord record = new CSVRecord(values, null, null, 1L);
        assertEquals("[]", record.toString());
    }

    @Test
    public void testToString_nullValues_returnsEmptyArrayString() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals("[]", record.toString());
    }

    // ---------- constructor edge cases ----------

    @Test
    public void testConstructor_withNullValues_usesEmptyArray() {
        CSVRecord record = new CSVRecord(null, null, null, 1L);
        assertEquals(0, record.size());
        assertNotNullValues(record);
    }

    private void assertNotNullValues(CSVRecord record) {
        assertTrue(record.values() != null);
    }
}
