package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.BufferRecycler;

public class JsonGeneratorImplTest {

    private static class ConcreteJsonGeneratorImpl extends JsonGeneratorImpl {
        public String lastFieldName;
        public String lastStringValue;

        public ConcreteJsonGeneratorImpl(IOContext ctxt, int features, ObjectCodec codec) {
            super(ctxt, features, codec);
        }

        public boolean isUnqNames() {
            return _cfgUnqNames;
        }

        public int[] getOutputEscapes() {
            return _outputEscapes;
        }

        public SerializableString getRootValueSeparator() {
            return _rootValueSeparator;
        }

        public void callCheckStdFeatureChanges(int newFeatureFlags, int changedFeatures) {
            _checkStdFeatureChanges(newFeatureFlags, changedFeatures);
        }

        @Override
        public void writeFieldName(String name) throws IOException {
            this.lastFieldName = name;
        }

        @Override
        public void writeString(String text) throws IOException {
            this.lastStringValue = text;
        }

        @Override
        public void writeStartArray() throws IOException {}

        @Override
        public void writeEndArray() throws IOException {}

        @Override
        public void writeStartObject() throws IOException {}

        @Override
        public void writeEndObject() throws IOException {}

        @Override
        public void writeString(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}

        @Override
        public void writeUTF8String(byte[] text, int offset, int length) throws IOException {}

        @Override
        public void writeRaw(String text) throws IOException {}

        @Override
        public void writeRaw(String text, int offset, int len) throws IOException {}

        @Override
        public void writeRaw(char[] text, int offset, int len) throws IOException {}

        @Override
        public void writeRaw(char c) throws IOException {}

        @Override
        public void writeBinary(Base64Variant bv, byte[] data, int offset, int len) throws IOException {}

        @Override
        public int writeBinary(Base64Variant bv, InputStream data, int dataLength) throws IOException {
            return 0;
        }

        @Override
        public void writeNumber(int v) throws IOException {}

        @Override
        public void writeNumber(long v) throws IOException {}

        @Override
        public void writeNumber(BigInteger v) throws IOException {}

        @Override
        public void writeNumber(double v) throws IOException {}

        @Override
        public void writeNumber(float v) throws IOException {}

        @Override
        public void writeNumber(BigDecimal v) throws IOException {}

        @Override
        public void writeNumber(String encodedValue) throws IOException {}

        @Override
        public void writeBoolean(boolean state) throws IOException {}

        @Override
        public void writeNull() throws IOException {}

        @Override
        public void flush() throws IOException {}

        @Override
        protected void _releaseBuffers() {}

        @Override
        protected void _verifyValueWrite(String typeMsg) throws IOException {}
    }

    private static class CustomCharacterEscapes extends CharacterEscapes {
        private final int[] asciiEscapes = CharacterEscapes.standardAsciiEscapesForJSON();

        @Override
        public int[] getEscapeCodesForAscii() {
            return asciiEscapes;
        }

        @Override
        public SerializableString getEscapeSequence(int ch) {
            return null;
        }
    }

    private IOContext createIOContext() {
        return new IOContext(new BufferRecycler(), ContentReference.rawReference("test"), false);
    }

