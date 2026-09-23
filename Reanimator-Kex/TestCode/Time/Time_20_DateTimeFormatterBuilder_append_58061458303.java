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

public class DateTimeFormatterBuilder_append_58061458303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44517;
     Object term44385;

    public DateTimeFormatterBuilder_append_58061458303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44517 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        term44385 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 9);
        Object term44623 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        Object term44749 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setElement(term44385, 0, term44623);
        setElement(term44385, 1, term44749);
        setElement(term44385, 2, term44623);
        setElement(term44385, 3, term44623);
        setElement(term44385, 4, term44623);
        setElement(term44385, 5, term44623);
        setElement(term44385, 6, term44623);
        setElement(term44385, 7, term44623);
        setElement(term44385, 8, term44623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44385;
        try {
            callMethod(klass, "append", argTypes, term44517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


