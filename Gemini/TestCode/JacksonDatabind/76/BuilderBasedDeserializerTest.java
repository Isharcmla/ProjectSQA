package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class BuilderBasedDeserializerTest {

    // ------------------------------------------------------------------------
    // POJOs for tests
    // ------------------------------------------------------------------------

    @JsonDeserialize(builder = SimpleBean.Builder.class)
    static class SimpleBean {
        final int x;
        final String y;

        SimpleBean(int x, String y) {
            this.x = x;
            this.y = y;
        }

        static class Builder {
            int x;
            String y;

            public Builder withX(int x) {
                this.x = x;
                return this;
            }

            public Builder withY(String y) {
                this.y = y;
                return this;
            }

            public SimpleBean build() {
                return new SimpleBean(x, y);
            }
        }
    }

    @JsonDeserialize(builder = CustomBuildNameBean.Builder.class)
    static class CustomBuildNameBean {
        final String name;

        CustomBuildNameBean(String name) {
            this.name = name;
        }

        @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
        static class Builder {
            String name;

            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public CustomBuildNameBean create() {
                return new CustomBuildNameBean(name);
            }
        }
    }

    @JsonDeserialize(builder = FailingBuildBean.Builder.class)
    static class FailingBuildBean {
        static class Builder {
            public Builder withVal(int v) {
                return this;
            }

            public FailingBuildBean build() {
                throw new IllegalStateException("Simulated build failure");
            }
        }
    }

    @JsonDeserialize(builder = FailingSetterBean.Builder.class)
    static class FailingSetterBean {
        static class Builder {
            public Builder withVal(int v) {
                throw new IllegalArgumentException("Invalid setter value: " + v);
            }

            public FailingSetterBean build() {
                return new FailingSetterBean();
            }
        }
    }

    @JsonDeserialize(builder = CreatorBuilderBean.Builder.class)
    static class CreatorBuilderBean {
        final int a;
        final int b;
        final String extra;

        CreatorBuilderBean(int a, int b, String extra) {
            this.a = a;
            this.b = b;
            this.extra = extra;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        static class Builder {
            int a;
            int b;
            String extra;

            @JsonCreator
            public Builder(@JsonProperty("a") int a) {
                this.a = a;
            }

            public Builder withB(int b) {
                this.b = b;
                return this;
            }

            public Builder withExtra(String extra) {
                this.extra = extra;
                return this;
            }

            public CreatorBuilderBean build() {
                return new CreatorBuilderBean(a, b, extra);
            }
        }
    }

    static class Views {
        interface Public {}
        interface Internal extends Public {}
    }

    @JsonDeserialize(builder = ViewBean.Builder.class)
    static class ViewBean {
        final String pub;
        final String priv;

        ViewBean(String pub, String priv) {
            this.pub = pub;
            this.priv = priv;
        }

        static class Builder {
            String pub;
            String priv;

            @JsonView(Views.Public.class)
            public Builder withPub(String pub) {
                this.pub = pub;
                return this;
            }

            @JsonView(Views.Internal.class)
            public Builder withPriv(String priv) {
                this.priv = priv;
                return this;
            }

            public ViewBean build() {
                return new ViewBean(pub, priv);
            }
        }
    }

    static class InnerLoc {
        public int x;
        public int y;
    }

    @JsonDeserialize(builder = UnwrappedBean.Builder.class)
    static class UnwrappedBean {
        final String name;
        final InnerLoc loc;

        UnwrappedBean(String name, InnerLoc loc) {
            this.name = name;
            this.loc = loc;
        }

        static class Builder {
            String name;
            InnerLoc loc;

            public Builder withName(String name) {
                this.name = name;
                return this;
            }

            @JsonUnwrapped
            public Builder withLoc(InnerLoc loc) {
                this.loc = loc;
                return this;
            }

            public UnwrappedBean build() {
                return new UnwrappedBean(name, loc);
            }
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    @JsonDeserialize(builder = ArrayBean.Builder.class)
    static class ArrayBean {
        final int x;
        final int y;

        ArrayBean(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @JsonPropertyOrder({"x", "y"})
        static class Builder {
            int x;
            int y;

            public Builder withX(int x) {
                this.x = x;
                return this;
            }

            public Builder withY(int y) {
                this.y = y;
                return this;
            }

            public ArrayBean build() {
                return new ArrayBean(x, y);
            }
        }
    }

    @JsonDeserialize(builder = AnySetterBean.Builder.class)
    static class AnySetterBean {
        final Map<String, Object> map;

        AnySetterBean(Map<String, Object> map) {
            this.map = map;
        }

        static class Builder {
            Map<String, Object> map = new HashMap<>();

            @JsonAnySetter
            public Builder setAny(String key, Object value) {
                map.put(key, value);
                return this;
            }

            public AnySetterBean build() {
                return new AnySetterBean(map);
            }
        }
    }

    @JsonDeserialize(builder = InjectedBean.Builder.class)
    static class InjectedBean {
        final String val;
        final String injected;

        InjectedBean(String val, String injected) {
            this.val = val;
            this.injected = injected;
        }

        static class Builder {
            String val;
            @JacksonInject("injectKey")
            String injected;

            public Builder withVal(String val) {
                this.val = val;
                return this;
            }

            public InjectedBean build() {
                return new InjectedBean(val, injected);
            }
        }
    }

    @JsonDeserialize(builder = StringCreatorBean.Builder.class)
    static class StringCreatorBean {
        final String value;

        StringCreatorBean(String v) {
            this.value = v;
        }

        static class Builder {
            String value;

            @JsonCreator
            public Builder(String v) {
                this.value = v;
            }

            public StringCreatorBean build() {
                return new StringCreatorBean(value);
            }
        }
    }

    @JsonDeserialize(builder = NumberCreatorBean.Builder.class)
    static class NumberCreatorBean {
        final long num;

        NumberCreatorBean(long n) {
            this.num = n;
        }

        static class Builder {
            long num;

            @JsonCreator
            public Builder(long n) {
                this.num = n;
            }

            public NumberCreatorBean build() {
                return new NumberCreatorBean(num);
            }
        }
    }

    @JsonDeserialize(builder = DoubleCreatorBean.Builder.class)
    static class DoubleCreatorBean {
        final double d;

        DoubleCreatorBean(double d) {
            this.d = d;
        }

        static class Builder {
            double d;

            @JsonCreator
            public Builder(double d) {
                this.d = d;
            }

            public DoubleCreatorBean build() {
                return new DoubleCreatorBean(d);
            }
        }
    }

    @JsonDeserialize(builder = BooleanCreatorBean.Builder.class)
    static class BooleanCreatorBean {
        final boolean b;

        BooleanCreatorBean(boolean b) {
            this.b = b;
        }

        static class Builder {
            boolean b;

            @JsonCreator
            public Builder(boolean b) {
                this.b = b;
            }

            public BooleanCreatorBean build() {
                return new BooleanCreatorBean(b);
            }
        }
    }

    @JsonDeserialize(builder = ArrayCreatorBean.Builder.class)
    static class ArrayCreatorBean {
        final List<String> list;

        ArrayCreatorBean(List<String> list) {
            this.list = list;
        }

        static class Builder {
            List<String> list;

            @JsonCreator
            public Builder(List<String> list) {
                this.list = list;
            }

            public ArrayCreatorBean build() {
                return new ArrayCreatorBean(list);
            }
        }
    }

    static class ExtTypeContainer {
        public String type;
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({
                @JsonSubTypes.Type(value = ExtPolyImpl.class, name = "impl")
        })
        public ExtPoly poly;
    }

    interface ExtPoly {}

    @JsonDeserialize(builder = ExtPolyImpl.Builder.class)
    static class ExtPolyImpl implements ExtPoly {
        final int value;

        ExtPolyImpl(int v) {
            this.value = v;
        }

        static class Builder {
            int value;

            public Builder withValue(int v) {
                this.value = v;
                return this;
            }

            public ExtPolyImpl build() {
                return new ExtPolyImpl(value);
            }
        }
    }

    // ------------------------------------------------------------------------
    // Tests: Normal & Edge Cases via ObjectMapper (exercising BuilderBasedDeserializer)
    // ------------------------------------------------------------------------

    @Test
    public void testDeserialize_normalInput_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean = mapper.readValue("{\"x\": 42, \"y\": \"hello\"}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(42, bean.x);
        Assert.assertEquals("hello", bean.y);
    }

    @Test
    public void testDeserialize_edgeCases_nullAndEmpty() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean bean1 = mapper.readValue("{\"x\": 0, \"y\": \"\"}", SimpleBean.class);
        Assert.assertNotNull(bean1);
        Assert.assertEquals(0, bean1.x);
        Assert.assertEquals("", bean1.y);

        SimpleBean bean2 = mapper.readValue("{\"x\": -99, \"y\": null}", SimpleBean.class);
        Assert.assertNotNull(bean2);
        Assert.assertEquals(-99, bean2.x);
        Assert.assertNull(bean2.y);

        SimpleBean bean3 = mapper.readValue("{}", SimpleBean.class);
        Assert.assertNotNull(bean3);
        Assert.assertEquals(0, bean3.x);
        Assert.assertNull(bean3.y);
    }

    @Test
    public void testDeserialize_customBuildMethodName_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CustomBuildNameBean bean = mapper.readValue("{\"name\": \"custom\"}", CustomBuildNameBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("custom", bean.name);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_buildMethodThrowsException_wrapsAndThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"val\": 123}", FailingBuildBean.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_setterThrowsException_wrapsAndThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"val\": 123}", FailingSetterBean.class);
    }

    @Test
    public void testDeserialize_propertyBasedCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        CreatorBuilderBean bean = mapper.readValue("{\"b\": 20, \"a\": 10, \"extra\": \"val\", \"unknown\": 999}", CreatorBuilderBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(10, bean.a);
        Assert.assertEquals(20, bean.b);
        Assert.assertEquals("val", bean.extra);
    }

    @Test
    public void testDeserialize_withViews_publicAndInternal() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"pub\": \"visible\", \"priv\": \"secret\"}";

        ViewBean pubBean = mapper.readerWithView(Views.Public.class)
                .forType(ViewBean.class)
                .readValue(json);
        Assert.assertNotNull(pubBean);
        Assert.assertEquals("visible", pubBean.pub);
        Assert.assertNull(pubBean.priv);

        ViewBean internalBean = mapper.readerWithView(Views.Internal.class)
                .forType(ViewBean.class)
                .readValue(json);
        Assert.assertNotNull(internalBean);
        Assert.assertEquals("visible", internalBean.pub);
        Assert.assertEquals("secret", internalBean.priv);
    }

    @Test
    public void testDeserialize_unwrappedProperties_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"name\": \"spot\", \"x\": 10, \"y\": 20}";
        UnwrappedBean bean = mapper.readValue(json, UnwrappedBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("spot", bean.name);
        Assert.assertNotNull(bean.loc);
        Assert.assertEquals(10, bean.loc.x);
        Assert.assertEquals(20, bean.loc.y);
    }

    @Test
    public void testDeserialize_asArrayDeserializer_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayBean bean = mapper.readValue("[100, 200]", ArrayBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(100, bean.x);
        Assert.assertEquals(200, bean.y);
    }

    @Test
    public void testDeserialize_anySetter_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnySetterBean bean = mapper.readValue("{\"foo\": \"bar\", \"count\": 12}", AnySetterBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("bar", bean.map.get("foo"));
        Assert.assertEquals(12, bean.map.get("count"));
    }

    @Test
    public void testDeserialize_injectables_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InjectableValues.Std injectables = new InjectableValues.Std();
        injectables.addValue("injectKey", "injectedValue");
        InjectedBean bean = mapper.reader(injectables)
                .forType(InjectedBean.class)
                .readValue("{\"val\": \"test\"}");
        Assert.assertNotNull(bean);
        Assert.assertEquals("test", bean.val);
        Assert.assertEquals("injectedValue", bean.injected);
    }

    @Test
    public void testDeserialize_externalTypeId_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"type\": \"impl\", \"poly\": {\"value\": 555}}";
        ExtTypeContainer container = mapper.readValue(json, ExtTypeContainer.class);
        Assert.assertNotNull(container);
        Assert.assertEquals("impl", container.type);
        Assert.assertTrue(container.poly instanceof ExtPolyImpl);
        Assert.assertEquals(555, ((ExtPolyImpl) container.poly).value);
    }

    @Test
    public void testDeserialize_stringCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StringCreatorBean bean = mapper.readValue("\"stringVal\"", StringCreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals("stringVal", bean.value);
    }

    @Test
    public void testDeserialize_numberCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        NumberCreatorBean bean = mapper.readValue("1234567890", NumberCreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(1234567890L, bean.num);
    }

    @Test
    public void testDeserialize_doubleCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DoubleCreatorBean bean = mapper.readValue("3.1415", DoubleCreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(3.1415, bean.d, 0.0001);
    }

    @Test
    public void testDeserialize_booleanCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BooleanCreatorBean beanTrue = mapper.readValue("true", BooleanCreatorBean.class);
        Assert.assertNotNull(beanTrue);
        Assert.assertTrue(beanTrue.b);

        BooleanCreatorBean beanFalse = mapper.readValue("false", BooleanCreatorBean.class);
        Assert.assertNotNull(beanFalse);
        Assert.assertFalse(beanFalse.b);
    }

    @Test
    public void testDeserialize_arrayCreator_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ArrayCreatorBean bean = mapper.readValue("[\"a\", \"b\", \"c\"]", ArrayCreatorBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(Arrays.asList("a", "b", "c"), bean.list);
    }

    @Test(expected = UnrecognizedPropertyException.class)
    public void testDeserialize_unknownProperty_throwsException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue("{\"unknown\": 123}", SimpleBean.class);
    }

    @Test
    public void testDeserialize_unknownPropertyIgnored_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        SimpleBean bean = mapper.readValue("{\"unknown\": 123, \"x\": 5}", SimpleBean.class);
        Assert.assertNotNull(bean);
        Assert.assertEquals(5, bean.x);
    }

    // ------------------------------------------------------------------------
    // Tests: Direct Method Invocations on BuilderBasedDeserializer
    // ------------------------------------------------------------------------

    private BuilderBasedDeserializer getBuilderDeserializer(ObjectMapper mapper, Class<?> cls) throws Exception {
        JavaType type = mapper.constructType(cls);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        JsonDeserializer<Object> deser = mapper.getDeserializationConfig()
                .findRootValueDeserializer(type);
        if (deser == null) {
            deser = mapper.getDeserializationContext().findRootValueDeserializer(type);
        }
        if (deser instanceof BuilderBasedDeserializer) {
            return (BuilderBasedDeserializer) deser;
        }
        // Fallback: resolve using standard deserializer provider
        return (BuilderBasedDeserializer) mapper.readerFor(cls).forType(cls)._findRootDeserializer(ctxt);
    }

    @Test
    public void testDirectMethods_withVariants_returnNewInstances() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // Resolve deserializer
        mapper.readValue("{\"x\": 1}", SimpleBean.class);
        BuilderBasedDeserializer deser = (BuilderBasedDeserializer) mapper.readerFor(SimpleBean.class)._findRootDeserializer(mapper.getDeserializationContext());

        // unwrappingDeserializer
        JsonDeserializer<Object> unwrapped = deser.unwrappingDeserializer(NameTransformer.simpleTransformer("pre_", "_post"));
        Assert.assertNotNull(unwrapped);
        Assert.assertTrue(unwrapped instanceof BuilderBasedDeserializer);

        // withIgnorableProperties
        Set<String> ignorable = new HashSet<>(Collections.singletonList("ignoreMe"));
        BeanDeserializerBase withIgn = deser.withIgnorableProperties(ignorable);
        Assert.assertNotNull(withIgn);
        Assert.assertTrue(withIgn instanceof BuilderBasedDeserializer);

        // withBeanProperties
        BeanPropertyMap propMap = BeanPropertyMap.construct(Collections.emptyList(), false);
        BeanDeserializerBase withProps = deser.withBeanProperties(propMap);
        Assert.assertNotNull(withProps);
        Assert.assertTrue(withProps instanceof BuilderBasedDeserializer);

        // asArrayDeserializer
        BeanDeserializerBase asArray = deser.asArrayDeserializer();
        Assert.assertNotNull(asArray);

        // withObjectIdReader
        BeanDeserializerBase withOir = deser.withObjectIdReader(null);
        Assert.assertNotNull(withOir);
        Assert.assertTrue(withOir instanceof BuilderBasedDeserializer);
    }

    @Test
    public void testDeserialize_updatingBuilder_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BuilderBasedDeserializer deser = (BuilderBasedDeserializer) mapper.readerFor(SimpleBean.class)._findRootDeserializer(mapper.getDeserializationContext());

        SimpleBean.Builder builder = new SimpleBean.Builder();
        builder.withX(100);

        JsonParser parser = mapper.getFactory().createParser("{\"y\": \"updated\"}");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        // Deserialize updating existing builder
        Object result = deser.deserialize(parser, ctxt, builder);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof SimpleBean);
        SimpleBean bean = (SimpleBean) result;
        Assert.assertEquals(100, bean.x);
        Assert.assertEquals("updated", bean.y);
    }

    @Test
    public void testFinishBuild_nullBuildMethod_returnsBuilderItself() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BuilderBasedDeserializer deser = (BuilderBasedDeserializer) mapper.readerFor(SimpleBean.class)._findRootDeserializer(mapper.getDeserializationContext());

        // Create a copy deserializer with null build method using standard constructor or subclassing if needed
        // Direct finishBuild invocation
        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object finished = deser.finishBuild(ctxt, new SimpleBean.Builder().withX(77));
        Assert.assertNotNull(finished);
        Assert.assertTrue(finished instanceof SimpleBean);
        Assert.assertEquals(77, ((SimpleBean) finished).x);
    }

    @Test
    public void testDeserialize_embeddedObjectToken_returnsEmbeddedObject() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BuilderBasedDeserializer deser = (BuilderBasedDeserializer) mapper.readerFor(SimpleBean.class)._findRootDeserializer(mapper.getDeserializationContext());

        // Test embedded object handling in deserialize
        SimpleBean expected = new SimpleBean(1, "emb");
        JsonParser parser = new JsonParser() {
            @Override public Codec getCodec() { return null; }
            @Override public void setCodec(Codec c) {}
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void close() throws IOException {}
            @Override public boolean isClosed() { return false; }
            @Override public JsonStreamContext getParsingContext() { return null; }
            @Override public JsonLocation getTokenLocation() { return null; }
            @Override public JsonLocation getCurrentLocation() { return null; }
            @Override public JsonToken nextToken() throws IOException { return JsonToken.VALUE_EMBEDDED_OBJECT; }
            @Override public JsonToken getCurrentToken() { return JsonToken.VALUE_EMBEDDED_OBJECT; }
            @Override public int getCurrentTokenId() { return JsonTokenId.ID_EMBEDDED_OBJECT; }
            @Override public boolean hasCurrentToken() { return true; }
            @Override public boolean hasTokenId(int id) { return id == JsonTokenId.ID_EMBEDDED_OBJECT; }
            @Override public boolean hasToken(JsonToken t) { return t == JsonToken.VALUE_EMBEDDED_OBJECT; }
            @Override public void clearCurrentToken() {}
            @Override public JsonToken getLastClearedToken() { return null; }
            @Override public void overrideCurrentName(String name) {}
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public String getText() throws IOException { return null; }
            @Override public char[] getTextCharacters() throws IOException { return new char[0]; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public NumberType getNumberType() throws IOException { return null; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0; }
            @Override public BigInteger getBigIntegerValue() throws IOException { return null; }
            @Override public float getFloatValue() throws IOException { return 0; }
            @Override public double getDoubleValue() throws IOException { return 0; }
            @Override public BigDecimal getDecimalValue() throws IOException { return null; }
            @Override public byte[] getBinaryValue(Base64Variant bv) throws IOException { return new byte[0]; }
            @Override public Object getEmbeddedObject() throws IOException { return expected; }
        };

        DeserializationContext ctxt = mapper.getDeserializationContext();
        Object result = deser.deserialize(parser, ctxt);
        Assert.assertSame(expected, result);
    }

    @Test
    public void testDeserialize_unexpectedToken_throwsOrHandles() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BuilderBasedDeserializer deser = (BuilderBasedDeserializer) mapper.readerFor(SimpleBean.class)._findRootDeserializer(mapper.getDeserializationContext());

        JsonParser parser = mapper.getFactory().createParser("12345");
        parser.nextToken(); // pointing to VALUE_NUMBER_INT, but SimpleBean has no int creator
        try {
            deser.deserialize(parser, mapper.getDeserializationContext());
            Assert.fail("Should have failed for unexpected token");
        } catch (JsonMappingException e) {
            // Expected
            Assert.assertTrue(e.getMessage().contains("SimpleBean"));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializeUsingPropertyBasedWithExternalTypeId_throwsIllegalStateException() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        BuilderBasedDeserializer deser = (BuilderBasedDeserializer) mapper.readerFor(SimpleBean.class)._findRootDeserializer(mapper.getDeserializationContext());
        deser.deserializeUsingPropertyBasedWithExternalTypeId(null, mapper.getDeserializationContext());
    }
}
