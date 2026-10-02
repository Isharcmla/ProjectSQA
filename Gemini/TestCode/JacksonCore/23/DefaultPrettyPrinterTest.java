package com.fasterxml.jackson.core.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.io.SerializedString;

public class DefaultPrettyPrinterTest {

    private final JsonFactory jsonFactory = new JsonFactory();

    @Test
    public void testDefaultConstructor_defaultState_configuredProperly() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Assert.assertNotNull(pp._arrayIndenter);
        Assert.assertTrue(pp._arrayIndenter instanceof DefaultPrettyPrinter.FixedSpaceIndenter);
        Assert.assertNotNull(pp._objectIndenter);
        Assert.assertTrue(pp._spacesInObjectEntries);
        Assert.assertEquals(DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, pp._rootSeparator);
    }

    @Test
    public void testConstructor_stringRootSeparator_configuredProperly() {
        DefaultPrettyPrinter ppNonNull = new DefaultPrettyPrinter("\n");
        Assert.assertEquals("\n", ppNonNull._rootSeparator.getValue());

        DefaultPrettyPrinter ppNull = new DefaultPrettyPrinter((String) null);
        Assert.assertNull(ppNull._rootSeparator);
    }

    @Test
    public void testConstructor_serializableStringRootSeparator_configuredProperly() {
        SerializedString separator = new SerializedString("||");
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(separator);
        Assert.assertSame(separator, pp._rootSeparator);
    }

    @Test
    public void testCopyConstructor_baseInstance_clonedCorrectly() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        base.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
        base.indentObjectsWith(DefaultPrettyPrinter.FixedSpaceIndenter.instance);
        base._nesting = 2;

        DefaultPrettyPrinter copy = new DefaultPrettyPrinter(base);
        Assert.assertSame(DefaultPrettyPrinter.NopIndenter.instance, copy._arrayIndenter);
        Assert.assertSame(DefaultPrettyPrinter.FixedSpaceIndenter.instance, copy._objectIndenter);
        Assert.assertEquals(2, copy._nesting);
        Assert.assertEquals(base._rootSeparator, copy._rootSeparator);
    }

    @Test
    public void testWithRootSeparator_serializableString_returnsExpectedInstance() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        
        Assert.assertSame(base, base.withRootSeparator(DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));

        SerializedString equalRootSep = new SerializedString(" ");
        Assert.assertSame(base, base.withRootSeparator(equalRootSep));

        SerializedString diffRootSep = new SerializedString("\t");
        DefaultPrettyPrinter modified = base.withRootSeparator(diffRootSep);
        Assert.assertNotSame(base, modified);
        Assert.assertSame(diffRootSep, modified._rootSeparator);

        DefaultPrettyPrinter nullSeparatorPp = base.withRootSeparator((SerializedString) null);
        Assert.assertNotSame(base, nullSeparatorPp);
        Assert.assertNull(nullSeparatorPp._rootSeparator);
        Assert.assertSame(nullSeparatorPp, nullSeparatorPp.withRootSeparator((SerializedString) null));
    }

    @Test
    public void testWithRootSeparator_string_returnsExpectedInstance() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();

        DefaultPrettyPrinter modifiedString = base.withRootSeparator("\r\n");
        Assert.assertNotSame(base, modifiedString);
        Assert.assertEquals("\r\n", modifiedString._rootSeparator.getValue());

        DefaultPrettyPrinter nullStringPp = base.withRootSeparator((String) null);
        Assert.assertNotSame(base, nullStringPp);
        Assert.assertNull(nullStringPp._rootSeparator);
    }

    @Test
    public void testIndentArraysWith_validAndNullIndenter_configuredCorrectly() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        
        pp.indentArraysWith(null);
        Assert.assertSame(DefaultPrettyPrinter.NopIndenter.instance, pp._arrayIndenter);

        DefaultPrettyPrinter.FixedSpaceIndenter fixed = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        pp.indentArraysWith(fixed);
        Assert.assertSame(fixed, pp._arrayIndenter);
    }

    @Test
    public void testIndentObjectsWith_validAndNullIndenter_configuredCorrectly() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();

        pp.indentObjectsWith(null);
        Assert.assertSame(DefaultPrettyPrinter.NopIndenter.instance, pp._objectIndenter);

        DefaultPrettyPrinter.FixedSpaceIndenter fixed = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        pp.indentObjectsWith(fixed);
        Assert.assertSame(fixed, pp._objectIndenter);
    }

    @Test
    public void testWithArrayIndenter_variousIndenters_mutatesCorrectly() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        
        Assert.assertSame(base, base.withArrayIndenter(DefaultPrettyPrinter.FixedSpaceIndenter.instance));

        DefaultPrettyPrinter modified = base.withArrayIndenter(DefaultPrettyPrinter.NopIndenter.instance);
        Assert.assertNotSame(base, modified);
        Assert.assertSame(DefaultPrettyPrinter.NopIndenter.instance, modified._arrayIndenter);

        DefaultPrettyPrinter withNull = base.withArrayIndenter(null);
        Assert.assertNotSame(base, withNull);
        Assert.assertSame(DefaultPrettyPrinter.NopIndenter.instance, withNull._arrayIndenter);
    }

    @Test
    public void testWithObjectIndenter_variousIndenters_mutatesCorrectly() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();

        Assert.assertSame(base, base.withObjectIndenter(base._objectIndenter));

        DefaultPrettyPrinter modified = base.withObjectIndenter(DefaultPrettyPrinter.NopIndenter.instance);
        Assert.assertNotSame(base, modified);
        Assert.assertSame(DefaultPrettyPrinter.NopIndenter.instance, modified._objectIndenter);

        DefaultPrettyPrinter withNull = modified.withObjectIndenter(null);
        Assert.assertSame(modified, withNull);
    }

    @Test
    public void testWithSpacesInObjectEntries_andWithoutSpaces_mutatesCorrectly() {
        DefaultPrettyPrinter base = new DefaultPrettyPrinter();
        Assert.assertTrue(base._spacesInObjectEntries);
        Assert.assertSame(base, base.withSpacesInObjectEntries());

        DefaultPrettyPrinter noSpaces = base.withoutSpacesInObjectEntries();
        Assert.assertNotSame(base, noSpaces);
        Assert.assertFalse(noSpaces._spacesInObjectEntries);
        Assert.assertSame(noSpaces, noSpaces.withoutSpacesInObjectEntries());

        DefaultPrettyPrinter withSpacesAgain = noSpaces.withSpacesInObjectEntries();
        Assert.assertNotSame(noSpaces, withSpacesAgain);
        Assert.assertTrue(withSpacesAgain._spacesInObjectEntries);
    }

    @Test
    public void testWithSeparators_customSeparators_applied() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        Separators custom = Separators.createDefaultInstance()
                .withObjectFieldValueSeparator(':')
                .withObjectEntrySeparator(';')
                .withArrayValueSeparator('|');
        
        DefaultPrettyPrinter returned = pp.withSeparators(custom);
        Assert.assertSame(pp, returned);
        Assert.assertEquals(" : ", pp._objectFieldValueSeparatorWithSpaces);

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        pp.writeObjectEntrySeparator(g);
        pp.writeArrayValueSeparator(g);
        g.flush();
        Assert.assertTrue(sw.toString().contains(";"));
        Assert.assertTrue(sw.toString().contains("|"));
    }

    @Test
    public void testCreateInstance_createsNewCopy() {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        DefaultPrettyPrinter copy = pp.createInstance();
        Assert.assertNotSame(pp, copy);
        Assert.assertSame(pp._arrayIndenter, copy._arrayIndenter);
        Assert.assertSame(pp._objectIndenter, copy._objectIndenter);
    }

    @Test
    public void testWriteRootValueSeparator_nonNullAndNull_writesProperly() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        
        pp.writeRootValueSeparator(g);
        g.flush();
        Assert.assertEquals(" ", sw.toString());

        DefaultPrettyPrinter ppNull = pp.withRootSeparator((SerializableString) null);
        sw = new StringWriter();
        g = jsonFactory.createGenerator(sw);
        ppNull.writeRootValueSeparator(g);
        g.flush();
        Assert.assertEquals("", sw.toString());
    }

    @Test
    public void testObjectLifecycle_nonInlineIndenter_generatesCorrectOutput() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);

        pp.writeStartObject(g);
        Assert.assertEquals(1, pp._nesting);

        pp.beforeObjectEntries(g);
        pp.writeObjectFieldValueSeparator(g);
        pp.writeObjectEntrySeparator(g);

        pp.writeEndObject(g, 1);
        Assert.assertEquals(0, pp._nesting);
        g.flush();

        String out = sw.toString();
        Assert.assertTrue(out.startsWith("{"));
        Assert.assertTrue(out.endsWith("}"));
        Assert.assertTrue(out.contains(" : "));
    }

    @Test
    public void testObjectLifecycle_inlineIndenter_emptyAndNonEmpty() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter()
                .withObjectIndenter(DefaultPrettyPrinter.FixedSpaceIndenter.instance)
                .withoutSpacesInObjectEntries();

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);

        pp.writeStartObject(g);
        Assert.assertEquals(0, pp._nesting);

        pp.writeObjectFieldValueSeparator(g);
        pp.writeEndObject(g, 0);
        g.flush();

        String out = sw.toString();
        Assert.assertEquals("{: }", out);
    }

    @Test
    public void testArrayLifecycle_inlineIndenter_emptyAndNonEmpty() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter();

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);

        pp.writeStartArray(g);
        Assert.assertEquals(0, pp._nesting);

        pp.beforeArrayValues(g);
        pp.writeArrayValueSeparator(g);
        pp.writeEndArray(g, 0);
        g.flush();

        String out = sw.toString();
        Assert.assertEquals("[  ]", out);
    }

    @Test
    public void testArrayLifecycle_nonInlineIndenter_nonEmpty() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter()
                .withArrayIndenter(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);

        pp.writeStartArray(g);
        Assert.assertEquals(1, pp._nesting);

        pp.beforeArrayValues(g);
        pp.writeArrayValueSeparator(g);
        pp.writeEndArray(g, 2);
        Assert.assertEquals(0, pp._nesting);
        g.flush();

        String out = sw.toString();
        Assert.assertTrue(out.startsWith("["));
        Assert.assertTrue(out.endsWith("]"));
    }

    @Test
    public void testNopIndenter_methods_behaveCorrectly() throws Exception {
        DefaultPrettyPrinter.NopIndenter indenter = DefaultPrettyPrinter.NopIndenter.instance;
        Assert.assertTrue(indenter.isInline());

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        indenter.writeIndentation(g, 5);
        g.flush();
        Assert.assertEquals("", sw.toString());
    }

    @Test
    public void testFixedSpaceIndenter_methods_behaveCorrectly() throws Exception {
        DefaultPrettyPrinter.FixedSpaceIndenter indenter = DefaultPrettyPrinter.FixedSpaceIndenter.instance;
        Assert.assertTrue(indenter.isInline());

        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        indenter.writeIndentation(g, 5);
        g.flush();
        Assert.assertEquals(" ", sw.toString());
    }

    @Test
    public void testSerialization_roundTrip_preservesConfiguration() throws Exception {
        DefaultPrettyPrinter pp = new DefaultPrettyPrinter(";;");
        pp.indentArraysWith(DefaultPrettyPrinter.NopIndenter.instance);
        pp.withoutSpacesInObjectEntries();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(pp);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DefaultPrettyPrinter deserialized = (DefaultPrettyPrinter) ois.readObject();

        Assert.assertNotNull(deserialized);
        Assert.assertEquals(";;", deserialized._rootSeparator.getValue());
        Assert.assertFalse(deserialized._spacesInObjectEntries);
        Assert.assertTrue(deserialized._arrayIndenter instanceof DefaultPrettyPrinter.NopIndenter);
    }

    @Test
    public void testFullJsonGeneration_integration() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator g = jsonFactory.createGenerator(sw);
        g.setPrettyPrinter(new DefaultPrettyPrinter());

        g.writeStartObject();
        g.writeFieldName("array");
        g.writeStartArray();
        g.writeNumber(1);
        g.writeNumber(2);
        g.writeEndArray();
        g.writeFieldName("emptyArray");
        g.writeStartArray();
        g.writeEndArray();
        g.writeFieldName("emptyObject");
        g.writeStartObject();
        g.writeEndObject();
        g.writeEndObject();
        g.close();

        String result = sw.toString();
        Assert.assertTrue(result.contains("\"array\" : [ 1, 2 ]"));
        Assert.assertTrue(result.contains("\"emptyArray\" : [ ]"));
        Assert.assertTrue(result.contains("\"emptyObject\" : { }"));
    }
}
