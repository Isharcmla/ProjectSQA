package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanSerializerBaseTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // Concrete implementation of BeanSerializerBase for direct testing
    static class ConcreteBeanSerializer extends BeanSerializerBase {
        public ConcreteBeanSerializer(JavaType type, BeanSerializerBuilder builder,
                                      BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties) {
            super(type, builder, properties, filteredProperties);
        }

        public ConcreteBeanSerializer(ConcreteBeanSerializer src, BeanPropertyWriter[] properties,
                                      BeanPropertyWriter[] filteredProperties) {
            super(src, properties, filteredProperties);
        }

        public ConcreteBeanSerializer(ConcreteBeanSerializer src, ObjectIdWriter objectIdWriter) {
            super(src, objectIdWriter);
        }

        public ConcreteBeanSerializer(ConcreteBeanSerializer src, ObjectIdWriter objectIdWriter, Object filterId) {
            super(src, objectIdWriter, filterId);
        }

        public ConcreteBeanSerializer(ConcreteBeanSerializer src, String[] toIgnore) {
            super(src, toIgnore);
        }

        public ConcreteBeanSerializer(ConcreteBeanSerializer src) {
            super(src);
        }

        public ConcreteBeanSerializer(ConcreteBeanSerializer src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }

        @Override
        public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
            return new ConcreteBeanSerializer(this, objectIdWriter);
        }

        @Override
        protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new ConcreteBeanSerializer(this, toIgnore);
        }

        @Override
        protected BeanSerializerBase asArraySerializer() {
            return this;
        }

        @Override
        protected BeanSerializerBase withFilterId(Object filterId) {
            return new ConcreteBeanSerializer(this, _objectIdWriter, filterId);
        }

        @Override
        public void serialize(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeStartObject();
            if (_propertyFilterId != null) {
                serializeFieldsFiltered(bean, gen, provider);
            } else {
                serializeFields(bean, gen, provider);
            }
            gen.writeEndObject();
        }

        public BeanPropertyWriter[] getProps() {
            return _props;
        }

        public BeanPropertyWriter[] getFilteredProps() {
            return _filteredProps;
        }

        public Object getFilterId() {
            return _propertyFilterId;
        }

        public ObjectIdWriter getObjectIdWriter() {
            return _objectIdWriter;
        }
    }

    // Test helper classes
    static class SimpleBean {
        public String name = "test";
        public int value = 42;
    }

    @JsonFilter("testFilter")
    static class FilteredBean {
        public String a = "1";
        public String b = "2";
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    @JsonPropertyOrder({"id", "name"})
    static class ArrayShapeBean {
        public int id = 1;
        public String name = "array";
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class PropertyIdBean {
        public int id = 100;
        public String text = "propId";
        public PropertyIdBean next;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IntSeqIdBean {
        public String name = "seq";
        public IntSeqIdBean next;
    }

    static class AlwaysAsIdContainer {
        @JsonIdentityReference(alwaysAsId = true)
        public PropertyIdBean bean;
    }

    @JsonSerializableSchema(id = "urn:custom-schema-id")
    static class SchemaAnnotatedBean {
        public String field = "val";
    }

    static class StringUpperConverter extends StdConverter<String, String> {
        @Override
        public String convert(String value) {
            return value == null ? null : value.toUpperCase();
        }
    }

    static class ConvertedBean {
        @JsonSerialize(converter = StringUpperConverter.class)
        public String prop = "hello";
    }

    static class ExceptionBean {
        public String getFail() {
            throw new RuntimeException("Simulated getter failure");
        }
    }

    static class StackOverflowBean {
        public StackOverflowBean self = this;
    }

    static class Views {
        static class Public {}
        static class Internal extends Public {}
    }

    static class ViewBean {
        @com.fasterxml.jackson.annotation.JsonView(Views.Public.class)
        public String pub = "public";

        @com.fasterxml.jackson.annotation.JsonView(Views.Internal.class)
        public String internal = "internal";
    }

    static class UnwrappedParent {
        public String top = "topValue";
        @JsonUnwrapped(prefix = "child_")
        public SimpleBean child = new SimpleBean();
    }

    public enum CustomEnum {
        @JsonProperty("first_val")
        FIRST,
        @JsonProperty("second_val")
        SECOND;
    }

    static class EnumWrapper {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public CustomEnum val = CustomEnum.FIRST;
    }

    @Test
    public void testConstructors_nullBuilder_initializesNullFields() {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        ConcreteBeanSerializer ser = new ConcreteBeanSerializer(type, null, new BeanPropertyWriter[0], null);

        Assert.assertEquals(0, ser.getProps().length);
        Assert.assertNull(ser.getFilteredProps());
        Assert.assertNull(ser.getFilterId());
        Assert.assertNull(ser.getObjectIdWriter());
        Assert.assertFalse(ser.usesObjectId());
    }

    @Test
    public void testConstructors_withBuilder_initializesProperly() {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        BeanDescription desc = mapper.getSerializationConfig().introspect(type);
        BeanSerializerBuilder builder = new BeanSerializerBuilder(desc);
        builder.setFilterId("myFilter");

        ConcreteBeanSerializer ser = new ConcreteBeanSerializer(type, builder, new BeanPropertyWriter[0], null);
        Assert.assertEquals("myFilter", ser.getFilterId());
    }

    @Test
    public void testConstructors_mutationsAndCopy() {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        ConcreteBeanSerializer src = new ConcreteBeanSerializer(type, null, new BeanPropertyWriter[0], null);

        ConcreteBeanSerializer copy = new ConcreteBeanSerializer(src);
        Assert.assertEquals(0, copy.getProps().length);

        BeanSerializerBase withFilter = copy.withFilterId("newFilter");
        Assert.assertEquals("newFilter", ((ConcreteBeanSerializer) withFilter).getFilterId());

        NameTransformer transformer = NameTransformer.simpleTransformer("prefix_", "");
        ConcreteBeanSerializer unwrapped = new ConcreteBeanSerializer(src, transformer);
        Assert.assertNotNull(unwrapped);

        ConcreteBeanSerializer nopUnwrapped = new ConcreteBeanSerializer(src, NameTransformer.NOP);
        Assert.assertNotNull(nopUnwrapped);

        ConcreteBeanSerializer nullUnwrapped = new ConcreteBeanSerializer(src, (NameTransformer) null);
        Assert.assertNotNull(nullUnwrapped);
    }

    @Test
    public void testConstructors_withIgnorals_filtersProps() {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        DefaultSerializerProvider.Impl provider = (DefaultSerializerProvider.Impl) mapper.getSerializerProviderInstance();

        List<BeanPropertyWriter> props = mapper.getSerializationConfig().introspect(type).findProperties();
        BeanPropertyWriter[] propsArr = new BeanPropertyWriter[0];

        ConcreteBeanSerializer baseSer = new ConcreteBeanSerializer(type, null, propsArr, propsArr);
        BeanSerializerBase ignoredSer = baseSer.withIgnorals(new String[]{"name"});
        Assert.assertNotNull(ignoredSer);
    }

    @Test
    public void testSerialization_simpleBean() throws Exception {
        SimpleBean bean = new SimpleBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"name\":\"test\""));
        Assert.assertTrue(json.contains("\"value\":42"));
    }

    @Test
    public void testSerialization_arrayShape() throws Exception {
        ArrayShapeBean bean = new ArrayShapeBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertEquals("[1,\"array\"]", json);
    }

    @Test
    public void testSerialization_withFilter() throws Exception {
        FilteredBean bean = new FilteredBean();
        FilterProvider filters = new SimpleFilterProvider().addFilter("testFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("a"));
        String json = mapper.writer(filters).writeValueAsString(bean);
        Assert.assertEquals("{\"a\":\"1\"}", json);
    }

    @Test
    public void testSerialization_withMissingFilter_serializesAll() throws Exception {
        FilteredBean bean = new FilteredBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertTrue(json.contains("\"a\":\"1\""));
        Assert.assertTrue(json.contains("\"b\":\"2\""));
    }

    @Test
    public void testSerialization_views() throws Exception {
        ViewBean bean = new ViewBean();
        String jsonPublic = mapper.writerWithView(Views.Public.class).writeValueAsString(bean);
        Assert.assertTrue(jsonPublic.contains("\"pub\":\"public\""));
        Assert.assertFalse(jsonPublic.contains("\"internal\""));

        String jsonInternal = mapper.writerWithView(Views.Internal.class).writeValueAsString(bean);
        Assert.assertTrue(jsonInternal.contains("\"pub\":\"public\""));
        Assert.assertTrue(jsonInternal.contains("\"internal\":\"internal\""));
    }

    @Test
    public void testSerialization_unwrappedPrefix() throws Exception {
        UnwrappedParent parent = new UnwrappedParent();
        String json = mapper.writeValueAsString(parent);
        Assert.assertTrue(json.contains("\"top\":\"topValue\""));
        Assert.assertTrue(json.contains("\"child_name\":\"test\""));
        Assert.assertTrue(json.contains("\"child_value\":42"));
    }

    @Test
    public void testSerialization_converter() throws Exception {
        ConvertedBean bean = new ConvertedBean();
        String json = mapper.writeValueAsString(bean);
        Assert.assertEquals("{\"prop\":\"HELLO\"}", json);
    }

    @Test
    public void testSerialization_propertyBasedObjectId() throws Exception {
        PropertyIdBean bean1 = new PropertyIdBean();
        bean1.id = 1;
        bean1.text = "first";

        PropertyIdBean bean2 = new PropertyIdBean();
        bean2.id = 2;
        bean2.text = "second";
        bean1.next = bean2;
        bean2.next = bean1;

        String json = mapper.writeValueAsString(bean1);
        Assert.assertTrue(json.contains("\"id\":1"));
        Assert.assertTrue(json.contains("\"next\":{\"id\":2"));
        Assert.assertTrue(json.contains("\"next\":1"));
    }

    @Test
    public void testSerialization_sequenceObjectId() throws Exception {
        IntSeqIdBean b1 = new IntSeqIdBean();
        b1.name = "node1";
        IntSeqIdBean b2 = new IntSeqIdBean();
        b2.name = "node2";
        b1.next = b2;
        b2.next = b1;

        String json = mapper.writeValueAsString(b1);
        Assert.assertTrue(json.contains("\"@id\":1"));
        Assert.assertTrue(json.contains("\"@id\":2"));
    }

    @Test
    public void testSerialization_alwaysAsId() throws Exception {
        AlwaysAsIdContainer container = new AlwaysAsIdContainer();
        PropertyIdBean item = new PropertyIdBean();
        item.id = 999;
        container.bean = item;

        String json = mapper.writeValueAsString(container);
        Assert.assertEquals("{\"bean\":999}", json);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerialization_getterException_wrapped() throws Exception {
        ExceptionBean bean = new ExceptionBean();
        mapper.writeValueAsString(bean);
    }

    @Test(expected = JsonMappingException.class)
    public void testSerialization_stackOverflow_wrapped() throws Exception {
        StackOverflowBean bean = new StackOverflowBean();
        mapper.writeValueAsString(bean);
    }

    @Test
    public void testGetSchema_withoutFilter() throws Exception {
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JavaType type = mapper.constructType(SimpleBean.class);
        JsonSerializer<Object> ser = provider.findValueSerializer(type, null);

        Assert.assertTrue(ser instanceof BeanSerializerBase);
        BeanSerializerBase baseSer = (BeanSerializerBase) ser;

        JsonNode schema = baseSer.getSchema(provider, type.getRawClass());
        Assert.assertNotNull(schema);
        Assert.assertEquals("object", schema.get("type").asText());
        Assert.assertNotNull(schema.get("properties"));
    }

    @Test
    public void testGetSchema_withJsonSerializableSchemaAnnotation() throws Exception {
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JavaType type = mapper.constructType(SchemaAnnotatedBean.class);
        JsonSerializer<Object> ser = provider.findValueSerializer(type, null);

        Assert.assertTrue(ser instanceof BeanSerializerBase);
        BeanSerializerBase baseSer = (BeanSerializerBase) ser;

        JsonNode schema = baseSer.getSchema(provider, type.getRawClass());
        Assert.assertNotNull(schema);
        Assert.assertEquals("urn:custom-schema-id", schema.get("id").asText());
    }

    @Test
    public void testGetSchema_withFilter() throws Exception {
        FilterProvider filters = new SimpleFilterProvider().addFilter("testFilter",
                SimpleBeanPropertyFilter.serializeAll());
        ObjectMapper filterMapper = new ObjectMapper().setFilterProvider(filters);

        SerializerProvider provider = filterMapper.getSerializerProviderInstance();
        JavaType type = filterMapper.constructType(FilteredBean.class);
        JsonSerializer<Object> ser = provider.findValueSerializer(type, null);

        Assert.assertTrue(ser instanceof BeanSerializerBase);
        BeanSerializerBase baseSer = (BeanSerializerBase) ser;

        JsonNode schema = baseSer.getSchema(provider, type.getRawClass());
        Assert.assertNotNull(schema);
        Assert.assertNotNull(schema.get("properties"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_nullVisitor_noop() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        SerializerProvider provider = mapper.getSerializerProviderInstance();
        JsonSerializer<Object> ser = provider.findValueSerializer(type, null);

        ((BeanSerializerBase) ser).acceptJsonFormatVisitor(null, type);
    }

    @Test
    public void testAcceptJsonFormatVisitor_normal() throws Exception {
        JavaType type = mapper.constructType(SimpleBean.class);
        final List<String> visitedProps = new ArrayList<String>();

        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(mapper.getSerializerProviderInstance()) {
            @Override
            public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
                return new JsonObjectFormatVisitor.Base() {
                    @Override
                    public void property(BeanProperty prop) {
                        visitedProps.add(prop.getName());
                    }

                    @Override
                    public void property(String name, JsonFormatVisitable handler, JavaType propertyTypeHint) {
                        visitedProps.add(name);
                    }
                };
            }
        };

        mapper.acceptJsonFormatVisitor(SimpleBean.class, visitor);
        Assert.assertTrue(visitedProps.contains("name"));
        Assert.assertTrue(visitedProps.contains("value"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_withFilter() throws Exception {
        FilterProvider filters = new SimpleFilterProvider().addFilter("testFilter",
                SimpleBeanPropertyFilter.serializeAll());
        ObjectMapper filterMapper = new ObjectMapper().setFilterProvider(filters);

        final List<String> visitedProps = new ArrayList<String>();
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(filterMapper.getSerializerProviderInstance()) {
            @Override
            public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
                return new JsonObjectFormatVisitor.Base() {
                    @Override
                    public void property(BeanProperty prop) {
                        visitedProps.add(prop.getName());
                    }

                    @Override
                    public void property(String name, JsonFormatVisitable handler, JavaType propertyTypeHint) {
                        visitedProps.add(name);
                    }

                    @Override
                    public void depositSchemaProperty(PropertyWriter writer, JsonObjectFormatVisitor objectVisitor,
                                                       SerializerProvider provider) {
                        visitedProps.add(writer.getName());
                    }
                };
            }
        };

        filterMapper.acceptJsonFormatVisitor(FilteredBean.class, visitor);
        Assert.assertTrue(visitedProps.contains("a"));
        Assert.assertTrue(visitedProps.contains("b"));
    }

    @Test
    public void testCreateContextual_enumTransmutation() throws Exception {
        EnumWrapper wrapper = new EnumWrapper();
        String json = mapper.writeValueAsString(wrapper);
        Assert.assertEquals("{\"val\":\"first_val\"}", json);
    }
}
