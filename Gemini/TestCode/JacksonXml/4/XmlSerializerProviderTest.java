package com.fasterxml.jackson.dataformat.xml.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.xml.namespace.QName;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest {

    private XmlMapper _xmlMapper;
    private XmlSerializerProvider _provider;

    static class SimpleBean {
        public String name;
        public int count;

        public SimpleBean() { }

        public SimpleBean(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    @JacksonXmlRootElement(localName = "customRoot", namespace = "http://example.com/ns")
    static class NamespacedBean {
        public String id;

        public NamespacedBean(String id) {
            this.id = id;
        }
    }

    static class ThrowingIOExceptionBean {
        public String field;
    }

    static class ThrowingIOExceptionSerializer extends JsonSerializer<ThrowingIOExceptionBean> {
        @Override
        public void serialize(ThrowingIOExceptionBean value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            throw new IOException("Simulated IOException");
        }
    }

    static class ThrowingRuntimeExceptionBean {
        public String field;
    }

    static class ThrowingRuntimeExceptionSerializer extends JsonSerializer<ThrowingRuntimeExceptionBean> {
        @Override
        public void serialize(ThrowingRuntimeExceptionBean value, JsonGenerator gen, SerializerProvider serializers) {
            throw new RuntimeException("Simulated RuntimeException");
        }
    }

    static class ThrowingNullMsgRuntimeExceptionBean {
        public String field;
    }

    static class ThrowingNullMsgRuntimeExceptionSerializer extends JsonSerializer<ThrowingNullMsgRuntimeExceptionBean> {
        @Override
        public void serialize(ThrowingNullMsgRuntimeExceptionBean value, JsonGenerator gen, SerializerProvider serializers) {
            throw new RuntimeException((String) null);
        }
    }

    @Before
    public void setUp() {
        _xmlMapper = new XmlMapper();
        _provider = new XmlSerializerProvider(new XmlRootNameLookup());
    }

    @Test
    public void testConstructorsAndCreateInstance() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider prov = new XmlSerializerProvider(lookup);
        Assert.assertNotNull(prov);

        SerializationConfig config = _xmlMapper.getSerializationConfig();
        SerializerFactory factory = BeanSerializerFactory.instance;

        DefaultSerializerProvider instance = prov.createInstance(config, factory);
        Assert.assertTrue(instance instanceof XmlSerializerProvider);
        Assert.assertSame(config, instance.getConfig());
    }

    @Test
    public void testSerializeValue_nullValue() throws Exception {
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, null);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<null/>") || xml.contains("<null"));
    }

    @Test
    public void testSerializeValue_simpleBean() throws Exception {
        SimpleBean bean = new SimpleBean("test", 123);
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, bean);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<SimpleBean>"));
        Assert.assertTrue(xml.contains("<name>test</name>"));
        Assert.assertTrue(xml.contains("<count>123</count>"));
        Assert.assertTrue(xml.contains("</SimpleBean>"));
    }

    @Test
    public void testSerializeValue_array() throws Exception {
        String[] items = new String[] { "item1", "item2" };
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, items);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<item>item1</item>"));
        Assert.assertTrue(xml.contains("<item>item2</item>"));
    }

    @Test
    public void testSerializeValue_emptyArray() throws Exception {
        String[] items = new String[0];
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, items);
        xgen.close();

        String xml = sw.toString();
        Assert.assertNotNull(xml);
    }

    @Test
    public void testSerializeValue_collection() throws Exception {
        List<String> list = Arrays.asList("alpha", "beta");
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, list);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<item>alpha</item>"));
        Assert.assertTrue(xml.contains("<item>beta</item>"));
    }

    @Test
    public void testSerializeValue_emptyCollection() throws Exception {
        List<String> list = Collections.emptyList();
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, list);
        xgen.close();

        String xml = sw.toString();
        Assert.assertNotNull(xml);
    }

    @Test
    public void testSerializeValue_withTokenBuffer() throws Exception {
        TokenBuffer tb = new TokenBuffer(_xmlMapper, false);
        SimpleBean bean = new SimpleBean("tbName", 42);

        _xmlMapper.getSerializerProviderInstance().serializeValue(tb, bean);
        tb.close();

        SimpleBean result = _xmlMapper.readValue(tb.asParser(), SimpleBean.class);
        Assert.assertEquals("tbName", result.name);
        Assert.assertEquals(42, result.count);
    }

    @Test
    public void testSerializeValue_withNonXmlGenerator_throwsException() {
        try {
            JsonFactory jsonF = new JsonFactory();
            StringWriter sw = new StringWriter();
            JsonGenerator jgen = jsonF.createGenerator(sw);

            _xmlMapper.getSerializerProviderInstance().serializeValue(jgen, new SimpleBean("a", 1));
            Assert.fail("Expected JsonMappingException for non-XML generator");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        } catch (IOException e) {
            Assert.fail("Expected JsonMappingException, but got IOException: " + e.getMessage());
        }
    }

    @Test
    public void testSerializeValue_withExplicitRootNameNoNamespace() throws Exception {
        SerializationConfig config = _xmlMapper.getSerializationConfig()
                .withRootName(PropertyName.construct("customName"));
        DefaultSerializerProvider prov = _xmlMapper.getSerializerProviderInstance()
                .createInstance(config, _xmlMapper.getSerializerFactory());

        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
        prov.serializeValue(xgen, new SimpleBean("x", 10));
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<customName>"));
        Assert.assertTrue(xml.contains("</customName>"));
    }

    @Test
    public void testSerializeValue_withExplicitRootNameWithNamespace() throws Exception {
        SerializationConfig config = _xmlMapper.getSerializationConfig()
                .withRootName(new PropertyName("nsName", "http://custom.org/test"));
        DefaultSerializerProvider prov = _xmlMapper.getSerializerProviderInstance()
                .createInstance(config, _xmlMapper.getSerializerFactory());

        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
        prov.serializeValue(xgen, new SimpleBean("x", 10));
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("nsName"));
        Assert.assertTrue(xml.contains("http://custom.org/test"));
    }

    @Test
    public void testSerializeValue_namespacedBean() throws Exception {
        NamespacedBean bean = new NamespacedBean("id-123");
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, bean);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("customRoot"));
        Assert.assertTrue(xml.contains("http://example.com/ns"));
        Assert.assertTrue(xml.contains("id-123"));
    }

    @Test
    public void testSerializeValue_ioExceptionPropagation() {
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new com.fasterxml.jackson.databind.module.SimpleModule()
                .addSerializer(ThrowingIOExceptionBean.class, new ThrowingIOExceptionSerializer()));

        try {
            mapper.writeValueAsString(new ThrowingIOExceptionBean());
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("Simulated IOException", e.getMessage());
        }
    }

    @Test
    public void testSerializeValue_runtimeExceptionWrapping() {
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new com.fasterxml.jackson.databind.module.SimpleModule()
                .addSerializer(ThrowingRuntimeExceptionBean.class, new ThrowingRuntimeExceptionSerializer()));

        try {
            mapper.writeValueAsString(new ThrowingRuntimeExceptionBean());
            Assert.fail("Expected JsonMappingException wrapping RuntimeException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Simulated RuntimeException"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception type: " + e.getClass().getName());
        }
    }

    @Test
    public void testSerializeValue_runtimeExceptionWithNullMessageWrapping() {
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new com.fasterxml.jackson.databind.module.SimpleModule()
                .addSerializer(ThrowingNullMsgRuntimeExceptionBean.class, new ThrowingNullMsgRuntimeExceptionSerializer()));

        try {
            mapper.writeValueAsString(new ThrowingNullMsgRuntimeExceptionBean());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("[no message for java.lang.RuntimeException]"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception type: " + e.getClass().getName());
        }
    }

    @Test
    public void testSerializeValue_withJavaType_nullValue() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, null, type);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<null/>") || xml.contains("<null"));
    }

    @Test
    public void testSerializeValue_withJavaType_simpleBean() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        SimpleBean bean = new SimpleBean("typeTest", 999);
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, bean, type);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<SimpleBean>"));
        Assert.assertTrue(xml.contains("<name>typeTest</name>"));
        Assert.assertTrue(xml.contains("<count>999</count>"));
    }

    @Test
    public void testSerializeValue_withJavaType_array() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructArrayType(String.class);
        String[] items = new String[] { "val1", "val2" };
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, items, type);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<item>val1</item>"));
        Assert.assertTrue(xml.contains("<item>val2</item>"));
    }

    @Test
    public void testSerializeValue_withJavaType_tokenBuffer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        TokenBuffer tb = new TokenBuffer(_xmlMapper, false);
        SimpleBean bean = new SimpleBean("tbType", 77);

        _xmlMapper.getSerializerProviderInstance().serializeValue(tb, bean, type);
        tb.close();

        SimpleBean result = _xmlMapper.readValue(tb.asParser(), SimpleBean.class);
        Assert.assertEquals("tbType", result.name);
        Assert.assertEquals(77, result.count);
    }

    @Test
    public void testSerializeValue_withJavaType_nonXmlGenThrows() {
        try {
            JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
            JsonGenerator jgen = new JsonFactory().createGenerator(new StringWriter());
            _xmlMapper.getSerializerProviderInstance().serializeValue(jgen, new SimpleBean("a", 1), type);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        } catch (IOException e) {
            Assert.fail("Expected JsonMappingException");
        }
    }

    @Test
    public void testSerializeValue_withJavaType_exceptions() {
        JavaType ioType = TypeFactory.defaultInstance().constructType(ThrowingIOExceptionBean.class);
        XmlMapper mapper = new XmlMapper();
        mapper.registerModule(new com.fasterxml.jackson.databind.module.SimpleModule()
                .addSerializer(ThrowingIOExceptionBean.class, new ThrowingIOExceptionSerializer()));

        try {
            StringWriter sw = new StringWriter();
            ToXmlGenerator xgen = mapper.getFactory().createGenerator(sw);
            mapper.getSerializerProviderInstance().serializeValue(xgen, new ThrowingIOExceptionBean(), ioType);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("Simulated IOException", e.getMessage());
        }

        JavaType rtType = TypeFactory.defaultInstance().constructType(ThrowingRuntimeExceptionBean.class);
        mapper = new XmlMapper();
        mapper.registerModule(new com.fasterxml.jackson.databind.module.SimpleModule()
                .addSerializer(ThrowingRuntimeExceptionBean.class, new ThrowingRuntimeExceptionSerializer()));
        try {
            StringWriter sw = new StringWriter();
            ToXmlGenerator xgen = mapper.getFactory().createGenerator(sw);
            mapper.getSerializerProviderInstance().serializeValue(xgen, new ThrowingRuntimeExceptionBean(), rtType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Simulated RuntimeException"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        JavaType rtNullMsgType = TypeFactory.defaultInstance().constructType(ThrowingNullMsgRuntimeExceptionBean.class);
        mapper = new XmlMapper();
        mapper.registerModule(new com.fasterxml.jackson.databind.module.SimpleModule()
                .addSerializer(ThrowingNullMsgRuntimeExceptionBean.class, new ThrowingNullMsgRuntimeExceptionSerializer()));
        try {
            StringWriter sw = new StringWriter();
            ToXmlGenerator xgen = mapper.getFactory().createGenerator(sw);
            mapper.getSerializerProviderInstance().serializeValue(xgen, new ThrowingNullMsgRuntimeExceptionBean(), rtNullMsgType);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("[no message for java.lang.RuntimeException]"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testSerializeValue_withJavaTypeAndSerializer_nullValue() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, null, type, null);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<null/>") || xml.contains("<null"));
    }

    @Test
    public void testSerializeValue_withJavaTypeAndSerializer_explicitSerializer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        SimpleBean bean = new SimpleBean("customSer", 555);
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        JsonSerializer<Object> ser = _xmlMapper.getSerializerProviderInstance()
                .findTypedValueSerializer(type, true, null);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, bean, type, ser);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<SimpleBean>"));
        Assert.assertTrue(xml.contains("<name>customSer</name>"));
    }

    @Test
    public void testSerializeValue_withJavaTypeAndSerializer_nullSerializerFallsBack() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        SimpleBean bean = new SimpleBean("fallbackSer", 333);
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, bean, type, null);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<SimpleBean>"));
        Assert.assertTrue(xml.contains("<name>fallbackSer</name>"));
    }

    @Test
    public void testSerializeValue_withJavaTypeAndSerializer_tokenBuffer() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        TokenBuffer tb = new TokenBuffer(_xmlMapper, false);
        SimpleBean bean = new SimpleBean("tbTypeSer", 888);

        _xmlMapper.getSerializerProviderInstance().serializeValue(tb, bean, type, null);
        tb.close();

        SimpleBean result = _xmlMapper.readValue(tb.asParser(), SimpleBean.class);
        Assert.assertEquals("tbTypeSer", result.name);
    }

    @Test
    public void testSerializeValue_withJavaTypeAndSerializer_array() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructArrayType(String.class);
        String[] items = new String[] { "foo", "bar" };
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);

        _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, items, type, null);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<item>foo</item>"));
        Assert.assertTrue(xml.contains("<item>bar</item>"));
    }

    @Test
    public void testSerializeValue_withJavaTypeAndSerializer_exceptions() {
        JavaType ioType = TypeFactory.defaultInstance().constructType(ThrowingIOExceptionBean.class);
        try {
            StringWriter sw = new StringWriter();
            ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
            _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, new ThrowingIOExceptionBean(), ioType, new ThrowingIOExceptionSerializer());
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("Simulated IOException", e.getMessage());
        }

        JavaType rtType = TypeFactory.defaultInstance().constructType(ThrowingRuntimeExceptionBean.class);
        try {
            StringWriter sw = new StringWriter();
            ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
            _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, new ThrowingRuntimeExceptionBean(), rtType, new ThrowingRuntimeExceptionSerializer());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Simulated RuntimeException"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }

        JavaType rtNullMsgType = TypeFactory.defaultInstance().constructType(ThrowingNullMsgRuntimeExceptionBean.class);
        try {
            StringWriter sw = new StringWriter();
            ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
            _xmlMapper.getSerializerProviderInstance().serializeValue(xgen, new ThrowingNullMsgRuntimeExceptionBean(), rtNullMsgType, new ThrowingNullMsgRuntimeExceptionSerializer());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("[no message for java.lang.RuntimeException]"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception");
        }
    }

    @Test
    public void testProtectedMethodsDirectly() throws Exception {
        class SubXmlSerializerProvider extends XmlSerializerProvider {
            public SubXmlSerializerProvider(XmlRootNameLookup rootNames) {
                super(rootNames);
            }

            public SubXmlSerializerProvider(XmlSerializerProvider src, SerializationConfig config, SerializerFactory f) {
                super(src, config, f);
            }

            public void testProtected(JsonGenerator gen, Object val) throws Exception {
                ToXmlGenerator xgen = _asXmlGenerator(gen);
                QName qname = _rootNameFromConfig();
                if (xgen != null) {
                    if (qname == null) {
                        qname = new QName("http://test.org", "testLocal");
                    }
                    _initWithRootName(xgen, qname);
                    _startRootArray(xgen, qname);
                }
                _serializeXmlNull(gen);
            }
        }

        SubXmlSerializerProvider subProv = new SubXmlSerializerProvider(new XmlRootNameLookup());
        SerializationConfig config = _xmlMapper.getSerializationConfig();
        SubXmlSerializerProvider configuredProv = new SubXmlSerializerProvider(subProv, config, _xmlMapper.getSerializerFactory());

        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = _xmlMapper.getFactory().createGenerator(sw);
        configuredProv.testProtected(xgen, "dummy");
        xgen.close();

        Assert.assertNotNull(sw.toString());
    }

    @Test
    public void testRootNameForNullConstant() {
        Assert.assertEquals(new QName("null"), XmlSerializerProvider.ROOT_NAME_FOR_NULL);
    }
}
