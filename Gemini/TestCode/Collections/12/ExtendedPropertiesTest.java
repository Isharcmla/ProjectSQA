package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    @Test
    public void testDefaultConstructor() {
        ExtendedProperties props = new ExtendedProperties();
        Assert.assertFalse(props.isInitialized());
        Assert.assertEquals(0, props.size());
        Assert.assertEquals("include", props.getInclude());
    }

    @Test
    public void testFileConstructors() throws IOException {
        File mainFile = File.createTempFile("test_main", ".properties");
        File defaultFile = File.createTempFile("test_default", ".properties");
        mainFile.deleteOnExit();
        defaultFile.deleteOnExit();

        FileOutputStream fosDefault = new FileOutputStream(defaultFile);
        fosDefault.write("defKey = defVal\nsharedKey = defShared\n".getBytes("UTF-8"));
        fosDefault.close();

        FileOutputStream fosMain = new FileOutputStream(mainFile);
        fosMain.write("mainKey = mainVal\nsharedKey = mainShared\n".getBytes("UTF-8"));
        fosMain.close();

        ExtendedProperties ep1 = new ExtendedProperties(mainFile.getAbsolutePath());
        Assert.assertTrue(ep1.isInitialized());
        Assert.assertEquals("mainVal", ep1.getString("mainKey"));
        Assert.assertNull(ep1.getString("defKey"));

        ExtendedProperties ep2 = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        Assert.assertTrue(ep2.isInitialized());
        Assert.assertEquals("mainVal", ep2.getString("mainKey"));
        Assert.assertEquals("mainShared", ep2.getString("sharedKey"));
        Assert.assertEquals("defVal", ep2.getString("defKey"));
    }

    @Test
    public void testIncludeGetterAndSetter() {
        ExtendedProperties ep = new ExtendedProperties();
        Assert.assertEquals("include", ep.getInclude());

        ep.setInclude("customInclude");
        Assert.assertEquals("customInclude", ep.getInclude());

        ep.setInclude(null);
        Assert.assertNull(ep.getInclude());

        ep.setInclude("");
        Assert.assertNull(ep.getInclude());
    }

    @Test
    public void testLoad_basicAndMultipleLinesAndComments() throws IOException {
        String data = "# This is a comment\n" +
                "\n" +
                "key1 = value1\n" +
                "key2 = first line \\\n" +
                "       second line \\\n" +
                "       third line\n" +
                "key3 = val1, val2, val\\,3, val\\\\4\n" +
                "key4 = value4a\n" +
                "key4 = value4b\n";

        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(data.getBytes("UTF-8")));

        Assert.assertTrue(ep.isInitialized());
        Assert.assertEquals("value1", ep.getString("key1"));
        Assert.assertEquals("first linesecond linethird line", ep.getString("key2"));

        Vector vec3 = ep.getVector("key3");
        Assert.assertEquals(4, vec3.size());
        Assert.assertEquals("val1", vec3.get(0));
        Assert.assertEquals("val2", vec3.get(1));
        Assert.assertEquals("val,3", vec3.get(2));
        Assert.assertEquals("val\\4", vec3.get(3));

        Vector vec4 = ep.getVector("key4");
        Assert.assertEquals(2, vec4.size());
        Assert.assertEquals("value4a", vec4.get(0));
        Assert.assertEquals("value4b", vec4.get(1));
    }

    @Test
    public void testLoad_withEncoding() throws IOException {
        String data = "encKey = encVal\n";
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(new ByteArrayInputStream(data.getBytes("UTF-8")), "UTF-8");
        Assert.assertEquals("encVal", ep.getString("encKey"));

        ExtendedProperties epUnsupported = new ExtendedProperties();
        epUnsupported.load(new ByteArrayInputStream(data.getBytes("ISO-8859-1")), "UNSUPPORTED_ENCODING_NAME");
        Assert.assertEquals("encVal", epUnsupported.getString("encKey"));
    }

    @Test
    public void testLoad_includesAbsoluteAndRelative() throws IOException {
        File dir = new File(System.getProperty("java.io.tmpdir"), "ext_prop_test_" + System.currentTimeMillis());
        dir.mkdirs();
        dir.deleteOnExit();

        File inc1 = new File(dir, "inc1.properties");
        inc1.deleteOnExit();
        FileOutputStream fos1 = new FileOutputStream(inc1);
        fos1.write("inc1Key = inc1Val\n".getBytes("UTF-8"));
        fos1.close();

        File inc2 = new File(dir, "inc2.properties");
        inc2.deleteOnExit();
        FileOutputStream fos2 = new FileOutputStream(inc2);
        fos2.write("inc2Key = inc2Val\n".getBytes("UTF-8"));
        fos2.close();

        File main = new File(dir, "main.properties");
        main.deleteOnExit();
        FileOutputStream fosMain = new FileOutputStream(main);
        String mainContent = "mainKey = mainVal\n" +
                "include = " + inc1.getAbsolutePath() + "\n" +
                "include = ./" + inc2.getName() + "\n";
        fosMain.write(mainContent.getBytes("UTF-8"));
        fosMain.close();

        ExtendedProperties ep = new ExtendedProperties(main.getAbsolutePath());
        Assert.assertEquals("mainVal", ep.getString("mainKey"));
        Assert.assertEquals("inc1Val", ep.getString("inc1Key"));
        Assert.assertEquals("inc2Val", ep.getString("inc2Key"));
    }

    @Test
    public void testInterpolation_normalAndDefaultsAndMissing() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("defVar", "defRepl");

        ExtendedProperties ep = new ExtendedProperties();
        ep.combine(defaults);
        ep.setProperty("base", "hello");
        ep.setProperty("nested", "${base} world");
        ep.setProperty("mult", "${base} and ${nested}");
        ep.setProperty("defTest", "${defVar} test");
        ep.setProperty("missing", "${missingVar} test");

        Assert.assertEquals("hello world", ep.getString("nested"));
        Assert.assertEquals("hello and hello world", ep.getString("mult"));
        Assert.assertEquals("${missingVar} test", ep.getString("missing"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolation_infiniteLoop() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("var1", "${var2}");
        ep.setProperty("var2", "${var1}");
        ep.getString("var1");
    }

    @Test
    public void testAddAndSetProperty() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("listKey", "val1,val2");
        Assert.assertEquals(2, ep.getVector("listKey").size());

        ep.addProperty("listKey", "val3");
        Assert.assertEquals(3, ep.getVector("listKey").size());

        ep.addProperty("listKey", new Integer(4));
        Assert.assertEquals(4, ep.getVector("listKey").size());

        ep.setProperty("listKey", "singleVal");
        Assert.assertEquals("singleVal", ep.getString("listKey"));
    }

    @Test
    public void testClearProperty() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("k1", "v1");
        ep.setProperty("k2", "v2");
        Assert.assertTrue(ep.containsKey("k1"));

        ep.clearProperty("k1");
        Assert.assertFalse(ep.containsKey("k1"));
        Assert.assertNull(ep.getString("k1"));

        ep.clearProperty("nonExisting");
    }

    @Test
    public void testSave() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("singleKey", "val,with,comma\\and\\slash");
        List list = new ArrayList();
        list.add("list1");
        list.add("list2");
        ep.addProperty("multiKey", list);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, "Header Comment");
        ep.save(null, "Null stream");

        String savedStr = new String(baos.toByteArray());
        Assert.assertTrue(savedStr.contains("Header Comment"));
        Assert.assertTrue(savedStr.contains("singleKey="));
        Assert.assertTrue(savedStr.contains("multiKey=list1"));
        Assert.assertTrue(savedStr.contains("multiKey=list2"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties ep1 = new ExtendedProperties();
        ep1.setProperty("a", "1");
        ep1.setProperty("b", "2");

        ExtendedProperties ep2 = new ExtendedProperties();
        ep2.setProperty("b", "overwritten");
        ep2.setProperty("c", "3");

        ep1.combine(ep2);

        Assert.assertEquals("1", ep1.getString("a"));
        Assert.assertEquals("overwritten", ep1.getString("b"));
        Assert.assertEquals("3", ep1.getString("c"));
    }

    @Test
    public void testGetKeys() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("app.name", "test");
        ep.setProperty("app.version", "1.0");
        ep.setProperty("db.url", "localhost");

        Iterator allKeys = ep.getKeys();
        List keyList = new ArrayList();
        while (allKeys.hasNext()) {
            keyList.add(allKeys.next());
        }
        Assert.assertEquals(3, keyList.size());
        Assert.assertTrue(keyList.contains("app.name"));
        Assert.assertTrue(keyList.contains("app.version"));
        Assert.assertTrue(keyList.contains("db.url"));

        Iterator prefixKeys = ep.getKeys("app.");
        List prefixList = new ArrayList();
        while (prefixKeys.hasNext()) {
            prefixList.add(prefixKeys.next());
        }
        Assert.assertEquals(2, prefixList.size());
        Assert.assertTrue(prefixList.contains("app.name"));
        Assert.assertTrue(prefixList.contains("app.version"));
    }

    @Test
    public void testSubset() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("db.driver", "com.mysql.jdbc.Driver");
        ep.setProperty("db.url", "jdbc:mysql://localhost/test");
        ep.setProperty("db", "root");
        ep.setProperty("other.prop", "val");

        ExtendedProperties sub = ep.subset("db");
        Assert.assertNotNull(sub);
        Assert.assertEquals("com.mysql.jdbc.Driver", sub.getString("driver"));
        Assert.assertEquals("jdbc:mysql://localhost/test", sub.getString("url"));
        Assert.assertEquals("root", sub.getString("db"));
        Assert.assertNull(sub.getString("other.prop"));

        ExtendedProperties emptySub = ep.subset("nonexistent");
        Assert.assertNull(emptySub);
    }

    @Test
    public void testDisplay() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("k1", "v1");
        ep.setProperty("k2", "v2");
        ep.display();
    }

    @Test
    public void testGetString() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("strKey", "hello");
        ep.addProperty("listKey", "item1,item2");

        Assert.assertEquals("hello", ep.getString("strKey"));
        Assert.assertEquals("item1", ep.getString("listKey"));
        Assert.assertEquals("def", ep.getString("nonExisting", "def"));
        Assert.assertNull(ep.getString("nonExisting"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", new Object());
        ep.getString("objKey");
    }

    @Test
    public void testGetProperties() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("propPair", "k1=v1,k2=v2");

        Properties p = ep.getProperties("propPair");
        Assert.assertEquals("v1", p.getProperty("k1"));
        Assert.assertEquals("v2", p.getProperty("k2"));

        Properties defProps = new Properties();
        defProps.setProperty("defaultK", "defaultV");
        Properties p2 = ep.getProperties("propPair", defProps);
        Assert.assertEquals("defaultV", p2.getProperty("defaultK"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_malformed() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("invalidPair", "invalidEntry");
        ep.getProperties("invalidPair");
    }

    @Test
    public void testGetStringArray() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("single", "val");
        ep.addProperty("multi", "val1,val2");

        String[] arr1 = ep.getStringArray("single");
        Assert.assertEquals(1, arr1.length);
        Assert.assertEquals("val", arr1[0]);

        String[] arr2 = ep.getStringArray("multi");
        Assert.assertEquals(2, arr2.length);
        Assert.assertEquals("val1", arr2[0]);
        Assert.assertEquals("val2", arr2[1]);

        String[] arr3 = ep.getStringArray("nonExisting");
        Assert.assertEquals(0, arr3.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", new Integer(10));
        ep.getStringArray("objKey");
    }

    @Test
    public void testGetVector() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("single", "val");
        ep.addProperty("multi", "v1,v2");

        Vector v1 = ep.getVector("single");
        Assert.assertEquals(1, v1.size());
        Assert.assertEquals("val", v1.get(0));

        Vector v2 = ep.getVector("multi");
        Assert.assertEquals(2, v2.size());
        Assert.assertEquals("v1", v2.get(0));

        Vector defVec = new Vector();
        defVec.add("def");
        Vector v3 = ep.getVector("nonExisting", defVec);
        Assert.assertEquals(1, v3.size());
        Assert.assertEquals("def", v3.get(0));

        Vector v4 = ep.getVector("nonExisting");
        Assert.assertEquals(0, v4.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", new Integer(10));
        ep.getVector("objKey");
    }

    @Test
    public void testGetList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("single", "val");
        ep.addProperty("multi", "v1,v2");

        List l1 = ep.getList("single");
        Assert.assertEquals(1, l1.size());
        Assert.assertEquals("val", l1.get(0));

        List l2 = ep.getList("multi");
        Assert.assertEquals(2, l2.size());
        Assert.assertEquals("v1", l2.get(0));

        List defList = new ArrayList();
        defList.add("def");
        List l3 = ep.getList("nonExisting", defList);
        Assert.assertEquals(1, l3.size());
        Assert.assertEquals("def", l3.get(0));

        List l4 = ep.getList("nonExisting");
        Assert.assertEquals(0, l4.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", new Integer(10));
        ep.getList("objKey");
    }

    @Test
    public void testGetBoolean_andTestBoolean() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("b1", "true");
        ep.setProperty("b2", "on");
        ep.setProperty("b3", "yes");
        ep.setProperty("b4", "false");
        ep.setProperty("b5", "off");
        ep.setProperty("b6", "no");
        ep.addPropertyDirectForTest("b7", Boolean.TRUE);

        Assert.assertTrue(ep.getBoolean("b1"));
        Assert.assertTrue(ep.getBoolean("b2"));
        Assert.assertTrue(ep.getBoolean("b3"));
        Assert.assertFalse(ep.getBoolean("b4"));
        Assert.assertFalse(ep.getBoolean("b5"));
        Assert.assertFalse(ep.getBoolean("b6"));
        Assert.assertTrue(ep.getBoolean("b7"));

        Assert.assertTrue(ep.getBoolean("nonExisting", true));
        Assert.assertFalse(ep.getBoolean("nonExisting", false));
        Assert.assertEquals(Boolean.TRUE, ep.getBoolean("nonExisting", Boolean.TRUE));
        Assert.assertNull(ep.getBoolean("nonExisting", (Boolean) null));

        Assert.assertNull(ep.testBoolean("invalid"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getBoolean("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", new Integer(1));
        ep.getBoolean("objKey", Boolean.FALSE);
    }

    @Test
    public void testGetByte() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("byte1", "12");
        ep.addPropertyDirectForTest("byte2", new Byte((byte) 34));

        Assert.assertEquals((byte) 12, ep.getByte("byte1"));
        Assert.assertEquals((byte) 34, ep.getByte("byte2"));
        Assert.assertEquals((byte) 56, ep.getByte("nonExisting", (byte) 56));
        Assert.assertEquals(new Byte((byte) 78), ep.getByte("nonExisting", new Byte((byte) 78)));
        Assert.assertNull(ep.getByte("nonExisting", (Byte) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getByte("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", Boolean.TRUE);
        ep.getByte("objKey", new Byte((byte) 1));
    }

    @Test
    public void testGetShort() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("short1", "123");
        ep.addPropertyDirectForTest("short2", new Short((short) 456));

        Assert.assertEquals((short) 123, ep.getShort("short1"));
        Assert.assertEquals((short) 456, ep.getShort("short2"));
        Assert.assertEquals((short) 789, ep.getShort("nonExisting", (short) 789));
        Assert.assertEquals(new Short((short) 999), ep.getShort("nonExisting", new Short((short) 999)));
        Assert.assertNull(ep.getShort("nonExisting", (Short) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getShort("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", Boolean.TRUE);
        ep.getShort("objKey", new Short((short) 1));
    }

    @Test
    public void testGetInt_andGetInteger() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("int1", "1234");
        ep.addPropertyDirectForTest("int2", new Integer(5678));

        Assert.assertEquals(1234, ep.getInt("int1"));
        Assert.assertEquals(1234, ep.getInteger("int1"));
        Assert.assertEquals(5678, ep.getInt("int2"));
        Assert.assertEquals(5678, ep.getInteger("int2"));

        Assert.assertEquals(9999, ep.getInt("nonExisting", 9999));
        Assert.assertEquals(9999, ep.getInteger("nonExisting", 9999));
        Assert.assertEquals(new Integer(8888), ep.getInteger("nonExisting", new Integer(8888)));
        Assert.assertNull(ep.getInteger("nonExisting", (Integer) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getInteger("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", Boolean.TRUE);
        ep.getInteger("objKey", new Integer(1));
    }

    @Test
    public void testGetLong() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("long1", "12345678901");
        ep.addPropertyDirectForTest("long2", new Long(98765432100L));

        Assert.assertEquals(12345678901L, ep.getLong("long1"));
        Assert.assertEquals(98765432100L, ep.getLong("long2"));
        Assert.assertEquals(5555L, ep.getLong("nonExisting", 5555L));
        Assert.assertEquals(new Long(7777L), ep.getLong("nonExisting", new Long(7777L)));
        Assert.assertNull(ep.getLong("nonExisting", (Long) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", Boolean.TRUE);
        ep.getLong("objKey", new Long(1L));
    }

    @Test
    public void testGetFloat() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("f1", "12.34");
        ep.addPropertyDirectForTest("f2", new Float(56.78f));

        Assert.assertEquals(12.34f, ep.getFloat("f1"), 0.001f);
        Assert.assertEquals(56.78f, ep.getFloat("f2"), 0.001f);
        Assert.assertEquals(9.99f, ep.getFloat("nonExisting", 9.99f), 0.001f);
        Assert.assertEquals(new Float(8.88f), ep.getFloat("nonExisting", new Float(8.88f)));
        Assert.assertNull(ep.getFloat("nonExisting", (Float) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getFloat("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", Boolean.TRUE);
        ep.getFloat("objKey", new Float(1.0f));
    }

    @Test
    public void testGetDouble() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("d1", "123.456");
        ep.addPropertyDirectForTest("d2", new Double(789.012));

        Assert.assertEquals(123.456d, ep.getDouble("d1"), 0.0001d);
        Assert.assertEquals(789.012d, ep.getDouble("d2"), 0.0001d);
        Assert.assertEquals(99.99d, ep.getDouble("nonExisting", 99.99d), 0.0001d);
        Assert.assertEquals(new Double(88.88d), ep.getDouble("nonExisting", new Double(88.88d)));
        Assert.assertNull(ep.getDouble("nonExisting", (Double) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_NoSuchElement() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("nonExisting");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_ClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addPropertyDirectForTest("objKey", Boolean.TRUE);
        ep.getDouble("objKey", new Double(1.0d));
    }

    @Test
    public void testConvertProperties() {
        Properties p = new Properties();
        p.setProperty("k1", "v1");
        p.setProperty("k2", "v2");

        ExtendedProperties ep = ExtendedProperties.convertProperties(p);
        Assert.assertEquals("v1", ep.getString("k1"));
        Assert.assertEquals("v2", ep.getString("k2"));
    }

    @Test
    public void testMapMethods_put_putAll_remove() {
        ExtendedProperties ep = new ExtendedProperties();
        Object old1 = ep.put("k1", "v1");
        Assert.assertNull(old1);

        Object old2 = ep.put("k1", "v2");
        Assert.assertNotNull(old2);
        Assert.assertEquals(2, ep.getVector("k1").size());

        Map normalMap = new HashMap();
        normalMap.put("k3", "v3");
        normalMap.put("k4", "v4");
        ep.putAll(normalMap);
        Assert.assertEquals("v3", ep.getString("k3"));
        Assert.assertEquals("v4", ep.getString("k4"));

        ExtendedProperties otherEp = new ExtendedProperties();
        otherEp.setProperty("k5", "v5");
        ep.putAll(otherEp);
        Assert.assertEquals("v5", ep.getString("k5"));

        Object removed = ep.remove("k5");
        Assert.assertEquals("v5", removed);
        Assert.assertNull(ep.getString("k5"));
    }

    private static class ExtendedPropertiesHelper extends ExtendedProperties {
        public void addDirect(String key, Object value) {
            if (!containsKey(key)) {
                keysAsListed.add(key);
            }
            super.put(key, value);
        }
    }

    private void addPropertyDirectForTest(ExtendedProperties ep, String key, Object value) {
        ExtendedPropertiesHelper helper = new ExtendedPropertiesHelper();
        helper.combine(ep);
        helper.addDirect(key, value);
        ep.clear();
        ep.putAll(helper);
    }
}
