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

public class DateTimeParserBucket_init_152249269522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public DateTimeParserBucket_init_152249269522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term3 = newInstance(Class.forName("java.util.Locale"));
        Object term4 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term4, term4.getClass(), "language", "pt");
        setField(term4, term4.getClass(), "script", "");
        setField(term4, term4.getClass(), "region", "MO");
        setField(term4, term4.getClass(), "variant", "");
        setIntField(term4, term4.getClass(), "hash", 106966554);
        setField(term3, term3.getClass(), "baseLocale", term4);
        setField(term3, term3.getClass(), "localeExtensions", null);
        setIntField(term3, term3.getClass(), "hashCodeValue", 106966554);
        setField(term3, term3.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = null;
        args[2] = term3;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


