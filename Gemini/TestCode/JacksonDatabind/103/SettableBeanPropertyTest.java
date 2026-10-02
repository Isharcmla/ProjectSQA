package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SettableBeanPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CustomAnnotation {
        String value() default "";
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ContextAnnotation {
        String value() default "";
    }

    public static class SampleBean {
        @CustomAnnotation("fieldAnno")
        public String field;

        public void setField(String f) {
            this.field = f;
        }
    }

    private static class DummyAnnotations implements Annotations {
        @Override
        @SuppressWarnings("unchecked")
        public <A extends Annotation> A get(Class<A> cls) {
            if (cls == ContextAnnotation.class) {
                return (A) SampleBean.class.getAnnotation(ContextAnnotation.class);
            }
            return null;
        }

        @Override
        public boolean has(Class<?> cls) {
            return cls == ContextAnnotation.class;
        }

        @Override
        public boolean hasOneOf(Class<? extends Annotation>[] classes) {
            for (Class<?> c : classes) {
                if (has(c)) return true;
            }
            return false;
        }

        @Override
        public int size() {
            return 1;
        }
    }

    public static class ConcreteSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        private final AnnotatedMember _member;
        public Object lastSetValue;
        public Object lastInstance;

        public ConcreteSettableBeanProperty(PropertyName propName, JavaType type, PropertyName wrapper,
                                            TypeDeserializer typeDeser, Annotations contextAnnotations,
                                            PropertyMetadata metadata, AnnotatedMember member) {
            super(propName, type, wrapper, typeDeser, contextAnnotations, metadata);
            this._member = member;
        }

        public ConcreteSettableBeanProperty(BeanPropertyDefinition propDef, JavaType type,
                                            TypeDeserializer typeDeser, Annotations contextAnnotations,
                                            AnnotatedMember member) {
            super(propDef, type, typeDeser, contextAnnotations);
            this._member = member;
        }

        public ConcreteSettableBeanProperty(PropertyName propName, JavaType type,
                                            PropertyMetadata metadata, JsonDeserializer<Object> valueDeser,
                                            AnnotatedMember member) {
            super(propName, type, metadata, valueDeser);
            this._member = member;
        }

        public ConcreteSettableBeanProperty(ConcreteSettableBeanProperty src) {
            super(src);
            this._member = src._member;
            this.lastSetValue = src.lastSetValue;
            this.lastInstance = src.lastInstance;
        }

        public ConcreteSettableBeanProperty(ConcreteSettableBeanProperty src, JsonDeserializer<?> deser,
                                            NullValueProvider nuller) {
            super(src, deser, nuller);
            this._member = src._member;
        }

        public ConcreteSettableBeanProperty(ConcreteSettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this._member = src._member;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            if (_valueDeserializer == deser) {
                return this;
            }
            return new ConcreteSettableBeanProperty(this, deser, _nullProvider);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new ConcreteSettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return new ConcreteSettableBeanProperty(this, _valueDeserializer, nva);
        }

        @Override
        public AnnotatedMember getMember() {
            return _member;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (_member != null) {
                return _member.getAnnotation(acls);
            }
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            Object val = deserialize(p, ctxt);
            set(instance, val);
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            Object val = deserialize(p, ctxt);
            return setAndReturn(instance, val);
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.lastInstance = instance;
            this.lastSetValue = value;
            if (instance instanceof SampleBean && value instanceof String) {
                ((SampleBean) instance).setField((String) value);
            }
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return "returned:" + value;
        }

        public void publicThrowAsIOE(JsonParser p, Exception e, Object val) throws IOException {
            _throwAsIOE(p, e, val);
        }

        public void publicThrowAsIOE(Exception e, Object val) throws IOException {
            _throwAsIOE(e, val);
        }

        public void publicThrowAsIOE(Exception e) throws IOException {
            _throwAsIOE(e);
        }

        public Class<?> publicGetDeclaringClass() {
            return getDeclaringClass();
        }
    }

    public static class ConcreteDelegating extends SettableBeanProperty.Delegating {
        private static final long serialVersionUID = 1L;

        public ConcreteDelegating(SettableBeanProperty d) {
            super(d);
        }

        @Override
        protected SettableBeanProperty withDelegate(SettableBeanProperty d) {
            return new ConcreteDelegating(d);
        }

        public Class<?> publicGetDeclaringClass() {
            return getDeclaringClass();
        }
    }

    private ObjectMapper _mapper;
    private JavaType _stringType;
    private AnnotatedMember _member;
    private Annotations _annotations;

    @Before
    public void setUp() throws Exception {
        _mapper = new ObjectMapper();
        _stringType = TypeFactory.defaultInstance().constructType(String.class);
        AnnotatedClass ac = AnnotatedClassResolver.resolveWithoutSuperTypes(
                _mapper.getDeserializationConfig(), SampleBean.class);
        _member = ac.findField("field");
        _annotations = new DummyAnnotations();
    }

    @Test
    public void testConstructorsAndGetters_normalInput_returnsExpectedValues() {
        PropertyName propName = new PropertyName("testProp");
        PropertyName wrapper = new PropertyName("wrapper");
        PropertyMetadata md = PropertyMetadata.STD_REQUIRED;

        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                propName, _stringType, wrapper, null, _annotations, md, _member);

        Assert.assertEquals("testProp", prop.getName());
        Assert.assertEquals(propName, prop.getFullName());
        Assert.assertEquals(_stringType, prop.getType());
        Assert.assertEquals(wrapper, prop.getWrapperName());
        Assert.assertNull(prop.getValueDeserializer());
        Assert.assertFalse(prop.hasValueDeserializer());
        Assert.assertNull(prop.getValueTypeDeserializer());
        Assert.assertFalse(prop.hasValueTypeDeserializer());
        Assert.assertEquals(_member, prop.getMember());
        Assert.assertEquals(SampleBean.class, prop.publicGetDeclaringClass());
        Assert.assertNull(prop.getManagedReferenceName());
        Assert.assertNull(prop.getObjectIdInfo());
        Assert.assertFalse(prop.hasViews());
        Assert.assertEquals(-1, prop.getPropertyIndex());
        Assert.assertNull(prop.getInjectableValueId());
        Assert.assertFalse(prop.isIgnorable());
        Assert.assertEquals("[property 'testProp']", prop.toString());
    }

    @Test
    public void testConstructor_nullPropName_usesNoName() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                null, _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        Assert.assertEquals("", prop.getName());
        Assert.assertEquals(PropertyName.NO_NAME, prop.getFullName());
    }

    @Test
    public void testConstructor_viaBeanPropertyDefinition() {
        BeanPropertyDefinition propDef = new BeanPropertyDefinition() {
            @Override
            public PropertyName getFullName() { return new PropertyName("fromDef"); }
            @Override
            public PropertyName getWrapperName() { return new PropertyName("wrapDef"); }
            @Override
            public PropertyMetadata getMetadata() { return PropertyMetadata.STD_OPTIONAL; }
            @Override
            public String getName() { return "fromDef"; }
            @Override
            public PropertyName getWrapper() { return getWrapperName(); }
            @Override
            public boolean isExplicitlyIncluded() { return true; }
            @Override
            public boolean hasGetter() { return false; }
            @Override
            public boolean hasSetter() { return false; }
            @Override
            public boolean hasField() { return false; }
            @Override
            public boolean hasConstructorParameter() { return false; }
            @Override
            public AnnotatedMethod getGetter() { return null; }
            @Override
            public AnnotatedMethod getSetter() { return null; }
            @Override
            public AnnotatedField getField() { return null; }
            @Override
            public AnnotatedParameter getConstructorParameter() { return null; }
            @Override
            public AnnotatedMember getAccessor() { return null; }
            @Override
            public AnnotatedMember getMutator() { return null; }
            @Override
            public AnnotatedMember getPrimaryMember() { return null; }
        };

        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                propDef, _stringType, null, _annotations, _member);
        Assert.assertEquals("fromDef", prop.getName());
        Assert.assertEquals(new PropertyName("wrapDef"), prop.getWrapperName());
    }

    @Test
    public void testConstructor_forObjectIdValueProperty_withDeser() {
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "custom";
            }
        };

        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("idProp"), _stringType, PropertyMetadata.STD_OPTIONAL, deser, _member);

        Assert.assertTrue(prop.hasValueDeserializer());
        Assert.assertSame(deser, prop.getValueDeserializer());
        Assert.assertSame(deser, prop.getNullValueProvider());
    }

    @Test
    public void testConstructor_forObjectIdValueProperty_nullName() {
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                null, _stringType, PropertyMetadata.STD_OPTIONAL, deser, _member);
        Assert.assertEquals("", prop.getName());
    }

    @Test
    public void testAssignIndex_validAndDuplicate_throwsException() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        Assert.assertEquals(-1, prop.getPropertyIndex());
        prop.assignIndex(3);
        Assert.assertEquals(3, prop.getPropertyIndex());

        try {
            prop.assignIndex(5);
            Assert.fail("Should have failed on reassigning index");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("already had index (3)"));
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testGetCreatorIndex_throwsIllegalStateException() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        prop.getCreatorIndex();
    }

    @Test
    public void testSetManagedReferenceNameAndObjectIdInfo() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        prop.setManagedReferenceName("refName");
        Assert.assertEquals("refName", prop.getManagedReferenceName());

        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("id"), Object.class, null, null);
        prop.setObjectIdInfo(info);
        Assert.assertSame(info, prop.getObjectIdInfo());
    }

    @Test
    public void testViews_nullAndNonNull() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        Assert.assertFalse(prop.hasViews());
        Assert.assertTrue(prop.visibleInView(String.class));

        prop.setViews(new Class<?>[]{String.class});
        Assert.assertTrue(prop.hasViews());
        Assert.assertTrue(prop.visibleInView(String.class));
        Assert.assertFalse(prop.visibleInView(Integer.class));

        prop.setViews(null);
        Assert.assertFalse(prop.hasViews());
        Assert.assertTrue(prop.visibleInView(Integer.class));
    }

    @Test
    public void testWithSimpleName() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("oldName"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);

        SettableBeanProperty same = prop.withSimpleName("oldName");
        Assert.assertSame(prop, same);

        SettableBeanProperty changed = prop.withSimpleName("newName");
        Assert.assertEquals("newName", changed.getName());
    }

    @Test
    public void testWithNullProvider() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        NullValueProvider nva = NullsConstantProvider.nuller();
        SettableBeanProperty updated = prop.withNullProvider(nva);
        Assert.assertSame(nva, updated.getNullValueProvider());
    }

    @Test
    public void testFixAccessAndMarkAsIgnorable() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        prop.fixAccess(_mapper.getDeserializationConfig());
        prop.markAsIgnorable();
        Assert.assertFalse(prop.isIgnorable());
    }

    @Test
    public void testAnnotations() {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        CustomAnnotation ca = prop.getAnnotation(CustomAnnotation.class);
        Assert.assertNotNull(ca);
        Assert.assertEquals("fieldAnno", ca.value());

        ContextAnnotation ctx = prop.getContextAnnotation(ContextAnnotation.class);
        Assert.assertNull(ctx);
    }

    @Test
    public void testDepositSchemaProperty_requiredAndOptional() throws Exception {
        final boolean[] visited = new boolean[2];
        JsonObjectFormatVisitor visitor = new JsonObjectFormatVisitor.Base() {
            @Override
            public void property(BeanProperty writer) {
                visited[0] = true;
            }

            @Override
            public void optionalProperty(BeanProperty writer) {
                visited[1] = true;
            }
        };

        ConcreteSettableBeanProperty reqProp = new ConcreteSettableBeanProperty(
                new PropertyName("req"), _stringType, null, null, _annotations, PropertyMetadata.STD_REQUIRED, _member);
        reqProp.depositSchemaProperty(visitor, null);
        Assert.assertTrue(visited[0]);
        Assert.assertFalse(visited[1]);

        visited[0] = false;
        ConcreteSettableBeanProperty optProp = new ConcreteSettableBeanProperty(
                new PropertyName("opt"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        optProp.depositSchemaProperty(visitor, null);
        Assert.assertFalse(visited[0]);
        Assert.assertTrue(visited[1]);
    }

    @Test
    public void testDeserialize_nullToken_returnsNullProviderValue() throws Exception {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);

        NullValueProvider nuller = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "defaultNull";
            }
        };
        prop = (ConcreteSettableBeanProperty) prop.withNullProvider(nuller);

        JsonParser p = new JsonFactory().createParser("null");
        p.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        Object res = prop.deserialize(p, ctxt);
        Assert.assertEquals("defaultNull", res);
    }

    @Test
    public void testDeserialize_normalAndCoercedNull() throws Exception {
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "value";
            }
        };
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        prop = (ConcreteSettableBeanProperty) prop.withValueDeserializer(deser);

        JsonParser p = new JsonFactory().createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        Object res = prop.deserialize(p, ctxt);
        Assert.assertEquals("value", res);

        JsonDeserializer<Object> nullReturningDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        NullValueProvider nuller = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "fallback";
            }
        };
        ConcreteSettableBeanProperty prop2 = (ConcreteSettableBeanProperty) prop
                .withValueDeserializer(nullReturningDeser)
                .withNullProvider(nuller);

        p = new JsonFactory().createParser("\"hello\"");
        p.nextToken();
        Object res2 = prop2.deserialize(p, ctxt);
        Assert.assertEquals("fallback", res2);
    }

    @Test
    public void testDeserializeWith_allBranches() throws Exception {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);

        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue) {
                return intoValue + ":updated";
            }
        };
        prop = (ConcreteSettableBeanProperty) prop.withValueDeserializer(deser);

        DeserializationContext ctxt = _mapper.getDeserializationContext();

        // 1. Token is NULL, skipper
        prop = (ConcreteSettableBeanProperty) prop.withNullProvider(NullsConstantProvider.skipper());
        JsonParser p = new JsonFactory().createParser("null");
        p.nextToken();
        Object r1 = prop.deserializeWith(p, ctxt, "orig");
        Assert.assertEquals("orig", r1);

        // 2. Token is NULL, not skipper
        NullValueProvider nuller = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "nullVal";
            }
        };
        prop = (ConcreteSettableBeanProperty) prop.withNullProvider(nuller);
        p = new JsonFactory().createParser("null");
        p.nextToken();
        Object r2 = prop.deserializeWith(p, ctxt, "orig");
        Assert.assertEquals("nullVal", r2);

        // 3. Normal update
        p = new JsonFactory().createParser("\"abc\"");
        p.nextToken();
        Object r3 = prop.deserializeWith(p, ctxt, "orig");
        Assert.assertEquals("orig:updated", r3);

        // 4. Deserializer returns null, skipper
        JsonDeserializer<Object> nullDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue) {
                return null;
            }
        };
        prop = (ConcreteSettableBeanProperty) prop.withValueDeserializer(nullDeser).withNullProvider(NullsConstantProvider.skipper());
        p = new JsonFactory().createParser("\"abc\"");
        p.nextToken();
        Object r4 = prop.deserializeWith(p, ctxt, "orig");
        Assert.assertEquals("orig", r4);

        // 5. Deserializer returns null, fallback null provider
        prop = (ConcreteSettableBeanProperty) prop.withNullProvider(nuller);
        p = new JsonFactory().createParser("\"abc\"");
        p.nextToken();
        Object r5 = prop.deserializeWith(p, ctxt, "orig");
        Assert.assertEquals("nullVal", r5);
    }

    @Test
    public void testDeserializeAndSet_andReturn() throws Exception {
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "deserValue";
            }
        };
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("p"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);
        prop = (ConcreteSettableBeanProperty) prop.withValueDeserializer(deser);

        SampleBean target = new SampleBean();
        JsonParser p = new JsonFactory().createParser("\"foo\"");
        p.nextToken();
        DeserializationContext ctxt = _mapper.getDeserializationContext();

        prop.deserializeAndSet(p, ctxt, target);
        Assert.assertEquals("deserValue", target.field);
        Assert.assertEquals("deserValue", prop.lastSetValue);

        p = new JsonFactory().createParser("\"foo\"");
        p.nextToken();
        Object ret = prop.deserializeSetAndReturn(p, ctxt, target);
        Assert.assertEquals("returned:deserValue", ret);
    }

    @Test
    public void testThrowAsIOE_variants() throws Exception {
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("propName"), _stringType, null, null, _annotations, PropertyMetadata.STD_OPTIONAL, _member);

        // 1. IllegalArgumentException with message
        try {
            prop.publicThrowAsIOE(null, new IllegalArgumentException("invalid value"), 123);
            Assert.fail();
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Problem deserializing property 'propName'"));
            Assert.assertTrue(e.getMessage().contains("invalid value"));
        }

        // 2. IllegalArgumentException without message
        try {
            prop.publicThrowAsIOE(new IllegalArgumentException(), "strValue");
            Assert.fail();
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("no error message provided"));
        }

        // 3. IOException is rethrown directly
        IOException ioe = new IOException("ioe error");
        try {
            prop.publicThrowAsIOE(ioe);
            Assert.fail();
        } catch (IOException e) {
            Assert.assertSame(ioe, e);
        }

        // 4. RuntimeException is rethrown directly
        RuntimeException rte = new RuntimeException("rte error");
        try {
            prop.publicThrowAsIOE(rte);
            Assert.fail();
        } catch (RuntimeException e) {
            Assert.assertSame(rte, e);
        }

        // 5. Checked Exception wrapped
        Exception checked = new Exception("checked error");
        try {
            prop.publicThrowAsIOE(checked);
            Assert.fail();
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("checked error"));
        }
    }

    @Test
    public void testDelegating_allMethodsForwarded() throws Exception {
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "delegatedVal";
            }
        };
        ConcreteSettableBeanProperty prop = new ConcreteSettableBeanProperty(
                new PropertyName("orig"), _stringType, new PropertyName("wrap"), null, _annotations, PropertyMetadata.STD_REQUIRED, _member);
        prop = (ConcreteSettableBeanProperty) prop.withValueDeserializer(deser);

        ConcreteDelegating delegating = new ConcreteDelegating(prop);

        Assert.assertSame(prop, delegating.getDelegate());
        Assert.assertEquals("orig", delegating.getName());
        Assert.assertEquals(new PropertyName("orig"), delegating.getFullName());
        Assert.assertEquals(_stringType, delegating.getType());
        Assert.assertEquals(new PropertyName("wrap"), delegating.getWrapperName());
        Assert.assertEquals(_member, delegating.getMember());
        Assert.assertEquals(SampleBean.class, delegating.publicGetDeclaringClass());
        Assert.assertNotNull(delegating.getAnnotation(CustomAnnotation.class));
        Assert.assertNull(delegating.getInjectableValueId());
        Assert.assertTrue(delegating.hasValueDeserializer());
        Assert.assertFalse(delegating.hasValueTypeDeserializer());
        Assert.assertSame(deser, delegating.getValueDeserializer());
        Assert.assertNull(delegating.getValueTypeDeserializer());
        Assert.assertNull(delegating.getManagedReferenceName());
        Assert.assertNull(delegating.getObjectIdInfo());
        Assert.assertFalse(delegating.hasViews());
        Assert.assertTrue(delegating.visibleInView(String.class));

        delegating.assignIndex(10);
        Assert.assertEquals(10, delegating.getPropertyIndex());

        try {
            delegating.getCreatorIndex();
            Assert.fail();
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("no creator index"));
        }

        delegating.fixAccess(_mapper.getDeserializationConfig());

        // Test withValueDeserializer
        SettableBeanProperty sameDeser = delegating.withValueDeserializer(deser);
        Assert.assertSame(delegating, sameDeser);

        JsonDeserializer<Object> deser2 = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "2";
            }
        };
        SettableBeanProperty diffDeser = delegating.withValueDeserializer(deser2);
        Assert.assertNotSame(delegating, diffDeser);
        Assert.assertSame(deser2, diffDeser.getValueDeserializer());

        // Test withName
        SettableBeanProperty sameName = delegating.withName(new PropertyName("orig"));
        Assert.assertEquals("orig", sameName.getName());

        SettableBeanProperty diffName = delegating.withName(new PropertyName("renamed"));
        Assert.assertEquals("renamed", diffName.getName());

        // Test withNullProvider
        NullValueProvider nva = NullsConstantProvider.nuller();
        SettableBeanProperty diffNuller = delegating.withNullProvider(nva);
        Assert.assertSame(nva, diffNuller.getNullValueProvider());

        // Test mutators
        SampleBean target = new SampleBean();
        delegating.set(target, "directSet");
        Assert.assertEquals("directSet", target.field);

        Object setRet = delegating.setAndReturn(target, "retSet");
        Assert.assertEquals("returned:retSet", setRet);
        Assert.assertEquals("retSet", target.field);

        JsonParser p = new JsonFactory().createParser("\"jsonSet\"");
        p.nextToken();
        delegating.deserializeAndSet(p, _mapper.getDeserializationContext(), target);
        Assert.assertEquals("delegatedVal", target.field);

        p = new JsonFactory().createParser("\"jsonSet2\"");
        p.nextToken();
        Object dret = delegating.deserializeSetAndReturn(p, _mapper.getDeserializationContext(), target);
        Assert.assertEquals("returned:delegatedVal", dret);
    }
}
