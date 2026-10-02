package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException.Reference;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

public class JsonMappingExceptionTest {

    private final JsonFactory JSON_F = new JsonFactory();

    @Test
    public void testDeprecatedConstructors_variousInputs_success() {
        JsonMappingException exc1 = new JsonMappingException("msg1");
        Assert.assertEquals("msg1", exc1.getMessage());
        Assert.assertNull(exc1.getCause());

        Throwable cause = new RuntimeException("cause");
        JsonMappingException exc2 = new JsonMappingException("msg2", cause);
        Assert.assertEquals("msg2", exc2.getMessage());
        Assert.assertEquals(cause, exc2.getCause());

        JsonLocation loc = new JsonLocation("src", 100L, 1, 2);
        JsonMappingException exc3 = new JsonMappingException("msg3", loc);
        Assert.assertEquals(loc, exc3.getLocation());

        JsonMappingException exc4 = new JsonMappingException("msg4", loc, cause);
        Assert.assertEquals("msg4", exc4.getMessage());
        Assert.assertEquals(loc, exc4.getLocation());
        Assert.assertEquals(cause, exc4.getCause());
    }

    @Test
    public void testConstructorsWithCloseable_parserAndGenerator_success() throws Exception {
        JsonParser p = JSON_F.createParser("{\"a\":123}");
        p.nextToken();
        JsonMappingException excP = new JsonMappingException(p, "parse error");
        Assert.assertSame(p, excP.getProcessor());
        Assert.assertEquals(p.getTokenLocation(), excP.getLocation());
        p.close();

        JsonParser p2 = JSON_F.createParser("[]");
        Throwable cause = new IOException("io issue");
        JsonMappingException excP2 = new JsonMappingException(p2, "parse error 2", cause);
        Assert.assertSame(p2, excP2.getProcessor());
        Assert.assertSame(cause, excP2.getCause());
        p2.close();

        Closeable customCloseable = new Closeable() {
            @Override
            public void close() throws IOException {}
        };
        JsonLocation loc = new JsonLocation("src", 50L, 5, 10);
        JsonMappingException excC = new JsonMappingException(customCloseable, "custom msg", loc);
        Assert.assertSame(customCloseable, excC.getProcessor());
        Assert.assertEquals(loc, excC.getLocation());
    }

    @Test
    public void testFromFactoryMethods_parserAndGenerator_success() throws Exception {
        JsonParser p = JSON_F.createParser("123");
        JsonMappingException exc1 = JsonMappingException.from(p, "from parser");
        Assert.assertSame(p, exc1.getProcessor());
        Assert.assertEquals("from parser", exc1.getMessage());

        Throwable t = new RuntimeException("err");
        JsonMappingException exc2 = JsonMappingException.from(p, "from parser with cause", t);
        Assert.assertSame(p, exc2.getProcessor());
        Assert.assertSame(t, exc2.getCause());
        p.close();

        StringWriter sw = new StringWriter();
        JsonGenerator g = JSON_F.createGenerator(sw);
        JsonMappingException exc3 = JsonMappingException.from(g, "from generator");
        Assert.assertSame(g, exc3.getProcessor());
        Assert.assertNull(exc3.getCause());

        JsonMappingException exc4 = JsonMappingException.from(g, "from generator with cause", t);
        Assert.assertSame(g, exc4.getProcessor());
        Assert.assertSame(t, exc4.getCause());
        g.close();
    }

    @Test
    public void testFromFactoryMethods_deserializationContext_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonMappingException exc1 = JsonMappingException.from(ctxt, "deser error");
        Assert.assertNotNull(exc1);
        Assert.assertEquals("deser error", exc1.getMessage());

