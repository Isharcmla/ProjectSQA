package com.google.gson.internal.bind;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ReflectiveTypeAdapterFactoryTest {

    private ReflectiveTypeAdapterFactory factory;
    private Gson gson;
    private ConstructorConstructor constructorConstructor;

    @Before
    public void setUp() {
        Map<Type, InstanceCreator<?>> emptyMap = Collections.<Type, InstanceCreator<?>>emptyMap();
        constructorConstructor = new ConstructorConstructor(emptyMap);
        factory = new ReflectiveTypeAdapterFactory(constructorConstructor, FieldNamingPolicy.IDENTITY, Excluder.DEFAULT);
        gson = new Gson();
    }

    // ---------- Sample POJOs used across tests ----------

    public static class SamplePojo {
        public String name;
        public int age;
        public transient String ignored = "should_not_serialize";
    }

    public static class NamedPojo {
        @SerializedName("full_name")
        public String name;
    }

    public static class AlternatePojo {
        @SerializedName(value = "primaryName", alternate = {"altName1", "altName2"})
        public String value;
    }

    public static class DuplicatePojo {
        @SerializedName("dup")
        public String a;
        @SerializedName("dup")
        public String b;
    }

    public interface SampleInterface {
    }

    public static class SelfRefPojo {
        public SelfRefPojo self;
    }

    public static class BasePojo {
        public String baseField = "base";
    }

    public static class ChildPojo extends BasePojo {
        public String childField = "child";
    }

    public static class LowerCasePojo {
        public String userName = "abc";
    }

    // ---------- Constructor test ----------

    @Test
    public void testConstructor_createsInstance_notNull() {
        assertNotNull(factory);
    }

    // ---------- excludeField (instance) tests ----------

    @Test
    public void testExcludeFieldInstance_normalField_returnsTrue() throws Exception {
        Field f = SamplePojo.class.getDeclaredField("name");
        boolean result = factory.excludeField(f, true);
        assertTrue(result);
    }

    @Test
    public void testExcludeFieldInstance_transientField_returnsFalse() throws Exception {
        Field f = SamplePojo.class.getDeclaredField("ignored");
        boolean result = factory.excludeField(f, true);
        assertFalse(result);
    }

    // ---------- excludeField (static) tests ----------

    @Test
    public void testExcludeFieldStatic_normalFieldWithDefaultExcluder_returnsTrue() throws Exception {
        Field f = SamplePojo.class.getDeclaredField("age");
        boolean result = ReflectiveTypeAdapterFactory.excludeField(f, false, Excluder.DEFAULT);
        assertTrue(result);
    }

    @Test
    public void testExcludeFieldStatic_transientFieldWithDefaultExcluder_returnsFalse() throws Exception {
        Field f = SamplePojo.class.getDeclaredField("ignored");
        boolean result = ReflectiveTypeAdapterFactory.excludeField(f, true, Excluder.DEFAULT);
        assertFalse(result);
    }

    // ---------- create() tests ----------

    @Test
    public void testCreate_withPrimitiveIntType_returnsNull() {
        TypeAdapter<Integer> adapter = factory.create(gson, TypeToken.get(int.class));
        assertNull(adapter);
    }

    @Test
    public void testCreate_withPrimitiveBooleanType_returnsNull() {
        TypeAdapter<Boolean> adapter = factory.create(gson, TypeToken.get(boolean.class));
        assertNull(adapter);
    }

    @Test
    public void testCreate_withSimplePojo_returnsNonNullAdapter() {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        assertNotNull(adapter);
    }

    @Test
    public void testCreate_withObjectClass_returnsNonNullAdapter() throws Exception {
        TypeAdapter<Object> adapter = factory.create(gson, TypeToken.get(Object.class));
        assertNotNull(adapter);
        String json = adapter.toJson(new Object());
        assertEquals("{}", json);
    }

    @Test
    public void testCreate_withInterfaceType_returnsNonNullAdapterAndEmptyBoundFields() throws Exception {
        TypeAdapter<SampleInterface> adapter = factory.create(gson, TypeToken.get(SampleInterface.class));
        assertNotNull(adapter);
        SampleInterface impl = new SampleInterface() {
        };
        String json = adapter.toJson(impl);
        assertEquals("{}", json);
    }

    @Test
    public void testCreate_withDuplicateSerializedName_throwsIllegalArgumentException() {
        try {
            factory.create(gson, TypeToken.get(DuplicatePojo.class));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("declares multiple JSON fields named"));
        }
    }

    // ---------- Adapter.write() tests ----------

    @Test
    public void testAdapterWrite_normalPojo_serializesNonTransientFields() throws Exception {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        SamplePojo p = new SamplePojo();
        p.name = "John";
        p.age = 30;
        p.ignored = "x";

        String json = adapter.toJson(p);

        assertTrue(json.contains("\"name\":\"John\""));
        assertTrue(json.contains("\"age\":30"));
        assertFalse(json.contains("ignored"));
    }

    @Test
    public void testAdapterWrite_nullValue_writesNullLiteral() throws Exception {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        String json = adapter.toJson(null);
        assertEquals("null", json);
    }

    @Test
    public void testAdapterWrite_withSerializedNameAnnotation_usesCustomName() throws Exception {
        TypeAdapter<NamedPojo> adapter = factory.create(gson, TypeToken.get(NamedPojo.class));
        NamedPojo p = new NamedPojo();
        p.name = "Alice";

        String json = adapter.toJson(p);

        assertTrue(json.contains("\"full_name\":\"Alice\""));
    }

    @Test
    public void testAdapterWrite_withAlternateNames_onlySerializesPrimaryName() throws Exception {
        TypeAdapter<AlternatePojo> adapter = factory.create(gson, TypeToken.get(AlternatePojo.class));
        AlternatePojo p = new AlternatePojo();
        p.value = "hello";

        String json = adapter.toJson(p);

        assertTrue(json.contains("\"primaryName\":\"hello\""));
        assertFalse(json.contains("altName1"));
        assertFalse(json.contains("altName2"));
    }

    @Test
    public void testAdapterWrite_selfReferencingField_avoidsRecursion() throws Exception {
        TypeAdapter<SelfRefPojo> adapter = factory.create(gson, TypeToken.get(SelfRefPojo.class));
        SelfRefPojo p = new SelfRefPojo();
        p.self = p;

        String json = adapter.toJson(p);

        assertEquals("{}", json);
    }

    @Test
    public void testAdapterWrite_withInheritedFields_serializesBothBaseAndChild() throws Exception {
        TypeAdapter<ChildPojo> adapter = factory.create(gson, TypeToken.get(ChildPojo.class));
        ChildPojo p = new ChildPojo();

        String json = adapter.toJson(p);

        assertTrue(json.contains("\"baseField\":\"base\""));
        assertTrue(json.contains("\"childField\":\"child\""));
    }

    @Test
    public void testAdapterWrite_withCustomFieldNamingPolicy_translatesFieldName() throws Exception {
        ReflectiveTypeAdapterFactory upperCamelFactory = new ReflectiveTypeAdapterFactory(
                constructorConstructor, FieldNamingPolicy.UPPER_CAMEL_CASE, Excluder.DEFAULT);
        TypeAdapter<LowerCasePojo> adapter = upperCamelFactory.create(gson, TypeToken.get(LowerCasePojo.class));

        String json = adapter.toJson(new LowerCasePojo());

        assertTrue(json.contains("\"UserName\":\"abc\""));
    }

    // ---------- Adapter.read() tests ----------

    @Test
    public void testAdapterRead_normalJson_populatesFields() throws Exception {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        SamplePojo result = adapter.fromJson("{\"name\":\"Jane\",\"age\":25}");

        assertNotNull(result);
        assertEquals("Jane", result.name);
        assertEquals(25, result.age);
    }

    @Test
    public void testAdapterRead_nullJson_returnsNull() throws Exception {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        SamplePojo result = adapter.fromJson("null");
        assertNull(result);
    }

    @Test
    public void testAdapterRead_withUnknownField_skipsValue() throws Exception {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        SamplePojo result = adapter.fromJson("{\"name\":\"Bob\",\"unknownField\":\"x\",\"age\":40}");

        assertNotNull(result);
        assertEquals("Bob", result.name);
        assertEquals(40, result.age);
    }

    @Test
    public void testAdapterRead_withAlternateName_deserializesCorrectly() throws Exception {
        TypeAdapter<AlternatePojo> adapter = factory.create(gson, TypeToken.get(AlternatePojo.class));
        AlternatePojo result = adapter.fromJson("{\"altName1\":\"foo\"}");

        assertNotNull(result);
        assertEquals("foo", result.value);
    }

    @Test
    public void testAdapterRead_withSecondAlternateName_deserializesCorrectly() throws Exception {
        TypeAdapter<AlternatePojo> adapter = factory.create(gson, TypeToken.get(AlternatePojo.class));
        AlternatePojo result = adapter.fromJson("{\"altName2\":\"bar\"}");

        assertNotNull(result);
        assertEquals("bar", result.value);
    }

    @Test
    public void testAdapterRead_malformedJsonArrayInsteadOfObject_throwsJsonSyntaxException() throws Exception {
        TypeAdapter<SamplePojo> adapter = factory.create(gson, TypeToken.get(SamplePojo.class));
        try {
            adapter.fromJson("[1,2,3]");
            fail("Expected JsonSyntaxException");
        } catch (JsonSyntaxException e) {
            // expected
        }
    }

    @Test
    public void testAdapterRead_withInheritedFields_populatesBothBaseAndChild() throws Exception {
        TypeAdapter<ChildPojo> adapter = factory.create(gson, TypeToken.get(ChildPojo.class));
        ChildPojo result = adapter.fromJson("{\"baseField\":\"b1\",\"childField\":\"c1\"}");

        assertNotNull(result);
        assertEquals("b1", result.baseField);
        assertEquals("c1", result.childField);
    }
}
