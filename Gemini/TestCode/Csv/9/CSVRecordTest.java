package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Test;

public class CSVRecordTest {

    private enum Header {
        FIRST_NAME, LAST_NAME, AGE, NON_EXISTING
    }

    @Test
    public void testConstructor_nullValues_initializesEmptyArray() {
        final CSVRecord record = new CSVRecord(null, null, "a comment", 1L);
        assertEquals(0, record.size());
        assertArrayEquals(new String[0], record.values());
        assertEquals("a comment", record.getComment());
        assertEquals(1L, record.getRecordNumber());
    }

    @Test
    public void testConstructor_normalValues_initializesCorrectly() {
        final String[] values = new String[] { "A", "B", "C" };
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("col1", 0);
        map.put("col2", 1);
        map.put("col3", 2);

        final CSVRecord record = new CSVRecord(values, map, "comment text", 42L);
        assertEquals(3, record.size());
        assertArrayEquals(values, record.values());
        assertEquals("comment text", record.getComment());
        assertEquals(42L, record.getRecordNumber());
    }

    @Test
    public void testGetByIndex_validIndex_returnsValue() {
        final CSVRecord record = new CSVRecord(new String[] { "foo", "bar", "baz" }, null, null, 0L);
        assertEquals("foo", record.get(0));
        assertEquals("bar", record.get(1));
        assertEquals("baz", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_negativeIndex_throwsException() {
        final CSVRecord record = new CSVRecord(new String[] { "foo" }, null, null, 0L);
        record.get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_outOfBoundsIndex_throwsException() {
        final CSVRecord record = new CSVRecord(new String[] { "foo" }, null, null, 0L);
        record.get(1);
    }

    @Test
    public void testGetByName_validName_returnsValue() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("first", 0);
        map.put("second", 1);

        final CSVRecord record = new CSVRecord(new String[] { "alpha", "beta" }, map, null, 0L);
        assertEquals("alpha", record.get("first"));
        assertEquals("beta", record.get("second"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByName_nullMapping_throwsIllegalStateException() {
        final CSVRecord record = new CSVRecord(new String[] { "alpha" }, null, null, 0L);
        record.get("first");
    }

    @Test
    public void testGetByName_unmappedName_throwsIllegalArgumentException() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("first", 0);

        final CSVRecord record = new CSVRecord(new String[] { "alpha" }, map, null, 0L);
        try {
            record.get("unmapped");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Mapping for unmapped not found"));
        }
    }

    @Test
    public void testGetByName_indexOutOfBounds_throwsIllegalArgumentException() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("headerOutOfRange", 5);

        final CSVRecord record = new CSVRecord(new String[] { "alpha" }, map, null, 0L);
        try {
            record.get("headerOutOfRange");
            fail("Expected IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Index for header 'headerOutOfRange' is 5 but CSVRecord only has 1 values!"));
        }
    }

    @Test
    public void testGetByEnum_validEnum_returnsValue() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(Header.FIRST_NAME.toString(), 0);
        map.put(Header.LAST_NAME.toString(), 1);

        final CSVRecord record = new CSVRecord(new String[] { "John", "Doe" }, map, null, 0L);
        assertEquals("John", record.get(Header.FIRST_NAME));
        assertEquals("Doe", record.get(Header.LAST_NAME));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByEnum_unmappedEnum_throwsIllegalArgumentException() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(Header.FIRST_NAME.toString(), 0);

        final CSVRecord record = new CSVRecord(new String[] { "John" }, map, null, 0L);
        record.get(Header.NON_EXISTING);
    }

    @Test
    public void testGetComment_nullAndNonNull() {
        final CSVRecord recordWithNull = new CSVRecord(new String[0], null, null, 0L);
        assertNull(recordWithNull.getComment());

        final CSVRecord recordWithEmpty = new CSVRecord(new String[0], null, "", 0L);
        assertEquals("", recordWithEmpty.getComment());

        final CSVRecord recordWithComment = new CSVRecord(new String[0], null, "# Comment Line", 0L);
        assertEquals("# Comment Line", recordWithComment.getComment());
    }

    @Test
    public void testGetRecordNumber_variousValues() {
        final CSVRecord record0 = new CSVRecord(new String[0], null, null, 0L);
        assertEquals(0L, record0.getRecordNumber());

        final CSVRecord recordNegative = new CSVRecord(new String[0], null, null, -100L);
        assertEquals(-100L, recordNegative.getRecordNumber());

        final CSVRecord recordPositive = new CSVRecord(new String[0], null, null, Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, recordPositive.getRecordNumber());
    }

    @Test
    public void testIsConsistent_nullMapping_returnsTrue() {
        final CSVRecord record = new CSVRecord(new String[] { "a", "b" }, null, null, 0L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_sameSize_returnsTrue() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("B", 1);

        final CSVRecord record = new CSVRecord(new String[] { "val1", "val2" }, map, null, 0L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_differentSize_returnsFalse() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("B", 1);
        map.put("C", 2);

        final CSVRecord record = new CSVRecord(new String[] { "val1" }, map, null, 0L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsMapped_nullMapping_returnsFalse() {
        final CSVRecord record = new CSVRecord(new String[] { "a" }, null, null, 0L);
        assertFalse(record.isMapped("a"));
    }

    @Test
    public void testIsMapped_withMapping() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("present", 0);

        final CSVRecord record = new CSVRecord(new String[] { "a" }, map, null, 0L);
        assertTrue(record.isMapped("present"));
        assertFalse(record.isMapped("absent"));
        assertFalse(record.isMapped(null));
    }

    @Test
    public void testIsSet_nullMapping_returnsFalse() {
        final CSVRecord record = new CSVRecord(new String[] { "a" }, null, null, 0L);
        assertFalse(record.isSet("a"));
    }

    @Test
    public void testIsSet_unmappedName_returnsFalse() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);

        final CSVRecord record = new CSVRecord(new String[] { "val" }, map, null, 0L);
        assertFalse(record.isSet("B"));
    }

    @Test
    public void testIsSet_mappedWithinBounds_returnsTrue() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);

        final CSVRecord record = new CSVRecord(new String[] { "val" }, map, null, 0L);
        assertTrue(record.isSet("A"));
    }

