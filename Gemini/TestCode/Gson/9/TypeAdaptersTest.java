package com.google.gson.internal.bind;

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
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

import org.junit.Assert;
import org.junit.Test;

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
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class TypeAdaptersTest {

  private enum SampleEnum {
    @SerializedName(value = "FIRST_NAME", alternate = {"first_name", "first"})
    FIRST,
    SECOND {
      @Override
      public String toString() {
        return "custom_second";
      }
    }
  }

  private static <T> String toJson(TypeAdapter<T> adapter, T value) throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    jsonWriter.setLenient(true);
    adapter.write(jsonWriter, value);
    return writer.toString();
  }

  private static <T> T fromJson(TypeAdapter<T> adapter, String json) throws IOException {
    JsonReader jsonReader = new JsonReader(new StringReader(json));
    jsonReader.setLenient(true);
    return adapter.read(jsonReader);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testPrivateConstructor_throwsUnsupportedOperationException() throws Throwable {
    Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    try {
      constructor.newInstance();
    } catch (InvocationTargetException e) {
      throw e.getCause();
    }
  }

  @Test
  public void testClassAdapter_nullReadWrite() throws IOException {
    Assert.assertEquals("null", toJson(TypeAdapters.CLASS, null));
    Assert.assertNull(fromJson(TypeAdapters.CLASS, "null"));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapter_writeThrowsException() throws IOException {
    toJson(TypeAdapters.CLASS, String.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapter_readThrowsException() throws IOException {
    fromJson(TypeAdapters.CLASS, "\"java.lang.String\"");
  }

  @Test
  public void testBitSetAdapter_validValues() throws IOException {
    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);
    bitSet.set(3);

    String json = toJson(TypeAdapters.BIT_SET, bitSet);
    Assert.assertEquals("[1,0,1,1]", json);

    BitSet parsed = fromJson(TypeAdapters.BIT_SET, "[1,0,1,1]");
    Assert.assertEquals(bitSet, parsed);

    BitSet parsedBooleansAndStrings = fromJson(TypeAdapters.BIT_SET, "[true, false, \"1\", \"0\"]");
    BitSet expected = new BitSet();
    expected.set(0);
    expected.set(2);
    Assert.assertEquals(expected, parsedBooleansAndStrings);

    Assert.assertEquals("null", toJson(TypeAdapters.BIT_SET, null));
    Assert.assertNull(fromJson(TypeAdapters.BIT_SET, "null"));
    Assert.assertEquals(new BitSet(), fromJson(TypeAdapters.BIT_SET, "[]"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetAdapter_invalidStringThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.BIT_SET, "[\"invalid\"]");
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetAdapter_invalidTokenTypeThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.BIT_SET, "[{}]");
  }

  @Test
  public void testBooleanAdapter_readWrite() throws IOException {
    Assert.assertEquals("true", toJson(TypeAdapters.BOOLEAN, true));
    Assert.assertEquals("false", toJson(TypeAdapters.BOOLEAN, false));
    Assert.assertEquals("null", toJson(TypeAdapters.BOOLEAN, null));

    Assert.assertTrue(fromJson(TypeAdapters.BOOLEAN, "true"));
    Assert.assertFalse(fromJson(TypeAdapters.BOOLEAN, "false"));
    Assert.assertTrue(fromJson(TypeAdapters.BOOLEAN, "\"true\""));
    Assert.assertFalse(fromJson(TypeAdapters.BOOLEAN, "\"false\""));
    Assert.assertFalse(fromJson(TypeAdapters.BOOLEAN, "\"not_a_boolean\""));
    Assert.assertNull(fromJson(TypeAdapters.BOOLEAN, "null"));
  }

  @Test
  public void testBooleanAsStringAdapter_readWrite() throws IOException {
    Assert.assertEquals("\"true\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, true));
    Assert.assertEquals("\"false\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, false));
    Assert.assertEquals("\"null\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, null));

    Assert.assertTrue(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"true\""));
    Assert.assertFalse(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"false\""));
    Assert.assertNull(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "null"));
  }

  @Test
  public void testByteAdapter_readWrite() throws IOException {
    Assert.assertEquals("12", toJson(TypeAdapters.BYTE, (byte) 12));
    Assert.assertEquals("null", toJson(TypeAdapters.BYTE, null));

    Assert.assertEquals(Byte.valueOf((byte) 12), fromJson(TypeAdapters.BYTE, "12"));
    Assert.assertNull(fromJson(TypeAdapters.BYTE, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testByteAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.BYTE, "\"abc\"");
  }

  @Test
  public void testShortAdapter_readWrite() throws IOException {
    Assert.assertEquals("123", toJson(TypeAdapters.SHORT, (short) 123));
    Assert.assertEquals("null", toJson(TypeAdapters.SHORT, null));

    Assert.assertEquals(Short.valueOf((short) 123), fromJson(TypeAdapters.SHORT, "123"));
    Assert.assertNull(fromJson(TypeAdapters.SHORT, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testShortAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.SHORT, "\"abc\"");
  }

  @Test
  public void testIntegerAdapter_readWrite() throws IOException {
    Assert.assertEquals("1234", toJson(TypeAdapters.INTEGER, 1234));
    Assert.assertEquals("null", toJson(TypeAdapters.INTEGER, null));

    Assert.assertEquals(Integer.valueOf(1234), fromJson(TypeAdapters.INTEGER, "1234"));
    Assert.assertNull(fromJson(TypeAdapters.INTEGER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testIntegerAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.INTEGER, "\"abc\"");
  }

  @Test
  public void testAtomicIntegerAdapter_readWrite() throws IOException {
    Assert.assertEquals("123", toJson(TypeAdapters.ATOMIC_INTEGER, new AtomicInteger(123)));
    Assert.assertEquals("null", toJson(TypeAdapters.ATOMIC_INTEGER, null));

    Assert.assertEquals(123, fromJson(TypeAdapters.ATOMIC_INTEGER, "123").get());
    Assert.assertNull(fromJson(TypeAdapters.ATOMIC_INTEGER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testAtomicIntegerAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.ATOMIC_INTEGER, "\"abc\"");
  }

  @Test
  public void testAtomicBooleanAdapter_readWrite() throws IOException {
    Assert.assertEquals("true", toJson(TypeAdapters.ATOMIC_BOOLEAN, new AtomicBoolean(true)));
    Assert.assertEquals("false", toJson(TypeAdapters.ATOMIC_BOOLEAN, new AtomicBoolean(false)));
    Assert.assertEquals("null", toJson(TypeAdapters.ATOMIC_BOOLEAN, null));

    Assert.assertTrue(fromJson(TypeAdapters.ATOMIC_BOOLEAN, "true").get());
    Assert.assertFalse(fromJson(TypeAdapters.ATOMIC_BOOLEAN, "false").get());
    Assert.assertNull(fromJson(TypeAdapters.ATOMIC_BOOLEAN, "null"));
  }

  @Test
  public void testAtomicIntegerArrayAdapter_readWrite() throws IOException {
    AtomicIntegerArray array = new AtomicIntegerArray(new int[]{1, 2, 3});
    Assert.assertEquals("[1,2,3]", toJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, array));
    Assert.assertEquals("null", toJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, null));

    AtomicIntegerArray parsed = fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[1,2,3]");
    Assert.assertEquals(3, parsed.length());
    Assert.assertEquals(1, parsed.get(0));
    Assert.assertEquals(2, parsed.get(1));
    Assert.assertEquals(3, parsed.get(2));

    AtomicIntegerArray empty = fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[]");
    Assert.assertEquals(0, empty.length());
    Assert.assertNull(fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testAtomicIntegerArrayAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.ATOMIC_INTEGER_ARRAY, "[1, \"abc\"]");
  }

  @Test
  public void testLongAdapter_readWrite() throws IOException {
    Assert.assertEquals("1234567890123", toJson(TypeAdapters.LONG, 1234567890123L));
    Assert.assertEquals("null", toJson(TypeAdapters.LONG, null));

    Assert.assertEquals(Long.valueOf(1234567890123L), fromJson(TypeAdapters.LONG, "1234567890123"));
    Assert.assertNull(fromJson(TypeAdapters.LONG, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testLongAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.LONG, "\"abc\"");
  }

  @Test
  public void testFloatAdapter_readWrite() throws IOException {
    Assert.assertEquals("1.25", toJson(TypeAdapters.FLOAT, 1.25f));
    Assert.assertEquals("null", toJson(TypeAdapters.FLOAT, null));

    Assert.assertEquals(Float.valueOf(1.25f), fromJson(TypeAdapters.FLOAT, "1.25"));
    Assert.assertNull(fromJson(TypeAdapters.FLOAT, "null"));
  }

  @Test
  public void testDoubleAdapter_readWrite() throws IOException {
    Assert.assertEquals("1.25", toJson(TypeAdapters.DOUBLE, 1.25d));
    Assert.assertEquals("null", toJson(TypeAdapters.DOUBLE, null));

    Assert.assertEquals(Double.valueOf(1.25d), fromJson(TypeAdapters.DOUBLE, "1.25"));
    Assert.assertNull(fromJson(TypeAdapters.DOUBLE, "null"));
  }

  @Test
  public void testNumberAdapter_readWrite() throws IOException {
    Assert.assertEquals("100", toJson(TypeAdapters.NUMBER, 100));
    Assert.assertEquals("null", toJson(TypeAdapters.NUMBER, null));

    Number parsed = fromJson(TypeAdapters.NUMBER, "100.5");
    Assert.assertTrue(parsed instanceof LazilyParsedNumber);
    Assert.assertEquals("100.5", parsed.toString());
    Assert.assertNull(fromJson(TypeAdapters.NUMBER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumberAdapter_invalidTokenThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.NUMBER, "\"not_a_number\"");
  }

  @Test
  public void testCharacterAdapter_readWrite() throws IOException {
    Assert.assertEquals("\"a\"", toJson(TypeAdapters.CHARACTER, 'a'));
    Assert.assertEquals("null", toJson(TypeAdapters.CHARACTER, null));

    Assert.assertEquals(Character.valueOf('a'), fromJson(TypeAdapters.CHARACTER, "\"a\""));
    Assert.assertNull(fromJson(TypeAdapters.CHARACTER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacterAdapter_multiCharStringThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.CHARACTER, "\"abc\"");
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacterAdapter_emptyStringThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.CHARACTER, "\"\"");
  }

  @Test
  public void testStringAdapter_readWrite() throws IOException {
    Assert.assertEquals("\"hello\"", toJson(TypeAdapters.STRING, "hello"));
    Assert.assertEquals("null", toJson(TypeAdapters.STRING, null));

    Assert.assertEquals("hello", fromJson(TypeAdapters.STRING, "\"hello\""));
    Assert.assertEquals("true", fromJson(TypeAdapters.STRING, "true"));
    Assert.assertNull(fromJson(TypeAdapters.STRING, "null"));
  }

  @Test
  public void testBigDecimalAdapter_readWrite() throws IOException {
    BigDecimal bd = new BigDecimal("12345.67890");
    Assert.assertEquals("12345.67890", toJson(TypeAdapters.BIG_DECIMAL, bd));
    Assert.assertEquals("null", toJson(TypeAdapters.BIG_DECIMAL, null));

    Assert.assertEquals(bd, fromJson(TypeAdapters.BIG_DECIMAL, "12345.67890"));
    Assert.assertNull(fromJson(TypeAdapters.BIG_DECIMAL, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigDecimalAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.BIG_DECIMAL, "\"invalid\"");
  }

  @Test
  public void testBigIntegerAdapter_readWrite() throws IOException {
    BigInteger bi = new BigInteger("12345678901234567890");
    Assert.assertEquals("12345678901234567890", toJson(TypeAdapters.BIG_INTEGER, bi));
    Assert.assertEquals("null", toJson(TypeAdapters.BIG_INTEGER, null));

    Assert.assertEquals(bi, fromJson(TypeAdapters.BIG_INTEGER, "12345678901234567890"));
    Assert.assertNull(fromJson(TypeAdapters.BIG_INTEGER, "null"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigIntegerAdapter_invalidFormatThrowsJsonSyntaxException() throws IOException {
    fromJson(TypeAdapters.BIG_INTEGER, "\"invalid\"");
  }

  @Test
  public void testStringBuilderAdapter_readWrite() throws IOException {
    Assert.assertEquals("\"hello\"", toJson(TypeAdapters.STRING_BUILDER, new StringBuilder("hello")));
    Assert.assertEquals("null", toJson(TypeAdapters.STRING_BUILDER, null));

    Assert.assertEquals("hello", fromJson(TypeAdapters.STRING_BUILDER, "\"hello\"").toString());
    Assert.assertNull(fromJson(TypeAdapters.STRING_BUILDER, "null"));
  }

  @Test
  public void testStringBufferAdapter_readWrite() throws IOException {
    Assert.assertEquals("\"hello\"", toJson(TypeAdapters.STRING_BUFFER, new StringBuffer("hello")));
    Assert.assertEquals("null", toJson(TypeAdapters.STRING_BUFFER, null));

    Assert.assertEquals("hello", fromJson(TypeAdapters.STRING_BUFFER, "\"hello\"").toString());
    Assert.assertNull(fromJson(TypeAdapters.STRING_BUFFER, "null"));
  }

  @Test
  public void testUrlAdapter_readWrite() throws IOException {
    URL url = new URL("http://example.com:80/path?query=1#frag");
    Assert.assertEquals("\"http://example.com:80/path?query=1#frag\"", toJson(TypeAdapters.URL, url));
    Assert.assertEquals("null", toJson(TypeAdapters.URL, null));

    Assert.assertEquals(url, fromJson(TypeAdapters.URL, "\"http://example.com:80/path?query=1#frag\""));
    Assert.assertNull(fromJson(TypeAdapters.URL, "null"));
    Assert.assertNull(fromJson(TypeAdapters.URL, "\"null\""));
  }

  @Test
  public void testUriAdapter_readWrite() throws IOException {
    URI uri = URI.create("http://example.com/test");
    Assert.assertEquals("\"http://example.com/test\"", toJson(TypeAdapters.URI, uri));
    Assert.assertEquals("null", toJson(TypeAdapters.URI, null));

    Assert.assertEquals(uri, fromJson(TypeAdapters.URI, "\"http://example.com/test\""));
    Assert.assertNull(fromJson(TypeAdapters.URI, "null"));
    Assert.assertNull(fromJson(TypeAdapters.URI, "\"null\""));
  }

  @Test(expected = JsonIOException.class)
  public void testUriAdapter_invalidSyntaxThrowsJsonIOException() throws IOException {
    fromJson(TypeAdapters.URI, "\"http://example .com/test with spaces\"");
  }

  @Test
  public void testInetAddressAdapter_readWrite() throws IOException {
    InetAddress addr = InetAddress.getByName("127.0.0.1");
    Assert.assertEquals("\"127.0.0.1\"", toJson(TypeAdapters.INET_ADDRESS, addr));
    Assert.assertEquals("null", toJson(TypeAdapters.INET_ADDRESS, null));

    InetAddress parsed = fromJson(TypeAdapters.INET_ADDRESS, "\"127.0.0.1\"");
    Assert.assertEquals(addr.getHostAddress(), parsed.getHostAddress());
    Assert.assertNull(fromJson(TypeAdapters.INET_ADDRESS, "null"));
  }

  @Test
  public void testUuidAdapter_readWrite() throws IOException {
    UUID uuid = UUID.randomUUID();
    Assert.assertEquals("\"" + uuid.toString() + "\"", toJson(TypeAdapters.UUID, uuid));
    Assert.assertEquals("null", toJson(TypeAdapters.UUID, null));

    Assert.assertEquals(uuid, fromJson(TypeAdapters.UUID, "\"" + uuid.toString() + "\""));
    Assert.assertNull(fromJson(TypeAdapters.UUID, "null"));
  }

  @Test
  public void testCurrencyAdapter_readWrite() throws IOException {
    Currency currency = Currency.getInstance("USD");
    Assert.assertEquals("\"USD\"", toJson(TypeAdapters.CURRENCY, currency));
    Assert.assertEquals("null", toJson(TypeAdapters.CURRENCY, null));

    Assert.assertEquals(currency, fromJson(TypeAdapters.CURRENCY, "\"USD\""));
    Assert.assertNull(fromJson(TypeAdapters.CURRENCY, "null"));
  }

  @Test
  public void testTimestampFactory_readWrite() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    Assert.assertNotNull(adapter);
    Assert.assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(String.class)));

    Timestamp timestamp = new Timestamp(1000L);
    String json = toJson(adapter, timestamp);
    Timestamp parsed = fromJson(adapter, json);
    Assert.assertNotNull(parsed);
    Assert.assertEquals(timestamp.getTime(), parsed.getTime());

    Assert.assertEquals("null", toJson(adapter, null));
    Assert.assertNull(fromJson(adapter, "null"));
  }

  @Test
  public void testCalendarAdapter_readWrite() throws IOException {
    Calendar cal = new GregorianCalendar(2023, Calendar.JANUARY, 15, 10, 30, 45);
    String json = toJson(TypeAdapters.CALENDAR, cal);
    Assert.assertTrue(json.contains("\"year\":2023"));
    Assert.assertTrue(json.contains("\"month\":0"));
    Assert.assertTrue(json.contains("\"dayOfMonth\":15"));
    Assert.assertTrue(json.contains("\"hourOfDay\":10"));
    Assert.assertTrue(json.contains("\"minute\":30"));
    Assert.assertTrue(json.contains("\"second\":45"));

    Calendar parsed = fromJson(TypeAdapters.CALENDAR, json);
    Assert.assertEquals(2023, parsed.get(Calendar.YEAR));
    Assert.assertEquals(Calendar.JANUARY, parsed.get(Calendar.MONTH));
    Assert.assertEquals(15, parsed.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(10, parsed.get(Calendar.HOUR_OF_DAY));
    Assert.assertEquals(30, parsed.get(Calendar.MINUTE));
    Assert.assertEquals(45, parsed.get(Calendar.SECOND));

    Assert.assertEquals("null", toJson(TypeAdapters.CALENDAR, null));
    Assert.assertNull(fromJson(TypeAdapters.CALENDAR, "null"));

    Calendar partial = fromJson(TypeAdapters.CALENDAR, "{\"year\":2021}");
    Assert.assertEquals(2021, partial.get(Calendar.YEAR));
    Assert.assertEquals(0, partial.get(Calendar.MONTH));
  }

  @Test
  public void testLocaleAdapter_readWrite() throws IOException {
    Assert.assertEquals("\"en_US_WIN\"", toJson(TypeAdapters.LOCALE, new Locale("en", "US", "WIN")));
    Assert.assertEquals("\"en_US\"", toJson(TypeAdapters.LOCALE, new Locale("en", "US")));
    Assert.assertEquals("\"en\"", toJson(TypeAdapters.LOCALE, new Locale("en")));
    Assert.assertEquals("null", toJson(TypeAdapters.LOCALE, null));

    Assert.assertEquals(new Locale("en", "US", "WIN"), fromJson(TypeAdapters.LOCALE, "\"en_US_WIN\""));
    Assert.assertEquals(new Locale("en", "US"), fromJson(TypeAdapters.LOCALE, "\"en_US\""));
    Assert.assertEquals(new Locale("en"), fromJson(TypeAdapters.LOCALE, "\"en\""));
    Assert.assertNull(fromJson(TypeAdapters.LOCALE, "null"));
  }

  @Test
  public void testJsonElementAdapter_primitivesAndNull() throws IOException {
    Assert.assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
    Assert.assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, null));
    Assert.assertEquals("\"str\"", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive("str")));
    Assert.assertEquals("123", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(123)));
    Assert.assertEquals("true", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(true)));

    Assert.assertEquals(JsonNull.INSTANCE, fromJson(TypeAdapters.JSON_ELEMENT, "null"));
    Assert.assertEquals(new JsonPrimitive("str"), fromJson(TypeAdapters.JSON_ELEMENT, "\"str\""));
    Assert.assertEquals(new JsonPrimitive(123), fromJson(TypeAdapters.JSON_ELEMENT, "123"));
    Assert.assertEquals(new JsonPrimitive(true), fromJson(TypeAdapters.JSON_ELEMENT, "true"));
  }

  @Test
  public void testJsonElementAdapter_arrayAndObject() throws IOException {
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive(1));
    array.add(new JsonPrimitive("a"));
    Assert.assertEquals("[1,\"a\"]", toJson(TypeAdapters.JSON_ELEMENT, array));
    Assert.assertEquals(array, fromJson(TypeAdapters.JSON_ELEMENT, "[1,\"a\"]"));

    JsonObject object = new JsonObject();
    object.addProperty("key", "value");
    Assert.assertEquals("{\"key\":\"value\"}", toJson(TypeAdapters.JSON_ELEMENT, object));
    Assert.assertEquals(object, fromJson(TypeAdapters.JSON_ELEMENT, "{\"key\":\"value\"}"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementAdapter_customSubclassWriteThrowsIllegalArgumentException() throws IOException {
    JsonElement customElement = new JsonElement() {
      @Override
      public JsonElement deepCopy() {
        return this;
      }
    };
    toJson(TypeAdapters.JSON_ELEMENT, customElement);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementAdapter_invalidTokenReadThrowsIllegalArgumentException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(""));
    TypeAdapters.JSON_ELEMENT.read(reader);
  }

  @Test
  public void testEnumAdapter_readWrite() throws IOException {
    Gson gson = new Gson();
    TypeAdapter<SampleEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(SampleEnum.class));
    Assert.assertNotNull(adapter);

    Assert.assertEquals("\"FIRST_NAME\"", toJson(adapter, SampleEnum.FIRST));
    Assert.assertEquals("\"SECOND\"", toJson(adapter, SampleEnum.SECOND));
    Assert.assertEquals("null", toJson(adapter, null));

    Assert.assertEquals(SampleEnum.FIRST, fromJson(adapter, "\"FIRST_NAME\""));
    Assert.assertEquals(SampleEnum.FIRST, fromJson(adapter, "\"first_name\""));
    Assert.assertEquals(SampleEnum.FIRST, fromJson(adapter, "\"first\""));
    Assert.assertEquals(SampleEnum.SECOND, fromJson(adapter, "\"SECOND\""));
    Assert.assertNull(fromJson(adapter, "null"));
    Assert.assertNull(fromJson(adapter, "\"NON_EXISTENT\""));
  }

  @Test
  public void testEnumFactory_nonEnumTypesReturnNull() {
    Gson gson = new Gson();
    Assert.assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class)));
    Assert.assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class)));
  }

  @Test
  public void testNewFactory_typeToken() {
    TypeToken<String> token = TypeToken.get(String.class);
    TypeAdapterFactory factory = TypeAdapters.newFactory(token, TypeAdapters.STRING);
    Gson gson = new Gson();

    Assert.assertNotNull(factory.create(gson, token));
    Assert.assertNull(factory.create(gson, TypeToken.get(Integer.class)));
  }

  @Test
  public void testNewFactory_class() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);
    Gson gson = new Gson();

    Assert.assertNotNull(factory.create(gson, TypeToken.get(String.class)));
    Assert.assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    Assert.assertTrue(factory.toString().contains("Factory[type=java.lang.String"));
  }

  @Test
  public void testNewFactory_unboxedBoxed() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);
    Gson gson = new Gson();

    Assert.assertNotNull(factory.create(gson, TypeToken.get(int.class)));
    Assert.assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
    Assert.assertNull(factory.create(gson, TypeToken.get(String.class)));
    Assert.assertTrue(factory.toString().contains("Factory[type=java.lang.Integer+int"));
  }

  @Test
  public void testNewFactoryForMultipleTypes() {
    TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
        Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);
    Gson gson = new Gson();

    Assert.assertNotNull(factory.create(gson, TypeToken.get(Calendar.class)));
    Assert.assertNotNull(factory.create(gson, TypeToken.get(GregorianCalendar.class)));
    Assert.assertNull(factory.create(gson, TypeToken.get(String.class)));
    Assert.assertTrue(factory.toString().contains("Factory[type=java.util.Calendar+java.util.GregorianCalendar"));
  }

  @Test
  public void testNewTypeHierarchyFactory_readWriteAndToString() throws IOException {
    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);
    Gson gson = new Gson();

    TypeAdapter<Number> adapter = factory.create(gson, TypeToken.get(Number.class));
    Assert.assertNotNull(adapter);
    Assert.assertNull(factory.create(gson, TypeToken.get(String.class)));
    Assert.assertTrue(factory.toString().contains("Factory[typeHierarchy=java.lang.Number"));

    Assert.assertEquals("100", toJson(adapter, 100));
    Number parsed = fromJson(adapter, "100");
    Assert.assertEquals("100", parsed.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNewTypeHierarchyFactory_mismatchedTypeThrowsJsonSyntaxException() throws IOException {
    TypeAdapter<Object> mockAdapter = new TypeAdapter<Object>() {
      @Override
      public void write(JsonWriter out, Object value) throws IOException {
        out.value(value.toString());
      }
      @Override
      public Object read(JsonReader in) throws IOException {
        in.nextString();
        return "not an integer";
      }
    };
    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Object.class, mockAdapter);
    Gson gson = new Gson();
    TypeAdapter<Integer> intAdapter = factory.create(gson, TypeToken.get(Integer.class));
    fromJson(intAdapter, "\"some_string\"");
  }

  @Test
  public void testStaticFactoriesAreInitialized() {
    Gson gson = new Gson();
    Assert.assertNotNull(TypeAdapters.CLASS_FACTORY.create(gson, TypeToken.get(Class.class)));
    Assert.assertNotNull(TypeAdapters.BIT_SET_FACTORY.create(gson, TypeToken.get(BitSet.class)));
    Assert.assertNotNull(TypeAdapters.BOOLEAN_FACTORY.create(gson, TypeToken.get(Boolean.class)));
    Assert.assertNotNull(TypeAdapters.BYTE_FACTORY.create(gson, TypeToken.get(Byte.class)));
    Assert.assertNotNull(TypeAdapters.SHORT_FACTORY.create(gson, TypeToken.get(Short.class)));
    Assert.assertNotNull(TypeAdapters.INTEGER_FACTORY.create(gson, TypeToken.get(Integer.class)));
    Assert.assertNotNull(TypeAdapters.ATOMIC_INTEGER_FACTORY.create(gson, TypeToken.get(AtomicInteger.class)));
    Assert.assertNotNull(TypeAdapters.ATOMIC_BOOLEAN_FACTORY.create(gson, TypeToken.get(AtomicBoolean.class)));
    Assert.assertNotNull(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY.create(gson, TypeToken.get(AtomicIntegerArray.class)));
    Assert.assertNotNull(TypeAdapters.NUMBER_FACTORY.create(gson, TypeToken.get(Number.class)));
    Assert.assertNotNull(TypeAdapters.CHARACTER_FACTORY.create(gson, TypeToken.get(Character.class)));
    Assert.assertNotNull(TypeAdapters.STRING_FACTORY.create(gson, TypeToken.get(String.class)));
    Assert.assertNotNull(TypeAdapters.STRING_BUILDER_FACTORY.create(gson, TypeToken.get(StringBuilder.class)));
    Assert.assertNotNull(TypeAdapters.STRING_BUFFER_FACTORY.create(gson, TypeToken.get(StringBuffer.class)));
    Assert.assertNotNull(TypeAdapters.URL_FACTORY.create(gson, TypeToken.get(URL.class)));
    Assert.assertNotNull(TypeAdapters.URI_FACTORY.create(gson, TypeToken.get(URI.class)));
    Assert.assertNotNull(TypeAdapters.INET_ADDRESS_FACTORY.create(gson, TypeToken.get(InetAddress.class)));
    Assert.assertNotNull(TypeAdapters.UUID_FACTORY.create(gson, TypeToken.get(UUID.class)));
    Assert.assertNotNull(TypeAdapters.CURRENCY_FACTORY.create(gson, TypeToken.get(Currency.class)));
    Assert.assertNotNull(TypeAdapters.LOCALE_FACTORY.create(gson, TypeToken.get(Locale.class)));
    Assert.assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY.create(gson, TypeToken.get(JsonElement.class)));
  }
}
