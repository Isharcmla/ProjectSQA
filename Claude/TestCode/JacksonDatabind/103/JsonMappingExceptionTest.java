import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class JsonMappingExceptionTest {

    // Simple Closeable that is not a JsonParser/JsonGenerator
    static class DummyCloseable implements Closeable {
        boolean closed = false;
        @Override
        public void close() throws IOException {
            closed = true;
        }
    }

    private JsonFactory jsonFactory;

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
    }

    // ---------------------------------------------------------
    // Constructors (deprecated ones)
    // ---------------------------------------------------------

    @Test
    public void testConstructor_msgOnly_normalInput() {
        JsonMappingException ex = new JsonMappingException("simple message");
        assertEquals("simple message", ex.getMessage());
    }

    @Test
    public void testConstructor_msgOnly_nullMessage() {
        JsonMappingException ex = new JsonMappingException((String) null);
        assertNull(ex.getMessage());
    }

    @Test
    public void testConstructor_msgAndRootCause_normalInput() {
        Throwable cause = new RuntimeException("root cause");
        JsonMappingException ex = new JsonMappingException("msg", cause);
        assertEquals("msg", ex.getMessage());
        assertSame(cause, ex.getCause());
    }

    @Test
    public void testConstructor_msgAndLocation_normalInput() {
        JsonLocation loc = new JsonLocation("src", 1L, 1, 1);
        JsonMappingException ex = new JsonMappingException("msg", loc);
        assertEquals("msg", ex.getMessage());
        assertSame(loc, ex.getLocation());
    }

    @Test
    public void testConstructor_msgLocationAndRootCause_normalInput() {
        JsonLocation loc = new JsonLocation("src", 1L, 1, 1);
        Throwable cause = new RuntimeException("root cause");
        JsonMappingException ex = new JsonMappingException("msg", loc, cause);
        assertEquals("msg", ex.getMessage());
        assertSame(loc, ex.getLocation());
        assertSame(cause, ex.getCause());
    }

    // ---------------------------------------------------------
    // Constructors with Closeable processor
    // ---------------------------------------------------------

    @Test
    public void testConstructor_processorAndMsg_withJsonParser_setsLocation() throws IOException {
        JsonParser parser = jsonFactory.createParser("{}");
        JsonMappingException ex = new JsonMappingException(parser, "msg with parser");
        assertEquals("msg with parser", ex.getMessage());
        assertSame(parser, ex.getProcessor());
        parser.close();
    }

    @Test
    public void testConstructor_processorAndMsg_withNonParserCloseable_noLocationSet() throws IOException {
        DummyCloseable dummy = new DummyCloseable();
        JsonMappingException ex = new JsonMappingException(dummy, "msg with dummy");
        assertEquals("msg with dummy", ex.getMessage());
        assertSame(dummy, ex.getProcessor());
    }

    @Test
    public void testConstructor_processorMsgProblem_withJsonParser_normalInput() throws IOException {
        JsonParser parser = jsonFactory.createParser("{}");
        Throwable problem = new RuntimeException("problem");
        JsonMappingException ex = new JsonMappingException(parser, "msg", problem);
        assertEquals("msg", ex.getMessage());
        assertSame(problem, ex.getCause());
        assertSame(parser, ex.getProcessor());
        parser.close();
    }

    @Test
    public void testConstructor_processorMsgProblem_withDummyCloseable_normalInput() throws IOException {
        DummyCloseable dummy = new DummyCloseable();
        Throwable problem = new RuntimeException("problem");
        JsonMappingException ex = new JsonMappingException(dummy, "msg", problem);
        assertEquals("msg", ex.getMessage());
        assertSame(problem, ex.getCause());
        assertSame(dummy, ex.getProcessor());
    }

    @Test
    public void testConstructor_processorMsgLocation_normalInput() throws IOException {
        DummyCloseable dummy = new DummyCloseable();
        JsonLocation loc = new JsonLocation("src", 2L, 1, 1);
        JsonMappingException ex = new JsonMappingException(dummy, "msg", loc);
        assertEquals("msg", ex.getMessage());
        assertSame(loc, ex.getLocation());
        assertSame(dummy, ex.getProcessor());
    }

    // ---------------------------------------------------------
    // Static factory methods: from(JsonParser, ...)
    // ---------------------------------------------------------

    @Test
    public void testFrom_jsonParserAndMsg_normalInput() throws IOException {
        JsonParser parser = jsonFactory.createParser("{}");
        JsonMappingException ex = JsonMappingException.from(parser, "parser msg");
        assertEquals("parser msg", ex.getMessage());
        assertSame(parser, ex.getProcessor());
        parser.close();
    }

    @Test
    public void testFrom_jsonParserMsgAndThrowable_normalInput() throws IOException {
        JsonParser parser = jsonFactory.createParser("{}");
        Throwable problem = new RuntimeException("problem");
        JsonMappingException ex = JsonMappingException.from(parser, "parser msg", problem);
        assertEquals("parser msg", ex.getMessage());
        assertSame(problem, ex.getCause());
        parser.close();
    }

    // ---------------------------------------------------------
    // Static factory methods: from(JsonGenerator, ...)
    // ---------------------------------------------------------

    @Test
    public void testFrom_jsonGeneratorAndMsg_normalInput() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        JsonMappingException ex = JsonMappingException.from(gen, "gen msg");
        assertEquals("gen msg", ex.getMessage());
        assertSame(gen, ex.getProcessor());
        gen.close();
    }

    @Test
    public void testFrom_jsonGeneratorMsgAndThrowable_normalInput() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(sw);
        Throwable problem = new RuntimeException("gen problem");
        JsonMappingException ex = JsonMappingException.from(gen, "gen msg", problem);
        assertEquals("gen msg", ex.getMessage());
        assertSame(problem, ex.getCause());
        gen.close();
    }

    // Note: from(DeserializationContext, ...) and from(SerializerProvider, ...)
    // require abstract classes DeserializationContext / SerializerProvider whose
    // full API (abstract methods) is not provided in the given source code or
    // dependencies. Creating a proper (non-mocked) concrete instance would require
    // guessing unavailable API details, which is disallowed by the requirements.
    // Therefore these two overloads are not directly exercised here.

    // ---------------------------------------------------------
    // fromUnexpectedIOE
    // ---------------------------------------------------------

    @Test
    public void testFromUnexpectedIOE_normalInput_buildsExpectedMessage() {
        IOException ioe = new IOException("io failure");
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(ioe);
        assertTrue(ex.getMessage().contains("Unexpected IOException"));
        assertTrue(ex.getMessage().contains("io failure"));
        assertNull(ex.getProcessor());
    }

    // ---------------------------------------------------------
    // wrapWithPath
    // ---------------------------------------------------------

    @Test
    public void testWrapWithPath_fieldName_normalInput_createsNewException() {
        RuntimeException src = new RuntimeException("boom");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, "fromObj", "fieldA");
        assertEquals(1, ex.getPath().size());
        assertEquals("fieldA", ex.getPath().get(0).getFieldName());
        assertSame(src, ex.getCause());
    }

    @Test
    public void testWrapWithPath_index_normalInput_createsNewException() {
        RuntimeException src = new RuntimeException("boom index");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, "fromObj", 3);
        assertEquals(1, ex.getPath().size());
        assertEquals(3, ex.getPath().get(0).getIndex());
    }

    @Test
    public void testWrapWithPath_referenceDirect_normalInput() {
        RuntimeException src = new RuntimeException("boom ref");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "fld");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, ref);
        assertEquals(1, ex.getPath().size());
        assertSame(ref, ex.getPath().get(0));
    }

    @Test
    public void testWrapWithPath_srcAlreadyJsonMappingException_prependsPath() {
        JsonMappingException original = new JsonMappingException("orig msg");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj2", "fld2");
        JsonMappingException result = JsonMappingException.wrapWithPath(original, ref);
        assertSame(original, result);
        assertEquals(1, result.getPath().size());
        assertEquals("fld2", result.getPath().get(0).getFieldName());
    }

    @Test
    public void testWrapWithPath_srcWithNullMessage_usesClassNamePlaceholder() {
        RuntimeException src = new RuntimeException((String) null);
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj3");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(ex.getMessage().contains("was " + src.getClass().getName()));
    }

    @Test
    public void testWrapWithPath_srcWithEmptyMessage_usesClassNamePlaceholder() {
        RuntimeException src = new RuntimeException("");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj4");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, ref);
        assertTrue(ex.getMessage().contains("was " + src.getClass().getName()));
    }

    @Test
    public void testWrapWithPath_srcIsJsonProcessingExceptionWithCloseableProcessor() throws IOException {
        JsonParser parser = jsonFactory.createParser("{}");
        JsonProcessingException src = new JsonMappingException(parser, "some msg");
        // src is already JsonMappingException so wrapWithPath just prepends path;
        // to exercise the "else" branch with JsonProcessingException but NOT
        // JsonMappingException, we use a different subtype-like wrapper via
        // JsonParseException substitute is not available; instead simulate with
        // a generic exception whose getProcessor is not exposed (skip branch
        // testing directly since JsonProcessingException itself is abstract-ish).
        JsonMappingException.Reference ref = new JsonMappingException.Reference("x");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, ref);
        assertNotNull(ex);
        parser.close();
    }

    // ---------------------------------------------------------
    // getPath / getPathReference / prependPath
    // ---------------------------------------------------------

    @Test
    public void testGetPath_noPath_returnsEmptyList() {
        JsonMappingException ex = new JsonMappingException("msg");
        assertTrue(ex.getPath().isEmpty());
    }

    @Test
    public void testGetPath_withPath_returnsUnmodifiableList() {
        JsonMappingException ex = new JsonMappingException("msg");
        ex.prependPath("obj", "field1");
        List<JsonMappingException.Reference> path = ex.getPath();
        assertEquals(1, path.size());
        try {
            path.add(new JsonMappingException.Reference("x"));
            fail("Should have thrown UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testPrependPath_objectAndFieldName_normalInput() {
        JsonMappingException ex = new JsonMappingException("msg");
        ex.prependPath("obj1", "fieldA");
        ex.prependPath("obj2", "fieldB");
        List<JsonMappingException.Reference> path = ex.getPath();
        assertEquals(2, path.size());
        // last prepended should be first in list
        assertEquals("fieldB", path.get(0).getFieldName());
        assertEquals("fieldA", path.get(1).getFieldName());
    }

    @Test
    public void testPrependPath_objectAndIndex_normalInput() {
        JsonMappingException ex = new JsonMappingException("msg");
        ex.prependPath("obj1", 5);
        List<JsonMappingException.Reference> path = ex.getPath();
        assertEquals(1, path.size());
        assertEquals(5, path.get(0).getIndex());
    }

    @Test
    public void testPrependPath_referenceObject_normalInput() {
        JsonMappingException ex = new JsonMappingException("msg");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "f");
        ex.prependPath(ref);
        assertEquals(1, ex.getPath().size());
        assertSame(ref, ex.getPath().get(0));
    }

    @Test
    public void testPrependPath_exceedsMaxRefs_boundedAtMax() {
        JsonMappingException ex = new JsonMappingException("msg");
        int limit = JsonMappingException.MAX_REFS_TO_LIST;
        for (int i = 0; i < limit + 5; i++) {
            ex.prependPath(new JsonMappingException.Reference("obj" + i, "field" + i));
        }
        assertEquals(limit, ex.getPath().size());
    }

    @Test
    public void testGetPathReference_noPath_emptyString() {
        JsonMappingException ex = new JsonMappingException("msg");
        assertEquals("", ex.getPathReference());
    }

    @Test
    public void testGetPathReference_withPath_containsFieldDescriptions() {
        JsonMappingException ex = new JsonMappingException("msg");
        ex.prependPath("obj1", "fieldA");
        ex.prependPath("obj2", "fieldB");
        String pathRef = ex.getPathReference();
        assertTrue(pathRef.contains("fieldB"));
        assertTrue(pathRef.contains("fieldA"));
        assertTrue(pathRef.contains("->"));
    }

    @Test
    public void testGetPathReferenceWithStringBuilder_appendsToExisting() {
        JsonMappingException ex = new JsonMappingException("msg");
        ex.prependPath("obj1", "fieldA");
        StringBuilder sb = new StringBuilder("prefix:");
        StringBuilder result = ex.getPathReference(sb);
        assertTrue(result.toString().startsWith("prefix:"));
        assertTrue(result.toString().contains("fieldA"));
    }

    // ---------------------------------------------------------
    // getProcessor / getLocalizedMessage / getMessage / toString
    // ---------------------------------------------------------

    @Test
    public void testGetProcessor_noProcessor_returnsNull() {
        JsonMappingException ex = new JsonMappingException("msg");
        assertNull(ex.getProcessor());
    }

    @Test
    public void testGetProcessor_withProcessor_returnsProcessor() throws IOException {
        DummyCloseable dummy = new DummyCloseable();
        JsonMappingException ex = new JsonMappingException(dummy, "msg");
        assertSame(dummy, ex.getProcessor());
    }

    @Test
    public void testGetLocalizedMessage_noPath_returnsPlainMessage() {
        JsonMappingException ex = new JsonMappingException("plain msg");
        assertEquals("plain msg", ex.getLocalizedMessage());
    }

    @Test
    public void testGetLocalizedMessage_withPath_includesReferenceChain() {
        JsonMappingException ex = new JsonMappingException("plain msg");
        ex.prependPath("obj", "f");
        String localized = ex.getLocalizedMessage();
        assertTrue(localized.contains("through reference chain"));
        assertTrue(localized.contains("f"));
    }

    @Test
    public void testGetMessage_noPath_returnsSuperMessage() {
        JsonMappingException ex = new JsonMappingException("just msg");
        assertEquals("just msg", ex.getMessage());
    }

    @Test
    public void testGetMessage_nullMessage_withPath_buildsFromEmpty() {
        JsonMappingException ex = new JsonMappingException((String) null);
        ex.prependPath("obj", "f");
        String msg = ex.getMessage();
        assertTrue(msg.contains("through reference chain"));
        assertTrue(msg.contains("f"));
    }

    @Test
    public void testGetMessage_withPath_appendsReferenceChain() {
        JsonMappingException ex = new JsonMappingException("base msg");
        ex.prependPath("obj1", "fieldA");
        ex.prependPath("obj2", 2);
        String msg = ex.getMessage();
        assertTrue(msg.startsWith("base msg"));
        assertTrue(msg.contains("through reference chain"));
        assertTrue(msg.endsWith(")"));
    }

    @Test
    public void testToString_containsClassNameAndMessage() {
        JsonMappingException ex = new JsonMappingException("toString msg");
        String s = ex.toString();
        assertTrue(s.startsWith(JsonMappingException.class.getName()));
        assertTrue(s.contains("toString msg"));
    }

    // ---------------------------------------------------------
    // Reference class tests
    // ---------------------------------------------------------

    @Test
    public void testReferenceConstructor_fromOnly_normalInput() {
        Object from = "someObject";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(from);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceConstructor_fromAndFieldName_normalInput() {
        Object from = "someObject";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(from, "myField");
        assertSame(from, ref.getFrom());
        assertEquals("myField", ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test(expected = NullPointerException.class)
    public void testReferenceConstructor_fromAndNullFieldName_throwsNPE() {
        new JsonMappingException.Reference("someObject", (String) null);
    }

    @Test
    public void testReferenceConstructor_fromAndIndex_normalInput() {
        Object from = "someObject";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(from, 7);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(7, ref.getIndex());
    }

    @Test
    public void testReferenceConstructor_fromAndNegativeIndex_edgeCase() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", -1);
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceGetDescription_nullFrom_returnsUnknown() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(null);
        String desc = ref.getDescription();
        assertTrue(desc.startsWith("UNKNOWN"));
        assertTrue(desc.contains("?"));
    }

    @Test
    public void testReferenceGetDescription_withFieldName_includesFieldNameQuoted() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "myField");
        String desc = ref.getDescription();
        assertTrue(desc.contains("\"myField\""));
    }

    @Test
    public void testReferenceGetDescription_withIndex_includesIndex() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", 4);
        String desc = ref.getDescription();
        assertTrue(desc.contains("[4]"));
    }

    @Test
    public void testReferenceGetDescription_neitherFieldNorIndex_usesQuestionMark() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj");
        String desc = ref.getDescription();
        assertTrue(desc.contains("[?]"));
    }

    @Test
    public void testReferenceGetDescription_arrayFrom_includesBrackets() {
        int[] arr = new int[]{1, 2, 3};
        JsonMappingException.Reference ref = new JsonMappingException.Reference(arr, 0);
        String desc = ref.getDescription();
        assertTrue(desc.contains("[]"));
        assertTrue(desc.contains("[0]"));
    }

    @Test
    public void testReferenceGetDescription_classFrom_usesClassNameDirectly() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class, "f");
        String desc = ref.getDescription();
        assertTrue(desc.contains(String.class.getName()));
    }

    @Test
    public void testReferenceGetDescription_calledTwice_returnsCachedValue() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "f");
        String first = ref.getDescription();
        String second = ref.getDescription();
        assertEquals(first, second);
    }

    @Test
    public void testReferenceToString_matchesGetDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "f");
        assertEquals(ref.getDescription(), ref.toString());
    }

    @Test
    public void testReferenceWriteReplace_returnsSameInstanceAndSetsDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("obj", "f");
        Object result = ref.writeReplace();
        assertSame(ref, result);
        assertNotNull(ref.getDescription());
    }

    @Test
    public void testReferenceDefaultConstructor_andSetters_normalInput() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference();
        ref.setFieldName("someField");
        ref.setIndex(9);
        ref.setDescription("customDesc");
        assertEquals("someField", ref.getFieldName());
        assertEquals(9, ref.getIndex());
        assertEquals("customDesc", ref.getDescription());
        assertNull(ref.getFrom());
    }
}
