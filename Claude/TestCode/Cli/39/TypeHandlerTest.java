import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;
import java.util.Date;

import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PatternOptionBuilder;
import org.apache.commons.cli.TypeHandler;

public class TypeHandlerTest
{
    // ---------- createValue(String, Object) ----------

    @Test
    public void testCreateValueObjectOverload_stringType_returnsString() throws Exception
    {
        Object result = TypeHandler.createValue("hello", (Object) PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    // ---------- createValue(String, Class<?>) ----------

    @Test
    public void testCreateValue_stringValue_returnsSameString() throws Exception
    {
        Object result = TypeHandler.createValue("test", PatternOptionBuilder.STRING_VALUE);
        assertEquals("test", result);
    }

    @Test
    public void testCreateValue_objectValue_returnsInstance() throws Exception
    {
        Object result = TypeHandler.createValue("java.lang.Object", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertEquals("java.lang.Object", result.getClass().getName());
    }

    @Test
    public void testCreateValue_numberValue_returnsLong() throws Exception
    {
        Object result = TypeHandler.createValue("42", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Long);
        assertEquals(42L, ((Long) result).longValue());
    }

    @Test
    public void testCreateValue_numberValueWithDecimal_returnsDouble() throws Exception
    {
        Object result = TypeHandler.createValue("42.5", PatternOptionBuilder.NUMBER_VALUE);
        assertTrue(result instanceof Double);
        assertEquals(42.5d, ((Double) result).doubleValue(), 0.0001);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_dateValue_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createValue("2020-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void testCreateValue_classValue_returnsClass() throws Exception
    {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValue_fileValue_returnsFile() throws Exception
    {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertTrue(result instanceof File);
        assertEquals("test.txt", ((File) result).getName());
    }

    @Test
    public void testCreateValue_existingFileValue_returnsFile() throws Exception
    {
        Object result = TypeHandler.createValue("test.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
        assertTrue(result instanceof File);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_filesValue_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createValue("test1.txt,test2.txt", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValue_urlValue_returnsURL() throws Exception
    {
        Object result = TypeHandler.createValue("http://apache.org", PatternOptionBuilder.URL_VALUE);
        assertTrue(result instanceof URL);
        assertEquals("http://apache.org", result.toString());
    }

    @Test
    public void testCreateValue_unknownClass_returnsNull() throws Exception
    {
        Object result = TypeHandler.createValue("someValue", Boolean.class);
        assertNull(result);
    }

    // ---------- createObject ----------

    @Test
    public void testCreateObject_validClassname_returnsInstance() throws Exception
    {
        Object result = TypeHandler.createObject("java.lang.Object");
        assertNotNull(result);
        assertEquals("java.lang.Object", result.getClass().getName());
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_invalidClassname_throwsParseException() throws Exception
    {
        TypeHandler.createObject("non.existent.ClassName");
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_abstractClass_throwsParseException() throws Exception
    {
        TypeHandler.createObject("java.util.AbstractList");
    }

    // ---------- createNumber ----------

    @Test
    public void testCreateNumber_integerString_returnsLong() throws Exception
    {
        Number result = TypeHandler.createNumber("123");
        assertTrue(result instanceof Long);
        assertEquals(123L, result.longValue());
    }

    @Test
    public void testCreateNumber_decimalString_returnsDouble() throws Exception
    {
        Number result = TypeHandler.createNumber("123.45");
        assertTrue(result instanceof Double);
        assertEquals(123.45d, result.doubleValue(), 0.0001);
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_invalidString_throwsParseException() throws Exception
    {
        TypeHandler.createNumber("notANumber");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_emptyString_throwsParseException() throws Exception
    {
        TypeHandler.createNumber("");
    }

    // ---------- createClass ----------

    @Test
    public void testCreateClass_validClassname_returnsClass() throws Exception
    {
        Class<?> result = TypeHandler.createClass("java.lang.String");
        assertEquals(String.class, result);
    }

    @Test(expected = ParseException.class)
    public void testCreateClass_invalidClassname_throwsParseException() throws Exception
    {
        TypeHandler.createClass("non.existent.ClassName");
    }

    // ---------- createDate ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_anyString_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createDate("2020-01-01");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_nullString_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createDate(null);
    }

    // ---------- createURL ----------

    @Test
    public void testCreateURL_validURL_returnsURLObject() throws Exception
    {
        URL result = TypeHandler.createURL("http://apache.org");
        assertNotNull(result);
        assertEquals("http://apache.org", result.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_malformedURL_throwsParseException() throws Exception
    {
        TypeHandler.createURL("not a url");
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_emptyString_throwsParseException() throws Exception
    {
        TypeHandler.createURL("");
    }

    // ---------- createFile ----------

    @Test
    public void testCreateFile_validPath_returnsFileObject() throws Exception
    {
        File result = TypeHandler.createFile("test.txt");
        assertNotNull(result);
        assertEquals("test.txt", result.getName());
    }

    @Test
    public void testCreateFile_emptyString_returnsFileObject() throws Exception
    {
        File result = TypeHandler.createFile("");
        assertNotNull(result);
    }

    // ---------- createFiles ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_anyString_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createFiles("file1.txt,file2.txt");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_emptyString_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createFiles("");
    }
}
