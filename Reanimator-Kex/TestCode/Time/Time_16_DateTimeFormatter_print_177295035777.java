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
import java.lang.UnsupportedOperationException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_print_177295035777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term971;

    public DateTimeFormatter_print_177295035777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term989 = new Integer(-73683645);
        term971 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term972 = newInstance(Class.forName("java.util.Locale"));
        Object term973 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term971, term971.getClass(), "iPrinter", null);
        setField(term971, term971.getClass(), "iParser", null);
        setField(term973, term973.getClass(), "language", "en");
        setField(term973, term973.getClass(), "script", "");
        setField(term973, term973.getClass(), "region", "DK");
        setField(term973, term973.getClass(), "variant", "");
        setIntField(term973, term973.getClass(), "hash", 96620304);
        setField(term972, term972.getClass(), "baseLocale", term973);
        setField(term972, term972.getClass(), "localeExtensions", null);
        setIntField(term972, term972.getClass(), "hashCodeValue", 96620304);
        setField(term972, term972.getClass(), "languageTag", null);
        setField(term971, term971.getClass(), "iLocale", term972);
        setBooleanField(term971, term971.getClass(), "iOffsetParsed", true);
        setField(term971, term971.getClass(), "iChrono", null);
        setField(term971, term971.getClass(), "iZone", null);
        setField(term971, term971.getClass(), "iPivotYear", term989);
        setIntField(term971, term971.getClass(), "iDefaultYear", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "print", argTypes, term971, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


