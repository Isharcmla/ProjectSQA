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
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
import org.junit.Test;

public class TypeAdaptersTest {

  private final Gson gson = new Gson();

  private enum TestEnum {
    @SerializedName(value = "first_name", alternate = {"first_alt1", "first_alt2"})
    FIRST,
    SECOND {
      @Override
      public String toString() {
        return "custom_second";
      }
    }
  }

  private <T> String toJson(TypeAdapter<T> adapter, T value) throws IOException {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    adapter.write(jsonWriter, value);
    return writer.toString();
  }

  private <T> T fromJson(TypeAdapter<T> adapter, String json) throws IOException {
    JsonReader jsonReader = new JsonReader(new StringReader(json));
    return adapter.read(jsonReader);
  }

  @Test(expected = InvocationTargetException.class)
  public void testPrivateConstructor_throwsException() throws Exception {
    Constructor<TypeAdapters> constructor = TypeAdapters.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    constructor.newInstance();
  }

  @Test
  public void testClassAdapter_readWriteNull_success() throws IOException {
    assertEquals("null", toJson(TypeAdapters.CLASS, null));
    assertNull(fromJson(TypeAdapters.CLASS, "null"));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapter_writeNonNull_throwsException() throws IOException {
    toJson(TypeAdapters.CLASS, String.class);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testClassAdapter_readNonNull_throwsException() throws IOException {
    fromJson(TypeAdapters.CLASS, "\"java.lang.String\"");
  }

  @Test
  public void testBitSetAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.BIT_SET, null));
    assertNull(fromJson(TypeAdapters.BIT_SET, "null"));

    BitSet bitSet = new BitSet();
    bitSet.set(0);
    bitSet.set(2);
    bitSet.set(3);
    String json = toJson(TypeAdapters.BIT_SET, bitSet);
    assertEquals("[1,0,1,1]", json);

    BitSet readSet = fromJson(TypeAdapters.BIT_SET, "[1,0,1,1]");
    assertEquals(bitSet, readSet);

    BitSet readFromBools = fromJson(TypeAdapters.BIT_SET, "[true,false,true]");
    assertTrue(readFromBools.get(0));
    assertFalse(readFromBools.get(1));
    assertTrue(readFromBools.get(2));

    BitSet readFromStrings = fromJson(TypeAdapters.BIT_SET, "[\"1\",\"0\",\"1\"]");
    assertTrue(readFromStrings.get(0));
    assertFalse(readFromStrings.get(1));
    assertTrue(readFromStrings.get(2));

