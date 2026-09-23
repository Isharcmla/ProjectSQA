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
import java.lang.String;

public class DateTimeFormatterBuilder_append_58061458340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51315;
     Object term51190;

    public DateTimeFormatterBuilder_append_58061458340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51315 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term52494 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term52493 = ((Class) term52494).getDeclaredField((String) "INSTANCE");
        ((Field) term52493).setAccessible(true);
        Object enum10 = ((Field) term52493).get((Object) null);
        term51190 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 2);
        setElement(term51190, 0, enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term51190;
        try {
            callMethod(klass, "append", argTypes, term51315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


