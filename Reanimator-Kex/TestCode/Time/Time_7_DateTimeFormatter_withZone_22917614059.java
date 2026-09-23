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

public class DateTimeFormatter_withZone_22917614059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;
     Object term2298;
     Object term2279;

    public DateTimeFormatter_withZone_22917614059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term365 = new Integer(-883034806);
        term349 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term350 = newInstance(Class.forName("java.util.Locale"));
        Object term351 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term349, term349.getClass(), "iPrinter", null);
        setField(term349, term349.getClass(), "iParser", null);
        setField(term351, term351.getClass(), "language", "be");
        setField(term351, term351.getClass(), "script", "");
        setField(term351, term351.getClass(), "region", "");
        setField(term351, term351.getClass(), "variant", "");
        setIntField(term351, term351.getClass(), "hash", 93513949);
        setField(term350, term350.getClass(), "baseLocale", term351);
        setField(term350, term350.getClass(), "localeExtensions", null);
        setIntField(term350, term350.getClass(), "hashCodeValue", 93513949);
        setField(term350, term350.getClass(), "languageTag", null);
        setField(term349, term349.getClass(), "iLocale", term350);
        setBooleanField(term349, term349.getClass(), "iOffsetParsed", true);
        setField(term349, term349.getClass(), "iChrono", null);
        setField(term349, term349.getClass(), "iZone", null);
        setField(term349, term349.getClass(), "iPivotYear", term365);
        setIntField(term349, term349.getClass(), "iDefaultYear", -883034806);
        Integer term2309 = new Integer(-883034806);
        term2298 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2299 = newInstance(Class.forName("java.util.Locale"));
        Object term2300 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2298, term2298.getClass(), "iPrinter", null);
        setField(term2298, term2298.getClass(), "iParser", null);
        setField(term2300, term2300.getClass(), "language", "be");
        setField(term2300, term2300.getClass(), "script", "");
        setField(term2300, term2300.getClass(), "region", "");
        setField(term2300, term2300.getClass(), "variant", "");
        setIntField(term2300, term2300.getClass(), "hash", 93513949);
        setField(term2299, term2299.getClass(), "baseLocale", term2300);
        setField(term2299, term2299.getClass(), "localeExtensions", null);
        setIntField(term2299, term2299.getClass(), "hashCodeValue", 93513949);
        setField(term2299, term2299.getClass(), "languageTag", null);
        setField(term2298, term2298.getClass(), "iLocale", term2299);
        setBooleanField(term2298, term2298.getClass(), "iOffsetParsed", true);
        setField(term2298, term2298.getClass(), "iChrono", null);
        setField(term2298, term2298.getClass(), "iZone", null);
        setField(term2298, term2298.getClass(), "iPivotYear", term2309);
        setIntField(term2298, term2298.getClass(), "iDefaultYear", -883034806);
        Integer term2295 = new Integer(-883034806);
        term2279 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2280 = newInstance(Class.forName("java.util.Locale"));
        Object term2281 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2279, term2279.getClass(), "iPrinter", null);
        setField(term2279, term2279.getClass(), "iParser", null);
        setField(term2281, term2281.getClass(), "language", "be");
        setField(term2281, term2281.getClass(), "script", "");
        setField(term2281, term2281.getClass(), "region", "");
        setField(term2281, term2281.getClass(), "variant", "");
        setIntField(term2281, term2281.getClass(), "hash", 93513949);
        setField(term2280, term2280.getClass(), "baseLocale", term2281);
        setField(term2280, term2280.getClass(), "localeExtensions", null);
        setIntField(term2280, term2280.getClass(), "hashCodeValue", 93513949);
        setField(term2280, term2280.getClass(), "languageTag", null);
        setField(term2279, term2279.getClass(), "iLocale", term2280);
        setBooleanField(term2279, term2279.getClass(), "iOffsetParsed", true);
        setField(term2279, term2279.getClass(), "iChrono", null);
        setField(term2279, term2279.getClass(), "iZone", null);
        setField(term2279, term2279.getClass(), "iPivotYear", term2295);
        setIntField(term2279, term2279.getClass(), "iDefaultYear", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withZone", argTypes, term349, args);
        assertTrue(recursiveEquals(term349, term2298));
        assertTrue(recursiveEquals(retValue, term2279));
    }

};


