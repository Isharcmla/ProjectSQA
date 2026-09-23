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

public class DateTimeParserBucket_init_98882526124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term45;
     Object term60;
     Object term62;

    public DateTimeParserBucket_init_98882526124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = new Long(-8257434502486459194L);
        term45 = newInstance(Class.forName("java.util.Locale"));
        Object term46 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term46, term46.getClass(), "language", "kab");
        setField(term46, term46.getClass(), "script", "");
        setField(term46, term46.getClass(), "region", "");
        setField(term46, term46.getClass(), "variant", "");
        setIntField(term46, term46.getClass(), "hash", -1139147084);
        setField(term45, term45.getClass(), "baseLocale", term46);
        setField(term45, term45.getClass(), "localeExtensions", null);
        setIntField(term45, term45.getClass(), "hashCodeValue", -1139147084);
        setField(term45, term45.getClass(), "languageTag", null);
        term60 = new Integer(1162663216);
        term62 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        argTypes[2] = Class.forName("java.util.Locale");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term43;
        args[1] = null;
        args[2] = term45;
        args[3] = term60;
        args[4] = term62;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


