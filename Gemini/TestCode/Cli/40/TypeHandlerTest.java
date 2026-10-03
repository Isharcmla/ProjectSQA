package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

public class TypeHandlerTest {

    public static class InstantiableClass {
        public InstantiableClass() {}
    }

    public static class NonInstantiableClass {
        private NonInstantiableClass() {
            throw new RuntimeException("Cannot instantiate");
        }
    }

    public static abstract class AbstractClass {
    }

    @Test
    public void testConstructor() {
        TypeHandler handler = new TypeHandler();
        Assert.assertNotNull(handler);
    }

    @Test
    public void testCreateValueObject_withValidTypes() throws Exception {
        Object stringResult = TypeHandler.createValue("hello", (Object) PatternOptionBuilder.STRING_VALUE);
        Assert.assertEquals("hello", stringResult);

        Object objResult = TypeHandler.createValue("java.lang.String", (Object) PatternOptionBuilder.OBJECT_VALUE);
        Assert.assertEquals("", objResult);

        Object numberResult = TypeHandler.createValue("123", (Object) PatternOptionBuilder.NUMBER_VALUE);
        Assert.assertEquals(123L, numberResult);

        Object classResult = TypeHandler.createValue("java.lang.String", (Object) PatternOptionBuilder.CLASS_VALUE);
        Assert.assertEquals(String.class, classResult);

        Object fileResult = TypeHandler.createValue("test.txt", (Object) PatternOptionBuilder.FILE_VALUE);
        Assert.assertEquals(new File("test.txt"), fileResult);

        File tempFile = File.createTempFile("testOpenFile", ".tmp");
        tempFile.deleteOnExit();
        Object openFileResult = TypeHandler.createValue(tempFile.getAbsolutePath(), (Object) PatternOptionBuilder.EXISTING_FILE_VALUE);
        Assert.assertTrue(openFileResult instanceof FileInputStream);
        ((FileInputStream) openFileResult).close();

        Object urlResult = TypeHandler.createValue("http://apache.org", (Object) PatternOptionBuilder.URL_VALUE);
        Assert.assertEquals(new URL("http://apache.org"), urlResult);

        Object unknownResult = TypeHandler.createValue("something", (Object) Integer.class);
        Assert.assertNull(unknownResult);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueObject_dateThrowsException() throws Exception {
        TypeHandler.createValue("2023-01-01", (Object) PatternOptionBuilder.DATE_VALUE);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateValueObject_filesThrowsException() throws Exception {
        TypeHandler.createValue("file1.txt", (Object) PatternOptionBuilder.FILES_VALUE);
    }

    @Test
    public void testCreateValueClass_string() throws Exception {
        String result = TypeHandler.createValue("test", PatternOptionBuilder.STRING_VALUE);
        Assert.assertEquals("test", result);
    }

    @Test
    public void testCreateValueClass_unknownTypeReturnsNull() throws Exception {
        Object result = TypeHandler.createValue("test", Void.class);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateObject_success() throws Exception {
        Object obj = TypeHandler.createObject(InstantiableClass.class.getName());
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof InstantiableClass);
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_classNotFound() throws Exception {
        TypeHandler.createObject("non.existing.ClassName");
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_cannotInstantiateAbstractClass() throws Exception {
        TypeHandler.createObject(AbstractClass.class.getName());
    }

    @Test(expected = ParseException.class)
    public void testCreateObject_constructorThrowsException() throws Exception {
        TypeHandler.createObject(NonInstantiableClass.class.getName());
    }

    @Test
    public void testCreateNumber_integerLong() throws Exception {
        Number number = TypeHandler.createNumber("12345");
        Assert.assertEquals(12345L, number);

        Number negativeNumber = TypeHandler.createNumber("-12345");
        Assert.assertEquals(-12345L, negativeNumber);

        Number zeroNumber = TypeHandler.createNumber("0");
        Assert.assertEquals(0L, zeroNumber);
    }

    @Test
    public void testCreateNumber_double() throws Exception {
        Number number = TypeHandler.createNumber("123.45");
        Assert.assertEquals(123.45d, number);

        Number negativeDouble = TypeHandler.createNumber("-123.45");
        Assert.assertEquals(-123.45d, negativeDouble);

        Number zeroDouble = TypeHandler.createNumber("0.0");
        Assert.assertEquals(0.0d, zeroDouble);
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_invalidFormat() throws Exception {
        TypeHandler.createNumber("not_a_number");
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber_emptyString() throws Exception {
        TypeHandler.createNumber("");
    }

    @Test(expected = NullPointerException.class)
    public void testCreateNumber_nullString() throws Exception {
        TypeHandler.createNumber(null);
    }

    @Test
    public void testCreateClass_success() throws Exception {
        Class<?> clazz = TypeHandler.createClass("java.lang.String");
        Assert.assertEquals(String.class, clazz);
    }

    @Test(expected = ParseException.class)
    public void testCreateClass_notFound() throws Exception {
        TypeHandler.createClass("com.example.NonExistingClass");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_alwaysThrowsUnsupportedOperationException() {
        TypeHandler.createDate("2023-01-01");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateDate_nullThrowsUnsupportedOperationException() {
        TypeHandler.createDate(null);
    }

    @Test
    public void testCreateURL_validURL() throws Exception {
        URL url = TypeHandler.createURL("https://www.apache.org");
        Assert.assertEquals("https://www.apache.org", url.toString());
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_invalidURL() throws Exception {
        TypeHandler.createURL("malformed://url/\\invalid");
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_emptyString() throws Exception {
        TypeHandler.createURL("");
    }

    @Test(expected = ParseException.class)
    public void testCreateURL_relativeString() throws Exception {
        TypeHandler.createURL("some/relative/path");
    }

    @Test
    public void testCreateFile_normal() {
        File file = TypeHandler.createFile("path/to/file.txt");
        Assert.assertNotNull(file);
        Assert.assertEquals("path/to/file.txt", file.getPath().replace('\\', '/'));
    }

    @Test
    public void testCreateFile_emptyString() {
        File file = TypeHandler.createFile("");
        Assert.assertNotNull(file);
        Assert.assertEquals("", file.getPath());
    }

    @Test
    public void testOpenFile_existingFile() throws Exception {
        File tempFile = File.createTempFile("testOpenFileDirect", ".tmp");
        tempFile.deleteOnExit();

        FileInputStream fis = null;
        try {
            fis = TypeHandler.openFile(tempFile.getAbsolutePath());
            Assert.assertNotNull(fis);
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }

    @Test(expected = ParseException.class)
    public void testOpenFile_nonExistingFileThrowsException() throws Exception {
        TypeHandler.openFile("non_existing_file_path_12345.txt");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_alwaysThrowsUnsupportedOperationException() {
        TypeHandler.createFiles("path/to/files");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCreateFiles_nullThrowsUnsupportedOperationException() {
        TypeHandler.createFiles(null);
    }
}
