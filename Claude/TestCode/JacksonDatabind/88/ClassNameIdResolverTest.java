package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;
import java.util.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ClassNameIdResolverTest {

    private TypeFactory typeFactory;
    private JavaType objectType;
    private ClassNameIdResolver resolver;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        objectType = typeFactory.constructType(Object.class);
        resolver = new ClassNameIdResolver(objectType, typeFactory);
    }

    // ---------- simple / typical methods ----------

    @Test
    public void testGetMechanism_returnsClassId() {
        assertEquals(JsonTypeInfo.Id.CLASS, resolver.getMechanism());
    }

    @Test
    public void testRegisterSubtype_noException() {
        // no-op method for class name based resolvers, should not throw
        resolver.registerSubtype(String.class, "str");
    }

    @Test
    public void testGetDescForKnownTypeIds_returnsExpectedText() {
        assertEquals("class name used as type id", resolver.getDescForKnownTypeIds());
    }

    // ---------- idFromValue ----------

    @Test
    public void testIdFromValue_normalObject_returnsClassName() {
        String id = resolver.idFromValue("hello");
        assertEquals("java.lang.String", id);
    }

    @Test(expected = NullPointerException.class)
    public void testIdFromValue_nullValue_throwsException() {
        resolver.idFromValue(null);
    }

    @Test
    public void testIdFromValue_enumValue_returnsEnumClassName() {
        String id = resolver.idFromValue(SampleEnum.A);
        assertEquals(SampleEnum.class.getName(), id);
    }

    @Test
    public void testIdFromValue_enumSubclassValue_returnsBaseEnumClassName() {
        // anonymous-subclass enum constant (with method body override)
        String id = resolver.idFromValue(SampleEnumWithBody.WITH_BODY);
        assertEquals(SampleEnumWithBody.class.getName(), id);
    }

    @Test
    public void testIdFromValue_enumSet_returnsCanonicalCollectionType() {
        EnumSet<SampleEnum> set = EnumSet.of(SampleEnum.A);
        String id = resolver.idFromValue(set);
        assertTrue(id.contains("EnumSet"));
        assertTrue(id.contains(SampleEnum.class.getName()));
    }

    @Test
    public void testIdFromValue_enumMap_returnsCanonicalMapType() {
        EnumMap<SampleEnum, Object> map = new EnumMap<SampleEnum, Object>(SampleEnum.class);
        map.put(SampleEnum.A, "x");
        String id = resolver.idFromValue(map);
        assertTrue(id.contains("EnumMap"));
        assertTrue(id.contains(SampleEnum.class.getName()));
    }

    @Test
    public void testIdFromValue_arraysAsList_returnsArrayListClassName() {
        List<String> list = Arrays.asList("a", "b");
        String id = resolver.idFromValue(list);
        assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void testIdFromValue_unmodifiableList_returnsArrayListClassName() {
        List<String> list = Collections.unmodifiableList(
                new ArrayList<String>(Arrays.asList("a", "b")));
        String id = resolver.idFromValue(list);
        assertEquals("java.util.ArrayList", id);
    }

    @Test
    public void testIdFromValue_otherJavaUtilClass_returnsOriginalClassName() {
        HashMap<String, String> map = new HashMap<String, String>();
        String id = resolver.idFromValue(map);
        assertEquals("java.util.HashMap", id);
    }

    @Test
    public void testIdFromValue_innerClassWithNonNestedBaseType_returnsBaseTypeClassName() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        String id = resolver.idFromValue(inner);
        // baseType is Object.class which has no outer class -> cls replaced with baseType
        assertEquals("java.lang.Object", id);
    }

    @Test
    public void testIdFromValue_innerClassWithNestedBaseType_returnsOriginalNestedClassName() {
        JavaType nestedBaseType = typeFactory.constructType(Outer.Inner.class);
        ClassNameIdResolver localResolver = new ClassNameIdResolver(nestedBaseType, typeFactory);
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        String id = localResolver.idFromValue(inner);
        assertEquals(Outer.Inner.class.getName(), id);
    }

    // ---------- idFromValueAndType ----------

    @Test
    public void testIdFromValueAndType_normalType_returnsClassName() {
        String id = resolver.idFromValueAndType("value", String.class);
        assertEquals("java.lang.String", id);
    }

    @Test
    public void testIdFromValueAndType_enumSetType_returnsCanonicalType() {
        EnumSet<SampleEnum> set = EnumSet.of(SampleEnum.A);
        String id = resolver.idFromValueAndType(set, set.getClass());
        assertTrue(id.contains("EnumSet"));
    }

    // ---------- typeFromId ----------

    private DeserializationContext obtainRealDeserializationContext() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CapturingHolder.captured = null;
        mapper.readValue("{\"value\":1}", CapturingWrapper.class);
        return CapturingHolder.captured;
    }

    @Test
    public void testTypeFromId_simpleClassName_returnsCorrectJavaType() throws IOException {
        DeserializationContext ctxt = obtainRealDeserializationContext();
        assertNotNull(ctxt);
        JavaType type = resolver.typeFromId(ctxt, "java.lang.String");
        assertNotNull(type);
        assertEquals(String.class, type.getRawClass());
    }

    @Test
    public void testTypeFromId_genericTypeId_returnsParameterizedJavaType() throws IOException {
        DeserializationContext ctxt = obtainRealDeserializationContext();
        JavaType listType = typeFactory.constructType(List.class);
        ClassNameIdResolver listResolver = new ClassNameIdResolver(listType, typeFactory);
        JavaType type = listResolver.typeFromId(ctxt, "java.util.List<java.lang.String>");
        assertNotNull(type);
        assertTrue(List.class.isAssignableFrom(type.getRawClass()));
    }

    @Test(expected = IOException.class)
    public void testTypeFromId_unknownClassName_throwsIOException() throws IOException {
        DeserializationContext ctxt = obtainRealDeserializationContext();
        resolver.typeFromId(ctxt, "com.nonexistent.NoSuchClassXYZ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypeFromId_invalidGenericSyntax_throwsIllegalArgumentException() throws IOException {
        DeserializationContext ctxt = obtainRealDeserializationContext();
        // malformed generic id should trigger an exception while parsing canonical form
        resolver.typeFromId(ctxt, "java.util.List<<<bad>>>");
    }

    // ---------- Helper types ----------

    enum SampleEnum { A, B }

    enum SampleEnumWithBody {
        WITH_BODY {
            @Override
            public String describe() { return "body"; }
        };
        public String describe() { return "none"; }
    }

    static class Outer {
        class Inner {
        }
    }

    static class CapturingWrapper {
        @JsonDeserialize(using = CapturingDeserializer.class)
        public Object value;
    }

    static class CapturingHolder {
        static DeserializationContext captured;
    }

    static class CapturingDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            CapturingHolder.captured = ctxt;
            p.skipChildren();
            return null;
        }
    }
}
