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

public class DateTimeFormatter_printTo_119761862267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3290;

    public DateTimeFormatter_printTo_119761862267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3290 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term3290, term3290.getClass(), "iPrinter", null);
        setField(term3290, term3290.getClass(), "iParser", null);
        setField(term3290, term3290.getClass(), "iLocale", null);
        setBooleanField(term3290, term3290.getClass(), "iOffsetParsed", false);
        setField(term3290, term3290.getClass(), "iChrono", null);
        setField(term3290, term3290.getClass(), "iZone", null);
        setField(term3290, term3290.getClass(), "iPivotYear", null);
        setIntField(term3290, term3290.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "printTo", argTypes, term3290, args);
    }

};


