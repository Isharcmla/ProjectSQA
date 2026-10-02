package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class ObjectReaderTest {

    static class Views {
        static class Public {}
        static class Internal extends Public {}
    }

    static class SimpleBean {
        @JsonView(Views.Public.class)
        public int x;

        @JsonView(Views.Internal.class)
        public int y;

        public SimpleBean() {}

        public SimpleBean(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @JsonRootName("rootBean")
    static class RootBean {
        public String name;

        public RootBean() {}

        public RootBean(String name) {
            this.name = name;
        }
    }

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testVersion_returnsValidVersion() {
        ObjectReader reader = mapper.reader();
        Version v = reader.version();
        Assert.assertNotNull(v);
        Assert.assertFalse(v.isUnknownVersion());
    }

    @Test
    public void testAccessors_returnExpectedConfigurations() {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        Assert.assertNotNull(reader.getConfig());
        Assert.assertNotNull(reader.getFactory());
        Assert.assertNotNull(reader.getTypeFactory());
        Assert.assertNotNull(reader.getAttributes());
        Assert.assertNull(reader.getInjectableValues());

        Assert.assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertTrue(reader.isEnabled(MapperFeature.USE_ANNOTATIONS));
        Assert.assertFalse(reader.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithAndWithoutDeserializationFeatures_modifiesStateCorrectly() {
        ObjectReader reader = mapper.reader();
        Assert.assertTrue(reader.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader r2 = reader.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Assert.assertFalse(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader r3 = r2.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Assert.assertTrue(r3.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader r4 = r3.without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertFalse(r4.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertFalse(r4.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));

        ObjectReader r5 = r4.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertTrue(r5.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        Assert.assertTrue(r5.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT));

        ObjectReader r6 = r5.withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertFalse(r6.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));

        ObjectReader r7 = r6.withFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        Assert.assertTrue(r7.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithAndWithoutParserFeatures_modifiesStateCorrectly() {
        ObjectReader reader = mapper.reader();
        ObjectReader r2 = reader.with(JsonParser.Feature.ALLOW_COMMENTS);
        Assert.assertTrue(r2.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));

        ObjectReader r3 = r2.without(JsonParser.Feature.ALLOW_COMMENTS);
        Assert.assertFalse(r3.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));

        ObjectReader r4 = r3.withFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        Assert.assertTrue(r4.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));
        Assert.assertTrue(r4.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask()));

        ObjectReader r5 = r4.withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS, JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        Assert.assertFalse(r5.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_COMMENTS.getMask()));
        Assert.assertFalse(r5.getConfig().hasParserFeatures(JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask()));

        ObjectReader rSame = reader.with(reader.getFactory());
        Assert.assertSame(reader, rSame);

        JsonFactory customF = new JsonFactory();
        ObjectReader rNewF = reader.with(customF);
        Assert.assertSame(customF, rNewF.getFactory());
        Assert.assertSame(rNewF, customF.getCodec());
    }

    enum DummyFormatFeature implements FormatFeature {
        FEAT(true);
        private final boolean _defaultState;
        DummyFormatFeature(boolean defaultState) { _defaultState = defaultState; }
        @Override public boolean enabledByDefault() { return _defaultState; }
        @Override public int getMask() { return (1 << ordinal()); }
        @Override public boolean enabledIn(int flags) { return (flags & getMask()) != 0; }
    }

    @Test
    public void testWithAndWithoutFormatFeatures_modifiesStateCorrectly() {
        ObjectReader reader = mapper.reader();
        ObjectReader r1 = reader.with(DummyFormatFeature.FEAT);
        Assert.assertTrue(r1.getConfig().hasFormatFeatureConfiguration(DummyFormatFeature.FEAT));

        ObjectReader r2 = r1.without(DummyFormatFeature.FEAT);
        Assert.assertFalse(r2.getConfig().hasFormatFeatureConfiguration(DummyFormatFeature.FEAT));

        ObjectReader r3 = r2.withFeatures(DummyFormatFeature.FEAT);
        Assert.assertTrue(r3.getConfig().hasFormatFeatureConfiguration(DummyFormatFeature.FEAT));

        ObjectReader r4 = r3.withoutFeatures(DummyFormatFeature.FEAT);
        Assert.assertFalse(r4.getConfig().hasFormatFeatureConfiguration(DummyFormatFeature.FEAT));
    }

    @Test
    public void testWithConfigAndAttributes_modifiesCorrectly() {
        ObjectReader reader = mapper.reader();
        DeserializationConfig cfg = reader.getConfig().with(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        ObjectReader r1 = reader.with(cfg);
        Assert.assertTrue(r1.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY));
        Assert.assertSame(r1, r1.with(cfg));

        ContextAttributes attrs = ContextAttributes.getEmpty().withSharedAttribute("k1", "v1");
        ObjectReader r2 = reader.with(attrs);
        Assert.assertEquals("v1", r2.getAttributes().getAttribute("k1"));

        ObjectReader r3 = reader.withAttribute("k2", "v2");
        Assert.assertEquals("v2", r3.getAttributes().getAttribute("k2"));

        ObjectReader r4 = r3.withoutAttribute("k2");
        Assert.assertNull(r4.getAttributes().getAttribute("k2"));

        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("k3", "v3");
        ObjectReader r5 = reader.withAttributes(map);
        Assert.assertEquals("v3", r5.getAttributes().getAttribute("k3"));

        InjectableValues.Std iv = new InjectableValues.Std();
        ObjectReader r6 = reader.with(iv);
        Assert.assertSame(iv, r6.getInjectableValues());
        Assert.assertSame(r6, r6.with(iv));

        JsonNodeFactory nf = new JsonNodeFactory(true);
        ObjectReader r7 = reader.with(nf);
        Assert.assertSame(nf, r7.getConfig().getNodeFactory());

        Locale loc = Locale.GERMANY;
        ObjectReader r8 = reader.with(loc);
        Assert.assertEquals(loc, r8.getConfig().getLocale());

        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        ObjectReader r9 = reader.with(tz);
        Assert.assertEquals(tz, r9.getConfig().getTimeZone());

        DeserializationProblemHandler handler = new DeserializationProblemHandler() {};
        ObjectReader r10 = reader.withHandler(handler);
        Assert.assertNotNull(r10.getConfig().getProblemHandlers());

        ObjectReader r11 = reader.with(Base64Variants.MODIFIED_FOR_URL);
        Assert.assertEquals(Base64Variants.MODIFIED_FOR_URL, r11.getConfig().getBase64Variant());

        ObjectReader r12 = reader.withView(Views.Public.class);
        Assert.assertEquals(Views.Public.class, r12.getConfig().getActiveView());
    }

    @Test
    public void testWithRootName_configuresExpectedRootName() throws Exception {
        ObjectReader reader = mapper.readerFor(RootBean.class);

        ObjectReader unwrappingReader = reader.with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName("rootBean");
        RootBean b1 = unwrappingReader.readValue("{\"rootBean\":{\"name\":\"test\"}}");
        Assert.assertEquals("test", b1.name);

        ObjectReader unwrappingReader2 = reader.with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName(PropertyName.construct("rootBean"));
        RootBean b2 = unwrappingReader2.readValue("{\"rootBean\":{\"name\":\"test2\"}}");
        Assert.assertEquals("test2", b2.name);

        ObjectReader noRootReader = unwrappingReader2.withoutRootName();
        Assert.assertEquals(PropertyName.NO_NAME, noRootReader.getConfig().getFullRootName());
    }

    @Test
    public void testRootUnwrapping_variousBranchesAndFailures() throws Exception {
        ObjectReader reader = mapper.readerFor(RootBean.class)
                .with(DeserializationFeature.UNWRAP_ROOT_VALUE);

        try {
            reader.readValue("[\"not_start_object\"]");
            Assert.fail("Should throw JsonMappingException on non-start object root");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Current token not START_OBJECT"));
        }

        try {
            reader.readValue("{}");
            Assert.fail("Should throw JsonMappingException on missing field name");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Current token not FIELD_NAME"));
        }

        try {
            reader.readValue("{\"wrongRoot\":{\"name\":\"x\"}}");
            Assert.fail("Should throw JsonMappingException on root name mismatch");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Root name 'wrongRoot' does not match expected"));
        }

        try {
            reader.readValue("{\"rootBean\":{\"name\":\"x\"}, \"extra\": 1}");
            Assert.fail("Should throw JsonMappingException on missing END_OBJECT");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Current token not END_OBJECT"));
        }

        RootBean toUpdate = new RootBean("old");
        ObjectReader updatingReader = reader.withValueToUpdate(toUpdate);
        RootBean updated = updatingReader.readValue("{\"rootBean\":{\"name\":\"new\"}}");
        Assert.assertSame(toUpdate, updated);
        Assert.assertEquals("new", updated.name);

        ObjectReader treeReader = mapper.reader().with(DeserializationFeature.UNWRAP_ROOT_VALUE)
                .withRootName("rootNode");
        JsonNode node = treeReader.readTree("{\"rootNode\":{\"k\":\"v\"}}");
        Assert.assertEquals("v", node.get("k").asText());
    }

    @Test
    public void testForTypeAndWithType_bindsToDifferentTypes() throws Exception {
        ObjectReader reader = mapper.reader();

        JavaType jt = mapper.getTypeFactory().constructType(SimpleBean.class);
        ObjectReader r1 = reader.forType(jt);
        Assert.assertSame(r1, r1.forType(jt));
        Assert.assertSame(r1, r1.withType(jt));

        ObjectReader r2 = reader.forType(SimpleBean.class);
        ObjectReader r3 = reader.forType(new TypeReference<SimpleBean>() {});
        ObjectReader r4 = reader.withType(SimpleBean.class);
        ObjectReader r5 = reader.withType(new TypeReference<SimpleBean>() {});
        ObjectReader r6 = reader.withType((java.lang.reflect.Type) SimpleBean.class);

        SimpleBean b1 = r1.readValue("{\"x\":1,\"y\":2}");
        SimpleBean b2 = r2.readValue("{\"x\":1,\"y\":2}");
        SimpleBean b3 = r3.readValue("{\"x\":1,\"y\":2}");
        SimpleBean b4 = r4.readValue("{\"x\":1,\"y\":2}");
        SimpleBean b5 = r5.readValue("{\"x\":1,\"y\":2}");
        SimpleBean b6 = r6.readValue("{\"x\":1,\"y\":2}");

        Assert.assertEquals(1, b1.x);
        Assert.assertEquals(1, b2.x);
        Assert.assertEquals(1, b3.x);
        Assert.assertEquals(1, b4.x);
        Assert.assertEquals(1, b5.x);
        Assert.assertEquals(1, b6.x);
    }

    @Test
    public void testWithValueToUpdate_validAndExceptions() throws Exception {
        ObjectReader reader = mapper.reader();

        SimpleBean target = new SimpleBean(10, 20);
        ObjectReader updatingReader = reader.withValueToUpdate(target);
        Assert.assertSame(updatingReader, updatingReader.withValueToUpdate(target));

        SimpleBean updated = updatingReader.readValue("{\"x\":99}");
        Assert.assertSame(target, updated);
        Assert.assertEquals(99, updated.x);
        Assert.assertEquals(20, updated.y);

        try {
            reader.withValueToUpdate(null);
            Assert.fail("Expected IllegalArgumentException for null value to update");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("null value"));
        }

        try {
            reader.forType(int[].class).withValueToUpdate(new int[]{1, 2});
            Assert.fail("Expected IllegalArgumentException for array value to update");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not update an array value"));
        }
    }

    @Test
    public void testTreeCodecMethods() throws Exception {
        ObjectReader reader = mapper.reader();

        ArrayNode arr = (ArrayNode) reader.createArrayNode();
        Assert.assertNotNull(arr);
        Assert.assertTrue(arr.isArray());

        ObjectNode obj = (ObjectNode) reader.createObjectNode();
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj.isObject());

        obj.put("x", 42);
        JsonParser parser = reader.treeAsTokens(obj);
        Assert.assertNotNull(parser);
        SimpleBean b = reader.treeToValue(obj, SimpleBean.class);
        Assert.assertEquals(42, b.x);

        JsonNode treeFromParser = reader.readTree(parser);
        Assert.assertEquals(42, treeFromParser.get("x").asInt());

        try {
            reader.writeTree(null, obj);
            Assert.fail("Expected UnsupportedOperationException on writeTree");
        } catch (UnsupportedOperationException expected) {}

        try {
            reader.writeValue(null, obj);
            Assert.fail("Expected UnsupportedOperationException on writeValue");
        } catch (UnsupportedOperationException expected) {}
    }

    @Test
    public void testReadValueFromParser_allOverloads() throws Exception {
        ObjectReader reader = mapper.reader();
        String json = "{\"x\":7,\"y\":8}";

        JsonParser p1 = mapper.getFactory().createParser(json);
        SimpleBean b1 = reader.forType(SimpleBean.class).readValue(p1);
        Assert.assertEquals(7, b1.x);

        JsonParser p2 = mapper.getFactory().createParser(json);
        SimpleBean b2 = reader.readValue(p2, SimpleBean.class);
        Assert.assertEquals(7, b2.x);

        JsonParser p3 = mapper.getFactory().createParser(json);
        SimpleBean b3 = reader.readValue(p3, new TypeReference<SimpleBean>() {});
        Assert.assertEquals(7, b3.x);

        JsonParser p4 = mapper.getFactory().createParser(json);
        ResolvedType rt = mapper.getTypeFactory().constructType(SimpleBean.class);
        SimpleBean b4 = reader.readValue(p4, rt);
        Assert.assertEquals(7, b4.x);

        JsonParser p5 = mapper.getFactory().createParser(json);
        JavaType jt = mapper.getTypeFactory().constructType(SimpleBean.class);
        SimpleBean b5 = reader.readValue(p5, jt);
        Assert.assertEquals(7, b5.x);
    }

    @Test
    public void testReadValueFromVariousSources() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        String json = "{\"x\":12,\"y\":34}";

        SimpleBean b1 = reader.readValue(json);
        Assert.assertEquals(12, b1.x);

        SimpleBean b2 = reader.readValue(new StringReader(json));
        Assert.assertEquals(12, b2.x);

        byte[] bytes = json.getBytes("UTF-8");
        SimpleBean b3 = reader.readValue(new ByteArrayInputStream(bytes));
        Assert.assertEquals(12, b3.x);

        SimpleBean b4 = reader.readValue(bytes);
        Assert.assertEquals(12, b4.x);

        SimpleBean b5 = reader.readValue(bytes, 0, bytes.length);
        Assert.assertEquals(12, b5.x);

        File tempFile = File.createTempFile("obj_reader_test", ".json");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(bytes);
        fos.close();

        SimpleBean b6 = reader.readValue(tempFile);
        Assert.assertEquals(12, b6.x);

        URL url = tempFile.toURI().toURL();
        SimpleBean b7 = reader.readValue(url);
        Assert.assertEquals(12, b7.x);

        JsonNode tree = mapper.readTree(json);
        SimpleBean b8 = reader.readValue(tree);
        Assert.assertEquals(12, b8.x);
    }

    @Test
    public void testReadTreeFromVariousSources() throws Exception {
        ObjectReader reader = mapper.reader();
        String json = "{\"greeting\":\"hello\"}";

        JsonNode n1 = reader.readTree(json);
        Assert.assertEquals("hello", n1.get("greeting").asText());

        JsonNode n2 = reader.readTree(new StringReader(json));
        Assert.assertEquals("hello", n2.get("greeting").asText());

        JsonNode n3 = reader.readTree(new ByteArrayInputStream(json.getBytes("UTF-8")));
        Assert.assertEquals("hello", n3.get("greeting").asText());
    }

    @Test
    public void testReadValues_sequencesFromParserAndSources() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        String json = "{\"x\":1,\"y\":2}\n{\"x\":3,\"y\":4}";

        JsonParser p1 = mapper.getFactory().createParser(json);
        MappingIterator<SimpleBean> it1 = reader.readValues(p1);
        List<SimpleBean> list1 = it1.readAll();
        Assert.assertEquals(2, list1.size());
        Assert.assertEquals(1, list1.get(0).x);
        Assert.assertEquals(3, list1.get(1).x);

        JsonParser p2 = mapper.getFactory().createParser(json);
        Iterator<SimpleBean> it2 = reader.readValues(p2, SimpleBean.class);
        Assert.assertEquals(1, it2.next().x);

        JsonParser p3 = mapper.getFactory().createParser(json);
        Iterator<SimpleBean> it3 = reader.readValues(p3, new TypeReference<SimpleBean>() {});
        Assert.assertEquals(1, it3.next().x);

        JsonParser p4 = mapper.getFactory().createParser(json);
        ResolvedType rt = mapper.getTypeFactory().constructType(SimpleBean.class);
        Iterator<SimpleBean> it4 = reader.readValues(p4, rt);
        Assert.assertEquals(1, it4.next().x);

        JsonParser p5 = mapper.getFactory().createParser(json);
        JavaType jt = mapper.getTypeFactory().constructType(SimpleBean.class);
        Iterator<SimpleBean> it5 = reader.readValues(p5, jt);
        Assert.assertEquals(1, it5.next().x);

        MappingIterator<SimpleBean> itStr = reader.readValues(json);
        Assert.assertEquals(2, itStr.readAll().size());

        MappingIterator<SimpleBean> itRdr = reader.readValues(new StringReader(json));
        Assert.assertEquals(2, itRdr.readAll().size());

        byte[] bytes = json.getBytes("UTF-8");
        MappingIterator<SimpleBean> itIs = reader.readValues(new ByteArrayInputStream(bytes));
        Assert.assertEquals(2, itIs.readAll().size());

        MappingIterator<SimpleBean> itBytes = reader.readValues(bytes);
        Assert.assertEquals(2, itBytes.readAll().size());

        MappingIterator<SimpleBean> itBytesOffset = reader.readValues(bytes, 0, bytes.length);
        Assert.assertEquals(2, itBytesOffset.readAll().size());

        File tempFile = File.createTempFile("obj_reader_seq_test", ".json");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(bytes);
        fos.close();

        MappingIterator<SimpleBean> itFile = reader.readValues(tempFile);
        Assert.assertEquals(2, itFile.readAll().size());

        MappingIterator<SimpleBean> itUrl = reader.readValues(tempFile.toURI().toURL());
        Assert.assertEquals(2, itUrl.readAll().size());
    }

    @Test
    public void testAt_jsonPointerFiltering() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        String json = "{\"status\":\"ok\",\"payload\":{\"x\":55,\"y\":66}}";

        ObjectReader atStr = reader.at("/payload");
        SimpleBean b1 = atStr.readValue(json);
        Assert.assertEquals(55, b1.x);
        Assert.assertEquals(66, b1.y);

        ObjectReader atPtr = reader.at(JsonPointer.compile("/payload"));
        SimpleBean b2 = atPtr.readValue(json);
        Assert.assertEquals(55, b2.x);
        Assert.assertEquals(66, b2.y);

        MappingIterator<SimpleBean> it = atStr.readValues(json);
        Assert.assertTrue(it.hasNext());
        SimpleBean b3 = it.next();
        Assert.assertEquals(55, b3.x);
    }

    @Test
    public void testFormatDetection_byteSourcesAndCharErrors() throws Exception {
        ObjectReader rJson = mapper.readerFor(SimpleBean.class);
        ObjectReader reader = rJson.withFormatDetection(rJson);

        String json = "{\"x\":101,\"y\":202}";
        byte[] bytes = json.getBytes("UTF-8");

        SimpleBean b1 = reader.readValue(bytes);
        Assert.assertEquals(101, b1.x);

        SimpleBean b2 = reader.readValue(new ByteArrayInputStream(bytes));
        Assert.assertEquals(101, b2.x);

        File tempFile = File.createTempFile("obj_reader_det", ".json");
        tempFile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tempFile);
        fos.write(bytes);
        fos.close();

        SimpleBean b3 = reader.readValue(tempFile);
        Assert.assertEquals(101, b3.x);

        SimpleBean b4 = reader.readValue(tempFile.toURI().toURL());
        Assert.assertEquals(101, b4.x);

        JsonNode tree = reader.readTree(new ByteArrayInputStream(bytes));
        Assert.assertEquals(101, tree.get("x").asInt());

        MappingIterator<SimpleBean> it1 = reader.readValues(new ByteArrayInputStream(bytes));
        Assert.assertEquals(101, it1.next().x);

        MappingIterator<SimpleBean> it2 = reader.readValues(bytes, 0, bytes.length);
        Assert.assertEquals(101, it2.next().x);

        MappingIterator<SimpleBean> it3 = reader.readValues(tempFile);
        Assert.assertEquals(101, it3.next().x);

        MappingIterator<SimpleBean> it4 = reader.readValues(tempFile.toURI().toURL());
        Assert.assertEquals(101, it4.next().x);

        ObjectReader rForType = reader.forType(SimpleBean.class);
        Assert.assertNotNull(rForType);

        try {
            reader.readValue(json);
            Assert.fail("Expected JsonParseException on string input with format detector");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("must be byte- not char-based"));
        }

        try {
            reader.readValue(new StringReader(json));
            Assert.fail("Expected JsonParseException on reader input with format detector");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("must be byte- not char-based"));
        }

        try {
            reader.readValue(mapper.readTree(json));
            Assert.fail("Expected JsonParseException on JsonNode input with format detector");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("must be byte- not char-based"));
        }

        try {
            reader.readTree(new StringReader(json));
            Assert.fail("Expected JsonParseException on readTree(Reader)");
        } catch (JsonParseException expected) {}

        try {
            reader.readTree(json);
            Assert.fail("Expected JsonParseException on readTree(String)");
        } catch (JsonParseException expected) {}

        try {
            reader.readValues(json);
            Assert.fail("Expected JsonParseException on readValues(String)");
        } catch (JsonParseException expected) {}

        try {
            reader.readValues(new StringReader(json));
            Assert.fail("Expected JsonParseException on readValues(Reader)");
        } catch (JsonParseException expected) {}

        DataFormatReaders dfReaders = new DataFormatReaders(rJson);
        ObjectReader readerWithDfr = rJson.withFormatDetection(dfReaders);
        Assert.assertNotNull(readerWithDfr);
        ObjectReader rWithConfig = readerWithDfr.with(readerWithDfr.getConfig().with(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT));
        Assert.assertNotNull(rWithConfig);
    }

    @Test
    public void testFormatDetection_unrecognizedFormatThrowsException() throws Exception {
        ObjectReader reader = mapper.readerFor(SimpleBean.class);
        DataFormatReaders dfReaders = new DataFormatReaders(new ObjectReader[0]);
        ObjectReader detReader = reader.withFormatDetection(dfReaders);

        try {
            detReader.readValue("{}".getBytes("UTF-8"));
            Assert.fail("Expected JsonParseException for unknown format");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("Can not detect format from input"));
        }

        try {
            detReader.readValue(new ByteArrayInputStream("{}".getBytes("UTF-8")));
            Assert.fail("Expected JsonParseException for unknown format");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("Can not detect format from input"));
        }

        try {
            detReader.readTree(new ByteArrayInputStream("{}".getBytes("UTF-8")));
            Assert.fail("Expected JsonParseException for unknown format");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("Can not detect format from input"));
        }

        try {
            detReader.readValues(new ByteArrayInputStream("{}".getBytes("UTF-8")));
            Assert.fail("Expected JsonParseException for unknown format");
        } catch (JsonParseException expected) {
            Assert.assertTrue(expected.getMessage().contains("Can not detect format from input"));
        }
    }

    @Test
    public void testFormatSchema_validation() {
        ObjectReader reader = mapper.reader();
        Assert.assertSame(reader, reader.with((FormatSchema) null));

        FormatSchema dummySchema = new FormatSchema() {
            @Override
            public String getSchemaType() {
                return "dummy";
            }
        };

        try {
            reader.with(dummySchema);
            Assert.fail("Expected IllegalArgumentException for unsupported FormatSchema");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Can not use FormatSchema"));
        }
    }

    @Test
    public void testEmptyAndNullTokensHandling() throws Exception {
        ObjectReader reader = mapper.reader();

        try {
            reader.readValue("");
            Assert.fail("Expected JsonMappingException on empty input");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("No content to map due to end-of-input"));
        }

        Object objNull = reader.forType(String.class).readValue("null");
        Assert.assertNull(objNull);

        String targetStr = "existing";
        Object updatedNull = reader.forType(String.class).withValueToUpdate(targetStr).readValue("null");
        Assert.assertEquals("existing", updatedNull);

        JsonNode nullNode = reader.readTree("null");
        Assert.assertTrue(nullNode.isNull());
        Assert.assertSame(NullNode.instance, nullNode);

        JsonParser pEndObj = mapper.getFactory().createParser("{}");
        pEndObj.nextToken(); // START_OBJECT
        pEndObj.nextToken(); // END_OBJECT
        SimpleBean targetBean = new SimpleBean(5, 6);
        SimpleBean res = reader.withValueToUpdate(targetBean).readValue(pEndObj);
        Assert.assertSame(targetBean, res);

        JsonParser pEndArr = mapper.getFactory().createParser("[]");
        pEndArr.nextToken(); // START_ARRAY
        pEndArr.nextToken(); // END_ARRAY
        JsonNode treeRes = reader.readTree(pEndArr);
        Assert.assertSame(NullNode.instance, treeRes);
    }
}
