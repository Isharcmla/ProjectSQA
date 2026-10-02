package com.fasterxml.jackson.databind;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObjectReaderTest {

    private ObjectMapper mapper;
    private ObjectReader reader;

    public static class SimpleBean {
        public int id;
        public String name;

        public SimpleBean() {}

        public SimpleBean(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SimpleBean)) return false;
            SimpleBean that = (SimpleBean) o;
            return id == that.id && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    @JsonRootName("root")
    public static class RootBean {
        public int value;

        public RootBean() {}

        public RootBean(int value) {
            this.value = value;
        }
    }

    public static class InjectedBean {
        @JacksonInject("injectedVal")
        public String injected;
        public int number;
    }

    public enum TestFormatFeature implements FormatFeature {
        TEST_FEATURE(true);

        private final boolean _defaultState;
        private final int _mask;

        TestFormatFeature(boolean defaultState) {
            _defaultState = defaultState;
            _mask = (1 << ordinal());
        }

        @Override
        public boolean enabledByDefault() {
            return _defaultState;
        }

        @Override
        public int getMask() {
            return _mask;
        }

        @Override
        public boolean enabledIn(int flags) {
            return (flags & _mask) != 0;
        }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        reader = mapper.reader();
    }

    @Test
    public void testVersion_returnsNonNullPackageVersion() {
        Version version = reader.version();
        Assert.assertNotNull(version);
        Assert.assertFalse(version.isUnknownVersion());
    }

    @Test
    public void testGettersAndStateChecking() {
        Assert.assertNotNull(reader.getConfig());
        Assert.assertNotNull(reader.getFactory());
        Assert.assertNotNull(reader.getTypeFactory());
        Assert.assertNotNull(reader.getAttributes());
        Assert.assertNull(reader.getInjectableValues());

        Assert.assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertTrue(reader.isEnabled(MapperFeature.USE_ANNOTATIONS));
        Assert.assertTrue(reader.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));
    }

    @Test
    public void testWithAndWithoutDeserializationFeatures() {
        ObjectReader r = reader.with(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));

        r = r.with(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        Assert.assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT));

        r = r.withFeatures(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Assert.assertTrue(r.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));

        r = r.without(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Assert.assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));

        r = r.without(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, DeserializationFeature.ACCEPT_FLOAT_AS_INT);
        Assert.assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT));

        r = r.withoutFeatures(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertFalse(r.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));
    }

    @Test
    public void testWithAndWithoutJsonParserFeatures() {
        ObjectReader r = reader.with(JsonParser.Feature.ALLOW_COMMENTS);
        Assert.assertTrue(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));

        r = r.withFeatures(JsonParser.Feature.ALLOW_YAML_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        Assert.assertTrue(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask()));

        r = r.without(JsonParser.Feature.ALLOW_COMMENTS);
        Assert.assertFalse(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));

        r = r.withoutFeatures(JsonParser.Feature.ALLOW_YAML_COMMENTS, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        Assert.assertFalse(r.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask()));
    }

    @Test
    public void testWithAndWithoutFormatFeatures() {
        ObjectReader r = reader.with((FormatFeature) TestFormatFeature.TEST_FEATURE);
        Assert.assertNotNull(r);

        r = r.withFeatures((FormatFeature) TestFormatFeature.TEST_FEATURE);
        Assert.assertNotNull(r);

        r = r.without((FormatFeature) TestFormatFeature.TEST_FEATURE);
        Assert.assertNotNull(r);

        r = r.withoutFeatures((FormatFeature) TestFormatFeature.TEST_FEATURE);
        Assert.assertNotNull(r);
    }

    @Test
    public void testWithJsonFactory() {
        Assert.assertSame(reader, reader.with(reader.getFactory()));

        JsonFactory customFactory = new JsonFactory();
        ObjectReader newReader = reader.with(customFactory);
        Assert.assertNotSame(reader, newReader);
        Assert.assertSame(customFactory, newReader.getFactory());
        Assert.assertSame(newReader, customFactory.getCodec());
    }

    @Test
    public void testWithJsonNodeFactory() {
        JsonNodeFactory customFactory = new JsonNodeFactory(true);
        ObjectReader r = reader.with(customFactory);
        Assert.assertNotNull(r);
        Assert.assertSame(customFactory, r.getConfig().getNodeFactory());
    }

    @Test
    public void testWithRootNameConfigurations() {
        ObjectReader r = reader.withRootName("myRoot");
        Assert.assertNotNull(r);

        r = reader.withRootName(PropertyName.construct("customRoot"));
        Assert.assertNotNull(r);

        r = reader.withoutRootName();
        Assert.assertNotNull(r);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithFormatSchema_unsupportedSchemaThrowsException() {
        FormatSchema schema = new FormatSchema() {
            @Override
            public String getSchemaType() {
                return "unsupported";
            }
        };
        reader.with(schema);
    }

    @Test
    public void testWithFormatSchema_sameSchemaReturnsThis() {
        Assert.assertSame(reader, reader.with((FormatSchema) null));
    }

    @Test
    public void testTypeConfigurations() {
        JavaType javaType = TypeFactory.defaultInstance().constructType(SimpleBean.class);

        ObjectReader r1 = reader.forType(SimpleBean.class);
        Assert.assertSame(r1, r1.forType(SimpleBean.class));

        ObjectReader r2 = reader.forType(javaType);
        Assert.assertSame(r2, r2.forType(javaType));

        ObjectReader r3 = reader.forType(new TypeReference<List<SimpleBean>>() {});
        Assert.assertNotNull(r3);

        @SuppressWarnings("deprecation")
        ObjectReader r4 = reader.withType(SimpleBean.class);
        Assert.assertNotNull(r4);

        @SuppressWarnings("deprecation")
        ObjectReader r5 = reader.withType(javaType);
        Assert.assertNotNull(r5);

        @SuppressWarnings("deprecation")
        ObjectReader r6 = reader.withType(SimpleBean.class.getGenericSuperclass());
        Assert.assertNotNull(r6);

        @SuppressWarnings("deprecation")
        ObjectReader r7 = reader.withType(new TypeReference<SimpleBean>() {});
        Assert.assertNotNull(r7);
    }

    @Test
    public void testWithValueToUpdate() throws Exception {
        SimpleBean target = new SimpleBean(1, "original");
        ObjectReader updater = reader.withValueToUpdate(target);

        Assert.assertSame(updater, updater.withValueToUpdate(target));

        ObjectReader cleared = updater.withValueToUpdate(null);
        Assert.assertNotSame(updater, cleared);

        SimpleBean updated = updater.readValue("{\"name\":\"updated\"}");
        Assert.assertSame(target, updated);
        Assert.assertEquals(1, target.id);
        Assert.assertEquals("updated", target.name);

        ObjectReader untypedUpdater = mapper.reader().withValueToUpdate(new SimpleBean(10, "untyped"));
        SimpleBean untypedUpdated = untypedUpdater.readValue("{\"id\":20}");
        Assert.assertEquals(20, untypedUpdated.id);
    }

    @Test
    public void testContextAttributes() {
        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("k1", "v1");
        ObjectReader r = reader.with(attrs);
        Assert.assertEquals("v1", r.getAttributes().getAttribute("k1"));

        Map<String, Object> map = new HashMap<>();
        map.put("k2", "v2");
        r = r.withAttributes(map);
        Assert.assertEquals("v2", r.getAttributes().getAttribute("k2"));

        r = r.withAttribute("k3", "v3");
        Assert.assertEquals("v3", r.getAttributes().getAttribute("k3"));

        r = r.withoutAttribute("k3");
        Assert.assertNull(r.getAttributes().getAttribute("k3"));
    }

    @Test
    public void testMiscConfigurations() {
        Assert.assertSame(reader, reader.with(reader.getConfig()));
        Assert.assertNotSame(reader, reader.with(reader.getConfig().with(Locale.GERMAN)));

        ObjectReader r = reader.withView(String.class)
                .with(Locale.FRENCH)
                .with(TimeZone.getTimeZone("GMT"))
                .withHandler(new DeserializationProblemHandler() {})
                .with(Base64Variants.MODIFIED_FOR_URL);
        Assert.assertNotNull(r);

        InjectableValues injectables = new InjectableValues.Std().addValue("injectedVal", "injected!");
        Assert.assertSame(r, r.with((InjectableValues) null));
        r = r.with(injectables);
        Assert.assertSame(injectables, r.getInjectableValues());
        Assert.assertSame(r, r.with(injectables));
    }

    @Test
    public void testAtPointerFiltering() throws Exception {
        String json = "{\"a\":{\"b\":{\"id\":123,\"name\":\"nested\"}}}";
        ObjectReader r1 = reader.forType(SimpleBean.class).at("/a/b");
        SimpleBean bean1 = r1.readValue(json);
        Assert.assertEquals(123, bean1.id);
        Assert.assertEquals("nested", bean1.name);

        ObjectReader r2 = reader.forType(SimpleBean.class).at(JsonPointer.compile("/a/b"));
        SimpleBean bean2 = r2.readValue(json);
        Assert.assertEquals(123, bean2.id);
    }

    @Test
    public void testReadValue_fromVariousSources() throws Exception {
        String json = "{\"id\":42,\"name\":\"test\"}";
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
        ObjectReader r = reader.forType(SimpleBean.class);
        SimpleBean expected = new SimpleBean(42, "test");

        // String
        Assert.assertEquals(expected, r.readValue(json));

        // InputStream
        Assert.assertEquals(expected, r.readValue(new ByteArrayInputStream(bytes)));

        // Reader
        Assert.assertEquals(expected, r.readValue(new StringReader(json)));

        // byte[]
        Assert.assertEquals(expected, r.readValue(bytes));

        // byte[] with offset & length
        byte[] padded = new byte[bytes.length + 10];
        System.arraycopy(bytes, 0, padded, 5, bytes.length);
        Assert.assertEquals(expected, r.readValue(padded, 5, bytes.length));

        // File
        File tempFile = File.createTempFile("jackson_test", ".json");
        try {
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                fos.write(bytes);
            }
            Assert.assertEquals(expected, r.readValue(tempFile));

            // URL
            URL url = tempFile.toURI().toURL();
            Assert.assertEquals(expected, r.readValue(url));
        } finally {
            tempFile.delete();
        }

        // DataInput
        Assert.assertEquals(expected, r.readValue((DataInput) new DataInputStream(new ByteArrayInputStream(bytes))));

        // JsonNode
        JsonNode node = mapper.readTree(json);
        Assert.assertEquals(expected, r.readValue(node));

        // JsonParser variants
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            Assert.assertEquals(expected, r.readValue(p));
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            Assert.assertEquals(expected, reader.readValue(p, SimpleBean.class));
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            Assert.assertEquals(expected, reader.readValue(p, new TypeReference<SimpleBean>() {}));
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            JavaType t = mapper.constructType(SimpleBean.class);
            Assert.assertEquals(expected, reader.readValue(p, t));
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            JavaType t = mapper.constructType(SimpleBean.class);
            Assert.assertEquals(expected, reader.readValue(p, (com.fasterxml.jackson.core.type.ResolvedType) t));
        }
    }

    @Test
    public void testReadValues_fromVariousSources() throws Exception {
        String json = "{\"id\":1,\"name\":\"a\"} {\"id\":2,\"name\":\"b\"}";
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
        ObjectReader r = reader.forType(SimpleBean.class);

        // String
        List<SimpleBean> list = new ArrayList<>();
        MappingIterator<SimpleBean> it = r.readValues(json);
        while (it.hasNext()) list.add(it.next());
        Assert.assertEquals(2, list.size());

        // InputStream
        it = r.readValues(new ByteArrayInputStream(bytes));
        Assert.assertEquals(2, it.readAll().size());

        // Reader
        it = r.readValues(new StringReader(json));
        Assert.assertEquals(2, it.readAll().size());

        // byte[]
        it = r.readValues(bytes);
        Assert.assertEquals(2, it.readAll().size());

        // byte[] offset/len
        it = r.readValues(bytes, 0, bytes.length);
        Assert.assertEquals(2, it.readAll().size());

        // File & URL
        File tempFile = File.createTempFile("jackson_seq", ".json");
        try {
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                fos.write(bytes);
            }
            it = r.readValues(tempFile);
            Assert.assertEquals(2, it.readAll().size());

            it = r.readValues(tempFile.toURI().toURL());
            Assert.assertEquals(2, it.readAll().size());
        } finally {
            tempFile.delete();
        }

        // DataInput
        it = r.readValues((DataInput) new DataInputStream(new ByteArrayInputStream(bytes)));
        Assert.assertEquals(2, it.readAll().size());

        // JsonParser
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            it = r.readValues(p);
            Assert.assertEquals(2, it.readAll().size());
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            Iterator<SimpleBean> iter = reader.readValues(p, SimpleBean.class);
            Assert.assertTrue(iter.hasNext());
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            Iterator<SimpleBean> iter = reader.readValues(p, new TypeReference<SimpleBean>() {});
            Assert.assertTrue(iter.hasNext());
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            JavaType t = mapper.constructType(SimpleBean.class);
            Iterator<SimpleBean> iter = reader.readValues(p, t);
            Assert.assertTrue(iter.hasNext());
        }
        try (JsonParser p = mapper.getFactory().createParser(json)) {
            JavaType t = mapper.constructType(SimpleBean.class);
            Iterator<SimpleBean> iter = reader.readValues(p, (com.fasterxml.jackson.core.type.ResolvedType) t);
            Assert.assertTrue(iter.hasNext());
        }
    }

    @Test
    public void testReadTree_fromVariousSources() throws Exception {
        String json = "{\"key\":\"value\",\"num\":10}";
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);

        JsonNode n1 = reader.readTree(json);
        Assert.assertEquals("value", n1.get("key").asText());

        JsonNode n2 = reader.readTree(new ByteArrayInputStream(bytes));
        Assert.assertEquals(10, n2.get("num").asInt());

        JsonNode n3 = reader.readTree(new StringReader(json));
        Assert.assertEquals("value", n3.get("key").asText());

        JsonNode n4 = reader.readTree(bytes);
        Assert.assertEquals(10, n4.get("num").asInt());

        JsonNode n5 = reader.readTree(bytes, 0, bytes.length);
        Assert.assertEquals("value", n5.get("key").asText());

        JsonNode n6 = reader.readTree((DataInput) new DataInputStream(new ByteArrayInputStream(bytes)));
        Assert.assertEquals(10, n6.get("num").asInt());

        try (JsonParser p = mapper.getFactory().createParser(json)) {
            JsonNode n7 = reader.readTree(p);
            Assert.assertEquals("value", n7.get("key").asText());
        }

        // Empty input returns missing node
        JsonNode emptyNode = reader.readTree("");
        Assert.assertTrue(emptyNode.isMissingNode());

        // Null json literal returns NullNode
        JsonNode nullNode = reader.readTree("null");
        Assert.assertTrue(nullNode instanceof NullNode);
    }

    @Test
    public void testTreeCodecOperations() throws Exception {
        ArrayNode arr = reader.createArrayNode();
        Assert.assertNotNull(arr);
        Assert.assertTrue(arr.isArray());

        ObjectNode obj = reader.createObjectNode();
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj.isObject());

        obj.put("id", 99);
        obj.put("name", "codec");

        SimpleBean bean = reader.treeToValue(obj, SimpleBean.class);
        Assert.assertEquals(99, bean.id);
        Assert.assertEquals("codec", bean.name);

        try (JsonParser parser = reader.treeAsTokens(obj)) {
            Assert.assertNotNull(parser);
            Assert.assertNull(parser.getCurrentToken());
            Assert.assertEquals(JsonToken.START_OBJECT, parser.nextToken());
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValue_throwsUnsupportedOperationException() throws Exception {
        reader.writeValue(new JsonFactory().createGenerator(new StringWriter()), new Object());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTree_throwsUnsupportedOperationException() throws Exception {
        reader.writeTree(new JsonFactory().createGenerator(new StringWriter()), reader.createObjectNode());
    }

    @Test
    public void testRootUnwrapping() throws Exception {
        String json = "{\"root\":{\"value\":123}}";
        ObjectReader unwrappingReader = reader.forType(RootBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        RootBean bean = unwrappingReader.readValue(json);
        Assert.assertEquals(123, bean.value);

        // With value to update
        RootBean target = new RootBean();
        RootBean updated = unwrappingReader.withValueToUpdate(target).readValue(json);
        Assert.assertSame(target, updated);
        Assert.assertEquals(123, target.value);

        // With tree
        JsonNode tree = unwrappingReader.readTree(json);
        Assert.assertEquals(123, tree.get("value").asInt());
    }

    @Test(expected = JsonMappingException.class)
    public void testRootUnwrapping_mismatchedRootNameThrowsException() throws Exception {
        String json = "{\"wrongRoot\":{\"value\":123}}";
        ObjectReader unwrappingReader = reader.forType(RootBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        unwrappingReader.readValue(json);
    }

    @Test(expected = JsonMappingException.class)
    public void testRootUnwrapping_nonObjectThrowsException() throws Exception {
        String json = "[{\"value\":123}]";
        ObjectReader unwrappingReader = reader.forType(RootBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        unwrappingReader.readValue(json);
    }

    @Test
    public void testFailOnTrailingTokens() throws Exception {
        String json = "{\"id\":1,\"name\":\"test\"} 123";
        ObjectReader r = reader.forType(SimpleBean.class)
                .with(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);

        try {
            r.readValue(json);
            Assert.fail("Expected JsonMappingException on trailing tokens");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Trailing token"));
        }
    }

    @Test
    public void testNullAndEmptyTokenHandling() throws Exception {
        ObjectReader r = reader.forType(SimpleBean.class);

        // Null token without update object returns null
        Assert.assertNull(r.readValue("null"));

        // Null token with update object returns existing object
        SimpleBean target = new SimpleBean(5, "untouched");
        SimpleBean result = r.withValueToUpdate(target).readValue("null");
        Assert.assertSame(target, result);
        Assert.assertEquals(5, target.id);

        // Empty document mapping failure
        try {
            r.readValue("");
            Assert.fail("Expected mapping exception on empty input");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("No content to map"));
        }
    }

    @Test
    public void testFormatDetection_successfulDetection() throws Exception {
        ObjectReader r1 = mapper.readerFor(SimpleBean.class);
        ObjectReader detector = reader.withFormatDetection(r1);

        String json = "{\"id\":7,\"name\":\"format\"}";
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);

        SimpleBean b1 = detector.readValue(bytes);
        Assert.assertEquals(7, b1.id);

        SimpleBean b2 = detector.readValue(new ByteArrayInputStream(bytes));
        Assert.assertEquals(7, b2.id);

        SimpleBean b3 = detector.readValue(bytes, 0, bytes.length);
        Assert.assertEquals(7, b3.id);

        File tempFile = File.createTempFile("jackson_format", ".json");
        try {
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                fos.write(bytes);
            }
            SimpleBean b4 = detector.readValue(tempFile);
            Assert.assertEquals(7, b4.id);

            SimpleBean b5 = detector.readValue(tempFile.toURI().toURL());
            Assert.assertEquals(7, b5.id);

            MappingIterator<SimpleBean> it = detector.readValues(tempFile);
            Assert.assertEquals(1, it.readAll().size());

            it = detector.readValues(tempFile.toURI().toURL());
            Assert.assertEquals(1, it.readAll().size());
        } finally {
            tempFile.delete();
        }

        JsonNode tree = detector.readTree(new ByteArrayInputStream(bytes));
        Assert.assertEquals(7, tree.get("id").asInt());

        MappingIterator<SimpleBean> it = detector.readValues(new ByteArrayInputStream(bytes));
        Assert.assertEquals(1, it.readAll().size());

        it = detector.readValues(bytes);
        Assert.assertEquals(1, it.readAll().size());

        it = detector.readValues(bytes, 0, bytes.length);
        Assert.assertEquals(1, it.readAll().size());
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_unrecognizedFormatThrowsException() throws Exception {
        DataFormatReaders dfr = new DataFormatReaders(new ObjectReader[0]);
        ObjectReader detector = reader.withFormatDetection(dfr);
        detector.readValue("not-json".getBytes(StandardCharsets.UTF_8));
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_charBasedReaderThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValue(new StringReader("{}"));
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_stringSourceThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValue("{}");
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_treeSourceThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValue(mapper.createObjectNode());
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_dataInputThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValue((DataInput) new DataInputStream(new ByteArrayInputStream(new byte[0])));
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readTreeReaderThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readTree(new StringReader("{}"));
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readTreeStringThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readTree("{}");
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readTreeBytesThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readTree(new byte[0]);
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readTreeBytesOffsetThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readTree(new byte[0], 0, 0);
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readTreeDataInputThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readTree((DataInput) new DataInputStream(new ByteArrayInputStream(new byte[0])));
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readValuesReaderThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValues(new StringReader("{}"));
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readValuesStringThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValues("{}");
    }

    @Test(expected = JsonParseException.class)
    public void testFormatDetection_readValuesDataInputThrowsException() throws Exception {
        ObjectReader detector = reader.withFormatDetection(reader);
        detector.readValues((DataInput) new DataInputStream(new ByteArrayInputStream(new byte[0])));
    }

    @Test
    public void testInjectableValuesSupport() throws Exception {
        InjectableValues injectables = new InjectableValues.Std().addValue("injectedVal", "customValue");
        ObjectReader r = reader.forType(InjectedBean.class).with(injectables);

        InjectedBean bean = r.readValue("{\"number\":55}");
        Assert.assertEquals("customValue", bean.injected);
        Assert.assertEquals(55, bean.number);
    }

    @Test(expected = JsonMappingException.class)
    public void testMissingTypeDefinition_throwsBadDefinitionException() throws Exception {
        // Construct parser directly without configured type and invoke internal binding without prefetch
        try (JsonParser p = mapper.getFactory().createParser("{\"id\":1}")) {
            reader.readValue(p);
        }
    }
}