    BitSet emptySet = fromJson(TypeAdapters.BIT_SET, "[]");
    assertTrue(emptySet.isEmpty());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetAdapter_invalidString_throwsException() throws IOException {
    fromJson(TypeAdapters.BIT_SET, "[\"invalid\"]");
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBitSetAdapter_invalidToken_throwsException() throws IOException {
    fromJson(TypeAdapters.BIT_SET, "[null]");
  }

  @Test
  public void testBooleanAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.BOOLEAN, null));
    assertEquals("true", toJson(TypeAdapters.BOOLEAN, true));
    assertEquals("false", toJson(TypeAdapters.BOOLEAN, false));

    assertNull(fromJson(TypeAdapters.BOOLEAN, "null"));
    assertTrue(fromJson(TypeAdapters.BOOLEAN, "true"));
    assertFalse(fromJson(TypeAdapters.BOOLEAN, "false"));
    assertTrue(fromJson(TypeAdapters.BOOLEAN, "\"true\""));
    assertFalse(fromJson(TypeAdapters.BOOLEAN, "\"false\""));
  }

  @Test
  public void testBooleanAsStringAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("\"null\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, null));
    assertEquals("\"true\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, true));
    assertEquals("\"false\"", toJson(TypeAdapters.BOOLEAN_AS_STRING, false));

    assertNull(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "null"));
    assertTrue(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"true\""));
    assertFalse(fromJson(TypeAdapters.BOOLEAN_AS_STRING, "\"false\""));
  }

  @Test
  public void testByteAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.BYTE, null));
    assertEquals("12", toJson(TypeAdapters.BYTE, (byte) 12));
    assertEquals("-12", toJson(TypeAdapters.BYTE, (byte) -12));

    assertNull(fromJson(TypeAdapters.BYTE, "null"));
    assertEquals(Byte.valueOf((byte) 12), fromJson(TypeAdapters.BYTE, "12"));
    assertEquals(Byte.valueOf((byte) 0), fromJson(TypeAdapters.BYTE, "0"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testByteAdapter_invalidFormat_throwsException() throws IOException {
    fromJson(TypeAdapters.BYTE, "\"not-a-number\"");
  }

  @Test
  public void testShortAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.SHORT, null));
    assertEquals("123", toJson(TypeAdapters.SHORT, (short) 123));

    assertNull(fromJson(TypeAdapters.SHORT, "null"));
    assertEquals(Short.valueOf((short) 123), fromJson(TypeAdapters.SHORT, "123"));
    assertEquals(Short.valueOf((short) -123), fromJson(TypeAdapters.SHORT, "-123"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testShortAdapter_invalidFormat_throwsException() throws IOException {
    fromJson(TypeAdapters.SHORT, "\"invalid\"");
  }

  @Test
  public void testIntegerAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.INTEGER, null));
    assertEquals("12345", toJson(TypeAdapters.INTEGER, 12345));

    assertNull(fromJson(TypeAdapters.INTEGER, "null"));
    assertEquals(Integer.valueOf(12345), fromJson(TypeAdapters.INTEGER, "12345"));
    assertEquals(Integer.valueOf(-12345), fromJson(TypeAdapters.INTEGER, "-12345"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testIntegerAdapter_invalidFormat_throwsException() throws IOException {
    fromJson(TypeAdapters.INTEGER, "\"invalid\"");
  }

  @Test
  public void testLongAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.LONG, null));
    assertEquals("1234567890123", toJson(TypeAdapters.LONG, 1234567890123L));

    assertNull(fromJson(TypeAdapters.LONG, "null"));
    assertEquals(Long.valueOf(1234567890123L), fromJson(TypeAdapters.LONG, "1234567890123"));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testLongAdapter_invalidFormat_throwsException() throws IOException {
    fromJson(TypeAdapters.LONG, "\"invalid\"");
  }

  @Test
  public void testFloatAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.FLOAT, null));
    assertEquals("12.34", toJson(TypeAdapters.FLOAT, 12.34f));

    assertNull(fromJson(TypeAdapters.FLOAT, "null"));
    assertEquals(Float.valueOf(12.34f), fromJson(TypeAdapters.FLOAT, "12.34"));
    assertEquals(Float.valueOf(0.0f), fromJson(TypeAdapters.FLOAT, "0"));
  }

  @Test
  public void testDoubleAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.DOUBLE, null));
    assertEquals("123.456", toJson(TypeAdapters.DOUBLE, 123.456));

    assertNull(fromJson(TypeAdapters.DOUBLE, "null"));
    assertEquals(Double.valueOf(123.456), fromJson(TypeAdapters.DOUBLE, "123.456"));
  }

  @Test
  public void testNumberAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.NUMBER, null));
    assertEquals("123", toJson(TypeAdapters.NUMBER, new LazilyParsedNumber("123")));

    assertNull(fromJson(TypeAdapters.NUMBER, "null"));
    Number num = fromJson(TypeAdapters.NUMBER, "123.45");
    assertEquals("123.45", num.toString());
  }

  @Test(expected = JsonSyntaxException.class)
  public void testNumberAdapter_invalidToken_throwsException() throws IOException {
    fromJson(TypeAdapters.NUMBER, "true");
  }

  @Test
  public void testCharacterAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.CHARACTER, null));
    assertEquals("\"a\"", toJson(TypeAdapters.CHARACTER, 'a'));

    assertNull(fromJson(TypeAdapters.CHARACTER, "null"));
    assertEquals(Character.valueOf('a'), fromJson(TypeAdapters.CHARACTER, "\"a\""));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testCharacterAdapter_invalidLength_throwsException() throws IOException {
    fromJson(TypeAdapters.CHARACTER, "\"abc\"");
  }

  @Test
  public void testStringAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.STRING, null));
    assertEquals("\"hello\"", toJson(TypeAdapters.STRING, "hello"));
    assertEquals("\"\"", toJson(TypeAdapters.STRING, ""));

    assertNull(fromJson(TypeAdapters.STRING, "null"));
    assertEquals("hello", fromJson(TypeAdapters.STRING, "\"hello\""));
    assertEquals("true", fromJson(TypeAdapters.STRING, "true"));
    assertEquals("false", fromJson(TypeAdapters.STRING, "false"));
  }

  @Test
  public void testBigDecimalAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.BIG_DECIMAL, null));
    assertEquals("1234.5678", toJson(TypeAdapters.BIG_DECIMAL, new BigDecimal("1234.5678")));

    assertNull(fromJson(TypeAdapters.BIG_DECIMAL, "null"));
    assertEquals(new BigDecimal("1234.5678"), fromJson(TypeAdapters.BIG_DECIMAL, "\"1234.5678\""));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigDecimalAdapter_invalidFormat_throwsException() throws IOException {
    fromJson(TypeAdapters.BIG_DECIMAL, "\"not-a-number\"");
  }

  @Test
  public void testBigIntegerAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.BIG_INTEGER, null));
    assertEquals("12345678901234567890", toJson(TypeAdapters.BIG_INTEGER, new BigInteger("12345678901234567890")));

    assertNull(fromJson(TypeAdapters.BIG_INTEGER, "null"));
    assertEquals(new BigInteger("12345678901234567890"), fromJson(TypeAdapters.BIG_INTEGER, "\"12345678901234567890\""));
  }

  @Test(expected = JsonSyntaxException.class)
  public void testBigIntegerAdapter_invalidFormat_throwsException() throws IOException {
    fromJson(TypeAdapters.BIG_INTEGER, "\"invalid\"");
  }

  @Test
  public void testStringBuilderAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.STRING_BUILDER, null));
    assertEquals("\"gson\"", toJson(TypeAdapters.STRING_BUILDER, new StringBuilder("gson")));

    assertNull(fromJson(TypeAdapters.STRING_BUILDER, "null"));
    assertEquals("gson", fromJson(TypeAdapters.STRING_BUILDER, "\"gson\"").toString());
  }

  @Test
  public void testStringBufferAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.STRING_BUFFER, null));
    assertEquals("\"gson\"", toJson(TypeAdapters.STRING_BUFFER, new StringBuffer("gson")));

    assertNull(fromJson(TypeAdapters.STRING_BUFFER, "null"));
    assertEquals("gson", fromJson(TypeAdapters.STRING_BUFFER, "\"gson\"").toString());
  }

  @Test
  public void testUrlAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.URL, null));
    assertEquals("\"https://example.com\"", toJson(TypeAdapters.URL, new URL("https://example.com")));

    assertNull(fromJson(TypeAdapters.URL, "null"));
    assertNull(fromJson(TypeAdapters.URL, "\"null\""));
    assertEquals(new URL("https://example.com"), fromJson(TypeAdapters.URL, "\"https://example.com\""));
  }

  @Test
  public void testUriAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.URI, null));
    assertEquals("\"https://example.com\"", toJson(TypeAdapters.URI, new URI("https://example.com")));

    assertNull(fromJson(TypeAdapters.URI, "null"));
    assertNull(fromJson(TypeAdapters.URI, "\"null\""));
    assertEquals(new URI("https://example.com"), fromJson(TypeAdapters.URI, "\"https://example.com\""));
  }

  @Test(expected = JsonIOException.class)
  public void testUriAdapter_invalidSyntax_throwsException() throws IOException {
    fromJson(TypeAdapters.URI, "\"https://example .com/invalid\"");
  }

  @Test
  public void testInetAddressAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.INET_ADDRESS, null));
    InetAddress address = InetAddress.getByName("127.0.0.1");
    assertEquals("\"127.0.0.1\"", toJson(TypeAdapters.INET_ADDRESS, address));

    assertNull(fromJson(TypeAdapters.INET_ADDRESS, "null"));
    assertEquals(address, fromJson(TypeAdapters.INET_ADDRESS, "\"127.0.0.1\""));
  }

  @Test
  public void testUuidAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.UUID, null));
    UUID uuid = UUID.randomUUID();
    assertEquals("\"" + uuid.toString() + "\"", toJson(TypeAdapters.UUID, uuid));

    assertNull(fromJson(TypeAdapters.UUID, "null"));
    assertEquals(uuid, fromJson(TypeAdapters.UUID, "\"" + uuid.toString() + "\""));
  }

  @Test
  public void testTimestampFactory_normalAndEdgeCases() throws IOException {
    TypeAdapter<Timestamp> adapter = TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Timestamp.class));
    assertNotNull(adapter);
    assertNull(TypeAdapters.TIMESTAMP_FACTORY.create(gson, TypeToken.get(Date.class)));

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    Timestamp timestamp = new Timestamp(1000000L);
    String json = toJson(adapter, timestamp);
    Timestamp read = fromJson(adapter, json);
    assertEquals(timestamp.getTime(), read.getTime());
  }

  @Test
  public void testCalendarAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.CALENDAR, null));
    assertNull(fromJson(TypeAdapters.CALENDAR, "null"));

    Calendar cal = new GregorianCalendar(2023, 4, 15, 10, 30, 45);
    String json = toJson(TypeAdapters.CALENDAR, cal);
    Calendar readCal = fromJson(TypeAdapters.CALENDAR, json);

    assertEquals(2023, readCal.get(Calendar.YEAR));
    assertEquals(4, readCal.get(Calendar.MONTH));
    assertEquals(15, readCal.get(Calendar.DAY_OF_MONTH));
    assertEquals(10, readCal.get(Calendar.HOUR_OF_DAY));
    assertEquals(30, readCal.get(Calendar.MINUTE));
    assertEquals(45, readCal.get(Calendar.SECOND));
  }

  @Test
  public void testLocaleAdapter_normalAndEdgeCases() throws IOException {
    assertEquals("null", toJson(TypeAdapters.LOCALE, null));
    assertNull(fromJson(TypeAdapters.LOCALE, "null"));

    assertEquals("\"en\"", toJson(TypeAdapters.LOCALE, new Locale("en")));
    assertEquals(new Locale("en"), fromJson(TypeAdapters.LOCALE, "\"en\""));

    assertEquals("\"en_US\"", toJson(TypeAdapters.LOCALE, new Locale("en", "US")));
    assertEquals(new Locale("en", "US"), fromJson(TypeAdapters.LOCALE, "\"en_US\""));

    assertEquals("\"en_US_POSIX\"", toJson(TypeAdapters.LOCALE, new Locale("en", "US", "POSIX")));
    assertEquals(new Locale("en", "US", "POSIX"), fromJson(TypeAdapters.LOCALE, "\"en_US_POSIX\""));
  }

  @Test
  public void testJsonElementAdapter_allTypes() throws IOException {
    assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, null));
    assertEquals("null", toJson(TypeAdapters.JSON_ELEMENT, JsonNull.INSTANCE));
    assertEquals(JsonNull.INSTANCE, fromJson(TypeAdapters.JSON_ELEMENT, "null"));

    // JsonPrimitive
    assertEquals("\"hello\"", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive("hello")));
    assertEquals(new JsonPrimitive("hello"), fromJson(TypeAdapters.JSON_ELEMENT, "\"hello\""));

    assertEquals("123", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(123)));
    assertEquals(new JsonPrimitive(123), fromJson(TypeAdapters.JSON_ELEMENT, "123"));

    assertEquals("true", toJson(TypeAdapters.JSON_ELEMENT, new JsonPrimitive(true)));
    assertEquals(new JsonPrimitive(true), fromJson(TypeAdapters.JSON_ELEMENT, "true"));

    // JsonArray
    JsonArray array = new JsonArray();
    array.add(new JsonPrimitive("item"));
    array.add(JsonNull.INSTANCE);
    assertEquals("[\"item\",null]", toJson(TypeAdapters.JSON_ELEMENT, array));
    assertEquals(array, fromJson(TypeAdapters.JSON_ELEMENT, "[\"item\",null]"));

    // JsonObject
    JsonObject obj = new JsonObject();
    obj.addProperty("key", "val");
    assertEquals("{\"key\":\"val\"}", toJson(TypeAdapters.JSON_ELEMENT, obj));
    assertEquals(obj, fromJson(TypeAdapters.JSON_ELEMENT, "{\"key\":\"val\"}"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementAdapter_readInvalidToken_throwsException() throws IOException {
    JsonReader reader = new JsonReader(new StringReader(""));
    TypeAdapters.JSON_ELEMENT.read(reader);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testJsonElementAdapter_writeCustomElement_throwsException() throws IOException {
    JsonElement customElement = new JsonElement() {
      @Override
      public JsonElement deepCopy() {
        return this;
      }
    };
    toJson(TypeAdapters.JSON_ELEMENT, customElement);
  }

  @Test
  public void testEnumAdapter_normalAndEdgeCases() throws IOException {
    TypeAdapter<TestEnum> adapter = TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(TestEnum.class));
    assertNotNull(adapter);

    assertEquals("null", toJson(adapter, null));
    assertNull(fromJson(adapter, "null"));

    assertEquals("\"first_name\"", toJson(adapter, TestEnum.FIRST));
    assertEquals(TestEnum.FIRST, fromJson(adapter, "\"first_name\""));
    assertEquals(TestEnum.FIRST, fromJson(adapter, "\"first_alt1\""));
    assertEquals(TestEnum.FIRST, fromJson(adapter, "\"first_alt2\""));

    assertEquals("\"SECOND\"", toJson(adapter, TestEnum.SECOND));
    assertEquals(TestEnum.SECOND, fromJson(adapter, "\"SECOND\""));

    // Test anonymous subclass enum resolution
    TypeAdapter<TestEnum> subAdapter = (TypeAdapter<TestEnum>) TypeAdapters.ENUM_FACTORY.create(
        gson, TypeToken.get(TestEnum.SECOND.getClass()));
    assertNotNull(subAdapter);
    assertEquals("\"SECOND\"", toJson(subAdapter, TestEnum.SECOND));

    // Non-enum classes
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(String.class)));
    assertNull(TypeAdapters.ENUM_FACTORY.create(gson, TypeToken.get(Enum.class)));
  }

  @Test
  public void testNewFactory_typeToken() {
    TypeToken<String> token = TypeToken.get(String.class);
    TypeAdapterFactory factory = TypeAdapters.newFactory(token, TypeAdapters.STRING);

    assertNotNull(factory.create(gson, token));
    assertNull(factory.create(gson, TypeToken.get(Integer.class)));
  }

  @Test
  public void testNewFactory_class() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(String.class, TypeAdapters.STRING);

    assertNotNull(factory.create(gson, TypeToken.get(String.class)));
    assertNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertTrue(factory.toString().contains("Factory[type=java.lang.String"));
  }

  @Test
  public void testNewFactory_boxedUnboxed() {
    TypeAdapterFactory factory = TypeAdapters.newFactory(int.class, Integer.class, TypeAdapters.INTEGER);

    assertNotNull(factory.create(gson, TypeToken.get(int.class)));
    assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertNull(factory.create(gson, TypeToken.get(Double.class)));
    assertTrue(factory.toString().contains("Factory[type=java.lang.Integer+int"));
  }

  @Test
  public void testNewFactoryForMultipleTypes() {
    TypeAdapterFactory factory = TypeAdapters.newFactoryForMultipleTypes(
        Calendar.class, GregorianCalendar.class, TypeAdapters.CALENDAR);

    assertNotNull(factory.create(gson, TypeToken.get(Calendar.class)));
    assertNotNull(factory.create(gson, TypeToken.get(GregorianCalendar.class)));
    assertNull(factory.create(gson, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Factory[type=java.util.Calendar+java.util.GregorianCalendar"));
  }

  @Test
  public void testNewTypeHierarchyFactory() {
    TypeAdapterFactory factory = TypeAdapters.newTypeHierarchyFactory(Number.class, TypeAdapters.NUMBER);

    assertNotNull(factory.create(gson, TypeToken.get(Number.class)));
    assertNotNull(factory.create(gson, TypeToken.get(Integer.class)));
    assertNotNull(factory.create(gson, TypeToken.get(Double.class)));
    assertNull(factory.create(gson, TypeToken.get(String.class)));
    assertTrue(factory.toString().contains("Factory[typeHierarchy=java.lang.Number"));
  }

  @Test
  public void testStaticFactoriesPresence() {
    assertNotNull(TypeAdapters.CLASS_FACTORY);
    assertNotNull(TypeAdapters.BIT_SET_FACTORY);
    assertNotNull(TypeAdapters.BOOLEAN_FACTORY);
    assertNotNull(TypeAdapters.BYTE_FACTORY);
    assertNotNull(TypeAdapters.SHORT_FACTORY);
    assertNotNull(TypeAdapters.INTEGER_FACTORY);
    assertNotNull(TypeAdapters.NUMBER_FACTORY);
    assertNotNull(TypeAdapters.CHARACTER_FACTORY);
    assertNotNull(TypeAdapters.STRING_FACTORY);
    assertNotNull(TypeAdapters.STRING_BUILDER_FACTORY);
    assertNotNull(TypeAdapters.STRING_BUFFER_FACTORY);
    assertNotNull(TypeAdapters.URL_FACTORY);
    assertNotNull(TypeAdapters.URI_FACTORY);
    assertNotNull(TypeAdapters.INET_ADDRESS_FACTORY);
    assertNotNull(TypeAdapters.UUID_FACTORY);
    assertNotNull(TypeAdapters.CALENDAR_FACTORY);
    assertNotNull(TypeAdapters.LOCALE_FACTORY);
    assertNotNull(TypeAdapters.JSON_ELEMENT_FACTORY);
  }
}
