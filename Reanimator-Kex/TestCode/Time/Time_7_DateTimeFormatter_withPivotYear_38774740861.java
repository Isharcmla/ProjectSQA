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

public class DateTimeFormatter_withPivotYear_38774740861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;
     Object term416;
     Object term2411;
     Object term2423;
     Object term2385;

    public DateTimeFormatter_withPivotYear_38774740861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term413 = new Integer(597278769);
        term395 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term396 = newInstance(Class.forName("java.util.Locale"));
        Object term397 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term395, term395.getClass(), "iPrinter", null);
        setField(term395, term395.getClass(), "iParser", null);
        setField(term397, term397.getClass(), "language", "sw");
        setField(term397, term397.getClass(), "script", "");
        setField(term397, term397.getClass(), "region", "CD");
        setField(term397, term397.getClass(), "variant", "");
        setIntField(term397, term397.getClass(), "hash", 109816539);
        setField(term396, term396.getClass(), "baseLocale", term397);
        setField(term396, term396.getClass(), "localeExtensions", null);
        setIntField(term396, term396.getClass(), "hashCodeValue", 109816539);
        setField(term396, term396.getClass(), "languageTag", null);
        setField(term395, term395.getClass(), "iLocale", term396);
        setBooleanField(term395, term395.getClass(), "iOffsetParsed", false);
        setField(term395, term395.getClass(), "iChrono", null);
        setField(term395, term395.getClass(), "iZone", null);
        setField(term395, term395.getClass(), "iPivotYear", term413);
        setIntField(term395, term395.getClass(), "iDefaultYear", 597278769);
        term416 = new Integer(-1685132342);
        Integer term2422 = new Integer(597278769);
        term2411 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2412 = newInstance(Class.forName("java.util.Locale"));
        Object term2413 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2411, term2411.getClass(), "iPrinter", null);
        setField(term2411, term2411.getClass(), "iParser", null);
        setField(term2413, term2413.getClass(), "language", "sw");
        setField(term2413, term2413.getClass(), "script", "");
        setField(term2413, term2413.getClass(), "region", "CD");
        setField(term2413, term2413.getClass(), "variant", "");
        setIntField(term2413, term2413.getClass(), "hash", 109816539);
        setField(term2412, term2412.getClass(), "baseLocale", term2413);
        setField(term2412, term2412.getClass(), "localeExtensions", null);
        setIntField(term2412, term2412.getClass(), "hashCodeValue", 109816539);
        setField(term2412, term2412.getClass(), "languageTag", null);
        setField(term2411, term2411.getClass(), "iLocale", term2412);
        setBooleanField(term2411, term2411.getClass(), "iOffsetParsed", false);
        setField(term2411, term2411.getClass(), "iChrono", null);
        setField(term2411, term2411.getClass(), "iZone", null);
        setField(term2411, term2411.getClass(), "iPivotYear", term2422);
        setIntField(term2411, term2411.getClass(), "iDefaultYear", 597278769);
        term2423 = new Integer(-1685132342);
        Integer term2403 = new Integer(-1685132342);
        term2385 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2386 = newInstance(Class.forName("java.util.Locale"));
        Object term2387 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2385, term2385.getClass(), "iPrinter", null);
        setField(term2385, term2385.getClass(), "iParser", null);
        setField(term2387, term2387.getClass(), "language", "sw");
        setField(term2387, term2387.getClass(), "script", "");
        setField(term2387, term2387.getClass(), "region", "CD");
        setField(term2387, term2387.getClass(), "variant", "");
        setIntField(term2387, term2387.getClass(), "hash", 109816539);
        setField(term2386, term2386.getClass(), "baseLocale", term2387);
        setField(term2386, term2386.getClass(), "localeExtensions", null);
        setIntField(term2386, term2386.getClass(), "hashCodeValue", 109816539);
        setField(term2386, term2386.getClass(), "languageTag", null);
        setField(term2385, term2385.getClass(), "iLocale", term2386);
        setBooleanField(term2385, term2385.getClass(), "iOffsetParsed", false);
        setField(term2385, term2385.getClass(), "iChrono", null);
        setField(term2385, term2385.getClass(), "iZone", null);
        setField(term2385, term2385.getClass(), "iPivotYear", term2403);
        setIntField(term2385, term2385.getClass(), "iDefaultYear", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term416;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term395, args);
        assertTrue(recursiveEquals(term395, term2411));
        assertTrue(recursiveEquals(term416, term2423));
        assertTrue(recursiveEquals(retValue, term2385));
    }

};


