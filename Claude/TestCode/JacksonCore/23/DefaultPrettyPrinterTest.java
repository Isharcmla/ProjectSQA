package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;

public class DefaultPrettyPrinterTest
{
    private static final String NL = System.lineSeparator();

    /* Helper Writer that always throws IOException on write,
       used to trigger exception path of the pretty printer methods. */
    static class ThrowingWriter extends Writer
    {
        @Override
        public void write(char[] cbuf, int off, int len) throws IOException {
            throw new IOException("boom");
        }
        @Override
        public void flush() throws IOException { }
        @Override
        public void close() throws IOException { }
    }

    private JsonGenerator createGenerator(StringWriter sw) throws IOException {
        JsonFactory f = new JsonFactory();
        return f.createGenerator(sw);
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor_typical_producesUsableInstance() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        assertNotNull(pp);
    }

    @Test
    public void testStringConstructor_normal_setsRootSeparator() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(";");
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("1;2", sw.toString());
    }

    @Test
    public void testStringConstructor_null_noSeparator() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter((String) null);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("12", sw.toString());
    }

    @Test
    public void testSerializableStringConstructor_normal_worksCorrectly() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(new SerializedString("-"));
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("1-2", sw.toString());
    }

    @Test
    public void testCopyConstructor_base_copiesFields() throws Exception {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base);
        assertNotSame(base, copy);
        // functional equivalence check
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(copy);
        g.writeStartObject();
        g.writeEndObject();
        g.close();
        assertEquals("{ }", sw.toString());
    }

    @Test
    public void testCopyConstructorWithSeparator_normal_usesGivenSeparator() throws Exception {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(base, new SerializedString("|"));
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("1|2", sw.toString());
    }

    // ---------------------------------------------------------------
    // withRootSeparator
    // ---------------------------------------------------------------

    @Test
    public void testWithRootSeparator_sameSerializedString_returnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withRootSeparator(new SerializedString(" "));
        assertSame(pp, pp2);
    }

    @Test
    public void testWithRootSeparator_differentString_returnsNewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withRootSeparator("###");
        assertNotSame(pp, pp2);
    }

    @Test
    public void testWithRootSeparator_null_returnsNewInstanceWithNoSeparator() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withRootSeparator((String) null);
        assertNotSame(pp, pp2);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp2);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("12", sw.toString());
    }

    // ---------------------------------------------------------------
    // indentArraysWith / indentObjectsWith
    // ---------------------------------------------------------------

    @Test
    public void testIndentArraysWith_null_usesNopIndenter() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(null);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.close();
        assertEquals("[1,2]", sw.toString());
    }

    @Test
    public void testIndentArraysWith_nonNull_usesGivenIndenter() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentArraysWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartArray();
        g.writeNumber(1);
        g.writeEndArray();
        g.close();
        assertEquals("[ 1 ]", sw.toString());
    }

    @Test
    public void testIndentObjectsWith_null_usesNopIndenter() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(null);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{\"a\" : 1}", sw.toString());
    }

    @Test
    public void testIndentObjectsWith_fixedSpaceIndenter_producesInlineOutput() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        pp.indentObjectsWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{ \"a\" : 1 }", sw.toString());
    }

    // ---------------------------------------------------------------
    // withArrayIndenter / withObjectIndenter
    // ---------------------------------------------------------------

    @Test
    public void testWithArrayIndenter_sameIndenter_returnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        assertSame(pp, pp2);
    }

    @Test
    public void testWithArrayIndenter_differentIndenter_returnsNewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(DefaultPrettyPrinter.NopIndenter.instance);
        assertNotSame(pp, pp2);
    }

    @Test
    public void testWithArrayIndenter_null_usesNopIndenter() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withArrayIndenter(null);
        assertNotSame(pp, pp2);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp2);
        g.writeStartArray();
        g.writeNumber(1);
        g.writeEndArray();
        g.close();
        assertEquals("[1]", sw.toString());
    }

    @Test
    public void testWithObjectIndenter_sameIndenter_returnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withObjectIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        assertSame(pp, pp2);
    }

    @Test
    public void testWithObjectIndenter_differentIndenter_returnsNewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withObjectIndenter(DefaultPrettyPrinter.NopIndenter.instance);
        assertNotSame(pp, pp2);
    }

    @Test
    public void testWithObjectIndenter_null_usesNopIndenter() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withObjectIndenter(null);
        assertNotSame(pp, pp2);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp2);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{\"a\" : 1}", sw.toString());
    }

    // ---------------------------------------------------------------
    // withSpacesInObjectEntries / withoutSpacesInObjectEntries
    // ---------------------------------------------------------------

    @Test
    public void testWithSpacesInObjectEntries_alreadyTrue_returnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withSpacesInObjectEntries();
        assertSame(pp, pp2);
    }

    @Test
    public void testWithoutSpacesInObjectEntries_normal_returnsNewInstanceAndDisablesSpaces() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.withoutSpacesInObjectEntries();
        assertNotSame(pp, pp2);

        pp2.indentObjectsWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp2);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{ \"a\":1 }", sw.toString());
    }

    @Test
    public void testWithoutSpacesInObjectEntries_alreadyFalse_returnsSameInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withoutSpacesInObjectEntries();
        DefaultPrettyPrinter pp2 = pp.withoutSpacesInObjectEntries();
        assertSame(pp, pp2);
    }

    // ---------------------------------------------------------------
    // withSeparators
    // ---------------------------------------------------------------

    @Test
    public void testWithSeparators_customSeparators_appliedCorrectly() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Separators separators = new Separators('=', ';', '|');
        pp.withSeparators(separators);
        pp.indentObjectsWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);

        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeFieldName("b");
        g.writeNumber(2);
        g.writeEndObject();
        g.close();
        assertEquals("{ \"a\" = 1; \"b\" = 2 }", sw.toString());
    }

    @Test
    public void testWithSeparators_withoutSpaces_usesRawSeparator() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter().withoutSpacesInObjectEntries();
        Separators separators = new Separators('=', ';', '|');
        pp.withSeparators(separators);
        pp.indentObjectsWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);

        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeEndObject();
        g.close();
        assertEquals("{ \"a\"=1 }", sw.toString());
    }

    // ---------------------------------------------------------------
    // createInstance
    // ---------------------------------------------------------------

    @Test
    public void testCreateInstance_normal_returnsNewInstance() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter pp2 = pp.createInstance();
        assertNotSame(pp, pp2);
        assertTrue(pp2 instanceof DefaultPrettyPrinter);
    }

    // ---------------------------------------------------------------
    // writeRootValueSeparator
    // ---------------------------------------------------------------

    @Test
    public void testWriteRootValueSeparator_defaultSeparator_writesSpace() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeNumber(1);
        g.writeNumber(2);
        g.close();
        assertEquals("1 2", sw.toString());
    }

    // ---------------------------------------------------------------
    // writeStartObject / beforeObjectEntries / writeObjectFieldValueSeparator
    // writeObjectEntrySeparator / writeEndObject
    // ---------------------------------------------------------------

    @Test
    public void testObjectWriting_typicalTwoFields_producesPrettyOutput() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("a");
        g.writeNumber(1);
        g.writeFieldName("b");
        g.writeNumber(2);
        g.writeEndObject();
        g.close();

        String expected = "{" + NL + "  \"a\" : 1," + NL + "  \"b\" : 2" + NL + "}";
        assertEquals(expected, sw.toString());
    }

    @Test
    public void testObjectWriting_emptyObject_writesSpaceInsteadOfIndentation() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeEndObject();
        g.close();
        assertEquals("{ }", sw.toString());
    }

    @Test
    public void testObjectWriting_nestedObjects_increasesNestingLevel() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("outer");
        g.writeStartObject();
        g.writeFieldName("inner");
        g.writeNumber(1);
        g.writeEndObject();
        g.writeEndObject();
        g.close();

        String expected = "{" + NL + "  \"outer\" : {" + NL + "    \"inner\" : 1" + NL + "  }" + NL + "}";
        assertEquals(expected, sw.toString());
    }

    // ---------------------------------------------------------------
    // writeStartArray / beforeArrayValues / writeArrayValueSeparator / writeEndArray
    // ---------------------------------------------------------------

    @Test
    public void testArrayWriting_typicalTwoValues_producesInlineOutput() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.close();
        assertEquals("[ 1, 2 ]", sw.toString());
    }

    @Test
    public void testArrayWriting_emptyArray_writesSpaceInsteadOfIndentation() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartArray();
        g.writeEndArray();
        g.close();
        assertEquals("[ ]", sw.toString());
    }

    @Test
    public void testArrayWriting_nestedArrayInObject_worksCorrectly() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.writeFieldName("arr");
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.writeEndObject();
        g.close();

        String expected = "{" + NL + "  \"arr\" : [ 1, 2 ]" + NL + "}";
        assertEquals(expected, sw.toString());
    }

    // ---------------------------------------------------------------
    // NopIndenter / FixedSpaceIndenter helper classes
    // ---------------------------------------------------------------

    @Test
    public void testNopIndenter_isInline_returnsTrue() {
        assertTrue(DefaultPrettyPrinter.NopIndenter.instance.isInline());
    }

    @Test
    public void testNopIndenter_writeIndentation_doesNothing() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        DefaultPrettyPrinter.NopIndenter.instance.writeIndentation(g, 5);
        g.close();
        assertEquals("", sw.toString());
    }

    @Test
    public void testFixedSpaceIndenter_isInline_returnsTrue() {
        assertTrue(DefaultPrettyPrinter.FixedSpaceIndenter.instance.isInline());
    }

    @Test
    public void testFixedSpaceIndenter_writeIndentation_writesSingleSpace() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator g = createGenerator(sw);
        g.writeStartArray();
        DefaultPrettyPrinter.FixedSpaceIndenter.instance.writeIndentation(g, 3);
        g.writeEndArray();
        g.close();
        assertEquals("[ ]", sw.toString());
    }

    // ---------------------------------------------------------------
    // Exception scenario
    // ---------------------------------------------------------------

    @Test(expected = IOException.class)
    public void testWriteStartObject_underlyingWriterThrows_throwsIOException() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        JsonFactory f = new JsonFactory();
        JsonGenerator g = f.createGenerator(new ThrowingWriter());
        g.setPrettyPrinter(pp);
        g.writeStartObject();
        g.flush();
    }
}
