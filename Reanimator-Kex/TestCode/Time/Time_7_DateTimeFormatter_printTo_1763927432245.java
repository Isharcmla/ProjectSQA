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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_printTo_1763927432245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82749;
     Object term82919;

    public DateTimeFormatter_printTo_1763927432245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82749 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term82871 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term82749, term82749.getClass(), "iPrinter", term82871);
        setField(term82749, term82749.getClass(), "iChrono", null);
        setField(term82749, term82749.getClass(), "iZone", null);
        term82919 = newInstance(Class.forName("org.joda.time.Instant"));
        setLongField(term82919, term82919.getClass(), "iMillis", 2147483647L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term82919;
        callMethod(klass, "printTo", argTypes, term82749, args);
    }

};


