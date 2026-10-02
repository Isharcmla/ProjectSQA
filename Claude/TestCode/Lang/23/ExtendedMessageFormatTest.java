package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ExtendedMessageFormatTest {

    /**
     * Simple custom Format implementation used for testing the registry
     * mechanism of ExtendedMessageFormat.
     */
    private static class SimpleFormat extends Format {
        private static final long serialVersionUID = 1L;
        private final String prefix;

        SimpleFormat(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            toAppendTo.append(prefix).append(obj);
            return toAppendTo;
        }

        @Override
        public Object parseObject(String source, ParsePosition pos) {
            return source;
        }
    }

    /**
     * Test FormatFactory implementation that registers a custom "upper" format.
     */
    private static class TestFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(String name, String args, Locale locale) {
            if ("upper".equals(name)) {
                return new SimpleFormat("UPPER:");
            }
            return null;
        }
    }

    private Map<String, FormatFactory> registry;

    @Before
    public void setUp() {
        registry = new HashMap<String, FormatFactory>();
        registry.put("upper", new TestFormatFactory());
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_withPatternOnly_createsInstance() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertNotNull(emf);
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testConstructor_withPatternAndLocale_createsInstance() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}", Locale.US);
        assertNotNull(emf);
        assertEquals(Locale.US, emf.getLocale());
    }

    @Test
    public void testConstructor_withPatternAndRegistry_createsInstance() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper}", registry);
        assertNotNull(emf);
    }

    @Test
    public void testConstructor_withPatternLocaleAndRegistry_createsInstance() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper}", Locale.US, registry);
        assertNotNull(emf);
        assertEquals(Locale.US, emf.getLocale());
    }

    @Test
    public void testConstructor_withNullRegistry_behavesLikeStandardMessageFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0}", Locale.US, null);
        assertEquals("Value: {0}", emf.toPattern());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_withNullPattern_throwsException() {
        new ExtendedMessageFormat(null);
    }

    // ---------- toPattern tests ----------

    @Test
    public void testToPattern_returnsOriginalPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}");
        assertEquals("Test {0}", emf.toPattern());
    }

    // ---------- applyPattern tests ----------

    @Test
    public void testApplyPattern_withNullRegistry_delegatesToSuper() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0}");
        assertEquals("Value: {0}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withRegistry_appliesCustomFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper}", registry);
        String result = emf.format(new Object[] { "test" });
        assertEquals("UPPER:test", result);
    }

    @Test
    public void testApplyPattern_withSimplePattern_noFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        String result = emf.format(new Object[] { "hello" });
        assertEquals("hello", result);
    }

    @Test
    public void testApplyPattern_withQuotedString() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{0}' literal", registry);
        assertNotNull(emf.toPattern());
    }

    @Test
    public void testApplyPattern_withEscapedQuote() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("It''s {0}", registry);
        String result = emf.format(new Object[] { "test" });
        assertTrue(result.contains("It's"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedFormatElement_throwsException() {
        new ExtendedMessageFormat("{0", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_invalidArgumentIndex_throwsException() {
        new ExtendedMessageFormat("{a}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unreadableFormatElement_throwsException() {
        new ExtendedMessageFormat("{0,upper", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_whitespaceThenInvalidChar_throwsException() {
        new ExtendedMessageFormat("{0 X}", registry);
    }

    @Test
    public void testApplyPattern_withLeadingWhitespaceInArgumentIndex_parsesCorrectly() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{ 0}", registry);
        String result = emf.format(new Object[] { "value" });
        assertEquals("value", result);
    }

    @Test
    public void testApplyPattern_withMultipleFormats() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper} and {1,upper}", registry);
        String result = emf.format(new Object[] { "a", "b" });
        assertTrue(result.contains("UPPER:a"));
        assertTrue(result.contains("UPPER:b"));
    }

    @Test
    public void testApplyPattern_mixedCustomAndStandardFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper} {1,number}", registry);
        String result = emf.format(new Object[] { "test", 5 });
        assertTrue(result.contains("UPPER:test"));
    }

    @Test
    public void testApplyPattern_withEmptyPattern_withRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("", registry);
        assertEquals("", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withEmptyPattern_withoutRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        assertEquals("", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withFormatStyle() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper,style1}", registry);
        String result = emf.format(new Object[] { "test" });
        assertEquals("UPPER:test", result);
    }

    @Test
    public void testApplyPattern_reapply_updatesPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        emf.applyPattern("{0,upper}");
        assertEquals("{0,upper}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withQuotedTextAndCustomFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'literal' {0,upper}", registry);
        String pattern = emf.toPattern();
        assertNotNull(pattern);
        assertTrue(pattern.contains("upper"));
    }

    @Test
    public void testApplyPattern_withUnknownFormatName_fallsBackToStandard() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,number}", registry);
        String result = emf.format(new Object[] { 5 });
        assertNotNull(result);
    }

    // ---------- setFormat* unsupported operation tests ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormat(0, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatByArgumentIndex(0, null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormats(new Format[] { null });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatsByArgumentIndex(new Format[] { null });
    }

    // ---------- format tests ----------

    @Test
    public void testFormat_withSimplePattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}!");
        String result = emf.format(new Object[] { "World" });
        assertEquals("Hello World!", result);
    }
}
