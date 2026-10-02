package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

public class JsonAdapterAnnotationTypeAdapterFactoryTest {

  private ConstructorConstructor constructorConstructor;
  private JsonAdapterAnnotationTypeAdapterFactory factory;
  private Gson gson;

  @Before
  public void setUp() {
    Map<Type, com.google.gson.InstanceCreator<?>> instanceCreators = Collections.emptyMap();
    constructorConstructor = new ConstructorConstructor(instanceCreators);
    factory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
    gson = new Gson();
  }

  private static class UnannotatedClass {
    String name;
  }

  @JsonAdapter(CustomTypeAdapter.class)
  private static class AnnotatedWithTypeAdapter {
    final String value;

    AnnotatedWithTypeAdapter(String value) {
      this.value = value;
    }
  }

  @JsonAdapter(CustomTypeAdapterFactory.class)
  private static class AnnotatedWithTypeAdapterFactory {
    final String value;

    AnnotatedWithTypeAdapterFactory(String value) {
      this.value = value;
    }
  }

  @JsonAdapter(InvalidAdapterClass.class)
  private static class AnnotatedWithInvalidAdapter {
    String value;
  }

  private static class CustomTypeAdapter extends TypeAdapter<AnnotatedWithTypeAdapter> {
    @Override
    public void write(JsonWriter out, AnnotatedWithTypeAdapter value) throws IOException {
      out.value("adapter:" + value.value);
    }

    @Override
    public AnnotatedWithTypeAdapter read(JsonReader in) throws IOException {
      String str = in.nextString();
      return new AnnotatedWithTypeAdapter(str.replace("adapter:", ""));
    }
  }

  private static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
      if (!AnnotatedWithTypeAdapterFactory.class.isAssignableFrom(type.getRawType())) {
        return null;
      }
      return (TypeAdapter<T>) new TypeAdapter<AnnotatedWithTypeAdapterFactory>() {
        @Override
        public void write(JsonWriter out, AnnotatedWithTypeAdapterFactory value) throws IOException {
          out.value("factory:" + value.value);
        }

        @Override
        public AnnotatedWithTypeAdapterFactory read(JsonReader in) throws IOException {
          String str = in.nextString();
          return new AnnotatedWithTypeAdapterFactory(str.replace("factory:", ""));
        }
      };
    }
  }

  private static class InvalidAdapterClass {
    // Neither TypeAdapter nor TypeAdapterFactory
  }

  @Test
  public void testCreate_noAnnotation_returnsNull() {
    TypeToken<UnannotatedClass> token = TypeToken.get(UnannotatedClass.class);
    TypeAdapter<UnannotatedClass> adapter = factory.create(gson, token);
    Assert.assertNull(adapter);
  }

  @Test
  public void testCreate_annotatedWithTypeAdapter_returnsNullSafeAdapter() throws IOException {
    TypeToken<AnnotatedWithTypeAdapter> token = TypeToken.get(AnnotatedWithTypeAdapter.class);
    TypeAdapter<AnnotatedWithTypeAdapter> adapter = factory.create(gson, token);
    Assert.assertNotNull(adapter);

    // Verify nullSafe handling for null value
    Assert.assertEquals("null", adapter.toJson(null));
    Assert.assertNull(adapter.fromJson("null"));

    // Verify normal serialization and deserialization
    AnnotatedWithTypeAdapter input = new AnnotatedWithTypeAdapter("hello");
    String json = adapter.toJson(input);
    Assert.assertEquals("\"adapter:hello\"", json);

    AnnotatedWithTypeAdapter deserialized = adapter.fromJson(json);
    Assert.assertNotNull(deserialized);
    Assert.assertEquals("hello", deserialized.value);
  }

  @Test
  public void testCreate_annotatedWithTypeAdapterFactory_returnsNullSafeAdapter() throws IOException {
    TypeToken<AnnotatedWithTypeAdapterFactory> token = TypeToken.get(AnnotatedWithTypeAdapterFactory.class);
    TypeAdapter<AnnotatedWithTypeAdapterFactory> adapter = factory.create(gson, token);
    Assert.assertNotNull(adapter);

    // Verify nullSafe handling for null value
    Assert.assertEquals("null", adapter.toJson(null));
    Assert.assertNull(adapter.fromJson("null"));

    // Verify normal serialization and deserialization
    AnnotatedWithTypeAdapterFactory input = new AnnotatedWithTypeAdapterFactory("world");
    String json = adapter.toJson(input);
    Assert.assertEquals("\"factory:world\"", json);

    AnnotatedWithTypeAdapterFactory deserialized = adapter.fromJson(json);
    Assert.assertNotNull(deserialized);
    Assert.assertEquals("world", deserialized.value);
  }

  @Test
  public void testCreate_invalidAdapterClass_throwsIllegalArgumentException() {
    TypeToken<AnnotatedWithInvalidAdapter> token = TypeToken.get(AnnotatedWithInvalidAdapter.class);
    try {
      factory.create(gson, token);
      Assert.fail("Expected IllegalArgumentException for non-adapter class reference");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.", e.getMessage());
    }
  }

  @Test
  public void testGetTypeAdapter_directCallWithTypeAdapter_returnsAdapter() {
    TypeToken<AnnotatedWithTypeAdapter> token = TypeToken.get(AnnotatedWithTypeAdapter.class);
    JsonAdapter annotation = AnnotatedWithTypeAdapter.class.getAnnotation(JsonAdapter.class);
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, token, annotation);

    Assert.assertNotNull(adapter);
    Assert.assertEquals("null", adapter.toJson(null));
  }

  @Test
  public void testGetTypeAdapter_directCallWithTypeAdapterFactory_returnsAdapter() {
    TypeToken<AnnotatedWithTypeAdapterFactory> token = TypeToken.get(AnnotatedWithTypeAdapterFactory.class);
    JsonAdapter annotation = AnnotatedWithTypeAdapterFactory.class.getAnnotation(JsonAdapter.class);
    TypeAdapter<?> adapter = JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
        constructorConstructor, gson, token, annotation);

    Assert.assertNotNull(adapter);
    Assert.assertEquals("null", adapter.toJson(null));
  }

  @Test
  public void testGetTypeAdapter_directCallWithInvalidAnnotationValue_throwsIllegalArgumentException() {
    TypeToken<AnnotatedWithInvalidAdapter> token = TypeToken.get(AnnotatedWithInvalidAdapter.class);
    JsonAdapter annotation = AnnotatedWithInvalidAdapter.class.getAnnotation(JsonAdapter.class);

    try {
      JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter(
          constructorConstructor, gson, token, annotation);
      Assert.fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.", e.getMessage());
    }
  }
}
