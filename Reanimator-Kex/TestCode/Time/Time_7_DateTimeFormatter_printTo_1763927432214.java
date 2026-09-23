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

public class DateTimeFormatter_printTo_1763927432214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65140;
     Object term65312;

    public DateTimeFormatter_printTo_1763927432214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65140 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term65264 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term65140, term65140.getClass(), "iPrinter", term65264);
        term65312 = newInstance(Class.forName("org.joda.time.Instant"));
        setLongField(term65312, term65312.getClass(), "iMillis", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term65312;
        try {
            callMethod(klass, "printTo", argTypes, term65140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


