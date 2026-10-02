package com.google.gson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class DefaultDateTypeAdapterTest {

    // A custom Date subclass that is NOT one of the three supported types
    // (Date, java.sql.Date, Timestamp). Used to trigger IllegalArgumentException.
    private static class CustomDate extends Date {
        private static final long serialVersionUID = 1L;
    }

    // ---------- Constructor Tests ----------

    @Test
    public void testConstructor_withDateClass_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        assertNotNull(adapter);
    }

    @Test
    public void testConstructor_withTimestampClass_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class);
        assertNotNull(adapter);
    }

    @Test
    public void testConstructor_withSqlDateClass_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class);
        assertNotNull(adapter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withInvalidDateType_throwsIllegalArgumentException() {
        new DefaultDateTypeAdapter(CustomDate.class);
    }

    @Test
    public void testConstructor_withDatePattern_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        assertNotNull(adapter);
    }

    @Test
    public void testConstructor_withStyle_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, DateFormat.SHORT);
        assertNotNull(adapter);
    }

    @Test
    public void testConstructor_withDateStyleTimeStyle_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(DateFormat.SHORT, DateFormat.SHORT);
        assertNotNull(adapter);
    }

    @Test
    public void testConstructor_withDateTypeAndDateStyleTimeStyle_success() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, DateFormat.SHORT, DateFormat.SHORT);
        assertNotNull(adapter);
    }

    @Test
    public void testConstructor_withDateFormats_success() {
        DateFormat enUs = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        DateFormat local = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, enUs, local);
        assertNotNull(adapter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withDateFormatsAndInvalidType_throwsIllegalArgumentException() {
        DateFormat enUs = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.US);
        DateFormat local = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
        new DefaultDateTypeAdapter(CustomDate.class, enUs, local);
    }

    // ---------- write() Tests ----------

    @Test
    public void testWrite_withNullValue_writesNullValue() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, null);
        jsonWriter.close();
        assertEquals("null", stringWriter.toString());
    }

    @Test
    public void testWrite_withValidDate_writesFormattedString() throws IOException, ParseException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Date date = sdf.parse("2020-05-15");

        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        adapter.write(jsonWriter, date);
        jsonWriter.close();

        String result = stringWriter.toString();
        assertTrue(result.contains("2020-05-15"));
    }

    // ---------- read() Tests ----------

    @Test
    public void testRead_withValidDateString_returnsDate_forDateClass() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("\"2020-05-15\""));
        Date result = adapter.read(jsonReader);
        assertNotNull(result);
        assertTrue(result instanceof Date);
    }

    @Test
    public void testRead_withValidDateString_returnsTimestamp_forTimestampClass() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Timestamp.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("\"2020-05-15\""));
        Date result = adapter.read(jsonReader);
        assertNotNull(result);
        assertTrue(result instanceof Timestamp);
    }

    @Test
    public void testRead_withValidDateString_returnsSqlDate_forSqlDateClass() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(java.sql.Date.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("\"2020-05-15\""));
        Date result = adapter.read(jsonReader);
        assertNotNull(result);
        assertTrue(result instanceof java.sql.Date);
    }

    @Test(expected = JsonParseException.class)
    public void testRead_withNonStringToken_throwsJsonParseException() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("123"));
        adapter.read(jsonReader);
    }

    @Test(expected = JsonSyntaxException.class)
    public void testRead_withInvalidDateString_throwsJsonSyntaxException() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("\"not-a-valid-date-string\""));
        adapter.read(jsonReader);
    }

    @Test
    public void testRead_withEmptyString_throwsJsonSyntaxException() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("\"\""));
        try {
            adapter.read(jsonReader);
            fail("Expected JsonSyntaxException for empty string");
        } catch (JsonSyntaxException expected) {
            // expected
        }
    }

    @Test
    public void testRead_withIso8601Format_returnsDate() throws IOException {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        JsonReader jsonReader = new JsonReader(new StringReader("\"2020-05-15T10:15:30Z\""));
        Date result = adapter.read(jsonReader);
        assertNotNull(result);
    }

    // ---------- toString() Tests ----------

    @Test
    public void testToString_returnsExpectedFormat() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class, "yyyy-MM-dd");
        String result = adapter.toString();
        assertTrue(result.startsWith("DefaultDateTypeAdapter("));
        assertTrue(result.endsWith(")"));
    }

    @Test
    public void testToString_withDefaultConstructor_returnsExpectedFormat() {
        DefaultDateTypeAdapter adapter = new DefaultDateTypeAdapter(Date.class);
        String result = adapter.toString();
        assertNotNull(result);
        assertTrue(result.contains("DefaultDateTypeAdapter"));
    }
}
