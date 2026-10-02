import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.text.Format;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ExtendedMessageFormatTest {

    // Simple custom Format implementation: reverses the string representation of the object
    private static class ReverseFormat extends Format {
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            String s = obj == null ? "" : obj.toString();
            return toAppendTo.append(new StringBuffer(s).reverse().toString());
        }
        public Object parseObject(String source, ParsePosition pos) {
            return source;
        }
    }

    // FormatFactory implementation that always returns a ReverseFormat
    private static class ReverseFormatFactory implements FormatFactory {
        public String lastArgs;
        public String lastName;
        public Format getFormat(String name, String args, Locale locale) {
            this.lastName = name;
            this.lastArgs = args;
            return new ReverseFormat();
        }
    }

    // FormatFactory implementation that returns null (simulate "format not found")
    private static class NullFormatFactory implements FormatFactory {
        public Format getFormat(String name, String args, Locale locale) {
            return null;
        }
    }

    private Map registry;

    @Before
    public void setUp() {
        registry = new HashMap();
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_patternOnly_normal() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}!");
        assertEquals("Hello {0}!", emf.toPattern());
    }

    @Test
    public void testConstructor_patternAndLocale_normal() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}!", Locale.US);
        assertEquals("Hello {0}!", emf.toPattern());
        assertEquals(Locale.US, emf.getLocale());
    }

    @Test
    public void testConstructor_patternAndRegistry_normal() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        assertEquals("{0}", emf.toPattern());
    }

    @Test
    public void testConstructor_patternLocaleAndRegistry_normal() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", Locale.US, registry);
        assertEquals("{0}", emf.toPattern());
        assertEquals(Locale.US, emf.getLocale());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullPattern_throwsException() {
        new ExtendedMessageFormat(null);
    }

    // ---------- toPattern tests ----------

    @Test
    public void testToPattern_withoutRegistry_returnsStandardPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0}");
        assertEquals("Value: {0}", emf.toPattern());
    }

    @Test
    public void testToPattern_withRegistry_customFormat_returnsReinsertedPattern() {
        ReverseFormatFactory factory = new ReverseFormatFactory();
        registry.put("reverse", factory);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,reverse}", registry);
        assertEquals("{0,reverse}", emf.toPattern());
    }

    // ---------- applyPattern tests ----------

    @Test
    public void testApplyPattern_withoutRegistry_simplePattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.applyPattern("New {0} pattern");
        assertEquals("New {0} pattern", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withRegistry_customFormatApplied() {
        ReverseFormatFactory factory = new ReverseFormatFactory();
        registry.put("reverse", factory);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,reverse}", registry);
        String result = emf.format(new Object[]{"abc"});
        assertEquals("cba", result);
    }

    @Test
    public void testApplyPattern_withRegistry_formatNotFound_fallsBackToStandard() {
        // registry is empty, "number" is not registered, falls back to standard MessageFormat handling
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,number,integer}", registry);
        String result = emf.format(new Object[]{new Integer(42)});
        assertEquals("42", result);
    }

    @Test
    public void testApplyPattern_withRegistry_nullFactoryReturnsNull_fallsBackToException() {
        NullFormatFactory factory = new NullFormatFactory();
        registry.put("custom", factory);
        // "custom" is not a valid standard MessageFormat type, should throw IllegalArgumentException
        // when the base MessageFormat tries to parse it since the custom format returned null.
        try {
            new ExtendedMessageFormat("{0,custom}", registry);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testApplyPattern_withRegistry_noFormatDescription() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        assertEquals("{0}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withRegistry_multipleFormatElements() {
        ReverseFormatFactory factory = new ReverseFormatFactory();
        registry.put("reverse", factory);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} and {1,reverse}", registry);
        String result = emf.format(new Object[]{"first", "second"});
        assertEquals("first and dnoces", result);
    }

    @Test
    public void testApplyPattern_withRegistry_formatWithArguments() {
        ReverseFormatFactory factory = new ReverseFormatFactory();
        registry.put("custom", factory);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,custom,myArgs}", registry);
        assertEquals("custom", factory.lastName);
        assertEquals("myArgs", factory.lastArgs);
    }

    @Test
    public void testApplyPattern_withRegistry_quotedString() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("it''s a {0} test", registry);
        String result = emf.format(new Object[]{"simple"});
        assertEquals("it's a simple test", result);
    }

    @Test
    public void testApplyPattern_withRegistry_emptyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("", registry);
        assertEquals("", emf.toPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_invalidArgumentIndex_throwsException() {
        new ExtendedMessageFormat("{a}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedFormatElement_throwsException() {
        registry.put("upper", new ReverseFormatFactory());
        new ExtendedMessageFormat("{0,upper", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedQuotedString_throwsException() {
        new ExtendedMessageFormat("it's unterminated {0}", registry);
    }

    @Test
    public void testApplyPattern_formatDescriptionWithQuotedText_doesNotThrow() {
        registry.put("fmt", new ReverseFormatFactory());
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,fmt'abc'}", registry);
        assertNotNull(emf.toPattern());
    }

    @Test
    public void testApplyPattern_reapplyNewPattern_updatesToPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        emf.applyPattern("{0} updated");
        assertEquals("{0} updated", emf.toPattern());
    }

    // ---------- Unsupported operation tests ----------

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormat(0, new DecimalFormat());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatByArgumentIndex(0, new DecimalFormat());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormats(new Format[]{new DecimalFormat()});
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_throwsUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}");
        emf.setFormatsByArgumentIndex(new Format[]{new DecimalFormat()});
    }

    // ---------- Additional edge cases ----------

    @Test
    public void testApplyPattern_withRegistry_whitespaceAroundArgumentIndex() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{ 0 }", registry);
        String result = emf.format(new Object[]{"x"});
        assertEquals("x", result);
    }

    @Test
    public void testFormat_withoutCustomFormat_standardBehavior() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} - {1}", registry);
        String result = emf.format(new Object[]{"A", "B"});
        assertEquals("A - B", result);
    }
}
