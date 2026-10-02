package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.ChoiceFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ExtendedMessageFormatTest {

    private Map<String, FormatFactory> registry;
    private FormatFactory upperCaseFormatFactory;
    private FormatFactory lowerCaseFormatFactory;

    private static class DummyFormat extends Format {
        private static final long serialVersionUID = 1L;
        private final boolean upper;

        public DummyFormat(boolean upper) {
            this.upper = upper;
        }

        @Override
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            if (obj != null) {
                String str = obj.toString();
                toAppendTo.append(upper ? str.toUpperCase(Locale.ROOT) : str.toLowerCase(Locale.ROOT));
            }
            return toAppendTo;
        }

        @Override
        public Object parseObject(String source, ParsePosition pos) {
            pos.setIndex(source.length());
            return source;
        }
    }

    @Before
    public void setUp() {
        upperCaseFormatFactory = new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new DummyFormat(true);
            }
        };

        lowerCaseFormatFactory = new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return new DummyFormat(false);
            }
        };

        registry = new HashMap<String, FormatFactory>();
        registry.put("upper", upperCaseFormatFactory);
        registry.put("lower", lowerCaseFormatFactory);
    }

    @Test
    public void testConstructor_patternOnly_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
        assertEquals("Hello World", emf.format(new Object[]{"World"}));
    }

    @Test
    public void testConstructor_patternAndLocale_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,number,currency}", Locale.US);
        assertEquals(Locale.US, emf.getLocale());
        assertNotNull(emf.toPattern());
    }

    @Test
    public void testConstructor_patternAndRegistry_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,upper}", registry);
        assertEquals("Hello WORLD", emf.format(new Object[]{"world"}));
        assertEquals("Hello {0,upper}", emf.toPattern());
    }

    @Test
    public void testConstructor_patternLocaleAndRegistry_success() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0,lower}", Locale.US, registry);
        assertEquals(Locale.US, emf.getLocale());
        assertEquals("Hello world", emf.format(new Object[]{"WORLD"}));
        assertEquals("Hello {0,lower}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_nullRegistry_standardMessageFormatBehavior() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", (Map<String, ? extends FormatFactory>) null);
        emf.applyPattern("Updated {0}");
        assertEquals("Updated {0}", emf.toPattern());
        assertEquals("Updated Value", emf.format(new Object[]{"Value"}));
    }

    @Test
    public void testApplyPattern_emptyRegistry_builtInFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0,number}", Collections.<String, FormatFactory>emptyMap());
        assertEquals("Test {0,number}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_withQuotesAndEscapes() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{' {0,upper} ''test'' '}'", registry);
        assertEquals("'{' {0,upper} ''test'' '}'", emf.toPattern());
        assertEquals("{ VALUE 'test' }", emf.format(new Object[]{"value"}));
    }

    @Test
    public void testApplyPattern_customFormatWithArguments() {
        FormatFactory factoryWithArgs = new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                if ("prefix".equals(arguments)) {
                    return new Format() {
                        private static final long serialVersionUID = 1L;
                        @Override
                        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
                            return toAppendTo.append("PRE_").append(obj);
                        }
                        @Override
                        public Object parseObject(String source, ParsePosition pos) {
                            return null;
                        }
                    };
                }
                return new DummyFormat(true);
            }
        };
        registry.put("custom", factoryWithArgs);

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0, custom , prefix }", registry);
        assertEquals("{0,custom , prefix }", emf.toPattern());
        assertEquals("PRE_data", emf.format(new Object[]{"data"}));
    }

    @Test
    public void testApplyPattern_embeddedQuotesInFormatDescription() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,choice,0#zero|1#one|1<'{'many'}'}", registry);
        assertEquals("zero", emf.format(new Object[]{0}));
        assertEquals("one", emf.format(new Object[]{1}));
        assertEquals("{many}", emf.format(new Object[]{2}));
    }

    @Test
    public void testApplyPattern_nestedFormatElementsInDescription() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,choice,0#zero|1#{1}}", Collections.<String, FormatFactory>emptyMap());
        assertNotNull(emf.toPattern());
    }

    @Test
    public void testApplyPattern_whitespaceHandlingInFormatElement() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{ \t 0 \n , \r upper \t }", registry);
        assertEquals("{0,upper}", emf.toPattern());
        assertEquals("FOO", emf.format(new Object[]{"foo"}));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormat_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}", registry);
        emf.setFormat(0, new DummyFormat(true));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatByArgumentIndex_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}", registry);
        emf.setFormatByArgumentIndex(0, new DummyFormat(true));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormats_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}", registry);
        emf.setFormats(new Format[]{new DummyFormat(true)});
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetFormatsByArgumentIndex_unsupported() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test {0}", registry);
        emf.setFormatsByArgumentIndex(new Format[]{new DummyFormat(true)});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_invalidArgumentIndex_nonDigit() {
        new ExtendedMessageFormat("{invalid}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_invalidArgumentIndex_whitespaceThenInvalidChar() {
        new ExtendedMessageFormat("{0 foo}", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedFormatElement_endOfPattern() {
        new ExtendedMessageFormat("{0", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedFormatElement_missingEndFe() {
        new ExtendedMessageFormat("{0,upper", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedFormatDescription_nested() {
        new ExtendedMessageFormat("{0,choice,0#{1", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedQuotedStringInPattern() {
        new ExtendedMessageFormat("This is 'unterminated", registry);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPattern_unterminatedQuotedStringInFormatDescription() {
        new ExtendedMessageFormat("{0,choice,'unterminated}", registry);
    }

    @Test
    public void testApplyPattern_unreadableFormatElement_notEndFe() {
        try {
            new ExtendedMessageFormat("{0,upper @}", registry);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unreadable format element at position"));
        }
    }

    @Test
    public void testApplyPattern_emptyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("", registry);
        assertEquals("", emf.toPattern());
        assertEquals("", emf.format(new Object[]{}));
    }

    @Test
    public void testApplyPattern_multipleFormatsMixedCustomAndStandard() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Num: {0,number,#.##}, Custom: {1,upper}, Built-in: {2}", registry);
        assertEquals("Num: 3.14, Custom: ABC, Built-in: test", emf.format(new Object[]{3.14, "abc", "test"}));
        assertEquals("Num: {0,number,#.##}, Custom: {1,upper}, Built-in: {2}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_formatFactoryReturnsNull_fallbackToStandard() {
        Map<String, FormatFactory> nullRegistry = new HashMap<String, FormatFactory>();
        nullRegistry.put("nullFormat", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,nullFormat}", nullRegistry);
        assertEquals("{0,nullFormat}", emf.toPattern());
    }

    @Test
    public void testApplyPattern_quoteHandlingInsideAndOutsideCustomFormats() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'''{' {0,upper} ''}'''", registry);
        assertEquals("'{' WORLD '}'", emf.format(new Object[]{"world"}));
        assertEquals("'''{' {0,upper} ''}'''", emf.toPattern());
    }
}
