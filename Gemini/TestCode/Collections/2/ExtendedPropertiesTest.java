package org.apache.commons.collections;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    private File tempFile1;
    private File tempFile2;
    private File tempIncludeFile;

    @Before
    public void setUp() throws Exception {
        tempFile1 = File.createTempFile("extprop_test1", ".properties");
        tempFile2 = File.createTempFile("extprop_test2", ".properties");
        tempIncludeFile = File.createTempFile("extprop_inc", ".properties");
    }

    @After
    public void tearDown() throws Exception {
        if (tempFile1 != null && tempFile1.exists()) {
            tempFile1.delete();
        }
        if (tempFile2 != null && tempFile2.exists()) {
            tempFile2.delete();
        }
        if (tempIncludeFile != null && tempIncludeFile.exists()) {
            tempIncludeFile.delete();
        }
    }

    private void writeToFile(File file, String content) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        try {
            fos.write(content.getBytes("ISO-8859-1"));
        } finally {
            fos.close();
        }
    }

    @Test
    public void testDefaultConstructor_emptyState() {
        ExtendedProperties props = new ExtendedProperties();
        Assert.assertFalse(props.isInitialized());
        Assert.assertEquals(0, props.size());
    }

    @Test
    public void testConstructor_withFile() throws Exception {
        writeToFile(tempFile1, "key1 = value1\nkey2 = value2\n");
        ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath());
        Assert.assertTrue(props.isInitialized());
        Assert.assertEquals("value1", props.getString("key1"));
        Assert.assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testConstructor_withFileAndDefaultFile() throws Exception {
        writeToFile(tempFile1, "key1 = val1\n");
        writeToFile(tempFile2, "key1 = defaultVal1\nkey2 = defaultVal2\n");

        ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());
        Assert.assertEquals("val1", props.getString("key1"));
        Assert.assertEquals("defaultVal2", props.getString("key2"));
    }

    @Test
    public void testInclude_getterAndSetter() {
        ExtendedProperties props = new ExtendedProperties();
        String originalInclude = props.getInclude();
        try {
            props.setInclude("import");
            Assert.assertEquals("import", props.getInclude());
        } finally {
            props.setInclude(originalInclude);
        }
    }

    @Test
    public void testLoad_withEncoding_andIncludeFeatures() throws Exception {
        writeToFile(tempIncludeFile, "inc.key = incValue\n");
        String content = "# Comment line\n" +
                "\n" +
                "empty.val = \n" +
                "simple = hello\n" +
                "multiline = line1 \\\nline2\n" +
                "include = " + tempIncludeFile.getAbsolutePath() + "\n" +
                "escaped.comma = val1\\,val2\n" +
                "escaped.slash = path\\\\value\n" +
                "odd.slash = test\\\\\\\nline\n";

        ExtendedProperties props = new ExtendedProperties();
        InputStream in = new ByteArrayInputStream(content.getBytes("UTF-8"));
        props.load(in, "UTF-8");

        Assert.assertTrue(props.isInitialized());
        Assert.assertEquals("hello", props.getString("simple"));
        Assert.assertEquals("line1line2", props.getString("multiline"));
        Assert.assertEquals("incValue", props.getString("inc.key"));
        Assert.assertEquals("val1,val2", props.getString("escaped.comma"));
    }

    @Test
    public void testLoad_relativeInclude() throws Exception {
        File parentDir = tempFile1.getParentFile();
        File relInc = new File(parentDir, "rel_inc_test.properties");
        try {
            writeToFile(relInc, "rel.key = relValue\n");
            writeToFile(tempFile1, "include = ./" + relInc.getName() + "\nkey = val\n");

            ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath());
            Assert.assertEquals("val", props.getString("key"));
            Assert.assertEquals("relValue", props.getString("rel.key"));
        } finally {
            if (relInc.exists()) {
                relInc.delete();
            }
        }
    }

    @Test
    public void testLoad_invalidEncodingFallsBack() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        InputStream in = new ByteArrayInputStream("key=val\n".getBytes());
        props.load(in, "INVALID_CHARSET_NAME");
        Assert.assertEquals("val", props.getString("key"));
    }

    @Test
    public void testInterpolation_normalAndRecursive() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("base", "http://localhost");
        props.addProperty("port", "8080");
        props.addProperty("url", "${base}:${port}/api");
        props.addProperty("context", "${url}/v1");

        Assert.assertEquals("http://localhost:8080/api/v1", props.getString("context"));
    }

    @Test
    public void testInterpolation_undefinedVariableKeptAsIs() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("msg", "Hello ${unknown.var}!");
        Assert.assertEquals("Hello ${unknown.var}!", props.getString("msg"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolation_infiniteLoopThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("a", "${b}");
        props.addProperty("b", "${c}");
        props.addProperty("c", "${a}");
        props.getString("a");
    }

    @Test
    public void testAddProperty_andSetProperty_andClearProperty() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("list", "a,b,c");
        Assert.assertEquals(3, props.getStringArray("list").length);

        props.addProperty("list", "d");
        Assert.assertEquals(4, props.getStringArray("list").length);

        props.addProperty("nonString", new Integer(100));
        Assert.assertEquals(new Integer(100), props.getProperty("nonString"));

        props.setProperty("list", "single");
        Assert.assertEquals("single", props.getString("list"));

        props.clearProperty("list");
        Assert.assertNull(props.getProperty("list"));
        Assert.assertNull(props.getString("list", null));
    }

    @Test
    public void testGetProperty_withDefaults() throws Exception {
        writeToFile(tempFile1, "key1 = v1\n");
        writeToFile(tempFile2, "key2 = v2\n");
        ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());

        Assert.assertEquals("v1", props.getProperty("key1"));
        Assert.assertEquals("v2", props.getProperty("key2"));
        Assert.assertNull(props.getProperty("nonExisting"));
    }

    @Test
    public void testSave_outputStream() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("single", "val,with,comma\\and\\slash");
        props.addProperty("multi", "val1");
        props.addProperty("multi", "val2");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, "# Header Test");

        String savedContent = new String(out.toByteArray());
        Assert.assertTrue(savedContent.contains("# Header Test"));
        Assert.assertTrue(savedContent.contains("single="));
        Assert.assertTrue(savedContent.contains("multi="));

        // Test save with null output stream
        props.save(null, "header");
    }

    @Test
    public void testCombine() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "val1");
        props1.addProperty("key2", "val2");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("key2", "newVal2");
        props2.addProperty("key3", "val3");

        props1.combine(props2);

        Assert.assertEquals("val1", props1.getString("key1"));
        Assert.assertEquals("newVal2", props1.getString("key2"));
        Assert.assertEquals("val3", props1.getString("key3"));
    }

    @Test
    public void testGetKeys_andGetKeysPrefix() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("a.b", "1");
        props.addProperty("a.c", "2");
        props.addProperty("b.a", "3");

        Iterator allKeys = props.getKeys();
        int count = 0;
        while (allKeys.hasNext()) {
            allKeys.next();
            count++;
        }
        Assert.assertEquals(3, count);

        Iterator prefixKeys = props.getKeys("a.");
        List keyList = new ArrayList();
        while (prefixKeys.hasNext()) {
            keyList.add(prefixKeys.next());
        }
        Assert.assertEquals(2, keyList.size());
        Assert.assertTrue(keyList.contains("a.b"));
        Assert.assertTrue(keyList.contains("a.c"));
    }

    @Test
    public void testSubset() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("prefix", "exactMatch");
        props.addProperty("prefix.key1", "val1");
        props.addProperty("prefix.key2", "val2");
        props.addProperty("other.key", "val3");

        ExtendedProperties subset = props.subset("prefix");
        Assert.assertNotNull(subset);
        Assert.assertEquals("exactMatch", subset.getString("prefix"));
        Assert.assertEquals("val1", subset.getString("key1"));
        Assert.assertEquals("val2", subset.getString("key2"));
        Assert.assertNull(subset.getProperty("other.key"));

        Assert.assertNull(props.subset("nonExistingPrefix"));
    }

    @Test
    public void testDisplay_doesNotThrow() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "val1");
        props.display();
    }

    @Test
    public void testGetString_variousScenarios() throws Exception {
        writeToFile(tempFile1, "k1 = v1\nk2 = v2_1,v2_2\n");
        writeToFile(tempFile2, "defKey = defVal\n");
        ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());

        Assert.assertEquals("v1", props.getString("k1"));
        Assert.assertEquals("v1", props.getString("k1", "fallback"));
        Assert.assertEquals("v2_1", props.getString("k2"));
        Assert.assertEquals("defVal", props.getString("defKey"));
        Assert.assertEquals("fallback", props.getString("nonExisting", "fallback"));
        Assert.assertNull(props.getString("nonExisting", null));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_invalidTypeThrowsClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("intVal", new Integer(10));
        props.getString("intVal");
    }

    @Test
    public void testGetProperties_normal() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("subProps", "k1=v1,k2=v2");

        Properties defaults = new Properties();
        defaults.setProperty("defK", "defV");

        Properties result = props.getProperties("subProps", defaults);
        Assert.assertEquals("v1", result.getProperty("k1"));
        Assert.assertEquals("v2", result.getProperty("k2"));
        Assert.assertEquals("defV", result.getProperty("defK"));

        Properties defaultRes = props.getProperties("subProps");
        Assert.assertEquals("v1", defaultRes.getProperty("k1"));
        Assert.assertEquals("v2", defaultRes.getProperty("k2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_malformedThrowsIllegalArgumentException() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("subProps", "k1_no_equals");
        props.getProperties("subProps");
    }

    @Test
    public void testGetStringArray() throws Exception {
        writeToFile(tempFile1, "single = one\nmulti = one,two\n");
        writeToFile(tempFile2, "defArray = a,b\n");
        ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());

        String[] single = props.getStringArray("single");
        Assert.assertEquals(1, single.length);
        Assert.assertEquals("one", single[0]);

        String[] multi = props.getStringArray("multi");
        Assert.assertEquals(2, multi.length);
        Assert.assertEquals("one", multi[0]);
        Assert.assertEquals("two", multi[1]);

        String[] defArr = props.getStringArray("defArray");
        Assert.assertEquals(2, defArr.length);

        String[] empty = props.getStringArray("unknownKey");
        Assert.assertEquals(0, empty.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Integer(1));
        props.getStringArray("invalid");
    }

    @Test
    public void testGetVector_andGetList() throws Exception {
        writeToFile(tempFile1, "single = one\nmulti = one,two\n");
        writeToFile(tempFile2, "defKey = defOne,defTwo\n");
        ExtendedProperties props = new ExtendedProperties(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());

        Vector vSingle = props.getVector("single");
        Assert.assertEquals(1, vSingle.size());

        Vector vMulti = props.getVector("multi");
        Assert.assertEquals(2, vMulti.size());

        Vector vDef = props.getVector("defKey");
        Assert.assertEquals(2, vDef.size());

        Vector customDef = new Vector();
        customDef.add("default");
        Assert.assertEquals(customDef, props.getVector("notFound", customDef));
        Assert.assertEquals(0, props.getVector("notFound", null).size());

        List lSingle = props.getList("single");
        Assert.assertEquals(1, lSingle.size());

        List lMulti = props.getList("multi");
        Assert.assertEquals(2, lMulti.size());

        List lDef = props.getList("defKey");
        Assert.assertEquals(2, lDef.size());

        List customDefList = new ArrayList();
        customDefList.add("default");
        Assert.assertEquals(customDefList, props.getList("notFound", customDefList));
        Assert.assertEquals(0, props.getList("notFound", null).size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_invalidTypeThrowsClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Integer(1));
        props.getVector("key");
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_invalidTypeThrowsClassCastException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key", new Integer(1));
        props.getList("key");
    }

    @Test
    public void testTestBoolean_andGetBoolean() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        Assert.assertEquals("true", props.testBoolean("true"));
        Assert.assertEquals("true", props.testBoolean("on"));
        Assert.assertEquals("true", props.testBoolean("yes"));
        Assert.assertEquals("false", props.testBoolean("false"));
        Assert.assertEquals("false", props.testBoolean("off"));
        Assert.assertEquals("false", props.testBoolean("no"));
        Assert.assertNull(props.testBoolean("maybe"));

        props.addProperty("b1", "true");
        props.addProperty("b2", Boolean.FALSE);
        props.addProperty("b3", "invalid");

        Assert.assertTrue(props.getBoolean("b1"));
        Assert.assertFalse(props.getBoolean("b2"));
        Assert.assertFalse(props.getBoolean("b3"));
        Assert.assertTrue(props.getBoolean("nonExisting", true));
        Assert.assertFalse(props.getBoolean("nonExisting", false));

        writeToFile(tempFile1, "defBool = yes\n");
        ExtendedProperties withDefaults = new ExtendedProperties();
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        withDefaults.combine(defaults);
        Assert.assertTrue(withDefaults.getBoolean("defBool", Boolean.FALSE));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getBoolean("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Integer(1));
        props.getBoolean("invalid", Boolean.TRUE);
    }

    @Test
    public void testGetByte() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("b1", "12");
        props.addProperty("b2", new Byte((byte) 34));

        Assert.assertEquals((byte) 12, props.getByte("b1"));
        Assert.assertEquals((byte) 34, props.getByte("b2"));
        Assert.assertEquals((byte) 56, props.getByte("missing", (byte) 56));
        Assert.assertEquals(new Byte((byte) 78), props.getByte("missing", new Byte((byte) 78)));

        writeToFile(tempFile1, "defByte = 90\n");
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        ExtendedProperties withDefaults = new ExtendedProperties();
        withDefaults.combine(defaults);
        Assert.assertEquals((byte) 90, withDefaults.getByte("defByte"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getByte("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Float(1.0f));
        props.getByte("invalid", new Byte((byte) 1));
    }

    @Test
    public void testGetShort() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("s1", "123");
        props.addProperty("s2", new Short((short) 456));

        Assert.assertEquals((short) 123, props.getShort("s1"));
        Assert.assertEquals((short) 456, props.getShort("s2"));
        Assert.assertEquals((short) 789, props.getShort("missing", (short) 789));
        Assert.assertEquals(new Short((short) 999), props.getShort("missing", new Short((short) 999)));

        writeToFile(tempFile1, "defShort = 1111\n");
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        ExtendedProperties withDefaults = new ExtendedProperties();
        withDefaults.combine(defaults);
        Assert.assertEquals((short) 1111, withDefaults.getShort("defShort"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getShort("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Float(1.0f));
        props.getShort("invalid", new Short((short) 1));
    }

    @Test
    public void testGetInt_andGetInteger() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("i1", "12345");
        props.addProperty("i2", new Integer(67890));

        Assert.assertEquals(12345, props.getInt("i1"));
        Assert.assertEquals(67890, props.getInt("i2"));
        Assert.assertEquals(12345, props.getInteger("i1"));
        Assert.assertEquals(67890, props.getInteger("i2"));
        Assert.assertEquals(999, props.getInt("missing", 999));
        Assert.assertEquals(999, props.getInteger("missing", 999));
        Assert.assertEquals(new Integer(888), props.getInteger("missing", new Integer(888)));

        writeToFile(tempFile1, "defInt = 55555\n");
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        ExtendedProperties withDefaults = new ExtendedProperties();
        withDefaults.combine(defaults);
        Assert.assertEquals(55555, withDefaults.getInt("defInt"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getInteger("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Float(1.0f));
        props.getInteger("invalid", new Integer(1));
    }

    @Test
    public void testGetLong() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("l1", "1234567890");
        props.addProperty("l2", new Long(9876543210L));

        Assert.assertEquals(1234567890L, props.getLong("l1"));
        Assert.assertEquals(9876543210L, props.getLong("l2"));
        Assert.assertEquals(100L, props.getLong("missing", 100L));
        Assert.assertEquals(new Long(200L), props.getLong("missing", new Long(200L)));

        writeToFile(tempFile1, "defLong = 123456\n");
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        ExtendedProperties withDefaults = new ExtendedProperties();
        withDefaults.combine(defaults);
        Assert.assertEquals(123456L, withDefaults.getLong("defLong"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getLong("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Float(1.0f));
        props.getLong("invalid", new Long(1L));
    }

    @Test
    public void testGetFloat() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("f1", "12.34");
        props.addProperty("f2", new Float(56.78f));

        Assert.assertEquals(12.34f, props.getFloat("f1"), 0.001f);
        Assert.assertEquals(56.78f, props.getFloat("f2"), 0.001f);
        Assert.assertEquals(99.9f, props.getFloat("missing", 99.9f), 0.001f);
        Assert.assertEquals(new Float(88.8f), props.getFloat("missing", new Float(88.8f)));

        writeToFile(tempFile1, "defFloat = 1.23\n");
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        ExtendedProperties withDefaults = new ExtendedProperties();
        withDefaults.combine(defaults);
        Assert.assertEquals(1.23f, withDefaults.getFloat("defFloat"), 0.001f);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getFloat("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Integer(1));
        props.getFloat("invalid", new Float(1.0f));
    }

    @Test
    public void testGetDouble() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("d1", "123.456");
        props.addProperty("d2", new Double(789.012));

        Assert.assertEquals(123.456, props.getDouble("d1"), 0.0001);
        Assert.assertEquals(789.012, props.getDouble("d2"), 0.0001);
        Assert.assertEquals(99.99, props.getDouble("missing", 99.99), 0.0001);
        Assert.assertEquals(new Double(88.88), props.getDouble("missing", new Double(88.88)));

        writeToFile(tempFile1, "defDouble = 456.789\n");
        ExtendedProperties defaults = new ExtendedProperties(tempFile1.getAbsolutePath());
        ExtendedProperties withDefaults = new ExtendedProperties();
        withDefaults.combine(defaults);
        Assert.assertEquals(456.789, withDefaults.getDouble("defDouble"), 0.0001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_missingKeyThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.getDouble("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_invalidTypeThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalid", new Integer(1));
        props.getDouble("invalid", new Double(1.0));
    }

    @Test
    public void testConvertProperties() {
        Properties parentProps = new Properties();
        parentProps.setProperty("parentKey", "parentVal");

        Properties props = new Properties(parentProps);
        props.setProperty("childKey", "childVal");

        ExtendedProperties extProps = ExtendedProperties.convertProperties(props);
        Assert.assertEquals("childVal", extProps.getString("childKey"));
        Assert.assertEquals("parentVal", extProps.getString("parentKey"));
    }
}
