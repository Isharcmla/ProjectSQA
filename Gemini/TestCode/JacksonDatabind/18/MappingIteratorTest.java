package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.RuntimeJsonMappingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class MappingIteratorTest {

    private final ObjectMapper mapper = new ObjectMapper();

    public static class SampleBean {
        public int id;
        public String name;

        public SampleBean() {}

        public SampleBean(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    @Test
    public void testEmptyIterator_emptyInstanceBehavior() throws IOException {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        Assert.assertFalse(it.hasNext());
        Assert.assertFalse(it.hasNextValue());
        Assert.assertNull(it.getParser());
        it.close();

        try {
            it.next();
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }

        try {
            it.nextValue();
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testRemove_throwsUnsupportedOperationException() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("1 2 3");
        try {
            it.remove();
            Assert.fail("Expected UnsupportedOperationException on remove()");
        } catch (UnsupportedOperationException e) {
            // expected
        } finally {
            it.close();
        }
    }

    @Test
    public void testIteration_arrayWrappedSequence_success() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("[10, 20, 30]");
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Integer.valueOf(10), it.next());
        Assert.assertTrue(it.hasNextValue());
        Assert.assertEquals(Integer.valueOf(20), it.nextValue());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals(Integer.valueOf(30), it.next());

        Assert.assertFalse(it.hasNext());
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testIteration_unwrappedSequence_success() throws IOException {
        MappingIterator<String> it = mapper.readerFor(String.class).readValues("\"foo\" \"bar\" \"baz\"");
        Assert.assertTrue(it.hasNextValue());
        Assert.assertEquals("foo", it.nextValue());
        Assert.assertTrue(it.hasNextValue());
        Assert.assertEquals("bar", it.nextValue());
        Assert.assertTrue(it.hasNextValue());
        Assert.assertEquals("baz", it.nextValue());
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testNextValue_calledDirectlyWithoutHasNext() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("100 200");
        Assert.assertEquals(Integer.valueOf(100), it.nextValue());
        Assert.assertEquals(Integer.valueOf(200), it.nextValue());

        try {
            it.nextValue();
            Assert.fail("Expected NoSuchElementException when reading beyond end");
        } catch (NoSuchElementException e) {
            // expected
        }
        it.close();
    }

    @Test
    public void testReadAll_defaultArrayList_returnsAllElements() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("[1, 2, 3, 4, 5]");
        List<Integer> list = it.readAll();
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(Integer.valueOf(1), list.get(0));
        Assert.assertEquals(Integer.valueOf(5), list.get(4));
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testReadAll_customList_appendsElements() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("[10, 20]");
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        List<Integer> returnedList = it.readAll(list);
        Assert.assertSame(list, returnedList);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(Integer.valueOf(0), list.get(0));
        Assert.assertEquals(Integer.valueOf(10), list.get(1));
        Assert.assertEquals(Integer.valueOf(20), list.get(2));
        it.close();
    }

    @Test
    public void testReadAll_customCollection_appendsElements() throws IOException {
        MappingIterator<String> it = mapper.readerFor(String.class).readValues("[\"a\", \"b\", \"a\"]");
        Set<String> set = new HashSet<String>();
        Set<String> returnedSet = it.readAll(set);
        Assert.assertSame(set, returnedSet);
        Assert.assertEquals(2, set.size());
        Assert.assertTrue(set.contains("a"));
        Assert.assertTrue(set.contains("b"));
        it.close();
    }

    @Test
    public void testUpdatingValue_reusesExistingInstance() throws IOException {
        SampleBean target = new SampleBean(1, "original");
        MappingIterator<SampleBean> it = mapper.readerForUpdating(target).readValues("{\"name\":\"updated\"}");

        Assert.assertTrue(it.hasNextValue());
        SampleBean result = it.nextValue();
        Assert.assertSame(target, result);
        Assert.assertEquals(1, target.id);
        Assert.assertEquals("updated", target.name);
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testAccessors_parser_schema_and_location() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("123");
        JsonParser parser = it.getParser();
        Assert.assertNotNull(parser);
        Assert.assertNull(it.getParserSchema());

        JsonLocation location = it.getCurrentLocation();
        Assert.assertNotNull(location);
        it.close();
    }

    @Test
    public void testClose_closesUnderlyingParser() throws IOException {
        final boolean[] streamClosed = new boolean[]{false};
        InputStream in = new ByteArrayInputStream("[1]".getBytes("UTF-8")) {
            @Override
            public void close() throws IOException {
                streamClosed[0] = true;
                super.close();
            }
        };

        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(in);
        Assert.assertTrue(it.hasNextValue());
        it.close();
        Assert.assertTrue(streamClosed[0]);
    }

    @Test
    public void testUnmanagedParser_notClosedAutomaticallyOnArrayEnd() throws IOException {
        JsonParser jp = mapper.getFactory().createParser("[1, 2]");
        jp.nextToken(); // Move to START_ARRAY
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(jp);
        Assert.assertTrue(it.hasNextValue());
        Assert.assertEquals(Integer.valueOf(1), it.nextValue());
        Assert.assertTrue(it.hasNextValue());
        Assert.assertEquals(Integer.valueOf(2), it.nextValue());
        Assert.assertFalse(it.hasNextValue());
        Assert.assertFalse(jp.isClosed());
        jp.close();
        it.close();
    }

    @Test
    public void testEmptyArray_returnsNoElements() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("[]");
        Assert.assertFalse(it.hasNext());
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testEmptyString_returnsNoElements() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("");
        Assert.assertFalse(it.hasNext());
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testWhitespaceString_returnsNoElements() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("   ");
        Assert.assertFalse(it.hasNext());
        Assert.assertFalse(it.hasNextValue());
        it.close();
    }

    @Test
    public void testHasNext_mappingException_throwsRuntimeJsonMappingException() throws IOException {
        MappingIterator<SampleBean> it = mapper.readerFor(SampleBean.class).readValues("\"not-a-bean\"");
        try {
            it.hasNext();
            Assert.fail("Expected RuntimeJsonMappingException");
        } catch (RuntimeJsonMappingException e) {
            Assert.assertNotNull(e.getCause());
        } finally {
            it.close();
        }
    }

    @Test
    public void testNext_mappingException_throwsRuntimeJsonMappingException() throws IOException {
        MappingIterator<SampleBean> it = mapper.readerFor(SampleBean.class).readValues("\"not-a-bean\"");
        try {
            it.next();
            Assert.fail("Expected RuntimeJsonMappingException");
        } catch (RuntimeJsonMappingException e) {
            Assert.assertNotNull(e.getCause());
        } finally {
            it.close();
        }
    }

    @Test
    public void testHasNext_malformedJson_throwsRuntimeException() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("{malformed-json");
        try {
            it.hasNext();
            Assert.fail("Expected RuntimeException due to IOException");
        } catch (RuntimeException e) {
            Assert.assertNotNull(e.getCause());
        } finally {
            it.close();
        }
    }

    @Test
    public void testNext_malformedJson_throwsRuntimeException() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("{malformed-json");
        try {
            it.next();
            Assert.fail("Expected RuntimeException due to IOException");
        } catch (RuntimeException e) {
            Assert.assertNotNull(e.getCause());
        } finally {
            it.close();
        }
    }
}
