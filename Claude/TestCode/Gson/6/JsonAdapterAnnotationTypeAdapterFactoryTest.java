package com.google.gson.internal.bind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

  private ConstructorConstructor constructorConstructor;
  private Gson gson;
  private JsonAdapterAnnotationTypeAdapterFactory factory;

  @Before
  public void setUp() {
    Map<Type, InstanceCreator<?>> instanceCreators = new HashMap<Type, InstanceCreator<?>>();
    constructorConstructor = new ConstructorConstructor(instanceCreators);
    gson = new Gson();
    factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
  }

  // ---------------------------------------------------------------------
  // Sample classes used for testing
  // ---------------------------------------------------------------------

  static class SimpleTypeAdapter extends TypeAdapter<AnnotatedWithAdapter> {
    @Override
    public void write(JsonWriter out, AnnotatedWithAdapter value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        out.value(value.name);
      }
    }

    @Override
    public AnnotatedWithAdapter read(JsonReader in) throws IOException {
      AnnotatedWithAdapter result = new AnnotatedWithAdapter();
      result.name = in.nextString();
      return result;
    }
  }

  @JsonAdapter(SimpleTypeAdapter.class)
  static class AnnotatedWithAdapter {
    String name;
  }

  static class AnotherTypeAdapter extends TypeAdapter<AnnotatedWithFactory> {
    @Override
    public void write(JsonWriter out, AnnotatedWithFactory value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        out.value(value.name);
      }
    }

    @Override
    public AnnotatedWithFactory read(JsonReader in) throws IOException {
      AnnotatedWithFactory result = new AnnotatedWithFactory();
      result.name = in.nextString();
      return result;
    }
  }

  static class SimpleTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      return (TypeAdapter<T>) new AnotherTypeAdapter();
    }
  }

  @JsonAdapter(SimpleTypeAdapterFactory.class)
  static class AnnotatedWithFactory {
    String name;
  }

  @JsonAdapter(String.class) // Invalid: not a TypeAdapter or TypeAdapterFactory
  static class AnnotatedWithInvalidValue {
    String name;
  }

  static class NotAnnotated {
    String name;
  }

  // ---------------------------------------------------------------------
  // Constructor tests
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_validConstructorConstructor_createsInstance() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    JsonAdapterAnnotationTypeAdapterFactory f = new JsonAdapterAnnotationTypeAdapterFactory(cc);
    assertNotNull(f);
  }

  // ---------------------------------------------------------------------
  // create(Gson, TypeToken) tests
  // ---------------------------------------------------------------------

  @Test
  public void testCreate_classWithoutAnnotation_returnsNull() {
    TypeAdapter<NotAnnotated> adapter = factory.create(gson, TypeToken.get(NotAnnotated.class));
    assertNull(adapter);
  }

  @Test
  public void testCreate_classAnnotatedWithTypeAdapter_returnsNonNullAdapter() {
    TypeAdapter<AnnotatedWithAdapter> adapter =
        factory.create(gson, TypeToken.get(AnnotatedWithAdapter.class));
    assertNotNull(adapter);
  }

  @Test
  public void testCreate_classAnnotatedWithTypeAdapter_worksCorrectlyOnWriteRead() throws IOException {
    TypeAdapter<AnnotatedWithAdapter> adapter =
        factory.create(gson, TypeToken.get(AnnotatedWithAdapter.class));
    assertNotNull(adapter);

    AnnotatedWithAdapter obj = new AnnotatedWithAdapter();
    obj.name = "hello";
    String json = adapter.toJson(obj);
    assertEquals("\"hello\"", json);

    AnnotatedWithAdapter parsed = adapter.fromJson("\"world\"");
    assertEquals("world", parsed.name);
  }

  @Test
  public void testCreate_classAnnotatedWithTypeAdapter_nullSafeReturnsNullForNullInput() throws IOException {
    TypeAdapter<AnnotatedWithAdapter> adapter =
        factory.create(gson, TypeToken.get(AnnotatedWithAdapter.class));
    assertNotNull(adapter);

    String json = adapter.toJson(null);
    assertEquals("null", json);
  }

  @Test
  public void testCreate_classAnnotatedWithTypeAdapterFactory_returnsNonNullAdapter() {
    TypeAdapter<AnnotatedWithFactory> adapter =
        factory.create(gson, TypeToken.get(AnnotatedWithFactory.class));
    assertNotNull(adapter);
  }

  @Test
  public void testCreate_classAnnotatedWithTypeAdapterFactory_worksCorrectlyOnWriteRead() throws IOException {
    TypeAdapter<AnnotatedWithFactory> adapter =
        factory.create(gson, TypeToken.get(AnnotatedWithFactory.class));
    assertNotNull(adapter);

    AnnotatedWithFactory obj = new AnnotatedWithFactory();
    obj.name = "test";
    String json = adapter.toJson(obj);
    assertEquals("\"test\"", json);

    AnnotatedWithFactory parsed = adapter.fromJson("\"parsedValue\"");
    assertEquals("parsedValue", parsed.name);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreate_classAnnotatedWithInvalidValue_throwsIllegalArgumentException() {
    factory.create(gson, TypeToken.get(AnnotatedWithInvalidValue.class));
  }

  // ---------------------------------------------------------------------
  // getTypeAdapter(ConstructorConstructor, Gson, TypeToken, JsonAdapter) tests
  // ---------------------------------------------------------------------

  @Test
  public void testGetTypeAdapter_withTypeAdapterClass_returnsNonNullNullSafeAdapter() throws IOException {
    JsonAdapter annotation = AnnotatedWithAdapter.class.getAnnotation(JsonAdapter.class);
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, TypeToken.get(AnnotatedWithAdapter.class), annotation);
    assertNotNull(adapter);
  }

  @Test
  public void testGetTypeAdapter_withTypeAdapterFactoryClass_returnsNonNullNullSafeAdapter() {
    JsonAdapter annotation = AnnotatedWithFactory.class.getAnnotation(JsonAdapter.class);
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, TypeToken.get(AnnotatedWithFactory.class), annotation);
    assertNotNull(adapter);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetTypeAdapter_withInvalidClass_throwsIllegalArgumentException() {
    JsonAdapter annotation = AnnotatedWithInvalidValue.class.getAnnotation(JsonAdapter.class);
    JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, TypeToken.get(AnnotatedWithInvalidValue.class), annotation);
  }
}
