package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_parse_104497119487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public Period_parse_104497119487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("org.joda.time.format.PeriodFormatter"));
        Object term36 = newInstance(Class.forName("java.util.Locale"));
        Object term37 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term52 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term65 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term66 = (int[]) newIntArray(2);
        setField(term35, term35.getClass(), "iPrinter", null);
        setField(term35, term35.getClass(), "iParser", null);
        setField(term37, term37.getClass(), "language", "pt");
        setField(term37, term37.getClass(), "script", "");
        setField(term37, term37.getClass(), "region", "MO");
        setField(term37, term37.getClass(), "variant", "");
        setIntField(term37, term37.getClass(), "hash", 106966554);
        setField(term36, term36.getClass(), "baseLocale", term37);
        setField(term36, term36.getClass(), "localeExtensions", null);
        setIntField(term36, term36.getClass(), "hashCodeValue", 106966554);
        setField(term36, term36.getClass(), "languageTag", null);
        setField(term35, term35.getClass(), "iLocale", term36);
        setField(term52, term52.getClass(), "iName", "hRNSzYYIrc");
        setField(term52, term52.getClass(), "iTypes", term65);
        setIntElement(term66, 0, 865208305);
        setIntElement(term66, 1, -1275173084);
        setField(term52, term52.getClass(), "iIndices", term66);
        setField(term35, term35.getClass(), "iParseType", term52);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.joda.time.format.PeriodFormatter");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term35;
        try {
            callMethod(klass, "parse", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


