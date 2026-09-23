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

public class DateTimeFormatter_print_188829601175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917;

    public DateTimeFormatter_print_188829601175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term936 = new Integer(-203030934);
        term917 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term918 = newInstance(Class.forName("java.util.Locale"));
        Object term919 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term917, term917.getClass(), "iPrinter", null);
        setField(term917, term917.getClass(), "iParser", null);
        setField(term919, term919.getClass(), "language", "kok");
        setField(term919, term919.getClass(), "script", "");
        setField(term919, term919.getClass(), "region", "IN");
        setField(term919, term919.getClass(), "variant", "");
        setIntField(term919, term919.getClass(), "hash", -1125877100);
        setField(term918, term918.getClass(), "baseLocale", term919);
        setField(term918, term918.getClass(), "localeExtensions", null);
        setIntField(term918, term918.getClass(), "hashCodeValue", -1125877100);
        setField(term918, term918.getClass(), "languageTag", null);
        setField(term917, term917.getClass(), "iLocale", term918);
        setBooleanField(term917, term917.getClass(), "iOffsetParsed", true);
        setField(term917, term917.getClass(), "iChrono", null);
        setField(term917, term917.getClass(), "iZone", null);
        setField(term917, term917.getClass(), "iPivotYear", term936);
        setIntField(term917, term917.getClass(), "iDefaultYear", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "print", argTypes, term917, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


