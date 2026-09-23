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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_parseInto_1093923209164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30388;
     Object term30568;

    public DateTimeFormatter_parseInto_1093923209164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30388 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term30504 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setField(term30388, term30388.getClass(), "iParser", term30504);
        term30568 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadWritableInstant");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term30568;
        args[1] = null;
        args[2] = 0;
        try {
            callMethod(klass, "parseInto", argTypes, term30388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