        Throwable t = new IllegalArgumentException("bad arg");
        JsonMappingException exc2 = JsonMappingException.from(ctxt, "deser error 2", t);
        Assert.assertSame(t, exc2.getCause());
    }

    @Test
    public void testFromFactoryMethods_serializerProvider_success() {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = mapper.getSerializerProvider();
        JsonMappingException exc1 = JsonMappingException.from(prov, "ser error");
        Assert.assertNotNull(exc1);
        Assert.assertEquals("ser error", exc1.getMessage());

        Throwable t = new IllegalStateException("bad state");
        JsonMappingException exc2 = JsonMappingException.from(prov, "ser error 2", t);
        Assert.assertSame(t, exc2.getCause());
    }

    @Test
    public void testFromUnexpectedIOE_variousIOEs_success() {
        IOException ioe1 = new IOException("disk failure");
        JsonMappingException jme1 = JsonMappingException.fromUnexpectedIOE(ioe1);
        Assert.assertTrue(jme1.getMessage().contains("Unexpected IOException (of type java.io.IOException): disk failure"));

        IOException ioe2 = new IOException((String) null);
        JsonMappingException jme2 = JsonMappingException.fromUnexpectedIOE(ioe2);
        Assert.assertTrue(jme2.getMessage().contains("null"));
    }

    @Test
    public void testWrapWithPath_withJsonMappingException_augmentsPath() {
        JsonMappingException base = new JsonMappingException("base error");
        JsonMappingException wrapped1 = JsonMappingException.wrapWithPath(base, "fromObj", "fieldName");
        Assert.assertSame(base, wrapped1);
        Assert.assertEquals(1, wrapped1.getPath().size());

        JsonMappingException wrapped2 = JsonMappingException.wrapWithPath(base, "fromObj2", 5);
        Assert.assertSame(base, wrapped2);
        Assert.assertEquals(2, wrapped2.getPath().size());

        Reference ref = new Reference("fromObj3", "third");
        JsonMappingException wrapped3 = JsonMappingException.wrapWithPath(base, ref);
        Assert.assertSame(base, wrapped3);
        Assert.assertEquals(3, wrapped3.getPath().size());
    }

    @Test
    public void testWrapWithPath_withNonJsonMappingException_createsNewInstance() {
        Exception orig = new Exception("original error");
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(orig, "mySource", "prop");
        Assert.assertEquals("original error", wrapped.getCause().getMessage());
        Assert.assertTrue(wrapped.getMessage().startsWith("original error"));
        Assert.assertEquals(1, wrapped.getPath().size());

        Exception emptyMsgExc = new Exception("");
        JsonMappingException wrappedEmpty = JsonMappingException.wrapWithPath(emptyMsgExc, "src", 0);
        Assert.assertTrue(wrappedEmpty.getMessage().contains("(was java.lang.Exception)"));

        Exception nullMsgExc = new Exception((String) null);
        JsonMappingException wrappedNull = JsonMappingException.wrapWithPath(nullMsgExc, "src", 1);
        Assert.assertTrue(wrappedNull.getMessage().contains("(was java.lang.Exception)"));
    }

    @Test
    public void testWrapWithPath_withJsonProcessingException_preservesProcessor() throws Exception {
        JsonParser p = JSON_F.createParser("{\"foo\": 1}");
        JsonProcessingException jpe = new JsonProcessingException("proc error", p.getTokenLocation()) {
            private static final long serialVersionUID = 1L;
            @Override
            public Object getProcessor() {
                return p;
            }
        };

        JsonMappingException wrapped = JsonMappingException.wrapWithPath(jpe, "myBean", "field");
        Assert.assertSame(p, wrapped.getProcessor());
        p.close();

        JsonProcessingException jpeNonCloseable = new JsonProcessingException("proc error 2") {
            private static final long serialVersionUID = 1L;
            @Override
            public Object getProcessor() {
                return "NotACloseable";
            }
        };
        JsonMappingException wrapped2 = JsonMappingException.wrapWithPath(jpeNonCloseable, "myBean", 1);
        Assert.assertNull(wrapped2.getProcessor());
    }

    @Test
    public void testGetPathAndPrependPath_variousScenarios_verified() {
        JsonMappingException exc = new JsonMappingException("test");
        Assert.assertTrue(exc.getPath().isEmpty());
        Assert.assertEquals("", exc.getPathReference());
        Assert.assertEquals("test", exc.getMessage());
        Assert.assertEquals("test", exc.getLocalizedMessage());

        StringBuilder sb = new StringBuilder("prefix:");
        exc.getPathReference(sb);
        Assert.assertEquals("prefix:", sb.toString());

        exc.prependPath("classRef", "myField");
        exc.prependPath("arrayRef", 2);
        Reference customRef = new Reference("anotherRef", "lastField");
        exc.prependPath(customRef);

        List<Reference> path = exc.getPath();
        Assert.assertEquals(3, path.size());
        Assert.assertSame(customRef, path.get(0));

        try {
            path.clear();
            Assert.fail("getPath() should return an unmodifiable list");
        } catch (UnsupportedOperationException e) {
            // expected
        }

        String pathRef = exc.getPathReference();
        Assert.assertTrue(pathRef.contains("->"));
        Assert.assertTrue(exc.getMessage().contains("through reference chain: "));
        Assert.assertTrue(exc.getLocalizedMessage().contains("through reference chain: "));
        Assert.assertTrue(exc.toString().startsWith(JsonMappingException.class.getName() + ": "));
    }

    @Test
    public void testMessageWithNullOriginalMessageAndPath() {
        JsonMappingException exc = new JsonMappingException((String) null);
        exc.prependPath("source", "field");
        Assert.assertTrue(exc.getMessage().startsWith(" (through reference chain: "));
    }

    @Test
    public void testPrependPath_maxRefsLimit_doesNotExceedLimit() {
        JsonMappingException exc = new JsonMappingException("limit test");
        for (int i = 0; i < JsonMappingException.MAX_REFS_TO_LIST + 50; i++) {
            exc.prependPath("item", i);
        }
        Assert.assertEquals(JsonMappingException.MAX_REFS_TO_LIST, exc.getPath().size());
    }

    @Test
    public void testReference_constructorsAndGettersSetters() {
        Reference refDefault = new Reference();
        Assert.assertNull(refDefault.getFrom());
        Assert.assertNull(refDefault.getFieldName());
        Assert.assertEquals(-1, refDefault.getIndex());
        Assert.assertEquals("UNKNOWN[?]", refDefault.getDescription());

        refDefault.setFieldName("customField");
        refDefault.setIndex(10);
        refDefault.setDescription("customDesc");
        Assert.assertEquals("customField", refDefault.getFieldName());
        Assert.assertEquals(10, refDefault.getIndex());
        Assert.assertEquals("customDesc", refDefault.getDescription());
        Assert.assertEquals("customDesc", refDefault.toString());

        Reference refFrom = new Reference("fromOnly");
        Assert.assertEquals("fromOnly", refFrom.getFrom());
        Assert.assertEquals("java.lang.String[?]", refFrom.getDescription());

        Reference refField = new Reference(new StringBuilder(), "fieldA");
        Assert.assertEquals("fieldA", refField.getFieldName());
        Assert.assertEquals("java.lang.StringBuilder[\"fieldA\"]", refField.getDescription());

        Reference refIdx = new Reference(new int[0], 3);
        Assert.assertEquals(3, refIdx.getIndex());
        Assert.assertEquals("int[][3]", refIdx.getDescription());

        Reference refClass = new Reference(String.class, "length");
        Assert.assertEquals(String.class, refClass.getFrom());
        Assert.assertEquals("java.lang.String[\"length\"]", refClass.getDescription());
    }

    @Test(expected = NullPointerException.class)
    public void testReference_constructorNullFieldName_throwsException() {
        new Reference("fromObj", (String) null);
    }

    private static class InnerTestClass {}

    @Test
    public void testReference_descriptionFormattingEdgeCases() {
        Reference refInner = new Reference(new InnerTestClass(), "innerField");
        String desc = refInner.getDescription();
        Assert.assertTrue(desc.contains("JsonMappingExceptionTest$InnerTestClass[\"innerField\"]"));

        Reference refNegIndex = new Reference("src", -5);
        Assert.assertEquals("java.lang.String[?]", refNegIndex.getDescription());

        Reference refZeroIndex = new Reference("src", 0);
        Assert.assertEquals("java.lang.String[0]", refZeroIndex.getDescription());
    }

    @Test
    public void testReference_serializationAndWriteReplace() throws Exception {
        Reference original = new Reference("serializableSource", "propName");
        Assert.assertNotNull(original.writeReplace());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Reference deserialized = (Reference) ois.readObject();
        ois.close();

        Assert.assertNull(deserialized.getFrom());
        Assert.assertEquals("propName", deserialized.getFieldName());
        Assert.assertEquals("java.lang.String[\"propName\"]", deserialized.getDescription());
    }

    @Test
    public void testJsonMappingException_serialization() throws Exception {
        JsonMappingException orig = new JsonMappingException("serializable exc");
        orig.prependPath(new Reference("myObj", "myField"));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(orig);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        JsonMappingException deserialized = (JsonMappingException) ois.readObject();
        ois.close();

        Assert.assertTrue(deserialized.getMessage().contains("serializable exc"));
        Assert.assertTrue(deserialized.getMessage().contains("myField"));
        Assert.assertNull(deserialized.getProcessor());
    }
}
