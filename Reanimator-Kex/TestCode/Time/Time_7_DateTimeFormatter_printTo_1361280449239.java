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

public class DateTimeFormatter_printTo_1361280449239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80901;
     Object term81109;

    public DateTimeFormatter_printTo_1361280449239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80901 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term81023 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber"));
        setField(term80901, term80901.getClass(), "iPrinter", term81023);
        setField(term80901, term80901.getClass(), "iChrono", null);
        setField(term80901, term80901.getClass(), "iZone", null);
        term81109 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term81109, term81109.getClass(), "iBase", null);
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
        args[1] = 4294836223L;
        args[2] = term81109;
        callMethod(klass, "printTo", argTypes, term80901, args);
    }

};


