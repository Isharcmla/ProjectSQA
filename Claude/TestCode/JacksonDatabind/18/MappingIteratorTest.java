package com.fasterxml.jackson.databind;

import java.io.IOException;
import java.util.*;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.FormatSchema;

/**
 * JUnit 4 test suite for {@link MappingIterator}.
 *
 * Tests use the real Jackson databind {@link ObjectMapper} API (no mocking)
 * to obtain actual {@link MappingIterator} instances, since its constructor
 * is protected and only accessible via package-internal factory methods
 * such as {@code ObjectMapper.readValues(...)}.
 */
public class MappingIteratorTest
{
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------------------------------------------------------------
    // hasNext() / next() - normal cases
    // ---------------------------------------------------------------

    @Test
    public void testHasNext_withNonEmptyArray_returnsTrue() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
        assertTrue(it.hasNext());
    }

    @Test
    public void testHasNext_withEmptyArray_returnsFalse() throws Exception {
        String json = "[]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
        assertFalse(it.hasNext());
        // parser reference should have been nulled out internally
        assertNull(it.getParser());
    }

    @Test
    public void testNext_iteratesAllElements_returnsCorrectValues() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        List<Integer> result = new ArrayList<Integer>();
        while (it.hasNext()) {
            result.add(it.next());
        }
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testNext_afterExhausted_throwsNoSuchElementException() throws Exception {
        String json = "[1]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(1), it.next());
        assertFalse(it.hasNext());

        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // hasNextValue() / nextValue() explicit coverage
    // ---------------------------------------------------------------

    @Test
    public void testHasNextValue_andNextValue_matchHasNextNext() throws Exception {
        String json = "[10,20]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertTrue(it.hasNextValue());
        assertEquals(Integer.valueOf(10), it.nextValue());
        assertTrue(it.hasNextValue());
        assertEquals(Integer.valueOf(20), it.nextValue());
        assertFalse(it.hasNextValue());
    }

    @Test
    public void testNextValue_afterExhausted_throwsNoSuchElementException() throws Exception {
        String json = "[]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        try {
            it.nextValue();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
            // expected
        }
    }

    // ---------------------------------------------------------------
    // readAll() variants
    // ---------------------------------------------------------------

    @Test
    public void testReadAll_noArg_returnsListOfAllElements() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        List<Integer> result = it.readAll();
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    public void testReadAllWithList_populatesGivenList() throws Exception {
        String json = "[4,5,6]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> returned = it.readAll(list);

        assertSame(list, returned);
        assertEquals(Arrays.asList(4, 5, 6), returned);
    }

    @Test
    public void testReadAllWithCollection_populatesGivenCollection() throws Exception {
        String json = "[7,8,9]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        // HashSet is a Collection but not a List, forcing selection
        // of the Collection<? super T> overload of readAll().
        HashSet<Integer> set = new HashSet<Integer>();
        Collection<Integer> returned = it.readAll(set);

        assertSame(set, returned);
        assertTrue(returned.containsAll(Arrays.asList(7, 8, 9)));
        assertEquals(3, returned.size());
    }

    @Test
    public void testReadAll_onEmptyIterator_returnsEmptyList() throws Exception {
        String json = "[]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        List<Integer> result = it.readAll();
        assertTrue(result.isEmpty());
    }

    // ---------------------------------------------------------------
    // remove()
    // ---------------------------------------------------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_throwsUnsupportedOperationException() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
        it.remove();
    }

    // ---------------------------------------------------------------
    // close()
    // ---------------------------------------------------------------

    @Test
    public void testClose_doesNotThrowException() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
        it.close(); // should not throw
    }

    @Test
    public void testClose_afterExhaustion_doesNotThrowException() throws Exception {
        String json = "[]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);
        assertFalse(it.hasNext());
        // internal parser already null after exhaustion; close() should be a no-op
        it.close();
    }

    // ---------------------------------------------------------------
    // getParser() / getParserSchema() / getCurrentLocation()
    // ---------------------------------------------------------------

    @Test
    public void testGetParser_returnsNonNullBeforeExhaustion_andNullAfter() throws Exception {
        String json = "[1]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertNotNull(it.getParser());
        assertTrue(it.hasNext());
        it.next();
        assertFalse(it.hasNext());
        assertNull(it.getParser());
    }

    @Test
    public void testGetParserSchema_returnsSchemaOrNullWithoutException() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        FormatSchema schema = it.getParserSchema();
        // Basic JsonFactory does not use a schema, so null is expected,
        // but the important part is that no exception is thrown.
        assertNull(schema);
    }

    @Test
    public void testGetCurrentLocation_returnsNonNullLocation() throws Exception {
        String json = "[1,2,3]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        JsonLocation loc = it.getCurrentLocation();
        assertNotNull(loc);
    }

    // ---------------------------------------------------------------
    // Edge cases: malformed input / type mismatch (exception paths)
    // ---------------------------------------------------------------

    @Test
    public void testHasNext_withMalformedJson_throwsRuntimeException() throws Exception {
        // Malformed JSON: array opened, one value, then abrupt end-of-input.
        String json = "[1,";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(1), it.next());

        try {
            it.hasNext();
            fail("Expected RuntimeException due to malformed JSON input");
        } catch (RuntimeException expected) {
            // expected - underlying IOException wrapped by _handleIOException
        }
    }

    @Test(expected = RuntimeJsonMappingException.class)
    public void testNext_withTypeMismatch_throwsRuntimeJsonMappingException() throws Exception {
        // "abc" cannot be converted to an Integer -> JsonMappingException
        // wrapped into RuntimeJsonMappingException by next().
        String json = "[\"abc\"]";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertTrue(it.hasNext());
        it.next();
    }

    // ---------------------------------------------------------------
    // Edge case: single (unwrapped) value, not inside a JSON array
    // ---------------------------------------------------------------

    @Test
    public void testNext_singleUnwrappedValue_readsCorrectly() throws Exception {
        String json = "123";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(123), it.next());
        assertFalse(it.hasNext());
    }

    // ---------------------------------------------------------------
    // Edge case: empty string / no tokens at all
    // ---------------------------------------------------------------

    @Test
    public void testHasNext_withEmptyInput_returnsFalse() throws Exception {
        String json = "";
        JsonParser p = mapper.getFactory().createParser(json);
        MappingIterator<Integer> it = mapper.readValues(p, Integer.class);

        assertFalse(it.hasNext());
        assertNull(it.getParser());
    }
}
