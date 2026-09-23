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

public class DateTimeFormatter_printTo_1361280449238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80466;
     Object term80744;

    public DateTimeFormatter_printTo_1361280449238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80466 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term80588 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        Object term80664 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term80466, term80466.getClass(), "iPrinter", term80588);
        setField(term80466, term80466.getClass(), "iChrono", null);
        setField(term80466, term80466.getClass(), "iZone", term80664);
        term80744 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
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
        args[2] = term80744;
        callMethod(klass, "printTo", argTypes, term80466, args);
    }

};


