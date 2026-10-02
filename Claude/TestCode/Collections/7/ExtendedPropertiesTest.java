import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import org.apache.commons.collections.ExtendedProperties;

import java.io.*;
import java.util.*;

public class ExtendedPropertiesTest {

    private ExtendedProperties ep;
    private List<File> tempFiles = new ArrayList<File>();

    @Before
    public void setUp() {
        ep = new ExtendedProperties();
    }

    @After
    public void tearDown() {
        for (File f : tempFiles) {
            if (f != null && f.exists()) {
                f.delete();
            }
        }
        tempFiles.clear();
    }

    private File createTempFile(String content) throws IOException {
        File f = File.createTempFile("extprop", ".properties");
        f.deleteOnExit();
        FileWriter fw = new FileWriter(f);
        fw.write(content);
        fw.close();
        tempFiles.add(f);
        return f;
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_isEmpty() {
        assertTrue(ep.isEmpty());
        assertFalse(ep.isInitialized());
    }

    @Test
    public void testFileConstructor_loadsProperties() throws IOException {
        File f = createTempFile("key1 = value1\nkey2 = value2\n");
        ExtendedProperties props = new ExtendedProperties(f.getAbsolutePath());
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testFileConstructor_withDefaultFile() throws IOException {
        File defaultFile = createTempFile("defkey = defvalue\n");
        File mainFile = createTempFile("mainkey = mainvalue\n");
        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        assertEquals("mainvalue", props.getString("mainkey"));
        assertEquals("defvalue", props.getString("defkey"));
    }

    @Test(expected = IOException.class)
    public void testFileConstructor_fileNotFound_throwsIOException() throws IOException {
        new ExtendedProperties("/this/file/does/not/exist_12345.properties");
    }

    // ---------- isInitialized ----------

    @Test
    public void testIsInitialized_afterAddProperty_true() {
        assertFalse(ep.isInitialized());
        ep.addProperty("key", "value");
        assertTrue(ep.isInitialized());
    }

    // ---------- getInclude / setInclude ----------

    @Test
    public void testGetInclude_default() {
        assertEquals("include", ep.getInclude());
    }

    @Test
    public void testSetInclude_custom() {
        ep.setInclude("myinclude");
        assertEquals("myinclude", ep.getInclude());
    }

    @Test
    public void testSetInclude_null_returnsNull() {
        ep.setInclude(null);
        assertNull(ep.getInclude());
    }

    @Test
    public void testSetInclude_emptyString_returnsNull() {
        ep.setInclude("");
        assertNull(ep.getInclude());
    }

    // ---------- load ----------

    @Test
    public void testLoad_basicProperties() throws IOException {
        String content = "key1 = value1\nkey2 = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        assertEquals("value1", ep.getString("key1"));
        assertEquals("value2", ep.getString("key2"));
    }

    @Test
    public void testLoad_withEncoding() throws IOException {
        String content = "key1 = value1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in, "UTF-8");
        assertEquals("value1", ep.getString("key1"));
    }

    @Test
    public void testLoad_commentsAndBlankLines_ignored() throws IOException {
        String content = "# this is a comment\n\nkey1 = value1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        assertEquals("value1", ep.getString("key1"));
        assertEquals(1, ep.size());
    }

    @Test
    public void testLoad_multilineContinuation() throws IOException {
        String content = "longvalue = aaa \\\n    bbb\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        assertEquals("aaabbb", ep.getString("longvalue"));
    }

    @Test
    public void testLoad_commaSeparatedTokens() throws IOException {
        String content = "tokens = first, second\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        String[] arr = ep.getStringArray("tokens");
        assertEquals(2, arr.length);
        assertEquals("first", arr[0]);
        assertEquals("second", arr[1]);
    }

    @Test
    public void testLoad_duplicateKeys_appendsAsList() throws IOException {
        String content = "key = value1\nkey = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        String[] arr = ep.getStringArray("key");
        assertEquals(2, arr.length);
        assertEquals("value1", arr[0]);
        assertEquals("value2", arr[1]);
    }

    @Test
    public void testLoad_emptyValue_skipped() throws IOException {
        String content = "key1 =\nkey2 = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        assertFalse(ep.containsKey("key1"));
        assertEquals("value2", ep.getString("key2"));
    }

    @Test
    public void testLoad_lineWithoutEquals_skipped() throws IOException {
        String content = "justAWord\nkey2 = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        ep.load(in);
        assertFalse(ep.containsKey("justAWord"));
        assertEquals("value2", ep.getString("key2"));
    }

    @Test
    public void testLoad_includeProperty_loadsIncludedFile() throws IOException {
        File includedFile = createTempFile("includedKey = includedValue\n");
        String content = "include = " + includedFile.getAbsolutePath() + "\nmainKey = mainValue\n";
        File mainFile = createTempFile(content);
        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath());
        assertEquals("mainValue", props.getString("mainKey"));
        assertEquals("includedValue", props.getString("includedKey"));
    }

    // ---------- getProperty ----------

    @Test
    public void testGetProperty_existing() {
        ep.addProperty("key", "value");
        assertEquals("value", ep.getProperty("key"));
    }

    @Test
    public void testGetProperty_nonExisting_returnsNull() {
        assertNull(ep.getProperty("nonExisting"));
    }

    @Test
    public void testGetProperty_fromDefaults() throws IOException {
        File defaultFile = createTempFile("defKey = defValue\n");
        File mainFile = createTempFile("mainKey = mainValue\n");
        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        assertEquals("defValue", props.getProperty("defKey"));
    }

    // ---------- addProperty ----------

    @Test
    public void testAddProperty_singleValue() {
        ep.addProperty("key", "value");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testAddProperty_commaSeparatedValue_createsMultipleEntries() {
        ep.addProperty("key", "val1,val2");
        String[] arr = ep.getStringArray("key");
        assertEquals(2, arr.length);
    }

    @Test
    public void testAddProperty_duplicateKey_createsVector() {
        ep.addProperty("key", "val1");
        ep.addProperty("key", "val2");
        String[] arr = ep.getStringArray("key");
        assertEquals(2, arr.length);
    }

    @Test
    public void testAddProperty_nonStringValue() {
        Integer i = new Integer(5);
        ep.addProperty("key", i);
        assertEquals(i, ep.get("key"));
    }

    @Test
    public void testAddProperty_escapedComma() {
        ep.addProperty("key", "Hi\\, what'up?");
        assertEquals("Hi, what'up?", ep.getString("key"));
    }

    // ---------- setProperty ----------

    @Test
    public void testSetProperty_overwritesExisting() {
        ep.addProperty("key", "old");
        ep.setProperty("key", "new");
        assertEquals("new", ep.getString("key"));
    }

    // ---------- save ----------

    @Test
    public void testSave_withHeader() throws IOException {
        ep.addProperty("key", "value");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ep.save(out, "# header comment");
        String result = out.toString();
        assertTrue(result.contains("# header comment"));
        assertTrue(result.contains("key=value"));
    }

    @Test
    public void testSave_nullOutput_doesNothing() throws IOException {
        ep.save(null, "header");
        // no exception expected
    }

    @Test
    public void testSave_listValue() throws IOException {
        ep.addProperty("key", "val1,val2");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ep.save(out, null);
        String result = out.toString();
        assertTrue(result.contains("key=val1"));
        assertTrue(result.contains("key=val2"));
    }

    // ---------- combine ----------

    @Test
    public void testCombine_mergesProperties() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("otherKey", "otherValue");
        ep.addProperty("key", "value");
        ep.combine(other);
        assertEquals("value", ep.getString("key"));
        assertEquals("otherValue", ep.getString("otherKey"));
    }

    // ---------- clearProperty ----------

    @Test
    public void testClearProperty_removesKey() {
        ep.addProperty("key", "value");
        assertTrue(ep.containsKey("key"));
        ep.clearProperty("key");
        assertFalse(ep.containsKey("key"));
    }

    @Test
    public void testClearProperty_nonExistingKey_doesNothing() {
        ep.clearProperty("nonExisting");
        assertFalse(ep.containsKey("nonExisting"));
    }

    // ---------- getKeys ----------

    @Test
    public void testGetKeys_returnsAllKeys() {
        ep.addProperty("key1", "value1");
        ep.addProperty("key2", "value2");
        Iterator it = ep.getKeys();
        List<Object> keys = new ArrayList<Object>();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        assertEquals(2, keys.size());
        assertTrue(keys.contains("key1"));
        assertTrue(keys.contains("key2"));
    }

    @Test
    public void testGetKeysWithPrefix_filtersKeys() {
        ep.addProperty("prefix.key1", "value1");
        ep.addProperty("other.key2", "value2");
        Iterator it = ep.getKeys("prefix");
        List<Object> keys = new ArrayList<Object>();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        assertEquals(1, keys.size());
        assertEquals("prefix.key1", keys.get(0));
    }

    // ---------- subset ----------

    @Test
    public void testSubset_validPrefix() {
        ep.addProperty("prefix.key1", "value1");
        ExtendedProperties subset = ep.subset("prefix");
        assertNotNull(subset);
        assertEquals("value1", subset.getString("key1"));
    }

    @Test
    public void testSubset_invalidPrefix_returnsNull() {
        ep.addProperty("key1", "value1");
        ExtendedProperties subset = ep.subset("nonMatchingPrefix");
        assertNull(subset);
    }

    @Test
    public void testSubset_exactMatchKey() {
        ep.addProperty("prefix", "value1");
        ExtendedProperties subset = ep.subset("prefix");
        assertNotNull(subset);
        assertEquals("value1", subset.getString("prefix"));
    }

    // ---------- display ----------

    @Test
    public void testDisplay_doesNotThrow() {
        ep.addProperty("key", "value");
        ep.display();
    }

    // ---------- getString ----------

    @Test
    public void testGetString_simple() {
        ep.addProperty("key", "value");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testGetString_withDefault_returnsDefaultWhenMissing() {
        assertEquals("defaultVal", ep.getString("missing", "defaultVal"));
    }

    @Test
    public void testGetString_withDefault_null() {
        assertNull(ep.getString("missing"));
    }

    @Test
    public void testGetString_interpolation() {
        ep.addProperty("base", "baseValue");
        ep.addProperty("key", "${base}-suffix");
        assertEquals("baseValue-suffix", ep.getString("key"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetString_interpolationInfiniteLoop_throwsException() {
        ep.addProperty("a", "${b}");
        ep.addProperty("b", "${a}");
        ep.getString("a");
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_classCastException() {
        ep.put("key", new Integer(5));
        ep.getString("key");
    }

    @Test
    public void testGetString_fromList() {
        ep.addProperty("key", "val1,val2");
        assertEquals("val1", ep.getString("key"));
    }

    // ---------- getProperties ----------

    @Test
    public void testGetProperties_valid() {
        ep.addProperty("key", "pkey1=pval1,pkey2=pval2");
        Properties props = ep.getProperties("key");
        assertEquals("pval1", props.getProperty("pkey1"));
        assertEquals("pval2", props.getProperty("pkey2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_invalidToken_throwsException() {
        ep.addProperty("key", "invalidTokenWithoutEquals");
        ep.getProperties("key");
    }

    // ---------- getStringArray ----------

    @Test
    public void testGetStringArray_fromString() {
        ep.addProperty("key", "singleValue");
        String[] arr = ep.getStringArray("key");
        assertEquals(1, arr.length);
        assertEquals("singleValue", arr[0]);
    }

    @Test
    public void testGetStringArray_fromList() {
        ep.addProperty("key", "val1,val2");
        String[] arr = ep.getStringArray("key");
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetStringArray_nonExisting_emptyArray() {
        String[] arr = ep.getStringArray("missing");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_classCastException() {
        ep.put("key", new Integer(5));
        ep.getStringArray("key");
    }

    // ---------- getVector ----------

    @Test
    public void testGetVector_fromList() {
        ep.addProperty("key", "val1,val2");
        Vector v = ep.getVector("key");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVector_fromString() {
        ep.addProperty("key", "singleValue");
        Vector v = ep.getVector("key");
        assertEquals(1, v.size());
        assertEquals("singleValue", v.get(0));
    }

    @Test
    public void testGetVector_nonExisting_defaultValue() {
        Vector defaultVec = new Vector();
        defaultVec.add("default");
        Vector v = ep.getVector("missing", defaultVec);
        assertEquals(defaultVec, v);
    }

    @Test
    public void testGetVector_nonExisting_nullDefault_returnsEmptyVector() {
        Vector v = ep.getVector("missing", null);
        assertNotNull(v);
        assertTrue(v.isEmpty());
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_classCastException() {
        ep.put("key", new Integer(5));
        ep.getVector("key");
    }

    // ---------- getList ----------

    @Test
    public void testGetList_fromList() {
        ep.addProperty("key", "val1,val2");
        List list = ep.getList("key");
        assertEquals(2, list.size());
    }

    @Test
    public void testGetList_fromString() {
        ep.addProperty("key", "singleValue");
        List list = ep.getList("key");
        assertEquals(1, list.size());
    }

    @Test
    public void testGetList_nonExisting_defaultValue() {
        List defaultList = new ArrayList();
        defaultList.add("default");
        List list = ep.getList("missing", defaultList);
        assertEquals(defaultList, list);
    }

    @Test
    public void testGetList_nonExisting_nullDefault_returnsEmptyList() {
        List list = ep.getList("missing", null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_classCastException() {
        ep.put("key", new Integer(5));
        ep.getList("key");
    }

    // ---------- getBoolean ----------

    @Test
    public void testGetBoolean_trueValue() {
        ep.addProperty("key", "true");
        assertTrue(ep.getBoolean("key"));
    }

    @Test
    public void testGetBoolean_onValue() {
        ep.addProperty("key", "on");
        assertTrue(ep.getBoolean("key"));
    }

    @Test
    public void testGetBoolean_yesValue() {
        ep.addProperty("key", "yes");
        assertTrue(ep.getBoolean("key"));
    }

    @Test
    public void testGetBoolean_falseValue() {
        ep.addProperty("key", "false");
        assertFalse(ep.getBoolean("key"));
    }

    @Test
    public void testGetBoolean_offValue() {
        ep.addProperty("key", "off");
        assertFalse(ep.getBoolean("key"));
    }

    @Test
    public void testGetBoolean_noValue() {
        ep.addProperty("key", "no");
        assertFalse(ep.getBoolean("key"));
    }

    @Test
    public void testGetBoolean_actualBooleanObject() {
        ep.put("key", Boolean.TRUE);
        assertTrue(ep.getBoolean("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_nonExisting_throwsException() {
        ep.getBoolean("missing");
    }

    @Test
    public void testGetBoolean_withPrimitiveDefault() {
        assertTrue(ep.getBoolean("missing", true));
        assertFalse(ep.getBoolean("missing2", false));
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_classCastException() {
        ep.put("key", new Integer(5));
        ep.getBoolean("key");
    }

    @Test
    public void testTestBoolean_invalidValue_returnsNull() {
        assertNull(ep.testBoolean("notABoolean"));
    }

    @Test
    public void testTestBoolean_validValues() {
        assertEquals("true", ep.testBoolean("TRUE"));
        assertEquals("false", ep.testBoolean("FALSE"));
    }

    // ---------- getByte ----------

    @Test
    public void testGetByte_valid() {
        ep.addProperty("key", "5");
        assertEquals((byte) 5, ep.getByte("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_nonExisting_throwsException() {
        ep.getByte("missing");
    }

    @Test
    public void testGetByte_withDefault() {
        assertEquals((byte) 9, ep.getByte("missing", (byte) 9));
    }

    @Test
    public void testGetByte_actualByteObject() {
        ep.put("key", new Byte((byte) 7));
        assertEquals((byte) 7, ep.getByte("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_classCastException() {
        ep.put("key", new Object());
        ep.getByte("key");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByte_invalidNumberFormat_throwsException() {
        ep.addProperty("key", "notANumber");
        ep.getByte("key");
    }

    // ---------- getShort ----------

    @Test
    public void testGetShort_valid() {
        ep.addProperty("key", "10");
        assertEquals((short) 10, ep.getShort("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_nonExisting_throwsException() {
        ep.getShort("missing");
    }

    @Test
    public void testGetShort_withDefault() {
        assertEquals((short) 3, ep.getShort("missing", (short) 3));
    }

    @Test
    public void testGetShort_actualShortObject() {
        ep.put("key", new Short((short) 4));
        assertEquals((short) 4, ep.getShort("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_classCastException() {
        ep.put("key", new Object());
        ep.getShort("key");
    }

    // ---------- getInt / getInteger ----------

    @Test
    public void testGetInt_valid() {
        ep.addProperty("key", "42");
        assertEquals(42, ep.getInt("key"));
    }

    @Test
    public void testGetInt_withDefault() {
        assertEquals(99, ep.getInt("missing", 99));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_nonExisting_throwsException() {
        ep.getInteger("missing");
    }

    @Test
    public void testGetInteger_actualIntegerObject() {
        ep.put("key", new Integer(3));
        assertEquals(3, ep.getInteger("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_classCastException() {
        ep.put("key", new Object());
        ep.getInteger("key");
    }

    // ---------- getLong ----------

    @Test
    public void testGetLong_valid() {
        ep.addProperty("key", "123456789");
        assertEquals(123456789L, ep.getLong("key"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_nonExisting_throwsException() {
        ep.getLong("missing");
    }

    @Test
    public void testGetLong_withDefault() {
        assertEquals(50L, ep.getLong("missing", 50L));
    }

    @Test
    public void testGetLong_actualLongObject() {
        ep.put("key", new Long(88L));
        assertEquals(88L, ep.getLong("key"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_classCastException() {
        ep.put("key", new Object());
        ep.getLong("key");
    }

    // ---------- getFloat ----------

    @Test
    public void testGetFloat_valid() {
        ep.addProperty("key", "3.14");
        assertEquals(3.14f, ep.getFloat("key"), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_nonExisting_throwsException() {
        ep.getFloat("missing");
    }

    @Test
    public void testGetFloat_withDefault() {
        assertEquals(1.5f, ep.getFloat("missing", 1.5f), 0.001);
    }

    @Test
    public void testGetFloat_actualFloatObject() {
        ep.put("key", new Float(2.5f));
        assertEquals(2.5f, ep.getFloat("key"), 0.001);
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_classCastException() {
        ep.put("key", new Object());
        ep.getFloat("key");
    }

    // ---------- getDouble ----------

    @Test
    public void testGetDouble_valid() {
        ep.addProperty("key", "2.71828");
        assertEquals(2.71828, ep.getDouble("key"), 0.0001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_nonExisting_throwsException() {
        ep.getDouble("missing");
    }

    @Test
    public void testGetDouble_withDefault() {
        assertEquals(9.9, ep.getDouble("missing", 9.9), 0.0001);
    }

    @Test
    public void testGetDouble_actualDoubleObject() {
        ep.put("key", new Double(1.1));
        assertEquals(1.1, ep.getDouble("key"), 0.0001);
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_classCastException() {
        ep.put("key", new Object());
        ep.getDouble("key");
    }

    // ---------- convertProperties ----------

    @Test
    public void testConvertProperties_convertsCorrectly() {
        Properties props = new Properties();
        props.setProperty("key1", "value1");
        props.setProperty("key2", "value2");
        ExtendedProperties converted = ExtendedProperties.convertProperties(props);
        assertEquals("value1", converted.getString("key1"));
        assertEquals("value2", converted.getString("key2"));
    }

    // ---------- putAll ----------

    @Test
    public void testPutAll_withExtendedProperties() {
        ExtendedProperties source = new ExtendedProperties();
        source.addProperty("key1", "value1");
        source.addProperty("key2", "value2");
        ExtendedProperties target = new ExtendedProperties();
        target.putAll(source);
        assertEquals("value1", target.get("key1"));
        assertEquals("value2", target.get("key2"));
    }

    @Test
    public void testPutAll_withRegularMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        ExtendedProperties target = new ExtendedProperties();
        target.putAll(map);
        assertEquals("value1", target.get("key1"));
    }

    // ---------- defaults fallback for various getters ----------

    @Test
    public void testGetStringArray_fallbackToDefaults() throws IOException {
        File defaultFile = createTempFile("defKey = defValue\n");
        File mainFile = createTempFile("mainKey = mainValue\n");
        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        String[] arr = props.getStringArray("defKey");
        assertEquals(1, arr.length);
        assertEquals("defValue", arr[0]);
    }

    @Test
    public void testGetInteger_fallbackToDefaults() throws IOException {
        File defaultFile = createTempFile("defKey = 100\n");
        File mainFile = createTempFile("mainKey = 1\n");
        ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
        assertEquals(100, props.getInteger("defKey"));
    }
}
