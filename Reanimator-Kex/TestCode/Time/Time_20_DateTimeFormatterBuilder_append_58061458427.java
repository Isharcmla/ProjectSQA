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

public class DateTimeFormatterBuilder_append_58061458427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68255;
     Object term68113;

    public DateTimeFormatterBuilder_append_58061458427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68255 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term69043 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term69042 = ((Class) term69043).getDeclaredField((String) "INSTANCE");
        ((Field) term69042).setAccessible(true);
        Object enum12 = ((Field) term69042).get((Object) null);
        term68113 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        setElement(term68113, 0, enum12);
        setElement(term68113, 1, enum12);
        setElement(term68113, 2, enum12);
        setElement(term68113, 3, enum12);
        setElement(term68113, 4, enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term68113;
        try {
            callMethod(klass, "append", argTypes, term68255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


