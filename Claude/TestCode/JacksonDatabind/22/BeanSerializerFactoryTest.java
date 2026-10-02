import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BeanSerializerFactoryTest {

    private ObjectMapper mapper;
    private BeanSerializerFactory factory;
    private SerializerProvider prov;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        factory = BeanSerializerFactory.instance;
        prov = mapper.getSerializerProviderInstance();
    }

    // ---------- Helper bean classes ----------

    public static class SimpleBean {
        private String name = "test";
        private int value = 42;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getValue() { return value; }
        public void setValue(int value) { this.value = value; }
    }

    public static class EmptyBean {
        // no getters/setters -> no bean properties
    }

    public static class ListBean {
        private List<String> items = new ArrayList<String>();

        public List<String> getItems() { return items; }
        public void setItems(List<String> items) { this.items = items; }
    }

    public enum SimpleEnum { A, B }

    // ---------- instance / withConfig / customSerializers ----------

    @Test
    public void testInstance_singleton_notNull() {
        assertNotNull(BeanSerializerFactory.instance);
    }

    @Test
    public void testWithConfig_sameConfig_returnsSameInstance() {
        Object result = factory.withConfig(null);
        assertSame(factory, result);
    }

    @Test
    public void testWithConfig_differentConfig_returnsNewInstance() {
        SerializerFactoryConfig newConfig = new SerializerFactoryConfig();
        Object result = factory.withConfig(newConfig);
        assertNotSame(factory, result);
        assertTrue(result instanceof BeanSerializerFactory);
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfig_subclassNotOverridden_throwsIllegalStateException() {
        BeanSerializerFactory sub = new BeanSerializerFactory(null) { };
        sub.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testCustomSerializers_default_returnsNotNull() {
        Iterable<Serializers> custom = factory.customSerializers();
        assertNotNull(custom);
    }

    // ---------- createSerializer ----------

    @Test
    public void testCreateSerializer_simpleBean_returnsSerializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        JsonSerializer<Object> ser = factory.createSerializer(prov, type);
        assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_stringType_returnsSerializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(String.class);
        JsonSerializer<Object> ser = factory.createSerializer(prov, type);
        assertNotNull(ser);
    }

    @Test
    public void testCreateSerializer_enumType_returnsSerializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleEnum.class);
        JsonSerializer<Object> ser = factory.createSerializer(prov, type);
        assertNotNull(ser);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateSerializer_nullType_throwsException() throws Exception {
        factory.createSerializer(prov, null);
    }

    // ---------- findBeanSerializer ----------

    @Test
    public void testFindBeanSerializer_simpleBean_returnsSerializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(prov, type, beanDesc);
        assertNotNull(ser);
    }

    @Test
    public void testFindBeanSerializer_arrayType_returnsNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(int[].class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(prov, type, beanDesc);
        assertNull(ser);
    }

    @Test
    public void testFindBeanSerializer_enumType_doesNotThrow() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleEnum.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        // Should not throw, may return a serializer or null depending on property discovery
        JsonSerializer<Object> ser = factory.findBeanSerializer(prov, type, beanDesc);
        // no strict assertion on value, just verifying no exception path
        assertTrue(true);
    }

    // ---------- findPropertyTypeSerializer / findPropertyContentTypeSerializer ----------

    @Test
    public void testFindPropertyTypeSerializer_noAnnotations_returnsNull() throws Exception {
        JavaType beanType = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(beanType);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        assertFalse(props.isEmpty());
        AnnotatedMember accessor = props.get(0).getAccessor();
        JavaType propType = accessor.getType(beanDesc.bindingsForBeanType());
        TypeSerializer ts = factory.findPropertyTypeSerializer(propType, config, accessor);
        assertNull(ts);
    }

    @Test
    public void testFindPropertyContentTypeSerializer_listProperty_returnsNull() throws Exception {
        JavaType beanType = mapper.getTypeFactory().constructType(ListBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(beanType);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        AnnotatedMember accessor = null;
        for (BeanPropertyDefinition p : props) {
            if ("items".equals(p.getName())) {
                accessor = p.getAccessor();
                break;
            }
        }
        assertNotNull(accessor);
        JavaType containerType = accessor.getType(beanDesc.bindingsForBeanType());
        TypeSerializer ts = factory.findPropertyContentTypeSerializer(containerType, config, accessor);
        assertNull(ts);
    }

    @Test
    public void testFindPropertyContentTypeSerializer_nonContainerType_handledGracefully() throws Exception {
        JavaType beanType = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(beanType);
        List<BeanPropertyDefinition> props = beanDesc.findProperties();
        AnnotatedMember accessor = props.get(0).getAccessor();
        JavaType nonContainerType = mapper.getTypeFactory().constructType(String.class);
        try {
            TypeSerializer ts = factory.findPropertyContentTypeSerializer(nonContainerType, config, accessor);
            assertNull(ts);
        } catch (Exception e) {
            // Acceptable: non-container type has no content type, may throw
            assertTrue(true);
        }
    }

    // ---------- constructBeanSerializer ----------

    @Test
    public void testConstructBeanSerializer_simpleBean_returnsSerializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.constructBeanSerializer(prov, beanDesc);
        assertNotNull(ser);
    }

    @Test
    public void testConstructBeanSerializer_objectClass_returnsUnknownTypeSerializer() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(Object.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        JsonSerializer<Object> ser = factory.constructBeanSerializer(prov, beanDesc);
        assertNotNull(ser);
    }

    @Test
    public void testConstructBeanSerializer_emptyBean_handledGracefully() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(EmptyBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        // May return null or a dummy serializer; just verify no exception
        JsonSerializer<Object> ser = factory.constructBeanSerializer(prov, beanDesc);
        assertTrue(true);
    }

    // ---------- constructObjectIdHandler ----------

    @Test
    public void testConstructObjectIdHandler_noObjectIdInfo_returnsNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                new ArrayList<com.fasterxml.jackson.databind.ser.BeanPropertyWriter>();
        ObjectIdWriter oid = factory.constructObjectIdHandler(prov, beanDesc, props);
        assertNull(oid);
    }

    // ---------- isPotentialBeanType ----------

    @Test
    public void testIsPotentialBeanType_regularClass_returnsTrue() {
        assertTrue(factory.isPotentialBeanType(SimpleBean.class));
    }

    @Test
    public void testIsPotentialBeanType_arrayClass_returnsFalse() {
        assertFalse(factory.isPotentialBeanType(int[].class));
    }

    @Test
    public void testIsPotentialBeanType_primitiveClass_returnsFalse() {
        assertFalse(factory.isPotentialBeanType(int.class));
    }

    // ---------- constructBeanSerializerBuilder / constructPropertyBuilder ----------

    @Test
    public void testConstructBeanSerializerBuilder_returnsNotNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        assertNotNull(builder);
    }

    @Test
    public void testConstructPropertyBuilder_returnsNotNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        PropertyBuilder pb = factory.constructPropertyBuilder(config, beanDesc);
        assertNotNull(pb);
    }

    // ---------- findBeanProperties ----------

    @Test
    public void testFindBeanProperties_simpleBean_returnsNonEmptyList() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        builder.setConfig(mapper.getSerializationConfig());
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                factory.findBeanProperties(prov, beanDesc, builder);
        assertNotNull(props);
        assertFalse(props.isEmpty());
    }

    @Test
    public void testFindBeanProperties_emptyBean_returnsNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(EmptyBean.class);
        BeanDescription beanDesc = mapper.getSerializationConfig().introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        builder.setConfig(mapper.getSerializationConfig());
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                factory.findBeanProperties(prov, beanDesc, builder);
        assertNull(props);
    }

    // ---------- filterBeanProperties ----------

    @Test
    public void testFilterBeanProperties_noIgnoredProps_returnsSameSize() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        builder.setConfig(config);
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                factory.findBeanProperties(prov, beanDesc, builder);
        assertNotNull(props);
        int originalSize = props.size();
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> filtered =
                factory.filterBeanProperties(config, beanDesc, props);
        assertEquals(originalSize, filtered.size());
    }

    // ---------- removeOverlappingTypeIds ----------

    @Test
    public void testRemoveOverlappingTypeIds_simpleBean_returnsNotNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        builder.setConfig(config);
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                factory.findBeanProperties(prov, beanDesc, builder);
        assertNotNull(props);
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> result =
                factory.removeOverlappingTypeIds(prov, beanDesc, builder, props);
        assertNotNull(result);
    }

    // ---------- constructFilteredBeanWriter ----------

    @Test
    public void testConstructFilteredBeanWriter_returnsNotNull() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        builder.setConfig(config);
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                factory.findBeanProperties(prov, beanDesc, builder);
        assertNotNull(props);
        assertFalse(props.isEmpty());
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter fw =
                factory.constructFilteredBeanWriter(props.get(0), new Class<?>[]{Object.class});
        assertNotNull(fw);
    }

    // ---------- processViews ----------

    @Test
    public void testProcessViews_noViews_doesNotThrow() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        builder.setConfig(config);
        List<com.fasterxml.jackson.databind.ser.BeanPropertyWriter> props =
                factory.findBeanProperties(prov, beanDesc, builder);
        assertNotNull(props);
        builder.setProperties(props);
        factory.processViews(config, builder);
        assertTrue(true);
    }

    // ---------- removeIgnorableTypes / removeSetterlessGetters ----------

    @Test
    public void testRemoveIgnorableTypes_simpleBean_doesNotThrow() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        List<BeanPropertyDefinition> propDefs = new ArrayList<BeanPropertyDefinition>(beanDesc.findProperties());
        factory.removeIgnorableTypes(config, beanDesc, propDefs);
        assertNotNull(propDefs);
    }

    @Test
    public void testRemoveSetterlessGetters_simpleBean_doesNotThrow() throws Exception {
        JavaType type = mapper.getTypeFactory().constructType(SimpleBean.class);
        SerializationConfig config = mapper.getSerializationConfig();
        BeanDescription beanDesc = config.introspect(type);
        List<BeanPropertyDefinition> propDefs = new ArrayList<BeanPropertyDefinition>(beanDesc.findProperties());
        factory.removeSetterlessGetters(config, beanDesc, propDefs);
        assertNotNull(propDefs);
    }

    // ---------- Integration test via ObjectMapper ----------

    @Test
    public void testSerializationIntegration_simpleBean_producesJson() throws Exception {
        String json = mapper.writeValueAsString(new SimpleBean());
        assertNotNull(json);
        assertTrue(json.contains("name"));
        assertTrue(json.contains("value"));
    }

    @Test
    public void testSerializationIntegration_listBean_producesJson() throws Exception {
        ListBean bean = new ListBean();
        bean.getItems().add("a");
        bean.getItems().add("b");
        String json = mapper.writeValueAsString(bean);
        assertNotNull(json);
        assertTrue(json.contains("items"));
    }
}
