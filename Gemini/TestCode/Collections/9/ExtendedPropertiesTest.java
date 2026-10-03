package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private ExtendedProperties ep;

    @Before
    public void setUp() {
        ep = new ExtendedProperties();
    }

    @Test
    public void testDefaultConstructor_initiallyEmptyAndUninitialized() {
        ExtendedProperties props = new ExtendedProperties();
        Assert.assertFalse(props.isInitialized());
        Assert.assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testFileConstructor_singleFile() throws IOException {
        File file = tempFolder.newFile("test.properties");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("key1 = value1\nkey2 = value2\n".getBytes("ISO-8859-1"));
        fos.close();

        ExtendedProperties props = new ExtendedProperties(file.getAbsolutePath());
        Assert.assertTrue(props.isInitialized());
        Assert.assertEquals("value1", props.getString("key1"));
        Assert.assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testFileConstructor_withDefaultFile() throws IOException {
        File defaultFile = tempFolder.newFile("default.properties");
        FileOutputStream fosDef = new FileOutputStream(defaultFile);
        fosDef.write("key1 = defaultValue1\ndefKey = defValue\n".getBytes("ISO-8859-1"));
        fosDef.close();

        File mainFile = tempFolder.newFile("main.properties");
        FileOutputStream fosMain = new FileOutputStream(mainFile);
        fosMain.write("key1 = mainValue1\n".getBytes("ISO-8859-1"));
        fosMain.close();

        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        Assert.assertEquals("mainValue1", props.getString("key1"));
        Assert.assertEquals("defValue", props.getString("defKey"));
    }

    @Test
    public void testGetAndSetInclude() {
        Assert.assertEquals("include", ep.getInclude());

        ep.setInclude("import");
        Assert.assertEquals("import", ep.getInclude());

        ep.setInclude(null);
        Assert.assertNull(ep.getInclude());

        ep.setInclude("");
        Assert.assertNull(ep.getInclude());
    }

    @Test
    public void testLoad_fromInputStreamAndEncodings() throws IOException {
        String data = "# Comment line\n" +
                "\n" +
                "empty.val =\n" +
                "simple.key = simpleValue\n" +
                "continuation = line1 \\\n" +
                "line2 \\\n" +
                "line3\n" +
                "escaped.comma = one\\,two,three\n" +
                "double.slash = back\\\\slash\n";

        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));
        ep.load(in, "UTF-8");
        Assert.assertTrue(ep.isInitialized());
        Assert.assertEquals("simpleValue", ep.getString("simple.key"));
        Assert.assertEquals("line1line2line3", ep.getString("continuation"));
        Assert.assertEquals("back\\slash", ep.getString("double.slash"));

        Vector vec = ep.getVector("escaped.comma");
        Assert.assertEquals(2, vec.size());
        Assert.assertEquals("one,two", vec.get(0));
        Assert.assertEquals("three", vec.get(1));
    }

    @Test
    public void testLoad_invalidEncodingFallback() throws IOException {
        String data = "key = value\n";
        InputStream in = new ByteArrayInputStream(data.getBytes());
        ep.load(in, "INVALID_CHARSET_NAME_XYZ");
        Assert.assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_withIncludesRelativeAndAbsolute() throws IOException {
        File subFile = tempFolder.newFile("included.properties");
        FileOutputStream fosSub = new FileOutputStream(subFile);
        fosSub.write("included.key = includedValue\n".getBytes("ISO-8859-1"));
        fosSub.close();

        File mainFile = tempFolder.newFile("parent.properties");
        FileOutputStream fosMain = new FileOutputStream(mainFile);
        fosMain.write(("include = ./" + subFile.getName() + "\ninclude_abs = " + subFile.getAbsolutePath() + "\n").getBytes("ISO-8859-1"));
        fosMain.close();

        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath());
        Assert.assertEquals("includedValue", props.getString("included.key"));

        props.setInclude("include_abs");
        InputStream in = new ByteArrayInputStream(("include_abs = " + subFile.getAbsolutePath() + "\n").getBytes());
        props.load(in);
        Assert.assertEquals("includedValue", props.getString("included.key"));
    }

    @Test
    public void testAddProperty_multipleValuesAndVectorConversion() {
        ep.addProperty("multikey", "first");
        Assert.assertEquals("first", ep.getString("multikey"));

        ep.addProperty("multikey", "second");
        List list = ep.getList("multikey");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("first", list.get(0));
        Assert.assertEquals("second", list.get(1));

        ep.addProperty("multikey", "third");
        list = ep.getList("multikey");
        Assert.assertEquals(3, list.size());

        ep.addProperty("nonstring", Integer.valueOf(100));
        Assert.assertEquals(Integer.valueOf(100), ep.getProperty("nonstring"));
    }

    @Test
    public void testSetProperty_overwritesExisting() {
        ep.addProperty("key", "val1");
        ep.addProperty("key", "val2");
        Assert.assertEquals(2, ep.getList("key").size());

        ep.setProperty("key", "newVal");
        Assert.assertEquals("newVal", ep.getString("key"));
        Assert.assertEquals(1, ep.getList("key").size());
    }

    @Test
    public void testPut_and_putAll_and_remove() {
        Object old = ep.put("k1", "v1");
        Assert.assertNull(old);
        Assert.assertEquals("v1", ep.get("k1"));

        old = ep.put("k1", "v2");
        Assert.assertEquals("v1", old);
        Assert.assertEquals(2, ep.getList("k1").size());

        Map map = new HashMap();
        map.put("k2", "v2");
        map.put("k3", "v3");
        ep.putAll(map);
        Assert.assertEquals("v2", ep.getString("k2"));
        Assert.assertEquals("v3", ep.getString("k3"));

        ExtendedProperties epOther = new ExtendedProperties();
        epOther.setProperty("k4", "v4");
        ep.putAll(epOther);
        Assert.assertEquals("v4", ep.getString("k4"));

        Object removed = ep.remove("k4");
        Assert.assertEquals("v4", removed);
        Assert.assertNull(ep.getProperty("k4"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties p1 = new ExtendedProperties();
        p1.setProperty("a", "1");
        p1.setProperty("b", "2");

        ExtendedProperties p2 = new ExtendedProperties();
        p2.setProperty("b", "20");
        p2.setProperty("c", "30");

        p1.combine(p2);
        Assert.assertEquals("1", p1.getString("a"));
        Assert.assertEquals("20", p1.getString("b"));
        Assert.assertEquals("30", p1.getString("c"));
    }

    @Test
    public void testClearProperty() {
        ep.setProperty("key1", "val1");
        ep.setProperty("key2", "val2");
        ep.clearProperty("key1");
        Assert.assertNull(ep.getProperty("key1"));
        Assert.assertEquals("val2", ep.getProperty("key2"));

        ep.clearProperty("non_existing");
    }

    @Test
    public void testGetKeys_and_getKeysPrefix() {
        ep.setProperty("app.name", "App");
        ep.setProperty("app.version", "1.0");
        ep.setProperty("db.host", "localhost");

        Iterator allKeys = ep.getKeys();
        List keyList = new ArrayList();
        while (allKeys.hasNext()) {
            keyList.add(allKeys.next());
        }
        Assert.assertEquals(Arrays.asList("app.name", "app.version", "db.host"), keyList);

        Iterator appKeys = ep.getKeys("app.");
        List appKeyList = new ArrayList();
        while (appKeys.hasNext()) {
            appKeyList.add(appKeys.next());
        }
        Assert.assertEquals(Arrays.asList("app.name", "app.version"), appKeyList);
    }

    @Test
    public void testSubset() {
        ep.setProperty("prefix", "root");
        ep.setProperty("prefix.item1", "val1");
        ep.setProperty("prefix.item2", "val2");
        ep.setProperty("other.item", "val3");

        ExtendedProperties sub = ep.subset("prefix");
        Assert.assertNotNull(sub);
        Assert.assertEquals("root", sub.getString("prefix"));
        Assert.assertEquals("val1", sub.getString("item1"));
        Assert.assertEquals("val2", sub.getString("item2"));
        Assert.assertNull(sub.getString("other.item"));

        Assert.assertNull(ep.subset("nonexistent"));
    }

    @Test
    public void testDisplay() {
        ep.setProperty("k1", "v1");
        PrintStream orig = System.out;
        try {
            System.setOut(new PrintStream(new ByteArrayOutputStream()));
            ep.display();
        } finally {
            System.setOut(orig);
        }
    }

    @Test
    public void testSave() throws IOException {
        ep.save(null, "header");

        ep.setProperty("key.simple", "value,simple\\escape");
        List list = new ArrayList();
        list.add("item1");
        list.add("item2,comma");
        ep.addPropertyDirectForTest("key.list", list);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, "# Test Header");
        String output = baos.toString();

        Assert.assertTrue(output.contains("# Test Header"));
        Assert.assertTrue(output.contains("key.simple=value\\,simple\\\\escape"));
        Assert.assertTrue(output.contains("key.list=item1"));
        Assert.assertTrue(output.contains("key.list=item2\\,comma"));
    }

    private void addPropertyDirectForTest(String key, Object val) {
        ep.setProperty(key, "temp");
        ep.put(key, val);
    }

    @Test
    public void testInterpolation_normalAndDefaults() {
        ep.setProperty("base.url", "http://localhost");
        ep.setProperty("port", "8080");
        ep.setProperty("full.url", "${base.url}:${port}/api");
        ep.setProperty("unknown.prop", "Hello ${missing.key}!");

        Assert.assertEquals("http://localhost:8080/api", ep.getString("full.url"));
        Assert.assertEquals("Hello ${missing.key}!", ep.getString("unknown.prop"));

        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("default.port", "9090");
        defaults.setProperty("def.only", "defValue");
        ep.setDefaultsForTest(defaults);

        ep.setProperty("url.with.default", "http://example.com:${default.port}");
        Assert.assertEquals("http://example.com:9090", ep.getString("url.with.default"));
        Assert.assertEquals("defValue", ep.getString("def.only"));
    }

    private void setDefaultsForTest(ExtendedProperties defaults) {
        try {
            java.lang.reflect.Field field = ExtendedProperties.class.getDeclaredField("defaults");
            field.setAccessible(true);
            field.set(ep, defaults);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolation_infiniteLoopException() {
        ep.setProperty("var1", "${var2}");
        ep.setProperty("var2", "${var1}");
        ep.getString("var1");
    }

    @Test
    public void testGetString_variations() {
        Assert.assertNull(ep.getString("not.found"));
        Assert.assertEquals("defVal", ep.getString("not.found", "defVal"));

        ep.addProperty("list.prop", "first");
        ep.addProperty("list.prop", "second");
        Assert.assertEquals("first", ep.getString("list.prop"));

        ep.put("int.prop", Integer.valueOf(123));
        try {
            ep.getString("int.prop");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetProperties() {
        ep.setProperty("props", "key1=val1,key2=val2");
        Properties p = ep.getProperties("props");
        Assert.assertEquals("val1", p.getProperty("key1"));
        Assert.assertEquals("val2", p.getProperty("key2"));

        Properties defProps = new Properties();
        defProps.put("defKey", "defVal");
        Properties p2 = ep.getProperties("props", defProps);
        Assert.assertEquals("defVal", p2.getProperty("defKey"));
        Assert.assertEquals("val1", p2.getProperty("key1"));

        ep.setProperty("bad.props", "invalidTokenNoEqualSign");
        try {
            ep.getProperties("bad.props");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetStringArray() {
        ep.setProperty("arr", "a,b,c");
        String[] arr = ep.getStringArray("arr");
        Assert.assertArrayEquals(new String[]{"a", "b", "c"}, arr);

        ep.setProperty("single", "value");
        Assert.assertArrayEquals(new String[]{"value"}, ep.getStringArray("single"));

        Assert.assertArrayEquals(new String[0], ep.getStringArray("not.found"));

        ep.put("obj", Integer.valueOf(42));
        try {
            ep.getStringArray("obj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetVector_and_GetList() {
        ep.setProperty("items", "x,y");
        Vector v = ep.getVector("items");
        Assert.assertEquals(2, v.size());
        Assert.assertEquals("x", v.get(0));

        ep.setProperty("single", "singleVal");
        Vector vSingle = ep.getVector("single");
        Assert.assertEquals(1, vSingle.size());
        Assert.assertEquals("singleVal", vSingle.get(0));

        Vector defVec = new Vector();
        defVec.add("def");
        Assert.assertEquals(defVec, ep.getVector("missing", defVec));
        Assert.assertEquals(0, ep.getVector("missing_nodef").size());

        List l = ep.getList("items");
        Assert.assertEquals(2, l.size());

        List lSingle = ep.getList("single");
        Assert.assertEquals(1, lSingle.size());

        List defList = new ArrayList();
        defList.add("def");
        Assert.assertEquals(defList, ep.getList("missing", defList));
        Assert.assertEquals(0, ep.getList("missing_nodef").size());

        ep.put("notList", Integer.valueOf(99));
        try {
            ep.getVector("notList");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
        try {
            ep.getList("notList");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testTestBoolean() {
        Assert.assertEquals("true", ep.testBoolean("true"));
        Assert.assertEquals("true", ep.testBoolean("TRUE"));
        Assert.assertEquals("true", ep.testBoolean("on"));
        Assert.assertEquals("true", ep.testBoolean("ON"));
        Assert.assertEquals("true", ep.testBoolean("yes"));
        Assert.assertEquals("true", ep.testBoolean("YES"));

        Assert.assertEquals("false", ep.testBoolean("false"));
        Assert.assertEquals("false", ep.testBoolean("FALSE"));
        Assert.assertEquals("false", ep.testBoolean("off"));
        Assert.assertEquals("false", ep.testBoolean("OFF"));
        Assert.assertEquals("false", ep.testBoolean("no"));
        Assert.assertEquals("false", ep.testBoolean("NO"));

        Assert.assertNull(ep.testBoolean("maybe"));
        Assert.assertNull(ep.testBoolean("123"));
    }

    @Test
    public void testGetBoolean() {
        ep.setProperty("bool.true", "true");
        ep.setProperty("bool.on", "on");
        ep.setProperty("bool.false", "false");
        ep.put("bool.obj", Boolean.TRUE);

        Assert.assertTrue(ep.getBoolean("bool.true"));
        Assert.assertTrue(ep.getBoolean("bool.on"));
        Assert.assertFalse(ep.getBoolean("bool.false"));
        Assert.assertTrue(ep.getBoolean("bool.obj"));

        Assert.assertTrue(ep.getBoolean("missing", true));
        Assert.assertFalse(ep.getBoolean("missing", false));
        Assert.assertEquals(Boolean.TRUE, ep.getBoolean("missing", Boolean.TRUE));
        Assert.assertNull(ep.getBoolean("missing", (Boolean) null));

        try {
            ep.getBoolean("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.put("bool.invalidObj", Integer.valueOf(1));
        try {
            ep.getBoolean("bool.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetByte() {
        ep.setProperty("byte.val", "42");
        ep.put("byte.obj", Byte.valueOf((byte) 10));

        Assert.assertEquals((byte) 42, ep.getByte("byte.val"));
        Assert.assertEquals((byte) 10, ep.getByte("byte.obj"));
        Assert.assertEquals((byte) 7, ep.getByte("missing", (byte) 7));
        Assert.assertEquals(Byte.valueOf((byte) 8), ep.getByte("missing", Byte.valueOf((byte) 8)));

        try {
            ep.getByte("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.setProperty("byte.invalid", "abc");
        try {
            ep.getByte("byte.invalid");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }

        ep.put("byte.invalidObj", new Object());
        try {
            ep.getByte("byte.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetShort() {
        ep.setProperty("short.val", "1234");
        ep.put("short.obj", Short.valueOf((short) 5678));

        Assert.assertEquals((short) 1234, ep.getShort("short.val"));
        Assert.assertEquals((short) 5678, ep.getShort("short.obj"));
        Assert.assertEquals((short) 100, ep.getShort("missing", (short) 100));
        Assert.assertEquals(Short.valueOf((short) 200), ep.getShort("missing", Short.valueOf((short) 200)));

        try {
            ep.getShort("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.setProperty("short.invalid", "abc");
        try {
            ep.getShort("short.invalid");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }

        ep.put("short.invalidObj", new Object());
        try {
            ep.getShort("short.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetIntAndGetInteger() {
        ep.setProperty("int.val", "999");
        ep.put("int.obj", Integer.valueOf(888));

        Assert.assertEquals(999, ep.getInt("int.val"));
        Assert.assertEquals(888, ep.getInt("int.obj"));
        Assert.assertEquals(999, ep.getInteger("int.val"));
        Assert.assertEquals(888, ep.getInteger("int.obj"));

        Assert.assertEquals(55, ep.getInt("missing", 55));
        Assert.assertEquals(66, ep.getInteger("missing", 66));
        Assert.assertEquals(Integer.valueOf(77), ep.getInteger("missing", Integer.valueOf(77)));

        try {
            ep.getInt("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        try {
            ep.getInteger("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.setProperty("int.invalid", "xyz");
        try {
            ep.getInt("int.invalid");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }

        ep.put("int.invalidObj", new Object());
        try {
            ep.getInt("int.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetLong() {
        ep.setProperty("long.val", "1234567890123");
        ep.put("long.obj", Long.valueOf(9876543210987L));

        Assert.assertEquals(1234567890123L, ep.getLong("long.val"));
        Assert.assertEquals(9876543210987L, ep.getLong("long.obj"));
        Assert.assertEquals(111L, ep.getLong("missing", 111L));
        Assert.assertEquals(Long.valueOf(222L), ep.getLong("missing", Long.valueOf(222L)));

        try {
            ep.getLong("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.setProperty("long.invalid", "xyz");
        try {
            ep.getLong("long.invalid");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }

        ep.put("long.invalidObj", new Object());
        try {
            ep.getLong("long.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetFloat() {
        ep.setProperty("float.val", "3.14");
        ep.put("float.obj", Float.valueOf(1.618f));

        Assert.assertEquals(3.14f, ep.getFloat("float.val"), 0.0001f);
        Assert.assertEquals(1.618f, ep.getFloat("float.obj"), 0.0001f);
        Assert.assertEquals(2.5f, ep.getFloat("missing", 2.5f), 0.0001f);
        Assert.assertEquals(Float.valueOf(4.5f), ep.getFloat("missing", Float.valueOf(4.5f)));

        try {
            ep.getFloat("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.setProperty("float.invalid", "xyz");
        try {
            ep.getFloat("float.invalid");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }

        ep.put("float.invalidObj", new Object());
        try {
            ep.getFloat("float.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testGetDouble() {
        ep.setProperty("double.val", "3.1415926535");
        ep.put("double.obj", Double.valueOf(2.7182818284));

        Assert.assertEquals(3.1415926535, ep.getDouble("double.val"), 0.0000000001);
        Assert.assertEquals(2.7182818284, ep.getDouble("double.obj"), 0.0000000001);
        Assert.assertEquals(5.55, ep.getDouble("missing", 5.55), 0.0001);
        Assert.assertEquals(Double.valueOf(6.66), ep.getDouble("missing", Double.valueOf(6.66)));

        try {
            ep.getDouble("missing_no_def");
            Assert.fail("Expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }

        ep.setProperty("double.invalid", "xyz");
        try {
            ep.getDouble("double.invalid");
            Assert.fail("Expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }

        ep.put("double.invalidObj", new Object());
        try {
            ep.getDouble("double.invalidObj");
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException expected) {
        }
    }

    @Test
    public void testConvertProperties() {
        Properties parentProps = new Properties();
        parentProps.setProperty("parentKey", "parentVal");

        Properties childProps = new Properties(parentProps);
        childProps.setProperty("childKey", "childVal");

        ExtendedProperties converted = ExtendedProperties.convertProperties(childProps);
        Assert.assertEquals("childVal", converted.getString("childKey"));
        Assert.assertEquals("parentVal", converted.getString("parentKey"));
    }

    @Test
    public void testDefaultsFallback_allTypes() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("str", "defaultString");
        defaults.setProperty("arr", "d1,d2");
        defaults.setProperty("vec", "v1,v2");
        defaults.setProperty("list", "l1,l2");
        defaults.setProperty("bool", "true");
        defaults.setProperty("byte", "12");
        defaults.setProperty("short", "123");
        defaults.setProperty("int", "1234");
        defaults.setProperty("long", "12345");
        defaults.setProperty("float", "12.34");
        defaults.setProperty("double", "123.456");

        setDefaultsForTest(defaults);

        Assert.assertEquals("defaultString", ep.getString("str"));
        Assert.assertArrayEquals(new String[]{"d1", "d2"}, ep.getStringArray("arr"));
        Assert.assertEquals(2, ep.getVector("vec").size());
        Assert.assertEquals(2, ep.getList("list").size());
        Assert.assertTrue(ep.getBoolean("bool"));
        Assert.assertEquals((byte) 12, ep.getByte("byte"));
        Assert.assertEquals((short) 123, ep.getShort("short"));
        Assert.assertEquals(1234, ep.getInt("int"));
        Assert.assertEquals(12345L, ep.getLong("long"));
        Assert.assertEquals(12.34f, ep.getFloat("float"), 0.01f);
        Assert.assertEquals(123.456, ep.getDouble("double"), 0.001);
    }
}
