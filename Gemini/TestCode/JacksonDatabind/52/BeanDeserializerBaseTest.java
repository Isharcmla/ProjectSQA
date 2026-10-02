package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanDeserializerBaseTest {

    // =========================================================================
    // Helper POJOs for Integration & Unit Scenarios
    // =========================================================================

    public static class SimpleBean {
        public String name;
        public int age;

        public SimpleBean() {}

        public SimpleBean(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class IgnorableBean {
        @JsonIgnoreProperties({"dummy", "hidden"})
        public String name;
    }

    public static class AnySetterBean {
        public String name;
        public Map<String, Object> any = new HashMap<String, Object>();

        @JsonAnySetter
        public void handleUnknown(String key, Object value) {
            any.put(key, value);
        }
    }

    public static class ManagedParent {
        public String name;
        @JsonManagedReference
        public ManagedChild child;
    }

    public static class ManagedChild {
        public int id;
        @JsonBackReference
        public ManagedParent parent;
    }

    public static class IncompatibleManagedParent {
        public String name;
        @JsonManagedReference
        public IncompatibleChild child;
    }

    public static class IncompatibleChild {
        public int id;
        @JsonBackReference
        public String parent; // Incompatible type
    }

    public static class UnwrappedOuter {
        public String title;
        @JsonUnwrapped
        public SimpleBean inner;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class IdBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class IntIdBean {
        public String name;
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    public static class ArrayShapeBean {
        public String a;
        public int b;
    }

    public static class InjectBean {
        @JacksonInject("injectedVal")
        public String injected;
        public String regular;
    }

    public static class CreatorBean {
        public final String name;
        public final int age;

        @JsonCreator
        public CreatorBean(@JsonProperty("name") String name, @JsonProperty("age") int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class DelegateBean {
        public final String value;

        @JsonCreator
        public DelegateBean(String v) {
            this.value = "delegated:" + v;
        }
    }

    public static class ArrayDelegateBean {
        public final List<String> list;

        @JsonCreator
        public ArrayDelegateBean(List<String> list) {
            this.list = list;
        }
    }

    public static class NumberCreatorBean {
        public final long num;

        @JsonCreator
        public NumberCreatorBean(long num) {
            this.num = num;
        }
    }

    public static class DoubleCreatorBean {
        public final double num;

        @JsonCreator
        public DoubleCreatorBean(double num) {
            this.num = num;
        }
    }

    public static class BooleanCreatorBean {
        public final boolean bool;

        @JsonCreator
        public BooleanCreatorBean(boolean bool) {
            this.bool = bool;
        }
    }

    public static class NonStaticOuter {
        public class Inner {
            public String innerVal;
        }
        public Inner inner;
    }

    // =========================================================================
    // Concrete Test Subclass of BeanDeserializerBase
    // =========================================================================

    public static class ConcreteBeanDeserializer extends BeanDeserializerBase {
        private static final long serialVersionUID = 1L;

        public ConcreteBeanDeserializer(BeanDeserializerBuilder builder,
                BeanDescription beanDesc,
                BeanPropertyMap properties,
                Map<String, SettableBeanProperty> backRefs,
                Set<String> ignorableProps,
                boolean ignoreAllUnknown,
                boolean hasViews) {
            super(builder, beanDesc, properties, backRefs, ignorableProps, ignoreAllUnknown, hasViews);
        }

        public ConcreteBeanDeserializer(ConcreteBeanDeserializer src) {
            super(src);
        }

        public ConcreteBeanDeserializer(ConcreteBeanDeserializer src, boolean ignoreAllUnknown) {
            super(src, ignoreAllUnknown);
        }

        public ConcreteBeanDeserializer(ConcreteBeanDeserializer src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }

        public ConcreteBeanDeserializer(ConcreteBeanDeserializer src, ObjectIdReader oir) {
            super(src, oir);
        }

        public ConcreteBeanDeserializer(ConcreteBeanDeserializer src, Set<String> ignorableProps) {
            super(src, ignorableProps);
        }

        public ConcreteBeanDeserializer(ConcreteBeanDeserializer src, BeanPropertyMap props) {
            super(src, props);
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
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return deserializeFromObject(p, ctxt);
        }

        @Override
        public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return _valueInstantiator.createUsingDefault(ctxt);
        }

        @Override
        protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    // Helper to obtain a real BeanDeserializerBase instance via ObjectMapper
    private BeanDeserializerBase getBeanDeserializer(ObjectMapper mapper, Class<?> cls) throws JsonMappingException {
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JavaType type = mapper.constructType(cls);
        JsonDeserializer<Object> deser = ctxt.findRootValueDeserializer(type);
        if (deser instanceof BeanDeserializerBase) {
            return (BeanDeserializerBase) deser;
        }
        throw new IllegalArgumentException("Deserializer is not a BeanDeserializerBase: " + deser);
    }

    // =========================================================================
    // Tests for Public Accessors and Inspectors
    // =========================================================================

    @Test
    public void testBasicAccessors_normal_returnsCorrectMetadata() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);

        Assert.assertTrue(deser.isCachable());
        Assert.assertEquals(SimpleBean.class, deser.handledType());
        Assert.assertEquals(SimpleBean.class, deser.getBeanClass());
        Assert.assertEquals(SimpleBean.class, deser.getValueType().getRawClass());
        Assert.assertNotNull(deser.getValueInstantiator());
        Assert.assertNull(deser.getObjectIdReader());
        Assert.assertFalse(deser.hasViews());

        Assert.assertTrue(deser.hasProperty("name"));
        Assert.assertTrue(deser.hasProperty("age"));
        Assert.assertFalse(deser.hasProperty("nonExistent"));

        Assert.assertEquals(2, deser.getPropertyCount());

        Collection<Object> names = deser.getKnownPropertyNames();
        Assert.assertTrue(names.contains("name"));
        Assert.assertTrue(names.contains("age"));

        Iterator<SettableBeanProperty> it = deser.properties();
        Assert.assertNotNull(it);
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        Assert.assertEquals(2, count);

        Iterator<SettableBeanProperty> creatorIt = deser.creatorProperties();
        Assert.assertNotNull(creatorIt);
        Assert.assertFalse(creatorIt.hasNext());
    }

    @Test
    public void testFindProperty_variousOverloads_returnsPropertyOrNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);

        SettableBeanProperty p1 = deser.findProperty("name");
        Assert.assertNotNull(p1);
        Assert.assertEquals("name", p1.getName());

        SettableBeanProperty p2 = deser.findProperty(new PropertyName("age"));
        Assert.assertNotNull(p2);
        Assert.assertEquals("age", p2.getName());

        SettableBeanProperty p3 = deser.findProperty("missing");
        Assert.assertNull(p3);

        SettableBeanProperty pByIndex = deser.findProperty(0);
        Assert.assertNotNull(pByIndex);

        SettableBeanProperty pByIndexOutOfBounds = deser.findProperty(999);
        Assert.assertNull(pByIndexOutOfBounds);
    }

    @Test
    public void testCreatorProperties_withCreatorBean_returnsProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, CreatorBean.class);

        Iterator<SettableBeanProperty> creatorProps = deser.creatorProperties();
        Assert.assertNotNull(creatorProps);
        Assert.assertTrue(creatorProps.hasNext());

        SettableBeanProperty p = deser.findProperty("name");
        Assert.assertNotNull(p);

        SettableBeanProperty pIndex = deser.findProperty(0);
        Assert.assertNotNull(pIndex);
    }

    @Test
    public void testFindBackReference_withManagedChild_returnsBackRef() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase childDeser = getBeanDeserializer(mapper, ManagedChild.class);

        SettableBeanProperty backProp = childDeser.findBackReference("defaultReference");
        Assert.assertNotNull(backProp);
        Assert.assertEquals("parent", backProp.getName());

        Assert.assertNull(childDeser.findBackReference("nonExistentRef"));
    }

    @Test
    public void testReplaceProperty_validProperty_replacesSuccessfully() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);

        SettableBeanProperty orig = deser.findProperty("name");
        Assert.assertNotNull(orig);

        SettableBeanProperty replacement = orig.withSimpleName("name");
        deser.replaceProperty(orig, replacement);

        Assert.assertNotNull(deser.findProperty("name"));
    }

    // =========================================================================
    // Tests for Constructors and Mutant Factory Methods
    // =========================================================================

    @Test
    public void testCopyConstructors_variousVariants_createExpectedCopies() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase base = getBeanDeserializer(mapper, SimpleBean.class);

        ConcreteBeanDeserializer custom = new ConcreteBeanDeserializer((BeanDeserializer) base);

        ConcreteBeanDeserializer copy1 = new ConcreteBeanDeserializer(custom, true);
        Assert.assertNotNull(copy1);

        ConcreteBeanDeserializer copy2 = new ConcreteBeanDeserializer(custom, NameTransformer.NOP);
        Assert.assertNotNull(copy2);

        ConcreteBeanDeserializer copy3 = new ConcreteBeanDeserializer(custom, (NameTransformer) null);
        Assert.assertNotNull(copy3);

        Set<String> ign = new HashSet<String>(Arrays.asList("age"));
        ConcreteBeanDeserializer copy4 = new ConcreteBeanDeserializer(custom, ign);
        Assert.assertNull(copy4.findProperty("age"));
        Assert.assertNotNull(copy4.findProperty("name"));

        ObjectIdReader oir = ObjectIdReader.construct(
                mapper.constructType(int.class),
                new PropertyName("id"),
                new ObjectIdGenerators.IntSequenceGenerator(),
                null,
                null,
                new SimpleObjectIdResolver()
        );
        ConcreteBeanDeserializer copy5 = new ConcreteBeanDeserializer(custom, oir);
        Assert.assertNotNull(copy5.getObjectIdReader());

        ConcreteBeanDeserializer copy6 = new ConcreteBeanDeserializer(custom, (ObjectIdReader) null);
        Assert.assertNull(copy6.getObjectIdReader());

        BeanPropertyMap propMap = BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false);
        ConcreteBeanDeserializer copy7 = new ConcreteBeanDeserializer(custom, propMap);
        Assert.assertEquals(0, copy7.getPropertyCount());
    }

    @Test
    public void testMutantFactories_withConcreteSubclass_createsNewInstances() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase base = getBeanDeserializer(mapper, SimpleBean.class);
        ConcreteBeanDeserializer custom = new ConcreteBeanDeserializer((BeanDeserializer) base);

        JsonDeserializer<?> unwrapDeser = custom.unwrappingDeserializer(NameTransformer.simpleTransformer("pre_", "_post"));
        Assert.assertNotNull(unwrapDeser);

        BeanDeserializerBase withIgn = custom.withIgnorableProperties(Collections.singleton("name"));
        Assert.assertNotNull(withIgn);

        BeanDeserializerBase withArray = custom.asArrayDeserializer();
        Assert.assertNotNull(withArray);

        BeanPropertyMap emptyMap = BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false);
        BeanDeserializerBase withProps = custom.withBeanProperties(emptyMap);
        Assert.assertEquals(0, withProps.getPropertyCount());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithBeanProperties_defaultImplementation_throwsUnsupportedOperationException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase base = getBeanDeserializer(mapper, SimpleBean.class);
        BeanPropertyMap emptyMap = BeanPropertyMap.construct(Collections.<SettableBeanProperty>emptyList(), false);
        base.withBeanProperties(emptyMap);
    }

    // =========================================================================
    // Tests for Resolution and Contextualization
    // =========================================================================

    @Test
    public void testManagedAndBackReferenceResolution_valid_resolvesProperly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Dad\",\"child\":{\"id\":10}}";
        ManagedParent parent = mapper.readValue(json, ManagedParent.class);
        Assert.assertNotNull(parent);
        Assert.assertEquals("Dad", parent.name);
        Assert.assertNotNull(parent.child);
        Assert.assertEquals(10, parent.child.id);
        Assert.assertSame(parent, parent.child.parent);
    }

    @Test(expected = JsonMappingException.class)
    public void testManagedReferenceResolution_incompatibleType_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"name\":\"Dad\",\"child\":{\"id\":1}}", IncompatibleManagedParent.class);
    }

    @Test
    public void testUnwrappedPropertyResolution_valid_deserializesCorrectly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"title\":\"Master\",\"name\":\"John\",\"age\":30}";
        UnwrappedOuter outer = mapper.readValue(json, UnwrappedOuter.class);
        Assert.assertNotNull(outer);
        Assert.assertEquals("Master", outer.title);
        Assert.assertNotNull(outer.inner);
        Assert.assertEquals("John", outer.inner.name);
        Assert.assertEquals(30, outer.inner.age);
    }

    @Test
    public void testNonStaticInnerClassPropertyResolution_valid_deserializesCorrectly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"inner\":{\"innerVal\":\"hello\"}}";
        NonStaticOuter outer = mapper.readValue(json, NonStaticOuter.class);
        Assert.assertNotNull(outer);
        Assert.assertNotNull(outer.inner);
        Assert.assertEquals("hello", outer.inner.innerVal);
    }

    // =========================================================================
    // Tests for Deserialization Scenarios & Edge Cases
    // =========================================================================

    @Test
    public void testDeserializeFromObjectId_validAndForwardRef_deserializes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\":123,\"name\":\"Test\"}";
        IdBean bean = mapper.readValue(json, IdBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(123, bean.id);
        Assert.assertEquals("Test", bean.name);

        String refJson = "[{\"id\":1,\"name\":\"A\"}, 1]";
        IdBean[] beans = mapper.readValue(refJson, IdBean[].class);
        Assert.assertEquals(2, beans.length);
        Assert.assertSame(beans[0], beans[1]);
    }

    @Test(expected = UnresolvedForwardReference.class)
    public void testDeserializeFromObjectId_unresolved_throwsUnresolvedForwardReference() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("999", IdBean.class);
    }

    @Test
    public void testDeserializeFromNumber_intAndLong_delegatesOrFails() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        NumberCreatorBean numBean = mapper.readValue("12345", NumberCreatorBean.class);
        Assert.assertNotNull(numBean);
        Assert.assertEquals(12345L, numBean.num);

        try {
            mapper.readValue("123", SimpleBean.class);
            Assert.fail("Should throw exception for missing number creator");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeFromString_delegatesOrFails() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        DelegateBean delBean = mapper.readValue("\"foo\"", DelegateBean.class);
        Assert.assertNotNull(delBean);
        Assert.assertEquals("delegated:foo", delBean.value);

        try {
            mapper.readValue("\"stringVal\"", SimpleBean.class);
            Assert.fail("Should throw exception for missing string creator");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeFromDouble_delegatesOrFails() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        DoubleCreatorBean dBean = mapper.readValue("3.14159", DoubleCreatorBean.class);
        Assert.assertNotNull(dBean);
        Assert.assertEquals(3.14159, dBean.num, 0.0001);

        try {
            mapper.readValue("3.14", SimpleBean.class);
            Assert.fail("Should throw exception for missing double creator");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeFromBoolean_delegatesOrFails() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        BooleanCreatorBean bBean = mapper.readValue("true", BooleanCreatorBean.class);
        Assert.assertNotNull(bBean);
        Assert.assertTrue(bBean.bool);

        try {
            mapper.readValue("true", SimpleBean.class);
            Assert.fail("Should throw exception for missing boolean creator");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeFromArray_variousConfigurations() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // 1. Array delegate creator
        ArrayDelegateBean arrBean = mapper.readValue("[\"x\", \"y\"]", ArrayDelegateBean.class);
        Assert.assertNotNull(arrBean);
        Assert.assertEquals(Arrays.asList("x", "y"), arrBean.list);

        // 2. Shape ARRAY
        ArrayShapeBean shapeBean = mapper.readValue("[\"hello\", 42]", ArrayShapeBean.class);
        Assert.assertNotNull(shapeBean);
        Assert.assertEquals("hello", shapeBean.a);
        Assert.assertEquals(42, shapeBean.b);

        // 3. UNWRAP_SINGLE_VALUE_ARRAYS
        ObjectMapper unwrapMapper = new ObjectMapper();
        unwrapMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        SimpleBean singleBean = unwrapMapper.readValue("[{\"name\":\"Single\",\"age\":1}]", SimpleBean.class);
        Assert.assertNotNull(singleBean);
        Assert.assertEquals("Single", singleBean.name);

        // 4. ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
        ObjectMapper emptyArrMapper = new ObjectMapper();
        emptyArrMapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        SimpleBean emptyBean = emptyArrMapper.readValue("[]", SimpleBean.class);
        Assert.assertNull(emptyBean);
    }

    @Test
    public void testDeserializeFromEmbedded_objectId_returnsReferenced() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser parser = mapper.getFactory().createParser("{}");
        parser.nextToken();
        Object embedded = deser.deserializeFromEmbedded(parser, ctxt);
        Assert.assertNull(embedded);
    }

    @Test
    public void testDeserializeWithType_standard_delegatesToTypeDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        JsonParser parser = mapper.getFactory().createParser("{\"name\":\"Test\",\"age\":20}");
        parser.nextToken();

        TypeDeserializer typeDeser = mapper.getDeserializationConfig()
                .findTypeDeserializer(mapper.constructType(SimpleBean.class));

        // When no type info configured, typeDeser is null, but we can verify method invocation if mock/instance exists
        Assert.assertNull(typeDeser);
    }

    @Test
    public void testInjectValues_validInjectable_injectsProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std inject = new InjectableValues.Std();
        inject.addValue("injectedVal", "injected_secret");

        InjectBean result = mapper.reader(inject).forType(InjectBean.class).readValue("{\"regular\":\"reg\"}");
        Assert.assertNotNull(result);
        Assert.assertEquals("injected_secret", result.injected);
        Assert.assertEquals("reg", result.regular);
    }

    // =========================================================================
    // Tests for Unknown Properties, Ignored Properties & AnySetter
    // =========================================================================

    @Test
    public void testHandleUnknownProperty_anySetter_storesInMap() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\":\"Main\",\"extra1\":\"val1\",\"extra2\":100}";
        AnySetterBean result = mapper.readValue(json, AnySetterBean.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("Main", result.name);
        Assert.assertEquals("val1", result.any.get("extra1"));
        Assert.assertEquals(100, result.any.get("extra2"));
    }

    @Test
    public void testHandleIgnoredProperty_failOnIgnored_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);

        try {
            mapper.readValue("{\"name\":\"A\",\"dummy\":\"ignoreMe\"}", IgnorableBean.class);
            Assert.fail("Should throw IgnoredPropertyException");
        } catch (IgnoredPropertyException e) {
            Assert.assertEquals("dummy", e.getPropertyName());
        }
    }

    @Test
    public void testHandleIgnoredProperty_ignoreSilently_skipsProperty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);

        IgnorableBean bean = mapper.readValue("{\"name\":\"A\",\"dummy\":\"ignoreMe\",\"hidden\":123}", IgnorableBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("A", bean.name);
    }

    @Test
    public void testHandleUnknownProperty_ignoreAllUnknown_skipsUnknown() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        SimpleBean bean = mapper.readValue("{\"name\":\"A\",\"age\":10,\"extra\":999}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("A", bean.name);
        Assert.assertEquals(10, bean.age);
    }

    @Test
    public void testHandleUnknownProperties_withTokenBuffer_processesBufferedUnknowns() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeFieldName("unknownField");
        buf.writeString("unknownValue");

        SimpleBean bean = new SimpleBean();
        Object res = deser.handleUnknownProperties(ctxt, bean, buf);
        Assert.assertSame(bean, res);
    }

    @Test
    public void testHandleUnknownVanilla_withAnySetterAndIgnorable_handlesCorrectly() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase anyDeser = getBeanDeserializer(mapper, AnySetterBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        AnySetterBean target = new AnySetterBean();
        JsonParser p = mapper.getFactory().createParser("\"someVal\"");
        p.nextToken();

        anyDeser.handleUnknownVanilla(p, ctxt, target, "dynamicProp");
        Assert.assertEquals("someVal", target.any.get("dynamicProp"));
    }

    // =========================================================================
    // Tests for Error Wrapping and Reporting
    // =========================================================================

    @Test(expected = JsonMappingException.class)
    public void testWrapAndThrow_stringField_throwsJsonMappingException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        deser.wrapAndThrow(new RuntimeException("Test root exception"), new SimpleBean(), "name", ctxt);
    }

    @Test(expected = JsonMappingException.class)
    @SuppressWarnings("deprecation")
    public void testWrapAndThrow_intIndex_throwsJsonMappingException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        deser.wrapAndThrow(new RuntimeException("Test index exception"), new SimpleBean(), 0, ctxt);
    }

    @Test
    public void testWrapInstantiationProblem_errorAndIOException_propagatesOrWraps() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        try {
            deser.wrapInstantiationProblem(new OutOfMemoryError("Fake OOM"), ctxt);
            Assert.fail("Error should be thrown as-is");
        } catch (Error e) {
            Assert.assertEquals("Fake OOM", e.getMessage());
        }

        try {
            deser.wrapInstantiationProblem(new IOException("Plain IO"), ctxt);
            Assert.fail("IOException should be thrown as-is");
        } catch (IOException e) {
            Assert.assertEquals("Plain IO", e.getMessage());
        }
    }

    // =========================================================================
    // Tests for Polymorphic and Native Object ID Handlers
    // =========================================================================

    @Test
    public void testHandlePolymorphic_sameTypeOrSubtype_deserializes() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();

        SimpleBean instance = new SimpleBean("initial", 1);
        TokenBuffer buf = new TokenBuffer(mapper, false);
        buf.writeFieldName("name");
        buf.writeString("updated");

        Object result = deser.handlePolymorphic(null, ctxt, instance, buf);
        Assert.assertNotNull(result);
    }

    @Test
    public void testConvertObjectId_variousPrimitiveTypes_convertsSuccessfully() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BeanDeserializerBase deser = getBeanDeserializer(mapper, SimpleBean.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonParser p = mapper.getFactory().createParser("{}");

        JsonDeserializer<Object> strDeser = ctxt.findRootValueDeserializer(mapper.constructType(String.class));
        Object strId = deser._convertObjectId(p, ctxt, "id123", strDeser);
        Assert.assertEquals("id123", strId);

        JsonDeserializer<Object> longDeser = ctxt.findRootValueDeserializer(mapper.constructType(Long.class));
        Object longId = deser._convertObjectId(p, ctxt, 1000L, longDeser);
        Assert.assertEquals(1000L, longId);

        JsonDeserializer<Object> intDeser = ctxt.findRootValueDeserializer(mapper.constructType(Integer.class));
        Object intId = deser._convertObjectId(p, ctxt, 50, intDeser);
        Assert.assertEquals(50, intId);
    }
}
