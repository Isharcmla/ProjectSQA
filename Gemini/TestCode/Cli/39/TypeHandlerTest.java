package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import org.junit.Test;

public class TypeHandlerTest {

    @Test
    public void testConstructor() {
        TypeHandler handler = new TypeHandler();
        assertNotNull(handler);
    }

    @Test
    public void testCreateValue_withObjectCast() throws Exception {
        Object typeObj = PatternOptionBuilder.STRING_VALUE;
        Object result = TypeHandler.createValue("testString", typeObj);
        assertEquals("testString", result);
    }

    @Test
    public void testCreateValue_stringValue() throws Exception {
        Object result = TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValue_objectValue() throws Exception {
        Object result = TypeHandler.createValue("java.util.ArrayList", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof ArrayList);
    }

    @Test
    public void testCreateValue_numberValue() throws Exception {
        Object longResult = TypeHandler.createValue("100", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(100), longResult);

        Object doubleResult = TypeHandler.createValue("100.5", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Double.valueOf(100.5), doubleResult);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_dateValue_throwsUnsupportedOperationException() throws Exception {
        TypeHandler.createValue("2023-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void testCreateValue_classValue() throws Exception {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValue_fileValue() throws Exception {
        Object result = TypeHandler.createValue("somefile.txt", PatternOptionBuilder.FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
        assertEquals("somefile.txt", ((File) result).getPath());
    }

    @Test
    public void testCreateValue_existingFileValue() throws Exception {
        Object result = TypeHandler.createValue("existing.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
        assertEquals("existing.txt", ((File) result).getPath());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_filesValue_throwsUnsupportedOperationException() throws Exception {
        TypeHandler.createValue("files", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValue_urlValue() throws Exception {
        Object result = TypeHandler.createValue("https://commons.apache.org", PatternOptionBuilder.URL_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof URL);
        assertEquals("https://commons.apache.org", ((URL) result).toExternalForm());
    }

    @Test
    public void testCreateValue_unrecognizedClass_returnsNull() throws Exception {
        Object result = TypeHandler.createValue("test", Integer.class);
        assertNull(result);

        Object nullClassResult = TypeHandler.createValue("test", (Class<?>) null);
        assertNull(nullClassResult);
    }

    @Test
    public void testCreateObject_success() throws Exception {
        Object obj = TypeHandler.createObject("java.lang.String");
        assertNotNull(obj);
        assertTrue(obj instanceof String);
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_classNotFound_throwsParseException() throws Exception {
        TypeHandler.createObject("non.existent.ClassName");
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_cannotInstantiateAbstractClass_throwsParseException() throws Exception {
        TypeHandler.createObject("java.util.AbstractList");
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_noPublicDefaultConstructor_throwsParseException() throws Exception {
        TypeHandler.createObject("java.lang.System");
    }

    @Test
    public void testCreateNumber_integerAndLong() throws Exception {
        Number zero = TypeHandler.createNumber("0");
        assertEquals(Long.valueOf(0), zero);

        Number positive = TypeHandler.createNumber("123456789012");
        assertEquals(Long.valueOf(123456789012L), positive);

        Number negative = TypeHandler.createNumber("-42");
        assertEquals(Long.valueOf(-42), negative);
    }

    @Test
    public void testCreateNumber_double() throws Exception {
        Number doubleVal = TypeHandler.createNumber("123.456");
        assertEquals(Double.valueOf(123.456), doubleVal);

        Number negativeDouble = TypeHandler.createNumber("-0.5");
        assertEquals(Double.valueOf(-0.5), negativeDouble);

        Number dotOnlyDouble = TypeHandler.createNumber(".5");
        assertEquals(Double.valueOf(0.5), doubleVal.getClass().cast(dotOnlyDouble));
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_invalidFormatString_throwsParseException() throws Exception {
        TypeHandler.createNumber("not-a-number");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_multipleDots_throwsParseException() throws Exception {
        TypeHandler.createNumber("1.2.3");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_emptyString_throwsParseException() throws Exception {
        TypeHandler.createNumber("");
    }

    @Test(expected = NullPointerException.class)
    public void testCreateNumber_nullString_throwsNullPointerException() throws Exception {
        TypeHandler.createNumber(null);
    }

    @Test
    public void testCreateClass_success() throws Exception {
        Class<?> clazz = TypeHandler.createClass("java.lang.Integer");
        assertEquals(Integer.class, clazz);
    }

    @Test(expected = ParseException.class)
    public void testCreateClass_notFound_throwsParseException() throws Exception {
        TypeHandler.createClass("org.apache.commons.cli.NonExistingClass");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_throwsUnsupportedOperationException() {
        TypeHandler.createDate("2023-01-01");
    }

    @Test
    public void testCreateURL_validUrl() throws Exception {
        URL url = TypeHandler.createURL("http://localhost:8080/test");
        assertNotNull(url);
        assertEquals("http://localhost:8080/test", url.toExternalForm());
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_invalidUrl_throwsParseException() throws Exception {
        TypeHandler.createURL("invalid_url_protocol");
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_emptyString_throwsParseException() throws Exception {
        TypeHandler.createURL("");
    }

    @Test
    public void testCreateFile_normalPath() {
        File file = TypeHandler.createFile("path/to/file.txt");
        assertNotNull(file);
        assertEquals("path" + File.separator + "to" + File.separator + "file.txt", file.getPath());
    }

    @Test
    public void testCreateFile_emptyString() {
        File file = TypeHandler.createFile("");
        assertNotNull(file);
        assertEquals("", file.getPath());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_throwsUnsupportedOperationException() {
        TypeHandler.createFiles("path1;path2");
    }
}
