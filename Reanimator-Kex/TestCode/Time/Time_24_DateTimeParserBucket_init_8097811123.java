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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeParserBucket_init_8097811123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term25;
     Object term39;

    public DateTimeParserBucket_init_8097811123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Long(6375119433582206027L);
        term25 = newInstance(Class.forName("java.util.Locale"));
        Object term26 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term26, term26.getClass(), "language", "ps");
        setField(term26, term26.getClass(), "script", "");
        setField(term26, term26.getClass(), "region", "");
        setField(term26, term26.getClass(), "variant", "");
        setIntField(term26, term26.getClass(), "hash", 106860317);
        setField(term25, term25.getClass(), "baseLocale", term26);
        setField(term25, term25.getClass(), "localeExtensions", null);
        setIntField(term25, term25.getClass(), "hashCodeValue", 106860317);
        setField(term25, term25.getClass(), "languageTag", null);
        term39 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        argTypes[2] = Class.forName("java.util.Locale");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = term23;
        args[1] = null;
        args[2] = term25;
        args[3] = term39;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


