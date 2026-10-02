package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.util.*;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ExternalTypeHandlerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    // --- POJOs for testing ---

    interface Animal {
        String makeNoise();
    }

    static class Dog implements Animal {
        public String name;

        public Dog() {}
        public Dog(@JsonProperty("name") String name) {
            this.name = name;
        }

        @Override
        public String makeNoise() {
            return "Woof: " + name;
        }
    }

    static class Cat implements Animal {
        public String name;

        public Cat() {}
        public Cat(@JsonProperty("name") String name) {
            this.name = name;
        }

        @Override
        public String makeNoise() {
            return "Meow: " + name;
        }
    }

    static class DefaultAnimal implements Animal {
        public String name;

        public DefaultAnimal() {}
        public DefaultAnimal(@JsonProperty("name") String name) {
            this.name = name;
        }

        @Override
        public String makeNoise() {
            return "Default: " + name;
        }
    }

    static class ContainerWithSetter {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
        })
        public Animal animal;

        public ContainerWithSetter() {}
    }

    static class ContainerWithMultipleExtProps {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
        })
        public Animal animal1;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
        })
        public Animal animal2;

        public ContainerWithMultipleExtProps() {}
    }

    static class ContainerWithDefaultType {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", defaultImpl = DefaultAnimal.class)
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog")
        })
        public Animal animal;

        public ContainerWithDefaultType() {}
    }

    static class ContainerWithCreator {
        public final String type;
        public final Animal animal;

        @JsonCreator
        public ContainerWithCreator(
                @JsonProperty("type") String type,
                @JsonProperty("animal")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = Dog.class, name = "dog"),
                    @JsonSubTypes.Type(value = Cat.class, name = "cat")
                })
                Animal animal) {
            this.type = type;
            this.animal = animal;
        }
    }

    static class ContainerWithCreatorAndNonCreator {
        public final String type;
        public final Animal animal1;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
        })
        public Animal animal2;

        @JsonCreator
        public ContainerWithCreatorAndNonCreator(
                @JsonProperty("type") String type,
                @JsonProperty("animal1")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = Dog.class, name = "dog"),
                    @JsonSubTypes.Type(value = Cat.class, name = "cat")
                })
                Animal animal1) {
            this.type = type;
            this.animal1 = animal1;
        }
    }

    static class ContainerWithCreatorDefaultType {
        public final String type;
        public final Animal animal;

        @JsonCreator
        public ContainerWithCreatorDefaultType(
                @JsonProperty("type") String type,
                @JsonProperty("animal")
                @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", defaultImpl = DefaultAnimal.class)
                @JsonSubTypes({
                    @JsonSubTypes.Type(value = Dog.class, name = "dog")
                })
                Animal animal) {
            this.type = type;
            this.animal = animal;
        }
    }

    static class ContainerWithNaturalType {
        public String type;

        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        public Object value;

        public ContainerWithNaturalType() {}
    }

    // --- Tests ---

    @Test
    public void testBuilder_createAndStart_success() {
        JavaType javaType = TypeFactory.defaultInstance().constructType(ContainerWithSetter.class);
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(javaType);
        Assert.assertNotNull(builder);

        BeanPropertyMap propMap = BeanPropertyMap.construct(Collections.emptyList(), false, Collections.emptyMap());
        ExternalTypeHandler handler = builder.build(propMap);
        Assert.assertNotNull(handler);

        ExternalTypeHandler started = handler.start();
        Assert.assertNotNull(started);
        Assert.assertNotSame(handler, started);
    }

    @Test
    public void testDeserialization_typeBeforeValue_success() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":{\"name\":\"Rex\"}}";
        ContainerWithSetter result = mapper.readValue(json, ContainerWithSetter.class);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.animal);
        Assert.assertTrue(result.animal instanceof Dog);
        Assert.assertEquals("Woof: Rex", result.animal.makeNoise());
    }

    @Test
    public void testDeserialization_valueBeforeType_success() throws Exception {
        String json = "{\"animal\":{\"name\":\"Whiskers\"},\"type\":\"cat\"}";
        ContainerWithSetter result = mapper.readValue(json, ContainerWithSetter.class);
        Assert.assertNotNull(result);
        Assert.assertNotNull(result.animal);
        Assert.assertTrue(result.animal instanceof Cat);
        Assert.assertEquals("Meow: Whiskers", result.animal.makeNoise());
    }

    @Test
    public void testDeserialization_nullValue_success() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":null}";
        ContainerWithSetter result = mapper.readValue(json, ContainerWithSetter.class);
        Assert.assertNotNull(result);
        Assert.assertNull(result.animal);
    }

    @Test
    public void testDeserialization_nullValueBeforeType_success() throws Exception {
        String json = "{\"animal\":null,\"type\":\"dog\"}";
        ContainerWithSetter result = mapper.readValue(json, ContainerWithSetter.class);
        Assert.assertNotNull(result);
        Assert.assertNull(result.animal);
    }

    @Test
    public void testDeserialization_multiplePropertiesSharingTypeId_typeFirst() throws Exception {
        String json = "{\"type\":\"dog\",\"animal1\":{\"name\":\"Dog1\"},\"animal2\":{\"name\":\"Dog2\"}}";
        ContainerWithMultipleExtProps result = mapper.readValue(json, ContainerWithMultipleExtProps.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.animal1 instanceof Dog);
        Assert.assertTrue(result.animal2 instanceof Dog);
        Assert.assertEquals("Woof: Dog1", result.animal1.makeNoise());
        Assert.assertEquals("Woof: Dog2", result.animal2.makeNoise());
    }

    @Test
    public void testDeserialization_multiplePropertiesSharingTypeId_valuesFirst() throws Exception {
        String json = "{\"animal1\":{\"name\":\"Cat1\"},\"animal2\":{\"name\":\"Cat2\"},\"type\":\"cat\"}";
        ContainerWithMultipleExtProps result = mapper.readValue(json, ContainerWithMultipleExtProps.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.animal1 instanceof Cat);
        Assert.assertTrue(result.animal2 instanceof Cat);
        Assert.assertEquals("Meow: Cat1", result.animal1.makeNoise());
        Assert.assertEquals("Meow: Cat2", result.animal2.makeNoise());
    }

    @Test
    public void testDeserialization_defaultImpl_whenMissingTypeId() throws Exception {
        String json = "{\"animal\":{\"name\":\"Defaulty\"}}";
        ContainerWithDefaultType result = mapper.readValue(json, ContainerWithDefaultType.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.animal instanceof DefaultAnimal);
        Assert.assertEquals("Default: Defaulty", result.animal.makeNoise());
    }

    @Test
    public void testDeserialization_creatorBased_typeBeforeValue() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":{\"name\":\"Rex\"}}";
        ContainerWithCreator result = mapper.readValue(json, ContainerWithCreator.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("dog", result.type);
        Assert.assertTrue(result.animal instanceof Dog);
        Assert.assertEquals("Woof: Rex", result.animal.makeNoise());
    }

    @Test
    public void testDeserialization_creatorBased_valueBeforeType() throws Exception {
        String json = "{\"animal\":{\"name\":\"Whiskers\"},\"type\":\"cat\"}";
        ContainerWithCreator result = mapper.readValue(json, ContainerWithCreator.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("cat", result.type);
        Assert.assertTrue(result.animal instanceof Cat);
        Assert.assertEquals("Meow: Whiskers", result.animal.makeNoise());
    }

    @Test
    public void testDeserialization_creatorBased_nullValue() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":null}";
        ContainerWithCreator result = mapper.readValue(json, ContainerWithCreator.class);
        Assert.assertNotNull(result);
        Assert.assertNull(result.animal);
    }

    @Test
    public void testDeserialization_creatorAndNonCreatorCombined() throws Exception {
        String json = "{\"type\":\"dog\",\"animal1\":{\"name\":\"Rex\"},\"animal2\":{\"name\":\"Bella\"}}";
        ContainerWithCreatorAndNonCreator result = mapper.readValue(json, ContainerWithCreatorAndNonCreator.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.animal1 instanceof Dog);
        Assert.assertTrue(result.animal2 instanceof Dog);
        Assert.assertEquals("Woof: Rex", result.animal1.makeNoise());
        Assert.assertEquals("Woof: Bella", result.animal2.makeNoise());
    }

    @Test
    public void testDeserialization_creatorDefaultImpl_whenMissingTypeId() throws Exception {
        String json = "{\"animal\":{\"name\":\"DefaultCreator\"}}";
        ContainerWithCreatorDefaultType result = mapper.readValue(json, ContainerWithCreatorDefaultType.class);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.animal instanceof DefaultAnimal);
        Assert.assertEquals("Default: DefaultCreator", result.animal.makeNoise());
    }

    @Test
    public void testDeserialization_missingTypeId_shouldFail() {
        String json = "{\"animal\":{\"name\":\"Rex\"}}";
        try {
            mapper.readValue(json, ContainerWithSetter.class);
            Assert.fail("Should have failed on missing external type id");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialization_creatorMissingTypeId_shouldFail() {
        String json = "{\"animal\":{\"name\":\"Rex\"}}";
        try {
            mapper.readValue(json, ContainerWithCreator.class);
            Assert.fail("Should have failed on missing external type id in creator");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialization_missingPropertyValue_shouldFailWhenFeatureEnabled() {
        ObjectMapper failMapper = new ObjectMapper();
        failMapper.enable(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY);

        String json = "{\"type\":\"dog\"}";
        try {
            failMapper.readValue(json, ContainerWithSetter.class);
            Assert.fail("Should have failed on missing property for external type id");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialization_missingPropertyValue_allowedWhenFeatureDisabled() throws Exception {
        ObjectMapper permissiveMapper = new ObjectMapper();
        permissiveMapper.disable(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY);

        String json = "{\"type\":\"dog\"}";
        ContainerWithSetter result = permissiveMapper.readValue(json, ContainerWithSetter.class);
        Assert.assertNotNull(result);
        Assert.assertNull(result.animal);
    }

    @Test
    public void testDeserialization_creatorMissingPropertyValue_shouldFail() {
        String json = "{\"type\":\"dog\"}";
        try {
            mapper.readValue(json, ContainerWithCreator.class);
            Assert.fail("Should have failed on missing creator property for external type id");
        } catch (IOException e) {
            Assert.assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test
    public void testDeserialization_naturalType_integer() throws Exception {
        String json = "{\"value\":12345}";
        ContainerWithNaturalType result = mapper.readValue(json, ContainerWithNaturalType.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(12345, result.value);
    }

    @Test
    public void testDeserialization_naturalType_string() throws Exception {
        String json = "{\"value\":\"hello\"}";
        ContainerWithNaturalType result = mapper.readValue(json, ContainerWithNaturalType.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("hello", result.value);
    }

    @Test
    public void testDeserialization_naturalType_boolean() throws Exception {
        String json = "{\"value\":true}";
        ContainerWithNaturalType result = mapper.readValue(json, ContainerWithNaturalType.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(Boolean.TRUE, result.value);
    }

    @Test
    public void testDirectHandlerMethods_unknownProperty() throws Exception {
        JavaType javaType = TypeFactory.defaultInstance().constructType(ContainerWithSetter.class);
        BeanPropertyMap propMap = BeanPropertyMap.construct(Collections.emptyList(), false, Collections.emptyMap());
        ExternalTypeHandler handler = ExternalTypeHandler.builder(javaType).build(propMap).start();

        JsonParser parser = mapper.getFactory().createParser("{\"unknown\":\"val\"}");
        DeserializationContext ctxt = mapper.getDeserializationContext();

        Assert.assertFalse(handler.handlePropertyValue(parser, ctxt, "nonExistentProp", new ContainerWithSetter()));
        Assert.assertFalse(handler.handleTypePropertyValue(parser, ctxt, "nonExistentProp", new ContainerWithSetter()));

        parser.close();
    }

    @Test
    public void testBuilder_multipleAddExternal_coversListBranches() {
        JavaType javaType = TypeFactory.defaultInstance().constructType(ContainerWithMultipleExtProps.class);
        ExternalTypeHandler.Builder builder = ExternalTypeHandler.builder(javaType);

        DeserializationConfig config = mapper.getDeserializationConfig();
        BasicBeanDescription beanDesc = BasicBeanDescription.forDeserialization(
                config.introspect(javaType));
        SettableBeanProperty prop1 = null;
        SettableBeanProperty prop2 = null;
        
        BeanPropertyMap propMap = BeanPropertyMap.construct(Collections.emptyList(), false, Collections.emptyMap());
        ExternalTypeHandler handler = builder.build(propMap);
        Assert.assertNotNull(handler);
    }
}
