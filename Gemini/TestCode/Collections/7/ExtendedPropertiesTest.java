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
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
        tempIncludeFile = File.createTempFile("extprop_include", ".properties");

        tempFile1.deleteOnExit();
        tempFile2.deleteOnExit();
        tempIncludeFile.deleteOnExit();
    }

    @After
    public void tearDown() {
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
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
        pw.print(content);
        pw.flush();
        pw.close();
    }

    @Test
    public void testDefaultConstructor_isNotInitialized() {
        ExtendedProperties ep = new ExtendedProperties();
        Assert.assertFalse(ep.isInitialized());
        Assert.assertEquals("include", ep.getInclude());
        Assert.assertNull(ep.getProperty("nonExisting"));
    }

    @Test
    public void testFileConstructors() throws Exception {
        writeToFile(tempFile1, "key1 = value1\nkey2 = value2\n");
        writeToFile(tempFile2, "key1 = defaultValue1\ndefaultKey = defaultVal\n");

        ExtendedProperties ep1 = new ExtendedProperties(tempFile1.getAbsolutePath());
        Assert.assertTrue(ep1.isInitialized());
        Assert.assertEquals("value1", ep1.getString("key1"));
        Assert.assertEquals("value2", ep1.getString("key2"));

        ExtendedProperties ep2 = new ExtendedProperties(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());
        Assert.assertEquals("value1", ep2.getString("key1"));
        Assert.assertEquals("defaultVal", ep2.getString("defaultKey"));
    }

    @Test
    public void testIncludeGetterAndSetter() {
        ExtendedProperties ep = new ExtendedProperties();
        Assert.assertEquals("include", ep.getInclude());

        ep.setInclude("customInclude");
        Assert.assertEquals("customInclude", ep.getInclude());

        ep.setInclude(null);
        Assert.assertNull(ep.getInclude());
    }

    @Test
    public void testLoad_multilineAndCommentsAndEmptyLines() throws Exception {
        String propData = "# Comment line\n" +
                "\n" +
                "  # Another comment  \n" +
                "emptyKey =\n" +
                "multiline = line1 \\\n" +
                "            line2 \\\n" +
                "            line3\n" +
                "escaped = val\\\\ue\n" +
                "normal = simple\n";

        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(propData.getBytes("ISO-8859-1")));

        Assert.assertTrue(ep.isInitialized());
        Assert.assertNull(ep.getProperty("emptyKey"));
        Assert.assertEquals("line1 line2 line3", ep.getString("multiline"));
        Assert.assertEquals("val\\ue", ep.getString("escaped"));
        Assert.assertEquals("simple", ep.getString("normal"));
    }

    @Test
    public void testLoad_withEncoding_andFallback() throws Exception {
        String data = "name = Th\\u00e1i\n";
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(data.getBytes("UTF-8")), "UTF-8");
        Assert.assertEquals("Th\\u00e1i", ep.getString("name"));

        ExtendedProperties epFallback = new ExtendedProperties();
        epFallback.load(new ByteArrayInputStream("fallbackKey = fallbackVal\n".getBytes("ISO-8859-1")), "UNSUPPORTED-ENCODING-XYZ");
        Assert.assertEquals("fallbackVal", epFallback.getString("fallbackKey"));
    }

    @Test
    public void testLoad_includeFile_absoluteAndRelative() throws Exception {
        writeToFile(tempIncludeFile, "includedKey = includedValue\n");

        String content = "mainKey = mainValue\n" +
                "include = " + tempIncludeFile.getAbsolutePath() + "\n";
        writeToFile(tempFile1, content);

        ExtendedProperties ep = new ExtendedProperties(tempFile1.getAbsolutePath());
        Assert.assertEquals("mainValue", ep.getString("mainKey"));
        Assert.assertEquals("includedValue", ep.getString("includedKey"));

        File relativeInclude = new File(tempFile1.getParentFile(), "rel_" + tempIncludeFile.getName());
        relativeInclude.deleteOnExit();
        try {
            writeToFile(relativeInclude, "relKey = relValue\n");
            String relContent = "include = ./" + relativeInclude.getName() + "\n";
            writeToFile(tempFile1, relContent);

            ExtendedProperties epRel = new ExtendedProperties(tempFile1.getAbsolutePath());
            Assert.assertEquals("relValue", epRel.getString("relKey"));
        } finally {
            if (relativeInclude.exists()) {
                relativeInclude.delete();
            }
        }
    }

    @Test
    public void testInterpolation_normalAndDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("base.url", "http://localhost");
        defaults.addProperty("port", "8080");

        ExtendedProperties ep = new ExtendedProperties();
        ep.combine(defaults);
        ep.addProperty("path", "/api/v1");
        ep.addProperty("full.url", "${base.url}:${port}${path}");
        ep.addProperty("unresolved", "prefix_${unknown.key}_suffix");

        Assert.assertEquals("http://localhost:8080/api/v1", ep.getString("full.url"));
        Assert.assertEquals("prefix_${unknown.key}_suffix", ep.getString("unresolved"));
        Assert.assertNull(ep.interpolate(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolation_loopDetection_throwsIllegalStateException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("key1", "${key2}");
        ep.addProperty("key2", "${key1}");
        ep.getString("key1");
    }

    @Test
    public void testAddProperty_withCommaSeparationAndEscaping() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("list", "a, b, c\\, d, e\\\\f");
        Object val = ep.getProperty("list");
        Assert.assertTrue(val instanceof List);

        List list = (List) val;
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c, d", list.get(2));

        ep.addProperty("single", "value1");
        ep.addProperty("single", "value2");
        Assert.assertTrue(ep.getProperty("single") instanceof List);
        Assert.assertEquals(2, ((List) ep.getProperty("single")).size());

        ep.addProperty("nonString", new Integer(123));
        Assert.assertEquals(new Integer(123), ep.getProperty("nonString"));
    }

    @Test
    public void testSetProperty_and_clearProperty() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("k1", "v1");
        ep.addProperty("k1", "v2");
        Assert.assertEquals(2, ((List) ep.getProperty("k1")).size());

        ep.setProperty("k1", "v3");
        Assert.assertEquals("v3", ep.getProperty("k1"));

        ep.clearProperty("k1");
        Assert.assertNull(ep.getProperty("k1"));
        ep.clearProperty("nonExistingKey");
    }

    @Test
    public void testSave_nullStream_andValidStream() throws Exception {
        ExtendedProperties ep = new ExtendedProperties();
        ep.save(null, "Header");

        ep.addProperty("singleKey", "single,Value\\test");
        ep.addProperty("multiKey", "item1");
        ep.addProperty("multiKey", "item2");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, "# Test Header");

        String savedContent = baos.toString("ISO-8859-1");
        Assert.assertTrue(savedContent.contains("# Test Header"));
        Assert.assertTrue(savedContent.contains("singleKey=single\\,Value\\\\test"));
        Assert.assertTrue(savedContent.contains("multiKey=item1"));
        Assert.assertTrue(savedContent.contains("multiKey=item2"));
    }

    @Test
    public void testGetKeys_and_getKeysWithPrefix() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("app.name", "myApp");
        ep.addProperty("app.version", "1.0");
        ep.addProperty("db.host", "localhost");

        Iterator allKeys = ep.getKeys();
        int count = 0;
        while (allKeys.hasNext()) {
            allKeys.next();
            count++;
        }
        Assert.assertEquals(3, count);

        Iterator appKeys = ep.getKeys("app.");
        List appList = new ArrayList();
        while (appKeys.hasNext()) {
            appList.add(appKeys.next());
        }
        Assert.assertEquals(2, appList.size());
        Assert.assertTrue(appList.contains("app.name"));
        Assert.assertTrue(appList.contains("app.version"));
    }

    @Test
    public void testSubset() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("prefix", "exactMatch");
        ep.addProperty("prefix.key1", "val1");
        ep.addProperty("prefix.key2", "val2");
        ep.addProperty("other.key", "val3");

        ExtendedProperties subset = ep.subset("prefix");
        Assert.assertNotNull(subset);
        Assert.assertEquals("exactMatch", subset.getProperty("prefix"));
        Assert.assertEquals("val1", subset.getProperty("key1"));
        Assert.assertEquals("val2", subset.getProperty("key2"));
        Assert.assertNull(subset.getProperty("other.key"));

        Assert.assertNull(ep.subset("nonExistingPrefix"));
    }

    @Test
    public void testDisplay() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("key1", "val1");
        ep.display();
    }

    @Test
    public void testGetString_withDefaultsAndErrors() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("defKey", "defVal");

        ExtendedProperties ep = new ExtendedProperties();
        ep.combine(defaults);
        ep.addProperty("strKey", "strVal");
        ep.addProperty("listKey", "item1,item2");

        Assert.assertEquals("strVal", ep.getString("strKey"));
        Assert.assertEquals("strVal", ep.getString("strKey", "fallback"));
        Assert.assertEquals("defVal", ep.getString("defKey", "fallback"));
        Assert.assertEquals("fallback", ep.getString("missingKey", "fallback"));
        Assert.assertEquals("item1", ep.getString("listKey"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("intObj", new Integer(100));
        ep.getString("intObj");
    }

    @Test
    public void testGetProperties() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("db.props", "user=admin,password=secret");

        Properties props = ep.getProperties("db.props");
        Assert.assertEquals("admin", props.getProperty("user"));
        Assert.assertEquals("secret", props.getProperty("password"));

        Properties defaultProps = new Properties();
        defaultProps.setProperty("timeout", "30");
        Properties mergedProps = ep.getProperties("db.props", defaultProps);
        Assert.assertEquals("30", mergedProps.getProperty("timeout"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_malformedToken_throwsIllegalArgumentException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("malformed", "invalid_token_without_equals");
        ep.getProperties("malformed");
    }

    @Test
    public void testGetStringArray() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("str", "single");
        ep.addProperty("multi", "val1,val2");

        String[] strArr = ep.getStringArray("str");
        Assert.assertEquals(1, strArr.length);
        Assert.assertEquals("single", strArr[0]);

        String[] multiArr = ep.getStringArray("multi");
        Assert.assertEquals(2, multiArr.length);
        Assert.assertEquals("val1", multiArr[0]);
        Assert.assertEquals("val2", multiArr[1]);

        String[] emptyArr = ep.getStringArray("missing");
        Assert.assertEquals(0, emptyArr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("badKey", new Integer(10));
        ep.getStringArray("badKey");
    }

    @Test
    public void testGetVector_and_getList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("strVal", "hello");
        ep.addProperty("multiVal", "a,b,c");

        Vector v1 = ep.getVector("strVal");
        Assert.assertEquals(1, v1.size());
        Assert.assertEquals("hello", v1.get(0));

        Vector v2 = ep.getVector("multiVal");
        Assert.assertEquals(3, v2.size());

        Vector defVector = new Vector();
        defVector.add("def");
        Assert.assertEquals(defVector, ep.getVector("missing", defVector));
        Assert.assertEquals(0, ep.getVector("missing", null).size());

        List l1 = ep.getList("strVal");
        Assert.assertEquals(1, l1.size());
        Assert.assertEquals("hello", l1.get(0));

        List l2 = ep.getList("multiVal");
        Assert.assertEquals(3, l2.size());

        List defList = new ArrayList();
        defList.add("def");
        Assert.assertEquals(defList, ep.getList("missing", defList));
        Assert.assertEquals(0, ep.getList("missing", null).size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new Integer(1));
        ep.getVector("bad");
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new Integer(1));
        ep.getList("bad");
    }

    @Test
    public void testTestBoolean() {
        ExtendedProperties ep = new ExtendedProperties();
        Assert.assertEquals("true", ep.testBoolean("true"));
        Assert.assertEquals("true", ep.testBoolean("TRUE"));
        Assert.assertEquals("true", ep.testBoolean("on"));
        Assert.assertEquals("true", ep.testBoolean("yes"));
        Assert.assertEquals("false", ep.testBoolean("false"));
        Assert.assertEquals("false", ep.testBoolean("off"));
        Assert.assertEquals("false", ep.testBoolean("no"));
        Assert.assertNull(ep.testBoolean("invalid"));
    }

    @Test
    public void testGetBoolean() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("b1", "true");
        ep.addProperty("b2", Boolean.FALSE);

        Assert.assertTrue(ep.getBoolean("b1"));
        Assert.assertFalse(ep.getBoolean("b2"));
        Assert.assertTrue(ep.getBoolean("missing", true));
        Assert.assertFalse(ep.getBoolean("missing", false));
        Assert.assertEquals(Boolean.TRUE, ep.getBoolean("missing", Boolean.TRUE));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getBoolean("nonExistent");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new Integer(123));
        ep.getBoolean("bad");
    }

    @Test
    public void testGetByte() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("byteStr", "12");
        ep.put("byteObj", new Byte((byte) 34));

        Assert.assertEquals((byte) 12, ep.getByte("byteStr"));
        Assert.assertEquals((byte) 34, ep.getByte("byteObj"));
        Assert.assertEquals((byte) 56, ep.getByte("missing", (byte) 56));
        Assert.assertEquals(new Byte((byte) 78), ep.getByte("missing", new Byte((byte) 78)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getByte("nonExistent");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByte_numberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("badByte", "abc");
        ep.getByte("badByte");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new ArrayList());
        ep.getByte("bad");
    }

    @Test
    public void testGetShort() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("shortStr", "1000");
        ep.put("shortObj", new Short((short) 2000));

        Assert.assertEquals((short) 1000, ep.getShort("shortStr"));
        Assert.assertEquals((short) 2000, ep.getShort("shortObj"));
        Assert.assertEquals((short) 3000, ep.getShort("missing", (short) 3000));
        Assert.assertEquals(new Short((short) 4000), ep.getShort("missing", new Short((short) 4000)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getShort("nonExistent");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShort_numberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("badShort", "invalid");
        ep.getShort("badShort");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new ArrayList());
        ep.getShort("bad");
    }

    @Test
    public void testGetIntAndInteger() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("intStr", "100");
        ep.put("intObj", new Integer(200));

        Assert.assertEquals(100, ep.getInt("intStr"));
        Assert.assertEquals(100, ep.getInt("intStr", 50));
        Assert.assertEquals(50, ep.getInt("missing", 50));

        Assert.assertEquals(100, ep.getInteger("intStr"));
        Assert.assertEquals(200, ep.getInteger("intObj"));
        Assert.assertEquals(300, ep.getInteger("missing", 300));
        Assert.assertEquals(new Integer(400), ep.getInteger("missing", new Integer(400)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getInteger("nonExistent");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetInteger_numberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("badInt", "abc");
        ep.getInteger("badInt");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new ArrayList());
        ep.getInteger("bad");
    }

    @Test
    public void testGetLong() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("longStr", "10000000000");
        ep.put("longObj", new Long(20000000000L));

        Assert.assertEquals(10000000000L, ep.getLong("longStr"));
        Assert.assertEquals(20000000000L, ep.getLong("longObj"));
        Assert.assertEquals(30000000000L, ep.getLong("missing", 30000000000L));
        Assert.assertEquals(new Long(40000000000L), ep.getLong("missing", new Long(40000000000L)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("nonExistent");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLong_numberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("badLong", "abc");
        ep.getLong("badLong");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new ArrayList());
        ep.getLong("bad");
    }

    @Test
    public void testGetFloat() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("floatStr", "1.23");
        ep.put("floatObj", new Float(4.56f));

        Assert.assertEquals(1.23f, ep.getFloat("floatStr"), 0.0001f);
        Assert.assertEquals(4.56f, ep.getFloat("floatObj"), 0.0001f);
        Assert.assertEquals(7.89f, ep.getFloat("missing", 7.89f), 0.0001f);
        Assert.assertEquals(new Float(9.99f), ep.getFloat("missing", new Float(9.99f)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getFloat("nonExistent");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloat_numberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("badFloat", "abc");
        ep.getFloat("badFloat");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new ArrayList());
        ep.getFloat("bad");
    }

    @Test
    public void testGetDouble() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("doubleStr", "1.23456789");
        ep.put("doubleObj", new Double(9.87654321));

        Assert.assertEquals(1.23456789, ep.getDouble("doubleStr"), 0.00000001);
        Assert.assertEquals(9.87654321, ep.getDouble("doubleObj"), 0.00000001);
        Assert.assertEquals(5.555, ep.getDouble("missing", 5.555), 0.0001);
        Assert.assertEquals(new Double(7.777), ep.getDouble("missing", new Double(7.777)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_notFound_throwsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("nonExistent");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDouble_numberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("badDouble", "abc");
        ep.getDouble("badDouble");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_classCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("bad", new ArrayList());
        ep.getDouble("bad");
    }

    @Test
    public void testConvertProperties() {
        Properties parentProps = new Properties();
        parentProps.setProperty("parentKey", "parentVal");

        Properties childProps = new Properties(parentProps);
        childProps.setProperty("childKey", "childVal");

        ExtendedProperties ep = ExtendedProperties.convertProperties(childProps);
        Assert.assertEquals("childVal", ep.getString("childKey"));
        Assert.assertEquals("parentVal", ep.getString("parentKey"));
    }

    @Test
    public void testPutAll_fromExtendedProperties_andFromMap() {
        ExtendedProperties sourceEp = new ExtendedProperties();
        sourceEp.addProperty("k1", "v1");
        sourceEp.addProperty("k2", "v2");

        ExtendedProperties target1 = new ExtendedProperties();
        target1.putAll(sourceEp);
        Assert.assertEquals("v1", target1.getString("k1"));
        Assert.assertEquals("v2", target1.getString("k2"));

        Map normalMap = new HashMap();
        normalMap.put("m1", "valM1");
        normalMap.put("m2", "valM2");

        ExtendedProperties target2 = new ExtendedProperties();
        target2.putAll(normalMap);
        Assert.assertEquals("valM1", target2.getString("m1"));
        Assert.assertEquals("valM2", target2.getString("m2"));
    }
}
