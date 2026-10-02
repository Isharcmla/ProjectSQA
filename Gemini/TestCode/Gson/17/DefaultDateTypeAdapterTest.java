package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DefaultDateTypeAdapterTest {

  private static class UnsupportedDateSubclass extends Date {
    private static final long serialVersionUID = 1L;
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructor_unsupportedDateSubclass_throwsIllegalArgumentException() {
    new DefaultDateTypeAdapter(UnsupportedDateSubclass.class);
  }

  @Test
  public void testConstructors_validInstantiations() {
    DefaultDateTypeAdapter adapter1 = new DefaultDateTypeAdapter(Date.class);
    Assert.assertNotNull(adapter1);

    DefaultDateTypeAdapter adapter2 = new DefaultDateTypeAdapter(Timestamp.class, "yyyy-MM-dd HH:mm:ss");
    Assert.assertNotNull(adapter2);

    DefaultDateTypeAdapter adapter3 = new DefaultDateTypeAdapter(java.sql.Date.class, DateFormat.SHORT);
    Assert.assertNotNull(adapter3);

    DefaultDateTypeAdapter adapter4 = new DefaultDateTypeAdapter(DateFormat.SHORT, DateFormat.SHORT);
    Assert.assertNotNull(adapter4);

    DefaultDateTypeAdapter adapter5 = new DefaultDateTypeAdapter(Date.class, DateFormat.SHORT, DateFormat.SHORT);
    Assert.assertNotNull(adapter5);

    DateFormat enUs = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    DateFormat local = new SimpleDateFormat("yyyy-MM-dd", Locale.GERMANY);
    DefaultDateTypeAdapter adapter6 = new DefaultDateTypeAdapter(Date.class, enUs, local);
    Assert.assertNotNull(adapter6);
  }

  @Test
  public void testWrite_nullValue_writesNull() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);

    adapter.write(jsonWriter, null);

    Assert.assertEquals("null", stringWriter.toString());
  }

  @Test
  public void testWrite_validDate_writesFormattedString() throws IOException {
    String pattern = "yyyy-MM-dd HH:mm:ss";
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, pattern);
    Date date = new Date(0L);

    StringWriter stringWriter = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(stringWriter);
    adapter.write(jsonWriter, date);

    SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
    String expected = "\"" + sdf.format(date) + "\"";
    Assert.assertEquals(expected, stringWriter.toString());
  }

  @Test(expected = JsonParseException.class)
  public void testRead_nonStringToken_throwsJsonParseException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    JsonReader jsonReader = new JsonReader(new StringReader("12345"));

    adapter.read(jsonReader);
  }

  @Test(expected = JsonParseException.class)
  public void testRead_booleanToken_throwsJsonParseException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
    JsonReader jsonReader = new JsonReader(new StringReader("true"));

    adapter.read(jsonReader);
  }

  @Test
  public void testRead_validDate_returnsUtilDate() throws IOException {
    String pattern = "yyyy-MM-dd HH:mm:ss";
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, pattern);
    SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
    Date expectedDate = new Date(100000000000L);
    String dateStr = "\"" + sdf.format(expectedDate) + "\"";

    JsonReader jsonReader = new JsonReader(new StringReader(dateStr));
    Date result = adapter.read(jsonReader);

    Assert.assertEquals(Date.class, result.getClass());
    Assert.assertEquals(sdf.format(expectedDate), sdf.format(result));
  }

  @Test
  public void testRead_validDate_returnsTimestamp() throws IOException {
    String pattern = "yyyy-MM-dd HH:mm:ss";
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, pattern);
    SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
    Date expectedDate = new Date(100000000000L);
    String dateStr = "\"" + sdf.format(expectedDate) + "\"";

    JsonReader jsonReader = new JsonReader(new StringReader(dateStr));
    Date result = adapter.read(jsonReader);

    Assert.assertTrue(result instanceof Timestamp);
    Assert.assertEquals(Timestamp.class, result.getClass());
    Assert.assertEquals(expectedDate.getTime() / 1000 * 1000, result.getTime() / 1000 * 1000);
  }

  @Test
  public void testRead_validDate_returnsSqlDate() throws IOException {
    String pattern = "yyyy-MM-dd";
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, pattern);
    SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
    Date expectedDate = new Date(100000000000L);
    String dateStr = "\"" + sdf.format(expectedDate) + "\"";

    JsonReader jsonReader = new JsonReader(new StringReader(dateStr));
    Date result = adapter.read(jsonReader);

    Assert.assertTrue(result instanceof java.sql.Date);
    Assert.assertEquals(java.sql.Date.class, result.getClass());
  }

  @Test
  public void testRead_iso8601FormattedDate_parsesSuccessfully() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy/MM/dd");
    String iso8601String = "\"1970-01-01T00:00:00.000Z\"";

    JsonReader jsonReader = new JsonReader(new StringReader(iso8601String));
    Date result = adapter.read(jsonReader);

    Assert.assertNotNull(result);
    Assert.assertEquals(0L, result.getTime());
  }

  @Test
  public void testRead_fallbackToEnUsFormat_parsesSuccessfully() throws IOException {
    DateFormat enUs = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    DateFormat local = new SimpleDateFormat("dd.MM.yyyy", Locale.GERMANY);
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);

    String enUsDateString = "\"12/31/2020\"";
    JsonReader jsonReader = new JsonReader(new StringReader(enUsDateString));
    Date result = adapter.read(jsonReader);

    Assert.assertNotNull(result);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testRead_invalidDateString_throwsJsonSyntaxException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    JsonReader jsonReader = new JsonReader(new StringReader("\"not-a-valid-date\""));

    adapter.read(jsonReader);
  }

  @Test(expected = JsonSyntaxException.class)
  public void testRead_emptyDateString_throwsJsonSyntaxException() throws IOException {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    JsonReader jsonReader = new JsonReader(new StringReader("\"\""));

    adapter.read(jsonReader);
  }

  @Test
  public void testToString_returnsExpectedFormat() {
    DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
    String str = adapter.toString();

    Assert.assertNotNull(str);
    Assert.assertTrue(str.startsWith("DefaultDateTypeAdapter("));
    Assert.assertTrue(str.endsWith(")"));
    Assert.assertTrue(str.contains(SimpleDateFormat.class.getSimpleName()));
  }
}
