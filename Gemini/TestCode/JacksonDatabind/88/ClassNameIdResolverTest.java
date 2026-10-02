package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;

public class ClassNameIdResolverTest {

    private TypeFactory typeFactory;
    private JavaType objectType;
    private ObjectMapper mapper;

    public enum SimpleEnum {
        ONE,
        TWO
    }

    public enum SpecializedEnum {
        STANDARD,
        CUSTOM {
            @Override
            public String toString() {
                return "custom";
            }
        }
    }

    public static class StaticNestedClass {
    }

    public class NonStaticInnerClass {
    }

    public class NestedContainer {
        public class NonStaticDeepInnerClass {
        }
    }

    private static class SimpleDatabindContext extends DatabindContext {
        private final TypeFactory _typeFactory;

        public SimpleDatabindContext(TypeFactory tf) {
            _typeFactory = tf;
        }

        @Override
        public JavaType constructType(java.lang.reflect.Type type) {
            return _typeFactory.constructType(type);
        }

        @Override
        public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) {
            return _typeFactory.constructSpecializedType(baseType, subclass);
        }

        @Override
        public TypeFactory getTypeFactory() {
            return _typeFactory;
        }

        @Override
        public MapperConfig<?> getConfig() {
            return null;
        }
    }

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        objectType = typeFactory.constructType(Object.class);
        mapper = new ObjectMapper();
    }

    @Test
    public void testGetMechanism_returnsClass() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        Assert.assertEquals(JsonTypeInfo.Id.CLASS, resolver.getMechanism());
    }

    @Test
    public void testGetDescForKnownTypeIds_returnsDescription() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        Assert.assertEquals("class name used as type id", resolver.getDescForKnownTypeIds());
    }

    @Test
    public void testRegisterSubtype_doesNotThrow() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        resolver.registerSubtype(String.class, "str");
        resolver.registerSubtype(null, null);
    }

    @Test
    public void testIdFromValue_standardObject() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        String id = resolver.idFromValue("Hello");
        Assert.assertEquals(String.class.getName(), id);
    }

    @Test
    public void testIdFromValue_simpleEnum() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        String id = resolver.idFromValue(SimpleEnum.ONE);
        Assert.assertEquals(SimpleEnum.class.getName(), id);
    }

    @Test
    public void testIdFromValue_specializedEnumWithSubclass() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        String id = resolver.idFromValue(SpecializedEnum.CUSTOM);
        Assert.assertEquals(SpecializedEnum.class.getName(), id);
    }

    @Test
    public void testIdFromValue_enumSet() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        EnumSet<SimpleEnum> set = EnumSet.of(SimpleEnum.ONE);
        String id = resolver.idFromValue(set);
        String expected = typeFactory.constructCollectionType(EnumSet.class, SimpleEnum.class).toCanonical();
        Assert.assertEquals(expected, id);
    }

    @Test
    public void testIdFromValue_enumMap() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        EnumMap<SimpleEnum, Object> map = new EnumMap<>(SimpleEnum.class);
        map.put(SimpleEnum.ONE, "val");
        String id = resolver.idFromValue(map);
        String expected = typeFactory.constructMapType(EnumMap.class, SimpleEnum.class, Object.class).toCanonical();
        Assert.assertEquals(expected, id);
    }

    @Test
    public void testIdFromValue_arraysAsList() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        List<String> list = Arrays.asList("a", "b");
        String id = resolver.idFromValue(list);
        Assert.assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void testIdFromValue_singletonList() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        List<String> list = Collections.singletonList("a");
        String id = resolver.idFromValue(list);
        Assert.assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void testIdFromValue_otherJavaUtilClass() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        HashMap<String, String> map = new HashMap<>();
        String id = resolver.idFromValue(map);
        Assert.assertEquals(HashMap.class.getName(), id);
    }

    @Test
    public void testIdFromValue_nonStaticInnerClassWithTopLevelBaseType() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        NonStaticInnerClass inner = new NonStaticInnerClass();
        String id = resolver.idFromValue(inner);
        Assert.assertEquals(Object.class.getName(), id);
    }

    @Test
    public void testIdFromValue_nonStaticInnerClassWithInnerBaseType() {
        NestedContainer container = new NestedContainer();
        JavaType innerBaseType = typeFactory.constructType(NestedContainer.NonStaticDeepInnerClass.class);
        ClassNameIdResolver resolver = new ClassNameIdResolver(innerBaseType, typeFactory);
        NestedContainer.NonStaticDeepInnerClass inner = container.new NonStaticDeepInnerClass();
        String id = resolver.idFromValue(inner);
        Assert.assertEquals(NestedContainer.NonStaticDeepInnerClass.class.getName(), id);
    }

    @Test
    public void testIdFromValue_staticNestedClass() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        StaticNestedClass nested = new StaticNestedClass();
        String id = resolver.idFromValue(nested);
        Assert.assertEquals(StaticNestedClass.class.getName(), id);
    }

    @Test
    public void testIdFromValueAndType_explicitType() {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        String id = resolver.idFromValueAndType(null, Integer.class);
        Assert.assertEquals(Integer.class.getName(), id);
    }

    @Test
    public void testTypeFromId_withGenericsCanonical() throws IOException {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        DatabindContext ctxt = new SimpleDatabindContext(typeFactory);
        String genericId = "java.util.ArrayList<java.lang.String>";
        JavaType result = resolver.typeFromId(ctxt, genericId);
        Assert.assertNotNull(result);
        Assert.assertEquals(ArrayList.class, result.getRawClass());
        Assert.assertEquals(String.class, result.getContentType().getRawClass());
    }

    @Test
    public void testTypeFromId_validClassSpecialized() throws IOException {
        JavaType listType = typeFactory.constructType(List.class);
        ClassNameIdResolver resolver = new ClassNameIdResolver(listType, typeFactory);
        DatabindContext ctxt = new SimpleDatabindContext(typeFactory);
        JavaType result = resolver.typeFromId(ctxt, ArrayList.class.getName());
        Assert.assertNotNull(result);
        Assert.assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testTypeFromId_classNotFoundWithNonDeserializationContext_returnsNull() throws IOException {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        DatabindContext ctxt = new SimpleDatabindContext(typeFactory);
        JavaType result = resolver.typeFromId(ctxt, "com.nonexistent.Class12345");
        Assert.assertNull(result);
    }

    @Test(expected = JsonMappingException.class)
    public void testTypeFromId_classNotFoundWithDeserializationContext_throwsException() throws IOException {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        DeserializationContext dctx = mapper.getDeserializationContext();
        dctx = mapper.createDeserializationContext(null, mapper.getDeserializationConfig());
        resolver.typeFromId(dctx, "com.nonexistent.NoSuchClassFound");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromId_malformedClassName_throwsIllegalArgumentException() throws IOException {
        ClassNameIdResolver resolver = new ClassNameIdResolver(objectType, typeFactory);
        TypeFactory throwingTf = new TypeFactory(null) {
            @Override
            public Class<?> findClass(String className) throws ClassNotFoundException {
                throw new SecurityException("Access denied");
            }
        };
        DatabindContext ctxt = new SimpleDatabindContext(throwingTf);
        resolver.typeFromId(ctxt, "some.invalid.Class");
    }
}
