package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.util.List;

public class JsonMappingExceptionTest {

    private final JsonFactory JSON_FACTORY = new JsonFactory();

    // ==========================================
    // Reference Class Tests
    // ==========================================

    @Test
    public void testReference_defaultConstructor() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference();
        Assert.assertNull(ref.getFrom());
        Assert.assertNull(ref.getFieldName());
        Assert.assertEquals(-1, ref.getIndex());
        Assert.assertEquals("UNKNOWN[?]", ref.getDescription());
        Assert.assertEquals("UNKNOWN[?]", ref.toString());
    }

    @Test
    public void testReference_fromConstructor() {
        String fromObj = "sampleObject";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(fromObj);
        Assert.assertSame(fromObj, ref.getFrom());
        Assert.assertNull(ref.getFieldName());
        Assert.assertEquals(-1, ref.getIndex());
        Assert.assertEquals("java.lang.String[?]", ref.getDescription());
    }

    @Test
    public void testReference_fromAndFieldNameConstructor() {
        String fromObj = "sampleObject";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(fromObj, "myField");
        Assert.assertSame(fromObj, ref.getFrom());
        Assert.assertEquals("myField", ref.getFieldName());
        Assert.assertEquals(-1, ref.getIndex());
        Assert.assertEquals("java.lang.String[\"myField\"]", ref.getDescription());
    }

    @Test(expected = NullPointerException.class)
    public void testReference_fromAndNullFieldName_throwsException() {
        new JsonMappingException.Reference("sampleObject", (String) null);
    }

    @Test
    public void testReference_fromAndIndexConstructor_positiveIndex() {
        String fromObj = "sampleList";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(fromObj, 5);
        Assert.assertSame(fromObj, ref.getFrom());
        Assert.assertNull(ref.getFieldName());
        Assert.assertEquals(5, ref.getIndex());
        Assert.assertEquals("java.lang.String[5]", ref.getDescription());
    }

    @Test
    public void testReference_fromAndIndexConstructor_zeroIndex() {
        String fromObj = "sampleList";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(fromObj, 0);
        Assert.assertEquals(0, ref.getIndex());
        Assert.assertEquals("java.lang.String[0]", ref.getDescription());
    }

    @Test
    public void testReference_fromAndIndexConstructor_negativeIndex() {
        String fromObj = "sampleList";
        JsonMappingException.Reference ref = new JsonMappingException.Reference(fromObj, -1);
        Assert.assertEquals(-1, ref.getIndex());
        Assert.assertEquals("java.lang.String[?]", ref.getDescription());
    }

    @Test
    public void testReference_fromIsClass() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String.class, "length");
        Assert.assertEquals("java.lang.String[\"length\"]", ref.getDescription());
    }

    @Test
    public void testReference_fromIsArrayClass() {
        JsonMappingException.Reference ref1D = new JsonMappingException.Reference(String[].class, 0);
        Assert.assertEquals("java.lang.String[][0]", ref1D.getDescription());

        JsonMappingException.Reference ref2D = new JsonMappingException.Reference(int[][].class, 1);
        Assert.assertEquals("int[][][1]", ref2D.getDescription());
    }

    @Test
    public void testReference_fromIsArrayInstance() {
        String[] arr = new String[]{"a", "b"};
        JsonMappingException.Reference ref = new JsonMappingException.Reference(arr, 1);
        Assert.assertEquals("java.lang.String[][1]", ref.getDescription());
    }

    @Test
    public void testReference_packagePrivateSetters() {
        JsonMappingException.Reference ref = new JsonMappingException.Reference();
        ref.setFieldName("customField");
        Assert.assertEquals("customField", ref.getFieldName());

        ref.setIndex(42);
        Assert.assertEquals(42, ref.getIndex());

        ref.setDescription("CustomDescription");
        Assert.assertEquals("CustomDescription", ref.getDescription());
        Assert.assertEquals("CustomDescription", ref.toString());
    }

    @Test
    public void testReference_serializationAndWriteReplace() throws Exception {
        JsonMappingException.Reference original = new JsonMappingException.Reference("sourceObj", "fieldA");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        JsonMappingException.Reference deserialized = (JsonMappingException.Reference) ois.readObject();

        Assert.assertNull(deserialized.getFrom());
        Assert.assertEquals("fieldA", deserialized.getFieldName());
        Assert.assertEquals(-1, deserialized.getIndex());
        Assert.assertEquals("java.lang.String[\"fieldA\"]", deserialized.getDescription());
    }

    // ==========================================
    // Deprecated Constructors Tests
    // ==========================================

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_msgOnly() {
        JsonMappingException exc = new JsonMappingException("test message");
        Assert.assertEquals("test message", exc.getMessage());
        Assert.assertNull(exc.getCause());
        Assert.assertNull(exc.getLocation());
        Assert.assertNull(exc.getProcessor());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_msgAndCause() {
        Throwable cause = new RuntimeException("root cause");
        JsonMappingException exc = new JsonMappingException("test message", cause);
        Assert.assertEquals("test message", exc.getMessage());
        Assert.assertSame(cause, exc.getCause());
        Assert.assertNull(exc.getLocation());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_msgAndLocation() {
        JsonLocation loc = new JsonLocation("src", 100L, 1, 10);
        JsonMappingException exc = new JsonMappingException("test message", loc);
        Assert.assertTrue(exc.getMessage().contains("test message"));
        Assert.assertEquals(loc, exc.getLocation());
        Assert.assertNull(exc.getCause());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructor_msgLocationAndCause() {
        JsonLocation loc = new JsonLocation("src", 100L, 1, 10);
        Throwable cause = new RuntimeException("root cause");
        JsonMappingException exc = new JsonMappingException("test message", loc, cause);
        Assert.assertTrue(exc.getMessage().contains("test message"));
        Assert.assertEquals(loc, exc.getLocation());
        Assert.assertSame(cause, exc.getCause());
    }

    // ==========================================
    // 2.7+ Constructors Tests
    // ==========================================

    @Test
    public void testConstructor_closeableAndMsg_withParser() throws IOException {
        JsonParser parser = JSON_FACTORY.createParser("{\"k\":\"v\"}");
        JsonMappingException exc = new JsonMappingException(parser, "parser error");
        Assert.assertSame(parser, exc.getProcessor());
        Assert.assertEquals("parser error", exc.getMessage());
        Assert.assertNotNull(exc.getLocation());
        parser.close();
    }

    @Test
    public void testConstructor_closeableAndMsg_withNonParser() {
        Closeable closeable = new Closeable() {
            @Override
            public void close() {}
        };
        JsonMappingException exc = new JsonMappingException(closeable, "closeable error");
        Assert.assertSame(closeable, exc.getProcessor());
        Assert.assertEquals("closeable error", exc.getMessage());
        Assert.assertNull(exc.getLocation());
    }

    @Test
    public void testConstructor_closeableMsgAndProblem_withParser() throws IOException {
        JsonParser parser = JSON_FACTORY.createParser("{}");
        Throwable cause = new IllegalArgumentException("invalid arg");
        JsonMappingException exc = new JsonMappingException(parser, "error with cause", cause);
        Assert.assertSame(parser, exc.getProcessor());
        Assert.assertSame(cause, exc.getCause());
        Assert.assertEquals("error with cause", exc.getMessage());
        Assert.assertNotNull(exc.getLocation());
        parser.close();
    }

    @Test
    public void testConstructor_closeableMsgAndProblem_withNonParser() {
        StringWriter sw = new StringWriter();
        Throwable cause = new IllegalArgumentException("invalid arg");
        JsonMappingException exc = new JsonMappingException(sw, "error with cause", cause);
        Assert.assertSame(sw, exc.getProcessor());
        Assert.assertSame(cause, exc.getCause());
        Assert.assertEquals("error with cause", exc.getMessage());
        Assert.assertNull(exc.getLocation());
    }

    @Test
    public void testConstructor_closeableMsgAndLocation() {
        StringWriter sw = new StringWriter();
        JsonLocation loc = new JsonLocation("src", 50L, 2, 5);
        JsonMappingException exc = new JsonMappingException(sw, "error with loc", loc);
        Assert.assertSame(sw, exc.getProcessor());
        Assert.assertTrue(exc.getMessage().contains("error with loc"));
        Assert.assertEquals(loc, exc.getLocation());
    }

    // ==========================================
    // Factory Methods Tests
    // ==========================================

    @Test
    public void testFactory_fromParser() throws IOException {
        JsonParser parser = JSON_FACTORY.createParser("123");
        JsonMappingException exc1 = JsonMappingException.from(parser, "msg1");
        Assert.assertSame(parser, exc1.getProcessor());
        Assert.assertEquals("msg1", exc1.getMessage());

        Throwable problem = new IOException("io err");
        JsonMappingException exc2 = JsonMappingException.from(parser, "msg2", problem);
        Assert.assertSame(parser, exc2.getProcessor());
        Assert.assertSame(problem, exc2.getCause());
        Assert.assertEquals("msg2", exc2.getMessage());
        parser.close();
    }

    @Test
    public void testFactory_fromGenerator() throws IOException {
        StringWriter sw = new StringWriter();
        JsonGenerator generator = JSON_FACTORY.createGenerator(sw);
        JsonMappingException exc1 = JsonMappingException.from(generator, "gen msg1");
        Assert.assertSame(generator, exc1.getProcessor());
        Assert.assertEquals("gen msg1", exc1.getMessage());
        Assert.assertNull(exc1.getCause());

        Throwable problem = new RuntimeException("gen err");
        JsonMappingException exc2 = JsonMappingException.from(generator, "gen msg2", problem);
        Assert.assertSame(generator, exc2.getProcessor());
        Assert.assertSame(problem, exc2.getCause());
        Assert.assertEquals("gen msg2", exc2.getMessage());
        generator.close();
    }

    @Test
    public void testFactory_fromDeserializationContext() throws IOException {
        final JsonParser parser = JSON_FACTORY.createParser("[]");
        DeserializationContext ctxt = new DeserializationContext(null) {
            private static final long serialVersionUID = 1L;
            @Override
            public JsonParser getParser() {
                return parser;
            }
        };

        JsonMappingException exc1 = JsonMappingException.from(ctxt, "ctxt msg");
        Assert.assertSame(parser, exc1.getProcessor());
        Assert.assertEquals("ctxt msg", exc1.getMessage());

        Throwable t = new RuntimeException("ctxt problem");
        JsonMappingException exc2 = JsonMappingException.from(ctxt, "ctxt msg2", t);
        Assert.assertSame(parser, exc2.getProcessor());
        Assert.assertSame(t, exc2.getCause());
        Assert.assertEquals("ctxt msg2", exc2.getMessage());
        parser.close();
    }

    @Test
    public void testFactory_fromSerializerProvider() throws IOException {
        StringWriter sw = new StringWriter();
        final JsonGenerator generator = JSON_FACTORY.createGenerator(sw);
        SerializerProvider prov = new SerializerProvider() {
            @Override
            public JsonGenerator getGenerator() {
                return generator;
            }
        };

        JsonMappingException exc1 = JsonMappingException.from(prov, "prov msg");
        Assert.assertSame(generator, exc1.getProcessor());
        Assert.assertEquals("prov msg", exc1.getMessage());

        Throwable problem = new RuntimeException("prov err");
        JsonMappingException exc2 = JsonMappingException.from(prov, "prov msg2", problem);
        Assert.assertSame(generator, exc2.getProcessor());
        Assert.assertSame(problem, exc2.getCause());
        Assert.assertEquals("prov msg2", exc2.getMessage());
        generator.close();
    }

    @Test
    public void testFactory_fromUnexpectedIOE() {
        IOException ioe = new IOException("disk failure");
        JsonMappingException exc = JsonMappingException.fromUnexpectedIOE(ioe);
        Assert.assertEquals("Unexpected IOException (of type java.io.IOException): disk failure", exc.getMessage());
        Assert.assertNull(exc.getProcessor());
    }

    // ==========================================
    // wrapWithPath Tests
    // ==========================================

    @Test
    public void testWrapWithPath_withFieldName() {
        Throwable src = new IOException("io failure");
        JsonMappingException exc = JsonMappingException.wrapWithPath(src, "myObject", "fieldX");

        Assert.assertSame(src, exc.getCause());
        Assert.assertEquals(1, exc.getPath().size());
        Assert.assertEquals("fieldX", exc.getPath().get(0).getFieldName());
        Assert.assertEquals("io failure (through reference chain: java.lang.String[\"fieldX\"])", exc.getMessage());
    }

    @Test
    public void testWrapWithPath_withIndex() {
        Throwable src = new IOException("io failure");
        JsonMappingException exc = JsonMappingException.wrapWithPath(src, "myList", 3);

        Assert.assertSame(src, exc.getCause());
        Assert.assertEquals(1, exc.getPath().size());
        Assert.assertEquals(3, exc.getPath().get(0).getIndex());
        Assert.assertEquals("io failure (through reference chain: java.lang.String[3])", exc.getMessage());
    }

    @Test
    public void testWrapWithPath_existingJsonMappingException() {
        JsonMappingException initialExc = new JsonMappingException("initial error");
        JsonMappingException.Reference ref = new JsonMappingException.Reference("refObj", "prop1");
        JsonMappingException wrappedExc = JsonMappingException.wrapWithPath(initialExc, ref);

        Assert.assertSame(initialExc, wrappedExc);
        Assert.assertEquals(1, wrappedExc.getPath().size());
        Assert.assertSame(ref, wrappedExc.getPath().get(0));
    }

    @Test
    public void testWrapWithPath_emptyOrNullMessageOnSourceException() {
        Throwable srcWithoutMsg = new RuntimeException("");
        JsonMappingException exc = JsonMappingException.wrapWithPath(srcWithoutMsg, new JsonMappingException.Reference("obj", "prop"));
        Assert.assertTrue(exc.getMessage().startsWith("(was java.lang.RuntimeException)"));

        Throwable srcWithNullMsg = new RuntimeException((String) null);
        JsonMappingException exc2 = JsonMappingException.wrapWithPath(srcWithNullMsg, new JsonMappingException.Reference("obj", "prop"));
        Assert.assertTrue(exc2.getMessage().startsWith("(was java.lang.RuntimeException)"));
    }

    @Test
    public void testWrapWithPath_srcIsJsonProcessingExceptionWithProcessor() {
        final Closeable dummyProcessor = new StringWriter();
        JsonProcessingException jpeWithProc = new JsonProcessingException("jpe error") {
            private static final long serialVersionUID = 1L;
            @Override
            public Object getProcessor() {
                return dummyProcessor;
            }
        };

        JsonMappingException exc = JsonMappingException.wrapWithPath(jpeWithProc, new JsonMappingException.Reference("obj", "field"));
        Assert.assertSame(dummyProcessor, exc.getProcessor());
        Assert.assertSame(jpeWithProc, exc.getCause());

        JsonProcessingException jpeWithNonCloseableProc = new JsonProcessingException("jpe error 2") {
            private static final long serialVersionUID = 1L;
            @Override
            public Object getProcessor() {
                return "NotCloseableString";
            }
        };
        JsonMappingException exc2 = JsonMappingException.wrapWithPath(jpeWithNonCloseableProc, new JsonMappingException.Reference("obj", "field"));
        Assert.assertNull(exc2.getProcessor());
    }

    // ==========================================
    // Path and PrependPath Tests
    // ==========================================

    @Test
    public void testGetPath_whenEmpty_returnsEmptyList() {
        JsonMappingException exc = new JsonMappingException("no path");
        List<JsonMappingException.Reference> path = exc.getPath();
        Assert.assertNotNull(path);
        Assert.assertTrue(path.isEmpty());
        Assert.assertEquals("", exc.getPathReference());
    }

    @Test
    public void testPrependPath_multipleReferences() {
        JsonMappingException exc = new JsonMappingException("mapping error");
        exc.prependPath("itemObj", 2);
        exc.prependPath("containerObj", "items");

        List<JsonMappingException.Reference> path = exc.getPath();
        Assert.assertEquals(2, path.size());
        Assert.assertEquals("items", path.get(0).getFieldName());
        Assert.assertEquals(2, path.get(1).getIndex());

        String pathRef = exc.getPathReference();
        Assert.assertEquals("java.lang.String[\"items\"]->java.lang.String[2]", pathRef);

        StringBuilder customSb = new StringBuilder("Path: ");
        exc.getPathReference(customSb);
        Assert.assertEquals("Path: java.lang.String[\"items\"]->java.lang.String[2]", customSb.toString());
    }

    @Test
    public void testPrependPath_exceedMaxRefsToList() {
        JsonMappingException exc = new JsonMappingException("large path");
        for (int i = 0; i < JsonMappingException.MAX_REFS_TO_LIST + 50; i++) {
            exc.prependPath("fromObj", i);
        }
        Assert.assertEquals(JsonMappingException.MAX_REFS_TO_LIST, exc.getPath().size());
        Assert.assertEquals(JsonMappingException.MAX_REFS_TO_LIST - 1, exc.getPath().get(0).getIndex());
    }

    // ==========================================
    // Message and String Output Tests
    // ==========================================

    @Test
    public void testGetLocalizedMessage_withAndWithoutPath() {
        JsonMappingException exc = new JsonMappingException("base message");
        Assert.assertEquals("base message", exc.getLocalizedMessage());

        exc.prependPath("parent", "child");
        Assert.assertEquals("base message (through reference chain: java.lang.String[\"child\"])", exc.getLocalizedMessage());
    }

    @Test
    public void testGetMessage_nullOriginalMessageWithPath() {
        JsonMappingException exc = new JsonMappingException((String) null);
        Assert.assertNull(exc.getMessage());

        exc.prependPath("root", 0);
        Assert.assertEquals(" (through reference chain: java.lang.String[0])", exc.getMessage());
    }

    @Test
    public void testToString_formatting() {
        JsonMappingException exc = new JsonMappingException("test error");
        exc.prependPath("pojo", "prop");
        String expected = JsonMappingException.class.getName() + ": test error (through reference chain: java.lang.String[\"prop\"])";
        Assert.assertEquals(expected, exc.toString());
    }

    @Test
    public void testAppendPathDesc_nullPath() {
        JsonMappingException exc = new JsonMappingException("msg");
        StringBuilder sb = new StringBuilder("initial");
        exc._appendPathDesc(sb);
        Assert.assertEquals("initial", sb.toString());
    }
}
