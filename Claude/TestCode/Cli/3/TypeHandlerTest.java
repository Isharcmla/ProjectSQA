import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.Date;

public class TypeHandlerTest {

    // ---------- createValue(String, Object) ----------

    @Test
    public void testCreateValueObject_stringType_returnsString() {
        Object result = TypeHandler.createValue("hello", (Object) PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValueObject_numberType_returnsNumber() {
        Object result = TypeHandler.createValue("123", (Object) PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Number);
        assertEquals(123L, ((Number) result).longValue());
    }

    // ---------- createValue(String, Class) ----------

    @Test
    public void testCreateValue_stringValueClass_returnsSameString() {
        Object result = TypeHandler.createValue("test string", PatternOptionBuilder.STRING_VALUE);
        assertEquals("test string", result);
    }

    @Test
    public void testCreateValue_objectValueClass_validClassName_returnsInstance() {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof String);
    }

    @Test
    public void testCreateValue_objectValueClass_invalidClassName_returnsNull() {
        Object result = TypeHandler.createValue("no.such.Class", PatternOptionBuilder.OBJECT_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_numberValueClass_integer_returnsLong() {
        Object result = TypeHandler.createValue("42", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Number);
        assertEquals(42L, ((Number) result).longValue());
    }

    @Test
    public void testCreateValue_numberValueClass_decimal_returnsDouble() {
        Object result = TypeHandler.createValue("3.14", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Double);
        assertEquals(3.14, ((Double) result).doubleValue(), 0.0001);
    }

    @Test
    public void testCreateValue_numberValueClass_invalidNumber_returnsNull() {
        Object result = TypeHandler.createValue("notANumber", PatternOptionBuilder.NUMBER_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_dateValueClass_returnsNull() {
        Object result = TypeHandler.createValue("2020-01-01", PatternOptionBuilder.DATE_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_classValueClass_validClassName_returnsClass() {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertNotNull(result);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValue_classValueClass_invalidClassName_returnsNull() {
        Object result = TypeHandler.createValue("no.such.Class", PatternOptionBuilder.CLASS_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_fileValueClass_returnsFile() {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValue_existingFileValueClass_returnsFile() {
        Object result = TypeHandler.createValue("existing.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof File);
    }

    @Test
    public void testCreateValue_filesValueClass_returnsNull() {
        Object result = TypeHandler.createValue("file1,file2", PatternOptionBuilder.FILES_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_urlValueClass_validUrl_returnsURL() throws Exception {
        Object result = TypeHandler.createValue("http://www.example.com", PatternOptionBuilder.URL_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof URL);
        assertEquals("http://www.example.com", ((URL) result).toString());
    }

    @Test
    public void testCreateValue_urlValueClass_invalidUrl_returnsNull() {
        Object result = TypeHandler.createValue("not a valid url", PatternOptionBuilder.URL_VALUE);
        assertNull(result);
    }

    @Test
    public void testCreateValue_unknownClass_returnsNull() {
        Object result = TypeHandler.createValue("someValue", (Class) Integer.class);
        assertNull(result);
    }

    // ---------- createObject(String) ----------

    @Test
    public void testCreateObject_validClassName_returnsInstance() {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertNotNull(result);
        assertTrue(result instanceof Object);
    }

    @Test
    public void testCreateObject_classNotFound_returnsNull() {
        Object result = TypeHandler.createObject("no.such.ClassName");
        assertNull(result);
    }

    @Test
    public void testCreateObject_emptyString_returnsNull() {
        Object result = TypeHandler.createObject("");
        assertNull(result);
    }

    @Test
    public void testCreateObject_abstractClass_returnsNullDueToInstantiationException() {
        // java.util.AbstractList cannot be instantiated directly
        Object result = TypeHandler.createObject("java.util.AbstractList");
        assertNull(result);
    }

    @Test
    public void testCreateObject_privateConstructorClass_returnsNullDueToIllegalAccessException() {
        // java.lang.Math has a private constructor
        Object result = TypeHandler.createObject("java.lang.Math");
        assertNull(result);
    }

    // ---------- createNumber(String) ----------

    @Test
    public void testCreateNumber_integerString_returnsLong() {
        Number result = TypeHandler.createNumber("100");
        assertNotNull(result);
        assertEquals(100L, result.longValue());
    }

    @Test
    public void testCreateNumber_decimalString_returnsDouble() {
        Number result = TypeHandler.createNumber("1.5");
        assertNotNull(result);
        assertTrue(result instanceof Double);
    }

    @Test
    public void testCreateNumber_negativeNumber_returnsCorrectValue() {
        Number result = TypeHandler.createNumber("-50");
        assertNotNull(result);
        assertEquals(-50L, result.longValue());
    }

    @Test
    public void testCreateNumber_invalidString_returnsNull() {
        Number result = TypeHandler.createNumber("abc");
        assertNull(result);
    }

    @Test
    public void testCreateNumber_emptyString_returnsNull() {
        Number result = TypeHandler.createNumber("");
        assertNull(result);
    }

    @Test
    public void testCreateNumber_zero_returnsZero() {
        Number result = TypeHandler.createNumber("0");
        assertNotNull(result);
        assertEquals(0L, result.longValue());
    }

    // ---------- createClass(String) ----------

    @Test
    public void testCreateClass_validClassName_returnsClass() {
        Class result = TypeHandler.createClass("java.lang.String");
        assertNotNull(result);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateClass_invalidClassName_returnsNull() {
        Class result = TypeHandler.createClass("no.such.Class");
        assertNull(result);
    }

    @Test
    public void testCreateClass_emptyString_returnsNull() {
        Class result = TypeHandler.createClass("");
        assertNull(result);
    }

    // ---------- createDate(String) ----------

    @Test
    public void testCreateDate_anyString_returnsNull() {
        Date result = TypeHandler.createDate("2020-01-01");
        assertNull(result);
    }

    @Test
    public void testCreateDate_emptyString_returnsNull() {
        Date result = TypeHandler.createDate("");
        assertNull(result);
    }

    @Test
    public void testCreateDate_nullString_returnsNull() {
        Date result = TypeHandler.createDate(null);
        assertNull(result);
    }

    // ---------- createURL(String) ----------

    @Test
    public void testCreateURL_validUrl_returnsURL() throws Exception {
        URL result = TypeHandler.createURL("http://www.apache.org");
        assertNotNull(result);
        assertEquals("http://www.apache.org", result.toString());
    }

    @Test
    public void testCreateURL_malformedUrl_returnsNull() {
        URL result = TypeHandler.createURL("malformed url string");
        assertNull(result);
    }

    @Test
    public void testCreateURL_emptyString_returnsNull() {
        URL result = TypeHandler.createURL("");
        assertNull(result);
    }

    // ---------- createFile(String) ----------

    @Test
    public void testCreateFile_normalPath_returnsFile() {
        File result = TypeHandler.createFile("/tmp/test.txt");
        assertNotNull(result);
        assertEquals("test.txt", result.getName());
    }

    @Test
    public void testCreateFile_emptyString_returnsFileWithEmptyPath() {
        File result = TypeHandler.createFile("");
        assertNotNull(result);
    }

    @Test
    public void testCreateFile_relativePath_returnsFile() {
        File result = TypeHandler.createFile("relative/path/file.txt");
        assertNotNull(result);
        assertTrue(result instanceof File);
    }

    // ---------- createFiles(String) ----------

    @Test
    public void testCreateFiles_anyString_returnsNull() {
        File[] result = TypeHandler.createFiles("file1,file2");
        assertNull(result);
    }

    @Test
    public void testCreateFiles_emptyString_returnsNull() {
        File[] result = TypeHandler.createFiles("");
        assertNull(result);
    }

    @Test
    public void testCreateFiles_nullString_returnsNull() {
        File[] result = TypeHandler.createFiles(null);
        assertNull(result);
    }
}
