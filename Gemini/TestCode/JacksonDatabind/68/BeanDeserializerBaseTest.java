package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanDeserializerBaseTest {

    // Concrete test implementation of BeanDeserializerBase for direct method testing
    static class ConcreteBeanDeserializer extends BeanDeserializerBase {
        private static final long serialVersionUID = 1L;

        public ConcreteBeanDeserializer(BeanDeserializerBuilder builder, BeanDescription beanDesc,
                                        BeanPropertyMap properties, Map<String, SettableBeanProperty> backRefs,
                                        Set<String> ignorableProps, boolean ignoreAllUnknown, boolean hasViews) {
            super(builder, beanDesc, properties, backRefs, ignorableProps, ignoreAllUnknown, hasViews);
        }

        public ConcreteBeanDeserializer(BeanDeserializerBase src) {
            super(src);
        }

        public ConcreteBeanDeserializer(BeanDeserializerBase src, boolean ignoreAllUnknown) {
            super(src, ignoreAllUnknown);
        }

        public ConcreteBeanDeserializer(BeanDeserializerBase src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }

        public ConcreteBeanDeserializer(BeanDeserializerBase src, ObjectIdReader oir) {
            super(src, oir);
        }

        public ConcreteBeanDeserializer(BeanDeserializerBase src, Set<String> ignorableProps) {
            super(src, ignorableProps);
        }

        public ConcreteBeanDeserializer(BeanDeserializerBase src, BeanPropertyMap beanProps) {
            super(src, beanProps);
        }

        @Override
        public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) {
            return new ConcreteBeanDeserializer(this, unwrapper);
        }

        @Override
        public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) {
            return new ConcreteBeanDeserializer(this, oir);
        }

        @Override
        public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) {
            return new ConcreteBeanDeserializer(this, ignorableProps);
        }

        @Override
        public BeanDeserializerBase withBeanProperties(BeanPropertyMap props) {
            return new ConcreteBeanDeserializer(this, props);
        }

        @Override
        protected BeanDeserializerBase asArrayDeserializer() {
            return this;
        }

        @Override
        public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return "deserializedObject";
        }

        @Override
        protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException {
            return "propertyBased";
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return deserializeFromObject(p, ctxt);
        }
    }

    // Classes for ObjectMapper end-to-end integration testing
    static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    static class ArrayShapeBean {
        public String a;
        public String b;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class IdBean {
        public int id;
        public String name;
        public IdBean next;
    }

    static class ParentRef {
        public String parentName;
        @JsonManagedReference
        public ChildRef child;
    }

    static class ChildRef {
        public String childName;
        @JsonBackReference
        public ParentRef parent;
    }

    static class UnwrappedContainer {
        public String title;
        @JsonUnwrapped
        public UnwrappedPayload payload;
    }

    static class UnwrappedPayload {
        public String value1;
        public String value2;
    }

    static class AnySetterBean {
        public String known;
        private Map<String, Object> others = new HashMap<String, Object>();

        @JsonAnySetter
        public void setOther(String name, Object value) {
            others.put(name, value);
        }

        public Map<String, Object> getOthers() {
            return others;
        }
    }

    static class InjectedBean {
        @JacksonInject("injectId")
        public String injectedVal;
        public String normalVal;
    }

    @JsonIgnoreProperties({"ignored1", "ignored2"})
    static class IgnoredPropsBean {
        public String standard;
    }

    static class OuterBean {
        public String outerName;
        public InnerBean inner;

        public class InnerBean {
            public String innerName;
            public InnerBean(String innerName) {
                this.innerName = innerName;
            }
        }
    }

    static class DelegatingStringBean {
        final String val;
        @JsonCreator
        public DelegatingStringBean(String v) {
            this.val = v;
        }
    }

    static class DelegatingIntBean {
        final int val;
        @JsonCreator
        public DelegatingIntBean(int v) {
            this.val = v;
        }
    }

    static class DelegatingLongBean {
        final long val;
        @JsonCreator
        public DelegatingLongBean(long v) {
            this.val = v;
        }
    }

    static class DelegatingDoubleBean {
        final double val;
        @JsonCreator
        public DelegatingDoubleBean(double v) {
            this.val = v;
        }
    }

    static class DelegatingBooleanBean {
        final boolean val;
        @JsonCreator
        public DelegatingBooleanBean(boolean v) {
            this.val = v;
        }
    }

    static class DelegatingArrayBean {
        final List<String> list;
        @JsonCreator
        public DelegatingArrayBean(List<String> list) {
            this.list = list;
        }
    }

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
    static class CaseInsensitiveBean {
        public String myField;
    }

    // ----------------------------------------------------------------------------------
    // Tests for Direct Construction, Mutators, and Accessors
    // ----------------------------------------------------------------------------------

    private ConcreteBeanDeserializer createConcreteDeser(ObjectMapper mapper, Class<?> targetClass) throws Exception {
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType type = mapper.getTypeFactory().constructType(targetClass);
        BeanDescription desc = config.introspect(type);
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(desc, config);
        builder.setValueInstantiator(new com.fasterxml.jackson.databind.deser.std.StdValueInstantiator(config, type));
        BeanPropertyMap propMap = BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false);
        return new ConcreteBeanDeserializer(builder, desc, propMap, new HashMap<String, SettableBeanProperty>(),
                new HashSet<String>(), false, false);
    }

    @Test
    public void testBasicGettersAndMetadata() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);

        Assert.assertTrue(deser.isCachable());
        Assert.assertEquals(SimpleBean.class, deser.handledType());
        Assert.assertEquals(SimpleBean.class, deser.getBeanClass());
        Assert.assertEquals(SimpleBean.class, deser.getValueType().getRawClass());
        Assert.assertNull(deser.getObjectIdReader());
        Assert.assertFalse(deser.hasProperty("none"));
        Assert.assertFalse(deser.hasViews());
        Assert.assertEquals(0, deser.getPropertyCount());
        Assert.assertTrue(deser.getKnownPropertyNames().isEmpty());
        Assert.assertNotNull(deser.getValueInstantiator());
        Assert.assertNull(deser.findProperty("missing"));
        Assert.assertNull(deser.findProperty(new PropertyName("missing")));
        Assert.assertNull(deser.findProperty(0));
        Assert.assertNull(deser.findBackReference("backRef"));

        Iterator<SettableBeanProperty> it = deser.properties();
        Assert.assertFalse(it.hasNext());

        Iterator<SettableBeanProperty> creatorIt = deser.creatorProperties();
        Assert.assertFalse(creatorIt.hasNext());
    }

    @Test
    public void testCopyConstructors() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer base = createConcreteDeser(mapper, SimpleBean.class);

        ConcreteBeanDeserializer copy1 = new ConcreteBeanDeserializer(base);
        Assert.assertEquals(base.handledType(), copy1.handledType());

        ConcreteBeanDeserializer copy2 = new ConcreteBeanDeserializer(base, true);
        Assert.assertEquals(base.handledType(), copy2.handledType());

        ConcreteBeanDeserializer copy3 = new ConcreteBeanDeserializer(base, NameTransformer.NOP);
        Assert.assertEquals(base.handledType(), copy3.handledType());

        ConcreteBeanDeserializer copy4 = new ConcreteBeanDeserializer(base, (NameTransformer) null);
        Assert.assertEquals(base.handledType(), copy4.handledType());

        ConcreteBeanDeserializer copy5 = new ConcreteBeanDeserializer(base, (ObjectIdReader) null);
        Assert.assertEquals(base.handledType(), copy5.handledType());

        Set<String> ignorable = new HashSet<String>();
        ignorable.add("ignored");
        ConcreteBeanDeserializer copy6 = new ConcreteBeanDeserializer(base, ignorable);
        Assert.assertEquals(base.handledType(), copy6.handledType());

        BeanPropertyMap map = BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false);
        ConcreteBeanDeserializer copy7 = new ConcreteBeanDeserializer(base, map);
        Assert.assertEquals(base.handledType(), copy7.handledType());
    }

    @Test
    public void testWithBeanPropertiesDefaultThrows() {
        BeanDeserializerBase base = new BeanDeserializerBase((BeanDeserializerBase) null) {
            private static final long serialVersionUID = 1L;
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return this; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override protected BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };

        try {
            base.withBeanProperties(BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false));
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            Assert.assertTrue(e.getMessage().contains("does not override `withBeanProperties()`"));
        }
    }

    @Test
    public void testPropertiesThrowsWhenPropertiesNull() {
        BeanDeserializerBase base = new BeanDeserializerBase((BeanDeserializerBase) null) {
            private static final long serialVersionUID = 1L;
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return this; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override protected BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) { return null; }
            @Override public Object deserialize(JsonParser p, DeserializationContext ctxt) { return null; }
        };

        try {
            base.properties();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Can only call after BeanDeserializer has been resolved"));
        }
    }

    // ----------------------------------------------------------------------------------
    // Tests for wrapAndThrow and wrapInstantiationProblem Error Reporting
    // ----------------------------------------------------------------------------------

    @Test
    public void testWrapAndThrow_ErrorPassedAsIs() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        try {
            deser.wrapAndThrow(new OutOfMemoryError("Test OOM"), new SimpleBean(), "name", ctxt);
            Assert.fail("Expected OutOfMemoryError");
        } catch (OutOfMemoryError e) {
            Assert.assertEquals("Test OOM", e.getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_InvocationTargetExceptionUnwrapped() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        InvocationTargetException ite = new InvocationTargetException(new IllegalArgumentException("Root cause"));
        try {
            deser.wrapAndThrow(ite, new SimpleBean(), "age", ctxt);
            Assert.fail("Expected JsonMappingException wrapping the root cause");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getCause() instanceof IllegalArgumentException);
            Assert.assertEquals("Root cause", e.getCause().getMessage());
        }
    }

    @Test
    public void testWrapAndThrow_IOExceptionAndWrappingDisabled() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.WRAP_EXCEPTIONS);
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        IOException rawIOE = new IOException("Raw IO error");
        try {
            deser.wrapAndThrow(rawIOE, new SimpleBean(), "name", ctxt);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("Raw IO error", e.getMessage());
        }

        RuntimeException re = new RuntimeException("Unchecked");
        try {
            deser.wrapAndThrow(re, new SimpleBean(), "name", ctxt);
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            Assert.assertEquals("Unchecked", e.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testWrapAndThrow_WithIndex() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        try {
            deser.wrapAndThrow(new RuntimeException("Error with index"), new SimpleBean(), 2, ctxt);
            Assert.fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getPath());
            Assert.assertEquals(1, e.getPath().size());
            Assert.assertEquals(2, e.getPath().get(0).getIndex());
        }
    }

    @Test
    public void testWrapInstantiationProblem_Variations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // 1. Error passed through
        try {
            deser.wrapInstantiationProblem(new StackOverflowError("so"), ctxt);
            Assert.fail("Expected StackOverflowError");
        } catch (StackOverflowError e) {
            Assert.assertEquals("so", e.getMessage());
        }

        // 2. IOException returned directly
        try {
            deser.wrapInstantiationProblem(new IOException("io-problem"), ctxt);
            Assert.fail("Expected IOException");
        } catch (IOException e) {
            Assert.assertEquals("io-problem", e.getMessage());
        }

        // 3. RuntimeException when WRAP_EXCEPTIONS disabled
        mapper.disable(DeserializationFeature.WRAP_EXCEPTIONS);
        try {
            deser.wrapInstantiationProblem(new IllegalArgumentException("arg-problem"), ctxt);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("arg-problem", e.getMessage());
        }
    }

    // ----------------------------------------------------------------------------------
    // Tests for Deserialization Methods & Unknown / Ignored Properties
    // ----------------------------------------------------------------------------------

    @Test
    public void testDeserializeFromEmbedded() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        TokenBuffer buf = new TokenBuffer((ObjectCodec) null, false);
        byte[] raw = new byte[]{1, 2, 3};
        buf.writeObject(raw);
        JsonParser p = buf.asParser();
        p.nextToken();

        Object res = deser.deserializeFromEmbedded(p, ctxt);
        Assert.assertArrayEquals(raw, (byte[]) res);
    }

    @Test
    public void testHandleIgnoredProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser p = mapper.getFactory().createParser("{\"dummy\": 123}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME

        // Default: FAIL_ON_IGNORED_PROPERTIES is false -> should skip without exception
        deser.handleIgnoredProperty(p, ctxt, new SimpleBean(), "dummy");

        // When FAIL_ON_IGNORED_PROPERTIES is enabled -> should throw IgnoredPropertyException
        mapper.enable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        ctxt = mapper.getDeserializationContext();
        try {
            deser.handleIgnoredProperty(p, ctxt, new SimpleBean(), "dummy");
            Assert.fail("Expected IgnoredPropertyException");
        } catch (IgnoredPropertyException e) {
            Assert.assertEquals("dummy", e.getPropertyName());
        }
    }

    @Test
    public void testHandleUnknownProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser p = mapper.getFactory().createParser("{\"unknownField\": \"value\"}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        p.nextToken(); // VALUE_STRING

        // Unknown property when FAIL_ON_UNKNOWN_PROPERTIES is true
        try {
            deser.handleUnknownProperty(p, ctxt, new SimpleBean(), "unknownField");
            Assert.fail("Expected UnrecognizedPropertyException");
        } catch (UnrecognizedPropertyException e) {
            Assert.assertEquals("unknownField", e.getPropertyName());
        }

        // Test with ignoreAllUnknown = true
        ConcreteBeanDeserializer deserIgnoreAll = new ConcreteBeanDeserializer(deser, true);
        deserIgnoreAll.handleUnknownProperty(p, ctxt, new SimpleBean(), "unknownField");
    }

    @Test
    public void testHandleUnknownVanilla() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser p = mapper.getFactory().createParser("{\"unknownField\": 42}");
        p.nextToken(); // START_OBJECT
        p.nextToken(); // FIELD_NAME
        p.nextToken(); // VALUE_NUMBER_INT

        try {
            deser.handleUnknownVanilla(p, ctxt, new SimpleBean(), "unknownField");
            Assert.fail("Expected UnrecognizedPropertyException");
        } catch (UnrecognizedPropertyException e) {
            Assert.assertEquals("unknownField", e.getPropertyName());
        }
    }

    @Test
    public void testHandleUnknownPropertiesWithTokenBuffer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = new ConcreteBeanDeserializer(createConcreteDeser(mapper, SimpleBean.class), true);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        TokenBuffer buf = new TokenBuffer(mapper);
        buf.writeFieldName("prop1");
        buf.writeString("val1");
        buf.writeFieldName("prop2");
        buf.writeNumber(100);

        SimpleBean target = new SimpleBean();
        Object result = deser.handleUnknownProperties(ctxt, target, buf);
        Assert.assertSame(target, result);
    }

    @Test
    public void testDeserializeWithObjectIdDelegatesToDeserializeFromObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser p = mapper.getFactory().createParser("{}");
        p.nextToken();
        Object result = deser.deserializeWithObjectId(p, ctxt);
        Assert.assertEquals("deserializedObject", result);
    }

    @Test
    public void testDeserializeFromObjectUsingNonDefault_AbstractType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ConcreteBeanDeserializer deser = createConcreteDeser(mapper, CharSequence.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser p = mapper.getFactory().createParser("{}");
        p.nextToken();
        try {
            deser.deserializeFromObjectUsingNonDefault(p, ctxt);
            Assert.fail("Expected JsonMappingException for abstract type");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("abstract type"));
        }
    }

    // ----------------------------------------------------------------------------------
    // Tests for End-to-End JSON Processing (Full coverage of Jackson resolution & shapes)
    // ----------------------------------------------------------------------------------

    @Test
    public void testSimpleBeanDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"name\":\"John\", \"age\":30}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("John", bean.name);
        Assert.assertEquals(30, bean.age);
    }

    @Test
    public void testArrayShapeDeserialization() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayShapeBean bean = mapper.readValue("[\"valA\", \"valB\"]", ArrayShapeBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("valA", bean.a);
        Assert.assertEquals("valB", bean.b);
    }

    @Test
    public void testObjectIdHandling() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":1, \"name\":\"Root\", \"next\":{\"id\":2, \"name\":\"Child\", \"next\":1}}";
        IdBean bean = mapper.readValue(json, IdBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(1, bean.id);
        Assert.assertEquals("Root", bean.name);
        Assert.assertNotNull(bean.next);
        Assert.assertEquals(2, bean.next.id);
        Assert.assertSame(bean, bean.next.next);
    }

    @Test
    public void testManagedAndBackReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"parentName\":\"Dad\", \"child\":{\"childName\":\"Kid\"}}";
        ParentRef parent = mapper.readValue(json, ParentRef.class);
        Assert.assertNotNull(parent);
        Assert.assertEquals("Dad", parent.parentName);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals("Kid", parent.child.childName);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test
    public void testUnwrappedProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"title\":\"Article\", \"value1\":\"v1\", \"value2\":\"v2\"}";
        UnwrappedContainer container = mapper.readValue(json, UnwrappedContainer.class);
        Assert.assertNotNull(container);
        Assert.assertEquals("Article", container.title);
        Assert.assertNotNull(container.payload);
        Assert.assertEquals("v1", container.payload.value1);
        Assert.assertEquals("v2", container.payload.value2);
    }

    @Test
    public void testAnySetter() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"known\":\"yes\", \"extra1\":\"foo\", \"extra2\":999}";
        AnySetterBean bean = mapper.readValue(json, AnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("yes", bean.known);
        Assert.assertEquals("foo", bean.getOthers().get("extra1"));
        Assert.assertEquals(999, bean.getOthers().get("extra2"));
    }

    @Test
    public void testInjectableValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectId", "InjectedString");

        InjectedBean bean = mapper.reader(injectables)
                .forType(InjectedBean.class)
                .readValue("{\"normalVal\":\"NormalString\"}");

        Assert.assertNotNull(bean);
        Assert.assertEquals("InjectedString", bean.injectedVal);
        Assert.assertEquals("NormalString", bean.normalVal);
    }

    @Test
    public void testIgnoredProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"standard\":\"ok\", \"ignored1\":\"skip\", \"ignored2\":123}";
        IgnoredPropsBean bean = mapper.readValue(json, IgnoredPropsBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("ok", bean.standard);
    }

    @Test
    public void testInnerClassPropertyResolution() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"outerName\":\"outer\", \"inner\":{\"innerName\":\"innerVal\"}}";
        OuterBean bean = mapper.readValue(json, OuterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("outer", bean.outerName);
        Assert.assertNotNull(bean.inner);
        Assert.assertEquals("innerVal", bean.inner.innerName);
    }

    @Test
    public void testDelegatingCreators() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        DelegatingStringBean strBean = mapper.readValue("\"textVal\"", DelegatingStringBean.class);
        Assert.assertEquals("textVal", strBean.val);

        DelegatingIntBean intBean = mapper.readValue("42", DelegatingIntBean.class);
        Assert.assertEquals(42, intBean.val);

        DelegatingLongBean longBean = mapper.readValue("9876543210", DelegatingLongBean.class);
        Assert.assertEquals(9876543210L, longBean.val);

        DelegatingDoubleBean dblBean = mapper.readValue("3.1415", DelegatingDoubleBean.class);
        Assert.assertEquals(3.1415, dblBean.val, 0.00001);

        DelegatingBooleanBean boolBean = mapper.readValue("true", DelegatingBooleanBean.class);
        Assert.assertTrue(boolBean.val);

        DelegatingArrayBean arrBean = mapper.readValue("[\"a\",\"b\"]", DelegatingArrayBean.class);
        Assert.assertNotNull(arrBean.list);
        Assert.assertEquals(2, arrBean.list.size());
        Assert.assertEquals("a", arrBean.list.get(0));
    }

    @Test
    public void testCaseInsensitiveProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"MYFIELD\":\"matched\"}";
        CaseInsensitiveBean bean = mapper.readValue(json, CaseInsensitiveBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("matched", bean.myField);
    }

    @Test
    public void testArrayUnwrappingAndEmptyArrayAsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);

        SimpleBean singleUnwrapped = mapper.readValue("[{\"name\":\"Alice\", \"age\":25}]", SimpleBean.class);
        Assert.assertNotNull(singleUnwrapped);
        Assert.assertEquals("Alice", singleUnwrapped.name);

        SimpleBean emptyArrayNull = mapper.readValue("[]", SimpleBean.class);
        Assert.assertNull(emptyArrayNull);
    }
}
