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

public class DateTimeFormatter_withLocale_540774375110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17140;
     Object term17197;
     Object term17421;
     Object term17423;
     Object term17415;

    public DateTimeFormatter_withLocale_540774375110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17140 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        term17197 = newInstance(Class.forName("java.util.Locale"));
        setField(term17140, term17140.getClass(), "iLocale", term17197);
        term17421 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term17422 = newInstance(Class.forName("java.util.Locale"));
        setField(term17421, term17421.getClass(), "iPrinter", null);
        setField(term17421, term17421.getClass(), "iParser", null);
        setField(term17422, term17422.getClass(), "baseLocale", null);
        setField(term17422, term17422.getClass(), "localeExtensions", null);
        setIntField(term17422, term17422.getClass(), "hashCodeValue", 0);
        setField(term17422, term17422.getClass(), "languageTag", null);
        setField(term17421, term17421.getClass(), "iLocale", term17422);
        setBooleanField(term17421, term17421.getClass(), "iOffsetParsed", false);
        setField(term17421, term17421.getClass(), "iChrono", null);
        setField(term17421, term17421.getClass(), "iZone", null);
        setField(term17421, term17421.getClass(), "iPivotYear", null);
        setIntField(term17421, term17421.getClass(), "iDefaultYear", 0);
        term17423 = newInstance(Class.forName("java.util.Locale"));
        setField(term17423, term17423.getClass(), "baseLocale", null);
        setField(term17423, term17423.getClass(), "localeExtensions", null);
        setIntField(term17423, term17423.getClass(), "hashCodeValue", 0);
        setField(term17423, term17423.getClass(), "languageTag", null);
        term17415 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term17416 = newInstance(Class.forName("java.util.Locale"));
        setField(term17415, term17415.getClass(), "iPrinter", null);
        setField(term17415, term17415.getClass(), "iParser", null);
        setField(term17416, term17416.getClass(), "baseLocale", null);
        setField(term17416, term17416.getClass(), "localeExtensions", null);
        setIntField(term17416, term17416.getClass(), "hashCodeValue", 0);
        setField(term17416, term17416.getClass(), "languageTag", null);
        setField(term17415, term17415.getClass(), "iLocale", term17416);
        setBooleanField(term17415, term17415.getClass(), "iOffsetParsed", false);
        setField(term17415, term17415.getClass(), "iChrono", null);
        setField(term17415, term17415.getClass(), "iZone", null);
        setField(term17415, term17415.getClass(), "iPivotYear", null);
        setIntField(term17415, term17415.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term17197;
        Object retValue = callMethod(klass, "withLocale", argTypes, term17140, args);
        assertTrue(recursiveEquals(term17140, term17421));
        assertTrue(recursiveEquals(term17197, term17423));
        assertTrue(recursiveEquals(retValue, term17415));
    }

};


