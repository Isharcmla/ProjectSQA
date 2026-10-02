package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;

import org.junit.Assert;
import org.junit.Test;

public class BeanSerializerBaseTest {

    static class DummyBeanSerializer extends BeanSerializerBase {
        public DummyBeanSerializer(JavaType type, BeanSerializerBuilder builder,
                BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties) {
            super(type, builder, properties, filteredProperties);
        }

        public DummyBeanSerializer(BeanSerializerBase src, BeanPropertyWriter[] properties,
                BeanPropertyWriter[] filteredProperties) {
            super(src, properties, filteredProperties);
        }

        public DummyBeanSerializer(BeanSerializerBase src, ObjectIdWriter objectIdWriter) {
            super(src, objectIdWriter);
        }

        public DummyBeanSerializer(BeanSerializerBase src, ObjectIdWriter objectIdWriter, Object filterId) {
            super(src, objectIdWriter, filterId);
        }

        public DummyBeanSerializer(BeanSerializerBase src, String[] toIgnore) {
            super(src, toIgnore);
        }

        public DummyBeanSerializer(BeanSerializerBase src) {
            super(src);
        }

        public DummyBeanSerializer(BeanSerializerBase src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }

        @Override
        public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
            return new DummyBeanSerializer(this, objectIdWriter);
        }

