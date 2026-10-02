package org.apache.commons.csv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CSVRecordTest {

    private enum Header {
        A, B, C
    }

    private String[] values;
    private Map<String, Integer> mapping;

    @Before
    public void setUp() {
        values = new String[] { "value1", "value2", "value3" };
        mapping = new HashMap<String, Integer>();
        mapping.put("A", 0);
        mapping.put("B", 1);
        mapping.put("C", 2);
    }

    // ---------- Constructor / values() ----------

    @Test
    public void testConstructor_withNullValues_usesEmptyArray() {
        CSVRecord record = new CSVRecord(null, mapping, "comment", 1L);
        assertEquals(0, record.size());
        assertNotNull(record.values());
        assertEquals(0, record.values().length);
    }

    @Test
    public void testValues_normalInput_returnsSameArray() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertTrue(record.values() == values);
    }

    // ---------- get(int) ----------

    @Test
    public void testGetInt_validIndex_returnsValue() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertEquals("value1", record.get(0));
        assertEquals("value3", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetInt_negativeIndex_throwsException() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        record.get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetInt_indexOutOfBounds_throwsException() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        record.get(10);
    }

    // ---------- get(String) ----------

    @Test
    public void testGetString_validName_returnsValue() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertEquals("value1", record.get("A"));
        assertEquals("value2", record.get("B"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetString_nullMapping_throwsIllegalStateException() {
        CSVRecord record = new CSVRecord(values, null, "comment", 1L);
        record.get("A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetString_nameNotMapped_throwsIllegalArgumentException() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        record.get("NON_EXISTENT");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetString_indexOutOfBounds_throwsIllegalArgumentException() {
        String[] shortValues = new String[] { "value1" };
        CSVRecord record = new CSVRecord(shortValues, mapping, "comment", 1L);
        // mapping has "C" -> 2, but values only has length 1
        record.get("C");
    }

    // ---------- get(Enum) ----------

    @Test
    public void testGetEnum_validEnum_returnsValue() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertEquals("value1", record.get(Header.A));
        assertEquals("value2", record.get(Header.B));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEnum_enumNotMapped_throwsIllegalArgumentException() {
        String[] shortValues = new String[] { "value1", "value2", "value3" };
        Map<String, Integer> smallMapping = new HashMap<String, Integer>();
        smallMapping.put("A", 0);
        CSVRecord record = new CSVRecord(shortValues, smallMapping, "comment", 1L);
        record.get(Header.B);
    }

    // ---------- getComment() ----------

    @Test
    public void testGetComment_withComment_returnsComment() {
        CSVRecord record = new CSVRecord(values, mapping, "this is a comment", 1L);
        assertEquals("this is a comment", record.getComment());
    }

    @Test
    public void testGetComment_nullComment_returnsNull() {
        CSVRecord record = new CSVRecord(values, mapping, null, 1L);
        assertNull(record.getComment());
    }

    // ---------- getRecordNumber() ----------

    @Test
    public void testGetRecordNumber_normalValue_returnsCorrectNumber() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 42L);
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testGetRecordNumber_zeroValue_returnsZero() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 0L);
        assertEquals(0L, record.getRecordNumber());
    }

    // ---------- isConsistent() ----------

    @Test
    public void testIsConsistent_nullMapping_returnsTrue() {
        CSVRecord record = new CSVRecord(values, null, "comment", 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mappingSizeMatchesValues_returnsTrue() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mappingSizeDoesNotMatchValues_returnsFalse() {
        String[] shortValues = new String[] { "value1" };
        CSVRecord record = new CSVRecord(shortValues, mapping, "comment", 1L);
        assertFalse(record.isConsistent());
    }

    // ---------- isMapped() ----------

    @Test
    public void testIsMapped_nameExists_returnsTrue() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertTrue(record.isMapped("A"));
    }

    @Test
    public void testIsMapped_nameDoesNotExist_returnsFalse() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertFalse(record.isMapped("NON_EXISTENT"));
    }

    @Test
    public void testIsMapped_nullMapping_returnsFalse() {
        CSVRecord record = new CSVRecord(values, null, "comment", 1L);
        assertFalse(record.isMapped("A"));
    }

    // ---------- isSet() ----------

    @Test
    public void testIsSet_mappedAndHasValue_returnsTrue() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertTrue(record.isSet("A"));
    }

    @Test
    public void testIsSet_mappedButNoValue_returnsFalse() {
        String[] shortValues = new String[] { "value1" };
        CSVRecord record = new CSVRecord(shortValues, mapping, "comment", 1L);
        assertFalse(record.isSet("C"));
    }

    @Test
    public void testIsSet_notMapped_returnsFalse() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertFalse(record.isSet("NON_EXISTENT"));
    }

    // ---------- iterator() ----------

    @Test
    public void testIterator_normalValues_iteratesAllValues() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("value1", it.next());
        assertEquals("value2", it.next());
        assertEquals("value3", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_emptyValues_hasNoNext() {
        CSVRecord record = new CSVRecord(new String[0], mapping, "comment", 1L);
        Iterator<String> it = record.iterator();
        assertFalse(it.hasNext());
    }

    // ---------- size() ----------

    @Test
    public void testSize_normalValues_returnsCorrectSize() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        assertEquals(3, record.size());
    }

    @Test
    public void testSize_emptyValues_returnsZero() {
        CSVRecord record = new CSVRecord(new String[0], mapping, "comment", 1L);
        assertEquals(0, record.size());
    }

    // ---------- putIn() ----------

    @Test
    public void testPutIn_normalMapping_populatesMap() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> result = record.putIn(map);
        assertTrue(result == map);
        assertEquals("value1", result.get("A"));
        assertEquals("value2", result.get("B"));
        assertEquals("value3", result.get("C"));
    }

    // ---------- toMap() ----------

    @Test
    public void testToMap_normalValues_returnsCorrectMap() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        Map<String, String> map = record.toMap();
        assertEquals(3, map.size());
        assertEquals("value1", map.get("A"));
        assertEquals("value2", map.get("B"));
        assertEquals("value3", map.get("C"));
    }

    @Test
    public void testToMap_emptyMapping_returnsEmptyMap() {
        Map<String, Integer> emptyMapping = new HashMap<String, Integer>();
        CSVRecord record = new CSVRecord(values, emptyMapping, "comment", 1L);
        Map<String, String> map = record.toMap();
        assertTrue(map.isEmpty());
    }

    // ---------- toString() ----------

    @Test
    public void testToString_normalValues_returnsStringRepresentation() {
        CSVRecord record = new CSVRecord(values, mapping, "comment", 1L);
        String result = record.toString();
        assertEquals("[value1, value2, value3]", result);
    }

    @Test
    public void testToString_emptyValues_returnsEmptyBrackets() {
        CSVRecord record = new CSVRecord(new String[0], mapping, "comment", 1L);
        String result = record.toString();
        assertEquals("[]", result);
    }
}
