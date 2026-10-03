package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testDefaultConstructor() {
        ExtendedProperties props = new ExtendedProperties();
        Assert.assertFalse(props.isInitialized());
        Assert.assertEquals("include", props.getInclude());
        Assert.assertEquals(0, props.size());
    }

    @Test
    public void testFileConstructors() throws IOException {
        File mainFile = folder.newFile("main.properties");
        FileWriter fw1 = new FileWriter(mainFile);
        fw1.write("key1=val1\nkey2=val2\n");
        fw1.close();

        ExtendedProperties props1 = new ExtendedProperties(mainFile.getAbsolutePath());
        Assert.assertTrue(props1.isInitialized());
        Assert.assertEquals("val1", props1.getString("key1"));

        File defaultFile = folder.newFile("default.properties");
        FileWriter fw2 = new FileWriter(defaultFile);
        fw2.write("defaultKey=defaultVal\n");
        fw2.close();

        ExtendedProperties props2 = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        Assert.assertEquals("val1", props2.getString("key1"));
        Assert.assertEquals("defaultVal", props2.getString("defaultKey"));
    }

    @Test
    public void testSetAndGetInclude() {
        ExtendedProperties props = new ExtendedProperties();
        Assert.assertEquals("include", props.getInclude());

        props.setInclude("import");
        Assert.assertEquals("import", props.getInclude());

        props.setInclude("");
        Assert.assertNull(props.getInclude());

        props.setInclude(null);
        Assert.assertNull(props.getInclude());
    }

    @Test
    public void testLoadWithEncodingAndIncludes() throws IOException {
        File subFolder = folder.newFolder("sub");
        File fileA = new File(subFolder, "a.properties");
        File fileB = new File(subFolder, "b.properties");
        File fileC = new File(subFolder, "c.properties");

        FileWriter fwB = new FileWriter(fileB);
        fwB.write("keyB=valB\n");
        fwB.close();

        FileWriter fwC = new FileWriter(fileC);
        fwC.write("keyC=valC\n");
        fwC.close();

        FileWriter fwA = new FileWriter(fileA);
        fwA.write("keyA=valA\n");
        fwA.write("include = ./" + fileB.getName() + "\n");
        fwA.write("include = " + fileC.getName() + "\n");
        fwA.close();

        ExtendedProperties props = new ExtendedProperties(fileA.getAbsolutePath());
        Assert.assertEquals("valA", props.getString("keyA"));
        Assert.assertEquals("valB", props.getString("keyB"));
        Assert.assertEquals("valC", props.getString("keyC"));

        // Test absolute include path
        String content = "include=" + fileB.getAbsolutePath() + "\nmainKey=mainVal\n";
        ExtendedProperties absProps = new ExtendedProperties();
        absProps.load(new ByteArrayInputStream(content.getBytes("ISO-8859-1")), "ISO-8859-1");
        Assert.assertEquals("valB", absProps.getString("keyB"));
        Assert.assertEquals("mainVal", absProps.getString("mainKey"));

        // Test invalid encoding fallback
        ExtendedProperties fallbackProps = new ExtendedProperties();
        fallbackProps.load(new ByteArrayInputStream("foo=bar\n".getBytes()), "UNSUPPORTED_ENCODING_NAME");
        Assert.assertEquals("bar", fallbackProps.getString("foo"));
    }

    @Test
    public void testLineContinuationsAndComments() throws IOException {
        String data = "# Comment line\n" +
                "\n" +
                "longKey = part1 \\\n" +
                "part2 \\\n" +
                "part3\n" +
                "escapedSlash = end\\\\\\\n" +
                "next\n" +
                "regularSlash = path\\\\folder\n";

        ExtendedProperties props = new ExtendedProperties();
        props.load(new ByteArrayInputStream(data.getBytes()));

        Assert.assertEquals("part1part2part3", props.getString("longKey"));
        Assert.assertEquals("end\\next", props.getString("escapedSlash"));
        Assert.assertEquals("path\\folder", props.getString("regularSlash"));
    }

    @Test
    public void testAddAndSetProperty() {
        ExtendedProperties props = new ExtendedProperties();

        props.addProperty("single", "val1");
        Assert.assertEquals("val1", props.getProperty("single"));

        props.addProperty("single", "val2");
        Object val = props.getProperty("single");
        Assert.assertTrue(val instanceof List);
        Assert.assertEquals(2, ((List) val).size());

        props.addProperty("single", "val3");
        Assert.assertEquals(3, ((List) props.getProperty("single")).size());

        props.addProperty("comma.separated", "a, b, c\\,d");
        List list = props.getList("comma.separated");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c,d", list.get(2));

        props.setProperty("single", "override");
        Assert.assertEquals("override", props.getProperty("single"));

        props.addProperty("nonString", new Integer(100));
        Assert.assertEquals(new Integer(100), props.getProperty("nonString"));
    }

    @Test
    public void testInterpolation() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("base", "hello");
        props.setProperty("target", "${base} world");
        props.setProperty("nested", "${target}!");
        props.setProperty("missing", "${unknown} property");

        Assert.assertEquals("hello world", props.getString("target"));
        Assert.assertEquals("hello world!", props.getString("nested"));
        Assert.assertEquals("${unknown} property", props.getString("missing"));
        Assert.assertNull(props.interpolate(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationInfiniteLoop() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("a", "${b}");
        props.setProperty("b", "${c}");
        props.setProperty("c", "${a}");
        props.getString("a");
    }

    @Test
    public void testDefaultsFallback() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("str", "defaultStr");
        defaults.setProperty("bool", "true");
        defaults.setProperty("byte", "1");
        defaults.setProperty("short", "2");
        defaults.setProperty("int", "3");
        defaults.setProperty("long", "4");
        defaults.setProperty("float", "5.5");
        defaults.setProperty("double", "6.6");
        defaults.setProperty("list", "a,b");
        defaults.setProperty("interpolated", "val");

        ExtendedProperties props = new ExtendedProperties();
        try {
            java.lang.reflect.Field field = ExtendedProperties.class.getDeclaredField("defaults");
            field.setAccessible(true);
            field.set(props, defaults);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        props.setProperty("useInterp", "${interpolated}");

        Assert.assertEquals("defaultStr", props.getString("str"));
        Assert.assertEquals("val", props.getString("useInterp"));
        Assert.assertTrue(props.getBoolean("bool"));
        Assert.assertEquals((byte) 1, props.getByte("byte"));
        Assert.assertEquals((short) 2, props.getShort("short"));
        Assert.assertEquals(3, props.getInt("int"));
        Assert.assertEquals(3, props.getInteger("int"));
        Assert.assertEquals(4L, props.getLong("long"));
        Assert.assertEquals(5.5f, props.getFloat("float"), 0.001f);
        Assert.assertEquals(6.6d, props.getDouble("double"), 0.001d);
        Assert.assertEquals(2, props.getStringArray("list").length);
        Assert.assertEquals(2, props.getVector("list").size());
        Assert.assertEquals(2, props.getList("list").size());
        Assert.assertEquals(Boolean.TRUE, props.getBoolean("bool", Boolean.FALSE));
        Assert.assertEquals(new Byte((byte) 1), props.getByte("byte", new Byte((byte) 0)));
        Assert.assertEquals(new Short((short) 2), props.getShort("short", new Short((short) 0)));
        Assert.assertEquals(new Integer(3), props.getInteger("int", new Integer(0)));
        Assert.assertEquals(new Long(4L), props.getLong("long", new Long(0L)));
        Assert.assertEquals(new Float(5.5f), props.getFloat("float", new Float(0f)));
        Assert.assertEquals(new Double(6.6d), props.getDouble("double", new Double(0d)));
    }

    @Test
    public void testSave() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("k1", "v1,v2\\v3");
        props.addProperty("k2", "vA");
        props.addProperty("k2", "vB");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, "Header Comment");
        props.save(null, "Null stream test");

        String savedContent = baos.toString();
        Assert.assertTrue(savedContent.contains("Header Comment"));
        Assert.assertTrue(savedContent.contains("k1="));
        Assert.assertTrue(savedContent.contains("k2="));
    }

    @Test
    public void testCombineClearAndKeys() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.setProperty("a.b", "1");
        props1.setProperty("a.c", "2");
        props1.setProperty("b.a", "3");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.setProperty("a.c", "overridden");
        props2.setProperty("x.y", "4");

        props1.combine(props2);
        Assert.assertEquals("overridden", props1.getString("a.c"));
        Assert.assertEquals("4", props1.getString("x.y"));

        Iterator allKeys = props1.getKeys();
        int count = 0;
        while (allKeys.hasNext()) {
            allKeys.next();
            count++;
        }
        Assert.assertEquals(4, count);

        Iterator prefixKeys = props1.getKeys("a.");
        List prefixList = new ArrayList();
        while (prefixKeys.hasNext()) {
            prefixList.add(prefixKeys.next());
        }
        Assert.assertEquals(2, prefixList.size());
        Assert.assertTrue(prefixList.contains("a.b"));
        Assert.assertTrue(prefixList.contains("a.c"));

        props1.clearProperty("a.b");
        Assert.assertNull(props1.getProperty("a.b"));
        props1.clearProperty("non.existent");
    }

    @Test
    public void testSubset() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("prefix", "exactMatch");
        props.setProperty("prefix.item1", "val1");
        props.setProperty("prefix.item2", "val2");
        props.setProperty("other.item", "otherVal");

        ExtendedProperties subset = props.subset("prefix");
        Assert.assertNotNull(subset);
        Assert.assertEquals("exactMatch", subset.getString("prefix"));
        Assert.assertEquals("val1", subset.getString("item1"));
        Assert.assertEquals("val2", subset.getString("item2"));
        Assert.assertNull(subset.getProperty("other.item"));

        Assert.assertNull(props.subset("unknown"));
    }

    @Test
    public void testDisplay() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("dispKey", "dispVal");
        props.display();
    }

    @Test
    public void testTypeGettersDirectAndConversion() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("bool1", "true");
        props.setProperty("bool2", "on");
        props.setProperty("bool3", "yes");
        props.setProperty("bool4", "false");
        props.setProperty("bool5", "off");
        props.setProperty("bool6", "no");
        props.setProperty("bool7", "invalid");
        props.setProperty("byte", "10");
        props.setProperty("short", "20");
        props.setProperty("int", "30");
        props.setProperty("long", "40");
        props.setProperty("float", "50.5");
        props.setProperty("double", "60.6");

        Assert.assertTrue(props.getBoolean("bool1"));
        Assert.assertTrue(props.getBoolean("bool2", false));
        Assert.assertTrue(props.getBoolean("bool3"));
        Assert.assertFalse(props.getBoolean("bool4"));
        Assert.assertFalse(props.getBoolean("bool5"));
        Assert.assertFalse(props.getBoolean("bool6"));
        Assert.assertFalse(props.getBoolean("bool7")); // defaults to false for Boolean(null)

        Assert.assertEquals((byte) 10, props.getByte("byte"));
        Assert.assertEquals((byte) 10, props.getByte("byte", (byte) 1));
        Assert.assertEquals((short) 20, props.getShort("short"));
        Assert.assertEquals((short) 20, props.getShort("short", (short) 1));
        Assert.assertEquals(30, props.getInt("int"));
        Assert.assertEquals(30, props.getInt("int", 1));
        Assert.assertEquals(30, props.getInteger("int"));
        Assert.assertEquals(30, props.getInteger("int", 1));
        Assert.assertEquals(40L, props.getLong("long"));
        Assert.assertEquals(40L, props.getLong("long", 1L));
        Assert.assertEquals(50.5f, props.getFloat("float"), 0.001f);
        Assert.assertEquals(50.5f, props.getFloat("float", 1.0f), 0.001f);
        Assert.assertEquals(60.6d, props.getDouble("double"), 0.001d);
        Assert.assertEquals(60.6d, props.getDouble("double", 1.0d), 0.001d);

        // Direct typed puts
        props.put("directBool", Boolean.TRUE);
        props.put("directByte", new Byte((byte) 11));
        props.put("directShort", new Short((short) 21));
        props.put("directInt", new Integer(31));
        props.put("directLong", new Long(41L));
        props.put("directFloat", new Float(51.5f));
        props.put("directDouble", new Double(61.6d));

        Assert.assertEquals(Boolean.TRUE, props.getBoolean("directBool", (Boolean) null));
        Assert.assertEquals(new Byte((byte) 11), props.getByte("directByte", (Byte) null));
        Assert.assertEquals(new Short((short) 21), props.getShort("directShort", (Short) null));
        Assert.assertEquals(new Integer(31), props.getInteger("directInt", (Integer) null));
        Assert.assertEquals(new Long(41L), props.getLong("directLong", (Long) null));
        Assert.assertEquals(new Float(51.5f), props.getFloat("directFloat", (Float) null));
        Assert.assertEquals(new Double(61.6d), props.getDouble("directDouble", (Double) null));

        // Missing default checks
        Assert.assertTrue(props.getBoolean("missingKey", true));
        Assert.assertEquals((byte) 9, props.getByte("missingKey", (byte) 9));
        Assert.assertEquals((short) 9, props.getShort("missingKey", (short) 9));
        Assert.assertEquals(9, props.getInt("missingKey", 9));
        Assert.assertEquals(9, props.getInteger("missingKey", 9));
        Assert.assertEquals(9L, props.getLong("missingKey", 9L));
        Assert.assertEquals(9.0f, props.getFloat("missingKey", 9.0f), 0.001f);
        Assert.assertEquals(9.0d, props.getDouble("missingKey", 9.0d), 0.001d);
        Assert.assertEquals("def", props.getString("missingKey", "def"));
    }

    @Test
    public void testCollectionGetters() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("single", "val");
        props.setProperty("multi", "val1, val2");

        Assert.assertEquals(1, props.getStringArray("single").length);
        Assert.assertEquals(2, props.getStringArray("multi").length);
        Assert.assertEquals(0, props.getStringArray("none").length);

        Vector v1 = props.getVector("single");
        Assert.assertEquals(1, v1.size());
        Vector v2 = props.getVector("multi");
        Assert.assertEquals(2, v2.size());
        Vector defaultVec = new Vector();
        defaultVec.add("def");
        Assert.assertEquals(1, props.getVector("none", defaultVec).size());
        Assert.assertEquals(0, props.getVector("none").size());

        List l1 = props.getList("single");
        Assert.assertEquals(1, l1.size());
        List l2 = props.getList("multi");
        Assert.assertEquals(2, l2.size());
        List defaultList = new ArrayList();
        defaultList.add("def");
        Assert.assertEquals(1, props.getList("none", defaultList).size());
        Assert.assertEquals(0, props.getList("none").size());

        props.setProperty("propsKey", "k1=v1, k2=v2");
        Properties p = props.getProperties("propsKey");
        Assert.assertEquals("v1", p.getProperty("k1"));
        Assert.assertEquals("v2", p.getProperty("k2"));

        Properties customDefaults = new Properties();
        customDefaults.setProperty("kDef", "vDef");
        Properties p2 = props.getProperties("propsKey", customDefaults);
        Assert.assertEquals("vDef", p2.getProperty("kDef"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBooleanMissingException() {
        new ExtendedProperties().getBoolean("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByteMissingException() {
        new ExtendedProperties().getByte("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShortMissingException() {
        new ExtendedProperties().getShort("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetIntegerMissingException() {
        new ExtendedProperties().getInteger("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingException() {
        new ExtendedProperties().getLong("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingException() {
        new ExtendedProperties().getFloat("missing");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingException() {
        new ExtendedProperties().getDouble("missing");
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForString() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getString("objKey");
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForStringArray() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getStringArray("objKey");
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForVector() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getVector("objKey");
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForList() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getList("objKey");
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForBoolean() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getBoolean("objKey", Boolean.TRUE);
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForByte() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getByte("objKey", new Byte((byte) 0));
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForShort() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getShort("objKey", new Short((short) 0));
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForInteger() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getInteger("objKey", new Integer(0));
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForLong() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getLong("objKey", new Long(0));
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForFloat() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getFloat("objKey", new Float(0));
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastExceptionForDouble() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("objKey", new Object());
        props.getDouble("objKey", new Double(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesInvalidToken() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("invalidProps", "noEqualSign");
        props.getProperties("invalidProps");
    }

    @Test
    public void testConvertProperties() {
        Properties standard = new Properties();
        standard.setProperty("p1", "v1");
        standard.setProperty("p2", "v2");

        ExtendedProperties ep = ExtendedProperties.convertProperties(standard);
        Assert.assertEquals("v1", ep.getString("p1"));
        Assert.assertEquals("v2", ep.getString("p2"));
    }

    @Test
    public void testMapOperationsPutPutAllRemove() {
        ExtendedProperties props = new ExtendedProperties();
        Object old = props.put("mapKey", "mapVal");
        Assert.assertNull(old);
        Assert.assertEquals("mapVal", props.getString("mapKey"));

        old = props.put("mapKey", "mapVal2");
        Assert.assertNotNull(old);

        Map standardMap = new HashMap();
        standardMap.put("h1", "v1");
        props.putAll(standardMap);
        Assert.assertEquals("v1", props.getString("h1"));

        ExtendedProperties otherEp = new ExtendedProperties();
        otherEp.setProperty("ep1", "valEP");
        props.putAll(otherEp);
        Assert.assertEquals("valEP", props.getString("ep1"));

        Object removed = props.remove("ep1");
        Assert.assertEquals("valEP", removed);
        Assert.assertNull(props.getProperty("ep1"));
    }

    @Test
    public void testPropertiesReaderAndTokenizerDirectly() throws IOException {
        String testData = "a=b\\\nc=d\n";
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new StringReader(testData));
        Assert.assertEquals("a=bc=d", reader.readProperty());
        Assert.assertNull(reader.readProperty());

        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("one, two\\, escaped, three");
        Assert.assertTrue(tokenizer.hasMoreTokens());
        Assert.assertEquals("one", tokenizer.nextToken());
        Assert.assertEquals("two, escaped", tokenizer.nextToken());
        Assert.assertEquals("three", tokenizer.nextToken());
    }
}
