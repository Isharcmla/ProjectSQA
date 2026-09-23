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
import java.lang.NegativeArraySizeException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_printTo_842607323179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34795;
     Object term34969;

    public DateTimeFormatter_printTo_842607323179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34795 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term34911 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        setIntField(term34911, term34911.getClass(), "iPrintedLengthEstimate", -1);
        setField(term34795, term34795.getClass(), "iPrinter", term34911);
        term34969 = newInstance(Class.forName("org.joda.time.YearMonthDay"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term34969;
        try {
            callMethod(klass, "printTo", argTypes, term34795, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


