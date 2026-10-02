import org.apache.commons.cli.PatternOptionBuilder;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.TypeHandler;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Date;

public class TypeHandlerTest
{
    // ---------- createValue(String, Object) ----------

    @Test
    public void testCreateValueObjectOverload_stringType_returnsString() throws Exception
    {
        Object result = TypeHandler.createValue("hello", (Object) PatternOptionBuilder.STRING_VALUE);
        assertEquals("hello", result);
    }

    @Test
    public void testCreateValueObjectOverload_numberType_returnsNumber() throws Exception
    {
        Object result = TypeHandler.createValue("42", (Object) PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(42), result);
    }

    // ---------- createValue(String, Class<T>) ----------

    @Test
    public void testCreateValue_stringValue_returnsSameString() throws Exception
    {
        String result = TypeHandler.createValue("test string", PatternOptionBuilder.STRING_VALUE);
        assertEquals("test string", result);
    }

    @Test
    public void testCreateValue_objectValue_returnsInstantiatedObject() throws Exception
    {
        Object result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.OBJECT_VALUE);
        assertNotNull(result);
        assertTrue(result instanceof String);
    }

    @Test
    public void testCreateValue_numberValueWithDot_returnsDouble() throws Exception
    {
        Number result = TypeHandler.createValue("3.14", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Double.valueOf(3.14), result);
    }

    @Test
    public void testCreateValue_numberValueWithoutDot_returnsLong() throws Exception
    {
        Number result = TypeHandler.createValue("100", PatternOptionBuilder.NUMBER_VALUE);
        assertEquals(Long.valueOf(100), result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_dateValue_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createValue("2020-01-01", PatternOptionBuilder.DATE_VALUE);
    }

    @Test
    public void testCreateValue_classValue_returnsClass() throws Exception
    {
        Class<?> result = TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE);
        assertEquals(String.class, result);
    }

    @Test
    public void testCreateValue_fileValue_returnsFile() throws Exception
    {
        File result = TypeHandler.createValue("test.txt", PatternOptionBuilder.FILE_VALUE);
        assertNotNull(result);
        assertEquals("test.txt", result.getName());
    }

    @Test(expected = ParseException.class)
    public void testCreateValue_existingFileValue_nonExistentFile_throwsParseException() throws Exception
    {
        TypeHandler.createValue("nonexistent_file_xyz.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValue_filesValue_throwsUnsupportedOperationException() throws Exception
    {
        TypeHandler.createValue("file1,file2", PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValue_urlValue_returnsURL() throws Exception
    {
        URL result = TypeHandler.createValue("http://apache.org", PatternOptionBuilder.URL_VALUE);
        assertNotNull(result);
        assertEquals("http://apache.org", result.toString());
    }

    @Test
    public void testCreateValue_unknownClass_returnsNull() throws Exception
    {
        Object result = TypeHandler.createValue("anything", Integer.class);
        assertNull(result);
    }

    // ---------- createObject ----------

    @Test
    public void testCreateObject_validClassName_returnsInstance() throws Exception
    {
        Object result = TypeHandler.createObject("java.util.ArrayList");
        assertNotNull(result);
        assertTrue(result instanceof java.util.ArrayList);
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_invalidClassName_throwsParseException() throws Exception
    {
        TypeHandler.createObject("com.does.not.Exist");
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_classWithoutEmptyConstructor_throwsParseException() throws Exception
    {
        TypeHandler.createObject("java.lang.Integer");
    }

    // ---------- createNumber ----------

    @Test
    public void testCreateNumber_integerString_returnsLong() throws Exception
    {
        Number result = TypeHandler.createNumber("123");
        assertEquals(Long.valueOf(123), result);
    }

    @Test
    public void testCreateNumber_decimalString_returnsDouble() throws Exception
    {
        Number result = TypeHandler.createNumber("123.45");
        assertEquals(Double.valueOf(123.45), result);
    }

    @Test
    public void testCreateNumber_negativeInteger_returnsLong() throws Exception
    {
        Number result = TypeHandler.createNumber("-99");
        assertEquals(Long.valueOf(-99), result);
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_invalidString_throwsParseException() throws Exception
    {
        TypeHandler.createNumber("not a number");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_emptyString_throwsParseException() throws Exception
    {
        TypeHandler.createNumber("");
    }

    // ---------- createClass ----------

    @Test
    public void testCreateClass_validClassName_returnsClass() throws Exception
    {
        Class<?> result = TypeHandler.createClass("java.lang.Object");
        assertEquals(Object.class, result);
    }

    @Test(expected = ParseException.class)
    public void testCreateClass_invalidClassName_throwsParseException() throws Exception
    {
        TypeHandler.createClass("no.such.Class");
    }

    // ---------- createDate ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_anyString_throwsUnsupportedOperationException()
    {
        TypeHandler.createDate("2020-01-01");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_emptyString_throwsUnsupportedOperationException()
    {
        TypeHandler.createDate("");
    }

    // ---------- createURL ----------

    @Test
    public void testCreateURL_validURL_returnsURL() throws Exception
    {
        URL result = TypeHandler.createURL("https://www.apache.org");
        assertNotNull(result);
        assertEquals("https://www.apache.org", result.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_malformedURL_throwsParseException() throws Exception
    {
        TypeHandler.createURL("not a valid url");
    }

    // ---------- createFile ----------

    @Test
    public void testCreateFile_validPath_returnsFile()
    {
        File result = TypeHandler.createFile("somefile.txt");
        assertNotNull(result);
        assertEquals("somefile.txt", result.getName());
    }

    @Test
    public void testCreateFile_emptyString_returnsFile()
    {
        File result = TypeHandler.createFile("");
        assertNotNull(result);
    }

    // ---------- openFile ----------

    @Test(expected = ParseException.class)
    public void testOpenFile_nonExistentFile_throwsParseException() throws Exception
    {
        TypeHandler.openFile("this_file_should_not_exist_12345.txt");
    }

    @Test
    public void testOpenFile_existingFile_returnsFileInputStream() throws Exception
    {
        File tempFile = File.createTempFile("typehandler_test", ".tmp");
        tempFile.deleteOnExit();

        FileInputStream fis = TypeHandler.openFile(tempFile.getAbsolutePath());
        assertNotNull(fis);
        fis.close();
    }

    // ---------- createFiles ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_anyString_throwsUnsupportedOperationException()
    {
        TypeHandler.createFiles("file1,file2");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_emptyString_throwsUnsupportedOperationException()
    {
        TypeHandler.createFiles("");
    }
}
