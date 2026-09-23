package org.joda.time.format;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_withLocale_54077437551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term144;
     Object term1828;
     Object term1840;
     Object term1823;

    public DateTimeFormatter_withLocale_54077437551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term141 = new Integer(-616727354);
        term123 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term124 = newInstance(Class.forName("java.util.Locale"));
        Object term125 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term123, term123.getClass(), "iPrinter", null);
        setField(term123, term123.getClass(), "iParser", null);
        setField(term125, term125.getClass(), "language", "en");
        setField(term125, term125.getClass(), "script", "");
        setField(term125, term125.getClass(), "region", "GU");
        setField(term125, term125.getClass(), "variant", "");
        setIntField(term125, term125.getClass(), "hash", 96623497);
        setField(term124, term124.getClass(), "baseLocale", term125);
        setField(term124, term124.getClass(), "localeExtensions", null);
        setIntField(term124, term124.getClass(), "hashCodeValue", 96623497);
        setField(term124, term124.getClass(), "languageTag", null);
        setField(term123, term123.getClass(), "iLocale", term124);
        setBooleanField(term123, term123.getClass(), "iOffsetParsed", true);
        setField(term123, term123.getClass(), "iChrono", null);
        setField(term123, term123.getClass(), "iZone", null);
        setField(term123, term123.getClass(), "iPivotYear", term141);
        setIntField(term123, term123.getClass(), "iDefaultYear", -616727354);
        term144 = newInstance(Class.forName("java.util.Locale"));
        Object term145 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term145, term145.getClass(), "language", "se");
        setField(term145, term145.getClass(), "script", "");
        setField(term145, term145.getClass(), "region", "SE");
        setField(term145, term145.getClass(), "variant", "");
        setIntField(term145, term145.getClass(), "hash", 109295708);
        setField(term144, term144.getClass(), "baseLocale", term145);
        setField(term144, term144.getClass(), "localeExtensions", null);
        setIntField(term144, term144.getClass(), "hashCodeValue", 109295708);
        setField(term144, term144.getClass(), "languageTag", null);
        Integer term1839 = new Integer(-616727354);
        term1828 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1829 = newInstance(Class.forName("java.util.Locale"));
        Object term1830 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1828, term1828.getClass(), "iPrinter", null);
        setField(term1828, term1828.getClass(), "iParser", null);
        setField(term1830, term1830.getClass(), "language", "en");
        setField(term1830, term1830.getClass(), "script", "");
        setField(term1830, term1830.getClass(), "region", "GU");
        setField(term1830, term1830.getClass(), "variant", "");
        setIntField(term1830, term1830.getClass(), "hash", 96623497);
        setField(term1829, term1829.getClass(), "baseLocale", term1830);
        setField(term1829, term1829.getClass(), "localeExtensions", null);
        setIntField(term1829, term1829.getClass(), "hashCodeValue", 96623497);
        setField(term1829, term1829.getClass(), "languageTag", null);
        setField(term1828, term1828.getClass(), "iLocale", term1829);
        setBooleanField(term1828, term1828.getClass(), "iOffsetParsed", true);
        setField(term1828, term1828.getClass(), "iChrono", null);
        setField(term1828, term1828.getClass(), "iZone", null);
        setField(term1828, term1828.getClass(), "iPivotYear", term1839);
        setIntField(term1828, term1828.getClass(), "iDefaultYear", -616727354);
        term1840 = newInstance(Class.forName("java.util.Locale"));
        Object term1841 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1841, term1841.getClass(), "language", "se");
        setField(term1841, term1841.getClass(), "script", "");
        setField(term1841, term1841.getClass(), "region", "SE");
        setField(term1841, term1841.getClass(), "variant", "");
        setIntField(term1841, term1841.getClass(), "hash", 109295708);
        setField(term1840, term1840.getClass(), "baseLocale", term1841);
        setField(term1840, term1840.getClass(), "localeExtensions", null);
        setIntField(term1840, term1840.getClass(), "hashCodeValue", 109295708);
        setField(term1840, term1840.getClass(), "languageTag", null);
        Integer term1825 = new Integer(-616727354);
        term1823 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1803 = newInstance(Class.forName("java.util.Locale"));
        Object term1804 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1823, term1823.getClass(), "iPrinter", null);
        setField(term1823, term1823.getClass(), "iParser", null);
        setField(term1804, term1804.getClass(), "language", "se");
        setField(term1804, term1804.getClass(), "script", "");
        setField(term1804, term1804.getClass(), "region", "SE");
        setField(term1804, term1804.getClass(), "variant", "");
        setIntField(term1804, term1804.getClass(), "hash", 109295708);
        setField(term1803, term1803.getClass(), "baseLocale", term1804);
        setField(term1803, term1803.getClass(), "localeExtensions", null);
        setIntField(term1803, term1803.getClass(), "hashCodeValue", 109295708);
        setField(term1803, term1803.getClass(), "languageTag", null);
        setField(term1823, term1823.getClass(), "iLocale", term1803);
        setBooleanField(term1823, term1823.getClass(), "iOffsetParsed", true);
        setField(term1823, term1823.getClass(), "iChrono", null);
        setField(term1823, term1823.getClass(), "iZone", null);
        setField(term1823, term1823.getClass(), "iPivotYear", term1825);
        setIntField(term1823, term1823.getClass(), "iDefaultYear", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term144;
        Object retValue = callMethod(klass, "withLocale", argTypes, term123, args);
        assertTrue(recursiveEquals(term123, term1828));
        assertTrue(recursiveEquals(term144, term1840));
        assertTrue(recursiveEquals(retValue, term1823));
    }

};


