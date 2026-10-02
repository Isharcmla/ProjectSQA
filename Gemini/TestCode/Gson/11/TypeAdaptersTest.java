package com.google.gson.internal.bind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class TypeAdaptersTest {

  private <T> String toJson(TypeAdapter<T> adapter, T value) throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    jsonWriter.setLenient(true);
    adapter.write(jsonWriter, value);
    return writer.toString();
  }

  private <T> T fromJson(TypeAdapter<T> adapter, String json) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(json));
    reader.setLenient(true);
    return adapter.read(reader);
  }

  private enum TestEnum {
    @SerializedName(value = "custom_first", alternate = {"alt_first_1", "alt_first_2"})
    FIRST,
    SECOND {
      @Override
      public String toString() {
        return "second_subclass";
      }
    }
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testConstructor_private_throwsException() throws Throwable {
    Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  @Test
  public void testClass_writeAndRead() throws Exception {
    TypeAdapter<Class> adapter = TypeAdapters.CLASS;
    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    try {
      toJson(adapter, String.class);
      fail();
    } catch (UnsupportedOperationException expected) {}

    try {
      fromJson(adapter, "\"java.lang.String\"");
      fail();
    } catch (UnsupportedOperationException expected) {}
  }

  @Test
  public void testBitSet_writeAndRead() throws Exception {
    TypeAdapter<BitSet> adapter = TypeAdapters.BIT_SET;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);
    bitSet.set(3);
    String json = toJson(adapter, bitSet);
    assertEquals("[1,0,1,1]", json);

    BitSet readBitSet = fromJson(adapter, "[1,0,true,false,\"1\",\"0\"]");
    assertTrue(readBitSet.get(0));
    assertFalse(readBitSet.get(1));
    assertTrue(readBitSet.get(2));
    assertFalse(readBitSet.get(3));
    assertTrue(readBitSet.get(4));
    assertFalse(readBitSet.get(5));

    BitSet emptyBitSet = fromJson(adapter, "[]");
    assertEquals(0, emptyBitSet.length());

    try {
      fromJson(adapter, "[\"invalid\"]");
      fail();
    } catch (JsonSyntaxException expected) {}

    try {
      fromJson(adapter, "[{}]");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testBoolean_writeAndRead() throws Exception {
    TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("true", toJson(adapter, true));
    assertEquals("false", toJson(adapter, false));

    assertEquals(Boolean.TRUE, fromJson(adapter, "true"));
    assertEquals(Boolean.FALSE, fromJson(adapter, "false"));
    assertEquals(Boolean.TRUE, fromJson(adapter, "\"true\""));
    assertEquals(Boolean.FALSE, fromJson(adapter, "\"false\""));
  }

  @Test
  public void testBooleanAsString_writeAndRead() throws Exception {
    TypeAdapter<Boolean> adapter = TypeAdapters.BOOLEAN_AS_STRING;

    assertEquals("\"null\"", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"true\"", toJson(adapter, true));
    assertEquals(Boolean.TRUE, fromJson(adapter, "\"true\""));
    assertEquals(Boolean.FALSE, fromJson(adapter, "\"random\""));
  }

  @Test
  public void testByte_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.BYTE;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("12", toJson(adapter, (byte) 12));
    assertEquals((byte) 12, fromJson(adapter, "12").byteValue());
    assertEquals((byte) -5, fromJson(adapter, "-5").byteValue());

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testShort_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.SHORT;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("123", toJson(adapter, (short) 123));
    assertEquals((short) 123, fromJson(adapter, "123").shortValue());
    assertEquals((short) -123, fromJson(adapter, "-123").shortValue());

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testInteger_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.INTEGER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("12345", toJson(adapter, 12345));
    assertEquals(12345, fromJson(adapter, "12345").intValue());
    assertEquals(-12345, fromJson(adapter, "-12345").intValue());

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testAtomicInteger_writeAndRead() throws Exception {
    TypeAdapter<AtomicInteger> adapter = TypeAdapters.ATOMIC_INTEGER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("42", toJson(adapter, new AtomicInteger(42)));
    assertEquals(42, fromJson(adapter, "42").get());

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testAtomicBoolean_writeAndRead() throws Exception {
    TypeAdapter<AtomicBoolean> adapter = TypeAdapters.ATOMIC_BOOLEAN;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("true", toJson(adapter, new AtomicBoolean(true)));
    assertTrue(fromJson(adapter, "true").get());
    assertFalse(fromJson(adapter, "false").get());
  }

  @Test
  public void testAtomicIntegerArray_writeAndRead() throws Exception {
    TypeAdapter<AtomicIntegerArray> adapter = TypeAdapters.ATOMIC_INTEGER_ARRAY;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    AtomicIntegerArray array = new AtomicIntegerArray(new int[]{1, 2, 3});
    assertEquals("[1,2,3]", toJson(adapter, array));

    AtomicIntegerArray deserialized = fromJson(adapter, "[10, 20, -5]");
    assertEquals(3, deserialized.length());
    assertEquals(10, deserialized.get(0));
    assertEquals(20, deserialized.get(1));
    assertEquals(-5, deserialized.get(2));

    try {
      fromJson(adapter, "[\"invalid\"]");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testLong_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.LONG;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("1234567890123", toJson(adapter, 1234567890123L));
    assertEquals(1234567890123L, fromJson(adapter, "1234567890123").longValue());

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testFloat_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.FLOAT;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("3.14", toJson(adapter, 3.14f));
    assertEquals(3.14f, fromJson(adapter, "3.14").floatValue(), 0.001f);
  }

  @Test
  public void testDouble_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.DOUBLE;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("3.14159", toJson(adapter, 3.14159d));
    assertEquals(3.14159d, fromJson(adapter, "3.14159").doubleValue(), 0.00001d);
  }

  @Test
  public void testNumber_writeAndRead() throws Exception {
    TypeAdapter<Number> adapter = TypeAdapters.NUMBER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("100", toJson(adapter, 100));
    assertEquals(100, fromJson(adapter, "100").intValue());

    try {
      fromJson(adapter, "\"not_a_number\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testCharacter_writeAndRead() throws Exception {
    TypeAdapter<Character> adapter = TypeAdapters.CHARACTER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"a\"", toJson(adapter, 'a'));
    assertEquals(Character.valueOf('a'), fromJson(adapter, "\"a\""));

    try {
      fromJson(adapter, "\"abc\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testString_writeAndRead() throws Exception {
    TypeAdapter<String> adapter = TypeAdapters.STRING;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"hello\"", toJson(adapter, "hello"));
    assertEquals("hello", fromJson(adapter, "\"hello\""));
    assertEquals("true", fromJson(adapter, "true"));
    assertEquals("false", fromJson(adapter, "false"));
  }

  @Test
  public void testBigDecimal_writeAndRead() throws Exception {
    TypeAdapter<BigDecimal> adapter = TypeAdapters.BIG_DECIMAL;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("123.456", toJson(adapter, new BigDecimal("123.456")));
    assertEquals(new BigDecimal("123.456"), fromJson(adapter, "\"123.456\""));

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testBigInteger_writeAndRead() throws Exception {
    TypeAdapter<BigInteger> adapter = TypeAdapters.BIG_INTEGER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("12345678901234567890", toJson(adapter, new BigInteger("12345678901234567890")));
    assertEquals(new BigInteger("12345678901234567890"), fromJson(adapter, "\"12345678901234567890\""));

    try {
      fromJson(adapter, "\"invalid\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testStringBuilder_writeAndRead() throws Exception {
    TypeAdapter<StringBuilder> adapter = TypeAdapters.STRING_BUILDER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"builder\"", toJson(adapter, new StringBuilder("builder")));
    assertEquals("builder", fromJson(adapter, "\"builder\"").toString());
  }

  @Test
  public void testStringBuffer_writeAndRead() throws Exception {
    TypeAdapter<StringBuffer> adapter = TypeAdapters.STRING_BUFFER;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"buffer\"", toJson(adapter, new StringBuffer("buffer")));
    assertEquals("buffer", fromJson(adapter, "\"buffer\"").toString());
  }

  @Test
  public void testURL_writeAndRead() throws Exception {
    TypeAdapter<URL> adapter = TypeAdapters.URL;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));
    assertNull(fromJson(adapter, "\"null\""));

    URL url = new URL("http://google.com");
    assertEquals("\"http://google.com\"", toJson(adapter, url));
    assertEquals(url, fromJson(adapter, "\"http://google.com\""));
  }

  @Test
  public void testURI_writeAndRead() throws Exception {
    TypeAdapter<URI> adapter = TypeAdapters.URI;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));
    assertNull(fromJson(adapter, "\"null\""));

    URI uri = new URI("http://google.com");
    assertEquals("\"http://google.com\"", toJson(adapter, uri));
    assertEquals(uri, fromJson(adapter, "\"http://google.com\""));

    try {
      fromJson(adapter, "\"http://invalid uri with spaces\"");
      fail();
    } catch (JsonIOException expected) {}
  }

  @Test
  public void testInetAddress_writeAndRead() throws Exception {
    TypeAdapter<InetAddress> adapter = TypeAdapters.INET_ADDRESS;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    InetAddress address = InetAddress.getByName("127.0.0.1");
    assertEquals("\"127.0.0.1\"", toJson(adapter, address));
    assertEquals(address, fromJson(adapter, "\"127.0.0.1\""));
  }

  @Test
  public void testUUID_writeAndRead() throws Exception {
    TypeAdapter<UUID> adapter = TypeAdapters.UUID;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    UUID uuid = UUID.randomUUID();
    assertEquals("\"" + uuid.toString() + "\"", toJson(adapter, uuid));
    assertEquals(uuid, fromJson(adapter, "\"" + uuid.toString() + "\""));
  }

  @Test
  public void testCurrency_writeAndRead() throws Exception {
    TypeAdapter<Currency> adapter = TypeAdapters.CURRENCY;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    Currency usd = Currency.getInstance("USD");
    assertEquals("\"USD\"", toJson(adapter, usd));
    assertEquals(usd, fromJson(adapter, "\"USD\""));
  }

  @Test
  public void testTimestampFactory_writeAndRead() throws Exception {
    Gson gson = new Gson();
    TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    assertNotNull(adapter);
    assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class)));

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    Timestamp timestamp = new Timestamp(123456789L);
    String json = toJson(adapter, timestamp);
    Timestamp deserialized = fromJson(adapter, json);
    assertEquals(timestamp.getTime(), deserialized.getTime());
  }

  @Test
  public void testCalendar_writeAndRead() throws Exception {
    TypeAdapter<Calendar> adapter = TypeAdapters.CALENDAR;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    Calendar cal = new GregorianCalendar(2023, 5, 15, 10, 20, 30);
    String json = toJson(adapter, cal);
    assertTrue(json.contains("\"year\":2023"));
    assertTrue(json.contains("\"month\":5"));
    assertTrue(json.contains("\"dayOfMonth\":15"));
    assertTrue(json.contains("\"hourOfDay\":10"));
    assertTrue(json.contains("\"minute\":20"));
    assertTrue(json.contains("\"second\":30"));

    Calendar deserialized = fromJson(adapter, "{\"year\":2023,\"month\":5,\"dayOfMonth\":15,\"hourOfDay\":10,\"minute\":20,\"second\":30}");
    assertEquals(2023, deserialized.get(Calendar.YEAR));
    assertEquals(5, deserialized.get(Calendar.MONTH));
    assertEquals(15, deserialized.get(Calendar.DAY_OF_MONTH));
    assertEquals(10, deserialized.get(Calendar.HOUR_OF_DAY));
    assertEquals(20, deserialized.get(Calendar.MINUTE));
    assertEquals(30, deserialized.get(Calendar.SECOND));

    Calendar emptyObjCal = fromJson(adapter, "{}");
    assertEquals(0, emptyObjCal.get(Calendar.YEAR));
  }

  @Test
  public void testLocale_writeAndRead() throws Exception {
    TypeAdapter<Locale> adapter = TypeAdapters.LOCALE;

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"en\"", toJson(adapter, new Locale("en")));
    assertEquals(new Locale("en"), fromJson(adapter, "\"en\""));

    assertEquals("\"en_US\"", toJson(adapter, new Locale("en", "US")));
    assertEquals(new Locale("en", "US"), fromJson(adapter, "\"en_US\""));

    assertEquals("\"en_US_WIN\"", toJson(adapter, new Locale("en", "US", "WIN")));
    assertEquals(new Locale("en", "US", "WIN"), fromJson(adapter, "\"en_US_WIN\""));
  }

  @Test
  public void testJsonElement_writeAndRead() throws Exception {
    TypeAdapter<JsonElement> adapter = TypeAdapters.JSON_ELEMENT;

    assertEquals("null", toJson(adapter, null));
    assertEquals("null", toJson(adapter, JsonNull.INSTANCE));
    assertEquals(JsonNull.INSTANCE, fromJson(adapter, "null"));

    assertEquals("\"text\"", toJson(adapter, new JsonPrimitive("text")));
    assertEquals(new JsonPrimitive("text"), fromJson(adapter, "\"text\""));

    assertEquals("123", toJson(adapter, new JsonPrimitive(123)));
    assertEquals(new JsonPrimitive(123), fromJson(adapter, "123"));

    assertEquals("true", toJson(adapter, new JsonPrimitive(true)));
    assertEquals(new JsonPrimitive(true), fromJson(adapter, "true"));

    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("item1"));
    assertEquals("[\"item1\"]", toJson(adapter, array));
    assertEquals(array, fromJson(adapter, "[\"item1\"]"));

    JsonObject object = new JsonObject();
    object.addProperty("key", "val");
    assertEquals("{\"key\":\"val\"}", toJson(adapter, object));
    assertEquals(object, fromJson(adapter, "{\"key\":\"val\"}"));

    try {
      toJson(adapter, new JsonElement() {
        @Override
        public JsonElement deepCopy() {
          return this;
        }
      });
      fail();
    } catch (IllegalArgumentException expected) {}
  }

  @Test
  public void testEnumFactory_writeAndRead() throws Exception {
    Gson gson = new Gson();
    TypeAdapter<TestEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestEnum.class));
    assertNotNull(adapter);

    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class)));
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class)));

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"custom_first\"", toJson(adapter, TestEnum.FIRST));
    assertEquals(TestEnum.FIRST, fromJson(adapter, "\"custom_first\""));
    assertEquals(TestEnum.FIRST, fromJson(adapter, "\"alt_first_1\""));
    assertEquals(TestEnum.FIRST, fromJson(adapter, "\"alt_first_2\""));

    assertEquals("\"SECOND\"", toJson(adapter, TestEnum.SECOND));
    assertEquals(TestEnum.SECOND, fromJson(adapter, "\"SECOND\""));

    TypeAdapter<?> anonymousSubclassAdapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestEnum.SECOND.getClass()));
    assertNotNull(anonymousSubclassAdapter);
  }

  @Test
  public void testNewFactory_TypeToken() {
    TypeToken<String> token = TypeToken.get(String.class);
    TypeAdapterFactory factory = TypeAdapters.newFactory(token, TypeAdapters.STRING);
    Gson gson = new Gson();

    assertNotNull(factory.create(gson, token));
    assertNull(factory.create(gson, TypeToken.get(Integer.class)));
  }

  @Test
  public void testNewFactory_Class() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
    Gson gson = new Gson();

    assertNotNull(factory.create(gson, TypeToken.get(String.class)));
    assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertTrue(factory.toString().contains("Factory[type="));
  }

  @Test
  public void testNewFactory_UnboxedAndBoxed() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);
    Gson gson = new Gson();

    assertNotNull(factory.create(gson, TypeToken.get(int.class)));
    assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertNull(factory.create(gson, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Factory[type="));
  }

  @Test
  public void testNewFactoryForMultipleTypes() {
    TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
        Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
    Gson gson = new Gson();

    assertNotNull(factory.create(gson, TypeToken.get(Calendar.class)));
    assertNotNull(factory.create(gson, TypeToken.get(GregorianCalendar.class)));
    assertNull(factory.create(gson, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Factory[type="));
  }

  @Test
  public void testNewTypeHierarchyFactory() throws Exception {
    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);
    Gson gson = new Gson();

    TypeAdapter<Number> numberAdapter = factory.create(gson, TypeToken.get(Number.class));
    assertNotNull(numberAdapter);
    assertNull(factory.create(gson, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Factory[typeHierarchy="));

    TypeAdapter<Integer> integerAdapter = factory.create(gson, TypeToken.get(Integer.class));
    assertNotNull(integerAdapter);

    try {
      integerAdapter.fromJson("\"not_a_number\"");
      fail();
    } catch (JsonSyntaxException expected) {}
  }

  @Test
  public void testStaticFactoriesPresence() {
    assertNotNull(TypeAdapters.CLASS_FACTORY);
    assertNotNull(TypeAdapters.BIT_SET_FACTORY);
    assertNotNull(TypeAdapters.BOOLEAN_FACTORY);
    assertNotNull(TypeAdapters.BYTE_FACTORY);
    assertNotNull(TypeAdapters.SHORT_FACTORY);
    assertNotNull(TypeAdapters.INTEGER_FACTORY);
    assertNotNull(TypeAdapters.ATOMIC_INTEGER_FACTORY);
    assertNotNull(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
    assertNotNull(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
    assertNotNull(TypeAdapters.NUMBER_FACTORY);
    assertNotNull(TypeAdapters.CHARACTER_FACTORY);
    assertNotNull(TypeAdapters.STRING_FACTORY);
    assertNotNull(TypeAdapters.STRING_BUILDER_FACTORY);
    assertNotNull(TypeAdapters.STRING_BUFFER_FACTORY);
    assertNotNull(TypeAdapters.URL_FACTORY);
    assertNotNull(TypeAdapters.URI_FACTORY);
    assertNotNull(TypeAdapters.INET_ADDRESS_FACTORY);
    assertNotNull(TypeAdapters.UUID_FACTORY);
    assertNotNull(TypeAdapters.CURRENCY_FACTORY);
    assertNotNull(TypeAdapters.TIMESTAMP_FACTORY);
    assertNotNull(TypeAdapters.CALENDAR_FACTORY);
    assertNotNull(TypeAdapters.LOCALE_FACTORY);
    assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY);
    assertNotNull(TypeAdapters.ENUM_FACTORY);
  }
}
