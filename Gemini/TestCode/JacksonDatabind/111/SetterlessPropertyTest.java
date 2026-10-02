package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetterlessPropertyTest {

    public static class SampleBean {
        private final List<String> items = new ArrayList<>();

        @JsonProperty("items")
        public List<String> getItems() {
            return items;
        }
    }

    public static class NullGetterBean {
        @JsonProperty("items")
        public List<String> getItems() {
            return null;
        }
    }

    public static class ExceptionGetterBean {
        @JsonProperty("items")
        public List<String> getItems() {
            throw new IllegalStateException("Simulated getter failure");
        }
    }

    private SetterlessProperty createSetterlessProperty(Class<?> beanClass, String propName, TypeDeserializer typeDeser) {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        JavaType beanType = mapper.constructType(beanClass);
        BeanDescription beanDesc = config.introspect(beanType);

        BeanPropertyDefinition targetDef = null;
        for (BeanPropertyDefinition def : beanDesc.findProperties()) {
            if (propName.equals(def.getName())) {
                targetDef = def;
                break;
            }
        }
        Assert.assertNotNull("Property definition should not be null", targetDef);

        AnnotatedMethod getter = (AnnotatedMethod) targetDef.getGetter();
        JavaType propType = getter.getType();
        return new SetterlessProperty(targetDef, propType, typeDeser, null, getter);
    }

    @Test
    public void testWithName_changesPropertyName() {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        PropertyName newName = new PropertyName("renamedItems");
        SettableBeanProperty renamedProp = prop.withName(newName);

        Assert.assertNotNull(renamedProp);
        Assert.assertEquals("renamedItems", renamedProp.getName());
        Assert.assertEquals(prop.getMember(), renamedProp.getMember());
    }

    @Test
    public void testWithValueDeserializer_sameDeserializer_returnsSameInstance() {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        JsonDeserializer<?> deser = NullifyingDeserializer.instance;
        SettableBeanProperty propWithDeser = prop.withValueDeserializer(deser);

        SettableBeanProperty sameProp = propWithDeser.withValueDeserializer(deser);
        Assert.assertSame(propWithDeser, sameProp);
    }

    @Test
    public void testWithValueDeserializer_differentDeserializer_returnsNewInstance() {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        JsonDeserializer<?> deser1 = NullifyingDeserializer.instance;
        JsonDeserializer<?> deser2 = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };

        SettableBeanProperty prop1 = prop.withValueDeserializer(deser1);
        SettableBeanProperty prop2 = prop1.withValueDeserializer(deser2);

        Assert.assertNotSame(prop1, prop2);
        Assert.assertSame(deser2, prop2.getValueDeserializer());
    }

    @Test
    public void testWithNullProvider_returnsNewInstanceWithProvider() {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return null;
            }
        };

        SettableBeanProperty propWithNva = prop.withNullProvider(nva);
        Assert.assertNotNull(propWithNva);
        Assert.assertSame(nva, propWithNva.getNullValueProvider());
    }

    @Test
    public void testFixAccess_doesNotThrow() {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS, true);
        prop.fixAccess(mapper.getDeserializationConfig());

        mapper.configure(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS, false);
        prop.fixAccess(mapper.getDeserializationConfig());
    }

    @Test
    public void testGetAnnotation_and_getMember() {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);

        JsonProperty jsonPropAnnotation = prop.getAnnotation(JsonProperty.class);
        Assert.assertNotNull(jsonPropAnnotation);
        Assert.assertEquals("items", jsonPropAnnotation.value());

        Assert.assertNull(prop.getAnnotation(Deprecated.class));
        Assert.assertNotNull(prop.getMember());
        Assert.assertTrue(prop.getMember() instanceof AnnotatedMethod);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSet_throwsUnsupportedOperationException() throws IOException {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        SampleBean bean = new SampleBean();
        prop.set(bean, new ArrayList<String>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetAndReturn_throwsUnsupportedOperationException() throws IOException {
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        SampleBean bean = new SampleBean();
        prop.setAndReturn(bean, new ArrayList<String>());
    }

    @Test
    public void testDeserializeAndSet_whenTokenIsNull_doesNothing() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);

        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken(); // position on VALUE_NULL

        DeserializationContext ctxt = mapper.getDeserializationContext();
        SampleBean bean = new SampleBean();
        prop.deserializeAndSet(parser, ctxt, bean);

        Assert.assertTrue(bean.getItems().isEmpty());
    }

    @Test
    public void testDeserializeAndSet_withTypeDeserializer_reportsBadDefinition() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType propType = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        TypeDeserializer typeDeser = new AsPropertyTypeDeserializer(propType, null, "@type", false, propType);

        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", typeDeser);

        JsonParser parser = mapper.getFactory().createParser("[\"test\"]");
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        SampleBean bean = new SampleBean();

        try {
            prop.deserializeAndSet(parser, ctxt, bean);
            Assert.fail("Expected JsonMappingException when setterless property has type deserializer");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("no way to handle typed deser with setterless yet"));
        }
    }

    @Test
    public void testDeserializeAndSet_whenGetterThrows_throwsIOE() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createSetterlessProperty(ExceptionGetterBean.class, "items", null);
        prop = (SetterlessProperty) prop.withValueDeserializer(mapper.findRootValueDeserializer(prop.getType()));

        JsonParser parser = mapper.getFactory().createParser("[\"value\"]");
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        ExceptionGetterBean bean = new ExceptionGetterBean();

        try {
            prop.deserializeAndSet(parser, ctxt, bean);
            Assert.fail("Expected IOException due to getter exception");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getCause() instanceof IllegalStateException);
            Assert.assertEquals("Simulated getter failure", e.getCause().getMessage());
        }
    }

    @Test
    public void testDeserializeAndSet_whenGetterReturnsNull_reportsBadDefinition() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createSetterlessProperty(NullGetterBean.class, "items", null);
        prop = (SetterlessProperty) prop.withValueDeserializer(mapper.findRootValueDeserializer(prop.getType()));

        JsonParser parser = mapper.getFactory().createParser("[\"value\"]");
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        NullGetterBean bean = new NullGetterBean();

        try {
            prop.deserializeAndSet(parser, ctxt, bean);
            Assert.fail("Expected JsonMappingException when getter returns null");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("get method returned null"));
        }
    }

    @Test
    public void testDeserializeSetAndReturn_success() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"items\":[\"a\",\"b\"]}";
        SampleBean result = mapper.readValue(json, SampleBean.class);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getItems().size());
        Assert.assertEquals("a", result.getItems().get(0));
        Assert.assertEquals("b", result.getItems().get(1));
    }

    @Test
    public void testDeserializeSetAndReturn_directCall() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createSetterlessProperty(SampleBean.class, "items", null);
        JavaType listType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> deser = mapper.findRootValueDeserializer(listType);
        prop = (SetterlessProperty) prop.withValueDeserializer(deser);

        JsonParser parser = mapper.getFactory().createParser("[\"x\",\"y\"]");
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        SampleBean bean = new SampleBean();
        Object returnedInstance = prop.deserializeSetAndReturn(parser, ctxt, bean);

        Assert.assertSame(bean, returnedInstance);
        Assert.assertEquals(2, bean.getItems().size());
        Assert.assertEquals("x", bean.getItems().get(0));
        Assert.assertEquals("y", bean.getItems().get(1));
    }

    public static class MapBean {
        private final Map<String, Integer> map = new HashMap<>();

        @JsonProperty("map")
        public Map<String, Integer> getMap() {
            return map;
        }
    }

    @Test
    public void testDeserializeAndSet_mapSuccess() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"map\":{\"one\":1,\"two\":2}}";
        MapBean result = mapper.readValue(json, MapBean.class);

        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getMap().size());
        Assert.assertEquals(Integer.valueOf(1), result.getMap().get("one"));
        Assert.assertEquals(Integer.valueOf(2), result.getMap().get("two"));
    }
}
