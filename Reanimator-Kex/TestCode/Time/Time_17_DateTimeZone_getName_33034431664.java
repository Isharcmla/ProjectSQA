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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class DateTimeZone_getName_33034431664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;
     Object term156;

    public DateTimeZone_getName_33034431664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = new Long(-8400487765614892086L);
        term156 = newInstance(Class.forName("java.util.Locale"));
        Object term157 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term157, term157.getClass(), "language", "ps");
        setField(term157, term157.getClass(), "script", "");
        setField(term157, term157.getClass(), "region", "");
        setField(term157, term157.getClass(), "variant", "");
        setIntField(term157, term157.getClass(), "hash", 106860317);
        setField(term156, term156.getClass(), "baseLocale", term157);
        setField(term156, term156.getClass(), "localeExtensions", null);
        setIntField(term156, term156.getClass(), "hashCodeValue", 106860317);
        setField(term156, term156.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term154;
        args[1] = term156;
        try {
            callMethod(klass, "getName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


