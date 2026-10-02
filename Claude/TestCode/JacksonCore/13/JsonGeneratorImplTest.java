package com.fasterxml.jackson.core.json;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

public class JsonGeneratorImplTest
{
    private JsonGeneratorImpl createGenerator(StringWriter sw) throws IOException
    {
        JsonFactory factory = new JsonFactory();
        return (JsonGeneratorImpl) factory.createGenerator(sw);
    }

    // ---------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------

    @Test
    public void testConstructor_escapeNonAsciiDisabled_maximumNonEscapedCharIsZero() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testConstructor_escapeNonAsciiEnabled_setsMaximumNonEscapedChar() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonFactory factory = new JsonFactory();
        factory.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        JsonGeneratorImpl gen = (JsonGeneratorImpl) factory.createGenerator(sw);
        assertEquals(127, gen.getHighestEscapedChar());
    }

    @Test
    public void testConstructor_defaultQuoteFieldNames_unqNamesIsFalse() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testConstructor_quoteFieldNamesDisabled_unqNamesIsTrue() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonFactory factory = new JsonFactory();
        factory.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        JsonGeneratorImpl gen = (JsonGeneratorImpl) factory.createGenerator(sw);
        assertTrue(gen._cfgUnqNames);
    }

    // ---------------------------------------------------------
    // enable() tests
    // ---------------------------------------------------------

    @Test
    public void testEnable_quoteFieldNamesFeature_setsUnqNamesFalse() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonFactory factory = new JsonFactory();
        factory.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        JsonGeneratorImpl gen = (JsonGeneratorImpl) factory.createGenerator(sw);
        assertTrue(gen._cfgUnqNames);

        gen.enable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertFalse(gen._cfgUnqNames);
    }

    @Test
    public void testEnable_otherFeature_unqNamesUnchanged() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        boolean before = gen._cfgUnqNames;
        gen.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        assertEquals(before, gen._cfgUnqNames);
    }

    // ---------------------------------------------------------
    // _checkStdFeatureChanges tested indirectly via disable()/configure()
    // ---------------------------------------------------------

    @Test
    public void testDisableQuoteFieldNames_viaInstance_setsUnqNamesTrue() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(gen._cfgUnqNames);
    }

    @Test
    public void testConfigureQuoteFieldNamesTrue_setsUnqNamesFalse() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.disable(JsonGenerator.Feature.QUOTE_FIELD_NAMES);
        assertTrue(gen._cfgUnqNames);

        gen.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        assertFalse(gen._cfgUnqNames);
    }

    // ---------------------------------------------------------
    // setHighestNonEscapedChar / getHighestEscapedChar
    // ---------------------------------------------------------

    @Test
    public void testSetHighestNonEscapedChar_positiveValue_setsValue() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.setHighestNonEscapedChar(200);
        assertEquals(200, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedChar_negativeValue_setsZero() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.setHighestNonEscapedChar(-10);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    @Test
    public void testSetHighestNonEscapedChar_zero_setsZero() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.setHighestNonEscapedChar(0);
        assertEquals(0, gen.getHighestEscapedChar());
    }

    // ---------------------------------------------------------
    // setCharacterEscapes / getCharacterEscapes
    // ---------------------------------------------------------

    @Test
    public void testGetCharacterEscapes_default_returnsNull() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        assertNull(gen.getCharacterEscapes());
    }

    @Test
    public void testSetCharacterEscapes_customEscapes_updatesOutputEscapesAndGetter() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());

        CharacterEscapes customEscapes = new CharacterEscapes()
        {
            private static final long serialVersionUID = 1L;

            @Override
            public int[] getEscapeCodesForAscii()
            {
                int[] escapes = CharacterEscapes.standardAsciiEscapesForJSON();
                escapes['a'] = CharacterEscapes.ESCAPE_STANDARD;
                return escapes;
            }

            @Override
            public SerializableString getEscapeSequence(int ch)
            {
                return null;
            }
        };

        gen.setCharacterEscapes(customEscapes);
        assertSame(customEscapes, gen.getCharacterEscapes());
        assertNotNull(gen._outputEscapes);
    }

    @Test
    public void testSetCharacterEscapes_null_revertsToDefaultEscapesAndGetterReturnsNull() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.setCharacterEscapes(null);
        assertNull(gen.getCharacterEscapes());
        assertNotNull(gen._outputEscapes);
    }

    // ---------------------------------------------------------
    // setRootValueSeparator
    // ---------------------------------------------------------

    @Test
    public void testSetRootValueSeparator_customSeparator_updatesField() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        SerializableString sep = new SerializedString("|");
        gen.setRootValueSeparator(sep);
        assertSame(sep, gen._rootValueSeparator);
    }

    @Test
    public void testSetRootValueSeparator_null_setsFieldNull() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        gen.setRootValueSeparator(null);
        assertNull(gen._rootValueSeparator);
    }

    // ---------------------------------------------------------
    // version()
    // ---------------------------------------------------------

    @Test
    public void testVersion_returnsNonNullVersion() throws IOException
    {
        JsonGeneratorImpl gen = createGenerator(new StringWriter());
        Version v = gen.version();
        assertNotNull(v);
    }

    // ---------------------------------------------------------
    // writeStringField()
    // ---------------------------------------------------------

    @Test
    public void testWriteStringField_normalInput_writesCorrectJson() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGeneratorImpl gen = createGenerator(sw);
        gen.writeStartObject();
        gen.writeStringField("name", "value");
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"name\":\"value\"}", sw.toString());
    }

    @Test
    public void testWriteStringField_emptyStringValue_writesEmptyString() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGeneratorImpl gen = createGenerator(sw);
        gen.writeStartObject();
        gen.writeStringField("key", "");
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"key\":\"\"}", sw.toString());
    }

    @Test
    public void testWriteStringField_nullValue_writesNullLiteral() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGeneratorImpl gen = createGenerator(sw);
        gen.writeStartObject();
        gen.writeStringField("key", null);
        gen.writeEndObject();
        gen.close();
        assertEquals("{\"key\":null}", sw.toString());
    }

    @Test(expected = Exception.class)
    public void testWriteStringField_nullFieldName_throwsException() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGeneratorImpl gen = createGenerator(sw);
        gen.writeStartObject();
        gen.writeStringField(null, "value");
    }

    @Test(expected = IOException.class)
    public void testWriteStringField_afterClose_throwsIOException() throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGeneratorImpl gen = createGenerator(sw);
        gen.close();
        gen.writeStringField("key", "value");
    }
}
