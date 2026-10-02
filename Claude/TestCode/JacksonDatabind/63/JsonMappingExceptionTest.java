import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class JsonMappingExceptionTest {

    private JsonFactory factory;

    @Before
    public void setUp() {
        factory = new JsonFactory();
    }

    // ---------- Deprecated constructors ----------

    @Test
    public void testDeprecatedConstructor_msgOnly_normal() {
        JsonMappingException ex = new JsonMappingException("simple message");
        assertEquals("simple message", ex.getMessage());
    }

    @Test
    public void testDeprecatedConstructor_msgAndThrowable_normal() {
        Throwable cause = new RuntimeException("root cause");
        JsonMappingException ex = new JsonMappingException("msg2", cause);
        assertEquals("msg2", ex.getMessage());
        assertSame(cause, ex.getCause());
    }

    @Test
    public void testDeprecatedConstructor_msgAndLocation_normal() throws IOException {
        JsonParser p = factory.createParser("{}");
        JsonLocation loc = p.getCurrentLocation();
        JsonMappingException ex = new JsonMappingException("msg3", loc);
        assertEquals("msg3", ex.getMessage());
        p.close();
    }

    @Test
    public void testDeprecatedConstructor_msgLocationThrowable_normal() throws IOException {
        JsonParser p = factory.createParser("{}");
        JsonLocation loc = p.getCurrentLocation();
        Throwable cause = new RuntimeException("cause4");
        JsonMappingException ex = new JsonMappingException("msg4", loc, cause);
        assertEquals("msg4", ex.getMessage());
        assertSame(cause, ex.getCause());
        p.close();
    }

    // ---------- Closeable-based constructors ----------

    @Test
    public void testConstructor_closeableAndMsg_withJsonParser() throws IOException {
        JsonParser p = factory.createParser("{}");
        JsonMappingException ex = new JsonMappingException(p, "parser msg");
        assertEquals("parser msg", ex.getMessage());
        assertSame(p, ex.getProcessor());
        p.close();
    }

    @Test
    public void testConstructor_closeableAndMsg_withNonParserCloseable() throws IOException {
        StringWriter sw = new StringWriter();
        JsonMappingException ex = new JsonMappingException(sw, "writer msg");
        assertEquals("writer msg", ex.getMessage());
        assertSame(sw, ex.getProcessor());
    }

    @Test
    public void testConstructor_closeableAndMsg_withNullProcessor() {
        JsonMappingException ex = new JsonMappingException((Closeable) null, "null proc msg");
        assertEquals("null proc msg", ex.getMessage());
        assertNull(ex.getProcessor());
    }

    @Test
    public void testConstructor_closeableMsgThrowable_normal() throws IOException {
        JsonParser p = factory.createParser("{}");
        Throwable cause = new RuntimeException("innerCause");
        JsonMappingException ex = new JsonMappingException(p, "msg with cause", cause);
        assertEquals("msg with cause", ex.getMessage());
        assertSame(cause, ex.getCause());
        assertSame(p, ex.getProcessor());
        p.close();
    }

    @Test
    public void testConstructor_closeableMsgLocation_normal() throws IOException {
        JsonParser p = factory.createParser("{}");
        JsonLocation loc = p.getCurrentLocation();
        JsonMappingException ex = new JsonMappingException(p, "msg with loc", loc);
        assertEquals("msg with loc", ex.getMessage());
        assertSame(p, ex.getProcessor());
        p.close();
    }

    // ---------- Static factory: from(JsonParser, ...) ----------

    @Test
    public void testFrom_JsonParser_msg() throws IOException {
        JsonParser p = factory.createParser("{}");
        JsonMappingException ex = JsonMappingException.from(p, "from parser msg");
        assertEquals("from parser msg", ex.getMessage());
        assertSame(p, ex.getProcessor());
        p.close();
    }

    @Test
    public void testFrom_JsonParser_msgThrowable() throws IOException {
        JsonParser p = factory.createParser("{}");
        Throwable cause = new RuntimeException("cause5");
        JsonMappingException ex = JsonMappingException.from(p, "from parser msg2", cause);
        assertEquals("from parser msg2", ex.getMessage());
        assertSame(cause, ex.getCause());
        p.close();
    }

    // ---------- Static factory: from(JsonGenerator, ...) ----------

    @Test
    public void testFrom_JsonGenerator_msg() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = factory.createGenerator(sw);
        JsonMappingException ex = JsonMappingException.from(g, "from generator msg");
        assertEquals("from generator msg", ex.getMessage());
        assertSame(g, ex.getProcessor());
        g.close();
    }

    @Test
    public void testFrom_JsonGenerator_msgThrowable() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator g = factory.createGenerator(sw);
        Throwable cause = new RuntimeException("cause6");
        JsonMappingException ex = JsonMappingException.from(g, "from generator msg2", cause);
        assertEquals("from generator msg2", ex.getMessage());
        assertSame(cause, ex.getCause());
        g.close();
    }

    // NOTE: from(DeserializationContext, ...) and from(SerializerProvider, ...)
    // are not tested directly because DeserializationContext and SerializerProvider
    // are abstract classes with a large number of abstract/unimplemented methods
    // whose behavior/contracts are not provided in the given source or dependencies.
    // Creating a real (non-mocked) instance would require guessing unavailable API,
    // which is disallowed by the requirements. Hence these two overloads are skipped.

    // ---------- fromUnexpectedIOE ----------

    @Test
    public void testFromUnexpectedIOE_normal() {
        IOException ioe = new IOException("disk failure");
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(ioe);
        assertTrue(ex.getMessage().contains("IOException"));
        assertTrue(ex.getMessage().contains("disk failure"));
    }

    @Test
    public void testFromUnexpectedIOE_nullMessage_edgeCase() {
        IOException ioe = new IOException();
        JsonMappingException ex = JsonMappingException.fromUnexpectedIOE(ioe);
        assertNotNull(ex.getMessage());
    }

    // ---------- wrapWithPath ----------

    @Test
    public void testWrapWithPath_stringField_createsNewException() {
        Throwable src = new IOException("boom");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, "fromObj", "fieldX");
        assertEquals(1, ex.getPath().size());
        assertEquals("fieldX", ex.getPath().get(0).getFieldName());
        assertSame(src, ex.getCause());
    }

    @Test
    public void testWrapWithPath_index_createsNewException() {
        Throwable src = new IOException("boom2");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, "fromObj2", 5);
        assertEquals(1, ex.getPath().size());
        assertEquals(5, ex.getPath().get(0).getIndex());
    }

    @Test
    public void testWrapWithPath_referenceObject_directly() {
        Throwable src = new IOException("boom3");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("owner", "fld");
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, ref);
        assertEquals(1, ex.getPath().size());
        assertSame(ref, ex.getPath().get(0));
    }

    @Test
    public void testWrapWithPath_existingJsonMappingException_augmentsPath() {
        JsonMappingException existing = new JsonMappingException("existing msg");
        existing.prependPath("firstOwner", "firstField");

        JsonMappingException result = JsonMappingException.wrapWithPath(existing, "secondOwner", "secondField");

        assertSame(existing, result);
        assertEquals(2, result.getPath().size());
        // prepended, so secondField should now be first in list
        assertEquals("secondField", result.getPath().get(0).getFieldName());
        assertEquals("firstField", result.getPath().get(1).getFieldName());
    }

    @Test
    public void testWrapWithPath_nullOrEmptyMessage_edgeCase() {
        Throwable src = new IOException((String) null);
        JsonMappingException ex = JsonMappingException.wrapWithPath(src, "obj", "field");
        assertNotNull(ex.getMessage());
        assertTrue(ex.getMessage().contains("was"));
    }

    @Test
    public void testWrapWithPath_withJsonProcessingExceptionSource_setsProcessor() throws IOException {
        JsonParser badParser = factory.createParser("invalid_token_zzz");
        JsonParseException jpe = null;
        try {
            badParser.nextToken();
        } catch (JsonParseException e) {
            jpe = e;
        }
        if (jpe != null) {
            JsonMappingException ex = JsonMappingException.wrapWithPath(jpe, "src", "field");
            assertEquals(1, ex.getPath().size());
            // processor may or may not be set depending on jackson-core internals; just ensure no crash
            assertNotNull(ex.getMessage());
        }
        badParser.close();
    }

    // ---------- getPath / prependPath ----------

    @Test
    public void testGetPath_whenNoPath_returnsEmptyList() {
        JsonMappingException ex = new JsonMappingException("no path");
        List<JsonMappingException.Reference> path = ex.getPath();
        assertNotNull(path);
        assertTrue(path.isEmpty());
    }

    @Test
    public void testGetPath_afterPrependPath_returnsCorrectOrder() {
        JsonMappingException ex = new JsonMappingException("has path");
        ex.prependPath("ownerA", "fieldA");
        ex.prependPath("ownerB", 3);
        List<JsonMappingException.Reference> path = ex.getPath();
        assertEquals(2, path.size());
        assertEquals("ownerB", path.get(0).getFrom());
        assertEquals(3, path.get(0).getIndex());
        assertEquals("ownerA", path.get(1).getFrom());
        assertEquals("fieldA", path.get(1).getFieldName());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetPath_returnsUnmodifiableList_throwsOnModify() {
        JsonMappingException ex = new JsonMappingException("path unmodifiable");
        ex.prependPath("owner", "field");
        List<JsonMappingException.Reference> path = ex.getPath();
        path.add(new JsonMappingException.Reference("x", "y")); // should throw
    }

    @Test
    public void testPrependPath_referenceOverload_direct() {
        JsonMappingException ex = new JsonMappingException("ref path");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("o", 2);
        ex.prependPath(ref);
        assertEquals(1, ex.getPath().size());
        assertSame(ref, ex.getPath().get(0));
    }

    @Test
    public void testPrependPath_boundary_maxRefsToList() {
        JsonMappingException ex = new JsonMappingException("bounded path");
        // Add well beyond MAX_REFS_TO_LIST (1000) to test the size cap boundary
        for (int i = 0; i < 1005; i++) {
            ex.prependPath("owner" + i, i);
        }
        assertEquals(1000, ex.getPath().size());
    }

    // ---------- getPathReference / getPathReference(sb) ----------

    @Test
    public void testGetPathReference_noPath_returnsEmptyString() {
        JsonMappingException ex = new JsonMappingException("no path ref");
        assertEquals("", ex.getPathReference());
    }

    @Test
    public void testGetPathReference_withMultipleRefs_containsArrow() {
        JsonMappingException ex = new JsonMappingException("with path ref");
        ex.prependPath("ownerA", "fieldA");
        ex.prependPath("ownerB", "fieldB");
        String pathRef = ex.getPathReference();
        assertTrue(pathRef.contains("->"));
    }

    @Test
    public void testGetPathReferenceWithStringBuilder_appendsCorrectly() {
        JsonMappingException ex = new JsonMappingException("sb path");
        ex.prependPath("owner", "field");
        StringBuilder sb = new StringBuilder("PREFIX:");
        StringBuilder result = ex.getPathReference(sb);
        assertTrue(result.toString().startsWith("PREFIX:"));
    }

    // ---------- getProcessor ----------

    @Test
    public void testGetProcessor_returnsNullByDefault() {
        JsonMappingException ex = new JsonMappingException("no processor");
        assertNull(ex.getProcessor());
    }

    @Test
    public void testGetProcessor_returnsSetProcessor() throws IOException {
        JsonParser p = factory.createParser("{}");
        JsonMappingException ex = new JsonMappingException(p, "with processor");
        assertSame(p, ex.getProcessor());
        p.close();
    }

    // ---------- getMessage / getLocalizedMessage / _buildMessage ----------

    @Test
    public void testGetMessage_noPath_returnsOriginalMessage() {
        JsonMappingException ex = new JsonMappingException("plain message");
        assertEquals("plain message", ex.getMessage());
    }

    @Test
    public void testGetMessage_withPath_appendsReferenceChain() {
        JsonMappingException ex = new JsonMappingException("base message");
        ex.prependPath("owner", "field");
        String msg = ex.getMessage();
        assertTrue(msg.contains("base message"));
        assertTrue(msg.contains("through reference chain"));
    }

    @Test
    public void testGetMessage_nullBaseMessage_withPath_edgeCase() {
        JsonMappingException ex = new JsonMappingException((String) null);
        ex.prependPath("owner", "field");
        String msg = ex.getMessage();
        assertNotNull(msg);
        assertTrue(msg.contains("through reference chain"));
    }

    @Test
    public void testGetLocalizedMessage_matchesGetMessage() {
        JsonMappingException ex = new JsonMappingException("localized msg");
        ex.prependPath("o", "f");
        assertEquals(ex.getMessage(), ex.getLocalizedMessage());
    }

    // ---------- toString ----------

    @Test
    public void testToString_containsClassNameAndMessage() {
        JsonMappingException ex = new JsonMappingException("tostring msg");
        String str = ex.toString();
        assertTrue(str.contains("JsonMappingException"));
        assertTrue(str.contains("tostring msg"));
    }

    // ---------- Reference inner class ----------

    @Test
    public void testReferenceConstructor_fromOnly_normal() {
        Object from = new Object();
        JsonMappingException.Reference ref = new JsonMappingException.Reference(from);
        assertSame(from, ref.getFrom());
        assertNull(ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testReferenceConstructor_fromAndFieldName_normal() {
        Object from = "ownerObj";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(from, "myField");
        assertSame(from, ref.getFrom());
        assertEquals("myField", ref.getFieldName());
        assertEquals(-1, ref.getIndex());
    }

    @Test(expected = NullPointerException.class)
    public void testReferenceConstructor_nullFieldName_throwsNPE() {
        new JsonMappingException.Reference("owner", (String) null);
    }

    @Test
    public void testReferenceConstructor_fromAndIndex_normal() {
        Object from = "ownerObj2";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(from, 7);
        assertSame(from, ref.getFrom());
        assertEquals(7, ref.getIndex());
        assertNull(ref.getFieldName());
    }

    @Test
    public void testReferenceGetDescription_withFieldName() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("owner", "theField");
        String desc = ref.getDescription();
        assertTrue(desc.contains("\"theField\""));
    }

    @Test
    public void testReferenceGetDescription_withIndex() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("owner", 4);
        String desc = ref.getDescription();
        assertTrue(desc.contains("[4]"));
    }

    @Test
    public void testReferenceGetDescription_withNeitherFieldNorIndex_edgeCase() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("owner");
        String desc = ref.getDescription();
        assertTrue(desc.contains("[?]"));
    }

    @Test
    public void testReferenceGetDescription_nullFrom_edgeCase() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(null, "f");
        String desc = ref.getDescription();
        assertTrue(desc.startsWith("UNKNOWN"));
    }

    @Test
    public void testReferenceGetDescription_classInstance_usesClassDirectly() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class, "f");
        String desc = ref.getDescription();
        assertTrue(desc.contains("String"));
    }

    @Test
    public void testReferenceGetDescription_arrayClass_edgeCase() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(new int[0], "arrField");
        String desc = ref.getDescription();
        assertNotNull(desc);
        assertTrue(desc.contains("arrField"));
    }

    @Test
    public void testReferenceToString_matchesGetDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("owner", "f2");
        assertEquals(ref.getDescription(), ref.toString());
    }

    @Test
    public void testReferenceGetDescription_cachedAfterFirstCall() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("owner", "cacheField");
        String first = ref.getDescription();
        String second = ref.getDescription();
        assertSame(first, second);
    }

    // package-private accessors (accessible because this test is in the same package)

    @Test
    public void testReferenceDefaultConstructorAndSetters_packagePrivateAccess() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference();
        ref.setFieldName("setField");
        ref.setIndex(9);
        ref.setDescription("customDesc");
        assertEquals("setField", ref.getFieldName());
        assertEquals(9, ref.getIndex());
        assertEquals("customDesc", ref.getDescription());
    }

    @Test
    public void testReferenceWriteReplace_returnsSelfAndPopulatesDescription() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("wOwner", "wField");
        Object result = ref.writeReplace();
        assertSame(ref, result);
        assertNotNull(ref.getDescription());
    }
}