    @Test
    public void testIsSet_mappedOutOfBounds_returnsFalse() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("B", 5);

        final CSVRecord record = new CSVRecord(new String[] { "val" }, map, null, 0L);
        assertTrue(record.isSet("A"));
        assertFalse(record.isSet("B"));
    }

    @Test
    public void testIterator_iteratesOverAllValues() {
        final String[] values = new String[] { "one", "two", "three" };
        final CSVRecord record = new CSVRecord(values, null, null, 0L);

        final List<String> list = new ArrayList<String>();
        for (final String s : record) {
            list.add(s);
        }

        assertEquals(3, list.size());
        assertEquals("one", list.get(0));
        assertEquals("two", list.get(1));
        assertEquals("three", list.get(2));
    }

    @Test
    public void testIterator_emptyArray_hasNoElements() {
        final CSVRecord record = new CSVRecord(new String[0], null, null, 0L);
        final Iterator<String> it = record.iterator();
        assertFalse(it.hasNext());
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (final NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testPutIn_partiallyPopulatedAndOutOfBounds() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("col1", 0);
        mapping.put("col2", 1);
        mapping.put("col3", 5); // index out of bounds for values length 2

        final CSVRecord record = new CSVRecord(new String[] { "v1", "v2" }, mapping, null, 0L);
        final Map<String, String> targetMap = new HashMap<String, String>();
        final Map<String, String> result = record.putIn(targetMap);

        assertEquals(2, result.size());
        assertEquals("v1", result.get("col1"));
        assertEquals("v2", result.get("col2"));
        assertFalse(result.containsKey("col3"));
    }

    @Test
    public void testToMap_fullMapping_returnsMappedEntries() {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("first", 0);
        mapping.put("second", 1);

        final CSVRecord record = new CSVRecord(new String[] { "val1", "val2" }, mapping, null, 0L);
        final Map<String, String> map = record.toMap();

        assertEquals(2, map.size());
        assertEquals("val1", map.get("first"));
        assertEquals("val2", map.get("second"));
    }

    @Test
    public void testToMap_emptyMapping_returnsEmptyMap() {
        final CSVRecord record = new CSVRecord(new String[] { "val1" }, Collections.<String, Integer>emptyMap(), null, 0L);
        final Map<String, String> map = record.toMap();
        assertTrue(map.isEmpty());
    }

    @Test(expected = NullPointerException.class)
    public void testToMap_nullMapping_throwsNullPointerException() {
        final CSVRecord record = new CSVRecord(new String[] { "val1" }, null, null, 0L);
        record.toMap();
    }

    @Test
    public void testSize_variousLengths() {
        final CSVRecord empty = new CSVRecord(new String[0], null, null, 0L);
        assertEquals(0, empty.size());

        final CSVRecord single = new CSVRecord(new String[] { "a" }, null, null, 0L);
        assertEquals(1, single.size());

        final CSVRecord multiple = new CSVRecord(new String[] { "a", "b", "c", "d" }, null, null, 0L);
        assertEquals(4, multiple.size());
    }

    @Test
    public void testToString_returnsArraysToStringRepresentation() {
        final CSVRecord record = new CSVRecord(new String[] { "a", "b", "c" }, null, null, 0L);
        assertEquals("[a, b, c]", record.toString());

        final CSVRecord empty = new CSVRecord(new String[0], null, null, 0L);
        assertEquals("[]", empty.toString());
    }

    @Test
    public void testValues_returnsUnderlyingArray() {
        final String[] raw = new String[] { "x", "y" };
        final CSVRecord record = new CSVRecord(raw, null, null, 0L);
        assertArrayEquals(raw, record.values());
    }

    @Test
    public void testSerialization() throws Exception {
        final Map<String, Integer> mapping = new HashMap<String, Integer>();
        mapping.put("header", 0);

        final CSVRecord original = new CSVRecord(new String[] { "value" }, mapping, "test comment", 100L);

        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.flush();

        final ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        final ObjectInputStream ois = new ObjectInputStream(bais);
        final CSVRecord deserialized = (CSVRecord) ois.readObject();

        assertNotNull(deserialized);
        assertEquals(original.getComment(), deserialized.getComment());
        assertEquals(original.getRecordNumber(), deserialized.getRecordNumber());
        assertEquals(original.size(), deserialized.size());
        assertEquals(original.get(0), deserialized.get(0));
        assertEquals(original.get("header"), deserialized.get("header"));
        assertEquals(original.isConsistent(), deserialized.isConsistent());
        assertEquals(original.toString(), deserialized.toString());
    }
}
