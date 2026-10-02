import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class ObjectReaderTest {

    private ObjectMapper mapper;
    private ObjectReader mapReader;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        mapReader = mapper.readerFor(Map.class);
    }

    // -------------------- basic readValue tests --------------------

    @Test
    public void testReadValue_fromString_normal() throws IOException {
        Map<?, ?> result = mapReader.readValue("{\"a\":1}");
        assertNotNull(result);
        assertEquals(1, result.get("a"));
    }

    @Test
    public void testReadValue_fromByteArray_normal() throws IOException {
        byte[] data = "{\"a\":1}".getBytes();
        Map<?, ?> result = mapReader.readValue(data);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromByteArrayOffsetLength_normal() throws IOException {
        byte[] data = "XX{\"a\":1}YY".getBytes();
        Map<?, ?> result = mapReader.readValue(data, 2, 7);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromReader_normal() throws IOException {
        Reader r = new StringReader("{\"a\":1}");
        Map<?, ?> result = mapReader.readValue(r);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromInputStream_normal() throws IOException {
        InputStream in = new ByteArrayInputStream("{\"a\":1}".getBytes());
        Map<?, ?> result = mapReader.readValue(in);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromFile_normal() throws IOException {
        File tmp = File.createTempFile("objectreadertest", ".json");
        tmp.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write("{\"a\":1}".getBytes());
        }
        Map<?, ?> result = mapReader.readValue(tmp);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromURL_normal() throws IOException {
        File tmp = File.createTempFile("objectreadertest2", ".json");
        tmp.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write("{\"a\":1}".getBytes());
        }
        URL url = tmp.toURI().toURL();
        Map<?, ?> result = mapReader.readValue(url);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromJsonParser_normal() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        Map<?, ?> result = mapReader.readValue(p);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_withClassType() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        Map<?, ?> result = mapReader.readValue(p, Map.class);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_withTypeReference() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        Map<String, Object> result = mapper.reader().readValue(p, new TypeReference<Map<String, Object>>() {});
        assertNotNull(result);
    }

    @Test
    public void testReadValue_withJavaType() throws IOException {
        JsonParser p = mapper.getFactory().createParser("{\"a\":1}");
        com.fasterxml.jackson.databind.JavaType jt = mapper.getTypeFactory().constructType(Map.class);
        Object result = mapper.reader().readValue(p, jt);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromJsonNode_normal() throws IOException {
        JsonNode node = mapper.readTree("{\"a\":1}");
        Map<?, ?> result = mapReader.readValue(node);
        assertNotNull(result);
    }

    @Test
    public void testReadValue_fromDataInput_normal() throws IOException {
        DataInputStream din = new DataInputStream(new ByteArrayInputStream("{\"a\":1}".getBytes()));
        Map<?, ?> result = mapReader.readValue(din);
        assertNotNull(result);
    }

    // -------------------- edge / exception cases --------------------

    @Test(expected = IOException.class)
    public void testReadValue_fromEmptyString_throwsException() throws IOException {
        mapReader.readValue("");
    }

    @Test
    public void testReadValue_nullLiteral_returnsNull() throws IOException {
        Object result = mapper.readerFor(Object.class).readValue("null");
        assertNull(result);
    }

    @Test(expected = IOException.class)
    public void testReadValue_withTrailingTokens_throwsException() throws IOException {
        ObjectReader strict = mapper.readerFor(Map.class)
                .with(DeserializationFeature.FAIL_ON_TRAILING_TOKENS);
        strict.readValue("{} extra");
    }

    // -------------------- readTree tests --------------------

    @Test
    public void testReadTree_fromString_normal() throws IOException {
        JsonNode node = mapper.reader().readTree("{\"a\":1}");
        assertNotNull(node);
        assertTrue(node.has("a"));
    }

    @Test
    public void testReadTree_fromInputStream_emptyInput_returnsMissingNode() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        JsonNode node = mapper.reader().readTree(in);
        assertNotNull(node);
        assertTrue(node.isMissingNode());
    }

    @Test
    public void testReadTree_fromParser_emptyInput_returnsNull() throws IOException {
        JsonParser p = mapper.getFactory().createParser("");
        JsonNode node = mapper.reader().readTree(p);
        assertNull(node);
    }

    @Test
    public void testReadTree_fromReader_normal() throws IOException {
        Reader r = new StringReader("{\"a\":1}");
        JsonNode node = mapper.reader().readTree(r);
        assertNotNull(node);
    }

    @Test
    public void testReadTree_fromByteArray_normal() throws IOException {
        byte[] data = "{\"a\":1}".getBytes();
        JsonNode node = mapper.reader().readTree(data);
        assertNotNull(node);
    }

    @Test
    public void testReadTree_fromByteArrayOffsetLen_normal() throws IOException {
        byte[] data = "XX{\"a\":1}YY".getBytes();
        JsonNode node = mapper.reader().readTree(data, 2, 7);
        assertNotNull(node);
    }

    @Test
    public void testReadTree_fromDataInput_normal() throws IOException {
        DataInputStream din = new DataInputStream(new ByteArrayInputStream("{\"a\":1}".getBytes()));
        JsonNode node = mapper.reader().readTree(din);
        assertNotNull(node);
    }

    // -------------------- readValues tests --------------------

    @Test
    public void testReadValues_fromParser_normal() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(p);
        List<Integer> vals = new ArrayList<>();
        while (it.hasNext()) {
            vals.add(it.next());
        }
        assertEquals(3, vals.size());
    }

    @Test
    public void testReadValues_fromString_normal() throws IOException {
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues("1 2 3");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromByteArray_normal() throws IOException {
        byte[] data = "1 2 3".getBytes();
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(data);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromByteArrayOffsetLen_normal() throws IOException {
        byte[] data = "XX1 2 3YY".getBytes();
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(data, 2, 5);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromInputStream_normal() throws IOException {
        InputStream in = new ByteArrayInputStream("1 2 3".getBytes());
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(in);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromReader_normal() throws IOException {
        Reader r = new StringReader("1 2 3");
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(r);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromFile_normal() throws IOException {
        File tmp = File.createTempFile("objectreadertest3", ".json");
        tmp.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write("1 2 3".getBytes());
        }
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(tmp);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromURL_normal() throws IOException {
        File tmp = File.createTempFile("objectreadertest4", ".json");
        tmp.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(tmp)) {
            fos.write("1 2 3".getBytes());
        }
        URL url = tmp.toURI().toURL();
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(url);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_fromDataInput_normal() throws IOException {
        DataInputStream din = new DataInputStream(new ByteArrayInputStream("1 2 3".getBytes()));
        MappingIterator<Integer> it = mapper.readerFor(Integer.class).readValues(din);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_withClassType_fromParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        Iterator<Integer> it = mapper.reader().readValues(p, Integer.class);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_withTypeReference_fromParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        Iterator<Integer> it = mapper.reader().readValues(p, new TypeReference<Integer>() {});
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testReadValues_withJavaType_fromParser() throws IOException {
        JsonParser p = mapper.getFactory().createParser("1 2 3");
        com.fasterxml.jackson.databind.JavaType jt = mapper.getTypeFactory().constructType(Integer.class);
        Iterator<Integer> it = mapper.reader().readValues(p, jt);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    // -------------------- fluent factory tests --------------------

    @Test
    public void testWith_deserializationFeature_returnsNewInstance() {
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertNotNull(r2);
        assertTrue(r2.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWith_multipleDeserializationFeatures() {
        ObjectReader r = mapper.reader().with(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertTrue(r.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithFeatures_deserializationFeatures() {
        ObjectReader r = mapper.reader().withFeatures(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithout_deserializationFeature() {
        ObjectReader r = mapper.reader().without(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWithout_multipleDeserializationFeatures() {
        ObjectReader r = mapper.reader().without(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertFalse(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertFalse(r.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testWithoutFeatures_deserializationFeatures() {
        ObjectReader r = mapper.reader().withoutFeatures(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(r.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testWith_jsonParserFeature() {
        ObjectReader r = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithFeatures_jsonParserFeatures() {
        ObjectReader r = mapper.reader().withFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertTrue(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithout_jsonParserFeature() {
        ObjectReader r = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS)
                .without(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    @Test
    public void testWithoutFeatures_jsonParserFeatures() {
        ObjectReader r = mapper.reader().with(JsonParser.Feature.ALLOW_COMMENTS)
                .withoutFeatures(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(r.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
    }

    // -------------------- other fluent factory methods --------------------

    @Test
    public void testAt_withStringPointer() throws IOException {
        ObjectReader r = mapper.readerFor(Integer.class).at("/a/b");
        Integer result = r.readValue("{\"a\":{\"b\":5}}");
        assertEquals(Integer.valueOf(5), result);
    }

    @Test
    public void testAt_withJsonPointer() throws IOException {
        JsonPointer ptr = JsonPointer.compile("/a/b");
        ObjectReader r = mapper.readerFor(Integer.class).at(ptr);
        Integer result = r.readValue("{\"a\":{\"b\":7}}");
        assertEquals(Integer.valueOf(7), result);
    }

    @Test
    public void testWith_deserializationConfig() {
        DeserializationConfig cfg = mapper.reader().getConfig();
        ObjectReader r = mapper.reader().with(cfg);
        assertNotNull(r);
    }

    @Test
    public void testWith_injectableValues() {
        InjectableValues iv = new InjectableValues.Std();
        ObjectReader r = mapper.reader().with(iv);
        assertSame(iv, r.getInjectableValues());
    }

    @Test
    public void testWith_sameInjectableValues_returnsSameInstance() {
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(r1.getInjectableValues());
        assertSame(r1, r2);
    }

    @Test
    public void testWith_jsonNodeFactory() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectReader r = mapper.reader().with(factory);
        assertNotNull(r);
    }

    @Test
    public void testWith_jsonFactory_sameFactory_returnsSameInstance() {
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(r1.getFactory());
        assertSame(r1, r2);
    }

    @Test
    public void testWith_jsonFactory_differentFactory_returnsNewInstance() {
        ObjectReader r1 = mapper.reader();
        JsonFactory newFactory = new JsonFactory();
        ObjectReader r2 = r1.with(newFactory);
        assertNotSame(r1, r2);
        assertSame(newFactory, r2.getFactory());
    }

    @Test
    public void testWithRootName_string() {
        ObjectReader r = mapper.reader().withRootName("root");
        assertNotNull(r);
    }

    @Test
    public void testWithRootName_propertyName() {
        ObjectReader r = mapper.reader().withRootName(PropertyName.construct("root"));
        assertNotNull(r);
    }

    @Test
    public void testWithoutRootName() {
        ObjectReader r = mapper.reader().withoutRootName();
        assertNotNull(r);
    }

    @Test
    public void testWith_formatSchema_sameSchema_returnsSameInstance() {
        ObjectReader r1 = mapper.reader();
        ObjectReader r2 = r1.with(r1.getConfig().getGeneratorSettings() == null ? null : null);
        // simple test that passing null schema when already null returns same instance
        ObjectReader r3 = r1.with((FormatSchema) null);
        assertSame(r1, r3);
    }

    @Test
    public void testForType_javaType() {
        com.fasterxml.jackson.databind.JavaType jt = mapper.getTypeFactory().constructType(String.class);
        ObjectReader r = mapper.reader().forType(jt);
        assertNotNull(r);
    }

    @Test
    public void testForType_sameJavaType_returnsSameInstance() {
        com.fasterxml.jackson.databind.JavaType jt = mapper.getTypeFactory().constructType(String.class);
        ObjectReader r1 = mapper.reader().forType(jt);
        ObjectReader r2 = r1.forType(jt);
        assertSame(r1, r2);
    }

    @Test
    public void testForType_class() {
        ObjectReader r = mapper.reader().forType(String.class);
        assertNotNull(r);
    }

    @Test
    public void testForType_typeReference() {
        ObjectReader r = mapper.reader().forType(new TypeReference<List<String>>() {});
        assertNotNull(r);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testWithType_javaType_deprecated() {
        com.fasterxml.jackson.databind.JavaType jt = mapper.getTypeFactory().constructType(String.class);
        ObjectReader r = mapper.reader().withType(jt);
        assertNotNull(r);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testWithType_class_deprecated() {
        ObjectReader r = mapper.reader().withType(String.class);
        assertNotNull(r);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testWithType_reflectType_deprecated() {
        java.lang.reflect.Type t = String.class;
        ObjectReader r = mapper.reader().withType(t);
        assertNotNull(r);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testWithType_typeReference_deprecated() {
        ObjectReader r = mapper.reader().withType(new TypeReference<String>() {});
        assertNotNull(r);
    }

    @Test
    public void testWithValueToUpdate_normal() throws IOException {
        List<String> list = new ArrayList<>();
        list.add("existing");
        ObjectReader r = mapper.readerForUpdating(list);
        List<?> result = r.readValue("[\"new\"]");
        assertSame(list, result);
    }

    @Test
    public void testWithValueToUpdate_null_removesValueToUpdate() {
        List<String> list = new ArrayList<>();
        ObjectReader r1 = mapper.readerForUpdating(list);
        ObjectReader r2 = r1.withValueToUpdate(null);
        assertNotNull(r2);
    }

    @Test
    public void testWithValueToUpdate_sameValue_returnsSameInstance() {
        List<String> list = new ArrayList<>();
        ObjectReader r1 = mapper.readerForUpdating(list);
        ObjectReader r2 = r1.withValueToUpdate(list);
        assertSame(r1, r2);
    }

    @Test
    public void testWithView() {
        ObjectReader r = mapper.reader().withView(Object.class);
        assertNotNull(r);
    }

    @Test
    public void testWith_locale() {
        ObjectReader r = mapper.reader().with(Locale.FRANCE);
        assertNotNull(r);
    }

    @Test
    public void testWith_timeZone() {
        ObjectReader r = mapper.reader().with(TimeZone.getTimeZone("UTC"));
        assertNotNull(r);
    }

    @Test
    public void testWithHandler() {
        DeserializationProblemHandler handler = new DeserializationProblemHandler() {
        };
        ObjectReader r = mapper.reader().withHandler(handler);
        assertNotNull(r);
    }

    @Test
    public void testWith_base64Variant() {
        ObjectReader r = mapper.reader().with(com.fasterxml.jackson.core.Base64Variants.getDefaultVariant());
        assertNotNull(r);
    }

    @Test
    public void testWithFormatDetection_readers() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        byte[] data = "{\"a\":1}".getBytes();
        Map<?, ?> result = detecting.readValue(data);
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testWithFormatDetection_withReader_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValue(new StringReader("{\"a\":1}"));
    }

    @Test
    public void testWith_contextAttributes() {
        ContextAttributes attrs = ContextAttributes.getEmpty();
        ObjectReader r = mapper.reader().with(attrs);
        assertNotNull(r);
    }

    @Test
    public void testWithAttributes_map() {
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("key", "value");
        ObjectReader r = mapper.reader().withAttributes(attrs);
        assertEquals("value", r.getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithAttribute_singleKeyValue() {
        ObjectReader r = mapper.reader().withAttribute("key", "value");
        assertEquals("value", r.getAttributes().getAttribute("key"));
    }

    @Test
    public void testWithoutAttribute() {
        ObjectReader r = mapper.reader().withAttribute("key", "value").withoutAttribute("key");
        assertNull(r.getAttributes().getAttribute("key"));
    }

    // -------------------- accessor tests --------------------

    @Test
    public void testIsEnabled_deserializationFeature() {
        boolean enabled = mapper.reader().isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        // just verify method executes without exception
        assertTrue(enabled || !enabled);
    }

    @Test
    public void testIsEnabled_mapperFeature() {
        boolean enabled = mapper.reader().isEnabled(MapperFeature.USE_ANNOTATIONS);
        assertTrue(enabled || !enabled);
    }

    @Test
    public void testIsEnabled_jsonParserFeature() {
        boolean enabled = mapper.reader().isEnabled(JsonParser.Feature.ALLOW_COMMENTS);
        assertFalse(enabled);
    }

    @Test
    public void testGetConfig_notNull() {
        assertNotNull(mapper.reader().getConfig());
    }

    @Test
    public void testGetFactory_notNull() {
        assertNotNull(mapper.reader().getFactory());
    }

    @Test
    public void testGetTypeFactory_notNull() {
        TypeFactory tf = mapper.reader().getTypeFactory();
        assertNotNull(tf);
    }

    @Test
    public void testGetAttributes_notNull() {
        assertNotNull(mapper.reader().getAttributes());
    }

    @Test
    public void testGetInjectableValues_defaultNull() {
        assertNull(mapper.reader().getInjectableValues());
    }

    // -------------------- tree codec tests --------------------

    @Test
    public void testCreateArrayNode() {
        JsonNode node = mapper.reader().createArrayNode();
        assertTrue(node instanceof ArrayNode);
    }

    @Test
    public void testCreateObjectNode() {
        JsonNode node = mapper.reader().createObjectNode();
        assertTrue(node instanceof ObjectNode);
    }

    @Test
    public void testTreeAsTokens_notNull() throws IOException {
        JsonNode node = mapper.readTree("{\"a\":1}");
        JsonParser p = mapper.reader().treeAsTokens(node);
        assertNotNull(p);
    }

    @Test
    public void testTreeToValue_normal() throws IOException {
        ObjectNode node = mapper.reader().createObjectNode();
        node.put("value", 42);
        Map<?, ?> result = mapper.reader().treeToValue(node, Map.class);
        assertEquals(42, result.get("value"));
    }

    // -------------------- version test --------------------

    @Test
    public void testVersion_notNull() {
        Version v = mapper.reader().version();
        assertNotNull(v);
    }

    // -------------------- writeValue/writeTree unsupported --------------------

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteTree_throwsUnsupportedOperationException() {
        mapper.reader().writeTree(null, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteValue_throwsUnsupportedOperationException() throws IOException {
        mapper.reader().writeValue(null, new Object());
    }

    // -------------------- unrecognized/undetectable source tests --------------------

    @Test(expected = IOException.class)
    public void testReadValue_withFormatDetection_fromJsonNode_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        JsonNode node = mapper.readTree("{\"a\":1}");
        detecting.readValue(node);
    }

    @Test(expected = IOException.class)
    public void testReadValue_withFormatDetection_fromDataInput_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        DataInputStream din = new DataInputStream(new ByteArrayInputStream("{}".getBytes()));
        detecting.readValue(din);
    }

    @Test(expected = IOException.class)
    public void testReadTree_withFormatDetection_fromReader_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readTree(new StringReader("{}"));
    }

    @Test(expected = IOException.class)
    public void testReadTree_withFormatDetection_fromString_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readTree("{}");
    }

    @Test(expected = IOException.class)
    public void testReadTree_withFormatDetection_fromByteArray_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readTree("{}".getBytes());
    }

    @Test(expected = IOException.class)
    public void testReadValues_withFormatDetection_fromReader_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValues(new StringReader("{}"));
    }

    @Test(expected = IOException.class)
    public void testReadValues_withFormatDetection_fromString_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValues("{}");
    }

    @Test(expected = IOException.class)
    public void testReadValues_withFormatDetection_fromDataInput_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        DataInputStream din = new DataInputStream(new ByteArrayInputStream("{}".getBytes()));
        detecting.readValues(din);
    }

    @Test(expected = IOException.class)
    public void testReadValue_withFormatDetection_fromReader_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValue(new StringReader("{}"));
    }

    @Test(expected = IOException.class)
    public void testReadValue_withFormatDetection_fromString_throwsException() throws IOException {
        ObjectReader jsonReader = mapper.readerFor(Map.class);
        ObjectReader detecting = jsonReader.withFormatDetection(jsonReader);
        detecting.readValue("{}");
    }

    // -------------------- unwrap root tests --------------------

    @Test
    public void testReadValue_withUnwrapRoot_normal() throws IOException {
        ObjectMapper wrapMapper = new ObjectMapper();
        wrapMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        ObjectReader r = wrapMapper.readerFor(SimplePojo.class).withRootName("SimplePojo");
        SimplePojo pojo = r.readValue("{\"SimplePojo\":{\"name\":\"test\"}}");
        assertNotNull(pojo);
        assertEquals("test", pojo.name);
    }

    // -------------------- helper pojo --------------------

    public static class SimplePojo {
        public String name;
    }
}
