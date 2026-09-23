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

public class DateTimeFormatter_printTo_1361280449247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83308;
     Object term83508;

    public DateTimeFormatter_printTo_1361280449247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83308 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term83428 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber"));
        setField(term83308, term83308.getClass(), "iPrinter", term83428);
        setField(term83308, term83308.getClass(), "iChrono", null);
        setField(term83308, term83308.getClass(), "iZone", null);
        term83508 = newInstance(Class.forName("org.joda.time.chrono.StrictChronology"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0L;
        args[2] = term83508;
        callMethod(klass, "printTo", argTypes, term83308, args);
    }

};


