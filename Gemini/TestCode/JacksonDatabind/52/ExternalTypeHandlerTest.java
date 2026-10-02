package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Test;

public class ExternalTypeHandlerTest {

    private final ObjectMapper mapper = new ObjectMapper();

    // =========================================================================
    // Domain Classes for Tests
    // =========================================================================

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
    })
    interface Animal {}

    @JsonTypeName("dog")
    static class Dog implements Animal {
        public String name;
    }

    @JsonTypeName("cat")
    static class Cat implements Animal {
        public int lives;
    }

    static class AnimalHouse {
        public String type;
        public Animal animal;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type", defaultImpl = DefaultAnimal.class)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog")
    })
    interface AnimalWithDefault {}

    static class DefaultAnimal implements AnimalWithDefault {
        public String note;
    }

    static class HouseWithDefault {
        public String type;
        public AnimalWithDefault animal;
    }

    static class CreatorHouseBoth {
        public final String type;
        public final Animal animal;

        @JsonCreator
        public CreatorHouseBoth(@JsonProperty("animal") Animal animal, @JsonProperty("type") String type) {
            this.animal = animal;
            this.type = type;
        }
    }

    static class CreatorHouseValueOnly {
        public final Animal animal;
        public String type;
        public String extra;

        @JsonCreator
        public CreatorHouseValueOnly(@JsonProperty("animal") Animal animal) {
            this.animal = animal;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setExtra(String extra) {
            this.extra = extra;
        }
    }

    static class CreatorHouseWithDefault {
        public final AnimalWithDefault animal;
        public final String type;

        @JsonCreator
        public CreatorHouseWithDefault(@JsonProperty("animal") AnimalWithDefault animal,
                                       @JsonProperty("type") String type) {
            this.animal = animal;
            this.type = type;
        }
    }

    static class NaturalHouse {
        public String type;
        @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
        public Object natural;
    }

    // =========================================================================
    // Test Cases
    // =========================================================================

    @Test
    public void testComplete_typeFirst_success() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":{\"name\":\"Fido\"}}";
        AnimalHouse house = mapper.readValue(json, AnimalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertEquals("dog", house.type);
        Assert.assertTrue(house.animal instanceof Dog);
        Assert.assertEquals("Fido", ((Dog) house.animal).name);
    }

    @Test
    public void testComplete_valueFirst_success() throws Exception {
        String json = "{\"animal\":{\"lives\":9},\"type\":\"cat\"}";
        AnimalHouse house = mapper.readValue(json, AnimalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertEquals("cat", house.type);
        Assert.assertTrue(house.animal instanceof Cat);
        Assert.assertEquals(9, ((Cat) house.animal).lives);
    }

    @Test
    public void testComplete_nullValue_success() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":null}";
        AnimalHouse house = mapper.readValue(json, AnimalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertEquals("dog", house.type);
        Assert.assertNull(house.animal);
    }

    @Test
    public void testComplete_bothNull_success() throws Exception {
        String json = "{}";
        AnimalHouse house = mapper.readValue(json, AnimalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertNull(house.type);
        Assert.assertNull(house.animal);
    }

    @Test
    public void testComplete_missingTypeWithoutDefault_throwsException() throws Exception {
        String json = "{\"animal\":{\"name\":\"Rex\"}}";
        try {
            mapper.readValue(json, AnimalHouse.class);
            Assert.fail("Expected JsonMappingException for missing type id");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Missing external type id property 'type'"));
        }
    }

    @Test
    public void testComplete_missingValueWithTypeId_throwsException() throws Exception {
        String json = "{\"type\":\"dog\"}";
        try {
            mapper.readValue(json, AnimalHouse.class);
            Assert.fail("Expected JsonMappingException for missing property value");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Missing property 'animal' for external type id 'type'"));
        }
    }

    @Test
    public void testComplete_defaultTypeFallback_success() throws Exception {
        String json = "{\"animal\":{\"note\":\"Unknown Creature\"}}";
        HouseWithDefault house = mapper.readValue(json, HouseWithDefault.class);

        Assert.assertNotNull(house);
        Assert.assertNull(house.type);
        Assert.assertTrue(house.animal instanceof DefaultAnimal);
        Assert.assertEquals("Unknown Creature", ((DefaultAnimal) house.animal).note);
    }

    @Test
    public void testComplete_creatorBothTypeAndValue_success() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":{\"name\":\"Buddy\"}}";
        CreatorHouseBoth house = mapper.readValue(json, CreatorHouseBoth.class);

        Assert.assertNotNull(house);
        Assert.assertEquals("dog", house.type);
        Assert.assertTrue(house.animal instanceof Dog);
        Assert.assertEquals("Buddy", ((Dog) house.animal).name);
    }

    @Test
    public void testComplete_creatorValueFirst_success() throws Exception {
        String json = "{\"animal\":{\"name\":\"Buddy\"},\"type\":\"dog\"}";
        CreatorHouseBoth house = mapper.readValue(json, CreatorHouseBoth.class);

        Assert.assertNotNull(house);
        Assert.assertEquals("dog", house.type);
        Assert.assertTrue(house.animal instanceof Dog);
        Assert.assertEquals("Buddy", ((Dog) house.animal).name);
    }

    @Test
    public void testComplete_creatorNullValue_success() throws Exception {
        String json = "{\"type\":\"dog\",\"animal\":null}";
        CreatorHouseBoth house = mapper.readValue(json, CreatorHouseBoth.class);

        Assert.assertNotNull(house);
        Assert.assertNull(house.animal);
        Assert.assertEquals("dog", house.type);
    }

    @Test
    public void testComplete_creatorMissingBoth_success() throws Exception {
        String json = "{}";
        CreatorHouseBoth house = mapper.readValue(json, CreatorHouseBoth.class);

        Assert.assertNotNull(house);
        Assert.assertNull(house.type);
        Assert.assertNull(house.animal);
    }

    @Test
    public void testComplete_creatorMissingTypeWithoutDefault_throwsException() throws Exception {
        String json = "{\"animal\":{\"name\":\"Max\"}}";
        try {
            mapper.readValue(json, CreatorHouseBoth.class);
            Assert.fail("Expected JsonMappingException for missing external type in creator");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Missing external type id property 'type'"));
        }
    }

    @Test
    public void testComplete_creatorMissingValueWithTypeId_throwsException() throws Exception {
        String json = "{\"type\":\"dog\"}";
        try {
            mapper.readValue(json, CreatorHouseBoth.class);
            Assert.fail("Expected JsonMappingException for missing property value in creator");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Missing property 'animal' for external type id 'type'"));
        }
    }

    @Test
    public void testComplete_creatorValueOnlyAndNonCreatorProperties_success() throws Exception {
        String json = "{\"animal\":{\"lives\":7},\"type\":\"cat\",\"extra\":\"VIP\"}";
        CreatorHouseValueOnly house = mapper.readValue(json, CreatorHouseValueOnly.class);

        Assert.assertNotNull(house);
        Assert.assertTrue(house.animal instanceof Cat);
        Assert.assertEquals(7, ((Cat) house.animal).lives);
        Assert.assertEquals("cat", house.type);
        Assert.assertEquals("VIP", house.extra);
    }

    @Test
    public void testComplete_creatorDefaultTypeFallback_success() throws Exception {
        String json = "{\"animal\":{\"note\":\"Feral\"}}";
        CreatorHouseWithDefault house = mapper.readValue(json, CreatorHouseWithDefault.class);

        Assert.assertNotNull(house);
        Assert.assertNull(house.type);
        Assert.assertTrue(house.animal instanceof DefaultAnimal);
        Assert.assertEquals("Feral", ((DefaultAnimal) house.animal).note);
    }

    @Test
    public void testComplete_naturalTypeString_success() throws Exception {
        String json = "{\"natural\":\"Hello String\"}";
        NaturalHouse house = mapper.readValue(json, NaturalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertEquals("Hello String", house.natural);
    }

    @Test
    public void testComplete_naturalTypeInteger_success() throws Exception {
        String json = "{\"natural\":12345}";
        NaturalHouse house = mapper.readValue(json, NaturalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertEquals(12345, house.natural);
    }

    @Test
    public void testComplete_naturalTypeBoolean_success() throws Exception {
        String json = "{\"natural\":true}";
        NaturalHouse house = mapper.readValue(json, NaturalHouse.class);

        Assert.assertNotNull(house);
        Assert.assertEquals(Boolean.TRUE, house.natural);
    }

    @Test
    public void testBuilder_buildAndStart_emptyHandler() {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build();
        Assert.assertNotNull(handler);

        ExternalTypeHandler started = handler.start();
        Assert.assertNotNull(started);
        Assert.assertNotSame(handler, started);
    }

    @Test
    public void testHandlePropertyValue_unknownProperty_returnsFalse() throws IOException {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build().start();

        JsonParser parser = mapper.getFactory().createParser("{\"unknown\":\"value\"}");
        parser.nextToken(); // START_OBJECT
        parser.nextToken(); // FIELD_NAME
        parser.nextToken(); // VALUE_STRING

        DeserializationContext ctxt = mapper.getDeserializationContext();
        boolean handled = handler.handlePropertyValue(parser, ctxt, "unknown", new Object());
        Assert.assertFalse(handled);
        parser.close();
    }

    @Test
    public void testHandleTypePropertyValue_unknownProperty_returnsFalse() throws IOException {
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        ExternalTypeHandler handler = builder.build().start();

        JsonParser parser = mapper.getFactory().createParser("{\"unknown\":\"value\"}");
        parser.nextToken();
        parser.nextToken();
        parser.nextToken();

        DeserializationContext ctxt = mapper.getDeserializationContext();
        boolean handled = handler.handleTypePropertyValue(parser, ctxt, "unknown", new Object());
        Assert.assertFalse(handled);
        parser.close();
    }

    @Test
    public void testHandleTypePropertyValue_propertyIsNotTypeProperty_returnsFalse() throws Exception {
        JavaType baseType = TypeFactory.defaultInstance().constructType(Animal.class);
        ClassNameIdResolver idRes = new ClassNameIdResolver(baseType, TypeFactory.defaultInstance());
        TypeDeserializer typeDeser = new AsExternalTypeDeserializer(baseType, idRes, "type", false, null);

        JavaType houseType = TypeFactory.defaultInstance().constructType(AnimalHouse.class);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        SettableBeanProperty prop = mapper.getDeserializationConfig()
                .introspect(houseType)
                .findProperties()
                .get(0)
                .getConstructorParameter();

        // Use custom builder to register property
        ExternalTypeHandler.Builder builder = new ExternalTypeHandler.Builder();
        if (prop != null) {
            builder.addExternal(prop, typeDeser);
            ExternalTypeHandler handler = builder.build().start();

            JsonParser parser = mapper.getFactory().createParser("\"someVal\"");
            parser.nextToken();

            // Calling with prop name instead of type prop name should return false
            boolean handled = handler.handleTypePropertyValue(parser, ctxt, prop.getName(), new Object());
            Assert.assertFalse(handled);
            parser.close();
        }
    }
}
