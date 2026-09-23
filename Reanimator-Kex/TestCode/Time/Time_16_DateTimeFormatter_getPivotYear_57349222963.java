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

public class DateTimeFormatter_getPivotYear_57349222963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449;
     Object term2531;
     Object term2508;

    public DateTimeFormatter_getPivotYear_57349222963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term467 = new Integer(1622346318);
        term449 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term450 = newInstance(Class.forName("java.util.Locale"));
        Object term451 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term449, term449.getClass(), "iPrinter", null);
        setField(term449, term449.getClass(), "iParser", null);
        setField(term451, term451.getClass(), "language", "es");
        setField(term451, term451.getClass(), "script", "");
        setField(term451, term451.getClass(), "region", "CO");
        setField(term451, term451.getClass(), "variant", "");
        setIntField(term451, term451.getClass(), "hash", 96768422);
        setField(term450, term450.getClass(), "baseLocale", term451);
        setField(term450, term450.getClass(), "localeExtensions", null);
        setIntField(term450, term450.getClass(), "hashCodeValue", 96768422);
        setField(term450, term450.getClass(), "languageTag", null);
        setField(term449, term449.getClass(), "iLocale", term450);
        setBooleanField(term449, term449.getClass(), "iOffsetParsed", true);
        setField(term449, term449.getClass(), "iChrono", null);
        setField(term449, term449.getClass(), "iZone", null);
        setField(term449, term449.getClass(), "iPivotYear", term467);
        setIntField(term449, term449.getClass(), "iDefaultYear", 1622346318);
        Integer term2542 = new Integer(1622346318);
        term2531 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2532 = newInstance(Class.forName("java.util.Locale"));
        Object term2533 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2531, term2531.getClass(), "iPrinter", null);
        setField(term2531, term2531.getClass(), "iParser", null);
        setField(term2533, term2533.getClass(), "language", "es");
        setField(term2533, term2533.getClass(), "script", "");
        setField(term2533, term2533.getClass(), "region", "CO");
        setField(term2533, term2533.getClass(), "variant", "");
        setIntField(term2533, term2533.getClass(), "hash", 96768422);
        setField(term2532, term2532.getClass(), "baseLocale", term2533);
        setField(term2532, term2532.getClass(), "localeExtensions", null);
        setIntField(term2532, term2532.getClass(), "hashCodeValue", 96768422);
        setField(term2532, term2532.getClass(), "languageTag", null);
        setField(term2531, term2531.getClass(), "iLocale", term2532);
        setBooleanField(term2531, term2531.getClass(), "iOffsetParsed", true);
        setField(term2531, term2531.getClass(), "iChrono", null);
        setField(term2531, term2531.getClass(), "iZone", null);
        setField(term2531, term2531.getClass(), "iPivotYear", term2542);
        setIntField(term2531, term2531.getClass(), "iDefaultYear", 1622346318);
        term2508 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getPivotYear", argTypes, term449, args);
        assertTrue(recursiveEquals(term449, term2531));
        assertTrue(recursiveEquals(retValue, term2508));
    }

};


