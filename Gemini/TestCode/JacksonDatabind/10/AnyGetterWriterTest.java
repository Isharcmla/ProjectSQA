package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AnyGetterWriterTest {

    private ObjectMapper mapper;

    public static class NormalBean {
        private final Map<String, Object> values = new HashMap<String, Object>();

        public NormalBean() {
            values.put("key1", "val1");
            values.put("key2", 123);
        }

        @JsonAnyGetter
        public Map<String, Object> any() {
            return values;
        }
    }

    public static class NullMapBean {
        @JsonAnyGetter
        public Map<String, Object> any() {
            return null;
        }
    }

    public static class EmptyMapBean {
        @JsonAnyGetter
        public Map<String, Object> any() {
            return Collections.emptyMap();
        }
    }

    public static class InvalidTypeBean {
        @JsonAnyGetter
        public Object any() {
            return "not-a-map";
        }
    }

    @JsonFilter("testFilter")
    public static class FilteredBean {
        private final Map<String, Object> values = new HashMap<String, Object>();

        public FilteredBean() {
            values.put("included", "yes");
            values.put("excluded", "no");
        }

        @JsonAnyGetter
        public Map<String, Object> any() {
            return values;
        }
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    private AnnotatedMember getAnyGetterMember(Class<?> cls) {
        JavaType type = mapper.constructType(cls);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        AnnotatedMember member = desc.findAnyGetter();
        if (member == null) {
            for (AnnotatedMember m : desc.getClassInfo().memberMethods()) {
                if ("any".equals(m.getName())) {
                    return m;
                }
            }
        }
        return member;
    }

    private MapSerializer getMapSerializer() throws Exception {
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        return (MapSerializer) provider.findValueSerializer(Map.class, null);
    }

    @Test
    public void testGetAndSerialize_normalInput_serializesSuccessfully() throws Exception {
        AnnotatedMember member = getAnyGetterMember(NormalBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndSerialize(new NormalBean(), gen, provider);
        gen.writeEndObject();
        gen.flush();

        String json = sw.toString();
        Assert.assertTrue(json.contains("\"key1\":\"val1\""));
        Assert.assertTrue(json.contains("\"key2\":123"));
    }

    @Test
    public void testGetAndSerialize_nullMap_returnsQuietly() throws Exception {
        AnnotatedMember member = getAnyGetterMember(NullMapBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndSerialize(new NullMapBean(), gen, provider);
        gen.writeEndObject();
        gen.flush();

        Assert.assertEquals("{}", sw.toString());
    }

    @Test
    public void testGetAndSerialize_emptyMap_serializesEmpty() throws Exception {
        AnnotatedMember member = getAnyGetterMember(EmptyMapBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndSerialize(new EmptyMapBean(), gen, provider);
        gen.writeEndObject();
        gen.flush();

        Assert.assertEquals("{}", sw.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndSerialize_invalidReturnType_throwsJsonMappingException() throws Exception {
        AnnotatedMember member = getAnyGetterMember(InvalidTypeBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        writer.getAndSerialize(new InvalidTypeBean(), gen, provider);
    }

    @Test
    public void testGetAndSerialize_nullSerializer_doesNothing() throws Exception {
        AnnotatedMember member = getAnyGetterMember(NormalBean.class);
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, null);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndSerialize(new NormalBean(), gen, provider);
        gen.writeEndObject();
        gen.flush();

        Assert.assertEquals("{}", sw.toString());
    }

    @Test
    public void testGetAndFilter_normalInput_filtersFieldsCorrectly() throws Exception {
        AnnotatedMember member = getAnyGetterMember(FilteredBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        SimpleFilterProvider filterProvider = new SimpleFilterProvider()
                .addFilter("testFilter", SimpleBeanPropertyFilter.serializeAllExcept("excluded"));

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndFilter(new FilteredBean(), gen, provider, filterProvider.findPropertyFilter("testFilter", null));
        gen.writeEndObject();
        gen.flush();

        String json = sw.toString();
        Assert.assertTrue(json.contains("\"included\":\"yes\""));
        Assert.assertFalse(json.contains("\"excluded\""));
    }

    @Test
    public void testGetAndFilter_nullMap_returnsQuietly() throws Exception {
        AnnotatedMember member = getAnyGetterMember(NullMapBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndFilter(new NullMapBean(), gen, provider, SimpleBeanPropertyFilter.serializeAll());
        gen.writeEndObject();
        gen.flush();

        Assert.assertEquals("{}", sw.toString());
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndFilter_invalidReturnType_throwsJsonMappingException() throws Exception {
        AnnotatedMember member = getAnyGetterMember(InvalidTypeBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        writer.getAndFilter(new InvalidTypeBean(), gen, provider, SimpleBeanPropertyFilter.serializeAll());
    }

    @Test
    public void testGetAndFilter_nullSerializer_doesNothing() throws Exception {
        AnnotatedMember member = getAnyGetterMember(FilteredBean.class);
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, null);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider provider = mapper.getSerializerProviderInstance();

        gen.writeStartObject();
        writer.getAndFilter(new FilteredBean(), gen, provider, SimpleBeanPropertyFilter.serializeAll());
        gen.writeEndObject();
        gen.flush();

        Assert.assertEquals("{}", sw.toString());
    }

    @Test
    public void testResolve_validProvider_contextualizesSerializer() throws Exception {
        AnnotatedMember member = getAnyGetterMember(NormalBean.class);
        MapSerializer mapSer = getMapSerializer();
        BeanProperty prop = new BeanProperty.Bogus();
        AnyGetterWriter writer = new AnyGetterWriter(prop, member, mapSer);

        SerializerProvider provider = mapper.getSerializerProviderInstance();
        writer.resolve(provider);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);

        gen.writeStartObject();
        writer.getAndSerialize(new NormalBean(), gen, provider);
        gen.writeEndObject();
        gen.flush();

        String json = sw.toString();
        Assert.assertTrue(json.contains("\"key1\":\"val1\""));
    }

    @Test
    public void testFullSerializationIntegration() throws Exception {
        NormalBean bean = new NormalBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"key1\":\"val1\""));
        Assert.assertTrue(json.contains("\"key2\":123"));
    }
}
