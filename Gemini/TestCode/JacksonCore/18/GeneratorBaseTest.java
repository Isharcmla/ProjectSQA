package com.fasterxml.jackson.core.base;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class GeneratorBaseTest {

    static class DummyTreeNode implements TreeNode {
        @Override public JsonParser.NumberType numberType() { return null; }
        @Override public int size() { return 0; }
        @Override public boolean isValueNode() { return false; }
        @Override public boolean isContainerNode() { return false; }
        @Override public boolean isMissingNode() { return false; }
        @Override public boolean isArray() { return false; }
        @Override public boolean isObject() { return false; }
        @Override public TreeNode get(String fieldName) { return null; }
        @Override public TreeNode get(int index) { return null; }
        @Override public TreeNode path(String fieldName) { return null; }
        @Override public TreeNode path(int index) { return null; }
        @Override public Iterator<String> fieldNames() { return null; }
        @Override public TreeNode at(com.fasterxml.jackson.core.JsonPointer ptr) { return null; }
        @Override public TreeNode at(String jsonPtrExpr) { return null; }
        @Override public JsonParser traverse() { return null; }
        @Override public JsonParser traverse(ObjectCodec codec) { return null; }
        @Override public com.fasterxml.jackson.core.JsonToken asToken() { return null; }
    }

    static class DummyCodec extends ObjectCodec {
        public Object writtenObject;
        public TreeNode writtenTree;

        @Override public Version version() { return Version.unknownVersion(); }
        @Override public <T> T readValue(JsonParser p, Class<T> valueType) { return null; }
        @Override public <T> T readValue(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
        @Override public <T> T readValue(JsonParser p, ResolvedType valueType) { return null; }
        @Override public <T> Iterator<T> readValues(JsonParser p, Class<T> valueType) { return null; }
        @Override public <T> Iterator<T> readValues(JsonParser p, TypeReference<?> valueTypeRef) { return null; }
        @Override public <T> Iterator<T> readValues(JsonParser p, ResolvedType valueType) { return null; }
        @Override public void writeValue(JsonGenerator gen, Object value) throws IOException {
            this.writtenObject = value;
        }
        @Override public <T extends TreeNode> T readTree(JsonParser p) { return null; }
        @Override public void writeTree(JsonGenerator gen, TreeNode tree) throws IOException {
            this.writtenTree = tree;
        }
        @Override public TreeNode createObjectNode() { return null; }
        @Override public TreeNode createArrayNode() { return null; }
        @Override public JsonParser treeAsTokens(TreeNode n) { return null; }
        @Override public <T> T treeToValue(TreeNode n, Class<T> valueType) { return null; }
    }

    static class TestGenerator extends GeneratorBase {
        public List<String> calls = new ArrayList<String>();
        public String lastFieldName;
        public String lastString;
        public String lastRaw;
        public int highestNonEscaped = -1;

        public TestGenerator(int features, ObjectCodec codec) {
            super(features, codec);
        }

        public TestGenerator(int features, ObjectCodec codec, JsonWriteContext ctxt) {
            super(features, codec, ctxt);
        }

        @Override
        public JsonGenerator setHighestNonEscapedChar(int maxChar) {
            this.highestNonEscaped = maxChar;
            return this;
        }

        @Override
        public int getHighestNonEscapedChar() {
            return this.highestNonEscaped;
        }

        @Override
        public void flush() throws IOException {
            calls.add("flush");
        }

        @Override
        protected void _releaseBuffers() {
            calls.add("_releaseBuffers");
        }

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {
            calls.add("_verifyValueWrite:" + typeMsg);
        }

        @Override public void writeStartArray() throws IOException { calls.add("writeStartArray"); }
        @Override public void writeEndArray() throws IOException { calls.add("writeEndArray"); }
        @Override public void writeStartObject() throws IOException { calls.add("writeStartObject"); }
        @Override public void writeEndObject() throws IOException { calls.add("writeEndObject"); }
        @Override public void writeFieldName(String name) throws IOException { this.lastFieldName = name; calls.add("writeFieldName:" + name); }
        @Override public void writeString(String text) throws IOException { this.lastString = text; calls.add("writeString:" + text); }
        @Override public void writeString(char[] text, int offset, int len) throws IOException { writeString(new String(text, offset, len)); }
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException { calls.add("writeRawUTF8String"); }
        @Override public void writeUTF8String(byte[] text, int offset, int length) throws IOException { calls.add("writeUTF8String"); }
        @Override public void writeRaw(String text) throws IOException { this.lastRaw = text; calls.add("writeRaw:" + text); }
        @Override public void writeRaw(String text, int offset, int len) throws IOException { writeRaw(text.substring(offset, offset + len)); }
        @Override public void writeRaw(char[] text, int offset, int len) throws IOException { writeRaw(new String(text, offset, len)); }
        @Override public void writeRaw(char c) throws IOException { writeRaw(String.valueOf(c)); }
        @Override public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException { calls.add("writeBinary"); }
        @Override public void writeNumber(int v) throws IOException { calls.add("writeNumber:" + v); }
        @Override public void writeNumber(long v) throws IOException { calls.add("writeNumber:" + v); }
        @Override public void writeNumber(BigInteger v) throws IOException { calls.add("writeNumber:" + v); }
        @Override public void writeNumber(double v) throws IOException { calls.add("writeNumber:" + v); }
        @Override public void writeNumber(float v) throws IOException { calls.add("writeNumber:" + v); }
        @Override public void writeNumber(BigDecimal v) throws IOException { calls.add("writeNumber:" + v); }
        @Override public void writeNumber(String encodedValue) throws IOException { calls.add("writeNumber:" + encodedValue); }
        @Override public void writeBoolean(boolean state) throws IOException { calls.add("writeBoolean:" + state); }
        @Override public void writeNull() throws IOException { calls.add("writeNull"); }
    }

    @Test
    public void testConstructor_withFeaturesAndCodec_initializesCorrectly() {
        int flags = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask()
                | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        DummyCodec codec = new DummyCodec();
        TestGenerator gen = new TestGenerator(flags, codec);

        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        Assert.assertSame(codec, gen.getCodec());
        Assert.assertNotNull(gen.getOutputContext());
        Assert.assertNotNull(gen.getOutputContext().getDupDetector());
        Assert.assertTrue(gen._cfgNumbersAsStrings);
    }

    @Test
    public void testConstructor_withContext_initializesCorrectly() {
        JsonWriteContext ctxt = JsonWriteContext.createRootContext(null);
        TestGenerator gen = new TestGenerator(0, null, ctxt);

        Assert.assertSame(ctxt, gen.getOutputContext());
        Assert.assertNull(gen.getCodec());
        Assert.assertEquals(0, gen.getFeatureMask());
        Assert.assertFalse(gen._cfgNumbersAsStrings);
    }

    @Test
    public void testVersion_default_returnsNonNullVersion() {
        TestGenerator gen = new TestGenerator(0, null);
        Version v = gen.version();
        Assert.assertNotNull(v);
    }

    @Test
    public void testCurrentValue_getterAndSetter_updatesContext() {
        TestGenerator gen = new TestGenerator(0, null);
        Assert.assertNull(gen.getCurrentValue());

        Object val = "test-value";
        gen.setCurrentValue(val);
        Assert.assertSame(val, gen.getCurrentValue());

        gen.setCurrentValue(null);
        Assert.assertNull(gen.getCurrentValue());
    }

    @Test
    public void testEnable_derivedFeatures_updatesStateProperly() {
        TestGenerator gen = new TestGenerator(0, null);

        gen.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertTrue(gen._cfgNumbersAsStrings);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        gen.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        Assert.assertEquals(127, gen.getHighestNonEscapedChar());

        Assert.assertNull(gen.getOutputContext().getDupDetector());
        gen.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNotNull(gen.getOutputContext().getDupDetector());

        // Enabling duplicate detection again when already enabled does not throw or replace detector
        DupDetector existingDetector = gen.getOutputContext().getDupDetector();
        gen.enable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertSame(existingDetector, gen.getOutputContext().getDupDetector());

        // Enable standard non-derived feature
        gen.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testDisable_derivedFeatures_updatesStateProperly() {
        int initial = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask()
                | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()
                | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask()
                | JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask();
        TestGenerator gen = new TestGenerator(initial, null);

        gen.disable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
        Assert.assertFalse(gen._cfgNumbersAsStrings);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));

        gen.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        Assert.assertEquals(0, gen.getHighestNonEscapedChar());

        gen.disable(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION));
        Assert.assertNull(gen.getOutputContext().getDupDetector());

        gen.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testSetFeatureMask_changesAppliedCorrectly() {
        TestGenerator gen = new TestGenerator(0, null);

        int mask = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask()
                | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()
                | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        gen.setFeatureMask(mask);

        Assert.assertEquals(mask, gen.getFeatureMask());
        Assert.assertTrue(gen._cfgNumbersAsStrings);
        Assert.assertEquals(127, gen.getHighestNonEscapedChar());
        Assert.assertNotNull(gen.getOutputContext().getDupDetector());

        // Call again with same mask (changed == 0 branch)
        gen.setFeatureMask(mask);
        Assert.assertEquals(mask, gen.getFeatureMask());

        // Disable all features via setFeatureMask
        gen.setFeatureMask(0);
        Assert.assertEquals(0, gen.getFeatureMask());
        Assert.assertFalse(gen._cfgNumbersAsStrings);
        Assert.assertEquals(0, gen.getHighestNonEscapedChar());
        Assert.assertNull(gen.getOutputContext().getDupDetector());
    }

    @Test
    public void testOverrideStdFeatures_modifiesFeaturesProperly() {
        TestGenerator gen = new TestGenerator(0, null);

        int mask = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask() | JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask();
        gen.overrideStdFeatures(mask, mask);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS));
        Assert.assertEquals(127, gen.getHighestNonEscapedChar());

        // Override with no change (changed == 0 branch)
        gen.overrideStdFeatures(mask, mask);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));

        // Override only non-derived features
        int nonDerivedMask = JsonGenerator.Feature.AUTO_CLOSE_TARGET.getMask();
        gen.overrideStdFeatures(nonDerivedMask, nonDerivedMask);
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));

        // Disable ESCAPE_NON_ASCII via override
        gen.overrideStdFeatures(0, JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask());
        Assert.assertFalse(gen.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII));
        Assert.assertEquals(0, gen.getHighestNonEscapedChar());

        // Enable and disable STRICT_DUPLICATE_DETECTION via override
        int dupMask = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        gen.overrideStdFeatures(dupMask, dupMask);
        Assert.assertNotNull(gen.getOutputContext().getDupDetector());
        gen.overrideStdFeatures(0, dupMask);
        Assert.assertNull(gen.getOutputContext().getDupDetector());
    }

    @Test
    public void testUseDefaultPrettyPrinter_setsDefaultWhenNull_doesNotOverrideIfPresent() {
        TestGenerator gen = new TestGenerator(0, null);
        Assert.assertNull(gen.getPrettyPrinter());

        gen.useDefaultPrettyPrinter();
        PrettyPrinter pp = gen.getPrettyPrinter();
        Assert.assertNotNull(pp);
        Assert.assertTrue(pp instanceof DefaultPrettyPrinter);

        // Call again to verify no-op branch
        gen.useDefaultPrettyPrinter();
        Assert.assertSame(pp, gen.getPrettyPrinter());
    }

    @Test
    public void testSetAndGetCodec_normalAndNull() {
        TestGenerator gen = new TestGenerator(0, null);
        Assert.assertNull(gen.getCodec());

        DummyCodec codec = new DummyCodec();
        gen.setCodec(codec);
        Assert.assertSame(codec, gen.getCodec());

        gen.setCodec(null);
        Assert.assertNull(gen.getCodec());
    }

    @Test
    public void testWriteFieldName_serializableString_delegatesToString() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen.writeFieldName(new SerializedString("testField"));
        Assert.assertEquals("testField", gen.lastFieldName);
    }

    @Test
    public void testWriteString_serializableString_delegatesToString() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen.writeString(new SerializedString("testString"));
        Assert.assertEquals("testString", gen.lastString);
    }

    @Test
    public void testWriteRawValue_stringVariants_verifyAndWriteRaw() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);

        gen.writeRawValue("rawValue1");
        Assert.assertEquals("rawValue1", gen.lastRaw);
        Assert.assertTrue(gen.calls.contains("_verifyValueWrite:write raw value"));

        gen.writeRawValue("prefix_rawValue2_suffix", 7, 10);
        Assert.assertEquals("rawValue2_", gen.lastRaw);

        char[] chars = "prefix_rawValue3_suffix".toCharArray();
        gen.writeRawValue(chars, 7, 9);
        Assert.assertEquals("rawValue3", gen.lastRaw);

        gen.writeRawValue(new SerializedString("rawValue4"));
        Assert.assertEquals("rawValue4", gen.lastRaw);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWriteBinary_inputStream_throwsUnsupportedOperationException() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3});
        gen.writeBinary(Base64Variants.MIME, in, 3);
    }

    @Test
    public void testWriteObject_nullValue_callsWriteNull() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen.writeObject(null);
        Assert.assertTrue(gen.calls.contains("writeNull"));
    }

    @Test
    public void testWriteObject_withCodec_delegatesToCodec() throws IOException {
        DummyCodec codec = new DummyCodec();
        TestGenerator gen = new TestGenerator(0, codec);
        Object target = new Object();

        gen.writeObject(target);
        Assert.assertSame(target, codec.writtenObject);
    }

    @Test
    public void testWriteObject_withoutCodec_usesWriteSimpleObject() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);

        gen.writeObject("simple-string");
        Assert.assertEquals("simple-string", gen.lastString);

        gen.writeObject(Integer.valueOf(42));
        Assert.assertTrue(gen.calls.contains("writeNumber:42"));

        gen.writeObject(Boolean.TRUE);
        Assert.assertTrue(gen.calls.contains("writeBoolean:true"));
    }

    @Test
    public void testWriteTree_nullRoot_callsWriteNull() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen.writeTree(null);
        Assert.assertTrue(gen.calls.contains("writeNull"));
    }

    @Test
    public void testWriteTree_withCodec_delegatesToCodec() throws IOException {
        DummyCodec codec = new DummyCodec();
        TestGenerator gen = new TestGenerator(0, codec);
        DummyTreeNode node = new DummyTreeNode();

        gen.writeTree(node);
        Assert.assertSame(node, codec.writtenTree);
    }

    @Test(expected = IllegalStateException.class)
    public void testWriteTree_withoutCodec_throwsIllegalStateException() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        DummyTreeNode node = new DummyTreeNode();
        gen.writeTree(node);
    }

    @Test
    public void testCloseAndIsClosed_stateChanges() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        Assert.assertFalse(gen.isClosed());

        gen.close();
        Assert.assertTrue(gen.isClosed());
    }

    @Test
    public void testFlush_invokedSuccessfully() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen.flush();
        Assert.assertTrue(gen.calls.contains("flush"));
    }

    @Test
    public void testConstructDefaultPrettyPrinter_returnsNonNull() {
        TestGenerator gen = new TestGenerator(0, null);
        PrettyPrinter pp = gen._constructDefaultPrettyPrinter();
        Assert.assertNotNull(pp);
        Assert.assertTrue(pp instanceof DefaultPrettyPrinter);
    }

    @Test
    public void testAsString_bigDecimal_returnsString() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        BigDecimal bd = new BigDecimal("12345.67890");
        Assert.assertEquals("12345.67890", gen._asString(bd));
    }

    @Test
    public void testDecodeSurrogate_validPair_returnsCorrectCodePoint() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        // Minimum surrogate pair: 0xD800, 0xDC00 -> 0x10000
        int cp1 = gen._decodeSurrogate(0xD800, 0xDC00);
        Assert.assertEquals(0x10000, cp1);

        // Maximum surrogate pair: 0xDBFF, 0xDFFF -> 0x10FFFF
        int cp2 = gen._decodeSurrogate(0xDBFF, 0xDFFF);
        Assert.assertEquals(0x10FFFF, cp2);
    }

    @Test(expected = JsonGenerationException.class)
    public void testDecodeSurrogate_secondSurrogateTooLow_throwsJsonGenerationException() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen._decodeSurrogate(0xD800, 0xDBFF);
    }

    @Test(expected = JsonGenerationException.class)
    public void testDecodeSurrogate_secondSurrogateTooHigh_throwsJsonGenerationException() throws IOException {
        TestGenerator gen = new TestGenerator(0, null);
        gen._decodeSurrogate(0xD800, 0xE000);
    }
}
