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

public class DateTimeFormatter_withLocale_540774375139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24137;
     Object term24284;
     Object term24281;

    public DateTimeFormatter_withLocale_540774375139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24137 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term24175 = newInstance(Class.forName("java.util.Locale"));
        setField(term24137, term24137.getClass(), "iLocale", term24175);
        term24284 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term24285 = newInstance(Class.forName("java.util.Locale"));
        setField(term24284, term24284.getClass(), "iPrinter", null);
        setField(term24284, term24284.getClass(), "iParser", null);
        setField(term24285, term24285.getClass(), "baseLocale", null);
        setField(term24285, term24285.getClass(), "localeExtensions", null);
        setIntField(term24285, term24285.getClass(), "hashCodeValue", 0);
        setField(term24285, term24285.getClass(), "languageTag", null);
        setField(term24284, term24284.getClass(), "iLocale", term24285);
        setBooleanField(term24284, term24284.getClass(), "iOffsetParsed", false);
        setField(term24284, term24284.getClass(), "iChrono", null);
        setField(term24284, term24284.getClass(), "iZone", null);
        setField(term24284, term24284.getClass(), "iPivotYear", null);
        setIntField(term24284, term24284.getClass(), "iDefaultYear", 0);
        term24281 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term24281, term24281.getClass(), "iPrinter", null);
        setField(term24281, term24281.getClass(), "iParser", null);
        setField(term24281, term24281.getClass(), "iLocale", null);
        setBooleanField(term24281, term24281.getClass(), "iOffsetParsed", false);
        setField(term24281, term24281.getClass(), "iChrono", null);
        setField(term24281, term24281.getClass(), "iZone", null);
        setField(term24281, term24281.getClass(), "iPivotYear", null);
        setIntField(term24281, term24281.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withLocale", argTypes, term24137, args);
        assertTrue(recursiveEquals(term24137, term24284));
        assertTrue(recursiveEquals(retValue, term24281));
    }

};