    @Test
    public void testConstructor_withEscapeNonAsciiEnabled_shouldSetMaximumNonEscapedCharTo127() {
        int features = JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask() | JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), features, null);

        Assert.assertEquals(127, gen.getHighestEscapedChar());
        Assert.assertFalse(gen.isUnqNames());
    }

    @Test
    public void testConstructor_withEscapeNonAsciiDisabledAndQuoteFieldNamesDisabled_shouldSetDefaults() {
        int features = 0; // QUOTE_FIELD_NAMES disabled, ESCAPE_NON_ASCII disabled
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), features, null);

        Assert.assertEquals(0, gen.getHighestEscapedChar());
        Assert.assertTrue(gen.isUnqNames());
    }

    @Test
    public void testEnable_quoteFieldNamesFeature_shouldSetCfgUnqNamesToFalse() {
        int features = 0; // QUOTE_FIELD_NAMES initially disabled
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), features, null);
        Assert.assertTrue(gen.isUnqNames());

        JsonGenerator returnedGen = gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        Assert.assertSame(gen, returnedGen);
        Assert.assertFalse(gen.isUnqNames());
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES));
    }

    @Test
    public void testEnable_otherFeature_shouldEnableFeatureWithoutAffectingCfgUnqNames() {
        int features = 0;
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), features, null);
        Assert.assertTrue(gen.isUnqNames());

        JsonGenerator returnedGen = gen.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        Assert.assertSame(gen, returnedGen);
        Assert.assertTrue(gen.isUnqNames());
        Assert.assertTrue(gen.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testCheckStdFeatureChanges_togglingQuoteFieldNames_shouldUpdateCfgUnqNames() {
        int initialFeatures = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), initialFeatures, null);
        Assert.assertFalse(gen.isUnqNames());

        // Change feature flags to remove QUOTE_FIELD_NAMES
        int newFeatures = 0;
        int changedFeatures = JsonGenerator.Feature.QUOTE_FIELD_NAMES.getMask();
        gen.callCheckStdFeatureChanges(newFeatures, changedFeatures);
        Assert.assertTrue(gen.isUnqNames());

        // Change feature flags back to enable QUOTE_FIELD_NAMES
        gen.callCheckStdFeatureChanges(initialFeatures, changedFeatures);
        Assert.assertFalse(gen.isUnqNames());
    }

    @Test
    public void testSetHighestNonEscapedChar_positiveValue_shouldSetExactValue() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        JsonGenerator returnedGen = gen.setHighestNonEscapedChar(255);
        Assert.assertSame(gen, returnedGen);
        Assert.assertEquals(255, gen.getHighestEscapedChar());

        gen.setHighestNonEscapedChar(65535);
        Assert.assertEquals(65535, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedChar_zeroValue_shouldSetZero() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        gen.setHighestNonEscapedChar(0);
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedChar_negativeValue_shouldSetZero() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        gen.setHighestNonEscapedChar(-1);
        Assert.assertEquals(0, gen.getHighestEscapedChar());

        gen.setHighestNonEscapedChar(-100);
        Assert.assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetCharacterEscapes_withCustomEscapes_shouldUpdateEscapesAndGetter() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);
        CustomCharacterEscapes customEscapes = new CustomCharacterEscapes();

        JsonGenerator returnedGen = gen.setCharacterEscapes(customEscapes);
        Assert.assertSame(gen, returnedGen);
        Assert.assertSame(customEscapes, gen.getCharacterEscapes());
        Assert.assertSame(customEscapes.getEscapeCodesForAscii(), gen.getOutputEscapes());
    }

    @Test
    public void testSetCharacterEscapes_withNull_shouldRevertToDefaultEscapes() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);
        CustomCharacterEscapes customEscapes = new CustomCharacterEscapes();
        gen.setCharacterEscapes(customEscapes);

        JsonGenerator returnedGen = gen.setCharacterEscapes(null);
        Assert.assertSame(gen, returnedGen);
        Assert.assertNull(gen.getCharacterEscapes());
        Assert.assertSame(JsonGeneratorImpl.sOutputEscapes, gen.getOutputEscapes());
    }

    @Test
    public void testSetRootValueSeparator_validSeparator_shouldSetSeparator() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);
        SerializableString separator = new SerializedString("/");

        JsonGenerator returnedGen = gen.setRootValueSeparator(separator);
        Assert.assertSame(gen, returnedGen);
        Assert.assertSame(separator, gen.getRootValueSeparator());
    }

    @Test
    public void testSetRootValueSeparator_nullSeparator_shouldSetNull() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        JsonGenerator returnedGen = gen.setRootValueSeparator(null);
        Assert.assertSame(gen, returnedGen);
        Assert.assertNull(gen.getRootValueSeparator());
    }

    @Test
    public void testVersion_shouldReturnNonNullVersion() {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);
        Version version = gen.version();

        Assert.assertNotNull(version);
        Assert.assertFalse(version.isUnknownVersion());
    }

    @Test
    public void testWriteStringField_normalStrings_shouldDelegateToWriteFieldNameAndWriteString() throws IOException {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        gen.writeStringField("fieldName", "stringValue");
        Assert.assertEquals("fieldName", gen.lastFieldName);
        Assert.assertEquals("stringValue", gen.lastStringValue);
    }

    @Test
    public void testWriteStringField_emptyStrings_shouldDelegateToWriteFieldNameAndWriteString() throws IOException {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        gen.writeStringField("", "");
        Assert.assertEquals("", gen.lastFieldName);
        Assert.assertEquals("", gen.lastStringValue);
    }

    @Test
    public void testWriteStringField_nullValues_shouldDelegateToWriteFieldNameAndWriteString() throws IOException {
        ConcreteJsonGeneratorImpl gen = new ConcreteJsonGeneratorImpl(createIOContext(), 0, null);

        gen.writeStringField(null, null);
        Assert.assertNull(gen.lastFieldName);
        Assert.assertNull(gen.lastStringValue);
    }
}
