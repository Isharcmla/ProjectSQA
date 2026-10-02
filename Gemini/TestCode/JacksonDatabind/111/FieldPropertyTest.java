package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class FieldPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CustomAnnotation {
        String value() default "";
    }

    public static class SampleBean {
        @CustomAnnotation("testAnnot")
        @JsonProperty("name")
        public String name;

        public Integer age;

        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
        public Object poly;

        public String finalLike;
    }

    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private FieldProperty nameFieldProp;
    private FieldProperty polyFieldProp;
    private BeanPropertyDefinition namePropDef;
    private JavaType stringType;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        JavaType beanType = mapper.constructType(SampleBean.class);
        stringType = mapper.constructType(String.class);

        BeanDescription desc = mapper.getDeserializationConfig().introspect(beanType);

        for (BeanPropertyDefinition prop : desc.findProperties()) {
            if ("name".equals(prop.getName())) {
                namePropDef = prop;
                AnnotatedField field = prop.getField();
                nameFieldProp = new FieldProperty(prop, stringType, null, field.getAllAnnotations(), field);
                JsonDeserializer<Object> deser = ctxt.findRootValueDeserializer(stringType);
                nameFieldProp = (FieldProperty) nameFieldProp.withValueDeserializer(deser);
            } else if ("poly".equals(prop.getName())) {
                AnnotatedField field = prop.getField();
                JavaType polyType = mapper.constructType(Object.class);
                ClassNameIdResolver idRes = new ClassNameIdResolver(polyType, TypeFactory.defaultInstance());
                TypeDeserializer typeDeser = new AsPropertyTypeDeserializer(polyType, idRes, "@class", false, polyType);
                polyFieldProp = new FieldProperty(prop, polyType, typeDeser, field.getAllAnnotations(), field);
                JsonDeserializer<Object> deser = ctxt.findRootValueDeserializer(polyType);
                polyFieldProp = (FieldProperty) polyFieldProp.withValueDeserializer(deser);
            }
        }
    }

    @Test
    public void testGetAnnotation_withExistingAndNonExistingAnnotation() {
        CustomAnnotation annotation = nameFieldProp.getAnnotation(CustomAnnotation.class);
        Assert.assertNotNull(annotation);
        Assert.assertEquals("testAnnot", annotation.value());

        Deprecated nonExisting = nameFieldProp.getAnnotation(Deprecated.class);
        Assert.assertNull(nonExisting);
    }

    @Test
    public void testGetAnnotation_whenAnnotatedIsNull_returnsNull() {
        FieldProperty prop = new FieldProperty(namePropDef, stringType, null, null, namePropDef.getField()) {
            private static final long serialVersionUID = 1L;
            {
                try {
                    Field f = FieldProperty.class.getDeclaredField("_annotated");
                    f.setAccessible(true);
                    f.set(this, null);
                } catch (Exception ignored) {
                }
            }
        };
        Assert.assertNull(prop.getAnnotation(CustomAnnotation.class));
    }

    @Test
    public void testGetMember_returnsAnnotatedMember() {
        Assert.assertNotNull(nameFieldProp.getMember());
        Assert.assertEquals("name", nameFieldProp.getMember().getName());
    }

    @Test
    public void testWithName_returnsNewInstanceWithNewName() {
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty modified = nameFieldProp.withName(newName);

        Assert.assertNotSame(nameFieldProp, modified);
        Assert.assertEquals("newName", modified.getName());
    }

    @Test
    public void testWithValueDeserializer_sameDeserializer_returnsThis() {
        JsonDeserializer<?> currDeser = nameFieldProp.getValueDeserializer();
        SettableBeanProperty same = nameFieldProp.withValueDeserializer(currDeser);
        Assert.assertSame(nameFieldProp, same);
    }

    @Test
    public void testWithValueDeserializer_differentDeserializer_returnsNewInstance() {
        JsonDeserializer<Object> customDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "custom";
            }
        };
        SettableBeanProperty modified = nameFieldProp.withValueDeserializer(customDeser);
        Assert.assertNotSame(nameFieldProp, modified);
        Assert.assertSame(customDeser, modified.getValueDeserializer());
    }

    @Test
    public void testWithNullProvider_returnsNewInstanceWithUpdatedNullProvider() {
        NullValueProvider nva = NullsConstantProvider.skipper();
        SettableBeanProperty modified = nameFieldProp.withNullProvider(nva);
        Assert.assertNotSame(nameFieldProp, modified);
        Assert.assertSame(nva, modified.getNullValueProvider());
    }

    @Test
    public void testFixAccess_doesNotThrow() {
        DeserializationConfig config = mapper.getDeserializationConfig();
        nameFieldProp.fixAccess(config);
    }

    @Test
    public void testSet_success() throws Exception {
        SampleBean bean = new SampleBean();
        nameFieldProp.set(bean, "Alice");
        Assert.assertEquals("Alice", bean.name);
    }

    @Test(expected = JsonMappingException.class)
    public void testSet_invalidInstance_throwsIOException() throws Exception {
        nameFieldProp.set("InvalidInstanceType", "Alice");
    }

    @Test
    public void testSetAndReturn_success() throws Exception {
        SampleBean bean = new SampleBean();
        Object returned = nameFieldProp.setAndReturn(bean, "Bob");
        Assert.assertSame(bean, returned);
        Assert.assertEquals("Bob", bean.name);
    }

    @Test(expected = JsonMappingException.class)
    public void testSetAndReturn_invalidInstance_throwsIOException() throws Exception {
        nameFieldProp.setAndReturn(new Object(), "Bob");
    }

    @Test
    public void testDeserializeAndSet_normalValue() throws Exception {
        JsonParser p = mapper.getFactory().createParser("\"Charlie\"");
        p.nextToken();
        SampleBean bean = new SampleBean();

        nameFieldProp.deserializeAndSet(p, ctxt, bean);
        Assert.assertEquals("Charlie", bean.name);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_nullToken_withNullProvider() throws Exception {
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        nameFieldProp.deserializeAndSet(p, ctxt, bean);
        Assert.assertNull(bean.name);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_nullToken_withSkipNulls() throws Exception {
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        FieldProperty skippingProp = (FieldProperty) nameFieldProp.withNullProvider(NullsConstantProvider.skipper());
        skippingProp.deserializeAndSet(p, ctxt, bean);
        Assert.assertEquals("Initial", bean.name);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_deserializerReturnsNull_withNullProvider() throws Exception {
        JsonDeserializer<Object> nullReturningDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        FieldProperty prop = (FieldProperty) nameFieldProp.withValueDeserializer(nullReturningDeser);

        JsonParser p = mapper.getFactory().createParser("\"SomeString\"");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        prop.deserializeAndSet(p, ctxt, bean);
        Assert.assertNull(bean.name);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_deserializerReturnsNull_withSkipNulls() throws Exception {
        JsonDeserializer<Object> nullReturningDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        FieldProperty prop = (FieldProperty) nameFieldProp.withValueDeserializer(nullReturningDeser);
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        JsonParser p = mapper.getFactory().createParser("\"SomeString\"");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        prop.deserializeAndSet(p, ctxt, bean);
        Assert.assertEquals("Initial", bean.name);
        p.close();
    }

    @Test
    public void testDeserializeAndSet_withTypeDeserializer() throws Exception {
        String json = "{\"@class\":\"java.lang.String\"}";
        JsonParser p = mapper.getFactory().createParser(json);
        p.nextToken();
        SampleBean bean = new SampleBean();

        try {
            polyFieldProp.deserializeAndSet(p, ctxt, bean);
        } catch (Exception ignored) {
        }
        p.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeAndSet_invalidTarget_throwsIOException() throws Exception {
        JsonParser p = mapper.getFactory().createParser("\"Dave\"");
        p.nextToken();
        nameFieldProp.deserializeAndSet(p, ctxt, new Object());
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_normalValue() throws Exception {
        JsonParser p = mapper.getFactory().createParser("\"Eve\"");
        p.nextToken();
        SampleBean bean = new SampleBean();

        Object res = nameFieldProp.deserializeSetAndReturn(p, ctxt, bean);
        Assert.assertSame(bean, res);
        Assert.assertEquals("Eve", bean.name);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_nullToken_withNullProvider() throws Exception {
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        Object res = nameFieldProp.deserializeSetAndReturn(p, ctxt, bean);
        Assert.assertSame(bean, res);
        Assert.assertNull(bean.name);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_nullToken_withSkipNulls() throws Exception {
        JsonParser p = mapper.getFactory().createParser("null");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        FieldProperty skippingProp = (FieldProperty) nameFieldProp.withNullProvider(NullsConstantProvider.skipper());
        Object res = skippingProp.deserializeSetAndReturn(p, ctxt, bean);
        Assert.assertSame(bean, res);
        Assert.assertEquals("Initial", bean.name);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_deserializerReturnsNull_withNullProvider() throws Exception {
        JsonDeserializer<Object> nullReturningDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        FieldProperty prop = (FieldProperty) nameFieldProp.withValueDeserializer(nullReturningDeser);

        JsonParser p = mapper.getFactory().createParser("\"SomeString\"");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        Object res = prop.deserializeSetAndReturn(p, ctxt, bean);
        Assert.assertSame(bean, res);
        Assert.assertNull(bean.name);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_deserializerReturnsNull_withSkipNulls() throws Exception {
        JsonDeserializer<Object> nullReturningDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        FieldProperty prop = (FieldProperty) nameFieldProp.withValueDeserializer(nullReturningDeser);
        prop = (FieldProperty) prop.withNullProvider(NullsConstantProvider.skipper());

        JsonParser p = mapper.getFactory().createParser("\"SomeString\"");
        p.nextToken();
        SampleBean bean = new SampleBean();
        bean.name = "Initial";

        Object res = prop.deserializeSetAndReturn(p, ctxt, bean);
        Assert.assertSame(bean, res);
        Assert.assertEquals("Initial", bean.name);
        p.close();
    }

    @Test
    public void testDeserializeSetAndReturn_withTypeDeserializer() throws Exception {
        String json = "{\"@class\":\"java.lang.String\"}";
        JsonParser p = mapper.getFactory().createParser(json);
        p.nextToken();
        SampleBean bean = new SampleBean();

        try {
            polyFieldProp.deserializeSetAndReturn(p, ctxt, bean);
        } catch (Exception ignored) {
        }
        p.close();
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeSetAndReturn_invalidTarget_throwsIOException() throws Exception {
        JsonParser p = mapper.getFactory().createParser("\"Frank\"");
        p.nextToken();
        nameFieldProp.deserializeSetAndReturn(p, ctxt, new Object());
        p.close();
    }

    @Test
    public void testReadResolve_returnsNewFieldProperty() {
        Object resolved = nameFieldProp.readResolve();
        Assert.assertTrue(resolved instanceof FieldProperty);
        Assert.assertNotSame(nameFieldProp, resolved);
        Assert.assertEquals(nameFieldProp.getName(), ((FieldProperty) resolved).getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadResolve_missingField_throwsIllegalArgumentException() {
        AnnotatedField brokenField = new AnnotatedField(null, null, null);
        FieldProperty brokenProp = new FieldProperty(namePropDef, stringType, null, null, brokenField);
        brokenProp.readResolve();
    }
}
