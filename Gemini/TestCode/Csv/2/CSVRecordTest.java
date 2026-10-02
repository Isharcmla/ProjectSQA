package org.apache.commons.csv;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class CSVRecordTest {

    private String[] values;
    private Map<String, Integer> headerMap;
    private CSVRecord recordWithHeader;
    private CSVRecord recordWithoutHeader;

    @Before
    public void setUp() {
        values = new String[]{"first", "second", "third"};
        headerMap = new HashMap<String, Integer>();
        headerMap.put("A", 0);
        headerMap.put("B", 1);
        headerMap.put("C", 2);

        recordWithHeader = new CSVRecord(values, headerMap, "comment text", 1L);
        recordWithoutHeader = new CSVRecord(values, null, null, 0L);
    }

    @Test
    public void testConstructor_nullValues_initializesWithEmptyArray() {
        CSVRecord record = new CSVRecord(null, null, null, 0L);
        assertEquals(0, record.size());
        assertNotNull(record.values());
        assertEquals(0, record.values().length);
    }

    @Test
    public void testGetByIndex_validIndex_returnsCorrectValue() {
        assertEquals("first", recordWithHeader.get(0));
        assertEquals("second", recordWithHeader.get(1));
        assertEquals("third", recordWithHeader.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_negativeIndex_throwsArrayIndexOutOfBoundsException() {
        recordWithHeader.get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_indexOutOfBounds_throwsArrayIndexOutOfBoundsException() {
        recordWithHeader.get(3);
    }

    @Test
    public void testGetByName_existingColumn_returnsCorrectValue() {
        assertEquals("first", recordWithHeader.get("A"));
        assertEquals("second", recordWithHeader.get("B"));
        assertEquals("third", recordWithHeader.get("C"));
    }

    @Test
    public void testGetByName_nonExistingColumn_returnsNull() {
        assertNull(recordWithHeader.get("D"));
        assertNull(recordWithHeader.get(""));
        assertNull(recordWithHeader.get(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByName_nullMapping_throwsIllegalStateException() {
        recordWithoutHeader.get("A");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByName_indexMappedBeyondArrayLength_throwsArrayIndexOutOfBoundsException() {
        Map<String, Integer> inconsistentMap = new HashMap<String, Integer>();
        inconsistentMap.put("OutRange", 5);
        CSVRecord record = new CSVRecord(new String[]{"val1"}, inconsistentMap, null, 1L);
        record.get("OutRange");
    }

    @Test
    public void testIsConsistent_nullMapping_returnsTrue() {
        assertTrue(recordWithoutHeader.isConsistent());
    }

    @Test
    public void testIsConsistent_matchingSize_returnsTrue() {
        assertTrue(recordWithHeader.isConsistent());
    }

    @Test
    public void testIsConsistent_mismatchedSize_returnsFalse() {
        Map<String, Integer> shortMap = new HashMap<String, Integer>();
        shortMap.put("A", 0);
        CSVRecord record = new CSVRecord(values, shortMap, null, 1L);
        assertFalse(record.isConsistent());
    }

    @Test
    public void testIsConsistent_emptyRecordAndEmptyMapping_returnsTrue() {
        CSVRecord record = new CSVRecord(new String[0], Collections.<String, Integer>emptyMap(), null, 0L);
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsMapped_nullMapping_returnsFalse() {
        assertFalse(recordWithoutHeader.isMapped("A"));
        assertFalse(recordWithoutHeader.isMapped(null));
    }

    @Test
    public void testIsMapped_withMapping_returnsTrueIfPresentOtherwiseFalse() {
        assertTrue(recordWithHeader.isMapped("A"));
        assertTrue(recordWithHeader.isMapped("B"));
        assertTrue(recordWithHeader.isMapped("C"));
        assertFalse(recordWithHeader.isMapped("NonExistent"));
        assertFalse(recordWithHeader.isMapped(null));
    }

    @Test
    public void testIsSet_nullMapping_returnsFalse() {
        assertFalse(recordWithoutHeader.isSet("A"));
    }

    @Test
    public void testIsSet_mappedAndValidIndex_returnsTrue() {
        assertTrue(recordWithHeader.isSet("A"));
        assertTrue(recordWithHeader.isSet("B"));
        assertTrue(recordWithHeader.isSet("C"));
    }

    @Test
    public void testIsSet_unmappedColumn_returnsFalse() {
        assertFalse(recordWithHeader.isSet("Unknown"));
    }

    @Test
    public void testIsSet_mappedIndexOutOfBounds_returnsFalse() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 0);
        map.put("B", 10);
        CSVRecord record = new CSVRecord(new String[]{"onlyOne"}, map, null, 1L);
        assertTrue(record.isSet("A"));
        assertFalse(record.isSet("B"));
    }

    @Test
    public void testIterator_iteratesAllElementsInOrder() {
        Iterator<String> iterator = recordWithHeader.iterator();
        assertNotNull(iterator);
        assertTrue(iterator.hasNext());
        assertEquals("first", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("second", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("third", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextAfterEnd_throwsNoSuchElementException() {
        Iterator<String> iterator = new CSVRecord(new String[0], null, null, 0L).iterator();
        assertFalse(iterator.hasNext());
        iterator.next();
    }

    @Test
    public void testValues_returnsUnderlyingArray() {
        assertArrayEquals(values, recordWithHeader.values());
        assertArrayEquals(new String[0], new CSVRecord(null, null, null, 0L).values());
    }

    @Test
    public void testGetComment_returnsProvidedComment() {
        assertEquals("comment text", recordWithHeader.getComment());
        assertNull(recordWithoutHeader.getComment());
        CSVRecord emptyCommentRecord = new CSVRecord(values, headerMap, "", 1L);
        assertEquals("", emptyCommentRecord.getComment());
    }

    @Test
    public void testGetRecordNumber_returnsCorrectNumber() {
        assertEquals(1L, recordWithHeader.getRecordNumber());
        assertEquals(0L, recordWithoutHeader.getRecordNumber());
        CSVRecord negativeRecord = new CSVRecord(values, null, null, -100L);
        assertEquals(-100L, negativeRecord.getRecordNumber());
        CSVRecord maxLongRecord = new CSVRecord(values, null, null, Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, maxLongRecord.getRecordNumber());
    }

    @Test
    public void testSize_returnsCorrectNumberOfValues() {
        assertEquals(3, recordWithHeader.size());
        assertEquals(0, new CSVRecord(new String[0], null, null, 0L).size());
        assertEquals(0, new CSVRecord(null, null, null, 0L).size());
    }

    @Test
    public void testToString_returnsCorrectStringRepresentation() {
        assertEquals("[first, second, third]", recordWithHeader.toString());
        assertEquals("[]", new CSVRecord(new String[0], null, null, 0L).toString());
        assertEquals("[]", new CSVRecord(null, null, null, 0L).toString());
    }

    @Test
    public void testSerialization_preservesState() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(recordWithHeader);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CSVRecord deserialized = (CSVRecord) ois.readObject();
        ois.close();

        assertEquals(recordWithHeader.getRecordNumber(), deserialized.getRecordNumber());
        assertEquals(recordWithHeader.getComment(), deserialized.getComment());
        assertEquals(recordWithHeader.size(), deserialized.size());
        assertEquals(recordWithHeader.get("A"), deserialized.get("A"));
        assertEquals(recordWithHeader.get(0), deserialized.get(0));
        assertEquals(recordWithHeader.toString(), deserialized.toString());
    }
}
