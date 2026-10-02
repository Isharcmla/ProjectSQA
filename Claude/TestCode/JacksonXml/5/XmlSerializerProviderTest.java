import com.fasterxml.jackson.databind.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class XmlSerializerProviderTest {

    private XmlMapper mapper;

    @Before
    public void setUp() {
        mapper = new XmlMapper();
    }

    // ---------- helper classes ----------

    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() { }

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class ThrowingBean {
        public String getValue() {
            throw new RuntimeException("boom");
        }
    }

    @JacksonXmlRootElement(localName = "nsRoot", namespace = "http://example.com/ns")
    public static class NamespacedBean {
        public String name = "hello";
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withRootNameLookup_createsInstance() {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        assertNotNull(provider);
    }

    @Test
    public void testConstructor_withSrcConfigAndFactory_createsInstance() {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        SerializationConfig config = mapper.getSerializationConfig();
        SerializerFactory factory = BeanSerializerFactory.instance;
        XmlSerializerProvider provider2 = new XmlSerializerProvider(provider, config, factory);
        assertNotNull(provider2);
    }

    // ---------- copy() ----------

    @Test
    public void testCopy_returnsDifferentInstanceOfSameType() {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        DefaultSerializerProvider copy = provider.copy();
        assertNotNull(copy);
        assertNotSame(provider, copy);
        assertTrue(copy instanceof XmlSerializerProvider);
    }

    // ---------- createInstance() ----------

    @Test
    public void testCreateInstance_withConfigAndFactory_returnsNewInstance() {
        XmlSerializerProvider provider = new XmlSerializerProvider(new XmlRootNameLookup());
        SerializationConfig config = mapper.getSerializationConfig();
        SerializerFactory factory = BeanSerializerFactory.instance;
        DefaultSerializerProvider instance = provider.createInstance(config, factory);
        assertNotNull(instance);
        assertTrue(instance instanceof XmlSerializerProvider);
        assertNotSame(provider, instance);
    }

    // ---------- serializeValue(gen, value) via XmlMapper ----------

    @Test
    public void testSerializeValue_normalObject_producesXmlOutput() throws Exception {
        SimpleBean bean = new SimpleBean("Tom", 30);
        String xml = mapper.writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("Tom"));
        assertTrue(xml.contains("30"));
    }

    @Test
    public void testSerializeValue_nullValue_producesNullRootElement() throws Exception {
        String xml = mapper.writeValueAsString(null);
        assertNotNull(xml);
        assertTrue(xml.contains("null"));
    }

    @Test
    public void testSerializeValue_listType_producesArrayXmlWithItemTags() throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        String xml = mapper.writeValueAsString(list);
        assertNotNull(xml);
        assertTrue(xml.contains("<item>"));
    }

    @Test
    public void testSerializeValue_arrayType_producesArrayXmlWithItemTags() throws Exception {
        String[] arr = {"x", "y"};
        String xml = mapper.writeValueAsString(arr);
        assertNotNull(xml);
        assertTrue(xml.contains("<item>"));
    }

    @Test
    public void testSerializeValue_withNamespaceAnnotation_producesNamespacedXml() throws Exception {
        NamespacedBean bean = new NamespacedBean();
        String xml = mapper.writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("http://example.com/ns"));
    }

    @Test
    public void testSerializeValue_withExplicitRootNameConfig_usesConfiguredRootName() throws Exception {
        SimpleBean bean = new SimpleBean("Jerry", 5);
        String xml = mapper.writer().withRootName("myRoot").writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("myRoot"));
    }

    @Test
    public void testSerializeValue_nullValueWithExplicitRootNameConfig_usesConfiguredRootName() throws Exception {
        String xml = mapper.writer().withRootName("myRoot").writeValueAsString(null);
        assertNotNull(xml);
        assertTrue(xml.contains("myRoot"));
    }

    @Test
    public void testSerializeValue_viaConvertValue_hitsTokenBufferBranch() throws Exception {
        SimpleBean bean = new SimpleBean("Bob", 20);
        java.util.Map<?, ?> map = mapper.convertValue(bean, java.util.Map.class);
        assertNotNull(map);
        assertEquals("Bob", map.get("name"));
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValue_withThrowingSerializer_throwsJsonMappingException() throws Exception {
        ThrowingBean bean = new ThrowingBean();
        mapper.writeValueAsString(bean);
    }

    // ---------- serializeValue(gen, value, rootType, ser) via ObjectWriter.forType ----------

    @Test
    public void testSerializeValue_withTypedWriter_normalObject_producesXmlOutput() throws Exception {
        ObjectWriter writer = mapper.writerFor(SimpleBean.class);
        SimpleBean bean = new SimpleBean("Alice", 25);
        String xml = writer.writeValueAsString(bean);
        assertNotNull(xml);
        assertTrue(xml.contains("Alice"));
    }

    @Test
    public void testSerializeValue_withTypedWriter_nullValue_producesNullRoot() throws Exception {
        ObjectWriter writer = mapper.writerFor(SimpleBean.class);
        String xml = writer.writeValueAsString(null);
        assertNotNull(xml);
        assertTrue(xml.contains("null"));
    }

    @Test
    public void testSerializeValue_withTypedWriter_arrayType_producesArrayXml() throws Exception {
        ObjectWriter writer = mapper.writerFor(String[].class);
        String[] arr = {"p", "q"};
        String xml = writer.writeValueAsString(arr);
        assertNotNull(xml);
        assertTrue(xml.contains("<item>"));
    }

    @Test(expected = JsonMappingException.class)
    public void testSerializeValue_withTypedWriter_throwingSerializer_throwsJsonMappingException() throws Exception {
        ObjectWriter writer = mapper.writerFor(ThrowingBean.class);
        ThrowingBean bean = new ThrowingBean();
        writer.writeValueAsString(bean);
    }

    // ---------- edge cases ----------

    @Test
    public void testSerializeValue_emptyStringValue_producesXml() throws Exception {
        String xml = mapper.writeValueAsString("");
        assertNotNull(xml);
    }

    @Test
    public void testSerializeValue_emptyList_producesXmlWithoutError() throws Exception {
        List<String> list = new ArrayList<String>();
        String xml = mapper.writeValueAsString(list);
        assertNotNull(xml);
    }
}
