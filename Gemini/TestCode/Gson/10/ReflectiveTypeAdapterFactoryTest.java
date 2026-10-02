package com.google.gson.internal.bind;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public class ReflectiveTypeAdapterFactoryTest {

    private ReflectiveTypeAdapterFactory factory;
    private ConstructorConstructor constructorConstructor;
    private FieldNamingStrategy fieldNamingPolicy;
    private Excluder excluder;
    private Gson gson;

    @Before
    public void setUp() {
        constructorConstructor = new ConstructorConstructor(Collections.<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>>emptyMap());
        fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        excluder = Excluder.DEFAULT;
        factory = new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingPolicy, excluder);
        gson = new Gson();
    }

    private static class SimpleClass {
        int primitiveInt;
        String text;

        SimpleClass() {}

        SimpleClass(int primitiveInt, String text) {
            this.primitiveInt = primitiveInt;
            this.text = text;
        }
    }

    private static class SuperClass {
        String superField;
    }

    private static class SubClass extends SuperClass {
        String subField;
    }

    private interface DummyInterface {
    }

    private static class SerializedNameClass {
        @SerializedName("custom_name")
        String name;

        @SerializedName(value = "main_alias", alternate = {"alias1", "alias2"})
        int count;
    }

    private static class DuplicateNameClass {
        @SerializedName("same_name")
        int first;

        @SerializedName("same_name")
        int second;
    }

    private static class CustomAdapter extends TypeAdapter<String> {
        @Override
        public void write(JsonWriter out, String value) throws IOException {
            out.value(value == null ? null : "PREFIX_" + value);
        }

        @Override
        public String read(JsonReader in) throws IOException {
            String val = in.nextString();
            return val != null && val.startsWith("PREFIX_") ? val.substring(7) : val;
        }
    }

    private static class AnnotatedFieldClass {
        @JsonAdapter(CustomAdapter.class)
        String custom;
    }

    private static class SelfReferencingClass {
        SelfReferencingClass self;
        String name;
    }

    private static class ExcludedFieldClass {
        @Expose(serialize = false, deserialize = false)
        int hidden;

        @Expose(serialize = true, deserialize = true)
        int visible;
    }

    private static class GenericSuper<T> {
        T genericField;
    }

    private static class GenericSub extends GenericSuper<String> {
        int specificField;
    }

    @Test
    public void testExcludeField_withDefaultExcluder_returnsFalseForStandardFields() throws Exception {
        Field field = SimpleClass.class.getDeclaredField("primitiveInt");
        Assert.assertTrue(factory.excludeField(field, true));
        Assert.assertTrue(factory.excludeField(field, false));
    }

    @Test
    public void testExcludeField_staticMethod_handlesExclusion() throws Exception {
        Excluder customExcluder = Excluder.DEFAULT.excludeFieldsWithoutExposeAnnotation();
        Field hiddenField = ExcludedFieldClass.class.getDeclaredField("hidden");
        Field visibleField = ExcludedFieldClass.class.getDeclaredField("visible");

        Assert.assertFalse(ReflectiveTypeAdapterFactory.excludeField(hiddenField, true, customExcluder));
        Assert.assertFalse(ReflectiveTypeAdapterFactory.excludeField(hiddenField, false, customExcluder));
        Assert.assertTrue(ReflectiveTypeAdapterFactory.excludeField(visibleField, true, customExcluder));
        Assert.assertTrue(ReflectiveTypeAdapterFactory.excludeField(visibleField, false, customExcluder));
    }

    @Test
    public void testCreate_primitiveType_returnsNull() {
        TypeAdapter<Integer> adapter = factory.create(gson, TypeToken.get(int.class));
        Assert.assertNull(adapter);
    }

    @Test
    public void testCreate_interfaceType_returnsAdapterWithNoBoundFields() throws Exception {
        TypeAdapter<DummyInterface> adapter = factory.create(gson, TypeToken.get(DummyInterface.class));
        Assert.assertNotNull(adapter);

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, new DummyInterface() {});
        Assert.assertEquals("{}", writer.toString());
    }

    @Test
    public void testCreate_duplicateJsonFieldName_throwsIllegalArgumentException() {
        try {
            factory.create(gson, TypeToken.get(DuplicateNameClass.class));
            Assert.fail("Expected IllegalArgumentException on duplicate JSON field name");
        } catch (IllegalArgumentException expected) {
            Assert.assertTrue(expected.getMessage().contains("declares multiple JSON fields named same_name"));
        }
    }

    @Test
    public void testWriteAndRead_simpleObject_successfulSerializationAndDeserialization() throws Exception {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));

        SimpleClass obj = new SimpleClass(42, "hello");
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, obj);
        String json = writer.toString();

        Assert.assertTrue(json.contains("\"primitiveInt\":42"));
        Assert.assertTrue(json.contains("\"text\":\"hello\""));

        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleClass deserialized = adapter.read(reader);
        Assert.assertNotNull(deserialized);
        Assert.assertEquals(42, deserialized.primitiveInt);
        Assert.assertEquals("hello", deserialized.text);
    }

    @Test
    public void testWriteAndRead_nullObject_writesAndReadsNull() throws Exception {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, null);
        Assert.assertEquals("null", writer.toString());

        JsonReader reader = new JsonReader(new StringReader("null"));
        SimpleClass result = adapter.read(reader);
        Assert.assertNull(result);
    }

    @Test
    public void testWrite_selfReferencingField_avoidsInfiniteRecursion() throws Exception {
        TypeAdapter<SelfReferencingClass> adapter = factory.create(gson, TypeToken.get(SelfReferencingClass.class));

        SelfReferencingClass obj = new SelfReferencingClass();
        obj.self = obj;
        obj.name = "test";

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, obj);
        String json = writer.toString();

        Assert.assertEquals("{\"name\":\"test\"}", json);
    }

    @Test
    public void testWriteAndRead_inheritance_serializesSuperAndSubFields() throws Exception {
        TypeAdapter<SubClass> adapter = factory.create(gson, TypeToken.get(SubClass.class));

        SubClass sub = new SubClass();
        sub.superField = "fromSuper";
        sub.subField = "fromSub";

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, sub);
        String json = writer.toString();

        Assert.assertTrue(json.contains("\"superField\":\"fromSuper\""));
        Assert.assertTrue(json.contains("\"subField\":\"fromSub\""));

        JsonReader reader = new JsonReader(new StringReader(json));
        SubClass deserialized = adapter.read(reader);
        Assert.assertEquals("fromSuper", deserialized.superField);
        Assert.assertEquals("fromSub", deserialized.subField);
    }

    @Test
    public void testWriteAndRead_genericInheritance_resolvesCorrectType() throws Exception {
        TypeAdapter<GenericSub> adapter = factory.create(gson, TypeToken.get(GenericSub.class));

        GenericSub sub = new GenericSub();
        sub.genericField = "genericValue";
        sub.specificField = 100;

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, sub);
        String json = writer.toString();

        Assert.assertTrue(json.contains("\"genericField\":\"genericValue\""));
        Assert.assertTrue(json.contains("\"specificField\":100"));

        JsonReader reader = new JsonReader(new StringReader(json));
        GenericSub deserialized = adapter.read(reader);
        Assert.assertEquals("genericValue", deserialized.genericField);
        Assert.assertEquals(100, deserialized.specificField);
    }

    @Test
    public void testWriteAndRead_serializedNameAndAlternates() throws Exception {
        TypeAdapter<SerializedNameClass> adapter = factory.create(gson, TypeToken.get(SerializedNameClass.class));

        SerializedNameClass obj = new SerializedNameClass();
        obj.name = "Sample";
        obj.count = 5;

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, obj);
        String json = writer.toString();

        Assert.assertTrue(json.contains("\"custom_name\":\"Sample\""));
        Assert.assertTrue(json.contains("\"main_alias\":5"));

        String jsonWithAlias = "{\"custom_name\":\"AliasSample\",\"alias2\":15}";
        JsonReader reader = new JsonReader(new StringReader(jsonWithAlias));
        SerializedNameClass deserialized = adapter.read(reader);
        Assert.assertEquals("AliasSample", deserialized.name);
        Assert.assertEquals(15, deserialized.count);
    }

    @Test
    public void testWriteAndRead_jsonAdapterAnnotationOnField() throws Exception {
        TypeAdapter<AnnotatedFieldClass> adapter = factory.create(gson, TypeToken.get(AnnotatedFieldClass.class));

        AnnotatedFieldClass obj = new AnnotatedFieldClass();
        obj.custom = "data";

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, obj);
        String json = writer.toString();

        Assert.assertEquals("{\"custom\":\"PREFIX_data\"}", json);

        JsonReader reader = new JsonReader(new StringReader("{\"custom\":\"PREFIX_data\"}"));
        AnnotatedFieldClass deserialized = adapter.read(reader);
        Assert.assertEquals("data", deserialized.custom);
    }

    @Test
    public void testRead_unknownFields_skippedSuccessfully() throws Exception {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));

        String json = "{\"unknownField\":\"ignoreMe\",\"primitiveInt\":10,\"anotherUnknown\":{\"nested\":true},\"text\":\"valid\"}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleClass result = adapter.read(reader);

        Assert.assertNotNull(result);
        Assert.assertEquals(10, result.primitiveInt);
        Assert.assertEquals("valid", result.text);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testRead_malformedJsonSyntax_throwsJsonSyntaxException() throws Exception {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));
        JsonReader reader = new JsonReader(new StringReader("12345"));
        adapter.read(reader);
    }

    @Test
    public void testRead_primitiveFieldNullValue_primitiveNotOverwrittenWithNull() throws Exception {
        TypeAdapter<SimpleClass> adapter = factory.create(gson, TypeToken.get(SimpleClass.class));

        String json = "{\"primitiveInt\":null,\"text\":null}";
        JsonReader reader = new JsonReader(new StringReader(json));
        SimpleClass result = adapter.read(reader);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.primitiveInt);
        Assert.assertNull(result.text);
    }

    @Test
    public void testCreate_withCustomExcluder_excludesFields() throws Exception {
        Excluder customExcluder = Excluder.DEFAULT.excludeFieldsWithoutExposeAnnotation();
        ReflectiveTypeAdapterFactory customFactory = new ReflectiveTypeAdapterFactory(
                constructorConstructor, fieldNamingPolicy, customExcluder);

        TypeAdapter<ExcludedFieldClass> adapter = customFactory.create(gson, TypeToken.get(ExcludedFieldClass.class));

        ExcludedFieldClass obj = new ExcludedFieldClass();
        obj.hidden = 999;
        obj.visible = 123;

        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        adapter.write(jsonWriter, obj);
        String json = writer.toString();

        Assert.assertFalse(json.contains("hidden"));
        Assert.assertTrue(json.contains("\"visible\":123"));

        JsonReader reader = new JsonReader(new StringReader("{\"hidden\":777,\"visible\":456}"));
        ExcludedFieldClass deserialized = adapter.read(reader);
        Assert.assertEquals(0, deserialized.hidden);
        Assert.assertEquals(456, deserialized.visible);
    }
}
