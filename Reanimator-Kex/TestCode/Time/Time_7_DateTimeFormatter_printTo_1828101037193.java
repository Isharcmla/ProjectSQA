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
import java.lang.Object;

public class DateTimeFormatter_printTo_1828101037193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54091;

    public DateTimeFormatter_printTo_1828101037193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54091 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term54215 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term54091, term54091.getClass(), "iPrinter", term54215);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0L;
        try {
            callMethod(klass, "printTo", argTypes, term54091, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


