import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

import org.apache.commons.collections.ExtendedProperties;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;
    private File tempFile;
    private File tempDefaultFile;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @After
    public void tearDown() {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
        if (tempDefaultFile != null && tempDefaultFile.exists()) {
            tempDefaultFile.delete();
        }
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_createsEmptyProperties() {
        ExtendedProperties p = new ExtendedProperties();
        assertFalse(p.isInitialized());
        assertFalse(p.getKeys().hasNext());
    }

    @Test
    public void testFileConstructor_loadsPropertiesFromFile() throws IOException {
        tempFile = File.createTempFile("extprops", ".properties");
        FileWriter fw = new FileWriter(tempFile);
        fw.write("key1 = value1\n");
        fw.write("# comment line\n");
        fw.write("\n");
        fw.write("key2 = value2\n");
        fw.close();

        ExtendedProperties p = new ExtendedProperties(tempFile.getAbsolutePath());
        assertEquals("value1", p.getString("key1"));
        assertEquals("value2", p.getString("key2"));
        assertTrue(p.isInitialized());
    }

    @Test(expected = IOException.class)
    public void testFileConstructor_fileNotFound_throwsIOException() throws IOException {
        new ExtendedProperties("/nonexistent/path/to/file.properties");
    }

    @Test
    public void testFileConstructorWithDefaultFile_loadsBothFiles() throws IOException {
        tempDefaultFile = File.createTempFile("defprops", ".properties");
        FileWriter fw2 = new FileWriter(tempDefaultFile);
        fw2.write("defaultKey = defaultValue\n");
        fw2.close();

        tempFile = File.createTempFile("mainprops", ".properties");
        FileWriter fw = new FileWriter(tempFile);
        fw.write("mainKey = mainValue\n");
        fw.close();

        ExtendedProperties p = new ExtendedProperties(tempFile.getAbsolutePath(), tempDefaultFile.getAbsolutePath());
        assertEquals("mainValue", p.getString("mainKey"));
    }

    // ---------- isInitialized ----------

    @Test
    public void testIsInitialized_beforeAndAfterAddProperty() {
        assertFalse(props.isInitialized());
        props.addProperty("key", "value");
        assertTrue(props.isInitialized());
    }

    // ---------- getInclude / setInclude ----------

    @Test
    public void testGetInclude_defaultValue_returnsInclude() {
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testSetInclude_changesIncludeValue() {
        props.setInclude("myinclude");
        assertEquals("myinclude", props.getInclude());
        // reset back to default to not affect other tests (static variable)
        props.setInclude("include");
    }

    // ---------- load(InputStream) ----------

    @Test
    public void testLoad_simpleProperties_addsKeysCorrectly() throws IOException {
        String data = "key1 = value1\nkey2 = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in);
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoad_withComments_skipsComments() throws IOException {
        String data = "# this is a comment\nkey1 = value1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in);
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testLoad_withEmptyValue_skipsLine() throws IOException {
        String data = "key1 = \nkey2 = value2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in);
        assertNull(props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testLoad_withEncoding_loadsCorrectly() throws IOException {
        String data = "key1 = value1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in, "UTF-8");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testLoad_withInvalidEncoding_fallsBackToDefault() throws IOException {
        String data = "key1 = value1\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in, "INVALID_ENCODING_XYZ");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testLoad_withMultilineValue_concatenatesLines() throws IOException {
        String data = "key1 = value1\\\ncontinued\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in);
        assertEquals("value1continued", props.getString("key1"));
    }

    @Test
    public void testLoad_withInclude_loadsIncludedFile() throws IOException {
        tempDefaultFile = File.createTempFile("included", ".properties");
        FileWriter fw = new FileWriter(tempDefaultFile);
        fw.write("includedKey = includedValue\n");
        fw.close();

        String data = "include = " + tempDefaultFile.getAbsolutePath() + "\n";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        props.load(in);
        assertEquals("includedValue", props.getString("includedKey"));
    }

    // ---------- getProperty ----------

    @Test
    public void testGetProperty_existingKey_returnsValue() {
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getProperty("key1"));
    }

    @Test
    public void testGetProperty_missingKeyNoDefaults_returnsNull() {
        assertNull(props.getProperty("missing"));
    }

    // ---------- addProperty ----------

    @Test
    public void testAddProperty_singleValue_addsCorrectly() {
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testAddProperty_duplicateKey_createsVector() {
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        List list = props.getVector("key1");
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testAddProperty_commaSeparatedValue_splitsIntoTokens() {
        props.addProperty("key1", "value1,value2");
        List list = props.getVector("key1");
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testAddProperty_nonStringValue_addsDirectly() {
        Integer intValue = new Integer(42);
        props.addProperty("key1", intValue);
        assertEquals(intValue, props.getProperty("key1"));
    }

    @Test
    public void testAddProperty_escapedComma_notSplit() {
        props.addProperty("key1", "value1\\,stillOne");
        assertEquals("value1,stillOne", props.getString("key1"));
    }

    // ---------- setProperty ----------

    @Test
    public void testSetProperty_replacesExistingValue() {
        props.addProperty("key1", "value1");
        props.setProperty("key1", "value2");
        assertEquals("value2", props.getString("key1"));
    }

    // ---------- save ----------

    @Test
    public void testSave_withStringValue_writesCorrectFormat() throws IOException {
        props.addProperty("key1", "value1");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, "header comment");
        String result = out.toString();
        assertTrue(result.contains("header comment"));
        assertTrue(result.contains("key1=value1"));
    }

    @Test
    public void testSave_withListValue_writesMultipleLines() throws IOException {
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        props.save(out, null);
        String result = out.toString();
        assertTrue(result.contains("key1=value1"));
        assertTrue(result.contains("key1=value2"));
    }

    @Test
    public void testSave_withNullOutputStream_doesNothing() throws IOException {
        props.addProperty("key1", "value1");
        props.save(null, "header");
        // no exception expected
    }

    // ---------- combine ----------

    @Test
    public void testCombine_mergesProperties() {
        props.addProperty("key1", "value1");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("key2", "value2");
        props.combine(other);
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testCombine_overwritesExistingKey() {
        props.addProperty("key1", "oldValue");
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("key1", "newValue");
        props.combine(other);
        assertEquals("newValue", props.getString("key1"));
    }

    // ---------- clearProperty ----------

    @Test
    public void testClearProperty_existingKey_removesKey() {
        props.addProperty("key1", "value1");
        props.clearProperty("key1");
        assertNull(props.getProperty("key1"));
        assertFalse(props.getKeys().hasNext());
    }

    @Test
    public void testClearProperty_nonExistingKey_doesNothing() {
        props.clearProperty("nonexistent");
        assertFalse(props.getKeys().hasNext());
    }

    // ---------- getKeys ----------

    @Test
    public void testGetKeys_noArgs_returnsAllKeysInOrder() {
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        Iterator it = props.getKeys();
        assertEquals("key1", it.next());
        assertEquals("key2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeys_withPrefix_returnsMatchingKeysOnly() {
        props.addProperty("prefix.key1", "value1");
        props.addProperty("other.key2", "value2");
        Iterator it = props.getKeys("prefix");
        assertTrue(it.hasNext());
        assertEquals("prefix.key1", it.next());
        assertFalse(it.hasNext());
    }

    // ---------- subset ----------

    @Test
    public void testSubset_withMatchingPrefix_returnsSubset() {
        props.addProperty("db.host", "localhost");
        props.addProperty("db.port", "5432");
        props.addProperty("other.key", "value");
        ExtendedProperties sub = props.subset("db");
        assertNotNull(sub);
        assertEquals("localhost", sub.getString("host"));
        assertEquals("5432", sub.getString("port"));
    }

    @Test
    public void testSubset_withNoMatchingPrefix_returnsNull() {
        props.addProperty("other.key", "value");
        ExtendedProperties sub = props.subset("db");
        assertNull(sub);
    }

    @Test
    public void testSubset_keyEqualsPrefix_usesPrefixAsKey() {
        props.addProperty("db", "value");
        ExtendedProperties sub = props.subset("db");
        assertNotNull(sub);
        assertEquals("value", sub.getString("db"));
    }

    // ---------- display ----------

    @Test
    public void testDisplay_doesNotThrowException() {
        props.addProperty("key1", "value1");
        props.display();
        // no assertion needed, just ensure no exception
    }

    // ---------- getString ----------

    @Test
    public void testGetString_existingKey_returnsValue() {
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testGetString_missingKeyWithDefault_returnsDefault() {
        assertEquals("default", props.getString("missing", "default"));
    }

    @Test
    public void testGetString_missingKeyNoDefault_returnsNull() {
        assertNull(props.getString("missing"));
    }

    @Test
    public void testGetString_listValue_returnsFirstElement() {
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        assertEquals("value1", props.getString("key1"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_nonStringNonListValue_throwsClassCastException() {
        props.put("key1", new Integer(5));
        props.getString("key1");
    }

    @Test
    public void testGetString_withInterpolation_resolvesVariable() {
        props.addProperty("name", "world");
        props.addProperty("greeting", "hello ${name}");
        assertEquals("hello world", props.getString("greeting"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetString_withInfiniteLoopInterpolation_throwsIllegalStateException() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");
        props.getString("a");
    }

    // ---------- getProperties ----------

    @Test
    public void testGetProperties_validKeyValuePairs_returnsProperties() {
        props.addProperty("key1", "a=1,b=2");
        Properties result = props.getProperties("key1");
        assertEquals("1", result.getProperty("a"));
        assertEquals("2", result.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_malformedToken_throwsIllegalArgumentException() {
        props.addProperty("key1", "novalue");
        props.getProperties("key1");
    }

    @Test
    public void testGetProperties_withDefaults_usesDefaultsParam() {
        Properties defaults = new Properties();
        defaults.setProperty("x", "y");
        Properties result = props.getProperties("missing", defaults);
        assertEquals("y", result.getProperty("x"));
    }

    // ---------- getStringArray ----------

    @Test
    public void testGetStringArray_stringValue_returnsSingleElementArray() {
        props.addProperty("key1", "value1");
        String[] arr = props.getStringArray("key1");
        assertEquals(1, arr.length);
        assertEquals("value1", arr[0]);
    }

    @Test
    public void testGetStringArray_listValue_returnsAllElements() {
        props.addProperty("key1", "value1,value2");
        String[] arr = props.getStringArray("key1");
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetStringArray_missingKeyNoDefaults_returnsEmptyArray() {
        String[] arr = props.getStringArray("missing");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_nonStringNonListValue_throwsClassCastException() {
        props.put("key1", new Integer(5));
        props.getStringArray("key1");
    }

    // ---------- getVector ----------

    @Test
    public void testGetVector_listValue_returnsVectorCopy() {
        props.addProperty("key1", "value1,value2");
        Vector v = props.getVector("key1");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVector_stringValue_convertsToVectorAndStores() {
        props.put("key1", "value1");
        Vector v = props.getVector("key1");
        assertEquals(1, v.size());
        assertEquals("value1", v.get(0));
    }

    @Test
    public void testGetVector_missingKeyNoDefaultValue_returnsEmptyVector() {
        Vector v = props.getVector("missing", null);
        assertNotNull(v);
        assertEquals(0, v.size());
    }

    @Test
    public void testGetVector_missingKeyWithDefaultValue_returnsDefault() {
        Vector defaultVector = new Vector();
        defaultVector.add("d1");
        Vector v = props.getVector("missing", defaultVector);
        assertEquals(defaultVector, v);
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_nonStringNonListValue_throwsClassCastException() {
        props.put("key1", new Integer(5));
        props.getVector("key1");
    }

    // ---------- getList ----------

    @Test
    public void testGetList_listValue_returnsListCopy() {
        props.addProperty("key1", "value1,value2");
        List l = props.getList("key1");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetList_stringValue_convertsToListAndStores() {
        props.put("key1", "value1");
        List l = props.getList("key1");
        assertEquals(1, l.size());
    }

    @Test
    public void testGetList_missingKeyNoDefaultValue_returnsEmptyList() {
        List l = props.getList("missing", null);
        assertNotNull(l);
        assertEquals(0, l.size());
    }

    @Test
    public void testGetList_missingKeyWithDefaultValue_returnsDefault() {
        List defaultList = new java.util.ArrayList();
        defaultList.add("d1");
        List l = props.getList("missing", defaultList);
        assertEquals(defaultList, l);
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_nonStringNonListValue_throwsClassCastException() {
        props.put("key1", new Integer(5));
        props.getList("key1");
    }

    // ---------- getBoolean ----------

    @Test
    public void testGetBoolean_trueStringValue_returnsTrue() {
        props.put("key1", "true");
        assertTrue(props.getBoolean("key1"));
    }

    @Test
    public void testGetBoolean_booleanValue_returnsSameBoolean() {
        props.put("key1", Boolean.TRUE);
        assertTrue(props.getBoolean("key1"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_missingKey_throwsNoSuchElementException() {
        props.getBoolean("missing");
    }

    @Test
    public void testGetBoolean_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertTrue(props.getBoolean("missing", true));
        assertFalse(props.getBoolean("missing2", false));
    }

    @Test
    public void testGetBoolean_withDefaultBooleanObject_returnsDefaultWhenMissing() {
        Boolean result = props.getBoolean("missing", Boolean.TRUE);
        assertTrue(result.booleanValue());
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_nonBooleanNonStringValue_throwsClassCastException() {
        props.put("key1", new Integer(5));
        props.getBoolean("key1", Boolean.FALSE);
    }

    @Test
    public void testTestBoolean_variousValues_returnsExpected() {
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("ON"));
        assertEquals("true", props.testBoolean("Yes"));
        assertEquals("false", props.testBoolean("false"));
        assertEquals("false", props.testBoolean("Off"));
        assertEquals("false", props.testBoolean("NO"));
        assertNull(props.testBoolean("maybe"));
    }

    // ---------- getByte ----------

    @Test
    public void testGetByte_stringValue_parsesToByte() {
        props.put("key1", "5");
        assertEquals((byte) 5, props.getByte("key1"));
    }

    @Test
    public void testGetByte_byteValue_returnsSameByte() {
        props.put("key1", new Byte((byte) 7));
        assertEquals((byte) 7, props.getByte("key1"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_missingKey_throwsNoSuchElementException() {
        props.getByte("missing");
    }

    @Test
    public void testGetByte_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals((byte) 9, props.getByte("missing", (byte) 9));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByte_invalidNumberFormat_throwsNumberFormatException() {
        props.put("key1", "notanumber");
        props.getByte("key1");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_nonByteNonStringValue_throwsClassCastException() {
        props.put("key1", Boolean.TRUE);
        props.getByte("key1", new Byte((byte) 1));
    }

    // ---------- getShort ----------

    @Test
    public void testGetShort_stringValue_parsesToShort() {
        props.put("key1", "10");
        assertEquals((short) 10, props.getShort("key1"));
    }

    @Test
    public void testGetShort_shortValue_returnsSameShort() {
        props.put("key1", new Short((short) 12));
        assertEquals((short) 12, props.getShort("key1"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_missingKey_throwsNoSuchElementException() {
        props.getShort("missing");
    }

    @Test
    public void testGetShort_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals((short) 3, props.getShort("missing", (short) 3));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShort_invalidNumberFormat_throwsNumberFormatException() {
        props.put("key1", "notanumber");
        props.getShort("key1");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_nonShortNonStringValue_throwsClassCastException() {
        props.put("key1", Boolean.TRUE);
        props.getShort("key1", new Short((short) 1));
    }

    // ---------- getInt / getInteger ----------

    @Test
    public void testGetInt_stringValue_parsesToInt() {
        props.put("key1", "100");
        assertEquals(100, props.getInt("key1"));
    }

    @Test
    public void testGetInt_withDefault_returnsDefaultWhenMissing() {
        assertEquals(42, props.getInt("missing", 42));
    }

    @Test
    public void testGetInteger_integerValue_returnsSameInteger() {
        props.put("key1", new Integer(55));
        assertEquals(55, props.getInteger("key1"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_missingKey_throwsNoSuchElementException() {
        props.getInteger("missing");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetInteger_invalidNumberFormat_throwsNumberFormatException() {
        props.put("key1", "notanumber");
        props.getInteger("key1");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_nonIntegerNonStringValue_throwsClassCastException() {
        props.put("key1", Boolean.TRUE);
        props.getInteger("key1", new Integer(1));
    }

    // ---------- getLong ----------

    @Test
    public void testGetLong_stringValue_parsesToLong() {
        props.put("key1", "10000000000");
        assertEquals(10000000000L, props.getLong("key1"));
    }

    @Test
    public void testGetLong_longValue_returnsSameLong() {
        props.put("key1", new Long(123456789L));
        assertEquals(123456789L, props.getLong("key1"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_missingKey_throwsNoSuchElementException() {
        props.getLong("missing");
    }

    @Test
    public void testGetLong_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals(999L, props.getLong("missing", 999L));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLong_invalidNumberFormat_throwsNumberFormatException() {
        props.put("key1", "notanumber");
        props.getLong("key1");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_nonLongNonStringValue_throwsClassCastException() {
        props.put("key1", Boolean.TRUE);
        props.getLong("key1", new Long(1L));
    }

    // ---------- getFloat ----------

    @Test
    public void testGetFloat_stringValue_parsesToFloat() {
        props.put("key1", "3.14");
        assertEquals(3.14f, props.getFloat("key1"), 0.001f);
    }

    @Test
    public void testGetFloat_floatValue_returnsSameFloat() {
        props.put("key1", new Float(2.5f));
        assertEquals(2.5f, props.getFloat("key1"), 0.001f);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_missingKey_throwsNoSuchElementException() {
        props.getFloat("missing");
    }

    @Test
    public void testGetFloat_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals(1.5f, props.getFloat("missing", 1.5f), 0.001f);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloat_invalidNumberFormat_throwsNumberFormatException() {
        props.put("key1", "notanumber");
        props.getFloat("key1");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_nonFloatNonStringValue_throwsClassCastException() {
        props.put("key1", Boolean.TRUE);
        props.getFloat("key1", new Float(1.0f));
    }

    // ---------- getDouble ----------

    @Test
    public void testGetDouble_stringValue_parsesToDouble() {
        props.put("key1", "3.14159");
        assertEquals(3.14159, props.getDouble("key1"), 0.0001);
    }

    @Test
    public void testGetDouble_doubleValue_returnsSameDouble() {
        props.put("key1", new Double(2.71828));
        assertEquals(2.71828, props.getDouble("key1"), 0.0001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_missingKey_throwsNoSuchElementException() {
        props.getDouble("missing");
    }

    @Test
    public void testGetDouble_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals(9.99, props.getDouble("missing", 9.99), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDouble_invalidNumberFormat_throwsNumberFormatException() {
        props.put("key1", "notanumber");
        props.getDouble("key1");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_nonDoubleNonStringValue_throwsClassCastException() {
        props.put("key1", Boolean.TRUE);
        props.getDouble("key1", new Double(1.0));
    }

    // ---------- convertProperties ----------

    @Test
    public void testConvertProperties_convertsStandardPropertiesToExtended() {
        Properties standard = new Properties();
        standard.setProperty("key1", "value1");
        standard.setProperty("key2", "value2");

        ExtendedProperties converted = ExtendedProperties.convertProperties(standard);
        assertEquals("value1", converted.getString("key1"));
        assertEquals("value2", converted.getString("key2"));
    }

    @Test
    public void testConvertProperties_emptyProperties_returnsEmptyExtendedProperties() {
        Properties standard = new Properties();
        ExtendedProperties converted = ExtendedProperties.convertProperties(standard);
        assertFalse(converted.getKeys().hasNext());
    }

    // ---------- defaults chain tests ----------

    @Test
    public void testGetString_withDefaultsChain_returnsFromDefaults() throws IOException {
        tempDefaultFile = File.createTempFile("defaults", ".properties");
        FileWriter fw = new FileWriter(tempDefaultFile);
        fw.write("defKey = defValue\n");
        fw.close();

        tempFile = File.createTempFile("main", ".properties");
        FileWriter fw2 = new FileWriter(tempFile);
        fw2.write("mainKey = mainValue\n");
        fw2.close();

        ExtendedProperties p = new ExtendedProperties(tempFile.getAbsolutePath(), tempDefaultFile.getAbsolutePath());
        assertEquals("defValue", p.getString("defKey"));
    }

    @Test
    public void testGetStringArray_withDefaultsChain_returnsFromDefaults() throws IOException {
        tempDefaultFile = File.createTempFile("defaults2", ".properties");
        FileWriter fw = new FileWriter(tempDefaultFile);
        fw.write("defKey = a,b\n");
        fw.close();

        tempFile = File.createTempFile("main2", ".properties");
        FileWriter fw2 = new FileWriter(tempFile);
        fw2.write("mainKey = mainValue\n");
        fw2.close();

        ExtendedProperties p = new ExtendedProperties(tempFile.getAbsolutePath(), tempDefaultFile.getAbsolutePath());
        String[] arr = p.getStringArray("defKey");
        assertEquals(2, arr.length);
    }
}
