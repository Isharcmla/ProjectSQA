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
import java.lang.String;
import java.lang.Object;

public class DateTimeFormatter_printTo_1130206504125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21316;

    public DateTimeFormatter_printTo_1130206504125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23284 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term23283 = ((Class) term23284).getDeclaredField((String) "INSTANCE");
        ((Field) term23283).setAccessible(true);
        Object enum4 = ((Field) term23283).get((Object) null);
        term21316 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term21316, term21316.getClass(), "iPrinter", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "printTo", argTypes, term21316, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


