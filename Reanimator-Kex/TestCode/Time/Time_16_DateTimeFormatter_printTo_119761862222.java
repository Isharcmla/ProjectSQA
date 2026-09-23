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
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_printTo_119761862222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605;

    public DateTimeFormatter_printTo_119761862222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term623 = new Integer(-2068769794);
        term605 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term606 = newInstance(Class.forName("java.util.Locale"));
        Object term607 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term605, term605.getClass(), "iPrinter", null);
        setField(term605, term605.getClass(), "iParser", null);
        setField(term607, term607.getClass(), "language", "ar");
        setField(term607, term607.getClass(), "script", "");
        setField(term607, term607.getClass(), "region", "LY");
        setField(term607, term607.getClass(), "variant", "");
        setIntField(term607, term607.getClass(), "hash", 93053506);
        setField(term606, term606.getClass(), "baseLocale", term607);
        setField(term606, term606.getClass(), "localeExtensions", null);
        setIntField(term606, term606.getClass(), "hashCodeValue", 93053506);
        setField(term606, term606.getClass(), "languageTag", null);
        setField(term605, term605.getClass(), "iLocale", term606);
        setBooleanField(term605, term605.getClass(), "iOffsetParsed", true);
        setField(term605, term605.getClass(), "iChrono", null);
        setField(term605, term605.getClass(), "iZone", null);
        setField(term605, term605.getClass(), "iPivotYear", term623);
        setIntField(term605, term605.getClass(), "iDefaultYear", -1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "printTo", argTypes, term605, args);
    }

};


