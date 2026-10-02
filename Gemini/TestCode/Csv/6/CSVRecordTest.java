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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class CSVRecordTest {

    private enum Header {
        FIRST_NAME, LAST_NAME, AGE
    }

    private String[] values;
    private Map<String, Integer> headerMap;
    private CSVRecord record;
    private String comment;
    private long recordNumber;

    @Before
    public void setUp() {
        values = new String[]{"John", "Doe", "30"};
        headerMap = new HashMap<String, Integer>();
        headerMap.put("FIRST_NAME", 0);
        headerMap.put("LAST_NAME", 1);
        headerMap.put("AGE", 2);
        comment = "Test comment";
        recordNumber = 1L;
        record = new CSVRecord(values, headerMap, comment, recordNumber);
    }

    @Test
    public void testConstructor_withNullValues_initializesEmptyArray() {
        CSVRecord rec = new CSVRecord(null, headerMap, comment, 0L);
        assertEquals(0, rec.size());
        assertNotNull(rec.values());
        assertEquals(0, rec.values().length);
    }

    @Test
    public void testGetByIndex_validIndices_returnsCorrectValues() {
        assertEquals("John", record.get(0));
        assertEquals("Doe", record.get(1));
        assertEquals("30", record.get(2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_negativeIndex_throwsException() {
        record.get(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetByIndex_outOfBoundsIndex_throwsException() {
        record.get(3);
    }

    @Test
    public void testGetByEnum_validEnum_returnsCorrectValue() {
        assertEquals("John", record.get(Header.FIRST_NAME));
        assertEquals("Doe", record.get(Header.LAST_NAME));
        assertEquals("30", record.get(Header.AGE));
    }

    @Test
    public void testGetByName_validName_returnsCorrectValue() {
        assertEquals("John", record.get("FIRST_NAME"));
        assertEquals("Doe", record.get("LAST_NAME"));
        assertEquals("30", record.get("AGE"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetByName_nullMapping_throwsIllegalStateException() {
        CSVRecord rec = new CSVRecord(values, null, comment, recordNumber);
        rec.get("FIRST_NAME");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByName_unmappedName_throwsIllegalArgumentException() {
        record.get("NON_EXISTING_HEADER");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetByName_indexOutOfBoundsInMapping_throwsIllegalArgumentException() {
        Map<String, Integer> inconsistentMap = new HashMap<String, Integer>();
        inconsistentMap.put("FIRST_NAME", 0);
        inconsistentMap.put("OUT_OF_BOUNDS", 10);
        CSVRecord rec = new CSVRecord(values, inconsistentMap, comment, recordNumber);
        rec.get("OUT_OF_BOUNDS");
    }

    @Test
    public void testGetComment_returnsComment() {
        assertEquals(comment, record.getComment());

        CSVRecord recNoComment = new CSVRecord(values, headerMap, null, recordNumber);
        assertNull(recNoComment.getComment());
    }

    @Test
    public void testGetRecordNumber_returnsRecordNumber() {
        assertEquals(1L, record.getRecordNumber());

        CSVRecord recNegative = new CSVRecord(values, headerMap, comment, -5L);
        assertEquals(-5L, recNegative.getRecordNumber());
    }

    @Test
    public void testIsConsistent_nullMapping_returnsTrue() {
        CSVRecord rec = new CSVRecord(values, null, comment, recordNumber);
        assertTrue(rec.isConsistent());
    }

    @Test
    public void testIsConsistent_matchingSize_returnsTrue() {
        assertTrue(record.isConsistent());
    }

    @Test
    public void testIsConsistent_mismatchedSize_returnsFalse() {
        Map<String, Integer> smallMap = new HashMap<String, Integer>();
        smallMap.put("FIRST_NAME", 0);
        CSVRecord rec = new CSVRecord(values, smallMap, comment, recordNumber);
        assertFalse(rec.isConsistent());
    }

    @Test
    public void testIsMapped_nullMapping_returnsFalse() {
        CSVRecord rec = new CSVRecord(values, null, comment, recordNumber);
        assertFalse(rec.isMapped("FIRST_NAME"));
    }

    @Test
    public void testIsMapped_mappedAndUnmappedNames() {
        assertTrue(record.isMapped("FIRST_NAME"));
        assertTrue(record.isMapped("LAST_NAME"));
        assertTrue(record.isMapped("AGE"));
        assertFalse(record.isMapped("ADDRESS"));
        assertFalse(record.isMapped(null));
    }

    @Test
    public void testIsSet_nullMapping_returnsFalse() {
        CSVRecord rec = new CSVRecord(values, null, comment, recordNumber);
        assertFalse(rec.isSet("FIRST_NAME"));
    }

    @Test
    public void testIsSet_validAndInvalidCases() {
        assertTrue(record.isSet("FIRST_NAME"));
        assertTrue(record.isSet("LAST_NAME"));
        assertTrue(record.isSet("AGE"));
        assertFalse(record.isSet("UNKNOWN"));

        Map<String, Integer> extendedMap = new HashMap<String, Integer>(headerMap);
        extendedMap.put("OUT_OF_BOUNDS", 5);
        CSVRecord rec = new CSVRecord(values, extendedMap, comment, recordNumber);
        assertTrue(rec.isSet("FIRST_NAME"));
        assertFalse(rec.isSet("OUT_OF_BOUNDS"));
    }

    @Test
    public void testIterator_iteratesAllElements() {
        Iterator<String> it = record.iterator();
        assertNotNull(it);
        List<String> actual = new ArrayList<String>();
        while (it.hasNext()) {
            actual.add(it.next());
        }
        assertEquals(3, actual.size());
        assertEquals("John", actual.get(0));
        assertEquals("Doe", actual.get(1));
        assertEquals("30", actual.get(2));
    }

    @Test(expected = NoSuchElementException.class)
    public void testIterator_nextBeyondEnd_throwsException() {
        CSVRecord emptyRecord = new CSVRecord(new String[0], null, null, 0L);
        Iterator<String> it = emptyRecord.iterator();
        assertFalse(it.hasNext());
        it.next();
    }

    @Test
    public void testPutIn_populatesTargetMap() {
        Map<String, String> targetMap = new TreeMap<String, String>();
        Map<String, String> returnedMap = record.putIn(targetMap);

        assertEquals(targetMap, returnedMap);
        assertEquals(3, targetMap.size());
        assertEquals("John", targetMap.get("FIRST_NAME"));
        assertEquals("Doe", targetMap.get("LAST_NAME"));
        assertEquals("30", targetMap.get("AGE"));
    }

    @Test
    public void testSize_returnsCorrectSize() {
        assertEquals(3, record.size());

        CSVRecord emptyRecord = new CSVRecord(new String[0], null, null, 0L);
        assertEquals(0, emptyRecord.size());
    }

    @Test
    public void testToMap_returnsMapWithValues() {
        Map<String, String> map = record.toMap();
        assertNotNull(map);
        assertEquals(3, map.size());
        assertEquals("John", map.get("FIRST_NAME"));
        assertEquals("Doe", map.get("LAST_NAME"));
        assertEquals("30", map.get("AGE"));
    }

    @Test(expected = NullPointerException.class)
    public void testToMap_nullMapping_throwsNullPointerException() {
        CSVRecord rec = new CSVRecord(values, null, comment, recordNumber);
        rec.toMap();
    }

    @Test
    public void testToString_returnsArrayRepresentation() {
        assertEquals("[John, Doe, 30]", record.toString());

        CSVRecord emptyRecord = new CSVRecord(new String[0], null, null, 0L);
        assertEquals("[]", emptyRecord.toString());
    }

    @Test
    public void testValues_returnsValuesArray() {
        String[] actualValues = record.values();
        assertArrayEquals(values, actualValues);
    }

    @Test
    public void testSerialization() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(record);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CSVRecord deserialized = (CSVRecord) ois.readObject();
        ois.close();

        assertEquals(record.size(), deserialized.size());
        assertEquals(record.getComment(), deserialized.getComment());
        assertEquals(record.getRecordNumber(), deserialized.getRecordNumber());
        assertEquals(record.get("FIRST_NAME"), deserialized.get("FIRST_NAME"));
        assertEquals(record.get("LAST_NAME"), deserialized.get("LAST_NAME"));
        assertEquals(record.get("AGE"), deserialized.get("AGE"));
    }

    @Test
    public void testEdgeCase_emptyStringsAndNullElementsInValues() {
        String[] specialValues = new String[]{"", null, "   "};
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("EMPTY", 0);
        map.put("NULL", 1);
        map.put("WHITESPACE", 2);

        CSVRecord rec = new CSVRecord(specialValues, map, "", 0L);
        assertEquals("", rec.get("EMPTY"));
        assertNull(rec.get("NULL"));
        assertEquals("   ", rec.get("WHITESPACE"));
        assertTrue(rec.isSet("NULL"));
        assertEquals("", rec.getComment());
    }
}
