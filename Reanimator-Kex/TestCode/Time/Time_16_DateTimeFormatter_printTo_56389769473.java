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

public class DateTimeFormatter_printTo_56389769473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;

    public DateTimeFormatter_printTo_56389769473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term885 = new Integer(-1275173084);
        term869 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term870 = newInstance(Class.forName("java.util.Locale"));
        Object term871 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term869, term869.getClass(), "iPrinter", null);
        setField(term869, term869.getClass(), "iParser", null);
        setField(term871, term871.getClass(), "language", "lv");
        setField(term871, term871.getClass(), "script", "");
        setField(term871, term871.getClass(), "region", "");
        setField(term871, term871.getClass(), "variant", "");
        setIntField(term871, term871.getClass(), "hash", 103255606);
        setField(term870, term870.getClass(), "baseLocale", term871);
        setField(term870, term870.getClass(), "localeExtensions", null);
        setIntField(term870, term870.getClass(), "hashCodeValue", 103255606);
        setField(term870, term870.getClass(), "languageTag", null);
        setField(term869, term869.getClass(), "iLocale", term870);
        setBooleanField(term869, term869.getClass(), "iOffsetParsed", false);
        setField(term869, term869.getClass(), "iChrono", null);
        setField(term869, term869.getClass(), "iZone", null);
        setField(term869, term869.getClass(), "iPivotYear", term885);
        setIntField(term869, term869.getClass(), "iDefaultYear", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "printTo", argTypes, term869, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


