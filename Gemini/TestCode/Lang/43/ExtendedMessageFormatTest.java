package org.apache.commons.lang.text;

import org.junit.Assert;
import org.junit.Test;

import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ExtendedMessageFormatTest {

    private static class LowerCaseFormat extends Format {
        private static final long serialVersionUID = 1L;

        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            return toAppendTo.append(String.valueOf(obj).toLowerCase(Locale.ENGLISH));
        }

        public Object parseObject(String source, ParsePosition pos) {
            pos.setIndex(source.length());
            return source.toLowerCase(Locale.ENGLISH);
        }
    }

    private static class UpperCaseFormat extends Format {
        private static final long serialVersionUID = 1L;

        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            return toAppendTo.append(String.valueOf(obj).toUpperCase(Locale.ENGLISH));
        }

        public Object parseObject(String source, ParsePosition pos) {
            pos.setIndex(source.length());
            return source.toUpperCase(Locale.ENGLISH);
        }
    }

    private static class MockFormatFactory implements FormatFactory {
        public Format getFormat(String name, String arguments, Locale locale) {
            if ("lower".equals(name)) {
                return new LowerCaseFormat();
            }
            if ("upper".equals(name)) {
                return new UpperCaseFormat();
            }
            if ("args".equals(name)) {
                return new Format() {
                    private static final long serialVersionUID = 1L;

                    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                        return toAppendTo.append(obj).append(":").append(arguments);
                    }

                    public Object parseObject(String source, ParsePosition pos) {
                        return null;
                    }
                };
            }
            return null;
        }
    }

    @Test
    public void testConstructor_patternOnly_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}!");
        Assert.assertEquals("Hello {0}!", emf.toPattern());
        Assert.assertEquals("Hello World!", emf.format(new Object[]{"World"}));
    }

    @Test
    public void testConstructor_patternAndLocale_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0,number,currency}", Locale.US);
        Assert.assertEquals(Locale.US, emf.getLocale());
        String formatted = emf.format(new Object[]{Double.valueOf(10.5)});
        Assert.assertTrue(formatted.contains("$10.50"));
    }

    @Test
    public void testConstructor_patternAndRegistry_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,lower}!", registry);
        Assert.assertEquals("Hello {0,lower}!", emf.toPattern());
        Assert.assertEquals("Hello world!", emf.format(new Object[]{"WORLD"}));
    }

    @Test
    public void testConstructor_patternLocaleRegistry_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("upper", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value {0,upper}", Locale.GERMANY, registry);
        Assert.assertEquals(Locale.GERMANY, emf.getLocale());
        Assert.assertEquals("Value TEST", emf.format(new Object[]{"test"}));
    }

    @Test
    public void testApplyPattern_withoutRegistry_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Dummy");
        emf.applyPattern("New {0} pattern");
        Assert.assertEquals("New {0} pattern", emf.toPattern());
        Assert.assertEquals("New text pattern", emf.format(new Object[]{"text"}));
    }

    @Test
    public void testApplyPattern_withCustomFormatAndArgs_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("args", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("Result: {0,args,custom_arg}", registry);
        Assert.assertEquals("Result: {0,args,custom_arg}", emf.toPattern());
        Assert.assertEquals("Result: Val:custom_arg", emf.format(new Object[]{"Val"}));
    }

    @Test
    public void testApplyPattern_withMultipleFormatsAndPlainText_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());
        registry.put("upper", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("A {0,lower} B {1,upper} C {2}", registry);
        Assert.assertEquals("A {0,lower} B {1,upper} C {2}", emf.toPattern());
        Assert.assertEquals("A abc B XYZ C 123", emf.format(new Object[]{"ABC", "xyz", "123"}));
    }

    @Test
    public void testApplyPattern_withStandardFormatFallback_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,lower} and {1,number,integer}", registry);
        Assert.assertEquals("{0,lower} and {1,number,integer}", emf.toPattern());
        Assert.assertEquals("foo and 42", emf.format(new Object[]{"FOO", Double.valueOf(42.1)}));
    }

    @Test
    public void testApplyPattern_emptyRegistry_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Plain {0}", registry);
        Assert.assertEquals("Plain {0}", emf.toPattern());
        Assert.assertEquals("Plain 1", emf.format(new Object[]{Integer.valueOf(1)}));
    }

    @Test
    public void testApplyPattern_emptyPattern_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("", registry);
        Assert.assertEquals("", emf.toPattern());
    }

    @Test
    public void testApplyPattern_quotesInPattern_handledCorrectly() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{' {0,lower} ''quoted'' '}'", registry);
        Assert.assertEquals("'{' {0,lower} ''quoted'' '}'", emf.toPattern());
        Assert.assertEquals("{ val 'quoted' }", emf.format(new Object[]{"VAL"}));
    }

    @Test
    public void testApplyPattern_quotesInsideFormatDescription_handledCorrectly() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("args", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,args,'sub,arg'}", registry);
        Assert.assertEquals("{0,args,'sub,arg'}", emf.toPattern());
        Assert.assertEquals("X:'sub,arg'", emf.format(new Object[]{"X"}));
    }

    @Test
    public void testApplyPattern_nestedBracesInFormatDescription_handledCorrectly() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,choice,0#zero|1#one: {1}}", registry);
        Assert.assertEquals("zero", emf.format(new Object[]{Integer.valueOf(0), "unused"}));
        Assert.assertEquals("one: test", emf.format(new Object[]{Integer.valueOf(1), "test"}));
    }

    @Test
    public void testApplyPattern_whitespacesInElement_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("  {   0   ,   lower   }  ", registry);
        Assert.assertEquals("  {0,lower}  ", emf.toPattern());
        Assert.assertEquals("  abc  ", emf.format(new Object[]{"ABC"}));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_throwsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}");
        emf.setFormat(0, NumberFormat.getInstance());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_throwsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}");
        emf.setFormatByArgumentIndex(0, NumberFormat.getInstance());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_throwsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}");
        emf.setFormats(new Format[]{NumberFormat.getInstance()});
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_throwsException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}");
        emf.setFormatsByArgumentIndex(new Format[]{NumberFormat.getInstance()});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedQuote_throwsException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("Unterminated 'quote", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedElement_throwsException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("Unterminated {0", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_invalidArgumentIndex_throwsException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{invalid}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_invalidWhitespaceAfterArgumentIndex_throwsException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{0 invalid}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedFormatDescription_throwsException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        new ExtendedMessageFormat("{0,lower", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unreadableFormatElement_throwsException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());
        new ExtendedMessageFormat("{0,lower extra}", registry);
    }

    @Test
    public void testApplyPattern_escapedQuoteAtStart_success() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("''Hello'' {0}", registry);
        Assert.assertEquals("''Hello'' {0}", emf.toPattern());
        Assert.assertEquals("'Hello' World", emf.format(new Object[]{"World"}));
    }

    @Test
    public void testApplyPattern_noElementsInRegistry_customFormatsNullArray() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("unknown", new FormatFactory() {
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,unknown}", registry);
        Assert.assertEquals("{0,unknown}", emf.toPattern());
        Assert.assertEquals("Val", emf.format(new Object[]{"Val"}));
    }

    @Test
    public void testEqualsAndHashCode() {
        Map<String, FormatFactory> registry = Collections.<String, FormatFactory>singletonMap("lower", new MockFormatFactory());
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat("{0,lower}", registry);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat("{0,lower}", registry);

        Assert.assertEquals(emf1, emf2);
        Assert.assertEquals(emf1.hashCode(), emf2.hashCode());
    }
}
