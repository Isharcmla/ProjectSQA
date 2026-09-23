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

public class DateTimeZone_getShortName_81719297260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term132;

    public DateTimeZone_getShortName_81719297260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130 = new Long(6375119433582206027L);
        term132 = newInstance(Class.forName("java.util.Locale"));
        Object term133 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term133, term133.getClass(), "language", "pt");
        setField(term133, term133.getClass(), "script", "");
        setField(term133, term133.getClass(), "region", "MO");
        setField(term133, term133.getClass(), "variant", "");
        setIntField(term133, term133.getClass(), "hash", 106966554);
        setField(term132, term132.getClass(), "baseLocale", term133);
        setField(term132, term132.getClass(), "localeExtensions", null);
        setIntField(term132, term132.getClass(), "hashCodeValue", 106966554);
        setField(term132, term132.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.DateTimeZone");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term130;
        args[1] = term132;
        try {
            callMethod(klass, "getShortName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


