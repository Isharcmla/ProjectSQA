package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Properties;
import java.util.NoSuchElementException;
import java.util.HashMap;
import java.util.Map;

public class ExtendedPropertiesTest {

    private ExtendedProperties ep;

    @Before
    public void setUp() {
        ep = new ExtendedProperties();
    }

    private File writeTempFile(String content) throws IOException {
        File f = File.createTempFile("extprop", ".properties");
        f.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(content.getBytes());
        fos.close();
        return f;
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_createsEmptyProperties() {
        ExtendedProperties p = new ExtendedProperties();
        assertNotNull(p);
        assertFalse(p.isInitialized());
    }

    @Test
    public void testFileConstructor_loadsProperties() throws IOException {
        File f = writeTempFile("key1 = value1\nkey2 = value2\n");
        ExtendedProperties p = new ExtendedProperties(f.getAbsolutePath());
        assertTrue(p.isInitialized());
        assertEquals("value1", p.getString("key1"));
        assertEquals("value2", p.getString("key2"));
    }

    @Test(expected = IOException.class)
    public void testFileConstructor_fileNotFound_throwsIOException() throws IOException {
        new ExtendedProperties("/nonexistent/path/should/not/exist.properties");
    }

    @Test
    public void testFileConstructor_withDefaultFile_loadsBoth() throws IOException {
        File defFile = writeTempFile("defkey = defvalue\n");
        File mainFile = writeTempFile("mainkey = mainvalue\n");
        ExtendedProperties p = new ExtendedProperties(mainFile.getAbsolutePath(), defFile.getAbsolutePath());
        assertEquals("mainvalue", p.getString("mainkey"));
        assertNotNull(p.getString("defkey", null));
    }

    // ---------- isInitialized ----------

    @Test
    public void testIsInitialized_beforeAnyOperation_isFalse() {
        assertFalse(ep.isInitialized());
    }

    @Test
    public void testIsInitialized_afterAddProperty_isTrue() {
        ep.addProperty("k", "v");
        assertTrue(ep.isInitialized());
    }

    // ---------- getInclude / setInclude ----------

    @Test
    public void testGetInclude_defaultValue_returnsInclude() {
        assertEquals("include", ep.getInclude());
    }

    @Test
    public void testSetInclude_null_getIncludeReturnsNull() {
        ep.setInclude(null);
        assertNull(ep.getInclude());
    }

    @Test
    public void testSetInclude_customValue_getIncludeReturnsCustom() {
        ep.setInclude("myinclude");
        assertEquals("myinclude", ep.getInclude());
    }

    // ---------- load ----------

    @Test
    public void testLoad_basicProperties_parsedCorrectly() throws IOException {
        String content = "key1 = value1\nkey2 = value2\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("value1", ep.getString("key1"));
        assertEquals("value2", ep.getString("key2"));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testLoad_withCommentsAndBlankLines_skipsThem() throws IOException {
        String content = "# this is a comment\n\nkey1 = value1\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("value1", ep.getString("key1"));
    }

    @Test
    public void testLoad_withContinuationLine_concatenatesLines() throws IOException {
        String content = "longkey = aaa\\\nbbb\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("aaabbb", ep.getString("longkey"));
    }

    @Test
    public void testLoad_withCommaSeparatedValues_createsMultipleTokens() throws IOException {
        String content = "tokens = first, second\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        String[] arr = ep.getStringArray("tokens");
        assertEquals(2, arr.length);
        assertEquals("first", arr[0]);
        assertEquals("second", arr[1]);
    }

    @Test
    public void testLoad_duplicateKey_createsVector() throws IOException {
        String content = "dupkey = first\ndupkey = second\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        String[] arr = ep.getStringArray("dupkey");
        assertEquals(2, arr.length);
    }

    @Test
    public void testLoad_withEncoding_parsedCorrectly() throws IOException {
        String content = "key = value\n";
        ep.load(new ByteArrayInputStream(content.getBytes()), "UTF-8");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_withInvalidEncoding_fallsBackToDefault() throws IOException {
        String content = "key = value\n";
        ep.load(new ByteArrayInputStream(content.getBytes()), "invalid-encoding-name");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testLoad_escapedComma_isUnescaped() throws IOException {
        String content = "commas = Hi\\, what up?\n";
        ep.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("Hi, what up?", ep.getString("commas"));
    }

    // ---------- getProperty ----------

    @Test
    public void testGetProperty_existingKey_returnsValue() {
        ep.addProperty("k", "v");
        assertEquals("v", ep.getProperty("k"));
    }

    @Test
    public void testGetProperty_nonExistingKey_returnsNull() {
        assertNull(ep.getProperty("nokey"));
    }

    // ---------- addProperty ----------

    @Test
    public void testAddProperty_newKey_addsSuccessfully() {
        ep.addProperty("k", "v");
        assertEquals("v", ep.getString("k"));
    }

    @Test
    public void testAddProperty_existingKey_createsVector() {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        String[] arr = ep.getStringArray("k");
        assertEquals(2, arr.length);
        assertEquals("v1", arr[0]);
        assertEquals("v2", arr[1]);
    }

    @Test
    public void testAddProperty_commaSeparatedString_splitsIntoTokens() {
        ep.addProperty("k", "a,b,c");
        String[] arr = ep.getStringArray("k");
        assertEquals(3, arr.length);
        assertEquals("a", arr[0]);
        assertEquals("b", arr[1]);
        assertEquals("c", arr[2]);
    }

    @Test
    public void testAddProperty_nonStringValue_addedDirectly() {
        Integer val = new Integer(42);
        ep.addProperty("k", val);
        assertEquals(val, ep.getProperty("k"));
    }

    // ---------- setProperty ----------

    @Test
    public void testSetProperty_overwritesExisting() {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        ep.setProperty("k", "v3");
        assertEquals("v3", ep.getString("k"));
    }

    // ---------- save ----------

    @Test
    public void testSave_nullOutput_doesNothing() throws IOException {
        ep.addProperty("k", "v");
        ep.save(null, null);
        // no exception thrown
    }

    @Test
    public void testSave_withHeaderAndStringValue_writesCorrectly() throws IOException {
        ep.addProperty("k", "v");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, "# header");
        String out = baos.toString();
        assertTrue(out.contains("# header"));
        assertTrue(out.contains("k=v"));
    }

    @Test
    public void testSave_withListValue_writesAllElements() throws IOException {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ep.save(baos, null);
        String out = baos.toString();
        assertTrue(out.contains("k=v1"));
        assertTrue(out.contains("k=v2"));
    }

    // ---------- combine ----------

    @Test
    public void testCombine_mergesPropertiesFromOther() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("k1", "v1");
        other.addProperty("k2", "v2");
        ep.addProperty("k1", "old");
        ep.combine(other);
        assertEquals("v1", ep.getString("k1"));
        assertEquals("v2", ep.getString("k2"));
    }

    // ---------- clearProperty ----------

    @Test
    public void testClearProperty_existingKey_removesIt() {
        ep.addProperty("k", "v");
        ep.clearProperty("k");
        assertNull(ep.getProperty("k"));
    }

    @Test
    public void testClearProperty_nonExistingKey_noEffect() {
        ep.clearProperty("nokey");
        assertNull(ep.getProperty("nokey"));
    }

    // ---------- getKeys ----------

    @Test
    public void testGetKeys_returnsAllKeysInOrder() {
        ep.addProperty("a", "1");
        ep.addProperty("b", "2");
        Iterator it = ep.getKeys();
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefix_filtersMatchingKeys() {
        ep.addProperty("prefix.a", "1");
        ep.addProperty("prefix.b", "2");
        ep.addProperty("other.c", "3");
        Iterator it = ep.getKeys("prefix");
        int count = 0;
        while (it.hasNext()) {
            String key = (String) it.next();
            assertTrue(key.startsWith("prefix"));
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetKeysWithPrefix_noMatches_returnsEmptyIterator() {
        ep.addProperty("a", "1");
        Iterator it = ep.getKeys("nomatch");
        assertFalse(it.hasNext());
    }

    // ---------- subset ----------

    @Test
    public void testSubset_validPrefix_returnsSubsetProperties() {
        ep.addProperty("prefix.a", "1");
        ep.addProperty("prefix.b", "2");
        ExtendedProperties sub = ep.subset("prefix");
        assertNotNull(sub);
        assertEquals("1", sub.getString("a"));
        assertEquals("2", sub.getString("b"));
    }

    @Test
    public void testSubset_noMatchingPrefix_returnsNull() {
        ep.addProperty("a", "1");
        ExtendedProperties sub = ep.subset("nomatch");
        assertNull(sub);
    }

    @Test
    public void testSubset_exactKeyMatch_usesPrefixAsKey() {
        ep.addProperty("prefix", "value");
        ExtendedProperties sub = ep.subset("prefix");
        assertNotNull(sub);
        assertEquals("value", sub.getString("prefix"));
    }

    // ---------- display ----------

    @Test
    public void testDisplay_doesNotThrowException() {
        ep.addProperty("k", "v");
        ep.display();
    }

    // ---------- getString ----------

    @Test
    public void testGetString_existingKey_returnsValue() {
        ep.addProperty("k", "v");
        assertEquals("v", ep.getString("k"));
    }

    @Test
    public void testGetString_nonExistingKey_returnsDefault() {
        assertEquals("default", ep.getString("nokey", "default"));
    }

    @Test
    public void testGetString_nonExistingKeyNoDefault_returnsNull() {
        assertNull(ep.getString("nokey"));
    }

    @Test
    public void testGetString_withInterpolation_replacesVariable() {
        ep.addProperty("name", "world");
        ep.addProperty("greeting", "hello ${name}");
        assertEquals("hello world", ep.getString("greeting"));
    }

    @Test
    public void testGetString_undefinedVariable_keepsToken() {
        ep.addProperty("greeting", "hello ${undefined}");
        assertEquals("hello ${undefined}", ep.getString("greeting"));
    }

    @Test
    public void testGetString_listValue_returnsFirstElement() {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        assertEquals("v1", ep.getString("k"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetString_wrongType_throwsClassCastException() {
        ep.addProperty("k", new Integer(5));
        ep.getString("k");
    }

    @Test(expected = IllegalStateException.class)
    public void testGetString_infiniteLoopInterpolation_throwsIllegalStateException() {
        ep.addProperty("a", "${b}");
        ep.addProperty("b", "${a}");
        ep.getString("a");
    }

    // ---------- getProperties ----------

    @Test
    public void testGetProperties_validTokens_parsedCorrectly() {
        ep.addProperty("data", "a=1,b=2");
        Properties result = ep.getProperties("data");
        assertEquals("1", result.getProperty("a"));
        assertEquals("2", result.getProperty("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperties_malformedToken_throwsIllegalArgumentException() {
        ep.addProperty("bad", "noequalsign");
        ep.getProperties("bad");
    }

    // ---------- getStringArray ----------

    @Test
    public void testGetStringArray_stringValue_returnsSingleElementArray() {
        ep.addProperty("k", "v");
        String[] arr = ep.getStringArray("k");
        assertEquals(1, arr.length);
        assertEquals("v", arr[0]);
    }

    @Test
    public void testGetStringArray_listValue_returnsAllElements() {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        String[] arr = ep.getStringArray("k");
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetStringArray_nonExistingKey_returnsEmptyArray() {
        String[] arr = ep.getStringArray("nokey");
        assertEquals(0, arr.length);
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArray_wrongType_throwsClassCastException() {
        ep.addProperty("k", new Integer(5));
        ep.getStringArray("k");
    }

    // ---------- getVector ----------

    @Test
    public void testGetVector_stringValue_returnsVectorWithOneElement() {
        ep.addProperty("k", "v");
        Vector v = ep.getVector("k");
        assertEquals(1, v.size());
        assertEquals("v", v.get(0));
    }

    @Test
    public void testGetVector_listValue_returnsVectorCopy() {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        Vector v = ep.getVector("k");
        assertEquals(2, v.size());
    }

    @Test
    public void testGetVector_nonExistingKeyNoDefault_returnsEmptyVector() {
        Vector v = ep.getVector("nokey");
        assertNotNull(v);
        assertEquals(0, v.size());
    }

    @Test
    public void testGetVector_nonExistingKeyWithDefault_returnsDefault() {
        Vector defVal = new Vector();
        defVal.add("d");
        Vector v = ep.getVector("nokey", defVal);
        assertEquals(defVal, v);
    }

    @Test(expected = ClassCastException.class)
    public void testGetVector_wrongType_throwsClassCastException() {
        ep.addProperty("k", new Integer(5));
        ep.getVector("k");
    }

    // ---------- getList ----------

    @Test
    public void testGetList_stringValue_returnsListWithOneElement() {
        ep.addProperty("k", "v");
        List l = ep.getList("k");
        assertEquals(1, l.size());
        assertEquals("v", l.get(0));
    }

    @Test
    public void testGetList_listValue_returnsListCopy() {
        ep.addProperty("k", "v1");
        ep.addProperty("k", "v2");
        List l = ep.getList("k");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetList_nonExistingKeyNoDefault_returnsEmptyList() {
        List l = ep.getList("nokey");
        assertNotNull(l);
        assertEquals(0, l.size());
    }

    @Test(expected = ClassCastException.class)
    public void testGetList_wrongType_throwsClassCastException() {
        ep.addProperty("k", new Integer(5));
        ep.getList("k");
    }

    // ---------- getBoolean ----------

    @Test
    public void testGetBoolean_trueString_returnsTrue() {
        ep.addProperty("k", "true");
        assertTrue(ep.getBoolean("k"));
    }

    @Test
    public void testGetBoolean_yesString_returnsTrue() {
        ep.addProperty("k", "yes");
        assertTrue(ep.getBoolean("k"));
    }

    @Test
    public void testGetBoolean_falseString_returnsFalse() {
        ep.addProperty("k", "false");
        assertFalse(ep.getBoolean("k"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetBoolean_nonExistingKey_throwsNoSuchElementException() {
        ep.getBoolean("nokey");
    }

    @Test
    public void testGetBoolean_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertTrue(ep.getBoolean("nokey", true));
        assertFalse(ep.getBoolean("nokey", false));
    }

    @Test
    public void testGetBoolean_booleanObject_returnsSame() {
        ep.addProperty("k", Boolean.TRUE);
        assertTrue(ep.getBoolean("k"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetBoolean_wrongType_throwsClassCastException() {
        ep.addProperty("k", new Integer(5));
        ep.getBoolean("k");
    }

    @Test
    public void testGetBoolean_invalidStringValue_returnsFalse() {
        ep.addProperty("k", "notaboolean");
        assertFalse(ep.getBoolean("k"));
    }

    // ---------- testBoolean ----------

    @Test
    public void testTestBoolean_trueVariants_returnTrueString() {
        assertEquals("true", ep.testBoolean("true"));
        assertEquals("true", ep.testBoolean("ON"));
        assertEquals("true", ep.testBoolean("Yes"));
    }

    @Test
    public void testTestBoolean_falseVariants_returnFalseString() {
        assertEquals("false", ep.testBoolean("false"));
        assertEquals("false", ep.testBoolean("OFF"));
        assertEquals("false", ep.testBoolean("No"));
    }

    @Test
    public void testTestBoolean_invalidValue_returnsNull() {
        assertNull(ep.testBoolean("maybe"));
    }

    // ---------- getByte ----------

    @Test
    public void testGetByte_validStringValue_returnsByte() {
        ep.addProperty("k", "5");
        assertEquals((byte) 5, ep.getByte("k"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetByte_nonExistingKey_throwsNoSuchElementException() {
        ep.getByte("nokey");
    }

    @Test
    public void testGetByte_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals((byte) 9, ep.getByte("nokey", (byte) 9));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByte_invalidNumberFormat_throwsNumberFormatException() {
        ep.addProperty("k", "notanumber");
        ep.getByte("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetByte_wrongType_throwsClassCastException() {
        ep.addProperty("k", Boolean.TRUE);
        ep.getByte("k");
    }

    // ---------- getShort ----------

    @Test
    public void testGetShort_validStringValue_returnsShort() {
        ep.addProperty("k", "100");
        assertEquals((short) 100, ep.getShort("k"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetShort_nonExistingKey_throwsNoSuchElementException() {
        ep.getShort("nokey");
    }

    @Test
    public void testGetShort_withDefaultPrimitive_returnsDefaultWhenMissing() {
        assertEquals((short) 7, ep.getShort("nokey", (short) 7));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShort_invalidNumberFormat_throwsNumberFormatException() {
        ep.addProperty("k", "notanumber");
        ep.getShort("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetShort_wrongType_throwsClassCastException() {
        ep.addProperty("k", Boolean.TRUE);
        ep.getShort("k");
    }

    // ---------- getInt / getInteger ----------

    @Test
    public void testGetInt_validStringValue_returnsInt() {
        ep.addProperty("k", "42");
        assertEquals(42, ep.getInt("k"));
    }

    @Test
    public void testGetInt_withDefault_returnsDefaultWhenMissing() {
        assertEquals(99, ep.getInt("nokey", 99));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetInteger_nonExistingKey_throwsNoSuchElementException() {
        ep.getInteger("nokey");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetInteger_invalidNumberFormat_throwsNumberFormatException() {
        ep.addProperty("k", "notanumber");
        ep.getInteger("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetInteger_wrongType_throwsClassCastException() {
        ep.addProperty("k", Boolean.TRUE);
        ep.getInteger("k");
    }

    // ---------- getLong ----------

    @Test
    public void testGetLong_validStringValue_returnsLong() {
        ep.addProperty("k", "12345678900");
        assertEquals(12345678900L, ep.getLong("k"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLong_nonExistingKey_throwsNoSuchElementException() {
        ep.getLong("nokey");
    }

    @Test
    public void testGetLong_withDefault_returnsDefaultWhenMissing() {
        assertEquals(123L, ep.getLong("nokey", 123L));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLong_invalidNumberFormat_throwsNumberFormatException() {
        ep.addProperty("k", "notanumber");
        ep.getLong("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLong_wrongType_throwsClassCastException() {
        ep.addProperty("k", Boolean.TRUE);
        ep.getLong("k");
    }

    // ---------- getFloat ----------

    @Test
    public void testGetFloat_validStringValue_returnsFloat() {
        ep.addProperty("k", "3.14");
        assertEquals(3.14f, ep.getFloat("k"), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloat_nonExistingKey_throwsNoSuchElementException() {
        ep.getFloat("nokey");
    }

    @Test
    public void testGetFloat_withDefault_returnsDefaultWhenMissing() {
        assertEquals(1.5f, ep.getFloat("nokey", 1.5f), 0.001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloat_invalidNumberFormat_throwsNumberFormatException() {
        ep.addProperty("k", "notanumber");
        ep.getFloat("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloat_wrongType_throwsClassCastException() {
        ep.addProperty("k", Boolean.TRUE);
        ep.getFloat("k");
    }

    // ---------- getDouble ----------

    @Test
    public void testGetDouble_validStringValue_returnsDouble() {
        ep.addProperty("k", "3.14159");
        assertEquals(3.14159, ep.getDouble("k"), 0.0001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDouble_nonExistingKey_throwsNoSuchElementException() {
        ep.getDouble("nokey");
    }

    @Test
    public void testGetDouble_withDefault_returnsDefaultWhenMissing() {
        assertEquals(2.5, ep.getDouble("nokey", 2.5), 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDouble_invalidNumberFormat_throwsNumberFormatException() {
        ep.addProperty("k", "notanumber");
        ep.getDouble("k");
    }

    @Test(expected = ClassCastException.class)
    public void testGetDouble_wrongType_throwsClassCastException() {
        ep.addProperty("k", Boolean.TRUE);
        ep.getDouble("k");
    }

    // ---------- convertProperties ----------

    @Test
    public void testConvertProperties_convertsCorrectly() {
        Properties props = new Properties();
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        ExtendedProperties converted = ExtendedProperties.convertProperties(props);
        assertEquals("1", converted.getString("a"));
        assertEquals("2", converted.getString("b"));
    }

    // ---------- put ----------

    @Test
    public void testPut_addsPropertySuccessfully() {
        ep.put("k", "v");
        assertEquals("v", ep.getString("k"));
    }

    @Test
    public void testPut_returnsOldValue() {
        ep.addProperty("k", "old");
        Object old = ep.put("k", "new");
        assertEquals("old", old);
    }

    @Test
    public void testPut_nonStringKey_convertedToString() {
        ep.put(new Integer(1), "v");
        assertEquals("v", ep.getString("1"));
    }

    // ---------- putAll ----------

    @Test
    public void testPutAll_fromExtendedProperties_mergesCorrectly() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("a", "1");
        other.addProperty("b", "2");
        ep.putAll(other);
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    @Test
    public void testPutAll_fromRegularMap_mergesCorrectly() {
        Map map = new HashMap();
        map.put("a", "1");
        map.put("b", "2");
        ep.putAll(map);
        assertEquals("1", ep.getString("a"));
        assertEquals("2", ep.getString("b"));
    }

    // ---------- remove ----------

    @Test
    public void testRemove_existingKey_removesAndReturnsOldValue() {
        ep.addProperty("k", "v");
        Object removed = ep.remove("k");
        assertEquals("v", removed);
        assertNull(ep.getProperty("k"));
    }

    @Test
    public void testRemove_nonExistingKey_returnsNull() {
        Object removed = ep.remove("nokey");
        assertNull(removed);
    }
}
