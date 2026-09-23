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

public class DateTimeFormatter_printTo_421596020208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60762;

    public DateTimeFormatter_printTo_421596020208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term62114 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term62113 = ((Class) term62114).getDeclaredField((String) "INSTANCE");
        ((Field) term62113).setAccessible(true);
        Object enum16 = ((Field) term62113).get((Object) null);
        term60762 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term60762, term60762.getClass(), "iPrinter", enum16);
        Object term60942 = newInstance(Class.forName("org.joda.time.tz.UTCProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", null);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cProvider", term60942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0L;
        try {
            callMethod(klass, "printTo", argTypes, term60762, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


