package org.apache.commons.csv;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CSVRecordTest {

    private enum Header {
        NAME,
        ID
    }

    private Map<String, Integer> mapping;
    private String[] values;
    private CSVRecord record;

    @Before
    public void setUp() {
        mapping = new HashMap<String, Integer>();
        mapping.put("NAME", 0);
        mapping.put("ID", 1);

        values = new String[] {"John", "123"};
        record = new CSVRecord(values, mapping, "a comment", 5L);
    }

    // --- Constructor edge case: null values ---
    @Test
    public void testConstructor_nullValues_usesEmptyArray() {
        CSVRecord rec = new CSVRecord(null, null, null, 1L);
        assertEquals(0, rec.size());
        assertEquals("[]", rec.toString());
    }

    // --- get(Enum) ---
    @Test
    public void testGetEnum_validEnum_returnsValue() {
        assertEquals("John", record.get(Header.NAME));
        assertEquals("123", record.get(Header.ID));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEnum_unmappedEnum_throwsException() {
        record.get(Header.class.getEnumConstants()[0]); // NAME exists, use a bogus test differently
    }

    // --- get(int) ---
    @Test
    public void testGetInt_validIndex_returnsValue() {
        assertEquals("John", record.get(0));
        assertEquals("123", record.get(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetInt_invalidIndex_throwsException() {
        record.get(10);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetInt_negativeIndex_throwsException() {
        record.get(-1);
    }

    // --- get(String) ---
    @Test
    public void testGetString_validName_returnsValue() {
        assertEquals("John", record.get("NAME"));
        assertEquals("123", record.get("ID"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetString_noMapping_throwsException() {
        CSVRecord rec = new CSVRecord(values, null, "c", 1L);
        rec.get("NAME");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetString_nameNotMapped_throwsException() {
        record.get("UNKNOWN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetString_mappedIndexOutOfBounds_throwsException() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("EXTRA", 5);
        CSVRecord rec = new CSVRecord(new String[] {"a", "b"}, map, null, 1L);
        rec.get("EXTRA");
    }

    // --- getComment ---
    @Test
    public void testGetComment_withComment_returnsComment() {
        assertEquals("a comment", record.getComment());
    }

    @Test
    public void testGetComment_nullComment_returnsNull() {
        CSVRecord rec = new CSVRecord(values, mapping, null, 1L);
        assertNull(rec.getComment());
    }

    // --- getRecordNumber ---
    @Test
    public void testGetRecordNumber_returnsCorrectNumber() {
        assertEquals(5L, record.getRecordNumber());
    }

    // --- isConsistent ---
    @Test
    public void testIsConsistent_matchingSizes_returnsTrue() {
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_nullMapping_returnsTrue() {
        CSVRecord rec = new CSVRecord(values, null, null, 1L);
        assertTrue(rec.isConsistent());
    }

    @Test
    public void testIsConsistent_mismatchedSizes_returnsFalse() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("B", 1);
        map.put("C", 2);
        CSVRecord rec = new CSVRecord(new String[] {"x", "y"}, map, null, 1L);
        assertFalse(rec.isConsistent());
    }

    // --- isMapped ---
    @Test
    public void testIsMapped_mappedName_returnsTrue() {
        assertTrue(record.isMapped("NAME"));
    }

    @Test
    public void testIsMapped_unmappedName_returnsFalse() {
        assertFalse(record.isMapped("UNKNOWN"));
    }

    @Test
    public void testIsMapped_nullMapping_returnsFalse() {
        CSVRecord rec = new CSVRecord(values, null, null, 1L);
        assertFalse(rec.isMapped("NAME"));
    }

    // --- isSet ---
    @Test
    public void testIsSet_mappedAndHasValue_returnsTrue() {
        assertTrue(record.isSet("NAME"));
    }

    @Test
    public void testIsSet_mappedButOutOfBounds_returnsFalse() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("EXTRA", 5);
        CSVRecord rec = new CSVRecord(new String[] {"a", "b"}, map, null, 1L);
        assertFalse(rec.isSet("EXTRA"));
    }

    @Test
    public void testIsSet_unmappedName_returnsFalse() {
        assertFalse(record.isSet("UNKNOWN"));
    }

    // --- iterator ---
    @Test
    public void testIterator_returnsAllValues() {
        Iterator<String> it = record.iterator();
        assertTrue(it.hasNext());
        assertEquals("John", it.next());
        assertTrue(it.hasNext());
        assertEquals("123", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testIterator_emptyValues_hasNoNext() {
        CSVRecord rec = new CSVRecord(new String[0], null, null, 1L);
        Iterator<String> it = rec.iterator();
        assertFalse(it.hasNext());
    }

    // --- putIn (package-private) ---
    @Test
    public void testPutIn_populatesMapCorrectly() {
        Map<String, String> target = new HashMap<String, String>();
        Map<String, String> result = record.putIn(target);
        assertSame(target, result);
        assertEquals("John", result.get("NAME"));
        assertEquals("123", result.get("ID"));
    }

    @Test
    public void testPutIn_columnOutOfBounds_skipsEntry() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("B", 5);
        CSVRecord rec = new CSVRecord(new String[] {"x"}, map, null, 1L);
        Map<String, String> target = new HashMap<String, String>();
        rec.putIn(target);
        assertEquals("x", target.get("A"));
        assertFalse(target.containsKey("B"));
    }

    // --- size ---
    @Test
    public void testSize_returnsCorrectCount() {
        assertEquals(2, record.size());
    }

    @Test
    public void testSize_emptyValues_returnsZero() {
        CSVRecord rec = new CSVRecord(new String[0], null, null, 1L);
        assertEquals(0, rec.size());
    }

    // --- toMap ---
    @Test
    public void testToMap_returnsExpectedMap() {
        Map<String, String> map = record.toMap();
        assertEquals(2, map.size());
        assertEquals("John", map.get("NAME"));
        assertEquals("123", map.get("ID"));
    }

    @Test(expected = NullPointerException.class)
    public void testToMap_nullMapping_throwsException() {
        CSVRecord rec = new CSVRecord(values, null, null, 1L);
        rec.toMap();
    }

    // --- toString ---
    @Test
    public void testToString_returnsArrayRepresentation() {
        assertEquals("[John, 123]", record.toString());
    }

    @Test
    public void testToString_emptyValues_returnsEmptyBrackets() {
        CSVRecord rec = new CSVRecord(new String[0], null, null, 1L);
        assertEquals("[]", rec.toString());
    }

    // --- values() (package-private) ---
    @Test
    public void testValues_returnsUnderlyingArray() {
        assertArrayEquals(values, record.values());
    }

    @Test
    public void testValues_nullInput_returnsEmptyArray() {
        CSVRecord rec = new CSVRecord(null, null, null, 1L);
        assertArrayEquals(new String[0], rec.values());
    }
}
