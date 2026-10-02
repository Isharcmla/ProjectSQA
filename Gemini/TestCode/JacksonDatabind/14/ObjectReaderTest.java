package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.SimpleType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private ObjectMapper mapper;
    private ObjectReader reader;

    public static class SimpleBean {
        public int x;
        public String name;

        public SimpleBean() {}

        public SimpleBean(int x, String name) {
            this.x = x;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SimpleBean)) return false;
            SimpleBean that = (SimpleBean) o;
            return x == that.x && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, name);
        }
    }

    public static class InjectedBean {
        public int id;
        public String value;
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        reader = mapper.reader();
    }

    @Test
    public void testVersion_returnsNonNullVersion() {
        Version v = reader.version();
        assertNotNull(v);
        assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testConfigAccessors_returnExpectedSettings() {
        assertNotNull(reader.getConfig());
        assertNotNull(reader.getFactory());
        assertNotNull(reader.getJsonFactory());
        assertNotNull(reader.getTypeFactory());
        assertNotNull(reader.getAttributes());

        assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(reader.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION));
        assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithAndWithoutDeserializationFeature_updatesStateCorrectly() {
        ObjectReader r = reader.with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));

        r = r.without(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));

        r = r.with(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT));

        r = r.without(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT));

        r = r.withFeatures(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        assertTrue(r.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS));

        r = r.withoutFeatures(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        assertFalse(r.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS));
    }

    @Test
    public void testWithAndWithoutJsonParserFeature_updatesStateCorrectly() {
        ObjectReader r = reader.with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));

        r = r.without(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));

        r = r.withFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        assertTrue(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));
        assertTrue(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask()));

        r = r.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        assertFalse(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));
        assertFalse(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask()));
    }

    @Test
    public void testWithDeserializationConfig_sameAndDifferent() {
        assertSame(reader, reader.with(reader.getConfig()));
        DeserializationConfig newConfig = reader.getConfig().with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        ObjectReader r = reader.with(newConfig);
        assertNotSame(reader, r);
        assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
    }

    @Test
    public void testWithInjectableValues_injectsValue() throws Exception {
        InjectableValues.Std inject = new InjectableValues.Std();
        inject.addValue(String.class, "injected-str");

        ObjectReader r = reader.with(inject);
        assertSame(r, r.with(inject));
        assertNotSame(reader, r);
    }

    @Test
    public void testWithJsonNodeFactory_createsConfiguredNodes() {
        JsonNodeFactory customFactory = new JsonNodeFactory(true);
        ObjectReader r = reader.with(customFactory);
        assertNotSame(reader, r);
    }

    @Test
    public void testWithJsonFactory_swapsFactory() {
        JsonFactory f = new JsonFactory();
        ObjectReader r = reader.with(f);
        assertSame(f, r.getFactory());
        assertSame(r, r.with(f));
    }

    @Test
    public void testWithRootName_setsCustomRootName() throws Exception {
        ObjectReader r = reader.withRootName("customRoot").forType(SimpleBean.class);
        ObjectReader unwrappingReader = r.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        String json = "{\"customRoot\":{\"x\":42,\"name\":\"test\"}}";
        SimpleBean bean = unwrappingReader.readValue(json);
        assertEquals(42, bean.x);
        assertEquals("test", bean.name);
    }

    @Test
    public void testWithFormatSchema_nullAndUnmatched() {
        assertSame(reader, reader.with((FormatSchema) null));
        FormatSchema dummySchema = new FormatSchema() {
            @Override
            public String getSchemaType() {
                return "dummy";
            }
        };
        try {
            reader.with(dummySchema);
            fail("Should have failed on unsupported schema");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not use FormatSchema"));
        }
    }

    @Test
    public void testForTypeAndWithTypeVariations() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);

        ObjectReader r1 = reader.forType(SimpleBean.class);
        assertSame(r1, r1.forType(SimpleBean.class));

        ObjectReader r2 = reader.forType(type);
        assertSame(r2, r2.forType(type));

        ObjectReader r3 = reader.forType(new TypeReference<SimpleBean>() {});
        assertNotNull(r3);

        @SuppressWarnings("deprecation")
        ObjectReader r4 = reader.withType(SimpleBean.class);
        @SuppressWarnings("deprecation")
        ObjectReader r5 = reader.withType(type);
        @SuppressWarnings("deprecation")
        ObjectReader r6 = reader.withType((java.lang.reflect.Type) SimpleBean.class);
        @SuppressWarnings("deprecation")
        ObjectReader r7 = reader.withType(new TypeReference<SimpleBean>() {});

        String json = "{\"x\":10,\"name\":\"A\"}";
        SimpleBean b1 = r1.readValue(json);
        SimpleBean b2 = r2.readValue(json);
        SimpleBean b3 = r3.readValue(json);
        SimpleBean b4 = r4.readValue(json);
        SimpleBean b5 = r5.readValue(json);
        SimpleBean b6 = r6.readValue(json);
        SimpleBean b7 = r7.readValue(json);

        assertEquals(10, b1.x);
        assertEquals(b1, b2);
        assertEquals(b1, b3);
        assertEquals(b1, b4);
        assertEquals(b1, b5);
        assertEquals(b1, b6);
        assertEquals(b1, b7);
    }

    @Test
    public void testWithValueToUpdate_updatesExistingInstance() throws Exception {
        SimpleBean target = new SimpleBean(1, "old");
        ObjectReader updatingReader = reader.withValueToUpdate(target);
        assertSame(updatingReader, updatingReader.withValueToUpdate(target));

        SimpleBean updated = updatingReader.readValue("{\"name\":\"new\"}");
        assertSame(target, updated);
        assertEquals(1, target.x);
        assertEquals("new", target.name);

        try {
            reader.withValueToUpdate(null);
            fail("Should fail on null update target");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("null"));
        }

        try {
            reader.forType(int[].class).withValueToUpdate(new int[]{1, 2});
            fail("Should fail on array update target");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Can not update an array"));
        }
    }

    @Test
    public void testFluentContextAndAttributes() {
        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("k1", "v1");
        ObjectReader r = reader.with(attrs);
        assertEquals("v1", r.getAttributes().getAttribute("k1"));

        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("k2", "v2");
        r = r.withAttributes(map);
        assertEquals("v2", r.getAttributes().getAttribute("k2"));

        r = r.withAttribute("k3", "v3");
        assertEquals("v3", r.getAttributes().getAttribute("k3"));

        r = r.withoutAttribute("k3");
        assertNull(r.getAttributes().getAttribute("k3"));

        r = r.with(Locale.GERMANY).with(TimeZone.getTimeZone("GMT+1"))
                .with(Base64Variants.MIME)
                .withView(Object.class)
                .withHandler(new DeserializationProblemHandler() {});
        assertNotNull(r);
    }

    @Test
    public void testTreeCodecMethods_nodeCreationAndParsing() throws Exception {
        ArrayNode arr = reader.createArrayNode();
        assertNotNull(arr);
        ObjectNode obj = reader.createObjectNode();
        assertNotNull(obj);
        obj.put("x", 5);

        JsonParser parser = reader.treeAsTokens(obj);
        assertNotNull(parser);
        assertEquals(JsonToken.START_OBJECT, parser.nextToken());

        SimpleBean b = reader.treeToValue(obj, SimpleBean.class);
        assertEquals(5, b.x);

        JsonNode tree = reader.readTree(reader.getFactory().createParser("{\"x\":99}"));
        assertEquals(99, tree.get("x").asInt());

        try {
            reader.writeTree(null, null);
            fail("writeTree should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {}

        try {
            reader.writeValue(null, null);
            fail("writeValue should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {}
    }

    @Test
    public void testReadValueFromVariousSources() throws Exception {
        String json = "{\"x\":123,\"name\":\"source\"}";
        byte[] bytes = json.getBytes("UTF-8");

        ObjectReader r = reader.forType(SimpleBean.class);

        // JsonParser variants
        JsonParser p1 = r.getFactory().createParser(json);
        SimpleBean b1 = r.readValue(p1);
        assertEquals(123, b1.x);

        JsonParser p2 = r.getFactory().createParser(json);
        SimpleBean b2 = reader.readValue(p2, SimpleBean.class);
        assertEquals(123, b2.x);

        JsonParser p3 = r.getFactory().createParser(json);
        SimpleBean b3 = reader.readValue(p3, new TypeReference<SimpleBean>() {});
        assertEquals(123, b3.x);

        JsonParser p4 = r.getFactory().createParser(json);
        SimpleBean b4 = reader.readValue(p4, (ResolvedType) mapper.constructType(SimpleBean.class));
        assertEquals(123, b4.x);

        JsonParser p5 = r.getFactory().createParser(json);
        SimpleBean b5 = reader.readValue(p5, mapper.constructType(SimpleBean.class));
        assertEquals(123, b5.x);

        // Stream, Reader, String, Byte Array
        SimpleBean fromStream = r.readValue(new ByteArrayInputStream(bytes));
        assertEquals(123, fromStream.x);

        SimpleBean fromReader = r.readValue(new StringReader(json));
        assertEquals(123, fromReader.x);

        SimpleBean fromString = r.readValue(json);
        assertEquals(123, fromString.x);

        SimpleBean fromBytes = r.readValue(bytes);
        assertEquals(123, fromBytes.x);

        SimpleBean fromBytesOffset = r.readValue(bytes, 0, bytes.length);
        assertEquals(123, fromBytesOffset.x);

        // File and URL
        File file = tempFolder.newFile("test.json");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.close();

        SimpleBean fromFile = r.readValue(file);
        assertEquals(123, fromFile.x);

        URL url = file.toURI().toURL();
        SimpleBean fromUrl = r.readValue(url);
        assertEquals(123, fromUrl.x);

        // JsonNode
        JsonNode node = r.readTree(json);
        SimpleBean fromNode = r.readValue(node);
        assertEquals(123, fromNode.x);
    }

    @Test
    public void testReadTreeFromVariousSources() throws Exception {
        String json = "{\"a\":\"hello\",\"b\":123}";
        byte[] bytes = json.getBytes("UTF-8");

        JsonNode n1 = reader.readTree(new ByteArrayInputStream(bytes));
        assertEquals("hello", n1.get("a").asText());

        JsonNode n2 = reader.readTree(new StringReader(json));
        assertEquals(123, n2.get("b").asInt());

        JsonNode n3 = reader.readTree(json);
        assertEquals("hello", n3.get("a").asText());
    }

    @Test
    public void testReadValuesSequence_multiValue() throws Exception {
        String seq = "{\"x\":1,\"name\":\"A\"}\n{\"x\":2,\"name\":\"B\"}";
        byte[] bytes = seq.getBytes("UTF-8");
        ObjectReader r = reader.forType(SimpleBean.class);

        // Stream
        MappingIterator<SimpleBean> it1 = r.readValues(new ByteArrayInputStream(bytes));
        assertTrue(it1.hasNext());
        assertEquals(1, it1.next().x);
        assertEquals(2, it1.next().x);
        assertFalse(it1.hasNext());
        it1.close();

        // Reader
        MappingIterator<SimpleBean> it2 = r.readValues(new StringReader(seq));
        assertEquals(1, it2.next().x);
        it2.close();

        // String
        MappingIterator<SimpleBean> it3 = r.readValues(seq);
        assertEquals(1, it3.next().x);
        it3.close();

        // byte array
        MappingIterator<SimpleBean> it4 = r.readValues(bytes, 0, bytes.length);
        assertEquals(1, it4.next().x);
        it4.close();

        MappingIterator<SimpleBean> it5 = r.readValues(bytes);
        assertEquals(1, it5.next().x);
        it5.close();

        // File and URL
        File file = tempFolder.newFile("seq.json");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.close();

        MappingIterator<SimpleBean> itFile = r.readValues(file);
        assertEquals(1, itFile.next().x);
        itFile.close();

        MappingIterator<SimpleBean> itUrl = r.readValues(file.toURI().toURL());
        assertEquals(1, itUrl.next().x);
        itUrl.close();

        // JsonParser overloads
        JsonParser p = r.getFactory().createParser(seq);
        Iterator<SimpleBean> itPClass = reader.readValues(p, SimpleBean.class);
        assertTrue(itPClass.hasNext());
        assertEquals(1, itPClass.next().x);

        p = r.getFactory().createParser(seq);
        Iterator<SimpleBean> itPTypeRef = reader.readValues(p, new TypeReference<SimpleBean>() {});
        assertTrue(itPTypeRef.hasNext());
        assertEquals(1, itPTypeRef.next().x);

        p = r.getFactory().createParser(seq);
        Iterator<SimpleBean> itPResType = reader.readValues(p, (ResolvedType) mapper.constructType(SimpleBean.class));
        assertTrue(itPResType.hasNext());
        assertEquals(1, itPResType.next().x);

        p = r.getFactory().createParser(seq);
        Iterator<SimpleBean> itPJType = reader.readValues(p, mapper.constructType(SimpleBean.class));
        assertTrue(itPJType.hasNext());
        assertEquals(1, itPJType.next().x);

        p = r.getFactory().createParser(seq);
        MappingIterator<SimpleBean> itParser = r.readValues(p);
        assertTrue(itParser.hasNext());
        assertEquals(1, itParser.next().x);
    }

    @Test
    public void testFormatAutoDetection_successAndFailures() throws Exception {
        ObjectReader r1 = mapper.readerFor(SimpleBean.class);
        ObjectReader rDetect = reader.withFormatDetection(r1);
        assertNotNull(rDetect);

        String json = "{\"x\":55,\"name\":\"detected\"}";
        byte[] bytes = json.getBytes("UTF-8");

        SimpleBean bFromStream = rDetect.readValue(new ByteArrayInputStream(bytes));
        assertEquals(55, bFromStream.x);

        SimpleBean bFromBytes = rDetect.readValue(bytes);
        assertEquals(55, bFromBytes.x);

        SimpleBean bFromBytesOffset = rDetect.readValue(bytes, 0, bytes.length);
        assertEquals(55, bFromBytesOffset.x);

        File f = tempFolder.newFile("detect.json");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(bytes);
        fos.close();

        SimpleBean bFromFile = rDetect.readValue(f);
        assertEquals(55, bFromFile.x);

        SimpleBean bFromUrl = rDetect.readValue(f.toURI().toURL());
        assertEquals(55, bFromUrl.x);

        JsonNode tree = rDetect.readTree(new ByteArrayInputStream(bytes));
        assertEquals(55, tree.get("x").asInt());

        MappingIterator<SimpleBean> it = rDetect.readValues(new ByteArrayInputStream(bytes));
        assertTrue(it.hasNext());
        assertEquals(55, it.next().x);
        it.close();

        MappingIterator<SimpleBean> itBytes = rDetect.readValues(bytes, 0, bytes.length);
        assertTrue(itBytes.hasNext());
        assertEquals(55, itBytes.next().x);
        itBytes.close();

        MappingIterator<SimpleBean> itFile = rDetect.readValues(f);
        assertTrue(itFile.hasNext());
        assertEquals(55, itFile.next().x);
        itFile.close();

        MappingIterator<SimpleBean> itUrl = rDetect.readValues(f.toURI().toURL());
        assertTrue(itUrl.hasNext());
        assertEquals(55, itUrl.next().x);
        itUrl.close();

        // Incompatible char sources should throw JsonParseException
        try {
            rDetect.readValue(json);
            fail("Should fail on String source with format detection");
        } catch (JsonParseException expected) {}

        try {
            rDetect.readValue(new StringReader(json));
            fail("Should fail on Reader source with format detection");
        } catch (JsonParseException expected) {}

        try {
            rDetect.readValue(tree);
            fail("Should fail on JsonNode source with format detection");
        } catch (JsonParseException expected) {}

        try {
            rDetect.readTree(new StringReader(json));
            fail("Should fail on Reader source tree read");
        } catch (JsonParseException expected) {}

        try {
            rDetect.readTree(json);
            fail("Should fail on String source tree read");
        } catch (JsonParseException expected) {}

        try {
            rDetect.readValues(new StringReader(json));
            fail("Should fail on Reader source values read");
        } catch (JsonParseException expected) {}

        try {
            rDetect.readValues(json);
            fail("Should fail on String source values read");
        } catch (JsonParseException expected) {}

        // Format detection matching nothing
        DataFormatReaders emptyDfr = new DataFormatReaders(new ObjectReader[0]);
        ObjectReader noMatchReader = reader.withFormatDetection(emptyDfr);
        try {
            noMatchReader.readValue(bytes);
            fail("Should fail when no format matches");
        } catch (JsonParseException expected) {}
    }

    @Test
    public void testNullAndEmptyTokenHandling() throws Exception {
        ObjectReader r = reader.forType(SimpleBean.class);

        // Null token
        SimpleBean bNull = r.readValue("null");
        assertNull(bNull);

        // Null token with valueToUpdate
        SimpleBean existing = new SimpleBean(7, "init");
        SimpleBean updatedNull = r.withValueToUpdate(existing).readValue("null");
        assertSame(existing, updatedNull);

        // Empty token / end of input
        try {
            r.readValue("");
            fail("Should throw on empty input");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("No content to map due to end-of-input"));
        }

        // Tree null token
        JsonNode nullNode = reader.readTree("null");
        assertTrue(nullNode.isNull());
    }

    @Test
    public void testRootUnwrappingFailures() throws Exception {
        ObjectReader r = reader.forType(SimpleBean.class).with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        // Current token not START_OBJECT
        try {
            r.readValue("[1, 2]");
            fail("Should fail unwrapping non-object");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Current token not START_OBJECT"));
        }

        // Empty object (token not FIELD_NAME)
        try {
            r.readValue("{}");
            fail("Should fail unwrapping empty object without field");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("Current token not FIELD_NAME"));
        }

        // Field name mismatch
        try {
            r.readValue("{\"WrongName\":{\"x\":1}}");
            fail("Should fail unwrapping mismatched field name");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("does not match expected"));
        }

        // Unwrapped tree reading
        ObjectReader treeReader = reader.with(DeserializationFeature.UNWRAP_ROOT_VALUE).withRootName("root");
        JsonNode unwrappedTree = treeReader.readTree("{\"root\":{\"a\":123}}");
        assertEquals(123, unwrappedTree.get("a").asInt());
    }

    @Test
    public void testFindRootDeserializerWithoutType_throwsException() throws Exception {
        ObjectReader r = mapper.reader((JavaType) null);
        try {
            r.readValue("123");
            fail("Should throw JsonMappingException when reading without configured type");
        } catch (JsonMappingException expected) {
            assertTrue(expected.getMessage().contains("No value type configured"));
        }
    }
}
