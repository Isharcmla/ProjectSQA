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

public class DateTimeFormatter_isOffsetParsed_117587195854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226;
     Object term2003;

    public DateTimeFormatter_isOffsetParsed_117587195854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term248 = new Integer(1227103734);
        term226 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term227 = newInstance(Class.forName("java.util.Locale"));
        Object term228 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term226, term226.getClass(), "iPrinter", null);
        setField(term226, term226.getClass(), "iParser", null);
        setField(term228, term228.getClass(), "language", "zh");
        setField(term228, term228.getClass(), "script", "Hans");
        setField(term228, term228.getClass(), "region", "MO");
        setField(term228, term228.getClass(), "variant", "");
        setIntField(term228, term228.getClass(), "hash", -2024855090);
        setField(term227, term227.getClass(), "baseLocale", term228);
        setField(term227, term227.getClass(), "localeExtensions", null);
        setIntField(term227, term227.getClass(), "hashCodeValue", -2024855090);
        setField(term227, term227.getClass(), "languageTag", null);
        setField(term226, term226.getClass(), "iLocale", term227);
        setBooleanField(term226, term226.getClass(), "iOffsetParsed", false);
        setField(term226, term226.getClass(), "iChrono", null);
        setField(term226, term226.getClass(), "iZone", null);
        setField(term226, term226.getClass(), "iPivotYear", term248);
        setIntField(term226, term226.getClass(), "iDefaultYear", 1227103734);
        Integer term2014 = new Integer(1227103734);
        term2003 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2004 = newInstance(Class.forName("java.util.Locale"));
        Object term2005 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2003, term2003.getClass(), "iPrinter", null);
        setField(term2003, term2003.getClass(), "iParser", null);
        setField(term2005, term2005.getClass(), "language", "zh");
        setField(term2005, term2005.getClass(), "script", "Hans");
        setField(term2005, term2005.getClass(), "region", "MO");
        setField(term2005, term2005.getClass(), "variant", "");
        setIntField(term2005, term2005.getClass(), "hash", -2024855090);
        setField(term2004, term2004.getClass(), "baseLocale", term2005);
        setField(term2004, term2004.getClass(), "localeExtensions", null);
        setIntField(term2004, term2004.getClass(), "hashCodeValue", -2024855090);
        setField(term2004, term2004.getClass(), "languageTag", null);
        setField(term2003, term2003.getClass(), "iLocale", term2004);
        setBooleanField(term2003, term2003.getClass(), "iOffsetParsed", false);
        setField(term2003, term2003.getClass(), "iChrono", null);
        setField(term2003, term2003.getClass(), "iZone", null);
        setField(term2003, term2003.getClass(), "iPivotYear", term2014);
        setIntField(term2003, term2003.getClass(), "iDefaultYear", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOffsetParsed", argTypes, term226, args);
        assertTrue(recursiveEquals(term226, term2003));
    }

};


