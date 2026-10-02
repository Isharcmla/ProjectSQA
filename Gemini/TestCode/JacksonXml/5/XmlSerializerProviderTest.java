package com.fasterxml.jackson.dataformat.xml.ser;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.xml.namespace.QName;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.util.XmlRootNameLookup;

public class XmlSerializerProviderTest {

    static class SimpleBean {
        public String name;

        public SimpleBean() {}

        public SimpleBean(String name) {
            this.name = name;
        }
    }

    @JacksonXmlRootElement(localName = "customRoot", namespace = "http://example.com/ns")
    static class NamespacedBean {
        public int id = 123;
    }

    static class RuntimeExceptionBeanSerializer extends StdSerializer<Object> {
        public RuntimeExceptionBeanSerializer() {
            super(Object.class);
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            throw new RuntimeException("custom runtime error");
        }
    }

    static class RuntimeExceptionNoMsgBeanSerializer extends StdSerializer<Object> {
        public RuntimeExceptionNoMsgBeanSerializer() {
            super(Object.class);
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            throw new RuntimeException((String) null);
        }
    }

    static class IOExceptionBeanSerializer extends StdSerializer<Object> {
        public IOExceptionBeanSerializer() {
            super(Object.class);
        }

        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            throw new IOException("custom IO error");
        }
    }

    @JsonSerialize(using = RuntimeExceptionBeanSerializer.class)
    static class ThrowingRuntimeExceptionBean {}

    @JsonSerialize(using = RuntimeExceptionNoMsgBeanSerializer.class)
    static class ThrowingRuntimeExceptionNoMsgBean {}

    @JsonSerialize(using = IOExceptionBeanSerializer.class)
    static class ThrowingIOExceptionBean {}

    @Test
    public void testConstructorsAndCopyAndCreateInstance() {
        XmlRootNameLookup lookup = new XmlRootNameLookup();
        XmlSerializerProvider provider = new XmlSerializerProvider(lookup);
        Assert.assertNotNull(provider);

        DefaultSerializerProvider copy = provider.copy();
        Assert.assertNotNull(copy);
        Assert.assertTrue(copy instanceof XmlSerializerProvider);

        XmlMapper mapper = new XmlMapper();
        SerializationConfig config = mapper.getSerializationConfig();
        SerializerFactory factory = mapper.getSerializerFactory();

        DefaultSerializerProvider instance = provider.createInstance(config, factory);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof XmlSerializerProvider);
    }

    @Test
    public void testSerializeValue_nullValue_defaultRootName() throws Exception {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writeValueAsString(null);
        Assert.assertEquals("<null/>", xml);
    }

    @Test
    public void testSerializeValue_nullValue_withExplicitRootName() throws Exception {
        XmlMapper mapper = new XmlMapper();
        String xml = mapper.writer().withRootName("myNull").writeValueAsString(null);
        Assert.assertEquals("<myNull/>", xml);
    }

    @Test
    public void testSerializeValue_nullValue_withTokenBuffer() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        TokenBuffer buffer = new TokenBuffer(mapper, false);

        provider.serializeValue(buffer, null);
        buffer.close();

        Assert.assertTrue(buffer.firstToken() == null || buffer.firstToken().isScalarValue());
    }

    @Test
    public void testSerializeValue_simpleObject() throws Exception {
        XmlMapper mapper = new XmlMapper();
        SimpleBean bean = new SimpleBean("testValue");
        String xml = mapper.writeValueAsString(bean);
        Assert.assertTrue(xml.contains("<name>testValue</name>"));
    }

    @Test
    public void testSerializeValue_withRootNameConfig_noNamespace() throws Exception {
        XmlMapper mapper = new XmlMapper();
        SimpleBean bean = new SimpleBean("abc");
        String xml = mapper.writer().withRootName("customSimple").writeValueAsString(bean);
        Assert.assertTrue(xml.startsWith("<customSimple>"));
        Assert.assertTrue(xml.endsWith("</customSimple>"));
    }

    @Test
    public void testSerializeValue_withRootNameConfig_withNamespace() throws Exception {
        XmlMapper mapper = new XmlMapper();
        SimpleBean bean = new SimpleBean("abc");
        PropertyName pName = new PropertyName("customNsRoot", "http://custom.org/ns");
        String xml = mapper.writer().withRootName(pName).writeValueAsString(bean);
        Assert.assertTrue(xml.contains("xmlns=\"http://custom.org/ns\""));
        Assert.assertTrue(xml.contains("customNsRoot"));
    }

    @Test
    public void testSerializeValue_annotatedNamespace() throws Exception {
        XmlMapper mapper = new XmlMapper();
        NamespacedBean bean = new NamespacedBean();
        String xml = mapper.writeValueAsString(bean);
        Assert.assertTrue(xml.contains("xmlns=\"http://example.com/ns\""));
        Assert.assertTrue(xml.contains("<customRoot"));
    }

    @Test
    public void testSerializeValue_indexedType_array() throws Exception {
        XmlMapper mapper = new XmlMapper();
        String[] array = new String[]{"item1", "item2"};
        String xml = mapper.writeValueAsString(array);
        Assert.assertTrue(xml.contains("<item>item1</item>"));
        Assert.assertTrue(xml.contains("<item>item2</item>"));
    }

    @Test
    public void testSerializeValue_indexedType_emptyArray() throws Exception {
        XmlMapper mapper = new XmlMapper();
        String[] array = new String[0];
        String xml = mapper.writeValueAsString(array);
        Assert.assertTrue(xml.contains("<response/>") || xml.contains("<response></response>") || xml.contains("<String/>"));
    }

    @Test
    public void testSerializeValue_indexedType_list() throws Exception {
        XmlMapper mapper = new XmlMapper();
        List<String> list = Arrays.asList("alpha", "beta");
        String xml = mapper.writeValueAsString(list);
        Assert.assertTrue(xml.contains("<item>alpha</item>"));
        Assert.assertTrue(xml.contains("<item>beta</item>"));
    }

    @Test
    public void testSerializeValue_indexedType_emptyList() throws Exception {
        XmlMapper mapper = new XmlMapper();
        List<String> list = Collections.emptyList();
        String xml = mapper.writeValueAsString(list);
        Assert.assertNotNull(xml);
    }

    @Test
    public void testSerializeValue_withTokenBuffer() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        TokenBuffer buffer = new TokenBuffer(mapper, false);

        SimpleBean bean = new SimpleBean("buffered");
        provider.serializeValue(buffer, bean);
        buffer.close();

        SimpleBean result = mapper.readValue(buffer.asParser(), SimpleBean.class);
        Assert.assertEquals("buffered", result.name);
    }

    @Test
    public void testSerializeValue_invalidGeneratorType_throwsJsonMappingException() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        JsonGenerator nonXmlGen = new JsonFactory().createGenerator(new StringWriter());

        try {
            provider.serializeValue(nonXmlGen, new SimpleBean("fail"));
            Assert.fail("Expected JsonMappingException for invalid generator type");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("XmlMapper does not with generators of type other than ToXmlGenerator"));
        } finally {
            nonXmlGen.close();
        }
    }

    @Test
    public void testSerializeValue_withTypeAndSerializer_nullValue() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = new XmlFactory().createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);

        provider.serializeValue(xgen, null, type, null);
        xgen.close();

        Assert.assertEquals("<null/>", sw.toString());
    }

    @Test
    public void testSerializeValue_withTypeAndSerializer_validObjectAndCustomSerializer() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = new XmlFactory().createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);

        JsonSerializer<Object> customSer = new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeStartObject();
                gen.writeStringField("customField", ((SimpleBean) value).name);
                gen.writeEndObject();
            }
        };

        provider.serializeValue(xgen, new SimpleBean("explicitVal"), type, customSer);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<customField>explicitVal</customField>"));
    }

    @Test
    public void testSerializeValue_withTypeAndSerializer_indexedTypeWithNullSerializer() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = new XmlFactory().createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(ArrayList.class, String.class);

        List<String> list = Arrays.asList("entry1", "entry2");
        provider.serializeValue(xgen, list, type, null);
        xgen.close();

        String xml = sw.toString();
        Assert.assertTrue(xml.contains("<item>entry1</item>"));
        Assert.assertTrue(xml.contains("<item>entry2</item>"));
    }

    @Test
    public void testSerializeValue_withType_usingTokenBuffer() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        TokenBuffer buffer = new TokenBuffer(mapper, false);
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);

        provider.serializeValue(buffer, new SimpleBean("tokenVal"), type, null);
        buffer.close();

        SimpleBean result = mapper.readValue(buffer.asParser(), SimpleBean.class);
        Assert.assertEquals("tokenVal", result.name);
    }

    @Test
    public void testSerializeValue_throwsIOException_wrappedProperly() {
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writeValueAsString(new ThrowingIOExceptionBean());
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("custom IO error"));
        }
    }

    @Test
    public void testSerializeValue_throwsRuntimeException_wrappedInJsonMappingException() {
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writeValueAsString(new ThrowingRuntimeExceptionBean());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("custom runtime error"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testSerializeValue_throwsRuntimeExceptionNoMessage_wrappedInJsonMappingException() {
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writeValueAsString(new ThrowingRuntimeExceptionNoMsgBean());
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("[no message for java.lang.RuntimeException]"));
        } catch (IOException e) {
            Assert.fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testSerializeValue_withType_throwsRuntimeException_wrappedInJsonMappingException() throws Exception {
        XmlMapper mapper = new XmlMapper();
        XmlSerializerProvider provider = (XmlSerializerProvider) mapper.getSerializerProviderInstance();
        StringWriter sw = new StringWriter();
        ToXmlGenerator xgen = new XmlFactory().createGenerator(sw);
        JavaType type = TypeFactory.defaultInstance().constructType(ThrowingRuntimeExceptionBean.class);

        try {
            provider.serializeValue(xgen, new ThrowingRuntimeExceptionBean(), type, null);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("custom runtime error"));
        } finally {
            xgen.close();
        }
    }
}
