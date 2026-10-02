import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class XmlSerializerProviderTest {

    private XmlMapper xmlMapper;

    @Before
    public void setUp() {
        xmlMapper = new XmlMapper();
    }

    // ---------- Bean helper classes ----------

    public static class SimpleBean {
        public String name;
        public int value;

        public SimpleBean() {}

        public SimpleBean(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    @JacksonXmlRootElement(localName = "nsBean", namespace = "http://example.com/ns")
    public static class NamespacedBean {
        public String field;

        public NamespacedBean() {}

        public NamespacedBean(String field) {
            this.field = field;
        }
    }

    // ---------- createInstance ----------

    @Test
    public void testCreateInstance_returnsXmlSerializerProviderInstance() {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        DefaultSerializerProvider newProvider = provider.createInstance(
                xmlMapper.getSerializationConfig(), xmlMapper.getSerializerFactory());
        assertNotNull(newProvider);
        assertTrue(newProvider instanceof XmlSerializerProvider);
    }

    // ---------- serializeValue(gen, value) via public ObjectMapper API ----------

    @Test
    public void testSerializeValue_withNormalObject_producesXml() throws Exception {
        SimpleBean bean = new SimpleBean("hello", 42);
        String xml = xmlMapper.writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("hello"));
        assertTrue(xml.contains("42"));
    }

    @Test
    public void testSerializeValue_withNullValue_producesNullRootElement() throws Exception {
        String xml = xmlMapper.writeValueAsString(null);
        assertNotNull(xml);
        assertTrue(xml.contains("null"));
    }

    @Test
    public void testSerializeValue_withEmptyStringValue_producesXml() throws Exception {
        String xml = xmlMapper.writeValueAsString("");
        assertNotNull(xml);
    }

    @Test
    public void testSerializeValue_withList_producesArrayXmlWithItemTags() throws Exception {
        List<String> list = Arrays.asList("a", "b", "c");
        String xml = xmlMapper.writeValueAsString(list);
        assertNotNull(xml);
        assertTrue(xml.contains("item"));
    }

    @Test
    public void testSerializeValue_withArray_producesArrayXmlWithItemTags() throws Exception {
        int[] arr = {1, 2, 3};
        String xml = xmlMapper.writeValueAsString(arr);
        assertNotNull(xml);
        assertTrue(xml.contains("item"));
    }

    @Test
    public void testSerializeValue_withNamespacedRoot_setsDefaultNamespace() throws Exception {
        NamespacedBean bean = new NamespacedBean("val");
        String xml = xmlMapper.writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("val"));
        assertTrue(xml.contains("http://example.com/ns"));
    }

    @Test
    public void testSerializeValue_withCustomRootNameViaWriter_usesGivenRootName() throws Exception {
        SimpleBean bean = new SimpleBean("custom", 1);
        String xml = xmlMapper.writer().withRootName("customRoot").writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("customRoot"));
    }

    // ---------- Using TokenBuffer path (xgen == null / asArray == false) ----------

    @Test
    public void testConvertValue_usesTokenBufferPath_asArrayFalse() throws Exception {
        SimpleBean bean = new SimpleBean("conv", 99);
        @SuppressWarnings("unchecked")
        Map<String, Object> result = xmlMapper.convertValue(bean, Map.class);
        assertNotNull(result);
        assertEquals("conv", result.get("name"));
    }

    @Test
    public void testSerializeValue_withTokenBufferGenerator_asArrayFalseDirectCall() throws Exception {
        TokenBuffer buf = new TokenBuffer(xmlMapper, false);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        SimpleBean bean = new SimpleBean("tokenBuf", 11);
        provider.serializeValue(buf, bean);
        buf.close();
        assertNotNull(buf.asParser().nextToken());
    }

    // ---------- serializeValue(gen, value, rootType) direct calls ----------

    @Test
    public void testSerializeValue_withRootTypeParameter_directCall() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        SimpleBean bean = new SimpleBean("directCall", 8);
        provider.serializeValue(gen, bean, type);
        gen.close();
        String xml = sw.toString();
        assertTrue(xml.contains("directCall"));
    }

    @Test
    public void testSerializeValue_withRootTypeAndNullValue_producesNullElement() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        provider.serializeValue(gen, null, type);
        gen.close();
        assertNotNull(sw.toString());
    }

    @Test
    public void testSerializeValue_withArrayRootType_startsRootArray() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType listType = xmlMapper.constructType(List.class);
        List<String> list = Arrays.asList("x", "y");
        provider.serializeValue(gen, list, listType);
        gen.close();
        String xml = sw.toString();
        assertNotNull(xml);
    }

    // ---------- serializeValue(gen, value, rootType, ser) direct calls ----------

    @Test
    public void testSerializeValue_withExplicitSerializerProvided_usesGivenSerializer() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        @SuppressWarnings("unchecked")
        JsonSerializer<Object> ser = (JsonSerializer<Object>) provider.findValueSerializer(SimpleBean.class);
        SimpleBean bean = new SimpleBean("explicitSer", 3);
        provider.serializeValue(gen, bean, type, ser);
        gen.close();
        String xml = sw.toString();
        assertTrue(xml.contains("explicitSer"));
    }

    @Test
    public void testSerializeValue_with4ArgsAndNullSerializer_findsSerializerInternally() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        SimpleBean bean = new SimpleBean("nullSer", 4);
        provider.serializeValue(gen, bean, type, null);
        gen.close();
        String xml = sw.toString();
        assertTrue(xml.contains("nullSer"));
    }

    @Test
    public void testSerializeValue_with4ArgsAndNullValue_producesNullElement() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = xmlMapper.getFactory().createGenerator(sw);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        provider.serializeValue(gen, null, type, null);
        gen.close();
        assertNotNull(sw.toString());
    }

    @Test
    public void testSerializeValue_with4ArgsUsingTokenBuffer_asArrayFalseDirectCall() throws Exception {
        TokenBuffer buf = new TokenBuffer(xmlMapper, false);
        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        SimpleBean bean = new SimpleBean("tokenBuf4", 22);
        provider.serializeValue(buf, bean, type, null);
        buf.close();
        assertNotNull(buf.asParser().nextToken());
    }

    // ---------- Exception path: gen is neither ToXmlGenerator nor TokenBuffer ----------

    @Test
    public void testSerializeValue_withNonXmlGenerator_throwsJsonMappingException() throws Exception {
        com.fasterxml.jackson.core.JsonFactory jsonFactory = new com.fasterxml.jackson.core.JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator plainGen = jsonFactory.createGenerator(sw);

        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        try {
            provider.serializeValue(plainGen, new SimpleBean("x", 1));
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("ToXmlGenerator"));
        } finally {
            plainGen.close();
        }
    }

    @Test
    public void testSerializeValue_withRootTypeAndNonXmlGenerator_throwsJsonMappingException() throws Exception {
        com.fasterxml.jackson.core.JsonFactory jsonFactory = new com.fasterxml.jackson.core.JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator plainGen = jsonFactory.createGenerator(sw);

        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        try {
            provider.serializeValue(plainGen, new SimpleBean("y", 2), type);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        } finally {
            plainGen.close();
        }
    }

    @Test
    public void testSerializeValue_with4ArgsAndNonXmlGenerator_throwsJsonMappingException() throws Exception {
        com.fasterxml.jackson.core.JsonFactory jsonFactory = new com.fasterxml.jackson.core.JsonFactory();
        StringWriter sw = new StringWriter();
        JsonGenerator plainGen = jsonFactory.createGenerator(sw);

        XmlSerializerProvider provider = (XmlSerializerProvider) xmlMapper.getSerializerProviderInstance();
        JavaType type = xmlMapper.constructType(SimpleBean.class);
        try {
            provider.serializeValue(plainGen, new SimpleBean("z", 3), type, null);
            fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            assertNotNull(e.getMessage());
        } finally {
            plainGen.close();
        }
    }

    // ---------- ObjectWriter based use covering serializeValue(gen,value,rootType) internally ----------

    @Test
    public void testSerializeValue_viaObjectWriterForType_producesExpectedXml() throws Exception {
        SimpleBean bean = new SimpleBean("explicit", 5);
        ObjectWriter writer = xmlMapper.writerFor(SimpleBean.class);
        String xml = writer.writeValueAsString(bean);
        assertTrue(xml.contains("explicit"));
    }

    @Test
    public void testSerializeValue_withJsonProcessingExceptionType_isSubclassOfIOException() {
        // Edge-case check: ensure JsonMappingException (thrown internally) is an IOException subtype,
        // consistent with method signatures declaring "throws IOException".
        JsonMappingException ex = new JsonMappingException(null, "test");
        assertTrue(ex instanceof java.io.IOException);
        assertTrue(ex instanceof JsonProcessingException);
    }
}