        @Override
        protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new DummyBeanSerializer(this, toIgnore);
        }

        @Override
        protected BeanSerializerBase asArraySerializer() {
            return this;
        }

        @Override
        public BeanSerializerBase withFilterId(Object filterId) {
            return new DummyBeanSerializer(this, _objectIdWriter, filterId);
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
    }

    static class SimpleBean {
        public String name = "test";
        public int value = 42;
    }

    static class ViewA {}
    static class ViewB {}

    static class ViewedBean {
        @com.fasterxml.jackson.annotation.JsonView(ViewA.class)
        public String name = "A";
        @com.fasterxml.jackson.annotation.JsonView(ViewB.class)
        public int age = 30;
    }

    @JsonSerializableSchema(id = "urn:test:custom-schema")
    static class SchemaBean {
        public String field = "value";
    }

    @JsonFilter("customFilter")
    static class FilteredBean {
        public String prop1 = "1";
        public String prop2 = "2";
    }

    static class AnyGetterBean {
        private Map<String, Object> map = new HashMap<String, Object>();

        public AnyGetterBean() {
            map.put("extraKey", "extraValue");
        }

        @JsonAnyGetter
        public Map<String, Object> any() {
            return map;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class PropertyIdBean {
        public int id = 123;
        public String text = "foo";
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
    static class IntSeqIdBean {
        public String text = "bar";
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    static class AlwaysIdBean {
        public int id = 999;
        public String desc = "ref";
    }

    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    enum ObjectEnum {
        VAL1("a", 1),
        VAL2("b", 2);

        public final String nameVal;
        public final int numVal;

        ObjectEnum(String nameVal, int numVal) {
            this.nameVal = nameVal;
            this.numVal = numVal;
        }
    }

    static class EnumWrapper {
        @JsonFormat(shape = JsonFormat.Shape.STRING)
        public ObjectEnum asString = ObjectEnum.VAL1;

        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        public ObjectEnum asNum = ObjectEnum.VAL2;
    }

    static class CustomConverter extends StdConverter<String, Integer> {
        @Override
        public Integer convert(String value) {
            return value == null ? 0 : value.length();
        }
    }

    static class ObjectToStringConverter extends StdConverter<Object, Object> {
        @Override
        public Object convert(Object value) {
            return value;
        }
    }

    static class ConvertingBean {
        @JsonSerialize(converter = CustomConverter.class)
        public String str = "hello";

        @JsonSerialize(converter = ObjectToStringConverter.class)
        public Object obj = "skipped";
    }

    static class ContainerBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY)
        public List<String> list = Arrays.asList("item");
    }

    static class NonFinalBean {
        public List<?> genericList = new ArrayList<Object>();
    }

    static class CustomTypeIdBean {
        public String type = "CustomType";
        public String data = "data";
    }

    static class ExceptionBean {
        public String getThrowError() {
            throw new RuntimeException("Simulated error");
        }
    }

    static class RecursionBean {
        public RecursionBean self = this;
    }

    private DefaultSerializerProvider.Impl createSerializerProvider(ObjectMapper mapper) {
        SerializationConfig config = mapper.getSerializationConfig();
        DefaultSerializerProvider.Impl prov = (DefaultSerializerProvider.Impl) mapper.getSerializerProvider();
        return prov.createInstance(config, mapper.getSerializerFactory());
    }

    private BeanSerializer getBeanSerializer(ObjectMapper mapper, Class<?> cls) throws Exception {
        SerializerProvider prov = createSerializerProvider(mapper);
        JavaType type = mapper.constructType(cls);
        JsonSerializer<Object> ser = prov.findValueSerializer(type, null);
        if (ser instanceof BeanSerializer) {
            return (BeanSerializer) ser;
        }
        Assert.fail("Expected BeanSerializer for " + cls.getName());
        return null;
    }

    @Test
    public void testConstructors_nullBuilderAndCopies_success() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(SimpleBean.class);
        DummyBeanSerializer ser = new DummyBeanSerializer(type, null, BeanSerializerBase.NO_PROPS, null);
        Assert.assertNotNull(ser);
        Assert.assertEquals(0, ser._props.length);
        Assert.assertNull(ser._filteredProps);
        Assert.assertFalse(ser.usesObjectId());

        DummyBeanSerializer copy1 = new DummyBeanSerializer(ser);
        Assert.assertNotNull(copy1);

        DummyBeanSerializer copy2 = new DummyBeanSerializer(ser, BeanSerializerBase.NO_PROPS, BeanSerializerBase.NO_PROPS);
        Assert.assertNotNull(copy2);

        DummyBeanSerializer copy3 = new DummyBeanSerializer(ser, (ObjectIdWriter) null);
        Assert.assertNotNull(copy3);

        DummyBeanSerializer copy4 = new DummyBeanSerializer(ser, (ObjectIdWriter) null, "filterId");
        Assert.assertEquals("filterId", copy4._propertyFilterId);
    }

    @Test
    public void testConstructors_renameAndIgnorals_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanSerializer bs = getBeanSerializer(mapper, SimpleBean.class);

        DummyBeanSerializer base = new DummyBeanSerializer(bs);
        Iterator<PropertyWriter> props = base.properties();
        Assert.assertTrue(props.hasNext());

        NameTransformer transformer = NameTransformer.simpleTransformer("pre_", "_post");
        DummyBeanSerializer renamed = new DummyBeanSerializer(base, transformer);
        Assert.assertNotNull(renamed);
        Assert.assertEquals(base._props.length, renamed._props.length);

        DummyBeanSerializer nopRenamed = new DummyBeanSerializer(base, NameTransformer.NOP);
        Assert.assertSame(base._props, nopRenamed._props);

        DummyBeanSerializer nullRenamed = new DummyBeanSerializer(base, (NameTransformer) null);
        Assert.assertSame(base._props, nullRenamed._props);

        DummyBeanSerializer ignored = new DummyBeanSerializer(base, new String[]{"name"});
        Assert.assertEquals(base._props.length - 1, ignored._props.length);
    }

    @Test
    public void testMutantFactories_variants_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanSerializer bs = getBeanSerializer(mapper, SimpleBean.class);
        DummyBeanSerializer dummy = new DummyBeanSerializer(bs);

        BeanSerializerBase filtered = dummy.withFilterId("myFilter");
        Assert.assertEquals("myFilter", filtered._propertyFilterId);

        BeanSerializerBase ignored = dummy.withIgnorals(new String[]{"value"});
        Assert.assertEquals(1, ignored._props.length);

        BeanSerializerBase arraySer = dummy.asArraySerializer();
        Assert.assertNotNull(arraySer);

        BeanSerializerBase objIdSer = dummy.withObjectIdWriter(null);
        Assert.assertNotNull(objIdSer);
    }

    @Test
    public void testResolve_normalAndConvertingAndContainers_resolvedSuccessfully() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DefaultSerializerProvider.Impl prov = createSerializerProvider(mapper);

        BeanSerializer convBs = getBeanSerializer(mapper, ConvertingBean.class);
        DummyBeanSerializer convDummy = new DummyBeanSerializer(convBs);
        convDummy.resolve(prov);

        BeanSerializer contBs = getBeanSerializer(mapper, ContainerBean.class);
        DummyBeanSerializer contDummy = new DummyBeanSerializer(contBs);
        contDummy.resolve(prov);

        BeanSerializer nonFinalBs = getBeanSerializer(mapper, NonFinalBean.class);
        DummyBeanSerializer nonFinalDummy = new DummyBeanSerializer(nonFinalBs);
        nonFinalDummy.resolve(prov);

        BeanSerializer anyBs = getBeanSerializer(mapper, AnyGetterBean.class);
        DummyBeanSerializer anyDummy = new DummyBeanSerializer(anyBs);
        anyDummy.resolve(prov);
    }

    @Test
    public void testCreateContextual_enumShapeChanges_returnsContextualEnumSerializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new EnumWrapper());
        Assert.assertTrue(json.contains("\"asString\":\"VAL1\""));
        Assert.assertTrue(json.contains("\"asNum\":1"));
    }

    @Test
    public void testCreateContextual_objectIdPropertyBasedAndSequence_serializesCorrectly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        
        PropertyIdBean propBean = new PropertyIdBean();
        String propJson = mapper.writeValueAsString(propBean);
        Assert.assertTrue(propJson.contains("\"id\":123"));

        IntSeqIdBean seqBean = new IntSeqIdBean();
        String seqJson = mapper.writeValueAsString(seqBean);
        Assert.assertTrue(seqJson.contains("\"id\":1"));

        AlwaysIdBean alwaysBean = new AlwaysIdBean();
        String alwaysJson = mapper.writeValueAsString(alwaysBean);
        Assert.assertTrue(alwaysJson.contains("999"));
    }

    static class WrapperWithIgnore {
        @JsonIgnoreProperties({"name"})
        public SimpleBean bean = new SimpleBean();
    }

    @Test
    public void testCreateContextual_withIgnoralsOnProperty_ignoresFields() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new WrapperWithIgnore());
        Assert.assertFalse(json.contains("\"name\""));
        Assert.assertTrue(json.contains("\"value\":42"));
    }

    static class WrapperWithFilter {
        @JsonFilter("customFilter")
        public SimpleBean bean = new SimpleBean();
    }

    @Test
    public void testCreateContextual_withFilterOnProperty_appliesFilter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FilterProvider fp = new SimpleFilterProvider().addFilter("customFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("name"));
        String json = mapper.writer(fp).writeValueAsString(new WrapperWithFilter());
        Assert.assertTrue(json.contains("\"name\":\"test\""));
        Assert.assertFalse(json.contains("\"value\""));
    }

    static class WrapperWithArrayShape {
        @JsonFormat(shape = JsonFormat.Shape.ARRAY)
        public SimpleBean bean = new SimpleBean();
    }

    @Test
    public void testCreateContextual_withArrayShape_serializesAsArray() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(new WrapperWithArrayShape());
        Assert.assertTrue(json.contains("[\"test\",42]") || json.contains("[42,\"test\"]"));
    }

    @Test
    public void testSerializeWithType_withAndWithoutObjectId_writesTypePrefixAndSuffix() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(SimpleBean.class);
        TypeSerializer typeSer = new AsPropertyTypeSerializer(new ClassNameIdResolver(type, mapper.getTypeFactory()), null, "@type");

        BeanSerializer bs = getBeanSerializer(mapper, SimpleBean.class);
        StringWriter sw = new StringWriter();
        JsonGenerator gen = mapper.getFactory().createGenerator(sw);
        SerializerProvider prov = createSerializerProvider(mapper);

        bs.serializeWithType(new SimpleBean(), gen, prov, typeSer);
        gen.flush();
        String json = sw.toString();
        Assert.assertTrue(json.contains("@type"));
        Assert.assertTrue(json.contains("SimpleBean"));

        // With ObjectId
        JavaType objIdType = mapper.constructType(PropertyIdBean.class);
        TypeSerializer objIdTypeSer = new AsPropertyTypeSerializer(new ClassNameIdResolver(objIdType, mapper.getTypeFactory()), null, "@type");
        JsonSerializer<Object> objIdSer = prov.findValueSerializer(objIdType, null);

        sw = new StringWriter();
        gen = mapper.getFactory().createGenerator(sw);
        objIdSer.serializeWithType(new PropertyIdBean(), gen, prov, objIdTypeSer);
        gen.flush();
        String objIdJson = sw.toString();
        Assert.assertTrue(objIdJson.contains("\"id\":123"));
    }

    @Test
    public void testSerializeFields_viewsFiltering_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ViewedBean bean = new ViewedBean();

        String jsonA = mapper.writerWithView(ViewA.class).writeValueAsString(bean);
        Assert.assertTrue(jsonA.contains("\"name\":\"A\""));
        Assert.assertFalse(jsonA.contains("\"age\""));

        String jsonB = mapper.writerWithView(ViewB.class).writeValueAsString(bean);
        Assert.assertFalse(jsonB.contains("\"name\""));
        Assert.assertTrue(jsonB.contains("\"age\":30"));
    }

    @Test
    public void testSerializeFields_exceptionHandling_wrappedAndThrown() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new ExceptionBean());
            Assert.fail("Should throw exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Simulated error"));
        }
    }

    @Test
    public void testSerializeFields_infiniteRecursion_stackOverflowHandled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new RecursionBean());
            Assert.fail("Should throw Infinite recursion exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Infinite recursion"));
        }
    }

    @Test
    public void testGetSchema_withAndWithoutCustomSchemaIdAndFilter_depositsProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = createSerializerProvider(mapper);

        BeanSerializer schemaBs = getBeanSerializer(mapper, SchemaBean.class);
        ObjectNode schemaNode = (ObjectNode) schemaBs.getSchema(prov, SchemaBean.class);
        Assert.assertEquals("urn:test:custom-schema", schemaNode.get("id").asText());
        Assert.assertNotNull(schemaNode.get("properties"));

        BeanSerializer filterBs = getBeanSerializer(mapper, FilteredBean.class);
        FilterProvider fp = new SimpleFilterProvider().addFilter("customFilter",
                SimpleBeanPropertyFilter.serializeAllExcept("prop2"));
        prov = ((DefaultSerializerProvider.Impl) prov).createInstance(mapper.getSerializationConfig().withFilters(fp), mapper.getSerializerFactory());
        ObjectNode filteredSchema = (ObjectNode) filterBs.getSchema(prov, FilteredBean.class);
        Assert.assertNotNull(filteredSchema.get("properties"));
    }

    @Test
    public void testAcceptJsonFormatVisitor_withAndWithoutFilterAndView_acceptsFormat() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SerializerProvider prov = createSerializerProvider(mapper);

        BeanSerializer bs = getBeanSerializer(mapper, ViewedBean.class);

        // Null visitor check
        bs.acceptJsonFormatVisitor(null, mapper.constructType(ViewedBean.class));

        JsonFormatVisitorWrapper.Base visitor = new JsonFormatVisitorWrapper.Base(prov) {
            @Override
            public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
                return new JsonObjectFormatVisitor.Base(prov);
            }
        };

        bs.acceptJsonFormatVisitor(visitor, mapper.constructType(ViewedBean.class));

        // Filtered visitor
        BeanSerializer filterBs = getBeanSerializer(mapper, FilteredBean.class);
        FilterProvider fp = new SimpleFilterProvider().addFilter("customFilter", SimpleBeanPropertyFilter.serializeAll());
        SerializerProvider filterProv = ((DefaultSerializerProvider.Impl) prov).createInstance(mapper.getSerializationConfig().withFilters(fp), mapper.getSerializerFactory());
        JsonFormatVisitorWrapper.Base filterVisitor = new JsonFormatVisitorWrapper.Base(filterProv) {
            @Override
            public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
                return new JsonObjectFormatVisitor.Base(filterProv);
            }
        };
        filterBs.acceptJsonFormatVisitor(filterVisitor, mapper.constructType(FilteredBean.class));
    }

    @Test
    public void testInvalidObjectIdDefinition_throwsIllegalArgumentException() throws Exception {
        @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "nonExistentProp")
        class InvalidIdBean {
            public int x = 1;
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValueAsString(new InvalidIdBean());
            Assert.fail("Should throw IllegalArgumentException");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getCause() instanceof IllegalArgumentException);
        }
    }
}
